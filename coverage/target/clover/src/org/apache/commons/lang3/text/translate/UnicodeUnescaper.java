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
package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/**
 * Translates escaped Unicode values of the form \\u+\d\d\d\d back to 
 * Unicode. It supports multiple 'u' characters and will work with or 
 * without the +.
 * 
 * @since 3.0
 * @version $Id$
 */
public class UnicodeUnescaper extends CharSequenceTranslator {public static class __CLR4_1_2d8ed8el3lqxsqw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,17174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * {@inheritDoc}
     */
    @Override
    public int translate(final CharSequence input, final int index, final Writer out) throws IOException {try{__CLR4_1_2d8ed8el3lqxsqw.R.inc(17150);
        __CLR4_1_2d8ed8el3lqxsqw.R.inc(17151);if ((((input.charAt(index) == '\\' && index + 1 < input.length() && input.charAt(index + 1) == 'u')&&(__CLR4_1_2d8ed8el3lqxsqw.R.iget(17152)!=0|true))||(__CLR4_1_2d8ed8el3lqxsqw.R.iget(17153)==0&false))) {{
            // consume optional additional 'u' chars
            __CLR4_1_2d8ed8el3lqxsqw.R.inc(17154);int i = 2;
            __CLR4_1_2d8ed8el3lqxsqw.R.inc(17155);while ((((index + i < input.length() && input.charAt(index + i) == 'u')&&(__CLR4_1_2d8ed8el3lqxsqw.R.iget(17156)!=0|true))||(__CLR4_1_2d8ed8el3lqxsqw.R.iget(17157)==0&false))) {{
                __CLR4_1_2d8ed8el3lqxsqw.R.inc(17158);i++;
            }

            }__CLR4_1_2d8ed8el3lqxsqw.R.inc(17159);if ((((index + i < input.length() && input.charAt(index + i) == '+')&&(__CLR4_1_2d8ed8el3lqxsqw.R.iget(17160)!=0|true))||(__CLR4_1_2d8ed8el3lqxsqw.R.iget(17161)==0&false))) {{
                __CLR4_1_2d8ed8el3lqxsqw.R.inc(17162);i++;
            }

            }__CLR4_1_2d8ed8el3lqxsqw.R.inc(17163);if ((((index + i + 4 <= input.length())&&(__CLR4_1_2d8ed8el3lqxsqw.R.iget(17164)!=0|true))||(__CLR4_1_2d8ed8el3lqxsqw.R.iget(17165)==0&false))) {{
                // Get 4 hex digits
                __CLR4_1_2d8ed8el3lqxsqw.R.inc(17166);final CharSequence unicode = input.subSequence(index + i, index + i + 4);

                __CLR4_1_2d8ed8el3lqxsqw.R.inc(17167);try {
                    __CLR4_1_2d8ed8el3lqxsqw.R.inc(17168);final int value = Integer.parseInt(unicode.toString(), 16);
                    __CLR4_1_2d8ed8el3lqxsqw.R.inc(17169);out.write((char) value);
                } catch (final NumberFormatException nfe) {
                    __CLR4_1_2d8ed8el3lqxsqw.R.inc(17170);throw new IllegalArgumentException("Unable to parse unicode value: " + unicode, nfe);
                }
                __CLR4_1_2d8ed8el3lqxsqw.R.inc(17171);return i + 4;
            } }else {{
                __CLR4_1_2d8ed8el3lqxsqw.R.inc(17172);throw new IllegalArgumentException("Less than 4 hex digits in unicode value: '" + input.subSequence(index, input.length())
                        + "' due to end of CharSequence");
            }
        }}
        }__CLR4_1_2d8ed8el3lqxsqw.R.inc(17173);return 0;
    }finally{__CLR4_1_2d8ed8el3lqxsqw.R.flushNeeded();}}
}
