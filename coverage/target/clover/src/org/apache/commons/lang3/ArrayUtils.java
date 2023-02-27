/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ */package org.apache.commons.lang3;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.mutable.MutableInt;

public class ArrayUtils {public static class __CLR4_1_25v5vl3lqxriu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,2374,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
    /**
     * An empty immutable {@code Class} array.
     */
    public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];
    /**
     * An empty immutable {@code String} array.
     */
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    /**
     * An empty immutable {@code long} array.
     */
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    /**
     * An empty immutable {@code Long} array.
     */
    public static final Long[] EMPTY_LONG_OBJECT_ARRAY = new Long[0];
    /**
     * An empty immutable {@code int} array.
     */
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    /**
     * An empty immutable {@code Integer} array.
     */
    public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY = new Integer[0];
    /**
     * An empty immutable {@code short} array.
     */
    public static final short[] EMPTY_SHORT_ARRAY = new short[0];
    /**
     * An empty immutable {@code Short} array.
     */
    public static final Short[] EMPTY_SHORT_OBJECT_ARRAY = new Short[0];
    /**
     * An empty immutable {@code byte} array.
     */
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    /**
     * An empty immutable {@code Byte} array.
     */
    public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY = new Byte[0];
    /**
     * An empty immutable {@code double} array.
     */
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    /**
     * An empty immutable {@code Double} array.
     */
    public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY = new Double[0];
    /**
     * An empty immutable {@code float} array.
     */
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    /**
     * An empty immutable {@code Float} array.
     */
    public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY = new Float[0];
    /**
     * An empty immutable {@code boolean} array.
     */
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
    /**
     * An empty immutable {@code Boolean} array.
     */
    public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = new Boolean[0];
    /**
     * An empty immutable {@code char} array.
     */
    public static final char[] EMPTY_CHAR_ARRAY = new char[0];
    /**
     * An empty immutable {@code Character} array.
     */
    public static final Character[] EMPTY_CHARACTER_OBJECT_ARRAY = new Character[0];

    /**
     * The index value when an element is not found in a list or array: {@code -1}.
     * This value is returned by methods in this class and can also be used in comparisons with values returned by
     * various method from {@link java.util.List}.
     */
    public static final int INDEX_NOT_FOUND = -1;

    public ArrayUtils() {
      super();__CLR4_1_25v5vl3lqxriu.R.inc(212);try{__CLR4_1_25v5vl3lqxriu.R.inc(211);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}


    // NOTE: Cannot use {@code} to enclose text which includes {}, but <code></code> is OK


    // Basic methods handling multi-dimensional arrays
    //-----------------------------------------------------------------------
    /**
     * <p>Outputs an array as a String, treating {@code null} as an empty array.</p>
     *
     * <p>Multi-dimensional arrays are handled correctly, including
     * multi-dimensional primitive arrays.</p>
     *
     * <p>The format is that of Java source code, for example <code>{a,b}</code>.</p>
     *
     * @param array  the array to get a toString for, may be {@code null}
     * @return a String representation of the array, '{}' if null array input
     */
    public static String toString(final Object array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(213);
        __CLR4_1_25v5vl3lqxriu.R.inc(214);return toString(array, "{}");
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Outputs an array as a String handling {@code null}s.</p>
     *
     * <p>Multi-dimensional arrays are handled correctly, including
     * multi-dimensional primitive arrays.</p>
     *
     * <p>The format is that of Java source code, for example <code>{a,b}</code>.</p>
     *
     * @param array  the array to get a toString for, may be {@code null}
     * @param stringIfNull  the String to return if the array is {@code null}
     * @return a String representation of the array
     */
    public static String toString(final Object array, final String stringIfNull) {try{__CLR4_1_25v5vl3lqxriu.R.inc(215);
        __CLR4_1_25v5vl3lqxriu.R.inc(216);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(217)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(218)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(219);return stringIfNull;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(220);return new ToStringBuilder(array, ToStringStyle.SIMPLE_STYLE).append(array).toString();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Get a hash code for an array handling multi-dimensional arrays correctly.</p>
     *
     * <p>Multi-dimensional primitive arrays are also handled correctly by this method.</p>
     *
     * @param array  the array to get a hash code for, {@code null} returns zero
     * @return a hash code for the array
     */
    public static int hashCode(final Object array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(221);
        __CLR4_1_25v5vl3lqxriu.R.inc(222);return new HashCodeBuilder().append(array).toHashCode();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Compares two arrays, using equals(), handling multi-dimensional arrays
     * correctly.</p>
     *
     * <p>Multi-dimensional primitive arrays are also handled correctly by this method.</p>
     *
     * @param array1  the left hand array to compare, may be {@code null}
     * @param array2  the right hand array to compare, may be {@code null}
     * @return {@code true} if the arrays are equal
     */
    public static boolean isEquals(final Object array1, final Object array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(223);
        __CLR4_1_25v5vl3lqxriu.R.inc(224);return new EqualsBuilder().append(array1, array2).isEquals();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // To map
    //-----------------------------------------------------------------------
    /**
     * <p>Converts the given array into a {@link java.util.Map}. Each element of the array
     * must be either a {@link java.util.Map.Entry} or an Array, containing at least two
     * elements, where the first element is used as key and the second as
     * value.</p>
     *
     * <p>This method can be used to initialize:</p>
     * <pre>
     * // Create a Map mapping colors.
     * Map colorMap = MapUtils.toMap(new String[][] {{
     *     {"RED", "#FF0000"},
     *     {"GREEN", "#00FF00"},
     *     {"BLUE", "#0000FF"}});
     * </pre>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  an array whose elements are either a {@link java.util.Map.Entry} or
     *  an Array containing at least two elements, may be {@code null}
     * @return a {@code Map} that was created from the array
     * @throws IllegalArgumentException  if one element of this Array is
     *  itself an Array containing less then two elements
     * @throws IllegalArgumentException  if the array contains elements other
     *  than {@link java.util.Map.Entry} and an Array
     */
    public static Map<Object, Object> toMap(final Object[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(225);
        __CLR4_1_25v5vl3lqxriu.R.inc(226);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(227)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(228)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(229);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(230);final Map<Object, Object> map = new HashMap<Object, Object>((int) (array.length * 1.5));
        __CLR4_1_25v5vl3lqxriu.R.inc(231);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(232)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(233)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(234);final Object object = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(235);if ((((object instanceof Map.Entry<?, ?>)&&(__CLR4_1_25v5vl3lqxriu.R.iget(236)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(237)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(238);final Map.Entry<?,?> entry = (Map.Entry<?,?>) object;
                __CLR4_1_25v5vl3lqxriu.R.inc(239);map.put(entry.getKey(), entry.getValue());
            } }else {__CLR4_1_25v5vl3lqxriu.R.inc(240);if ((((object instanceof Object[])&&(__CLR4_1_25v5vl3lqxriu.R.iget(241)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(242)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(243);final Object[] entry = (Object[]) object;
                __CLR4_1_25v5vl3lqxriu.R.inc(244);if ((((entry.length < 2)&&(__CLR4_1_25v5vl3lqxriu.R.iget(245)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(246)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(247);throw new IllegalArgumentException("Array element " + i + ", '"
                        + object
                        + "', has a length less than 2");
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(248);map.put(entry[0], entry[1]);
            } }else {{
                __CLR4_1_25v5vl3lqxriu.R.inc(249);throw new IllegalArgumentException("Array element " + i + ", '"
                        + object
                        + "', is neither of type Map.Entry nor an Array");
            }
        }}}
        }__CLR4_1_25v5vl3lqxriu.R.inc(250);return map;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Generic array
    //-----------------------------------------------------------------------
    /**
     * <p>Create a type-safe generic array.</p>
     *
     * <p>The Java language does not allow an array to be created from a generic type:</p>
     *
     * <pre>
    public static &lt;T&gt; T[] createAnArray(int size) {
        return new T[size]; // compiler error here
    }
    public static &lt;T&gt; T[] createAnArray(int size) {
        return (T[])new Object[size]; // ClassCastException at runtime
    }
     * </pre>
     *
     * <p>Therefore new arrays of generic types can be created with this method.
     * For example, an array of Strings can be created:</p>
     *
     * <pre>
    String[] array = ArrayUtils.toArray("1", "2");
    String[] emptyArray = ArrayUtils.&lt;String&gt;toArray();
     * </pre>
     *
     * <p>The method is typically used in scenarios, where the caller itself uses generic types
     * that have to be combined into an array.</p>
     *
     * <p>Note, this method makes only sense to provide arguments of the same type so that the
     * compiler can deduce the type of the array itself. While it is possible to select the
     * type explicitly like in
     * <code>Number[] array = ArrayUtils.&lt;Number&gt;toArray(Integer.valueOf(42), Double.valueOf(Math.PI))</code>,
     * there is no real advantage when compared to
     * <code>new Number[] {Integer.valueOf(42), Double.valueOf(Math.PI)}</code>.</p>
     *
     * @param  <T>   the array's element type
     * @param  items  the varargs array items, null allowed
     * @return the array, not null unless a null array is passed in
     * @since  3.0
     */
    public static <T> T[] toArray(final T... items) {try{__CLR4_1_25v5vl3lqxriu.R.inc(251);
        __CLR4_1_25v5vl3lqxriu.R.inc(252);return items;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Clone
    //-----------------------------------------------------------------------
    /**
     * <p>Shallow clones an array returning a typecast result and handling
     * {@code null}.</p>
     *
     * <p>The objects in the array are not cloned, thus there is no special
     * handling for multi-dimensional arrays.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param <T> the component type of the array
     * @param array  the array to shallow clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static <T> T[] clone(final T[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(253);
        __CLR4_1_25v5vl3lqxriu.R.inc(254);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(255)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(256)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(257);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(258);return array.clone();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static long[] clone(final long[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(259);
        __CLR4_1_25v5vl3lqxriu.R.inc(260);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(261)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(262)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(263);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(264);return array.clone();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static int[] clone(final int[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(265);
        __CLR4_1_25v5vl3lqxriu.R.inc(266);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(267)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(268)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(269);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(270);return array.clone();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static short[] clone(final short[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(271);
        __CLR4_1_25v5vl3lqxriu.R.inc(272);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(273)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(274)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(275);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(276);return array.clone();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static char[] clone(final char[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(277);
        __CLR4_1_25v5vl3lqxriu.R.inc(278);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(279)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(280)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(281);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(282);return array.clone();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static byte[] clone(final byte[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(283);
        __CLR4_1_25v5vl3lqxriu.R.inc(284);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(285)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(286)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(287);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(288);return array.clone();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static double[] clone(final double[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(289);
        __CLR4_1_25v5vl3lqxriu.R.inc(290);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(291)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(292)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(293);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(294);return array.clone();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static float[] clone(final float[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(295);
        __CLR4_1_25v5vl3lqxriu.R.inc(296);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(297)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(298)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(299);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(300);return array.clone();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Clones an array returning a typecast result and handling
     * {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  the array to clone, may be {@code null}
     * @return the cloned array, {@code null} if {@code null} input
     */
    public static boolean[] clone(final boolean[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(301);
        __CLR4_1_25v5vl3lqxriu.R.inc(302);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(303)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(304)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(305);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(306);return array.clone();
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // nullToEmpty
    //-----------------------------------------------------------------------
    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Object[] nullToEmpty(final Object[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(307);
        __CLR4_1_25v5vl3lqxriu.R.inc(308);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(309)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(310)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(311);return EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(312);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static String[] nullToEmpty(final String[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(313);
        __CLR4_1_25v5vl3lqxriu.R.inc(314);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(315)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(316)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(317);return EMPTY_STRING_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(318);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static long[] nullToEmpty(final long[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(319);
        __CLR4_1_25v5vl3lqxriu.R.inc(320);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(321)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(322)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(323);return EMPTY_LONG_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(324);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static int[] nullToEmpty(final int[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(325);
        __CLR4_1_25v5vl3lqxriu.R.inc(326);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(327)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(328)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(329);return EMPTY_INT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(330);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static short[] nullToEmpty(final short[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(331);
        __CLR4_1_25v5vl3lqxriu.R.inc(332);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(333)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(334)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(335);return EMPTY_SHORT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(336);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static char[] nullToEmpty(final char[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(337);
        __CLR4_1_25v5vl3lqxriu.R.inc(338);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(339)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(340)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(341);return EMPTY_CHAR_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(342);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static byte[] nullToEmpty(final byte[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(343);
        __CLR4_1_25v5vl3lqxriu.R.inc(344);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(345)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(346)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(347);return EMPTY_BYTE_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(348);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static double[] nullToEmpty(final double[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(349);
        __CLR4_1_25v5vl3lqxriu.R.inc(350);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(351)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(352)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(353);return EMPTY_DOUBLE_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(354);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static float[] nullToEmpty(final float[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(355);
        __CLR4_1_25v5vl3lqxriu.R.inc(356);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(357)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(358)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(359);return EMPTY_FLOAT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(360);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static boolean[] nullToEmpty(final boolean[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(361);
        __CLR4_1_25v5vl3lqxriu.R.inc(362);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(363)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(364)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(365);return EMPTY_BOOLEAN_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(366);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Long[] nullToEmpty(final Long[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(367);
        __CLR4_1_25v5vl3lqxriu.R.inc(368);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(369)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(370)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(371);return EMPTY_LONG_OBJECT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(372);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Integer[] nullToEmpty(final Integer[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(373);
        __CLR4_1_25v5vl3lqxriu.R.inc(374);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(375)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(376)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(377);return EMPTY_INTEGER_OBJECT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(378);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Short[] nullToEmpty(final Short[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(379);
        __CLR4_1_25v5vl3lqxriu.R.inc(380);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(381)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(382)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(383);return EMPTY_SHORT_OBJECT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(384);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Character[] nullToEmpty(final Character[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(385);
        __CLR4_1_25v5vl3lqxriu.R.inc(386);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(387)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(388)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(389);return EMPTY_CHARACTER_OBJECT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(390);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Byte[] nullToEmpty(final Byte[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(391);
        __CLR4_1_25v5vl3lqxriu.R.inc(392);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(393)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(394)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(395);return EMPTY_BYTE_OBJECT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(396);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Double[] nullToEmpty(final Double[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(397);
        __CLR4_1_25v5vl3lqxriu.R.inc(398);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(399)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(400)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(401);return EMPTY_DOUBLE_OBJECT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(402);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Float[] nullToEmpty(final Float[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(403);
        __CLR4_1_25v5vl3lqxriu.R.inc(404);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(405)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(406)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(407);return EMPTY_FLOAT_OBJECT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(408);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Defensive programming technique to change a {@code null}
     * reference to an empty one.</p>
     *
     * <p>This method returns an empty array for a {@code null} input array.</p>
     *
     * <p>As a memory optimizing technique an empty array passed in will be overridden with
     * the empty {@code public static} references in this class.</p>
     *
     * @param array  the array to check for {@code null} or empty
     * @return the same array, {@code public static} empty array if {@code null} or empty input
     * @since 2.5
     */
    public static Boolean[] nullToEmpty(final Boolean[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(409);
        __CLR4_1_25v5vl3lqxriu.R.inc(410);if ((((array == null || array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(411)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(412)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(413);return EMPTY_BOOLEAN_OBJECT_ARRAY;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(414);return array;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Subarrays
    //-----------------------------------------------------------------------
    /**
     * <p>Produces a new array containing the elements between
     * the start and end indices.</p>
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.</p>
     *
     * <p>The component type of the subarray is always the same as
     * that of the input array. Thus, if the input is an array of type
     * {@code Date}, the following usage is envisaged:</p>
     *
     * <pre>
     * Date[] someDates = (Date[])ArrayUtils.subarray(allDates, 2, 5);
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     */
    public static <T> T[] subarray(final T[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_1_25v5vl3lqxriu.R.inc(415);
        __CLR4_1_25v5vl3lqxriu.R.inc(416);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(417)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(418)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(419);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(420);if ((((startIndexInclusive < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(421)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(422)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(423);startIndexInclusive = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(424);if ((((endIndexExclusive > array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(425)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(426)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(427);endIndexExclusive = array.length;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(428);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_1_25v5vl3lqxriu.R.inc(429);final Class<?> type = array.getClass().getComponentType();
        __CLR4_1_25v5vl3lqxriu.R.inc(430);if ((((newSize <= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(431)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(432)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(433);@SuppressWarnings("unchecked") // OK, because array is of type T
            final T[] emptyArray = (T[]) Array.newInstance(type, 0);
            __CLR4_1_25v5vl3lqxriu.R.inc(434);return emptyArray;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(435);@SuppressWarnings("unchecked") // OK, because array is of type T
        final
        T[] subarray = (T[]) Array.newInstance(type, newSize);
        __CLR4_1_25v5vl3lqxriu.R.inc(436);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_1_25v5vl3lqxriu.R.inc(437);return subarray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code long} array containing the elements
     * between the start and end indices.</p>
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.</p>
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     */
    public static long[] subarray(final long[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_1_25v5vl3lqxriu.R.inc(438);
        __CLR4_1_25v5vl3lqxriu.R.inc(439);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(440)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(441)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(442);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(443);if ((((startIndexInclusive < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(444)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(445)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(446);startIndexInclusive = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(447);if ((((endIndexExclusive > array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(448)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(449)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(450);endIndexExclusive = array.length;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(451);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_1_25v5vl3lqxriu.R.inc(452);if ((((newSize <= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(453)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(454)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(455);return EMPTY_LONG_ARRAY;
        }

        }__CLR4_1_25v5vl3lqxriu.R.inc(456);final long[] subarray = new long[newSize];
        __CLR4_1_25v5vl3lqxriu.R.inc(457);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_1_25v5vl3lqxriu.R.inc(458);return subarray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code int} array containing the elements
     * between the start and end indices.</p>
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.</p>
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     */
    public static int[] subarray(final int[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_1_25v5vl3lqxriu.R.inc(459);
        __CLR4_1_25v5vl3lqxriu.R.inc(460);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(461)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(462)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(463);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(464);if ((((startIndexInclusive < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(465)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(466)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(467);startIndexInclusive = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(468);if ((((endIndexExclusive > array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(469)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(470)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(471);endIndexExclusive = array.length;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(472);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_1_25v5vl3lqxriu.R.inc(473);if ((((newSize <= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(474)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(475)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(476);return EMPTY_INT_ARRAY;
        }

        }__CLR4_1_25v5vl3lqxriu.R.inc(477);final int[] subarray = new int[newSize];
        __CLR4_1_25v5vl3lqxriu.R.inc(478);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_1_25v5vl3lqxriu.R.inc(479);return subarray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code short} array containing the elements
     * between the start and end indices.</p>
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.</p>
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     */
    public static short[] subarray(final short[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_1_25v5vl3lqxriu.R.inc(480);
        __CLR4_1_25v5vl3lqxriu.R.inc(481);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(482)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(483)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(484);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(485);if ((((startIndexInclusive < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(486)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(487)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(488);startIndexInclusive = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(489);if ((((endIndexExclusive > array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(490)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(491)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(492);endIndexExclusive = array.length;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(493);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_1_25v5vl3lqxriu.R.inc(494);if ((((newSize <= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(495)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(496)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(497);return EMPTY_SHORT_ARRAY;
        }

        }__CLR4_1_25v5vl3lqxriu.R.inc(498);final short[] subarray = new short[newSize];
        __CLR4_1_25v5vl3lqxriu.R.inc(499);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_1_25v5vl3lqxriu.R.inc(500);return subarray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code char} array containing the elements
     * between the start and end indices.</p>
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.</p>
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     */
    public static char[] subarray(final char[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_1_25v5vl3lqxriu.R.inc(501);
        __CLR4_1_25v5vl3lqxriu.R.inc(502);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(503)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(504)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(505);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(506);if ((((startIndexInclusive < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(507)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(508)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(509);startIndexInclusive = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(510);if ((((endIndexExclusive > array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(511)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(512)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(513);endIndexExclusive = array.length;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(514);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_1_25v5vl3lqxriu.R.inc(515);if ((((newSize <= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(516)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(517)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(518);return EMPTY_CHAR_ARRAY;
        }

        }__CLR4_1_25v5vl3lqxriu.R.inc(519);final char[] subarray = new char[newSize];
        __CLR4_1_25v5vl3lqxriu.R.inc(520);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_1_25v5vl3lqxriu.R.inc(521);return subarray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code byte} array containing the elements
     * between the start and end indices.</p>
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.</p>
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     */
    public static byte[] subarray(final byte[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_1_25v5vl3lqxriu.R.inc(522);
        __CLR4_1_25v5vl3lqxriu.R.inc(523);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(524)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(525)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(526);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(527);if ((((startIndexInclusive < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(528)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(529)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(530);startIndexInclusive = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(531);if ((((endIndexExclusive > array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(532)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(533)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(534);endIndexExclusive = array.length;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(535);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_1_25v5vl3lqxriu.R.inc(536);if ((((newSize <= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(537)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(538)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(539);return EMPTY_BYTE_ARRAY;
        }

        }__CLR4_1_25v5vl3lqxriu.R.inc(540);final byte[] subarray = new byte[newSize];
        __CLR4_1_25v5vl3lqxriu.R.inc(541);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_1_25v5vl3lqxriu.R.inc(542);return subarray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code double} array containing the elements
     * between the start and end indices.</p>
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.</p>
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     */
    public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_1_25v5vl3lqxriu.R.inc(543);
        __CLR4_1_25v5vl3lqxriu.R.inc(544);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(545)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(546)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(547);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(548);if ((((startIndexInclusive < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(549)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(550)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(551);startIndexInclusive = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(552);if ((((endIndexExclusive > array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(553)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(554)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(555);endIndexExclusive = array.length;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(556);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_1_25v5vl3lqxriu.R.inc(557);if ((((newSize <= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(558)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(559)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(560);return EMPTY_DOUBLE_ARRAY;
        }

        }__CLR4_1_25v5vl3lqxriu.R.inc(561);final double[] subarray = new double[newSize];
        __CLR4_1_25v5vl3lqxriu.R.inc(562);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_1_25v5vl3lqxriu.R.inc(563);return subarray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code float} array containing the elements
     * between the start and end indices.</p>
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.</p>
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     */
    public static float[] subarray(final float[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_1_25v5vl3lqxriu.R.inc(564);
        __CLR4_1_25v5vl3lqxriu.R.inc(565);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(566)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(567)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(568);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(569);if ((((startIndexInclusive < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(570)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(571)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(572);startIndexInclusive = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(573);if ((((endIndexExclusive > array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(574)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(575)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(576);endIndexExclusive = array.length;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(577);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_1_25v5vl3lqxriu.R.inc(578);if ((((newSize <= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(579)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(580)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(581);return EMPTY_FLOAT_ARRAY;
        }

        }__CLR4_1_25v5vl3lqxriu.R.inc(582);final float[] subarray = new float[newSize];
        __CLR4_1_25v5vl3lqxriu.R.inc(583);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_1_25v5vl3lqxriu.R.inc(584);return subarray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Produces a new {@code boolean} array containing the elements
     * between the start and end indices.</p>
     *
     * <p>The start index is inclusive, the end index exclusive.
     * Null array input produces null output.</p>
     *
     * @param array  the array
     * @param startIndexInclusive  the starting index. Undervalue (&lt;0)
     *      is promoted to 0, overvalue (&gt;array.length) results
     *      in an empty array.
     * @param endIndexExclusive  elements up to endIndex-1 are present in the
     *      returned subarray. Undervalue (&lt; startIndex) produces
     *      empty array, overvalue (&gt;array.length) is demoted to
     *      array length.
     * @return a new array containing the elements between
     *      the start and end indices.
     * @since 2.1
     */
    public static boolean[] subarray(final boolean[] array, int startIndexInclusive, int endIndexExclusive) {try{__CLR4_1_25v5vl3lqxriu.R.inc(585);
        __CLR4_1_25v5vl3lqxriu.R.inc(586);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(587)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(588)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(589);return null;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(590);if ((((startIndexInclusive < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(591)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(592)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(593);startIndexInclusive = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(594);if ((((endIndexExclusive > array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(595)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(596)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(597);endIndexExclusive = array.length;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(598);final int newSize = endIndexExclusive - startIndexInclusive;
        __CLR4_1_25v5vl3lqxriu.R.inc(599);if ((((newSize <= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(600)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(601)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(602);return EMPTY_BOOLEAN_ARRAY;
        }

        }__CLR4_1_25v5vl3lqxriu.R.inc(603);final boolean[] subarray = new boolean[newSize];
        __CLR4_1_25v5vl3lqxriu.R.inc(604);System.arraycopy(array, startIndexInclusive, subarray, 0, newSize);
        __CLR4_1_25v5vl3lqxriu.R.inc(605);return subarray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Is same length
    //-----------------------------------------------------------------------
    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.
     *
     * <p>Any multi-dimensional aspects of the arrays are ignored.</p>
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final Object[] array1, final Object[] array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(606);
        __CLR4_1_25v5vl3lqxriu.R.inc(607);if (((((array1 == null && array2 != null && array2.length > 0) ||
            (array2 == null && array1 != null && array1.length > 0) ||
            (array1 != null && array2 != null && array1.length != array2.length))&&(__CLR4_1_25v5vl3lqxriu.R.iget(608)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(609)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(610);return false;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(611);return true;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.</p>
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final long[] array1, final long[] array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(612);
        __CLR4_1_25v5vl3lqxriu.R.inc(613);if (((((array1 == null && array2 != null && array2.length > 0) ||
            (array2 == null && array1 != null && array1.length > 0) ||
            (array1 != null && array2 != null && array1.length != array2.length))&&(__CLR4_1_25v5vl3lqxriu.R.iget(614)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(615)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(616);return false;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(617);return true;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.</p>
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final int[] array1, final int[] array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(618);
        __CLR4_1_25v5vl3lqxriu.R.inc(619);if (((((array1 == null && array2 != null && array2.length > 0) ||
            (array2 == null && array1 != null && array1.length > 0) ||
            (array1 != null && array2 != null && array1.length != array2.length))&&(__CLR4_1_25v5vl3lqxriu.R.iget(620)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(621)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(622);return false;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(623);return true;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.</p>
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final short[] array1, final short[] array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(624);
        __CLR4_1_25v5vl3lqxriu.R.inc(625);if (((((array1 == null && array2 != null && array2.length > 0) ||
            (array2 == null && array1 != null && array1.length > 0) ||
            (array1 != null && array2 != null && array1.length != array2.length))&&(__CLR4_1_25v5vl3lqxriu.R.iget(626)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(627)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(628);return false;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(629);return true;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.</p>
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final char[] array1, final char[] array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(630);
        __CLR4_1_25v5vl3lqxriu.R.inc(631);if (((((array1 == null && array2 != null && array2.length > 0) ||
            (array2 == null && array1 != null && array1.length > 0) ||
            (array1 != null && array2 != null && array1.length != array2.length))&&(__CLR4_1_25v5vl3lqxriu.R.iget(632)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(633)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(634);return false;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(635);return true;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.</p>
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final byte[] array1, final byte[] array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(636);
        __CLR4_1_25v5vl3lqxriu.R.inc(637);if (((((array1 == null && array2 != null && array2.length > 0) ||
            (array2 == null && array1 != null && array1.length > 0) ||
            (array1 != null && array2 != null && array1.length != array2.length))&&(__CLR4_1_25v5vl3lqxriu.R.iget(638)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(639)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(640);return false;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(641);return true;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.</p>
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final double[] array1, final double[] array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(642);
        __CLR4_1_25v5vl3lqxriu.R.inc(643);if (((((array1 == null && array2 != null && array2.length > 0) ||
            (array2 == null && array1 != null && array1.length > 0) ||
            (array1 != null && array2 != null && array1.length != array2.length))&&(__CLR4_1_25v5vl3lqxriu.R.iget(644)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(645)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(646);return false;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(647);return true;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.</p>
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final float[] array1, final float[] array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(648);
        __CLR4_1_25v5vl3lqxriu.R.inc(649);if (((((array1 == null && array2 != null && array2.length > 0) ||
            (array2 == null && array1 != null && array1.length > 0) ||
            (array1 != null && array2 != null && array1.length != array2.length))&&(__CLR4_1_25v5vl3lqxriu.R.iget(650)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(651)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(652);return false;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(653);return true;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same length, treating
     * {@code null} arrays as length {@code 0}.</p>
     *
     * @param array1 the first array, may be {@code null}
     * @param array2 the second array, may be {@code null}
     * @return {@code true} if length of arrays matches, treating
     *  {@code null} as an empty array
     */
    public static boolean isSameLength(final boolean[] array1, final boolean[] array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(654);
        __CLR4_1_25v5vl3lqxriu.R.inc(655);if (((((array1 == null && array2 != null && array2.length > 0) ||
            (array2 == null && array1 != null && array1.length > 0) ||
            (array1 != null && array2 != null && array1.length != array2.length))&&(__CLR4_1_25v5vl3lqxriu.R.iget(656)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(657)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(658);return false;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(659);return true;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns the length of the specified array.
     * This method can deal with {@code Object} arrays and with primitive arrays.</p>
     *
     * <p>If the input array is {@code null}, {@code 0} is returned.</p>
     *
     * <pre>
     * ArrayUtils.getLength(null)            = 0
     * ArrayUtils.getLength([])              = 0
     * ArrayUtils.getLength([null])          = 1
     * ArrayUtils.getLength([true, false])   = 2
     * ArrayUtils.getLength([1, 2, 3])       = 3
     * ArrayUtils.getLength(["a", "b", "c"]) = 3
     * </pre>
     *
     * @param array  the array to retrieve the length from, may be null
     * @return The length of the array, or {@code 0} if the array is {@code null}
     * @throws IllegalArgumentException if the object argument is not an array.
     * @since 2.1
     */
    public static int getLength(final Object array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(660);
        __CLR4_1_25v5vl3lqxriu.R.inc(661);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(662)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(663)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(664);return 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(665);return Array.getLength(array);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks whether two arrays are the same type taking into account
     * multi-dimensional arrays.</p>
     *
     * @param array1 the first array, must not be {@code null}
     * @param array2 the second array, must not be {@code null}
     * @return {@code true} if type of arrays matches
     * @throws IllegalArgumentException if either array is {@code null}
     */
    public static boolean isSameType(final Object array1, final Object array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(666);
        __CLR4_1_25v5vl3lqxriu.R.inc(667);if ((((array1 == null || array2 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(668)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(669)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(670);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(671);return array1.getClass().getName().equals(array2.getClass().getName());
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Reverse
    //-----------------------------------------------------------------------
    /**
     * <p>Reverses the order of the given array.</p>
     *
     * <p>There is no special handling for multi-dimensional arrays.</p>
     *
     * <p>This method does nothing for a {@code null} input array.</p>
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final Object[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(672);
        __CLR4_1_25v5vl3lqxriu.R.inc(673);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(674)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(675)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(676);return;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(677);int i = 0;
        __CLR4_1_25v5vl3lqxriu.R.inc(678);int j = array.length - 1;
        __CLR4_1_25v5vl3lqxriu.R.inc(679);Object tmp;
        __CLR4_1_25v5vl3lqxriu.R.inc(680);while ((((j > i)&&(__CLR4_1_25v5vl3lqxriu.R.iget(681)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(682)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(683);tmp = array[j];
            __CLR4_1_25v5vl3lqxriu.R.inc(684);array[j] = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(685);array[i] = tmp;
            __CLR4_1_25v5vl3lqxriu.R.inc(686);j--;
            __CLR4_1_25v5vl3lqxriu.R.inc(687);i++;
        }
    }}finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.</p>
     *
     * <p>This method does nothing for a {@code null} input array.</p>
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final long[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(688);
        __CLR4_1_25v5vl3lqxriu.R.inc(689);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(690)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(691)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(692);return;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(693);int i = 0;
        __CLR4_1_25v5vl3lqxriu.R.inc(694);int j = array.length - 1;
        __CLR4_1_25v5vl3lqxriu.R.inc(695);long tmp;
        __CLR4_1_25v5vl3lqxriu.R.inc(696);while ((((j > i)&&(__CLR4_1_25v5vl3lqxriu.R.iget(697)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(698)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(699);tmp = array[j];
            __CLR4_1_25v5vl3lqxriu.R.inc(700);array[j] = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(701);array[i] = tmp;
            __CLR4_1_25v5vl3lqxriu.R.inc(702);j--;
            __CLR4_1_25v5vl3lqxriu.R.inc(703);i++;
        }
    }}finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.</p>
     *
     * <p>This method does nothing for a {@code null} input array.</p>
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final int[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(704);
        __CLR4_1_25v5vl3lqxriu.R.inc(705);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(706)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(707)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(708);return;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(709);int i = 0;
        __CLR4_1_25v5vl3lqxriu.R.inc(710);int j = array.length - 1;
        __CLR4_1_25v5vl3lqxriu.R.inc(711);int tmp;
        __CLR4_1_25v5vl3lqxriu.R.inc(712);while ((((j > i)&&(__CLR4_1_25v5vl3lqxriu.R.iget(713)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(714)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(715);tmp = array[j];
            __CLR4_1_25v5vl3lqxriu.R.inc(716);array[j] = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(717);array[i] = tmp;
            __CLR4_1_25v5vl3lqxriu.R.inc(718);j--;
            __CLR4_1_25v5vl3lqxriu.R.inc(719);i++;
        }
    }}finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.</p>
     *
     * <p>This method does nothing for a {@code null} input array.</p>
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final short[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(720);
        __CLR4_1_25v5vl3lqxriu.R.inc(721);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(722)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(723)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(724);return;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(725);int i = 0;
        __CLR4_1_25v5vl3lqxriu.R.inc(726);int j = array.length - 1;
        __CLR4_1_25v5vl3lqxriu.R.inc(727);short tmp;
        __CLR4_1_25v5vl3lqxriu.R.inc(728);while ((((j > i)&&(__CLR4_1_25v5vl3lqxriu.R.iget(729)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(730)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(731);tmp = array[j];
            __CLR4_1_25v5vl3lqxriu.R.inc(732);array[j] = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(733);array[i] = tmp;
            __CLR4_1_25v5vl3lqxriu.R.inc(734);j--;
            __CLR4_1_25v5vl3lqxriu.R.inc(735);i++;
        }
    }}finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.</p>
     *
     * <p>This method does nothing for a {@code null} input array.</p>
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final char[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(736);
        __CLR4_1_25v5vl3lqxriu.R.inc(737);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(738)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(739)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(740);return;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(741);int i = 0;
        __CLR4_1_25v5vl3lqxriu.R.inc(742);int j = array.length - 1;
        __CLR4_1_25v5vl3lqxriu.R.inc(743);char tmp;
        __CLR4_1_25v5vl3lqxriu.R.inc(744);while ((((j > i)&&(__CLR4_1_25v5vl3lqxriu.R.iget(745)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(746)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(747);tmp = array[j];
            __CLR4_1_25v5vl3lqxriu.R.inc(748);array[j] = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(749);array[i] = tmp;
            __CLR4_1_25v5vl3lqxriu.R.inc(750);j--;
            __CLR4_1_25v5vl3lqxriu.R.inc(751);i++;
        }
    }}finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.</p>
     *
     * <p>This method does nothing for a {@code null} input array.</p>
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final byte[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(752);
        __CLR4_1_25v5vl3lqxriu.R.inc(753);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(754)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(755)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(756);return;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(757);int i = 0;
        __CLR4_1_25v5vl3lqxriu.R.inc(758);int j = array.length - 1;
        __CLR4_1_25v5vl3lqxriu.R.inc(759);byte tmp;
        __CLR4_1_25v5vl3lqxriu.R.inc(760);while ((((j > i)&&(__CLR4_1_25v5vl3lqxriu.R.iget(761)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(762)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(763);tmp = array[j];
            __CLR4_1_25v5vl3lqxriu.R.inc(764);array[j] = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(765);array[i] = tmp;
            __CLR4_1_25v5vl3lqxriu.R.inc(766);j--;
            __CLR4_1_25v5vl3lqxriu.R.inc(767);i++;
        }
    }}finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.</p>
     *
     * <p>This method does nothing for a {@code null} input array.</p>
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final double[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(768);
        __CLR4_1_25v5vl3lqxriu.R.inc(769);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(770)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(771)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(772);return;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(773);int i = 0;
        __CLR4_1_25v5vl3lqxriu.R.inc(774);int j = array.length - 1;
        __CLR4_1_25v5vl3lqxriu.R.inc(775);double tmp;
        __CLR4_1_25v5vl3lqxriu.R.inc(776);while ((((j > i)&&(__CLR4_1_25v5vl3lqxriu.R.iget(777)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(778)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(779);tmp = array[j];
            __CLR4_1_25v5vl3lqxriu.R.inc(780);array[j] = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(781);array[i] = tmp;
            __CLR4_1_25v5vl3lqxriu.R.inc(782);j--;
            __CLR4_1_25v5vl3lqxriu.R.inc(783);i++;
        }
    }}finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.</p>
     *
     * <p>This method does nothing for a {@code null} input array.</p>
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final float[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(784);
        __CLR4_1_25v5vl3lqxriu.R.inc(785);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(786)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(787)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(788);return;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(789);int i = 0;
        __CLR4_1_25v5vl3lqxriu.R.inc(790);int j = array.length - 1;
        __CLR4_1_25v5vl3lqxriu.R.inc(791);float tmp;
        __CLR4_1_25v5vl3lqxriu.R.inc(792);while ((((j > i)&&(__CLR4_1_25v5vl3lqxriu.R.iget(793)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(794)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(795);tmp = array[j];
            __CLR4_1_25v5vl3lqxriu.R.inc(796);array[j] = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(797);array[i] = tmp;
            __CLR4_1_25v5vl3lqxriu.R.inc(798);j--;
            __CLR4_1_25v5vl3lqxriu.R.inc(799);i++;
        }
    }}finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Reverses the order of the given array.</p>
     *
     * <p>This method does nothing for a {@code null} input array.</p>
     *
     * @param array  the array to reverse, may be {@code null}
     */
    public static void reverse(final boolean[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(800);
        __CLR4_1_25v5vl3lqxriu.R.inc(801);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(802)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(803)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(804);return;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(805);int i = 0;
        __CLR4_1_25v5vl3lqxriu.R.inc(806);int j = array.length - 1;
        __CLR4_1_25v5vl3lqxriu.R.inc(807);boolean tmp;
        __CLR4_1_25v5vl3lqxriu.R.inc(808);while ((((j > i)&&(__CLR4_1_25v5vl3lqxriu.R.iget(809)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(810)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(811);tmp = array[j];
            __CLR4_1_25v5vl3lqxriu.R.inc(812);array[j] = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(813);array[i] = tmp;
            __CLR4_1_25v5vl3lqxriu.R.inc(814);j--;
            __CLR4_1_25v5vl3lqxriu.R.inc(815);i++;
        }
    }}finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // IndexOf search
    // ----------------------------------------------------------------------

    // Object IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given object in the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param objectToFind  the object to find, may be {@code null}
     * @return the index of the object within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final Object[] array, final Object objectToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(816);
        __CLR4_1_25v5vl3lqxriu.R.inc(817);return indexOf(array, objectToFind, 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given object in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param objectToFind  the object to find, may be {@code null}
     * @param startIndex  the index to start searching at
     * @return the index of the object within the array starting at the index,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final Object[] array, final Object objectToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(818);
        __CLR4_1_25v5vl3lqxriu.R.inc(819);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(820)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(821)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(822);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(823);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(824)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(825)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(826);startIndex = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(827);if ((((objectToFind == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(828)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(829)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(830);for (int i = startIndex; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(831)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(832)==0&false)); i++) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(833);if ((((array[i] == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(834)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(835)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(836);return i;
                }
            }}
        }} }else {__CLR4_1_25v5vl3lqxriu.R.inc(837);if ((((array.getClass().getComponentType().isInstance(objectToFind))&&(__CLR4_1_25v5vl3lqxriu.R.iget(838)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(839)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(840);for (int i = startIndex; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(841)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(842)==0&false)); i++) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(843);if ((((objectToFind.equals(array[i]))&&(__CLR4_1_25v5vl3lqxriu.R.iget(844)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(845)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(846);return i;
                }
            }}
        }}
        }}__CLR4_1_25v5vl3lqxriu.R.inc(847);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given object within the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to travers backwords looking for the object, may be {@code null}
     * @param objectToFind  the object to find, may be {@code null}
     * @return the last index of the object within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final Object[] array, final Object objectToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(848);
        __CLR4_1_25v5vl3lqxriu.R.inc(849);return lastIndexOf(array, objectToFind, Integer.MAX_VALUE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given object in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than
     * the array length will search from the end of the array.</p>
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param objectToFind  the object to find, may be {@code null}
     * @param startIndex  the start index to travers backwards from
     * @return the last index of the object within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final Object[] array, final Object objectToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(850);
        __CLR4_1_25v5vl3lqxriu.R.inc(851);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(852)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(853)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(854);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(855);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(856)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(857)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(858);return INDEX_NOT_FOUND;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(859);if ((((startIndex >= array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(860)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(861)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(862);startIndex = array.length - 1;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(863);if ((((objectToFind == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(864)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(865)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(866);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(867)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(868)==0&false)); i--) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(869);if ((((array[i] == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(870)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(871)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(872);return i;
                }
            }}
        }} }else {__CLR4_1_25v5vl3lqxriu.R.inc(873);if ((((array.getClass().getComponentType().isInstance(objectToFind))&&(__CLR4_1_25v5vl3lqxriu.R.iget(874)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(875)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(876);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(877)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(878)==0&false)); i--) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(879);if ((((objectToFind.equals(array[i]))&&(__CLR4_1_25v5vl3lqxriu.R.iget(880)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(881)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(882);return i;
                }
            }}
        }}
        }}__CLR4_1_25v5vl3lqxriu.R.inc(883);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if the object is in the given array.</p>
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.</p>
     *
     * @param array  the array to search through
     * @param objectToFind  the object to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final Object[] array, final Object objectToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(884);
        __CLR4_1_25v5vl3lqxriu.R.inc(885);return indexOf(array, objectToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // long IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final long[] array, final long valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(886);
        __CLR4_1_25v5vl3lqxriu.R.inc(887);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final long[] array, final long valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(888);
        __CLR4_1_25v5vl3lqxriu.R.inc(889);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(890)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(891)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(892);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(893);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(894)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(895)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(896);startIndex = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(897);for (int i = startIndex; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(898)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(899)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(900);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(901)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(902)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(903);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(904);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to travers backwords looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final long[] array, final long valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(905);
        __CLR4_1_25v5vl3lqxriu.R.inc(906);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.</p>
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to travers backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final long[] array, final long valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(907);
        __CLR4_1_25v5vl3lqxriu.R.inc(908);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(909)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(910)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(911);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(912);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(913)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(914)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(915);return INDEX_NOT_FOUND;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(916);if ((((startIndex >= array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(917)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(918)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(919);startIndex = array.length - 1;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(920);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(921)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(922)==0&false)); i--) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(923);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(924)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(925)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(926);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(927);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.</p>
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.</p>
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final long[] array, final long valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(928);
        __CLR4_1_25v5vl3lqxriu.R.inc(929);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // int IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final int[] array, final int valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(930);
        __CLR4_1_25v5vl3lqxriu.R.inc(931);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final int[] array, final int valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(932);
        __CLR4_1_25v5vl3lqxriu.R.inc(933);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(934)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(935)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(936);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(937);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(938)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(939)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(940);startIndex = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(941);for (int i = startIndex; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(942)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(943)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(944);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(945)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(946)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(947);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(948);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to travers backwords looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final int[] array, final int valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(949);
        __CLR4_1_25v5vl3lqxriu.R.inc(950);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.</p>
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to travers backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final int[] array, final int valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(951);
        __CLR4_1_25v5vl3lqxriu.R.inc(952);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(953)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(954)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(955);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(956);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(957)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(958)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(959);return INDEX_NOT_FOUND;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(960);if ((((startIndex >= array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(961)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(962)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(963);startIndex = array.length - 1;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(964);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(965)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(966)==0&false)); i--) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(967);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(968)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(969)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(970);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(971);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.</p>
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.</p>
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final int[] array, final int valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(972);
        __CLR4_1_25v5vl3lqxriu.R.inc(973);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // short IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final short[] array, final short valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(974);
        __CLR4_1_25v5vl3lqxriu.R.inc(975);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final short[] array, final short valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(976);
        __CLR4_1_25v5vl3lqxriu.R.inc(977);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(978)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(979)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(980);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(981);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(982)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(983)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(984);startIndex = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(985);for (int i = startIndex; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(986)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(987)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(988);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(989)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(990)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(991);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(992);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to travers backwords looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final short[] array, final short valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(993);
        __CLR4_1_25v5vl3lqxriu.R.inc(994);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.</p>
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to travers backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final short[] array, final short valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(995);
        __CLR4_1_25v5vl3lqxriu.R.inc(996);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(997)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(998)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(999);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1000);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1001)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1002)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1003);return INDEX_NOT_FOUND;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1004);if ((((startIndex >= array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1005)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1006)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1007);startIndex = array.length - 1;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1008);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1009)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1010)==0&false)); i--) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1011);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(1012)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1013)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1014);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1015);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.</p>
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.</p>
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final short[] array, final short valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1016);
        __CLR4_1_25v5vl3lqxriu.R.inc(1017);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // char IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     * @since 2.1
     */
    public static int indexOf(final char[] array, final char valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1018);
        __CLR4_1_25v5vl3lqxriu.R.inc(1019);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     * @since 2.1
     */
    public static int indexOf(final char[] array, final char valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1020);
        __CLR4_1_25v5vl3lqxriu.R.inc(1021);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1022)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1023)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1024);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1025);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1026)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1027)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1028);startIndex = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1029);for (int i = startIndex; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1030)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1031)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1032);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(1033)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1034)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1035);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1036);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to travers backwords looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     * @since 2.1
     */
    public static int lastIndexOf(final char[] array, final char valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1037);
        __CLR4_1_25v5vl3lqxriu.R.inc(1038);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.</p>
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to travers backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     * @since 2.1
     */
    public static int lastIndexOf(final char[] array, final char valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1039);
        __CLR4_1_25v5vl3lqxriu.R.inc(1040);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1041)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1042)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1043);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1044);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1045)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1046)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1047);return INDEX_NOT_FOUND;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1048);if ((((startIndex >= array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1049)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1050)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1051);startIndex = array.length - 1;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1052);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1053)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1054)==0&false)); i--) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1055);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(1056)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1057)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1058);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1059);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.</p>
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.</p>
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     * @since 2.1
     */
    public static boolean contains(final char[] array, final char valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1060);
        __CLR4_1_25v5vl3lqxriu.R.inc(1061);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // byte IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final byte[] array, final byte valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1062);
        __CLR4_1_25v5vl3lqxriu.R.inc(1063);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final byte[] array, final byte valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1064);
        __CLR4_1_25v5vl3lqxriu.R.inc(1065);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1066)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1067)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1068);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1069);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1070)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1071)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1072);startIndex = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1073);for (int i = startIndex; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1074)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1075)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1076);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(1077)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1078)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1079);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1080);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to travers backwords looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final byte[] array, final byte valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1081);
        __CLR4_1_25v5vl3lqxriu.R.inc(1082);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.</p>
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to travers backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final byte[] array, final byte valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1083);
        __CLR4_1_25v5vl3lqxriu.R.inc(1084);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1085)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1086)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1087);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1088);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1089)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1090)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1091);return INDEX_NOT_FOUND;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1092);if ((((startIndex >= array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1093)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1094)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1095);startIndex = array.length - 1;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1096);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1097)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1098)==0&false)); i--) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1099);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(1100)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1101)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1102);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1103);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.</p>
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.</p>
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final byte[] array, final byte valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1104);
        __CLR4_1_25v5vl3lqxriu.R.inc(1105);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // double IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final double[] array, final double valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1106);
        __CLR4_1_25v5vl3lqxriu.R.inc(1107);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value within a given tolerance in the array.
     * This method will return the index of the first value which falls between the region
     * defined by valueToFind - tolerance and valueToFind + tolerance.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param tolerance tolerance of the search
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final double[] array, final double valueToFind, final double tolerance) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1108);
        __CLR4_1_25v5vl3lqxriu.R.inc(1109);return indexOf(array, valueToFind, 0, tolerance);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final double[] array, final double valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1110);
        __CLR4_1_25v5vl3lqxriu.R.inc(1111);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_1_25v5vl3lqxriu.R.iget(1112)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1113)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1114);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1115);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1116)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1117)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1118);startIndex = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1119);for (int i = startIndex; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1120)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1121)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1122);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(1123)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1124)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1125);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1126);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.
     * This method will return the index of the first value which falls between the region
     * defined by valueToFind - tolerance and valueToFind + tolerance.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @param tolerance tolerance of the search
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final double[] array, final double valueToFind, int startIndex, final double tolerance) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1127);
        __CLR4_1_25v5vl3lqxriu.R.inc(1128);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_1_25v5vl3lqxriu.R.iget(1129)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1130)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1131);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1132);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1133)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1134)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1135);startIndex = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1136);final double min = valueToFind - tolerance;
        __CLR4_1_25v5vl3lqxriu.R.inc(1137);final double max = valueToFind + tolerance;
        __CLR4_1_25v5vl3lqxriu.R.inc(1138);for (int i = startIndex; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1139)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1140)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1141);if ((((array[i] >= min && array[i] <= max)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1142)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1143)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1144);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1145);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to travers backwords looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final double[] array, final double valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1146);
        __CLR4_1_25v5vl3lqxriu.R.inc(1147);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within a given tolerance in the array.
     * This method will return the index of the last value which falls between the region
     * defined by valueToFind - tolerance and valueToFind + tolerance.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param tolerance tolerance of the search
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final double[] array, final double valueToFind, final double tolerance) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1148);
        __CLR4_1_25v5vl3lqxriu.R.inc(1149);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE, tolerance);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.</p>
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to travers backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final double[] array, final double valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1150);
        __CLR4_1_25v5vl3lqxriu.R.inc(1151);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_1_25v5vl3lqxriu.R.iget(1152)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1153)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1154);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1155);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1156)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1157)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1158);return INDEX_NOT_FOUND;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1159);if ((((startIndex >= array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1160)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1161)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1162);startIndex = array.length - 1;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1163);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1164)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1165)==0&false)); i--) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1166);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(1167)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1168)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1169);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1170);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.
     * This method will return the index of the last value which falls between the region
     * defined by valueToFind - tolerance and valueToFind + tolerance.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.</p>
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to travers backwards from
     * @param tolerance  search for value within plus/minus this amount
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final double[] array, final double valueToFind, int startIndex, final double tolerance) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1171);
        __CLR4_1_25v5vl3lqxriu.R.inc(1172);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_1_25v5vl3lqxriu.R.iget(1173)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1174)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1175);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1176);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1177)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1178)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1179);return INDEX_NOT_FOUND;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1180);if ((((startIndex >= array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1181)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1182)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1183);startIndex = array.length - 1;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1184);final double min = valueToFind - tolerance;
        __CLR4_1_25v5vl3lqxriu.R.inc(1185);final double max = valueToFind + tolerance;
        __CLR4_1_25v5vl3lqxriu.R.inc(1186);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1187)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1188)==0&false)); i--) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1189);if ((((array[i] >= min && array[i] <= max)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1190)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1191)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1192);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1193);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.</p>
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.</p>
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final double[] array, final double valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1194);
        __CLR4_1_25v5vl3lqxriu.R.inc(1195);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if a value falling within the given tolerance is in the
     * given array.  If the array contains a value within the inclusive range
     * defined by (value - tolerance) to (value + tolerance).</p>
     *
     * <p>The method returns {@code false} if a {@code null} array
     * is passed in.</p>
     *
     * @param array  the array to search
     * @param valueToFind  the value to find
     * @param tolerance  the array contains the tolerance of the search
     * @return true if value falling within tolerance is in array
     */
    public static boolean contains(final double[] array, final double valueToFind, final double tolerance) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1196);
        __CLR4_1_25v5vl3lqxriu.R.inc(1197);return indexOf(array, valueToFind, 0, tolerance) != INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // float IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final float[] array, final float valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1198);
        __CLR4_1_25v5vl3lqxriu.R.inc(1199);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final float[] array, final float valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1200);
        __CLR4_1_25v5vl3lqxriu.R.inc(1201);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_1_25v5vl3lqxriu.R.iget(1202)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1203)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1204);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1205);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1206)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1207)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1208);startIndex = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1209);for (int i = startIndex; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1210)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1211)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1212);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(1213)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1214)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1215);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1216);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to travers backwords looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final float[] array, final float valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1217);
        __CLR4_1_25v5vl3lqxriu.R.inc(1218);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than the
     * array length will search from the end of the array.</p>
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to travers backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final float[] array, final float valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1219);
        __CLR4_1_25v5vl3lqxriu.R.inc(1220);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_1_25v5vl3lqxriu.R.iget(1221)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1222)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1223);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1224);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1225)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1226)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1227);return INDEX_NOT_FOUND;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1228);if ((((startIndex >= array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1229)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1230)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1231);startIndex = array.length - 1;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1232);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1233)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1234)==0&false)); i--) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1235);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(1236)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1237)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1238);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1239);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.</p>
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.</p>
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final float[] array, final float valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1240);
        __CLR4_1_25v5vl3lqxriu.R.inc(1241);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // boolean IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the index of the given value in the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int indexOf(final boolean[] array, final boolean valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1242);
        __CLR4_1_25v5vl3lqxriu.R.inc(1243);return indexOf(array, valueToFind, 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex is treated as zero. A startIndex larger than the array
     * length will return {@link #INDEX_NOT_FOUND} ({@code -1}).</p>
     *
     * @param array  the array to search through for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the index to start searching at
     * @return the index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null}
     *  array input
     */
    public static int indexOf(final boolean[] array, final boolean valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1244);
        __CLR4_1_25v5vl3lqxriu.R.inc(1245);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_1_25v5vl3lqxriu.R.iget(1246)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1247)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1248);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1249);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1250)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1251)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1252);startIndex = 0;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1253);for (int i = startIndex; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1254)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1255)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1256);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(1257)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1258)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1259);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1260);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value within the array.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) if
     * {@code null} array input.</p>
     *
     * @param array  the array to travers backwords looking for the object, may be {@code null}
     * @param valueToFind  the object to find
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final boolean[] array, final boolean valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1261);
        __CLR4_1_25v5vl3lqxriu.R.inc(1262);return lastIndexOf(array, valueToFind, Integer.MAX_VALUE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Finds the last index of the given value in the array starting at the given index.</p>
     *
     * <p>This method returns {@link #INDEX_NOT_FOUND} ({@code -1}) for a {@code null} input array.</p>
     *
     * <p>A negative startIndex will return {@link #INDEX_NOT_FOUND} ({@code -1}). A startIndex larger than
     * the array length will search from the end of the array.</p>
     *
     * @param array  the array to traverse for looking for the object, may be {@code null}
     * @param valueToFind  the value to find
     * @param startIndex  the start index to travers backwards from
     * @return the last index of the value within the array,
     *  {@link #INDEX_NOT_FOUND} ({@code -1}) if not found or {@code null} array input
     */
    public static int lastIndexOf(final boolean[] array, final boolean valueToFind, int startIndex) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1263);
        __CLR4_1_25v5vl3lqxriu.R.inc(1264);if ((((ArrayUtils.isEmpty(array))&&(__CLR4_1_25v5vl3lqxriu.R.iget(1265)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1266)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1267);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1268);if ((((startIndex < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1269)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1270)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1271);return INDEX_NOT_FOUND;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1272);if ((((startIndex >= array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1273)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1274)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1275);startIndex = array.length - 1;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1276);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1277)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1278)==0&false)); i--) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1279);if ((((valueToFind == array[i])&&(__CLR4_1_25v5vl3lqxriu.R.iget(1280)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1281)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1282);return i;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(1283);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if the value is in the given array.</p>
     *
     * <p>The method returns {@code false} if a {@code null} array is passed in.</p>
     *
     * @param array  the array to search through
     * @param valueToFind  the value to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final boolean[] array, final boolean valueToFind) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1284);
        __CLR4_1_25v5vl3lqxriu.R.inc(1285);return indexOf(array, valueToFind) != INDEX_NOT_FOUND;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Primitive/Object array converters
    // ----------------------------------------------------------------------

    // Character array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Characters to primitives.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Character} array, may be {@code null}
     * @return a {@code char} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static char[] toPrimitive(final Character[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1286);
        __CLR4_1_25v5vl3lqxriu.R.inc(1287);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1288)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1289)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1290);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1291);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1292)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1293)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1294);return EMPTY_CHAR_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1295);final char[] result = new char[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1296);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1297)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1298)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1299);result[i] = array[i].charValue();
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1300);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Character to primitives handling {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Character} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code char} array, {@code null} if null array input
     */
    public static char[] toPrimitive(final Character[] array, final char valueForNull) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1301);
        __CLR4_1_25v5vl3lqxriu.R.inc(1302);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1303)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1304)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1305);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1306);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1307)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1308)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1309);return EMPTY_CHAR_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1310);final char[] result = new char[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1311);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1312)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1313)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1314);final Character b = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(1315);result[i] = ((((b == null )&&(__CLR4_1_25v5vl3lqxriu.R.iget(1316)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1317)==0&false))? valueForNull : b.charValue());
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1318);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive chars to objects.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array a {@code char} array
     * @return a {@code Character} array, {@code null} if null array input
     */
    public static Character[] toObject(final char[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1319);
        __CLR4_1_25v5vl3lqxriu.R.inc(1320);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1321)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1322)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1323);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1324);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1325)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1326)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1327);return EMPTY_CHARACTER_OBJECT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1328);final Character[] result = new Character[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1329);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1330)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1331)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1332);result[i] = Character.valueOf(array[i]);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1333);return result;
     }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Long array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Longs to primitives.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Long} array, may be {@code null}
     * @return a {@code long} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static long[] toPrimitive(final Long[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1334);
        __CLR4_1_25v5vl3lqxriu.R.inc(1335);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1336)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1337)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1338);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1339);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1340)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1341)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1342);return EMPTY_LONG_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1343);final long[] result = new long[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1344);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1345)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1346)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1347);result[i] = array[i].longValue();
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1348);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Long to primitives handling {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Long} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code long} array, {@code null} if null array input
     */
    public static long[] toPrimitive(final Long[] array, final long valueForNull) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1349);
        __CLR4_1_25v5vl3lqxriu.R.inc(1350);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1351)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1352)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1353);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1354);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1355)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1356)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1357);return EMPTY_LONG_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1358);final long[] result = new long[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1359);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1360)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1361)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1362);final Long b = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(1363);result[i] = ((((b == null )&&(__CLR4_1_25v5vl3lqxriu.R.iget(1364)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1365)==0&false))? valueForNull : b.longValue());
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1366);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive longs to objects.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code long} array
     * @return a {@code Long} array, {@code null} if null array input
     */
    public static Long[] toObject(final long[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1367);
        __CLR4_1_25v5vl3lqxriu.R.inc(1368);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1369)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1370)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1371);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1372);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1373)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1374)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1375);return EMPTY_LONG_OBJECT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1376);final Long[] result = new Long[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1377);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1378)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1379)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1380);result[i] = Long.valueOf(array[i]);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1381);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Int array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Integers to primitives.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Integer} array, may be {@code null}
     * @return an {@code int} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static int[] toPrimitive(final Integer[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1382);
        __CLR4_1_25v5vl3lqxriu.R.inc(1383);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1384)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1385)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1386);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1387);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1388)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1389)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1390);return EMPTY_INT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1391);final int[] result = new int[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1392);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1393)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1394)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1395);result[i] = array[i].intValue();
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1396);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Integer to primitives handling {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Integer} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return an {@code int} array, {@code null} if null array input
     */
    public static int[] toPrimitive(final Integer[] array, final int valueForNull) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1397);
        __CLR4_1_25v5vl3lqxriu.R.inc(1398);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1399)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1400)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1401);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1402);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1403)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1404)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1405);return EMPTY_INT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1406);final int[] result = new int[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1407);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1408)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1409)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1410);final Integer b = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(1411);result[i] = ((((b == null )&&(__CLR4_1_25v5vl3lqxriu.R.iget(1412)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1413)==0&false))? valueForNull : b.intValue());
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1414);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive ints to objects.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  an {@code int} array
     * @return an {@code Integer} array, {@code null} if null array input
     */
    public static Integer[] toObject(final int[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1415);
        __CLR4_1_25v5vl3lqxriu.R.inc(1416);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1417)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1418)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1419);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1420);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1421)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1422)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1423);return EMPTY_INTEGER_OBJECT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1424);final Integer[] result = new Integer[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1425);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1426)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1427)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1428);result[i] = Integer.valueOf(array[i]);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1429);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Short array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Shorts to primitives.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Short} array, may be {@code null}
     * @return a {@code byte} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static short[] toPrimitive(final Short[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1430);
        __CLR4_1_25v5vl3lqxriu.R.inc(1431);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1432)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1433)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1434);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1435);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1436)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1437)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1438);return EMPTY_SHORT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1439);final short[] result = new short[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1440);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1441)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1442)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1443);result[i] = array[i].shortValue();
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1444);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Short to primitives handling {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Short} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code byte} array, {@code null} if null array input
     */
    public static short[] toPrimitive(final Short[] array, final short valueForNull) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1445);
        __CLR4_1_25v5vl3lqxriu.R.inc(1446);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1447)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1448)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1449);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1450);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1451)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1452)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1453);return EMPTY_SHORT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1454);final short[] result = new short[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1455);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1456)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1457)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1458);final Short b = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(1459);result[i] = ((((b == null )&&(__CLR4_1_25v5vl3lqxriu.R.iget(1460)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1461)==0&false))? valueForNull : b.shortValue());
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1462);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive shorts to objects.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code short} array
     * @return a {@code Short} array, {@code null} if null array input
     */
    public static Short[] toObject(final short[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1463);
        __CLR4_1_25v5vl3lqxriu.R.inc(1464);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1465)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1466)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1467);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1468);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1469)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1470)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1471);return EMPTY_SHORT_OBJECT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1472);final Short[] result = new Short[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1473);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1474)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1475)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1476);result[i] = Short.valueOf(array[i]);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1477);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Byte array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Bytes to primitives.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Byte} array, may be {@code null}
     * @return a {@code byte} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static byte[] toPrimitive(final Byte[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1478);
        __CLR4_1_25v5vl3lqxriu.R.inc(1479);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1480)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1481)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1482);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1483);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1484)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1485)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1486);return EMPTY_BYTE_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1487);final byte[] result = new byte[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1488);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1489)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1490)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1491);result[i] = array[i].byteValue();
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1492);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Bytes to primitives handling {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Byte} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code byte} array, {@code null} if null array input
     */
    public static byte[] toPrimitive(final Byte[] array, final byte valueForNull) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1493);
        __CLR4_1_25v5vl3lqxriu.R.inc(1494);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1495)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1496)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1497);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1498);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1499)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1500)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1501);return EMPTY_BYTE_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1502);final byte[] result = new byte[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1503);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1504)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1505)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1506);final Byte b = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(1507);result[i] = ((((b == null )&&(__CLR4_1_25v5vl3lqxriu.R.iget(1508)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1509)==0&false))? valueForNull : b.byteValue());
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1510);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive bytes to objects.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code byte} array
     * @return a {@code Byte} array, {@code null} if null array input
     */
    public static Byte[] toObject(final byte[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1511);
        __CLR4_1_25v5vl3lqxriu.R.inc(1512);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1513)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1514)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1515);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1516);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1517)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1518)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1519);return EMPTY_BYTE_OBJECT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1520);final Byte[] result = new Byte[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1521);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1522)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1523)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1524);result[i] = Byte.valueOf(array[i]);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1525);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Double array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Doubles to primitives.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Double} array, may be {@code null}
     * @return a {@code double} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static double[] toPrimitive(final Double[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1526);
        __CLR4_1_25v5vl3lqxriu.R.inc(1527);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1528)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1529)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1530);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1531);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1532)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1533)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1534);return EMPTY_DOUBLE_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1535);final double[] result = new double[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1536);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1537)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1538)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1539);result[i] = array[i].doubleValue();
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1540);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Doubles to primitives handling {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Double} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code double} array, {@code null} if null array input
     */
    public static double[] toPrimitive(final Double[] array, final double valueForNull) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1541);
        __CLR4_1_25v5vl3lqxriu.R.inc(1542);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1543)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1544)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1545);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1546);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1547)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1548)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1549);return EMPTY_DOUBLE_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1550);final double[] result = new double[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1551);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1552)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1553)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1554);final Double b = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(1555);result[i] = ((((b == null )&&(__CLR4_1_25v5vl3lqxriu.R.iget(1556)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1557)==0&false))? valueForNull : b.doubleValue());
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1558);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive doubles to objects.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code double} array
     * @return a {@code Double} array, {@code null} if null array input
     */
    public static Double[] toObject(final double[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1559);
        __CLR4_1_25v5vl3lqxriu.R.inc(1560);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1561)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1562)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1563);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1564);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1565)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1566)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1567);return EMPTY_DOUBLE_OBJECT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1568);final Double[] result = new Double[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1569);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1570)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1571)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1572);result[i] = Double.valueOf(array[i]);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1573);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    //   Float array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Floats to primitives.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Float} array, may be {@code null}
     * @return a {@code float} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static float[] toPrimitive(final Float[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1574);
        __CLR4_1_25v5vl3lqxriu.R.inc(1575);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1576)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1577)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1578);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1579);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1580)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1581)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1582);return EMPTY_FLOAT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1583);final float[] result = new float[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1584);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1585)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1586)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1587);result[i] = array[i].floatValue();
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1588);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Floats to primitives handling {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Float} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code float} array, {@code null} if null array input
     */
    public static float[] toPrimitive(final Float[] array, final float valueForNull) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1589);
        __CLR4_1_25v5vl3lqxriu.R.inc(1590);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1591)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1592)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1593);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1594);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1595)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1596)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1597);return EMPTY_FLOAT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1598);final float[] result = new float[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1599);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1600)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1601)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1602);final Float b = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(1603);result[i] = ((((b == null )&&(__CLR4_1_25v5vl3lqxriu.R.iget(1604)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1605)==0&false))? valueForNull : b.floatValue());
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1606);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive floats to objects.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code float} array
     * @return a {@code Float} array, {@code null} if null array input
     */
    public static Float[] toObject(final float[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1607);
        __CLR4_1_25v5vl3lqxriu.R.inc(1608);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1609)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1610)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1611);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1612);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1613)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1614)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1615);return EMPTY_FLOAT_OBJECT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1616);final Float[] result = new Float[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1617);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1618)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1619)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1620);result[i] = Float.valueOf(array[i]);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1621);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // Boolean array converters
    // ----------------------------------------------------------------------
    /**
     * <p>Converts an array of object Booleans to primitives.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Boolean} array, may be {@code null}
     * @return a {@code boolean} array, {@code null} if null array input
     * @throws NullPointerException if array content is {@code null}
     */
    public static boolean[] toPrimitive(final Boolean[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1622);
        __CLR4_1_25v5vl3lqxriu.R.inc(1623);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1624)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1625)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1626);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1627);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1628)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1629)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1630);return EMPTY_BOOLEAN_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1631);final boolean[] result = new boolean[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1632);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1633)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1634)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1635);result[i] = array[i].booleanValue();
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1636);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of object Booleans to primitives handling {@code null}.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code Boolean} array, may be {@code null}
     * @param valueForNull  the value to insert if {@code null} found
     * @return a {@code boolean} array, {@code null} if null array input
     */
    public static boolean[] toPrimitive(final Boolean[] array, final boolean valueForNull) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1637);
        __CLR4_1_25v5vl3lqxriu.R.inc(1638);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1639)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1640)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1641);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1642);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1643)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1644)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1645);return EMPTY_BOOLEAN_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1646);final boolean[] result = new boolean[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1647);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1648)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1649)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1650);final Boolean b = array[i];
            __CLR4_1_25v5vl3lqxriu.R.inc(1651);result[i] = ((((b == null )&&(__CLR4_1_25v5vl3lqxriu.R.iget(1652)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1653)==0&false))? valueForNull : b.booleanValue());
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1654);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Converts an array of primitive booleans to objects.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array  a {@code boolean} array
     * @return a {@code Boolean} array, {@code null} if null array input
     */
    public static Boolean[] toObject(final boolean[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1655);
        __CLR4_1_25v5vl3lqxriu.R.inc(1656);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1657)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1658)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1659);return null;
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1660);if ((((array.length == 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1661)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1662)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1663);return EMPTY_BOOLEAN_OBJECT_ARRAY;
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1664);final Boolean[] result = new Boolean[array.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1665);for (int i = 0; (((i < array.length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1666)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1667)==0&false)); i++) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1668);result[i] = ((((array[i] )&&(__CLR4_1_25v5vl3lqxriu.R.iget(1669)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1670)==0&false))? Boolean.TRUE : Boolean.FALSE);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1671);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // ----------------------------------------------------------------------
    /**
     * <p>Checks if an array of Objects is empty or {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final Object[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1672);
        __CLR4_1_25v5vl3lqxriu.R.inc(1673);return array == null || array.length == 0;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive longs is empty or {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final long[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1674);
        __CLR4_1_25v5vl3lqxriu.R.inc(1675);return array == null || array.length == 0;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive ints is empty or {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final int[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1676);
        __CLR4_1_25v5vl3lqxriu.R.inc(1677);return array == null || array.length == 0;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive shorts is empty or {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final short[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1678);
        __CLR4_1_25v5vl3lqxriu.R.inc(1679);return array == null || array.length == 0;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive chars is empty or {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final char[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1680);
        __CLR4_1_25v5vl3lqxriu.R.inc(1681);return array == null || array.length == 0;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive bytes is empty or {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final byte[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1682);
        __CLR4_1_25v5vl3lqxriu.R.inc(1683);return array == null || array.length == 0;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive doubles is empty or {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final double[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1684);
        __CLR4_1_25v5vl3lqxriu.R.inc(1685);return array == null || array.length == 0;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive floats is empty or {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final float[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1686);
        __CLR4_1_25v5vl3lqxriu.R.inc(1687);return array == null || array.length == 0;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive booleans is empty or {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(final boolean[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1688);
        __CLR4_1_25v5vl3lqxriu.R.inc(1689);return array == null || array.length == 0;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    // ----------------------------------------------------------------------
    /**
     * <p>Checks if an array of Objects is not empty or not {@code null}.</p>
     *
     * @param <T> the component type of the array
     * @param array  the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
     public static <T> boolean isNotEmpty(final T[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1690);
         __CLR4_1_25v5vl3lqxriu.R.inc(1691);return (array != null && array.length != 0);
     }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive longs is not empty or not {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final long[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1692);
        __CLR4_1_25v5vl3lqxriu.R.inc(1693);return (array != null && array.length != 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive ints is not empty or not {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final int[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1694);
        __CLR4_1_25v5vl3lqxriu.R.inc(1695);return (array != null && array.length != 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive shorts is not empty or not {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final short[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1696);
        __CLR4_1_25v5vl3lqxriu.R.inc(1697);return (array != null && array.length != 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive chars is not empty or not {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final char[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1698);
        __CLR4_1_25v5vl3lqxriu.R.inc(1699);return (array != null && array.length != 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive bytes is not empty or not {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final byte[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1700);
        __CLR4_1_25v5vl3lqxriu.R.inc(1701);return (array != null && array.length != 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive doubles is not empty or not {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final double[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1702);
        __CLR4_1_25v5vl3lqxriu.R.inc(1703);return (array != null && array.length != 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive floats is not empty or not {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final float[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1704);
        __CLR4_1_25v5vl3lqxriu.R.inc(1705);return (array != null && array.length != 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of primitive booleans is not empty or not {@code null}.</p>
     *
     * @param array  the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(final boolean[] array) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1706);
        __CLR4_1_25v5vl3lqxriu.R.inc(1707);return (array != null && array.length != 0);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.</p>
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.</p>
     *
     * <pre>
     * ArrayUtils.addAll(null, null)     = null
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * ArrayUtils.addAll([null], [null]) = [null, null]
     * ArrayUtils.addAll(["a", "b", "c"], ["1", "2", "3"]) = ["a", "b", "c", "1", "2", "3"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array1  the first array whose elements are added to the new array, may be {@code null}
     * @param array2  the second array whose elements are added to the new array, may be {@code null}
     * @return The new array, {@code null} if both arrays are {@code null}.
     *      The type of the new array is the type of the first array,
     *      unless the first array is null, in which case the type is the same as the second array.
     * @since 2.1
     * @throws IllegalArgumentException if the array types are incompatible
     */
    public static <T> T[] addAll(final T[] array1, final T... array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1708);
        __CLR4_1_25v5vl3lqxriu.R.inc(1709);if ((((array1 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1710)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1711)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1712);return clone(array2);
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1713);if ((((array2 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1714)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1715)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1716);return clone(array1);
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1717);final Class<?> type1 = array1.getClass().getComponentType();
        __CLR4_1_25v5vl3lqxriu.R.inc(1718);@SuppressWarnings("unchecked") // OK, because array is of type T
        final
        T[] joinedArray = (T[]) Array.newInstance(type1, array1.length + array2.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1719);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1720);try {
            __CLR4_1_25v5vl3lqxriu.R.inc(1721);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        } catch (final ArrayStoreException ase) {
            // Check if problem was due to incompatible types
            /*
             * We do this here, rather than before the copy because:
             * - it would be a wasted check most of the time
             * - safer, in case check turns out to be too strict
             */
            __CLR4_1_25v5vl3lqxriu.R.inc(1722);final Class<?> type2 = array2.getClass().getComponentType();
            __CLR4_1_25v5vl3lqxriu.R.inc(1723);if ((((!type1.isAssignableFrom(type2))&&(__CLR4_1_25v5vl3lqxriu.R.iget(1724)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1725)==0&false))){{
                __CLR4_1_25v5vl3lqxriu.R.inc(1726);throw new IllegalArgumentException("Cannot store "+type2.getName()+" in an array of "
                        +type1.getName(), ase);
            }
            }__CLR4_1_25v5vl3lqxriu.R.inc(1727);throw ase; // No, so rethrow original
        }
        __CLR4_1_25v5vl3lqxriu.R.inc(1728);return joinedArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.</p>
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.</p>
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new boolean[] array.
     * @since 2.1
     */
    public static boolean[] addAll(final boolean[] array1, final boolean... array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1729);
        __CLR4_1_25v5vl3lqxriu.R.inc(1730);if ((((array1 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1731)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1732)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1733);return clone(array2);
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1734);if ((((array2 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1735)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1736)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1737);return clone(array1);
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1738);final boolean[] joinedArray = new boolean[array1.length + array2.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1739);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1740);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1741);return joinedArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.</p>
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.</p>
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new char[] array.
     * @since 2.1
     */
    public static char[] addAll(final char[] array1, final char... array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1742);
        __CLR4_1_25v5vl3lqxriu.R.inc(1743);if ((((array1 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1744)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1745)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1746);return clone(array2);
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1747);if ((((array2 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1748)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1749)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1750);return clone(array1);
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1751);final char[] joinedArray = new char[array1.length + array2.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1752);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1753);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1754);return joinedArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.</p>
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.</p>
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new byte[] array.
     * @since 2.1
     */
    public static byte[] addAll(final byte[] array1, final byte... array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1755);
        __CLR4_1_25v5vl3lqxriu.R.inc(1756);if ((((array1 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1757)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1758)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1759);return clone(array2);
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1760);if ((((array2 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1761)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1762)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1763);return clone(array1);
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1764);final byte[] joinedArray = new byte[array1.length + array2.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1765);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1766);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1767);return joinedArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.</p>
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.</p>
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new short[] array.
     * @since 2.1
     */
    public static short[] addAll(final short[] array1, final short... array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1768);
        __CLR4_1_25v5vl3lqxriu.R.inc(1769);if ((((array1 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1770)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1771)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1772);return clone(array2);
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1773);if ((((array2 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1774)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1775)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1776);return clone(array1);
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1777);final short[] joinedArray = new short[array1.length + array2.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1778);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1779);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1780);return joinedArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.</p>
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.</p>
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new int[] array.
     * @since 2.1
     */
    public static int[] addAll(final int[] array1, final int... array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1781);
        __CLR4_1_25v5vl3lqxriu.R.inc(1782);if ((((array1 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1783)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1784)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1785);return clone(array2);
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1786);if ((((array2 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1787)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1788)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1789);return clone(array1);
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1790);final int[] joinedArray = new int[array1.length + array2.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1791);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1792);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1793);return joinedArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.</p>
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.</p>
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new long[] array.
     * @since 2.1
     */
    public static long[] addAll(final long[] array1, final long... array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1794);
        __CLR4_1_25v5vl3lqxriu.R.inc(1795);if ((((array1 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1796)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1797)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1798);return clone(array2);
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1799);if ((((array2 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1800)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1801)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1802);return clone(array1);
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1803);final long[] joinedArray = new long[array1.length + array2.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1804);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1805);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1806);return joinedArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.</p>
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.</p>
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new float[] array.
     * @since 2.1
     */
    public static float[] addAll(final float[] array1, final float... array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1807);
        __CLR4_1_25v5vl3lqxriu.R.inc(1808);if ((((array1 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1809)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1810)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1811);return clone(array2);
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1812);if ((((array2 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1813)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1814)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1815);return clone(array1);
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1816);final float[] joinedArray = new float[array1.length + array2.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1817);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1818);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1819);return joinedArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Adds all the elements of the given arrays into a new array.</p>
     * <p>The new array contains all of the element of {@code array1} followed
     * by all of the elements {@code array2}. When an array is returned, it is always
     * a new array.</p>
     *
     * <pre>
     * ArrayUtils.addAll(array1, null)   = cloned copy of array1
     * ArrayUtils.addAll(null, array2)   = cloned copy of array2
     * ArrayUtils.addAll([], [])         = []
     * </pre>
     *
     * @param array1  the first array whose elements are added to the new array.
     * @param array2  the second array whose elements are added to the new array.
     * @return The new double[] array.
     * @since 2.1
     */
    public static double[] addAll(final double[] array1, final double... array2) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1820);
        __CLR4_1_25v5vl3lqxriu.R.inc(1821);if ((((array1 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1822)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1823)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1824);return clone(array2);
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1825);if ((((array2 == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1826)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1827)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1828);return clone(array1);
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1829);final double[] joinedArray = new double[array1.length + array2.length];
        __CLR4_1_25v5vl3lqxriu.R.inc(1830);System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1831);System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(1832);return joinedArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.</p>
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element, unless the element itself is null,
     *  in which case the return type is Object[]</p>
     *
     * <pre>
     * ArrayUtils.add(null, null)      = [null]
     * ArrayUtils.add(null, "a")       = ["a"]
     * ArrayUtils.add(["a"], null)     = ["a", null]
     * ArrayUtils.add(["a"], "b")      = ["a", "b"]
     * ArrayUtils.add(["a", "b"], "c") = ["a", "b", "c"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array to "add" the element to, may be {@code null}
     * @param element  the object to add, may be {@code null}
     * @return A new array containing the existing elements plus the new element
     * The returned array type will be that of the input array (unless null),
     * in which case it will have the same type as the element.
     * If both are null, an IllegalArgumentException is thrown
     * @since 2.1
     * @throws IllegalArgumentException if both arguments are null
     */
    public static <T> T[] add(final T[] array, final T element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1833);
        __CLR4_1_25v5vl3lqxriu.R.inc(1834);Class<?> type;
        __CLR4_1_25v5vl3lqxriu.R.inc(1835);if ((((array != null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1836)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1837)==0&false))){{
            __CLR4_1_25v5vl3lqxriu.R.inc(1838);type = array.getClass();
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1839);if ((((element != null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1840)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1841)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1842);type = element.getClass();
        } }else {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1843);throw new IllegalArgumentException("Arguments cannot both be null");
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1844);@SuppressWarnings("unchecked") // type must be T
        final
        T[] newArray = (T[]) copyArrayGrow1(array, type);
        __CLR4_1_25v5vl3lqxriu.R.inc(1845);newArray[newArray.length - 1] = element;
        __CLR4_1_25v5vl3lqxriu.R.inc(1846);return newArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.</p>
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add(null, true)          = [true]
     * ArrayUtils.add([true], false)       = [true, false]
     * ArrayUtils.add([true, false], true) = [true, false, true]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static boolean[] add(final boolean[] array, final boolean element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1847);
        __CLR4_1_25v5vl3lqxriu.R.inc(1848);final boolean[] newArray = (boolean[])copyArrayGrow1(array, Boolean.TYPE);
        __CLR4_1_25v5vl3lqxriu.R.inc(1849);newArray[newArray.length - 1] = element;
        __CLR4_1_25v5vl3lqxriu.R.inc(1850);return newArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.</p>
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static byte[] add(final byte[] array, final byte element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1851);
        __CLR4_1_25v5vl3lqxriu.R.inc(1852);final byte[] newArray = (byte[])copyArrayGrow1(array, Byte.TYPE);
        __CLR4_1_25v5vl3lqxriu.R.inc(1853);newArray[newArray.length - 1] = element;
        __CLR4_1_25v5vl3lqxriu.R.inc(1854);return newArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.</p>
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add(null, '0')       = ['0']
     * ArrayUtils.add(['1'], '0')      = ['1', '0']
     * ArrayUtils.add(['1', '0'], '1') = ['1', '0', '1']
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static char[] add(final char[] array, final char element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1855);
        __CLR4_1_25v5vl3lqxriu.R.inc(1856);final char[] newArray = (char[])copyArrayGrow1(array, Character.TYPE);
        __CLR4_1_25v5vl3lqxriu.R.inc(1857);newArray[newArray.length - 1] = element;
        __CLR4_1_25v5vl3lqxriu.R.inc(1858);return newArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.</p>
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static double[] add(final double[] array, final double element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1859);
        __CLR4_1_25v5vl3lqxriu.R.inc(1860);final double[] newArray = (double[])copyArrayGrow1(array, Double.TYPE);
        __CLR4_1_25v5vl3lqxriu.R.inc(1861);newArray[newArray.length - 1] = element;
        __CLR4_1_25v5vl3lqxriu.R.inc(1862);return newArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.</p>
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static float[] add(final float[] array, final float element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1863);
        __CLR4_1_25v5vl3lqxriu.R.inc(1864);final float[] newArray = (float[])copyArrayGrow1(array, Float.TYPE);
        __CLR4_1_25v5vl3lqxriu.R.inc(1865);newArray[newArray.length - 1] = element;
        __CLR4_1_25v5vl3lqxriu.R.inc(1866);return newArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.</p>
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static int[] add(final int[] array, final int element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1867);
        __CLR4_1_25v5vl3lqxriu.R.inc(1868);final int[] newArray = (int[])copyArrayGrow1(array, Integer.TYPE);
        __CLR4_1_25v5vl3lqxriu.R.inc(1869);newArray[newArray.length - 1] = element;
        __CLR4_1_25v5vl3lqxriu.R.inc(1870);return newArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.</p>
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static long[] add(final long[] array, final long element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1871);
        __CLR4_1_25v5vl3lqxriu.R.inc(1872);final long[] newArray = (long[])copyArrayGrow1(array, Long.TYPE);
        __CLR4_1_25v5vl3lqxriu.R.inc(1873);newArray[newArray.length - 1] = element;
        __CLR4_1_25v5vl3lqxriu.R.inc(1874);return newArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Copies the given array and adds the given element at the end of the new array.</p>
     *
     * <p>The new array contains the same elements of the input
     * array plus the given element in the last position. The component type of
     * the new array is the same as that of the input array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add(null, 0)   = [0]
     * ArrayUtils.add([1], 0)    = [1, 0]
     * ArrayUtils.add([1, 0], 1) = [1, 0, 1]
     * </pre>
     *
     * @param array  the array to copy and add the element to, may be {@code null}
     * @param element  the object to add at the last index of the new array
     * @return A new array containing the existing elements plus the new element
     * @since 2.1
     */
    public static short[] add(final short[] array, final short element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1875);
        __CLR4_1_25v5vl3lqxriu.R.inc(1876);final short[] newArray = (short[])copyArrayGrow1(array, Short.TYPE);
        __CLR4_1_25v5vl3lqxriu.R.inc(1877);newArray[newArray.length - 1] = element;
        __CLR4_1_25v5vl3lqxriu.R.inc(1878);return newArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * Returns a copy of the given array of size 1 greater than the argument.
     * The last value of the array is left to the default value.
     *
     * @param array The array to copy, must not be {@code null}.
     * @param newArrayComponentType If {@code array} is {@code null}, create a
     * size 1 array of this type.
     * @return A new copy of the array of size 1 greater than the input.
     */
    private static Object copyArrayGrow1(final Object array, final Class<?> newArrayComponentType) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1879);
        __CLR4_1_25v5vl3lqxriu.R.inc(1880);if ((((array != null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1881)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1882)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1883);final int arrayLength = Array.getLength(array);
            __CLR4_1_25v5vl3lqxriu.R.inc(1884);final Object newArray = Array.newInstance(array.getClass().getComponentType(), arrayLength + 1);
            __CLR4_1_25v5vl3lqxriu.R.inc(1885);System.arraycopy(array, 0, newArray, 0, arrayLength);
            __CLR4_1_25v5vl3lqxriu.R.inc(1886);return newArray;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1887);return Array.newInstance(newArrayComponentType, 1);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add(null, 0, null)      = [null]
     * ArrayUtils.add(null, 0, "a")       = ["a"]
     * ArrayUtils.add(["a"], 1, null)     = ["a", null]
     * ArrayUtils.add(["a"], 1, "b")      = ["a", "b"]
     * ArrayUtils.add(["a", "b"], 3, "c") = ["a", "b", "c"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index > array.length).
     * @throws IllegalArgumentException if both array and element are null
     */
    public static <T> T[] add(final T[] array, final int index, final T element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1888);
        __CLR4_1_25v5vl3lqxriu.R.inc(1889);Class<?> clss = null;
        __CLR4_1_25v5vl3lqxriu.R.inc(1890);if ((((array != null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1891)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1892)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1893);clss = array.getClass().getComponentType();
        } }else {__CLR4_1_25v5vl3lqxriu.R.inc(1894);if ((((element != null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1895)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1896)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1897);clss = element.getClass();
        } }else {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1898);throw new IllegalArgumentException("Array and element cannot both be null");
        }
        }}__CLR4_1_25v5vl3lqxriu.R.inc(1899);@SuppressWarnings("unchecked") // the add method creates an array of type clss, which is type T
        final T[] newArray = (T[]) add(array, index, element, clss);
        __CLR4_1_25v5vl3lqxriu.R.inc(1900);return newArray;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add(null, 0, true)          = [true]
     * ArrayUtils.add([true], 0, false)       = [false, true]
     * ArrayUtils.add([false], 1, true)       = [false, true]
     * ArrayUtils.add([true, false], 1, true) = [true, true, false]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index > array.length).
     */
    public static boolean[] add(final boolean[] array, final int index, final boolean element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1901);
        __CLR4_1_25v5vl3lqxriu.R.inc(1902);return (boolean[]) add(array, index, Boolean.valueOf(element), Boolean.TYPE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add(null, 0, 'a')            = ['a']
     * ArrayUtils.add(['a'], 0, 'b')           = ['b', 'a']
     * ArrayUtils.add(['a', 'b'], 0, 'c')      = ['c', 'a', 'b']
     * ArrayUtils.add(['a', 'b'], 1, 'k')      = ['a', 'k', 'b']
     * ArrayUtils.add(['a', 'b', 'c'], 1, 't') = ['a', 't', 'b', 'c']
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index > array.length).
     */
    public static char[] add(final char[] array, final int index, final char element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1903);
        __CLR4_1_25v5vl3lqxriu.R.inc(1904);return (char[]) add(array, index, Character.valueOf(element), Character.TYPE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add([1], 0, 2)         = [2, 1]
     * ArrayUtils.add([2, 6], 2, 3)      = [2, 6, 3]
     * ArrayUtils.add([2, 6], 0, 1)      = [1, 2, 6]
     * ArrayUtils.add([2, 6, 3], 2, 1)   = [2, 6, 1, 3]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index > array.length).
     */
    public static byte[] add(final byte[] array, final int index, final byte element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1905);
        __CLR4_1_25v5vl3lqxriu.R.inc(1906);return (byte[]) add(array, index, Byte.valueOf(element), Byte.TYPE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add([1], 0, 2)         = [2, 1]
     * ArrayUtils.add([2, 6], 2, 10)     = [2, 6, 10]
     * ArrayUtils.add([2, 6], 0, -4)     = [-4, 2, 6]
     * ArrayUtils.add([2, 6, 3], 2, 1)   = [2, 6, 1, 3]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index > array.length).
     */
    public static short[] add(final short[] array, final int index, final short element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1907);
        __CLR4_1_25v5vl3lqxriu.R.inc(1908);return (short[]) add(array, index, Short.valueOf(element), Short.TYPE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add([1], 0, 2)         = [2, 1]
     * ArrayUtils.add([2, 6], 2, 10)     = [2, 6, 10]
     * ArrayUtils.add([2, 6], 0, -4)     = [-4, 2, 6]
     * ArrayUtils.add([2, 6, 3], 2, 1)   = [2, 6, 1, 3]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index > array.length).
     */
    public static int[] add(final int[] array, final int index, final int element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1909);
        __CLR4_1_25v5vl3lqxriu.R.inc(1910);return (int[]) add(array, index, Integer.valueOf(element), Integer.TYPE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add([1L], 0, 2L)           = [2L, 1L]
     * ArrayUtils.add([2L, 6L], 2, 10L)      = [2L, 6L, 10L]
     * ArrayUtils.add([2L, 6L], 0, -4L)      = [-4L, 2L, 6L]
     * ArrayUtils.add([2L, 6L, 3L], 2, 1L)   = [2L, 6L, 1L, 3L]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index > array.length).
     */
    public static long[] add(final long[] array, final int index, final long element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1911);
        __CLR4_1_25v5vl3lqxriu.R.inc(1912);return (long[]) add(array, index, Long.valueOf(element), Long.TYPE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add([1.1f], 0, 2.2f)               = [2.2f, 1.1f]
     * ArrayUtils.add([2.3f, 6.4f], 2, 10.5f)        = [2.3f, 6.4f, 10.5f]
     * ArrayUtils.add([2.6f, 6.7f], 0, -4.8f)        = [-4.8f, 2.6f, 6.7f]
     * ArrayUtils.add([2.9f, 6.0f, 0.3f], 2, 1.0f)   = [2.9f, 6.0f, 1.0f, 0.3f]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index > array.length).
     */
    public static float[] add(final float[] array, final int index, final float element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1913);
        __CLR4_1_25v5vl3lqxriu.R.inc(1914);return (float[]) add(array, index, Float.valueOf(element), Float.TYPE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Inserts the specified element at the specified position in the array.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array plus the given element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, a new one element array is returned
     *  whose component type is the same as the element.</p>
     *
     * <pre>
     * ArrayUtils.add([1.1], 0, 2.2)              = [2.2, 1.1]
     * ArrayUtils.add([2.3, 6.4], 2, 10.5)        = [2.3, 6.4, 10.5]
     * ArrayUtils.add([2.6, 6.7], 0, -4.8)        = [-4.8, 2.6, 6.7]
     * ArrayUtils.add([2.9, 6.0, 0.3], 2, 1.0)    = [2.9, 6.0, 1.0, 0.3]
     * </pre>
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @return A new array containing the existing elements and the new element
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index > array.length).
     */
    public static double[] add(final double[] array, final int index, final double element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1915);
        __CLR4_1_25v5vl3lqxriu.R.inc(1916);return (double[]) add(array, index, Double.valueOf(element), Double.TYPE);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * Underlying implementation of add(array, index, element) methods.
     * The last parameter is the class, which may not equal element.getClass
     * for primitives.
     *
     * @param array  the array to add the element to, may be {@code null}
     * @param index  the position of the new object
     * @param element  the object to add
     * @param clss the type of the element being added
     * @return A new array containing the existing elements and the new element
     */
    private static Object add(final Object array, final int index, final Object element, final Class<?> clss) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1917);
        __CLR4_1_25v5vl3lqxriu.R.inc(1918);if ((((array == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1919)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1920)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1921);if ((((index != 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1922)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1923)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(1924);throw new IndexOutOfBoundsException("Index: " + index + ", Length: 0");
            }
            }__CLR4_1_25v5vl3lqxriu.R.inc(1925);final Object joinedArray = Array.newInstance(clss, 1);
            __CLR4_1_25v5vl3lqxriu.R.inc(1926);Array.set(joinedArray, 0, element);
            __CLR4_1_25v5vl3lqxriu.R.inc(1927);return joinedArray;
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1928);final int length = Array.getLength(array);
        __CLR4_1_25v5vl3lqxriu.R.inc(1929);if ((((index > length || index < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1930)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1931)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1932);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1933);final Object result = Array.newInstance(clss, length + 1);
        __CLR4_1_25v5vl3lqxriu.R.inc(1934);System.arraycopy(array, 0, result, 0, index);
        __CLR4_1_25v5vl3lqxriu.R.inc(1935);Array.set(result, index, element);
        __CLR4_1_25v5vl3lqxriu.R.inc(1936);if ((((index < length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1937)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1938)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1939);System.arraycopy(array, index, result, index + 1, length - index);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1940);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.remove(["a"], 0)           = []
     * ArrayUtils.remove(["a", "b"], 0)      = ["b"]
     * ArrayUtils.remove(["a", "b"], 1)      = ["a"]
     * ArrayUtils.remove(["a", "b", "c"], 1) = ["a", "c"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    @SuppressWarnings("unchecked") // remove() always creates an array of the same type as its input
    public static <T> T[] remove(final T[] array, final int index) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1941);
        __CLR4_1_25v5vl3lqxriu.R.inc(1942);return (T[]) remove((Object) array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <pre>
     * ArrayUtils.removeElement(null, "a")            = null
     * ArrayUtils.removeElement([], "a")              = []
     * ArrayUtils.removeElement(["a"], "b")           = ["a"]
     * ArrayUtils.removeElement(["a", "b"], "a")      = ["b"]
     * ArrayUtils.removeElement(["a", "b", "a"], "a") = ["b", "a"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static <T> T[] removeElement(final T[] array, final Object element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1943);
        __CLR4_1_25v5vl3lqxriu.R.inc(1944);final int index = indexOf(array, element);
        __CLR4_1_25v5vl3lqxriu.R.inc(1945);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1946)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1947)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1948);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1949);return remove(array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.remove([true], 0)              = []
     * ArrayUtils.remove([true, false], 0)       = [false]
     * ArrayUtils.remove([true, false], 1)       = [true]
     * ArrayUtils.remove([true, true, false], 1) = [true, false]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static boolean[] remove(final boolean[] array, final int index) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1950);
        __CLR4_1_25v5vl3lqxriu.R.inc(1951);return (boolean[]) remove((Object) array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <pre>
     * ArrayUtils.removeElement(null, true)                = null
     * ArrayUtils.removeElement([], true)                  = []
     * ArrayUtils.removeElement([true], false)             = [true]
     * ArrayUtils.removeElement([true, false], false)      = [true]
     * ArrayUtils.removeElement([true, false, true], true) = [false, true]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static boolean[] removeElement(final boolean[] array, final boolean element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1952);
        __CLR4_1_25v5vl3lqxriu.R.inc(1953);final int index = indexOf(array, element);
        __CLR4_1_25v5vl3lqxriu.R.inc(1954);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1955)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1956)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1957);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1958);return remove(array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.remove([1], 0)          = []
     * ArrayUtils.remove([1, 0], 0)       = [0]
     * ArrayUtils.remove([1, 0], 1)       = [1]
     * ArrayUtils.remove([1, 0, 1], 1)    = [1, 1]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static byte[] remove(final byte[] array, final int index) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1959);
        __CLR4_1_25v5vl3lqxriu.R.inc(1960);return (byte[]) remove((Object) array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1)        = null
     * ArrayUtils.removeElement([], 1)          = []
     * ArrayUtils.removeElement([1], 0)         = [1]
     * ArrayUtils.removeElement([1, 0], 0)      = [1]
     * ArrayUtils.removeElement([1, 0, 1], 1)   = [0, 1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static byte[] removeElement(final byte[] array, final byte element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1961);
        __CLR4_1_25v5vl3lqxriu.R.inc(1962);final int index = indexOf(array, element);
        __CLR4_1_25v5vl3lqxriu.R.inc(1963);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1964)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1965)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1966);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1967);return remove(array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.remove(['a'], 0)           = []
     * ArrayUtils.remove(['a', 'b'], 0)      = ['b']
     * ArrayUtils.remove(['a', 'b'], 1)      = ['a']
     * ArrayUtils.remove(['a', 'b', 'c'], 1) = ['a', 'c']
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static char[] remove(final char[] array, final int index) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1968);
        __CLR4_1_25v5vl3lqxriu.R.inc(1969);return (char[]) remove((Object) array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <pre>
     * ArrayUtils.removeElement(null, 'a')            = null
     * ArrayUtils.removeElement([], 'a')              = []
     * ArrayUtils.removeElement(['a'], 'b')           = ['a']
     * ArrayUtils.removeElement(['a', 'b'], 'a')      = ['b']
     * ArrayUtils.removeElement(['a', 'b', 'a'], 'a') = ['b', 'a']
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static char[] removeElement(final char[] array, final char element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1970);
        __CLR4_1_25v5vl3lqxriu.R.inc(1971);final int index = indexOf(array, element);
        __CLR4_1_25v5vl3lqxriu.R.inc(1972);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1973)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1974)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1975);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1976);return remove(array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.remove([1.1], 0)           = []
     * ArrayUtils.remove([2.5, 6.0], 0)      = [6.0]
     * ArrayUtils.remove([2.5, 6.0], 1)      = [2.5]
     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) = [2.5, 3.8]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static double[] remove(final double[] array, final int index) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1977);
        __CLR4_1_25v5vl3lqxriu.R.inc(1978);return (double[]) remove((Object) array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1.1)            = null
     * ArrayUtils.removeElement([], 1.1)              = []
     * ArrayUtils.removeElement([1.1], 1.2)           = [1.1]
     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      = [2.3]
     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) = [2.3, 1.1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static double[] removeElement(final double[] array, final double element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1979);
        __CLR4_1_25v5vl3lqxriu.R.inc(1980);final int index = indexOf(array, element);
        __CLR4_1_25v5vl3lqxriu.R.inc(1981);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1982)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1983)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1984);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1985);return remove(array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.remove([1.1], 0)           = []
     * ArrayUtils.remove([2.5, 6.0], 0)      = [6.0]
     * ArrayUtils.remove([2.5, 6.0], 1)      = [2.5]
     * ArrayUtils.remove([2.5, 6.0, 3.8], 1) = [2.5, 3.8]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static float[] remove(final float[] array, final int index) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1986);
        __CLR4_1_25v5vl3lqxriu.R.inc(1987);return (float[]) remove((Object) array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1.1)            = null
     * ArrayUtils.removeElement([], 1.1)              = []
     * ArrayUtils.removeElement([1.1], 1.2)           = [1.1]
     * ArrayUtils.removeElement([1.1, 2.3], 1.1)      = [2.3]
     * ArrayUtils.removeElement([1.1, 2.3, 1.1], 1.1) = [2.3, 1.1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static float[] removeElement(final float[] array, final float element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1988);
        __CLR4_1_25v5vl3lqxriu.R.inc(1989);final int index = indexOf(array, element);
        __CLR4_1_25v5vl3lqxriu.R.inc(1990);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_1_25v5vl3lqxriu.R.iget(1991)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(1992)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(1993);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(1994);return remove(array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.remove([1], 0)         = []
     * ArrayUtils.remove([2, 6], 0)      = [6]
     * ArrayUtils.remove([2, 6], 1)      = [2]
     * ArrayUtils.remove([2, 6, 3], 1)   = [2, 3]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static int[] remove(final int[] array, final int index) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1995);
        __CLR4_1_25v5vl3lqxriu.R.inc(1996);return (int[]) remove((Object) array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1)      = null
     * ArrayUtils.removeElement([], 1)        = []
     * ArrayUtils.removeElement([1], 2)       = [1]
     * ArrayUtils.removeElement([1, 3], 1)    = [3]
     * ArrayUtils.removeElement([1, 3, 1], 1) = [3, 1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static int[] removeElement(final int[] array, final int element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(1997);
        __CLR4_1_25v5vl3lqxriu.R.inc(1998);final int index = indexOf(array, element);
        __CLR4_1_25v5vl3lqxriu.R.inc(1999);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2000)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2001)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2002);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2003);return remove(array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.remove([1], 0)         = []
     * ArrayUtils.remove([2, 6], 0)      = [6]
     * ArrayUtils.remove([2, 6], 1)      = [2]
     * ArrayUtils.remove([2, 6, 3], 1)   = [2, 3]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static long[] remove(final long[] array, final int index) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2004);
        __CLR4_1_25v5vl3lqxriu.R.inc(2005);return (long[]) remove((Object) array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1)      = null
     * ArrayUtils.removeElement([], 1)        = []
     * ArrayUtils.removeElement([1], 2)       = [1]
     * ArrayUtils.removeElement([1, 3], 1)    = [3]
     * ArrayUtils.removeElement([1, 3, 1], 1) = [3, 1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static long[] removeElement(final long[] array, final long element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2006);
        __CLR4_1_25v5vl3lqxriu.R.inc(2007);final int index = indexOf(array, element);
        __CLR4_1_25v5vl3lqxriu.R.inc(2008);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2009)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2010)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2011);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2012);return remove(array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.remove([1], 0)         = []
     * ArrayUtils.remove([2, 6], 0)      = [6]
     * ArrayUtils.remove([2, 6], 1)      = [2]
     * ArrayUtils.remove([2, 6, 3], 1)   = [2, 3]
     * </pre>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    public static short[] remove(final short[] array, final int index) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2013);
        __CLR4_1_25v5vl3lqxriu.R.inc(2014);return (short[]) remove((Object) array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the first occurrence of the specified element from the
     * specified array. All subsequent elements are shifted to the left
     * (subtracts one from their indices). If the array doesn't contains
     * such an element, no elements are removed from the array.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the first occurrence of the specified element. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <pre>
     * ArrayUtils.removeElement(null, 1)      = null
     * ArrayUtils.removeElement([], 1)        = []
     * ArrayUtils.removeElement([1], 2)       = [1]
     * ArrayUtils.removeElement([1, 3], 1)    = [3]
     * ArrayUtils.removeElement([1, 3, 1], 1) = [3, 1]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param element  the element to be removed
     * @return A new array containing the existing elements except the first
     *         occurrence of the specified element.
     * @since 2.1
     */
    public static short[] removeElement(final short[] array, final short element) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2015);
        __CLR4_1_25v5vl3lqxriu.R.inc(2016);final int index = indexOf(array, element);
        __CLR4_1_25v5vl3lqxriu.R.inc(2017);if ((((index == INDEX_NOT_FOUND)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2018)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2019)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2020);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2021);return remove(array, index);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the element at the specified position from the specified array.
     * All subsequent elements are shifted to the left (subtracts one from
     * their indices).</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except the element on the specified position. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * @param array  the array to remove the element from, may not be {@code null}
     * @param index  the position of the element to be removed
     * @return A new array containing the existing elements except the element
     *         at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 2.1
     */
    private static Object remove(final Object array, final int index) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2022);
        __CLR4_1_25v5vl3lqxriu.R.inc(2023);final int length = getLength(array);
        __CLR4_1_25v5vl3lqxriu.R.inc(2024);if ((((index < 0 || index >= length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2025)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2026)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2027);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
        }

        }__CLR4_1_25v5vl3lqxriu.R.inc(2028);final Object result = Array.newInstance(array.getClass().getComponentType(), length - 1);
        __CLR4_1_25v5vl3lqxriu.R.inc(2029);System.arraycopy(array, 0, result, 0, index);
        __CLR4_1_25v5vl3lqxriu.R.inc(2030);if ((((index < length - 1)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2031)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2032)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2033);System.arraycopy(array, index + 1, result, index, length - index - 1);
        }

        }__CLR4_1_25v5vl3lqxriu.R.inc(2034);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.removeAll(["a", "b", "c"], 0, 2) = ["b"]
     * ArrayUtils.removeAll(["a", "b", "c"], 1, 2) = ["a"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    @SuppressWarnings("unchecked") // removeAll() always creates an array of the same type as its input
    public static <T> T[] removeAll(final T[] array, final int... indices) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2035);
        __CLR4_1_25v5vl3lqxriu.R.inc(2036);return (T[]) removeAll((Object) array, clone(indices));
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.</p>
     *
     * <pre>
     * ArrayUtils.removeElements(null, "a", "b")            = null
     * ArrayUtils.removeElements([], "a", "b")              = []
     * ArrayUtils.removeElements(["a"], "b", "c")           = ["a"]
     * ArrayUtils.removeElements(["a", "b"], "a", "c")      = ["b"]
     * ArrayUtils.removeElements(["a", "b", "a"], "a")      = ["b", "a"]
     * ArrayUtils.removeElements(["a", "b", "a"], "a", "a") = ["b"]
     * </pre>
     *
     * @param <T> the component type of the array
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static <T> T[] removeElements(final T[] array, final T... values) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2037);
        __CLR4_1_25v5vl3lqxriu.R.inc(2038);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_1_25v5vl3lqxriu.R.iget(2039)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2040)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2041);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2042);final HashMap<T, MutableInt> occurrences = new HashMap<T, MutableInt>(values.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(2043);for (final T v : values) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2044);final MutableInt count = occurrences.get(v);
            __CLR4_1_25v5vl3lqxriu.R.inc(2045);if ((((count == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2046)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2047)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2048);occurrences.put(v, new MutableInt(1));
            } }else {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2049);count.increment();
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2050);final BitSet toRemove = new BitSet();
        __CLR4_1_25v5vl3lqxriu.R.inc(2051);for (final Map.Entry<T, MutableInt> e : occurrences.entrySet()) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2052);final T v = e.getKey();
            __CLR4_1_25v5vl3lqxriu.R.inc(2053);int found = 0;
            __CLR4_1_25v5vl3lqxriu.R.inc(2054);for (int i = 0, ct = e.getValue().intValue(); (((i < ct)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2055)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2056)==0&false)); i++) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2057);found = indexOf(array, v, found);
                __CLR4_1_25v5vl3lqxriu.R.inc(2058);if ((((found < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2059)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2060)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(2061);break;
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2062);toRemove.set(found++);
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2063);@SuppressWarnings("unchecked") // removeAll() always creates an array of the same type as its input
        final
        T[] result = (T[]) removeAll(array, toRemove);
        __CLR4_1_25v5vl3lqxriu.R.inc(2064);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static byte[] removeAll(final byte[] array, final int... indices) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2065);
        __CLR4_1_25v5vl3lqxriu.R.inc(2066);return (byte[]) removeAll((Object) array, clone(indices));
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.</p>
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static byte[] removeElements(final byte[] array, final byte... values) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2067);
        __CLR4_1_25v5vl3lqxriu.R.inc(2068);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_1_25v5vl3lqxriu.R.iget(2069)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2070)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2071);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2072);final HashMap<Byte, MutableInt> occurrences = new HashMap<Byte, MutableInt>(values.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(2073);for (final byte v : values) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2074);final Byte boxed = Byte.valueOf(v);
            __CLR4_1_25v5vl3lqxriu.R.inc(2075);final MutableInt count = occurrences.get(boxed);
            __CLR4_1_25v5vl3lqxriu.R.inc(2076);if ((((count == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2077)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2078)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2079);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2080);count.increment();
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2081);final BitSet toRemove = new BitSet();
        __CLR4_1_25v5vl3lqxriu.R.inc(2082);for (final Map.Entry<Byte, MutableInt> e : occurrences.entrySet()) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2083);final Byte v = e.getKey();
            __CLR4_1_25v5vl3lqxriu.R.inc(2084);int found = 0;
            __CLR4_1_25v5vl3lqxriu.R.inc(2085);for (int i = 0, ct = e.getValue().intValue(); (((i < ct)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2086)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2087)==0&false)); i++) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2088);found = indexOf(array, v.byteValue(), found);
                __CLR4_1_25v5vl3lqxriu.R.inc(2089);if ((((found < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2090)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2091)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(2092);break;
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2093);toRemove.set(found++);
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2094);return (byte[]) removeAll(array, toRemove);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static short[] removeAll(final short[] array, final int... indices) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2095);
        __CLR4_1_25v5vl3lqxriu.R.inc(2096);return (short[]) removeAll((Object) array, clone(indices));
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.</p>
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static short[] removeElements(final short[] array, final short... values) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2097);
        __CLR4_1_25v5vl3lqxriu.R.inc(2098);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_1_25v5vl3lqxriu.R.iget(2099)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2100)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2101);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2102);final HashMap<Short, MutableInt> occurrences = new HashMap<Short, MutableInt>(values.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(2103);for (final short v : values) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2104);final Short boxed = Short.valueOf(v);
            __CLR4_1_25v5vl3lqxriu.R.inc(2105);final MutableInt count = occurrences.get(boxed);
            __CLR4_1_25v5vl3lqxriu.R.inc(2106);if ((((count == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2107)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2108)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2109);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2110);count.increment();
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2111);final BitSet toRemove = new BitSet();
        __CLR4_1_25v5vl3lqxriu.R.inc(2112);for (final Map.Entry<Short, MutableInt> e : occurrences.entrySet()) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2113);final Short v = e.getKey();
            __CLR4_1_25v5vl3lqxriu.R.inc(2114);int found = 0;
            __CLR4_1_25v5vl3lqxriu.R.inc(2115);for (int i = 0, ct = e.getValue().intValue(); (((i < ct)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2116)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2117)==0&false)); i++) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2118);found = indexOf(array, v.shortValue(), found);
                __CLR4_1_25v5vl3lqxriu.R.inc(2119);if ((((found < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2120)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2121)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(2122);break;
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2123);toRemove.set(found++);
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2124);return (short[]) removeAll(array, toRemove);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static int[] removeAll(final int[] array, final int... indices) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2125);
        __CLR4_1_25v5vl3lqxriu.R.inc(2126);return (int[]) removeAll((Object) array, clone(indices));
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.</p>
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static int[] removeElements(final int[] array, final int... values) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2127);
        __CLR4_1_25v5vl3lqxriu.R.inc(2128);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_1_25v5vl3lqxriu.R.iget(2129)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2130)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2131);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2132);final HashMap<Integer, MutableInt> occurrences = new HashMap<Integer, MutableInt>(values.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(2133);for (final int v : values) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2134);final Integer boxed = Integer.valueOf(v);
            __CLR4_1_25v5vl3lqxriu.R.inc(2135);final MutableInt count = occurrences.get(boxed);
            __CLR4_1_25v5vl3lqxriu.R.inc(2136);if ((((count == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2137)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2138)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2139);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2140);count.increment();
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2141);final BitSet toRemove = new BitSet();
        __CLR4_1_25v5vl3lqxriu.R.inc(2142);for (final Map.Entry<Integer, MutableInt> e : occurrences.entrySet()) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2143);final Integer v = e.getKey();
            __CLR4_1_25v5vl3lqxriu.R.inc(2144);int found = 0;
            __CLR4_1_25v5vl3lqxriu.R.inc(2145);for (int i = 0, ct = e.getValue().intValue(); (((i < ct)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2146)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2147)==0&false)); i++) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2148);found = indexOf(array, v.intValue(), found);
                __CLR4_1_25v5vl3lqxriu.R.inc(2149);if ((((found < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2150)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2151)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(2152);break;
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2153);toRemove.set(found++);
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2154);return (int[]) removeAll(array, toRemove);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static char[] removeAll(final char[] array, final int... indices) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2155);
        __CLR4_1_25v5vl3lqxriu.R.inc(2156);return (char[]) removeAll((Object) array, clone(indices));
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.</p>
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static char[] removeElements(final char[] array, final char... values) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2157);
        __CLR4_1_25v5vl3lqxriu.R.inc(2158);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_1_25v5vl3lqxriu.R.iget(2159)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2160)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2161);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2162);final HashMap<Character, MutableInt> occurrences = new HashMap<Character, MutableInt>(values.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(2163);for (final char v : values) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2164);final Character boxed = Character.valueOf(v);
            __CLR4_1_25v5vl3lqxriu.R.inc(2165);final MutableInt count = occurrences.get(boxed);
            __CLR4_1_25v5vl3lqxriu.R.inc(2166);if ((((count == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2167)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2168)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2169);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2170);count.increment();
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2171);final BitSet toRemove = new BitSet();
        __CLR4_1_25v5vl3lqxriu.R.inc(2172);for (final Map.Entry<Character, MutableInt> e : occurrences.entrySet()) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2173);final Character v = e.getKey();
            __CLR4_1_25v5vl3lqxriu.R.inc(2174);int found = 0;
            __CLR4_1_25v5vl3lqxriu.R.inc(2175);for (int i = 0, ct = e.getValue().intValue(); (((i < ct)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2176)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2177)==0&false)); i++) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2178);found = indexOf(array, v.charValue(), found);
                __CLR4_1_25v5vl3lqxriu.R.inc(2179);if ((((found < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2180)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2181)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(2182);break;
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2183);toRemove.set(found++);
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2184);return (char[]) removeAll(array, toRemove);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static long[] removeAll(final long[] array, final int... indices) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2185);
        __CLR4_1_25v5vl3lqxriu.R.inc(2186);return (long[]) removeAll((Object) array, clone(indices));
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.</p>
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static long[] removeElements(final long[] array, final long... values) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2187);
        __CLR4_1_25v5vl3lqxriu.R.inc(2188);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_1_25v5vl3lqxriu.R.iget(2189)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2190)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2191);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2192);final HashMap<Long, MutableInt> occurrences = new HashMap<Long, MutableInt>(values.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(2193);for (final long v : values) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2194);final Long boxed = Long.valueOf(v);
            __CLR4_1_25v5vl3lqxriu.R.inc(2195);final MutableInt count = occurrences.get(boxed);
            __CLR4_1_25v5vl3lqxriu.R.inc(2196);if ((((count == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2197)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2198)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2199);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2200);count.increment();
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2201);final BitSet toRemove = new BitSet();
        __CLR4_1_25v5vl3lqxriu.R.inc(2202);for (final Map.Entry<Long, MutableInt> e : occurrences.entrySet()) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2203);final Long v = e.getKey();
            __CLR4_1_25v5vl3lqxriu.R.inc(2204);int found = 0;
            __CLR4_1_25v5vl3lqxriu.R.inc(2205);for (int i = 0, ct = e.getValue().intValue(); (((i < ct)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2206)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2207)==0&false)); i++) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2208);found = indexOf(array, v.longValue(), found);
                __CLR4_1_25v5vl3lqxriu.R.inc(2209);if ((((found < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2210)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2211)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(2212);break;
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2213);toRemove.set(found++);
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2214);return (long[]) removeAll(array, toRemove);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static float[] removeAll(final float[] array, final int... indices) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2215);
        __CLR4_1_25v5vl3lqxriu.R.inc(2216);return (float[]) removeAll((Object) array, clone(indices));
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.</p>
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static float[] removeElements(final float[] array, final float... values) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2217);
        __CLR4_1_25v5vl3lqxriu.R.inc(2218);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_1_25v5vl3lqxriu.R.iget(2219)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2220)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2221);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2222);final HashMap<Float, MutableInt> occurrences = new HashMap<Float, MutableInt>(values.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(2223);for (final float v : values) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2224);final Float boxed = Float.valueOf(v);
            __CLR4_1_25v5vl3lqxriu.R.inc(2225);final MutableInt count = occurrences.get(boxed);
            __CLR4_1_25v5vl3lqxriu.R.inc(2226);if ((((count == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2227)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2228)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2229);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2230);count.increment();
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2231);final BitSet toRemove = new BitSet();
        __CLR4_1_25v5vl3lqxriu.R.inc(2232);for (final Map.Entry<Float, MutableInt> e : occurrences.entrySet()) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2233);final Float v = e.getKey();
            __CLR4_1_25v5vl3lqxriu.R.inc(2234);int found = 0;
            __CLR4_1_25v5vl3lqxriu.R.inc(2235);for (int i = 0, ct = e.getValue().intValue(); (((i < ct)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2236)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2237)==0&false)); i++) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2238);found = indexOf(array, v.floatValue(), found);
                __CLR4_1_25v5vl3lqxriu.R.inc(2239);if ((((found < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2240)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2241)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(2242);break;
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2243);toRemove.set(found++);
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2244);return (float[]) removeAll(array, toRemove);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.removeAll([1], 0)             = []
     * ArrayUtils.removeAll([2, 6], 0)          = [6]
     * ArrayUtils.removeAll([2, 6], 0, 1)       = []
     * ArrayUtils.removeAll([2, 6, 3], 1, 2)    = [2]
     * ArrayUtils.removeAll([2, 6, 3], 0, 2)    = [6]
     * ArrayUtils.removeAll([2, 6, 3], 0, 1, 2) = []
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static double[] removeAll(final double[] array, final int... indices) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2245);
        __CLR4_1_25v5vl3lqxriu.R.inc(2246);return (double[]) removeAll((Object) array, clone(indices));
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.</p>
     *
     * <pre>
     * ArrayUtils.removeElements(null, 1, 2)      = null
     * ArrayUtils.removeElements([], 1, 2)        = []
     * ArrayUtils.removeElements([1], 2, 3)       = [1]
     * ArrayUtils.removeElements([1, 3], 1, 2)    = [3]
     * ArrayUtils.removeElements([1, 3, 1], 1)    = [3, 1]
     * ArrayUtils.removeElements([1, 3, 1], 1, 1) = [3]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static double[] removeElements(final double[] array, final double... values) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2247);
        __CLR4_1_25v5vl3lqxriu.R.inc(2248);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_1_25v5vl3lqxriu.R.iget(2249)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2250)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2251);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2252);final HashMap<Double, MutableInt> occurrences = new HashMap<Double, MutableInt>(values.length);
        __CLR4_1_25v5vl3lqxriu.R.inc(2253);for (final double v : values) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2254);final Double boxed = Double.valueOf(v);
            __CLR4_1_25v5vl3lqxriu.R.inc(2255);final MutableInt count = occurrences.get(boxed);
            __CLR4_1_25v5vl3lqxriu.R.inc(2256);if ((((count == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2257)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2258)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2259);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2260);count.increment();
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2261);final BitSet toRemove = new BitSet();
        __CLR4_1_25v5vl3lqxriu.R.inc(2262);for (final Map.Entry<Double, MutableInt> e : occurrences.entrySet()) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2263);final Double v = e.getKey();
            __CLR4_1_25v5vl3lqxriu.R.inc(2264);int found = 0;
            __CLR4_1_25v5vl3lqxriu.R.inc(2265);for (int i = 0, ct = e.getValue().intValue(); (((i < ct)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2266)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2267)==0&false)); i++) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2268);found = indexOf(array, v.doubleValue(), found);
                __CLR4_1_25v5vl3lqxriu.R.inc(2269);if ((((found < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2270)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2271)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(2272);break;
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2273);toRemove.set(found++);
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2274);return (double[]) removeAll(array, toRemove);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes the elements at the specified positions from the specified array.
     * All remaining elements are shifted to the left.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except those at the specified positions. The component
     * type of the returned array is always the same as that of the input
     * array.</p>
     *
     * <p>If the input array is {@code null}, an IndexOutOfBoundsException
     * will be thrown, because in that case no valid index can be specified.</p>
     *
     * <pre>
     * ArrayUtils.removeAll([true, false, true], 0, 2) = [false]
     * ArrayUtils.removeAll([true, false, true], 1, 2) = [true]
     * </pre>
     *
     * @param array   the array to remove the element from, may not be {@code null}
     * @param indices the positions of the elements to be removed
     * @return A new array containing the existing elements except those
     *         at the specified positions.
     * @throws IndexOutOfBoundsException if any index is out of range
     * (index < 0 || index >= array.length), or if the array is {@code null}.
     * @since 3.0.1
     */
    public static boolean[] removeAll(final boolean[] array, final int... indices) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2275);
        __CLR4_1_25v5vl3lqxriu.R.inc(2276);return (boolean[]) removeAll((Object) array, clone(indices));
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * <p>Removes occurrences of specified elements, in specified quantities,
     * from the specified array. All subsequent elements are shifted left.
     * For any element-to-be-removed specified in greater quantities than
     * contained in the original array, no change occurs beyond the
     * removal of the existing matching items.</p>
     *
     * <p>This method returns a new array with the same elements of the input
     * array except for the earliest-encountered occurrences of the specified
     * elements. The component type of the returned array is always the same
     * as that of the input array.</p>
     *
     * <pre>
     * ArrayUtils.removeElements(null, true, false)               = null
     * ArrayUtils.removeElements([], true, false)                 = []
     * ArrayUtils.removeElements([true], false, false)            = [true]
     * ArrayUtils.removeElements([true, false], true, true)       = [false]
     * ArrayUtils.removeElements([true, false, true], true)       = [false, true]
     * ArrayUtils.removeElements([true, false, true], true, true) = [false]
     * </pre>
     *
     * @param array  the array to remove the element from, may be {@code null}
     * @param values the elements to be removed
     * @return A new array containing the existing elements except the
     *         earliest-encountered occurrences of the specified elements.
     * @since 3.0.1
     */
    public static boolean[] removeElements(final boolean[] array, final boolean... values) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2277);
        __CLR4_1_25v5vl3lqxriu.R.inc(2278);if ((((isEmpty(array) || isEmpty(values))&&(__CLR4_1_25v5vl3lqxriu.R.iget(2279)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2280)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2281);return clone(array);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2282);final HashMap<Boolean, MutableInt> occurrences = new HashMap<Boolean, MutableInt>(2); // only two possible values here
        __CLR4_1_25v5vl3lqxriu.R.inc(2283);for (final boolean v : values) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2284);final Boolean boxed = Boolean.valueOf(v);
            __CLR4_1_25v5vl3lqxriu.R.inc(2285);final MutableInt count = occurrences.get(boxed);
            __CLR4_1_25v5vl3lqxriu.R.inc(2286);if ((((count == null)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2287)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2288)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2289);occurrences.put(boxed, new MutableInt(1));
            } }else {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2290);count.increment();
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2291);final BitSet toRemove = new BitSet();
        __CLR4_1_25v5vl3lqxriu.R.inc(2292);for (final Map.Entry<Boolean, MutableInt> e : occurrences.entrySet()) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2293);final Boolean v = e.getKey();
            __CLR4_1_25v5vl3lqxriu.R.inc(2294);int found = 0;
            __CLR4_1_25v5vl3lqxriu.R.inc(2295);for (int i = 0, ct = e.getValue().intValue(); (((i < ct)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2296)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2297)==0&false)); i++) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2298);found = indexOf(array, v.booleanValue(), found);
                __CLR4_1_25v5vl3lqxriu.R.inc(2299);if ((((found < 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2300)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2301)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(2302);break;
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2303);toRemove.set(found++);
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2304);return (boolean[]) removeAll(array, toRemove);
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * Removes multiple array elements specified by index.
     * @param array source
     * @param indices to remove, WILL BE SORTED--so only clones of user-owned arrays!
     * @return new array of same type minus elements specified by unique values of {@code indices}
     * @since 3.0.1
     */
    // package protected for access by unit tests
    static Object removeAll(final Object array, final int... indices) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2305);
        __CLR4_1_25v5vl3lqxriu.R.inc(2306);final int length = getLength(array);
        __CLR4_1_25v5vl3lqxriu.R.inc(2307);int diff = 0; // number of distinct indexes, i.e. number of entries that will be removed

        __CLR4_1_25v5vl3lqxriu.R.inc(2308);if ((((isNotEmpty(indices))&&(__CLR4_1_25v5vl3lqxriu.R.iget(2309)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2310)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2311);Arrays.sort(indices);

            __CLR4_1_25v5vl3lqxriu.R.inc(2312);int i = indices.length;
            __CLR4_1_25v5vl3lqxriu.R.inc(2313);int prevIndex = length;
            __CLR4_1_25v5vl3lqxriu.R.inc(2314);while ((((--i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2315)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2316)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2317);final int index = indices[i];
                __CLR4_1_25v5vl3lqxriu.R.inc(2318);if ((((index < 0 || index >= length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2319)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2320)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(2321);throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2322);if ((((index >= prevIndex)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2323)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2324)==0&false))) {{
                    __CLR4_1_25v5vl3lqxriu.R.inc(2325);continue;
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2326);diff++;
                __CLR4_1_25v5vl3lqxriu.R.inc(2327);prevIndex = index;
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2328);final Object result = Array.newInstance(array.getClass().getComponentType(), length - diff);
        __CLR4_1_25v5vl3lqxriu.R.inc(2329);if ((((diff < length)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2330)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2331)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2332);int end = length; // index just after last copy
            __CLR4_1_25v5vl3lqxriu.R.inc(2333);int dest = length - diff; // number of entries so far not copied
            __CLR4_1_25v5vl3lqxriu.R.inc(2334);for (int i = indices.length - 1; (((i >= 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2335)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2336)==0&false)); i--) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2337);final int index = indices[i];
                __CLR4_1_25v5vl3lqxriu.R.inc(2338);if ((((end - index > 1)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2339)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2340)==0&false))) {{ // same as (cp > 0)
                    __CLR4_1_25v5vl3lqxriu.R.inc(2341);final int cp = end - index - 1;
                    __CLR4_1_25v5vl3lqxriu.R.inc(2342);dest -= cp;
                    __CLR4_1_25v5vl3lqxriu.R.inc(2343);System.arraycopy(array, index + 1, result, dest, cp);
                    // Afer this copy, we still have room for dest items.
                }
                }__CLR4_1_25v5vl3lqxriu.R.inc(2344);end = index;
            }
            }__CLR4_1_25v5vl3lqxriu.R.inc(2345);if ((((end > 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2346)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2347)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2348);System.arraycopy(array, 0, result, 0, end);
            }
        }}
        }__CLR4_1_25v5vl3lqxriu.R.inc(2349);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}

    /**
     * Removes multiple array elements specified by indices.
     * 
     * @param array source
     * @param indices to remove
     * @return new array of same type minus elements specified by the set bits in {@code indices}
     * @since 3.2
     */
    // package protected for access by unit tests
    static Object removeAll(final Object array, final BitSet indices) {try{__CLR4_1_25v5vl3lqxriu.R.inc(2350);
        __CLR4_1_25v5vl3lqxriu.R.inc(2351);final int srcLength = ArrayUtils.getLength(array);
        // No need to check maxIndex here, because method only currently called from removeElements()
        // which guarantee to generate on;y valid bit entries.
//        final int maxIndex = indices.length();
//        if (maxIndex > srcLength) { 
//            throw new IndexOutOfBoundsException("Index: " + (maxIndex-1) + ", Length: " + srcLength);
//        }
        __CLR4_1_25v5vl3lqxriu.R.inc(2352);final int removals = indices.cardinality(); // true bits are items to remove
        __CLR4_1_25v5vl3lqxriu.R.inc(2353);final Object result = Array.newInstance(array.getClass().getComponentType(), srcLength - removals);
        __CLR4_1_25v5vl3lqxriu.R.inc(2354);int srcIndex=0;
        __CLR4_1_25v5vl3lqxriu.R.inc(2355);int destIndex=0;
        __CLR4_1_25v5vl3lqxriu.R.inc(2356);int count;
        __CLR4_1_25v5vl3lqxriu.R.inc(2357);int set;
        __CLR4_1_25v5vl3lqxriu.R.inc(2358);while((set = indices.nextSetBit(srcIndex)) != -1){{
            __CLR4_1_25v5vl3lqxriu.R.inc(2361);count = set - srcIndex;
            __CLR4_1_25v5vl3lqxriu.R.inc(2362);if ((((count > 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2363)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2364)==0&false))) {{
                __CLR4_1_25v5vl3lqxriu.R.inc(2365);System.arraycopy(array, srcIndex, result, destIndex, count);
                __CLR4_1_25v5vl3lqxriu.R.inc(2366);destIndex += count;
            }
            }__CLR4_1_25v5vl3lqxriu.R.inc(2367);srcIndex = indices.nextClearBit(set);
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2368);count = srcLength - srcIndex;
        __CLR4_1_25v5vl3lqxriu.R.inc(2369);if ((((count > 0)&&(__CLR4_1_25v5vl3lqxriu.R.iget(2370)!=0|true))||(__CLR4_1_25v5vl3lqxriu.R.iget(2371)==0&false))) {{
            __CLR4_1_25v5vl3lqxriu.R.inc(2372);System.arraycopy(array, srcIndex, result, destIndex, count);            
        }
        }__CLR4_1_25v5vl3lqxriu.R.inc(2373);return result;
    }finally{__CLR4_1_25v5vl3lqxriu.R.flushNeeded();}}
}
