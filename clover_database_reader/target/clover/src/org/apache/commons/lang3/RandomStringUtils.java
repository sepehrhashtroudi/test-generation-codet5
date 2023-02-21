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

import java.util.Random;

/**
 * <p>Operations for random {@code String}s.</p>
 * <p>Currently <em>private high surrogate</em> characters are ignored. 
 * These are Unicode characters that fall between the values 56192 (db80)
 * and 56319 (dbff) as we don't know how to handle them. 
 * High and low surrogates are correctly dealt with - that is if a 
 * high surrogate is randomly chosen, 55296 (d800) to 56191 (db7f) 
 * then it is followed by a low surrogate. If a low surrogate is chosen, 
 * 56320 (dc00) to 57343 (dfff) then it is placed after a randomly 
 * chosen high surrogate. </p>
 *
 * <p>#ThreadSafe#</p>
 * @since 1.0
 * @version $Id$
 */
public class RandomStringUtils {public static class __CLR4_1_241h41hl3lqxrw3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,5338,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>Random object used by random method. This has to be not local
     * to the random method so as to not return the same value in the 
     * same millisecond.</p>
     */
    private static final Random RANDOM = new Random();

    /**
     * <p>{@code RandomStringUtils} instances should NOT be constructed in
     * standard programming. Instead, the class should be used as
     * {@code RandomStringUtils.random(5);}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public RandomStringUtils() {
      super();__CLR4_1_241h41hl3lqxrw3.R.inc(5238);try{__CLR4_1_241h41hl3lqxrw3.R.inc(5237);
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}

    // Random
    //-----------------------------------------------------------------------
    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of all characters.</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     */
    public static String random(final int count) {try{__CLR4_1_241h41hl3lqxrw3.R.inc(5239);
        __CLR4_1_241h41hl3lqxrw3.R.inc(5240);return random(count, false, false);
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of characters whose
     * ASCII value is between {@code 32} and {@code 126} (inclusive).</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     */
    public static String randomAscii(final int count) {try{__CLR4_1_241h41hl3lqxrw3.R.inc(5241);
        __CLR4_1_241h41hl3lqxrw3.R.inc(5242);return random(count, 32, 127, false, false);
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}
    
    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of alphabetic
     * characters.</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     */
    public static String randomAlphabetic(final int count) {try{__CLR4_1_241h41hl3lqxrw3.R.inc(5243);
        __CLR4_1_241h41hl3lqxrw3.R.inc(5244);return random(count, true, false);
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}
    
    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of alpha-numeric
     * characters.</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     */
    public static String randomAlphanumeric(final int count) {try{__CLR4_1_241h41hl3lqxrw3.R.inc(5245);
        __CLR4_1_241h41hl3lqxrw3.R.inc(5246);return random(count, true, true);
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}
    
    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of numeric
     * characters.</p>
     *
     * @param count  the length of random string to create
     * @return the random string
     */
    public static String randomNumeric(final int count) {try{__CLR4_1_241h41hl3lqxrw3.R.inc(5247);
        __CLR4_1_241h41hl3lqxrw3.R.inc(5248);return random(count, false, true);
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of alpha-numeric
     * characters as indicated by the arguments.</p>
     *
     * @param count  the length of random string to create
     * @param letters  if {@code true}, generated string will include
     *  alphabetic characters
     * @param numbers  if {@code true}, generated string will include
     *  numeric characters
     * @return the random string
     */
    public static String random(final int count, final boolean letters, final boolean numbers) {try{__CLR4_1_241h41hl3lqxrw3.R.inc(5249);
        __CLR4_1_241h41hl3lqxrw3.R.inc(5250);return random(count, 0, 0, letters, numbers);
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}
    
    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of alpha-numeric
     * characters as indicated by the arguments.</p>
     *
     * @param count  the length of random string to create
     * @param start  the position in set of chars to start at
     * @param end  the position in set of chars to end before
     * @param letters  if {@code true}, generated string will include
     *  alphabetic characters
     * @param numbers  if {@code true}, generated string will include
     *  numeric characters
     * @return the random string
     */
    public static String random(final int count, final int start, final int end, final boolean letters, final boolean numbers) {try{__CLR4_1_241h41hl3lqxrw3.R.inc(5251);
        __CLR4_1_241h41hl3lqxrw3.R.inc(5252);return random(count, start, end, letters, numbers, null, RANDOM);
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}

    /**
     * <p>Creates a random string based on a variety of options, using
     * default source of randomness.</p>
     *
     * <p>This method has exactly the same semantics as
     * {@link #random(int,int,int,boolean,boolean,char[],Random)}, but
     * instead of using an externally supplied source of randomness, it uses
     * the internal static {@link Random} instance.</p>
     *
     * @param count  the length of random string to create
     * @param start  the position in set of chars to start at
     * @param end  the position in set of chars to end before
     * @param letters  only allow letters?
     * @param numbers  only allow numbers?
     * @param chars  the set of chars to choose randoms from.
     *  If {@code null}, then it will use the set of all chars.
     * @return the random string
     * @throws ArrayIndexOutOfBoundsException if there are not
     *  {@code (end - start) + 1} characters in the set array.
     */
    public static String random(final int count, final int start, final int end, final boolean letters, final boolean numbers, final char... chars) {try{__CLR4_1_241h41hl3lqxrw3.R.inc(5253);
        __CLR4_1_241h41hl3lqxrw3.R.inc(5254);return random(count, start, end, letters, numbers, chars, RANDOM);
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}

    /**
     * <p>Creates a random string based on a variety of options, using
     * supplied source of randomness.</p>
     *
     * <p>If start and end are both {@code 0}, start and end are set
     * to {@code ' '} and {@code 'z'}, the ASCII printable
     * characters, will be used, unless letters and numbers are both
     * {@code false}, in which case, start and end are set to
     * {@code 0} and {@code Integer.MAX_VALUE}.
     *
     * <p>If set is not {@code null}, characters between start and
     * end are chosen.</p>
     *
     * <p>This method accepts a user-supplied {@link Random}
     * instance to use as a source of randomness. By seeding a single 
     * {@link Random} instance with a fixed seed and using it for each call,
     * the same random sequence of strings can be generated repeatedly
     * and predictably.</p>
     *
     * @param count  the length of random string to create
     * @param start  the position in set of chars to start at
     * @param end  the position in set of chars to end before
     * @param letters  only allow letters?
     * @param numbers  only allow numbers?
     * @param chars  the set of chars to choose randoms from, must not be empty.
     *  If {@code null}, then it will use the set of all chars.
     * @param random  a source of randomness.
     * @return the random string
     * @throws ArrayIndexOutOfBoundsException if there are not
     *  {@code (end - start) + 1} characters in the set array.
     * @throws IllegalArgumentException if {@code count} &lt; 0 or the provided chars array is empty.
     * @since 2.0
     */
    public static String random(int count, int start, int end, final boolean letters, final boolean numbers,
                                final char[] chars, final Random random) {try{__CLR4_1_241h41hl3lqxrw3.R.inc(5255);
        __CLR4_1_241h41hl3lqxrw3.R.inc(5256);if ((((count == 0)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5257)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5258)==0&false))) {{
            __CLR4_1_241h41hl3lqxrw3.R.inc(5259);return "";
        } }else {__CLR4_1_241h41hl3lqxrw3.R.inc(5260);if ((((count < 0)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5261)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5262)==0&false))) {{
            __CLR4_1_241h41hl3lqxrw3.R.inc(5263);throw new IllegalArgumentException("Requested random string length " + count + " is less than 0.");
        }
        }}__CLR4_1_241h41hl3lqxrw3.R.inc(5264);if ((((chars != null && chars.length == 0)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5265)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5266)==0&false))) {{
            __CLR4_1_241h41hl3lqxrw3.R.inc(5267);throw new IllegalArgumentException("The chars array must not be empty");
        }

        }__CLR4_1_241h41hl3lqxrw3.R.inc(5268);if ((((start == 0 && end == 0)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5269)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5270)==0&false))) {{
            __CLR4_1_241h41hl3lqxrw3.R.inc(5271);if ((((chars != null)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5272)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5273)==0&false))) {{
                __CLR4_1_241h41hl3lqxrw3.R.inc(5274);end = chars.length;
            } }else {{
                __CLR4_1_241h41hl3lqxrw3.R.inc(5275);if ((((!letters && !numbers)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5276)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5277)==0&false))) {{
                    __CLR4_1_241h41hl3lqxrw3.R.inc(5278);end = Integer.MAX_VALUE;
                } }else {{
                    __CLR4_1_241h41hl3lqxrw3.R.inc(5279);end = 'z' + 1;
                    __CLR4_1_241h41hl3lqxrw3.R.inc(5280);start = ' ';                
                }
            }}
        }} }else {{
            __CLR4_1_241h41hl3lqxrw3.R.inc(5281);if ((((end <= start)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5282)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5283)==0&false))) {{
                __CLR4_1_241h41hl3lqxrw3.R.inc(5284);throw new IllegalArgumentException("Parameter end (" + end + ") must be greater than start (" + start + ")");
            }
        }}

        }__CLR4_1_241h41hl3lqxrw3.R.inc(5285);final char[] buffer = new char[count];
        __CLR4_1_241h41hl3lqxrw3.R.inc(5286);final int gap = end - start;

        __CLR4_1_241h41hl3lqxrw3.R.inc(5287);while ((((count-- != 0)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5288)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5289)==0&false))) {{
            __CLR4_1_241h41hl3lqxrw3.R.inc(5290);char ch;
            __CLR4_1_241h41hl3lqxrw3.R.inc(5291);if ((((chars == null)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5292)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5293)==0&false))) {{
                __CLR4_1_241h41hl3lqxrw3.R.inc(5294);ch = (char) (random.nextInt(gap) + start);
            } }else {{
                __CLR4_1_241h41hl3lqxrw3.R.inc(5295);ch = chars[random.nextInt(gap) + start];
            }
            }__CLR4_1_241h41hl3lqxrw3.R.inc(5296);if ((((letters && Character.isLetter(ch)
                    || numbers && Character.isDigit(ch)
                    || !letters && !numbers)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5297)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5298)==0&false))) {{
                __CLR4_1_241h41hl3lqxrw3.R.inc(5299);if((((ch >= 56320 && ch <= 57343)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5300)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5301)==0&false))) {{
                    __CLR4_1_241h41hl3lqxrw3.R.inc(5302);if((((count == 0)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5303)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5304)==0&false))) {{
                        __CLR4_1_241h41hl3lqxrw3.R.inc(5305);count++;
                    } }else {{
                        // low surrogate, insert high surrogate after putting it in
                        __CLR4_1_241h41hl3lqxrw3.R.inc(5306);buffer[count] = ch;
                        __CLR4_1_241h41hl3lqxrw3.R.inc(5307);count--;
                        __CLR4_1_241h41hl3lqxrw3.R.inc(5308);buffer[count] = (char) (55296 + random.nextInt(128));
                    }
                }} }else {__CLR4_1_241h41hl3lqxrw3.R.inc(5309);if((((ch >= 55296 && ch <= 56191)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5310)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5311)==0&false))) {{
                    __CLR4_1_241h41hl3lqxrw3.R.inc(5312);if((((count == 0)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5313)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5314)==0&false))) {{
                        __CLR4_1_241h41hl3lqxrw3.R.inc(5315);count++;
                    } }else {{
                        // high surrogate, insert low surrogate before putting it in
                        __CLR4_1_241h41hl3lqxrw3.R.inc(5316);buffer[count] = (char) (56320 + random.nextInt(128));
                        __CLR4_1_241h41hl3lqxrw3.R.inc(5317);count--;
                        __CLR4_1_241h41hl3lqxrw3.R.inc(5318);buffer[count] = ch;
                    }
                }} }else {__CLR4_1_241h41hl3lqxrw3.R.inc(5319);if((((ch >= 56192 && ch <= 56319)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5320)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5321)==0&false))) {{
                    // private high surrogate, no effing clue, so skip it
                    __CLR4_1_241h41hl3lqxrw3.R.inc(5322);count++;
                } }else {{
                    __CLR4_1_241h41hl3lqxrw3.R.inc(5323);buffer[count] = ch;
                }
            }}}} }else {{
                __CLR4_1_241h41hl3lqxrw3.R.inc(5324);count++;
            }
        }}
        }__CLR4_1_241h41hl3lqxrw3.R.inc(5325);return new String(buffer);
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of characters
     * specified by the string, must not be empty. 
     * If null, the set of all characters is used.</p>
     *
     * @param count  the length of random string to create
     * @param chars  the String containing the set of characters to use,
     *  may be null, but must not be empty
     * @return the random string
     * @throws IllegalArgumentException if {@code count} &lt; 0 or the string is empty.
     */
    public static String random(final int count, final String chars) {try{__CLR4_1_241h41hl3lqxrw3.R.inc(5326);
        __CLR4_1_241h41hl3lqxrw3.R.inc(5327);if ((((chars == null)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5328)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5329)==0&false))) {{
            __CLR4_1_241h41hl3lqxrw3.R.inc(5330);return random(count, 0, 0, false, false, null, RANDOM);
        }
        }__CLR4_1_241h41hl3lqxrw3.R.inc(5331);return random(count, chars.toCharArray());
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}

    /**
     * <p>Creates a random string whose length is the number of characters
     * specified.</p>
     *
     * <p>Characters will be chosen from the set of characters specified.</p>
     *
     * @param count  the length of random string to create
     * @param chars  the character array containing the set of characters to use,
     *  may be null
     * @return the random string
     * @throws IllegalArgumentException if {@code count} &lt; 0.
     */
    public static String random(final int count, final char... chars) {try{__CLR4_1_241h41hl3lqxrw3.R.inc(5332);
        __CLR4_1_241h41hl3lqxrw3.R.inc(5333);if ((((chars == null)&&(__CLR4_1_241h41hl3lqxrw3.R.iget(5334)!=0|true))||(__CLR4_1_241h41hl3lqxrw3.R.iget(5335)==0&false))) {{
            __CLR4_1_241h41hl3lqxrw3.R.inc(5336);return random(count, 0, 0, false, false, null, RANDOM);
        }
        }__CLR4_1_241h41hl3lqxrw3.R.inc(5337);return random(count, 0, chars.length, false, false, chars, RANDOM);
    }finally{__CLR4_1_241h41hl3lqxrw3.R.flushNeeded();}}
    
}
