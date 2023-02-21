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
 * Translate escaped octal Strings back to their octal values.
 *
 * For example, "\45" should go back to being the specific value (a %).
 *
 * Note that this currently only supports the viable range of octal for Java; namely 
 * 1 to 377. This is both because parsing Java is the main use case and Integer.parseInt
 * throws an exception when values are larger than octal 377.
 * 
 * @since 3.0
 * @version $Id: OctalUnescaper.java 967237 2010-07-23 20:08:57Z mbenson $
 */
public class OctalUnescaper extends CharSequenceTranslator {public static class __CLR4_1_2d6md6ml3lqxsqp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,17104,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static int OCTAL_MAX = 377;

    /**
     * {@inheritDoc}
     */
    @Override
    public int translate(final CharSequence input, final int index, final Writer out) throws IOException {try{__CLR4_1_2d6md6ml3lqxsqp.R.inc(17086);
        __CLR4_1_2d6md6ml3lqxsqp.R.inc(17087);if((((input.charAt(index) == '\\' && index < (input.length() - 1) && Character.isDigit(input.charAt(index + 1)) )&&(__CLR4_1_2d6md6ml3lqxsqp.R.iget(17088)!=0|true))||(__CLR4_1_2d6md6ml3lqxsqp.R.iget(17089)==0&false))) {{
            __CLR4_1_2d6md6ml3lqxsqp.R.inc(17090);final int start = index + 1;

            __CLR4_1_2d6md6ml3lqxsqp.R.inc(17091);int end = index + 2;
            __CLR4_1_2d6md6ml3lqxsqp.R.inc(17092);while ( (((end < input.length() && Character.isDigit(input.charAt(end)) )&&(__CLR4_1_2d6md6ml3lqxsqp.R.iget(17093)!=0|true))||(__CLR4_1_2d6md6ml3lqxsqp.R.iget(17094)==0&false))) {{
                __CLR4_1_2d6md6ml3lqxsqp.R.inc(17095);end++;
                __CLR4_1_2d6md6ml3lqxsqp.R.inc(17096);if ( (((Integer.parseInt(input.subSequence(start, end).toString(), 10) > OCTAL_MAX)&&(__CLR4_1_2d6md6ml3lqxsqp.R.iget(17097)!=0|true))||(__CLR4_1_2d6md6ml3lqxsqp.R.iget(17098)==0&false))) {{
                    __CLR4_1_2d6md6ml3lqxsqp.R.inc(17099);end--; // rollback
                    __CLR4_1_2d6md6ml3lqxsqp.R.inc(17100);break;
                }
            }}

            }__CLR4_1_2d6md6ml3lqxsqp.R.inc(17101);out.write( Integer.parseInt(input.subSequence(start, end).toString(), 8) );
            __CLR4_1_2d6md6ml3lqxsqp.R.inc(17102);return 1 + end - start;
        }
        }__CLR4_1_2d6md6ml3lqxsqp.R.inc(17103);return 0;
    }finally{__CLR4_1_2d6md6ml3lqxsqp.R.flushNeeded();}}
}
