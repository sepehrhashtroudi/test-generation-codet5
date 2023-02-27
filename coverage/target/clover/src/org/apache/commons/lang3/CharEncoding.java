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

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;

/**
 * <p>Character encoding names required of every implementation of the Java platform.</p>
 *
 * <p>According to <a href="http://docs.oracle.com/javase/1.3/docs/api/java/lang/package-summary.html#charenc">JRE character
 * encoding names</a>:</p>
 *
 * <p><cite>Every implementation of the Java platform is required to support the following character encodings.
 * Consult the release documentation for your implementation to see if any other encodings are supported.
 * </cite></p>
 *
 * @see <a href="http://download.oracle.com/javase/1.3/docs/guide/intl/encoding.doc.html">JRE character encoding names</a>
 * @since 2.1
 * @version $Id$
 */
public class CharEncoding {public static class __CLR4_1_226c26cl3lqxrn8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,2828,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>ISO Latin Alphabet #1, also known as ISO-LATIN-1.</p>
     *
     * <p>Every implementation of the Java platform is required to support this character encoding.</p>
     */
    public static final String ISO_8859_1 = "ISO-8859-1";

    /**
     * <p>Seven-bit ASCII, also known as ISO646-US, also known as the Basic Latin block
     * of the Unicode character set.</p>
     *
     * <p>Every implementation of the Java platform is required to support this character encoding.</p>
     */
    public static final String US_ASCII = "US-ASCII";

    /**
     * <p>Sixteen-bit Unicode Transformation Format, byte order specified by a mandatory initial
     * byte-order mark (either order accepted on input, big-endian used on output).</p>
     *
     * <p>Every implementation of the Java platform is required to support this character encoding.</p>
     */
    public static final String UTF_16 = "UTF-16";

    /**
     * <p>Sixteen-bit Unicode Transformation Format, big-endian byte order.</p>
     *
     * <p>Every implementation of the Java platform is required to support this character encoding.</p>
     */
    public static final String UTF_16BE = "UTF-16BE";

    /**
     * <p>Sixteen-bit Unicode Transformation Format, little-endian byte order.</p>
     *
     * <p>Every implementation of the Java platform is required to support this character encoding.</p>
     */
    public static final String UTF_16LE = "UTF-16LE";

    /**
     * <p>Eight-bit Unicode Transformation Format.</p>
     *
     * <p>Every implementation of the Java platform is required to support this character encoding.</p>
     */
    public static final String UTF_8 = "UTF-8";

    //-----------------------------------------------------------------------
    /**
     * <p>Returns whether the named charset is supported.</p>
     *
     * <p>This is similar to <a
     * href="http://download.oracle.com/javase/1.4.2/docs/api/java/nio/charset/Charset.html#isSupported%28java.lang.String%29">
     * java.nio.charset.Charset.isSupported(String)</a> but handles more formats</p>
     *
     * @param name  the name of the requested charset; may be either a canonical name or an alias, null returns false
     * @return {@code true} if the charset is available in the current Java virtual machine
     */
    public static boolean isSupported(final String name) {try{__CLR4_1_226c26cl3lqxrn8.R.inc(2820);
        __CLR4_1_226c26cl3lqxrn8.R.inc(2821);if ((((name == null)&&(__CLR4_1_226c26cl3lqxrn8.R.iget(2822)!=0|true))||(__CLR4_1_226c26cl3lqxrn8.R.iget(2823)==0&false))) {{
            __CLR4_1_226c26cl3lqxrn8.R.inc(2824);return false;
        }
        }__CLR4_1_226c26cl3lqxrn8.R.inc(2825);try {
            __CLR4_1_226c26cl3lqxrn8.R.inc(2826);return Charset.isSupported(name);
        } catch (final IllegalCharsetNameException ex) {
            __CLR4_1_226c26cl3lqxrn8.R.inc(2827);return false;
        }
    }finally{__CLR4_1_226c26cl3lqxrn8.R.flushNeeded();}}

}
