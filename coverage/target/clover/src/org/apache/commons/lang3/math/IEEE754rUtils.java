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
package org.apache.commons.lang3.math;

/**
 * <p>Provides IEEE-754r variants of NumberUtils methods. </p>
 *
 * <p>See: <a href="http://en.wikipedia.org/wiki/IEEE_754r">http://en.wikipedia.org/wiki/IEEE_754r</a></p>
 *
 * @since 2.4
 * @version $Id$
 */
public class IEEE754rUtils {public static class __CLR4_1_29ao9aol3lqxsfz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,12156,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
     /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static double min(final double[] array) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12048);
        // Validates input
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12049);if ((((array == null)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12050)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12051)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12052);throw new IllegalArgumentException("The Array must not be null");
        } }else {__CLR4_1_29ao9aol3lqxsfz.R.inc(12053);if ((((array.length == 0)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12054)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12055)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12056);throw new IllegalArgumentException("Array cannot be empty.");
        }
    
        // Finds and returns min
        }}__CLR4_1_29ao9aol3lqxsfz.R.inc(12057);double min = array[0];
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12058);for (int i = 1; (((i < array.length)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12059)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12060)==0&false)); i++) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12061);min = min(array[i], min);
        }
    
        }__CLR4_1_29ao9aol3lqxsfz.R.inc(12062);return min;
    }finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static float min(final float[] array) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12063);
        // Validates input
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12064);if ((((array == null)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12065)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12066)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12067);throw new IllegalArgumentException("The Array must not be null");
        } }else {__CLR4_1_29ao9aol3lqxsfz.R.inc(12068);if ((((array.length == 0)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12069)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12070)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12071);throw new IllegalArgumentException("Array cannot be empty.");
        }
    
        // Finds and returns min
        }}__CLR4_1_29ao9aol3lqxsfz.R.inc(12072);float min = array[0];
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12073);for (int i = 1; (((i < array.length)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12074)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12075)==0&false)); i++) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12076);min = min(array[i], min);
        }
    
        }__CLR4_1_29ao9aol3lqxsfz.R.inc(12077);return min;
    }finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static double min(final double a, final double b, final double c) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12078);
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12079);return min(min(a, b), c);
    }finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of two <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @return  the smallest of the values
     */
    public static double min(final double a, final double b) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12080);
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12081);if((((Double.isNaN(a))&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12082)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12083)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12084);return b;
        } }else
        {__CLR4_1_29ao9aol3lqxsfz.R.inc(12085);if((((Double.isNaN(b))&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12086)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12087)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12088);return a;
        } }else {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12089);return Math.min(a, b);
        }
    }}}finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static float min(final float a, final float b, final float c) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12090);
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12091);return min(min(a, b), c);
    }finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of two <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @return  the smallest of the values
     */
    public static float min(final float a, final float b) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12092);
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12093);if((((Float.isNaN(a))&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12094)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12095)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12096);return b;
        } }else
        {__CLR4_1_29ao9aol3lqxsfz.R.inc(12097);if((((Float.isNaN(b))&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12098)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12099)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12100);return a;
        } }else {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12101);return Math.min(a, b);
        }
    }}}finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static double max(final double[] array) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12102);
        // Validates input
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12103);if ((((array== null)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12104)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12105)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12106);throw new IllegalArgumentException("The Array must not be null");
        } }else {__CLR4_1_29ao9aol3lqxsfz.R.inc(12107);if ((((array.length == 0)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12108)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12109)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12110);throw new IllegalArgumentException("Array cannot be empty.");
        }
    
        // Finds and returns max
        }}__CLR4_1_29ao9aol3lqxsfz.R.inc(12111);double max = array[0];
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12112);for (int j = 1; (((j < array.length)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12113)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12114)==0&false)); j++) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12115);max = max(array[j], max);
        }
    
        }__CLR4_1_29ao9aol3lqxsfz.R.inc(12116);return max;
    }finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static float max(final float[] array) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12117);
        // Validates input
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12118);if ((((array == null)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12119)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12120)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12121);throw new IllegalArgumentException("The Array must not be null");
        } }else {__CLR4_1_29ao9aol3lqxsfz.R.inc(12122);if ((((array.length == 0)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12123)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12124)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12125);throw new IllegalArgumentException("Array cannot be empty.");
        }

        // Finds and returns max
        }}__CLR4_1_29ao9aol3lqxsfz.R.inc(12126);float max = array[0];
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12127);for (int j = 1; (((j < array.length)&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12128)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12129)==0&false)); j++) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12130);max = max(array[j], max);
        }

        }__CLR4_1_29ao9aol3lqxsfz.R.inc(12131);return max;
    }finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}
     
    /**
     * <p>Gets the maximum of three <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static double max(final double a, final double b, final double c) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12132);
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12133);return max(max(a, b), c);
    }finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of two <code>double</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @return  the largest of the values
     */
    public static double max(final double a, final double b) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12134);
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12135);if((((Double.isNaN(a))&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12136)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12137)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12138);return b;
        } }else
        {__CLR4_1_29ao9aol3lqxsfz.R.inc(12139);if((((Double.isNaN(b))&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12140)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12141)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12142);return a;
        } }else {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12143);return Math.max(a, b);
        }
    }}}finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static float max(final float a, final float b, final float c) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12144);
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12145);return max(max(a, b), c);
    }finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of two <code>float</code> values.</p>
     * 
     * <p>NaN is only returned if all numbers are NaN as per IEEE-754r. </p>
     *
     * @param a  value 1
     * @param b  value 2
     * @return  the largest of the values
     */
    public static float max(final float a, final float b) {try{__CLR4_1_29ao9aol3lqxsfz.R.inc(12146);
        __CLR4_1_29ao9aol3lqxsfz.R.inc(12147);if((((Float.isNaN(a))&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12148)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12149)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12150);return b;
        } }else
        {__CLR4_1_29ao9aol3lqxsfz.R.inc(12151);if((((Float.isNaN(b))&&(__CLR4_1_29ao9aol3lqxsfz.R.iget(12152)!=0|true))||(__CLR4_1_29ao9aol3lqxsfz.R.iget(12153)==0&false))) {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12154);return a;
        } }else {{
            __CLR4_1_29ao9aol3lqxsfz.R.inc(12155);return Math.max(a, b);
        }
    }}}finally{__CLR4_1_29ao9aol3lqxsfz.R.flushNeeded();}}

}
