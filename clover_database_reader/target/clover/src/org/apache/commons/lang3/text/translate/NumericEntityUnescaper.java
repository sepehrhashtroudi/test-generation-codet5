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
import java.util.Arrays;
import java.util.EnumSet;

/**
 * Translate XML numeric entities of the form &#[xX]?\d+;? to 
 * the specific codepoint.
 *
 * Note that the semi-colon is optional.
 * 
 * @since 3.0
 * @version $Id$
 */
public class NumericEntityUnescaper extends CharSequenceTranslator {public static class __CLR4_1_2d4td4tl3lqxsqm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,17086,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static enum OPTION { semiColonRequired, semiColonOptional, errorIfNoSemiColon }

    // TODO?: Create an OptionsSet class to hide some of the conditional logic below
    private final EnumSet<OPTION> options;

    /**
     * Create a UnicodeUnescaper.
     *
     * The constructor takes a list of options, only one type of which is currently 
     * available (whether to allow, error or ignore the semi-colon on the end of a 
     * numeric entity to being missing).
     *
     * For example, to support numeric entities without a ';':
     *    new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonOptional)
     * and to throw an IllegalArgumentException when they're missing:
     *    new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.errorIfNoSemiColon)
     *
     * Note that the default behaviour is to ignore them. 
     *
     * @param options to apply to this unescaper
     */
    public NumericEntityUnescaper(final OPTION... options) {try{__CLR4_1_2d4td4tl3lqxsqm.R.inc(17021);
        __CLR4_1_2d4td4tl3lqxsqm.R.inc(17022);if((((options.length > 0)&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17023)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17024)==0&false))) {{
            __CLR4_1_2d4td4tl3lqxsqm.R.inc(17025);this.options = EnumSet.copyOf(Arrays.asList(options));
        } }else {{
            __CLR4_1_2d4td4tl3lqxsqm.R.inc(17026);this.options = EnumSet.copyOf(Arrays.asList(new OPTION[] { OPTION.semiColonRequired }));
        }
    }}finally{__CLR4_1_2d4td4tl3lqxsqm.R.flushNeeded();}}

    /**
     * Whether the passed in option is currently set.
     *
     * @param option to check state of
     * @return whether the option is set
     */
    public boolean isSet(final OPTION option) {try{__CLR4_1_2d4td4tl3lqxsqm.R.inc(17027); 
        __CLR4_1_2d4td4tl3lqxsqm.R.inc(17028);return (((options == null )&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17029)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17030)==0&false))? false : options.contains(option);
    }finally{__CLR4_1_2d4td4tl3lqxsqm.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public int translate(final CharSequence input, final int index, final Writer out) throws IOException {try{__CLR4_1_2d4td4tl3lqxsqm.R.inc(17031);
        __CLR4_1_2d4td4tl3lqxsqm.R.inc(17032);final int seqEnd = input.length();
        // Uses -2 to ensure there is something after the &#
        __CLR4_1_2d4td4tl3lqxsqm.R.inc(17033);if((((input.charAt(index) == '&' && index < seqEnd - 2 && input.charAt(index + 1) == '#')&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17034)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17035)==0&false))) {{
            __CLR4_1_2d4td4tl3lqxsqm.R.inc(17036);int start = index + 2;
            __CLR4_1_2d4td4tl3lqxsqm.R.inc(17037);boolean isHex = false;

            __CLR4_1_2d4td4tl3lqxsqm.R.inc(17038);final char firstChar = input.charAt(start);
            __CLR4_1_2d4td4tl3lqxsqm.R.inc(17039);if((((firstChar == 'x' || firstChar == 'X')&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17040)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17041)==0&false))) {{
                __CLR4_1_2d4td4tl3lqxsqm.R.inc(17042);start++;
                __CLR4_1_2d4td4tl3lqxsqm.R.inc(17043);isHex = true;

                // Check there's more than just an x after the &#
                __CLR4_1_2d4td4tl3lqxsqm.R.inc(17044);if((((start == seqEnd)&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17045)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17046)==0&false))) {{
                    __CLR4_1_2d4td4tl3lqxsqm.R.inc(17047);return 0;
                }
            }}

            }__CLR4_1_2d4td4tl3lqxsqm.R.inc(17048);int end = start;
            // Note that this supports character codes without a ; on the end
            __CLR4_1_2d4td4tl3lqxsqm.R.inc(17049);while((((end < seqEnd && ( input.charAt(end) >= '0' && input.charAt(end) <= '9' ||
                                    input.charAt(end) >= 'a' && input.charAt(end) <= 'f' ||
                                    input.charAt(end) >= 'A' && input.charAt(end) <= 'F' ) )&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17050)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17051)==0&false)))
            {{
                __CLR4_1_2d4td4tl3lqxsqm.R.inc(17052);end++;
            }

            }__CLR4_1_2d4td4tl3lqxsqm.R.inc(17053);final boolean semiNext = end != seqEnd && input.charAt(end) == ';';

            __CLR4_1_2d4td4tl3lqxsqm.R.inc(17054);if((((!semiNext)&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17055)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17056)==0&false))) {{
                __CLR4_1_2d4td4tl3lqxsqm.R.inc(17057);if((((isSet(OPTION.semiColonRequired))&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17058)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17059)==0&false))) {{
                    __CLR4_1_2d4td4tl3lqxsqm.R.inc(17060);return 0;
                } }else
                {__CLR4_1_2d4td4tl3lqxsqm.R.inc(17061);if((((isSet(OPTION.errorIfNoSemiColon))&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17062)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17063)==0&false))) {{
                    __CLR4_1_2d4td4tl3lqxsqm.R.inc(17064);throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }}}

            }__CLR4_1_2d4td4tl3lqxsqm.R.inc(17065);int entityValue;
            __CLR4_1_2d4td4tl3lqxsqm.R.inc(17066);try {
                __CLR4_1_2d4td4tl3lqxsqm.R.inc(17067);if((((isHex)&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17068)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17069)==0&false))) {{
                    __CLR4_1_2d4td4tl3lqxsqm.R.inc(17070);entityValue = Integer.parseInt(input.subSequence(start, end).toString(), 16);
                } }else {{
                    __CLR4_1_2d4td4tl3lqxsqm.R.inc(17071);entityValue = Integer.parseInt(input.subSequence(start, end).toString(), 10);
                }
            }} catch(final NumberFormatException nfe) {
                __CLR4_1_2d4td4tl3lqxsqm.R.inc(17072);return 0;
            }

            __CLR4_1_2d4td4tl3lqxsqm.R.inc(17073);if((((entityValue > 0xFFFF)&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17074)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17075)==0&false))) {{
                __CLR4_1_2d4td4tl3lqxsqm.R.inc(17076);final char[] chrs = Character.toChars(entityValue);
                __CLR4_1_2d4td4tl3lqxsqm.R.inc(17077);out.write(chrs[0]);
                __CLR4_1_2d4td4tl3lqxsqm.R.inc(17078);out.write(chrs[1]);
            } }else {{
                __CLR4_1_2d4td4tl3lqxsqm.R.inc(17079);out.write(entityValue);
            }

            }__CLR4_1_2d4td4tl3lqxsqm.R.inc(17080);return 2 + end - start + ((((isHex )&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17081)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17082)==0&false))? 1 : 0) + ((((semiNext )&&(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17083)!=0|true))||(__CLR4_1_2d4td4tl3lqxsqm.R.iget(17084)==0&false))? 1 : 0);
        }
        }__CLR4_1_2d4td4tl3lqxsqm.R.inc(17085);return 0;
    }finally{__CLR4_1_2d4td4tl3lqxsqm.R.flushNeeded();}}
}
