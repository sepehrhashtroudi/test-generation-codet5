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
import java.util.HashMap;

/**
 * Translates a value using a lookup table.
 *
 * @since 3.0
 * @version $Id$
 */
public class LookupTranslator extends CharSequenceTranslator {public static class __CLR4_1_2d2yd2yl3lqxsqc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,16991,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final HashMap<String, CharSequence> lookupMap;
    private final int shortest;
    private final int longest;

    /**
     * Define the lookup table to be used in translation
     *
     * Note that, as of Lang 3.1, the key to the lookup table is converted to a 
     * java.lang.String, while the value remains as a java.lang.CharSequence. 
     * This is because we need the key to support hashCode and equals(Object), 
     * allowing it to be the key for a HashMap. See LANG-882.
     *
     * @param lookup CharSequence[][] table of size [*][2]
     */
    public LookupTranslator(final CharSequence[]... lookup) {try{__CLR4_1_2d2yd2yl3lqxsqc.R.inc(16954);
        __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16955);lookupMap = new HashMap<String, CharSequence>();
        __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16956);int _shortest = Integer.MAX_VALUE;
        __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16957);int _longest = 0;
        __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16958);if ((((lookup != null)&&(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16959)!=0|true))||(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16960)==0&false))) {{
            __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16961);for (final CharSequence[] seq : lookup) {{
                __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16962);this.lookupMap.put(seq[0].toString(), seq[1]);
                __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16963);final int sz = seq[0].length();
                __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16964);if ((((sz < _shortest)&&(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16965)!=0|true))||(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16966)==0&false))) {{
                    __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16967);_shortest = sz;
                }
                }__CLR4_1_2d2yd2yl3lqxsqc.R.inc(16968);if ((((sz > _longest)&&(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16969)!=0|true))||(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16970)==0&false))) {{
                    __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16971);_longest = sz;
                }
            }}
        }}
        }__CLR4_1_2d2yd2yl3lqxsqc.R.inc(16972);shortest = _shortest;
        __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16973);longest = _longest;
    }finally{__CLR4_1_2d2yd2yl3lqxsqc.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int translate(final CharSequence input, final int index, final Writer out) throws IOException {try{__CLR4_1_2d2yd2yl3lqxsqc.R.inc(16974);
        __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16975);int max = longest;
        __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16976);if ((((index + longest > input.length())&&(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16977)!=0|true))||(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16978)==0&false))) {{
            __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16979);max = input.length() - index;
        }
        // descend so as to get a greedy algorithm
        }__CLR4_1_2d2yd2yl3lqxsqc.R.inc(16980);for (int i = max; (((i >= shortest)&&(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16981)!=0|true))||(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16982)==0&false)); i--) {{
            __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16983);final CharSequence subSeq = input.subSequence(index, index + i);
            __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16984);final CharSequence result = lookupMap.get(subSeq.toString());
            __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16985);if ((((result != null)&&(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16986)!=0|true))||(__CLR4_1_2d2yd2yl3lqxsqc.R.iget(16987)==0&false))) {{
                __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16988);out.write(result.toString());
                __CLR4_1_2d2yd2yl3lqxsqc.R.inc(16989);return i;
            }
        }}
        }__CLR4_1_2d2yd2yl3lqxsqc.R.inc(16990);return 0;
    }finally{__CLR4_1_2d2yd2yl3lqxsqc.R.flushNeeded();}}
}
