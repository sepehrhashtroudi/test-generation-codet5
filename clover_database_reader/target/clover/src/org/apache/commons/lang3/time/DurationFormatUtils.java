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
package org.apache.commons.lang3.time;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>Duration formatting utilities and constants. The following table describes the tokens 
 * used in the pattern language for formatting. </p>
 * <table border="1">
 *  <tr><th>character</th><th>duration element</th></tr>
 *  <tr><td>y</td><td>years</td></tr>
 *  <tr><td>M</td><td>months</td></tr>
 *  <tr><td>d</td><td>days</td></tr>
 *  <tr><td>H</td><td>hours</td></tr>
 *  <tr><td>m</td><td>minutes</td></tr>
 *  <tr><td>s</td><td>seconds</td></tr>
 *  <tr><td>S</td><td>milliseconds</td></tr>
 * </table>
 *
 * @since 2.1
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DurationFormatUtils {public static class __CLR4_1_2dovdovl3lqxst1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,18133,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>DurationFormatUtils instances should NOT be constructed in standard programming.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public DurationFormatUtils() {
        super();__CLR4_1_2dovdovl3lqxst1.R.inc(17744);try{__CLR4_1_2dovdovl3lqxst1.R.inc(17743);
    }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

    /**
     * <p>Pattern used with <code>FastDateFormat</code> and <code>SimpleDateFormat</code>
     * for the ISO8601 period format used in durations.</p>
     * 
     * @see org.apache.commons.lang3.time.FastDateFormat
     * @see java.text.SimpleDateFormat
     */
    public static final String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'";

    //-----------------------------------------------------------------------
    /**
     * <p>Formats the time gap as a string.</p>
     * 
     * <p>The format used is ISO8601-like:
     * <i>H</i>:<i>m</i>:<i>s</i>.<i>S</i>.</p>
     * 
     * @param durationMillis  the duration to format
     * @return the formatted duration, not null
     */
    public static String formatDurationHMS(final long durationMillis) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(17745);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17746);return formatDuration(durationMillis, "H:mm:ss.SSS");
    }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string.</p>
     * 
     * <p>The format used is the ISO8601 period format.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * ISO format pattern, such as P7D6TH5M4.321S.</p>
     * 
     * @param durationMillis  the duration to format
     * @return the formatted duration, not null
     */
    public static String formatDurationISO(final long durationMillis) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(17747);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17748);return formatDuration(durationMillis, ISO_EXTENDED_FORMAT_PATTERN, false);
    }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format, and padding with zeros and 
     * using the default timezone.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * format pattern. Months and larger are not used.</p>
     * 
     * @param durationMillis  the duration to format
     * @param format  the way in which to format the duration, not null
     * @return the formatted duration, not null
     */
    public static String formatDuration(final long durationMillis, final String format) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(17749);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17750);return formatDuration(durationMillis, format, true);
    }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format.
     * Padding the left hand side of numbers with zeroes is optional and 
     * the timezone may be specified.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * format pattern. Months and larger are not used.</p>
     * 
     * @param durationMillis  the duration to format
     * @param format  the way in which to format the duration, not null
     * @param padWithZeros  whether to pad the left hand side of numbers with 0's
     * @return the formatted duration, not null
     */
    public static String formatDuration(long durationMillis, final String format, final boolean padWithZeros) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(17751);

        __CLR4_1_2dovdovl3lqxst1.R.inc(17752);final Token[] tokens = lexx(format);

        __CLR4_1_2dovdovl3lqxst1.R.inc(17753);int days         = 0;
        __CLR4_1_2dovdovl3lqxst1.R.inc(17754);int hours        = 0;
        __CLR4_1_2dovdovl3lqxst1.R.inc(17755);int minutes      = 0;
        __CLR4_1_2dovdovl3lqxst1.R.inc(17756);int seconds      = 0;
        __CLR4_1_2dovdovl3lqxst1.R.inc(17757);int milliseconds = 0;
        
        __CLR4_1_2dovdovl3lqxst1.R.inc(17758);if ((((Token.containsTokenWithValue(tokens, d) )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17759)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17760)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17761);days = (int) (durationMillis / DateUtils.MILLIS_PER_DAY);
            __CLR4_1_2dovdovl3lqxst1.R.inc(17762);durationMillis = durationMillis - (days * DateUtils.MILLIS_PER_DAY);
        }
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17763);if ((((Token.containsTokenWithValue(tokens, H) )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17764)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17765)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17766);hours = (int) (durationMillis / DateUtils.MILLIS_PER_HOUR);
            __CLR4_1_2dovdovl3lqxst1.R.inc(17767);durationMillis = durationMillis - (hours * DateUtils.MILLIS_PER_HOUR);
        }
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17768);if ((((Token.containsTokenWithValue(tokens, m) )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17769)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17770)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17771);minutes = (int) (durationMillis / DateUtils.MILLIS_PER_MINUTE);
            __CLR4_1_2dovdovl3lqxst1.R.inc(17772);durationMillis = durationMillis - (minutes * DateUtils.MILLIS_PER_MINUTE);
        }
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17773);if ((((Token.containsTokenWithValue(tokens, s) )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17774)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17775)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17776);seconds = (int) (durationMillis / DateUtils.MILLIS_PER_SECOND);
            __CLR4_1_2dovdovl3lqxst1.R.inc(17777);durationMillis = durationMillis - (seconds * DateUtils.MILLIS_PER_SECOND);
        }
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17778);if ((((Token.containsTokenWithValue(tokens, S) )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17779)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17780)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17781);milliseconds = (int) durationMillis;
        }

        }__CLR4_1_2dovdovl3lqxst1.R.inc(17782);return format(tokens, 0, 0, days, hours, minutes, seconds, milliseconds, padWithZeros);
    }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

    /**
     * <p>Formats an elapsed time into a plurialization correct string.</p>
     * 
     * <p>This method formats durations using the days and lower fields of the
     * format pattern. Months and larger are not used.</p>
     * 
     * @param durationMillis  the elapsed time to report in milliseconds
     * @param suppressLeadingZeroElements  suppresses leading 0 elements
     * @param suppressTrailingZeroElements  suppresses trailing 0 elements
     * @return the formatted text in days/hours/minutes/seconds, not null
     */
    public static String formatDurationWords(
        final long durationMillis,
        final boolean suppressLeadingZeroElements,
        final boolean suppressTrailingZeroElements) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(17783);

        // This method is generally replacable by the format method, but 
        // there are a series of tweaks and special cases that require 
        // trickery to replicate.
        __CLR4_1_2dovdovl3lqxst1.R.inc(17784);String duration = formatDuration(durationMillis, "d' days 'H' hours 'm' minutes 's' seconds'");
        __CLR4_1_2dovdovl3lqxst1.R.inc(17785);if ((((suppressLeadingZeroElements)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17786)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17787)==0&false))) {{
            // this is a temporary marker on the front. Like ^ in regexp.
            __CLR4_1_2dovdovl3lqxst1.R.inc(17788);duration = " " + duration;
            __CLR4_1_2dovdovl3lqxst1.R.inc(17789);String tmp = StringUtils.replaceOnce(duration, " 0 days", "");
            __CLR4_1_2dovdovl3lqxst1.R.inc(17790);if ((((tmp.length() != duration.length())&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17791)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17792)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(17793);duration = tmp;
                __CLR4_1_2dovdovl3lqxst1.R.inc(17794);tmp = StringUtils.replaceOnce(duration, " 0 hours", "");
                __CLR4_1_2dovdovl3lqxst1.R.inc(17795);if ((((tmp.length() != duration.length())&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17796)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17797)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17798);duration = tmp;
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17799);tmp = StringUtils.replaceOnce(duration, " 0 minutes", "");
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17800);duration = tmp;
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17801);if ((((tmp.length() != duration.length())&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17802)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17803)==0&false))) {{
                        __CLR4_1_2dovdovl3lqxst1.R.inc(17804);duration = StringUtils.replaceOnce(tmp, " 0 seconds", "");
                    }
                }}
            }}
            }__CLR4_1_2dovdovl3lqxst1.R.inc(17805);if ((((duration.length() != 0)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17806)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17807)==0&false))) {{
                // strip the space off again
                __CLR4_1_2dovdovl3lqxst1.R.inc(17808);duration = duration.substring(1);
            }
        }}
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17809);if ((((suppressTrailingZeroElements)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17810)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17811)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17812);String tmp = StringUtils.replaceOnce(duration, " 0 seconds", "");
            __CLR4_1_2dovdovl3lqxst1.R.inc(17813);if ((((tmp.length() != duration.length())&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17814)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17815)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(17816);duration = tmp;
                __CLR4_1_2dovdovl3lqxst1.R.inc(17817);tmp = StringUtils.replaceOnce(duration, " 0 minutes", "");
                __CLR4_1_2dovdovl3lqxst1.R.inc(17818);if ((((tmp.length() != duration.length())&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17819)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17820)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17821);duration = tmp;
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17822);tmp = StringUtils.replaceOnce(duration, " 0 hours", "");
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17823);if ((((tmp.length() != duration.length())&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17824)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17825)==0&false))) {{
                        __CLR4_1_2dovdovl3lqxst1.R.inc(17826);duration = StringUtils.replaceOnce(tmp, " 0 days", "");
                    }
                }}
            }}
        }}
        // handle plurals
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17827);duration = " " + duration;
        __CLR4_1_2dovdovl3lqxst1.R.inc(17828);duration = StringUtils.replaceOnce(duration, " 1 seconds", " 1 second");
        __CLR4_1_2dovdovl3lqxst1.R.inc(17829);duration = StringUtils.replaceOnce(duration, " 1 minutes", " 1 minute");
        __CLR4_1_2dovdovl3lqxst1.R.inc(17830);duration = StringUtils.replaceOnce(duration, " 1 hours", " 1 hour");
        __CLR4_1_2dovdovl3lqxst1.R.inc(17831);duration = StringUtils.replaceOnce(duration, " 1 days", " 1 day");
        __CLR4_1_2dovdovl3lqxst1.R.inc(17832);return duration.trim();
    }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Formats the time gap as a string.</p>
     * 
     * <p>The format used is the ISO8601 period format.</p>
     * 
     * @param startMillis  the start of the duration to format
     * @param endMillis  the end of the duration to format
     * @return the formatted duration, not null
     */
    public static String formatPeriodISO(final long startMillis, final long endMillis) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(17833);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17834);return formatPeriod(startMillis, endMillis, ISO_EXTENDED_FORMAT_PATTERN, false, TimeZone.getDefault());
    }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format.
     * Padding the left hand side of numbers with zeroes is optional.
     * 
     * @param startMillis  the start of the duration
     * @param endMillis  the end of the duration
     * @param format  the way in which to format the duration, not null
     * @return the formatted duration, not null
     */
    public static String formatPeriod(final long startMillis, final long endMillis, final String format) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(17835);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17836);return formatPeriod(startMillis, endMillis, format, true, TimeZone.getDefault());
    }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

    /**
     * <p>Formats the time gap as a string, using the specified format.
     * Padding the left hand side of numbers with zeroes is optional and 
     * the timezone may be specified. </p>
     *
     * <p>When calculating the difference between months/days, it chooses to 
     * calculate months first. So when working out the number of months and 
     * days between January 15th and March 10th, it choose 1 month and 
     * 23 days gained by choosing January->February = 1 month and then 
     * calculating days forwards, and not the 1 month and 26 days gained by 
     * choosing March -> February = 1 month and then calculating days 
     * backwards. </p>
     *
     * <p>For more control, the <a href="http://joda-time.sf.net/">Joda-Time</a>
     * library is recommended.</p>
     * 
     * @param startMillis  the start of the duration
     * @param endMillis  the end of the duration
     * @param format  the way in which to format the duration, not null
     * @param padWithZeros  whether to pad the left hand side of numbers with 0's
     * @param timezone  the millis are defined in
     * @return the formatted duration, not null
     */
    public static String formatPeriod(final long startMillis, final long endMillis, final String format, final boolean padWithZeros, 
            final TimeZone timezone) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(17837);

        // Used to optimise for differences under 28 days and 
        // called formatDuration(millis, format); however this did not work 
        // over leap years. 
        // TODO: Compare performance to see if anything was lost by 
        // losing this optimisation. 
        
        __CLR4_1_2dovdovl3lqxst1.R.inc(17838);final Token[] tokens = lexx(format);

        // timezones get funky around 0, so normalizing everything to GMT 
        // stops the hours being off
        __CLR4_1_2dovdovl3lqxst1.R.inc(17839);final Calendar start = Calendar.getInstance(timezone);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17840);start.setTime(new Date(startMillis));
        __CLR4_1_2dovdovl3lqxst1.R.inc(17841);final Calendar end = Calendar.getInstance(timezone);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17842);end.setTime(new Date(endMillis));

        // initial estimates
        __CLR4_1_2dovdovl3lqxst1.R.inc(17843);int milliseconds = end.get(Calendar.MILLISECOND) - start.get(Calendar.MILLISECOND);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17844);int seconds = end.get(Calendar.SECOND) - start.get(Calendar.SECOND);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17845);int minutes = end.get(Calendar.MINUTE) - start.get(Calendar.MINUTE);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17846);int hours = end.get(Calendar.HOUR_OF_DAY) - start.get(Calendar.HOUR_OF_DAY);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17847);int days = end.get(Calendar.DAY_OF_MONTH) - start.get(Calendar.DAY_OF_MONTH);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17848);int months = end.get(Calendar.MONTH) - start.get(Calendar.MONTH);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17849);int years = end.get(Calendar.YEAR) - start.get(Calendar.YEAR);

        // each initial estimate is adjusted in case it is under 0
        __CLR4_1_2dovdovl3lqxst1.R.inc(17850);while ((((milliseconds < 0)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17851)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17852)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17853);milliseconds += 1000;
            __CLR4_1_2dovdovl3lqxst1.R.inc(17854);seconds -= 1;
        }
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17855);while ((((seconds < 0)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17856)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17857)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17858);seconds += 60;
            __CLR4_1_2dovdovl3lqxst1.R.inc(17859);minutes -= 1;
        }
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17860);while ((((minutes < 0)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17861)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17862)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17863);minutes += 60;
            __CLR4_1_2dovdovl3lqxst1.R.inc(17864);hours -= 1;
        }
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17865);while ((((hours < 0)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17866)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17867)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17868);hours += 24;
            __CLR4_1_2dovdovl3lqxst1.R.inc(17869);days -= 1;
        }
       
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17870);if ((((Token.containsTokenWithValue(tokens, M))&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17871)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17872)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17873);while ((((days < 0)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17874)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17875)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(17876);days += start.getActualMaximum(Calendar.DAY_OF_MONTH);
                __CLR4_1_2dovdovl3lqxst1.R.inc(17877);months -= 1;
                __CLR4_1_2dovdovl3lqxst1.R.inc(17878);start.add(Calendar.MONTH, 1);
            }

            }__CLR4_1_2dovdovl3lqxst1.R.inc(17879);while ((((months < 0)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17880)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17881)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(17882);months += 12;
                __CLR4_1_2dovdovl3lqxst1.R.inc(17883);years -= 1;
            }

            }__CLR4_1_2dovdovl3lqxst1.R.inc(17884);if ((((!Token.containsTokenWithValue(tokens, y) && years != 0)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17885)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17886)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(17887);while ((((years != 0)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17888)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17889)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17890);months += 12 * years;
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17891);years = 0;
                }
            }}
        }} }else {{
            // there are no M's in the format string

            __CLR4_1_2dovdovl3lqxst1.R.inc(17892);if( (((!Token.containsTokenWithValue(tokens, y) )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17893)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17894)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(17895);int target = end.get(Calendar.YEAR);
                __CLR4_1_2dovdovl3lqxst1.R.inc(17896);if ((((months < 0)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17897)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17898)==0&false))) {{
                    // target is end-year -1
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17899);target -= 1;
                }
                
                }__CLR4_1_2dovdovl3lqxst1.R.inc(17900);while ((((start.get(Calendar.YEAR) != target)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17901)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17902)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17903);days += start.getActualMaximum(Calendar.DAY_OF_YEAR) - start.get(Calendar.DAY_OF_YEAR);
                    
                    // Not sure I grok why this is needed, but the brutal tests show it is
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17904);if ((((start instanceof GregorianCalendar &&
                            start.get(Calendar.MONTH) == Calendar.FEBRUARY &&
                            start.get(Calendar.DAY_OF_MONTH) == 29)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17905)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17906)==0&false))) {{
                        __CLR4_1_2dovdovl3lqxst1.R.inc(17907);days += 1;
                    }
                    
                    }__CLR4_1_2dovdovl3lqxst1.R.inc(17908);start.add(Calendar.YEAR, 1);
                    
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17909);days += start.get(Calendar.DAY_OF_YEAR);
                }
                
                }__CLR4_1_2dovdovl3lqxst1.R.inc(17910);years = 0;
            }
            
            }__CLR4_1_2dovdovl3lqxst1.R.inc(17911);while( (((start.get(Calendar.MONTH) != end.get(Calendar.MONTH) )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17912)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17913)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(17914);days += start.getActualMaximum(Calendar.DAY_OF_MONTH);
                __CLR4_1_2dovdovl3lqxst1.R.inc(17915);start.add(Calendar.MONTH, 1);
            }
            
            }__CLR4_1_2dovdovl3lqxst1.R.inc(17916);months = 0;            

            __CLR4_1_2dovdovl3lqxst1.R.inc(17917);while ((((days < 0)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17918)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17919)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(17920);days += start.getActualMaximum(Calendar.DAY_OF_MONTH);
                __CLR4_1_2dovdovl3lqxst1.R.inc(17921);months -= 1;
                __CLR4_1_2dovdovl3lqxst1.R.inc(17922);start.add(Calendar.MONTH, 1);
            }
            
        }}

        // The rest of this code adds in values that 
        // aren't requested. This allows the user to ask for the 
        // number of months and get the real count and not just 0->11.

        }__CLR4_1_2dovdovl3lqxst1.R.inc(17923);if ((((!Token.containsTokenWithValue(tokens, d))&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17924)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17925)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17926);hours += 24 * days;
            __CLR4_1_2dovdovl3lqxst1.R.inc(17927);days = 0;
        }
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17928);if ((((!Token.containsTokenWithValue(tokens, H))&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17929)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17930)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17931);minutes += 60 * hours;
            __CLR4_1_2dovdovl3lqxst1.R.inc(17932);hours = 0;
        }
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17933);if ((((!Token.containsTokenWithValue(tokens, m))&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17934)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17935)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17936);seconds += 60 * minutes;
            __CLR4_1_2dovdovl3lqxst1.R.inc(17937);minutes = 0;
        }
        }__CLR4_1_2dovdovl3lqxst1.R.inc(17938);if ((((!Token.containsTokenWithValue(tokens, s))&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17939)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17940)==0&false))) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17941);milliseconds += 1000 * seconds;
            __CLR4_1_2dovdovl3lqxst1.R.inc(17942);seconds = 0;
        }

        }__CLR4_1_2dovdovl3lqxst1.R.inc(17943);return format(tokens, years, months, days, hours, minutes, seconds, milliseconds, padWithZeros);
    }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>The internal method to do the formatting.</p>
     * 
     * @param tokens  the tokens
     * @param years  the number of years
     * @param months  the number of months
     * @param days  the number of days
     * @param hours  the number of hours
     * @param minutes  the number of minutes
     * @param seconds  the number of seconds
     * @param milliseconds  the number of millis
     * @param padWithZeros  whether to pad
     * @return the formatted string
     */
    static String format(final Token[] tokens, final int years, final int months, final int days, final int hours, final int minutes, final int seconds,
            int milliseconds, final boolean padWithZeros) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(17944);
        __CLR4_1_2dovdovl3lqxst1.R.inc(17945);final StringBuilder buffer = new StringBuilder();
        __CLR4_1_2dovdovl3lqxst1.R.inc(17946);boolean lastOutputSeconds = false;
        __CLR4_1_2dovdovl3lqxst1.R.inc(17947);final int sz = tokens.length;
        __CLR4_1_2dovdovl3lqxst1.R.inc(17948);for (int i = 0; (((i < sz)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17949)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17950)==0&false)); i++) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(17951);final Token token = tokens[i];
            __CLR4_1_2dovdovl3lqxst1.R.inc(17952);final Object value = token.getValue();
            __CLR4_1_2dovdovl3lqxst1.R.inc(17953);final int count = token.getCount();
            __CLR4_1_2dovdovl3lqxst1.R.inc(17954);if ((((value instanceof StringBuilder)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17955)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17956)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(17957);buffer.append(value.toString());
            } }else {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(17958);if ((((value == y)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17959)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17960)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17961);buffer.append((((padWithZeros )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17962)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17963)==0&false))? StringUtils.leftPad(Integer.toString(years), count, '0') : Integer
                            .toString(years));
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17964);lastOutputSeconds = false;
                } }else {__CLR4_1_2dovdovl3lqxst1.R.inc(17965);if ((((value == M)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17966)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17967)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17968);buffer.append((((padWithZeros )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17969)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17970)==0&false))? StringUtils.leftPad(Integer.toString(months), count, '0') : Integer
                            .toString(months));
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17971);lastOutputSeconds = false;
                } }else {__CLR4_1_2dovdovl3lqxst1.R.inc(17972);if ((((value == d)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17973)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17974)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17975);buffer.append((((padWithZeros )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17976)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17977)==0&false))? StringUtils.leftPad(Integer.toString(days), count, '0') : Integer
                            .toString(days));
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17978);lastOutputSeconds = false;
                } }else {__CLR4_1_2dovdovl3lqxst1.R.inc(17979);if ((((value == H)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17980)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17981)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17982);buffer.append((((padWithZeros )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17983)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17984)==0&false))? StringUtils.leftPad(Integer.toString(hours), count, '0') : Integer
                            .toString(hours));
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17985);lastOutputSeconds = false;
                } }else {__CLR4_1_2dovdovl3lqxst1.R.inc(17986);if ((((value == m)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17987)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17988)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17989);buffer.append((((padWithZeros )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17990)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17991)==0&false))? StringUtils.leftPad(Integer.toString(minutes), count, '0') : Integer
                            .toString(minutes));
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17992);lastOutputSeconds = false;
                } }else {__CLR4_1_2dovdovl3lqxst1.R.inc(17993);if ((((value == s)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17994)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17995)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17996);buffer.append((((padWithZeros )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(17997)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(17998)==0&false))? StringUtils.leftPad(Integer.toString(seconds), count, '0') : Integer
                            .toString(seconds));
                    __CLR4_1_2dovdovl3lqxst1.R.inc(17999);lastOutputSeconds = true;
                } }else {__CLR4_1_2dovdovl3lqxst1.R.inc(18000);if ((((value == S)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18001)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18002)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18003);if ((((lastOutputSeconds)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18004)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18005)==0&false))) {{
                        __CLR4_1_2dovdovl3lqxst1.R.inc(18006);milliseconds += 1000;
                        __CLR4_1_2dovdovl3lqxst1.R.inc(18007);final String str = (((padWithZeros
                                )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18008)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18009)==0&false))? StringUtils.leftPad(Integer.toString(milliseconds), count, '0')
                                : Integer.toString(milliseconds);
                        __CLR4_1_2dovdovl3lqxst1.R.inc(18010);buffer.append(str.substring(1));
                    } }else {{
                        __CLR4_1_2dovdovl3lqxst1.R.inc(18011);buffer.append((((padWithZeros
                                )&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18012)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18013)==0&false))? StringUtils.leftPad(Integer.toString(milliseconds), count, '0')
                                : Integer.toString(milliseconds));
                    }
                    }__CLR4_1_2dovdovl3lqxst1.R.inc(18014);lastOutputSeconds = false;
                }
            }}}}}}}}
        }}
        }__CLR4_1_2dovdovl3lqxst1.R.inc(18015);return buffer.toString();
    }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

    static final Object y = "y";
    static final Object M = "M";
    static final Object d = "d";
    static final Object H = "H";
    static final Object m = "m";
    static final Object s = "s";
    static final Object S = "S";
    
    /**
     * Parses a classic date format string into Tokens
     *
     * @param format  the format to parse, not null
     * @return array of Token[]
     */
    static Token[] lexx(final String format) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(18016);
        __CLR4_1_2dovdovl3lqxst1.R.inc(18017);final char[] array = format.toCharArray();
        __CLR4_1_2dovdovl3lqxst1.R.inc(18018);final ArrayList<Token> list = new ArrayList<Token>(array.length);

        __CLR4_1_2dovdovl3lqxst1.R.inc(18019);boolean inLiteral = false;
        // Although the buffer is stored in a Token, the Tokens are only
        // used internally, so cannot be accessed by other threads
        __CLR4_1_2dovdovl3lqxst1.R.inc(18020);StringBuilder buffer = null;
        __CLR4_1_2dovdovl3lqxst1.R.inc(18021);Token previous = null;
        __CLR4_1_2dovdovl3lqxst1.R.inc(18022);final int sz = array.length;
        __CLR4_1_2dovdovl3lqxst1.R.inc(18023);for (int i = 0; (((i < sz)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18024)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18025)==0&false)); i++) {{
            __CLR4_1_2dovdovl3lqxst1.R.inc(18026);final char ch = array[i];
            __CLR4_1_2dovdovl3lqxst1.R.inc(18027);if ((((inLiteral && ch != '\'')&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18028)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18029)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(18030);buffer.append(ch); // buffer can't be null if inLiteral is true
                __CLR4_1_2dovdovl3lqxst1.R.inc(18031);continue;
            }
            }__CLR4_1_2dovdovl3lqxst1.R.inc(18032);Object value = null;
            boolean __CLB4_1_2_bool0=false;__CLR4_1_2dovdovl3lqxst1.R.inc(18033);switch (ch) {
            // TODO: Need to handle escaping of '
            case '\'':if (!__CLB4_1_2_bool0) {__CLR4_1_2dovdovl3lqxst1.R.inc(18034);__CLB4_1_2_bool0=true;}
                __CLR4_1_2dovdovl3lqxst1.R.inc(18035);if ((((inLiteral)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18036)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18037)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18038);buffer = null;
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18039);inLiteral = false;
                } }else {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18040);buffer = new StringBuilder();
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18041);list.add(new Token(buffer));
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18042);inLiteral = true;
                }
                }__CLR4_1_2dovdovl3lqxst1.R.inc(18043);break;
            case 'y':if (!__CLB4_1_2_bool0) {__CLR4_1_2dovdovl3lqxst1.R.inc(18044);__CLB4_1_2_bool0=true;}
                __CLR4_1_2dovdovl3lqxst1.R.inc(18045);value = y;
                __CLR4_1_2dovdovl3lqxst1.R.inc(18046);break;
            case 'M':if (!__CLB4_1_2_bool0) {__CLR4_1_2dovdovl3lqxst1.R.inc(18047);__CLB4_1_2_bool0=true;}
                __CLR4_1_2dovdovl3lqxst1.R.inc(18048);value = M;
                __CLR4_1_2dovdovl3lqxst1.R.inc(18049);break;
            case 'd':if (!__CLB4_1_2_bool0) {__CLR4_1_2dovdovl3lqxst1.R.inc(18050);__CLB4_1_2_bool0=true;}
                __CLR4_1_2dovdovl3lqxst1.R.inc(18051);value = d;
                __CLR4_1_2dovdovl3lqxst1.R.inc(18052);break;
            case 'H':if (!__CLB4_1_2_bool0) {__CLR4_1_2dovdovl3lqxst1.R.inc(18053);__CLB4_1_2_bool0=true;}
                __CLR4_1_2dovdovl3lqxst1.R.inc(18054);value = H;
                __CLR4_1_2dovdovl3lqxst1.R.inc(18055);break;
            case 'm':if (!__CLB4_1_2_bool0) {__CLR4_1_2dovdovl3lqxst1.R.inc(18056);__CLB4_1_2_bool0=true;}
                __CLR4_1_2dovdovl3lqxst1.R.inc(18057);value = m;
                __CLR4_1_2dovdovl3lqxst1.R.inc(18058);break;
            case 's':if (!__CLB4_1_2_bool0) {__CLR4_1_2dovdovl3lqxst1.R.inc(18059);__CLB4_1_2_bool0=true;}
                __CLR4_1_2dovdovl3lqxst1.R.inc(18060);value = s;
                __CLR4_1_2dovdovl3lqxst1.R.inc(18061);break;
            case 'S':if (!__CLB4_1_2_bool0) {__CLR4_1_2dovdovl3lqxst1.R.inc(18062);__CLB4_1_2_bool0=true;}
                __CLR4_1_2dovdovl3lqxst1.R.inc(18063);value = S;
                __CLR4_1_2dovdovl3lqxst1.R.inc(18064);break;
            default:if (!__CLB4_1_2_bool0) {__CLR4_1_2dovdovl3lqxst1.R.inc(18065);__CLB4_1_2_bool0=true;}
                __CLR4_1_2dovdovl3lqxst1.R.inc(18066);if ((((buffer == null)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18067)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18068)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18069);buffer = new StringBuilder();
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18070);list.add(new Token(buffer));
                }
                }__CLR4_1_2dovdovl3lqxst1.R.inc(18071);buffer.append(ch);
            }

            __CLR4_1_2dovdovl3lqxst1.R.inc(18072);if ((((value != null)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18073)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18074)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(18075);if ((((previous != null && previous.getValue() == value)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18076)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18077)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18078);previous.increment();
                } }else {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18079);final Token token = new Token(value);
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18080);list.add(token);
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18081);previous = token;
                }
                }__CLR4_1_2dovdovl3lqxst1.R.inc(18082);buffer = null;
            }
        }}
        }__CLR4_1_2dovdovl3lqxst1.R.inc(18083);return list.toArray(new Token[list.size()]);
    }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Element that is parsed from the format pattern.
     */
    static class Token {

        /**
         * Helper method to determine if a set of tokens contain a value
         *
         * @param tokens set to look in
         * @param value to look for
         * @return boolean <code>true</code> if contained
         */
        static boolean containsTokenWithValue(final Token[] tokens, final Object value) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(18084);
            __CLR4_1_2dovdovl3lqxst1.R.inc(18085);final int sz = tokens.length;
            __CLR4_1_2dovdovl3lqxst1.R.inc(18086);for (int i = 0; (((i < sz)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18087)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18088)==0&false)); i++) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(18089);if ((((tokens[i].getValue() == value)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18090)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18091)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18092);return true;
                }
            }}
            }__CLR4_1_2dovdovl3lqxst1.R.inc(18093);return false;
        }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

        private final Object value;
        private int count;

        /**
         * Wraps a token around a value. A value would be something like a 'Y'.
         *
         * @param value to wrap
         */
        Token(final Object value) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(18094);
            __CLR4_1_2dovdovl3lqxst1.R.inc(18095);this.value = value;
            __CLR4_1_2dovdovl3lqxst1.R.inc(18096);this.count = 1;
        }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

        /**
         * Wraps a token around a repeated number of a value, for example it would 
         * store 'yyyy' as a value for y and a count of 4.
         *
         * @param value to wrap
         * @param count to wrap
         */
        Token(final Object value, final int count) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(18097);
            __CLR4_1_2dovdovl3lqxst1.R.inc(18098);this.value = value;
            __CLR4_1_2dovdovl3lqxst1.R.inc(18099);this.count = count;
        }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

        /**
         * Adds another one of the value
         */
        void increment() {try{__CLR4_1_2dovdovl3lqxst1.R.inc(18100); 
            __CLR4_1_2dovdovl3lqxst1.R.inc(18101);count++;
        }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

        /**
         * Gets the current number of values represented
         *
         * @return int number of values represented
         */
        int getCount() {try{__CLR4_1_2dovdovl3lqxst1.R.inc(18102);
            __CLR4_1_2dovdovl3lqxst1.R.inc(18103);return count;
        }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

        /**
         * Gets the particular value this token represents.
         * 
         * @return Object value
         */
        Object getValue() {try{__CLR4_1_2dovdovl3lqxst1.R.inc(18104);
            __CLR4_1_2dovdovl3lqxst1.R.inc(18105);return value;
        }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

        /**
         * Supports equality of this Token to another Token.
         *
         * @param obj2 Object to consider equality of
         * @return boolean <code>true</code> if equal
         */
        @Override
        public boolean equals(final Object obj2) {try{__CLR4_1_2dovdovl3lqxst1.R.inc(18106);
            __CLR4_1_2dovdovl3lqxst1.R.inc(18107);if ((((obj2 instanceof Token)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18108)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18109)==0&false))) {{
                __CLR4_1_2dovdovl3lqxst1.R.inc(18110);final Token tok2 = (Token) obj2;
                __CLR4_1_2dovdovl3lqxst1.R.inc(18111);if ((((this.value.getClass() != tok2.value.getClass())&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18112)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18113)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18114);return false;
                }
                }__CLR4_1_2dovdovl3lqxst1.R.inc(18115);if ((((this.count != tok2.count)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18116)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18117)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18118);return false;
                }
                }__CLR4_1_2dovdovl3lqxst1.R.inc(18119);if ((((this.value instanceof StringBuilder)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18120)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18121)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18122);return this.value.toString().equals(tok2.value.toString());
                } }else {__CLR4_1_2dovdovl3lqxst1.R.inc(18123);if ((((this.value instanceof Number)&&(__CLR4_1_2dovdovl3lqxst1.R.iget(18124)!=0|true))||(__CLR4_1_2dovdovl3lqxst1.R.iget(18125)==0&false))) {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18126);return this.value.equals(tok2.value);
                } }else {{
                    __CLR4_1_2dovdovl3lqxst1.R.inc(18127);return this.value == tok2.value;
                }
            }}}
            }__CLR4_1_2dovdovl3lqxst1.R.inc(18128);return false;
        }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

        /**
         * Returns a hash code for the token equal to the 
         * hash code for the token's value. Thus 'TT' and 'TTTT' 
         * will have the same hash code. 
         *
         * @return The hash code for the token
         */
        @Override
        public int hashCode() {try{__CLR4_1_2dovdovl3lqxst1.R.inc(18129);
            __CLR4_1_2dovdovl3lqxst1.R.inc(18130);return this.value.hashCode();
        }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}

        /**
         * Represents this token as a String.
         *
         * @return String representation of the token
         */
        @Override
        public String toString() {try{__CLR4_1_2dovdovl3lqxst1.R.inc(18131);
            __CLR4_1_2dovdovl3lqxst1.R.inc(18132);return StringUtils.repeat(this.value.toString(), this.count);
        }finally{__CLR4_1_2dovdovl3lqxst1.R.flushNeeded();}}
    }

}
