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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.lang3.Validate;

/**
 * <p>FastDatePrinter is a fast and thread-safe version of
 * {@link java.text.SimpleDateFormat}.</p>
 *
 * <p>This class can be used as a direct replacement to
 * {@code SimpleDateFormat} in most formatting situations.
 * This class is especially useful in multi-threaded server environments.
 * {@code SimpleDateFormat} is not thread-safe in any JDK version,
 * nor will it be as Sun have closed the bug/RFE.
 * </p>
 *
 * <p>Only formatting is supported, but all patterns are compatible with
 * SimpleDateFormat (except time zones and some year patterns - see below).</p>
 *
 * <p>Java 1.4 introduced a new pattern letter, {@code 'Z'}, to represent
 * time zones in RFC822 format (eg. {@code +0800} or {@code -1100}).
 * This pattern letter can be used here (on all JDK versions).</p>
 *
 * <p>In addition, the pattern {@code 'ZZ'} has been made to represent
 * ISO8601 full format time zones (eg. {@code +08:00} or {@code -11:00}).
 * This introduces a minor incompatibility with Java 1.4, but at a gain of
 * useful functionality.</p>
 *
 * <p>Javadoc cites for the year pattern: <i>For formatting, if the number of
 * pattern letters is 2, the year is truncated to 2 digits; otherwise it is
 * interpreted as a number.</i> Starting with Java 1.7 a pattern of 'Y' or
 * 'YYY' will be formatted as '2003', while it was '03' in former Java
 * versions. FastDatePrinter implements the behavior of Java 7.</p>
 *
 * @since 3.2
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FastDatePrinter implements DatePrinter, Serializable {public static class __CLR4_1_2eaqeaql3lqxsuw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,18998,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // A lot of the speed in this class comes from caching, but some comes
    // from the special int to StringBuffer conversion.
    //
    // The following produces a padded 2 digit number:
    //   buffer.append((char)(value / 10 + '0'));
    //   buffer.append((char)(value % 10 + '0'));
    //
    // Note that the fastest append to StringBuffer is a single char (used here).
    // Note that Integer.toString() is not called, the conversion is simply
    // taking the value and adding (mathematically) the ASCII value for '0'.
    // So, don't change this code! It works and is very fast.

    /**
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * FULL locale dependent date or time style.
     */
    public static final int FULL = DateFormat.FULL;
    /**
     * LONG locale dependent date or time style.
     */
    public static final int LONG = DateFormat.LONG;
    /**
     * MEDIUM locale dependent date or time style.
     */
    public static final int MEDIUM = DateFormat.MEDIUM;
    /**
     * SHORT locale dependent date or time style.
     */
    public static final int SHORT = DateFormat.SHORT;

    /**
     * The pattern.
     */
    private final String mPattern;
    /**
     * The time zone.
     */
    private final TimeZone mTimeZone;
    /**
     * The locale.
     */
    private final Locale mLocale;
    /**
     * The parsed rules.
     */
    private transient Rule[] mRules;
    /**
     * The estimated maximum length.
     */
    private transient int mMaxLengthEstimate;

    // Constructor
    //-----------------------------------------------------------------------
    /**
     * <p>Constructs a new FastDatePrinter.</p>
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern
     * @param timeZone  non-null time zone to use
     * @param locale  non-null locale to use
     * @throws NullPointerException if pattern, timeZone, or locale is null.
     */
    protected FastDatePrinter(final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18530);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18531);mPattern = pattern;
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18532);mTimeZone = timeZone;
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18533);mLocale = locale;

        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18534);init();
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /**
     * <p>Initializes the instance for first use.</p>
     */
    private void init() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18535);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18536);final List<Rule> rulesList = parsePattern();
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18537);mRules = rulesList.toArray(new Rule[rulesList.size()]);

        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18538);int len = 0;
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18539);for (int i=mRules.length; (((--i >= 0)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18540)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18541)==0&false)); ) {{
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18542);len += mRules[i].estimateLength();
        }

        }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18543);mMaxLengthEstimate = len;
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    // Parse the pattern
    //-----------------------------------------------------------------------
    /**
     * <p>Returns a list of Rules given a pattern.</p>
     *
     * @return a {@code List} of Rule objects
     * @throws IllegalArgumentException if pattern is invalid
     */
    protected List<Rule> parsePattern() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18544);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18545);final DateFormatSymbols symbols = new DateFormatSymbols(mLocale);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18546);final List<Rule> rules = new ArrayList<Rule>();

        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18547);final String[] ERAs = symbols.getEras();
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18548);final String[] months = symbols.getMonths();
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18549);final String[] shortMonths = symbols.getShortMonths();
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18550);final String[] weekdays = symbols.getWeekdays();
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18551);final String[] shortWeekdays = symbols.getShortWeekdays();
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18552);final String[] AmPmStrings = symbols.getAmPmStrings();

        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18553);final int length = mPattern.length();
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18554);final int[] indexRef = new int[1];

        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18555);for (int i = 0; (((i < length)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18556)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18557)==0&false)); i++) {{
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18558);indexRef[0] = i;
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18559);final String token = parseToken(mPattern, indexRef);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18560);i = indexRef[0];

            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18561);final int tokenLen = token.length();
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18562);if ((((tokenLen == 0)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18563)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18564)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18565);break;
            }

            }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18566);Rule rule;
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18567);final char c = token.charAt(0);

            boolean __CLB4_1_2_bool0=false;__CLR4_1_2eaqeaql3lqxsuw.R.inc(18568);switch (c) {
            case 'G':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18569);__CLB4_1_2_bool0=true;} // era designator (text)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18570);rule = new TextField(Calendar.ERA, ERAs);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18571);break;
            case 'y':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18572);__CLB4_1_2_bool0=true;} // year (number)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18573);if ((((tokenLen == 2)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18574)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18575)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18576);rule = TwoDigitYearField.INSTANCE;
                } }else {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18577);rule = selectNumberRule(Calendar.YEAR, (((tokenLen < 4 )&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18578)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18579)==0&false))? 4 : tokenLen);
                }
                }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18580);break;
            case 'M':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18581);__CLB4_1_2_bool0=true;} // month in year (text and number)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18582);if ((((tokenLen >= 4)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18583)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18584)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18585);rule = new TextField(Calendar.MONTH, months);
                } }else {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18586);if ((((tokenLen == 3)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18587)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18588)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18589);rule = new TextField(Calendar.MONTH, shortMonths);
                } }else {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18590);if ((((tokenLen == 2)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18591)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18592)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18593);rule = TwoDigitMonthField.INSTANCE;
                } }else {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18594);rule = UnpaddedMonthField.INSTANCE;
                }
                }}}__CLR4_1_2eaqeaql3lqxsuw.R.inc(18595);break;
            case 'd':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18596);__CLB4_1_2_bool0=true;} // day in month (number)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18597);rule = selectNumberRule(Calendar.DAY_OF_MONTH, tokenLen);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18598);break;
            case 'h':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18599);__CLB4_1_2_bool0=true;} // hour in am/pm (number, 1..12)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18600);rule = new TwelveHourField(selectNumberRule(Calendar.HOUR, tokenLen));
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18601);break;
            case 'H':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18602);__CLB4_1_2_bool0=true;} // hour in day (number, 0..23)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18603);rule = selectNumberRule(Calendar.HOUR_OF_DAY, tokenLen);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18604);break;
            case 'm':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18605);__CLB4_1_2_bool0=true;} // minute in hour (number)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18606);rule = selectNumberRule(Calendar.MINUTE, tokenLen);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18607);break;
            case 's':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18608);__CLB4_1_2_bool0=true;} // second in minute (number)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18609);rule = selectNumberRule(Calendar.SECOND, tokenLen);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18610);break;
            case 'S':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18611);__CLB4_1_2_bool0=true;} // millisecond (number)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18612);rule = selectNumberRule(Calendar.MILLISECOND, tokenLen);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18613);break;
            case 'E':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18614);__CLB4_1_2_bool0=true;} // day in week (text)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18615);rule = new TextField(Calendar.DAY_OF_WEEK, (((tokenLen < 4 )&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18616)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18617)==0&false))? shortWeekdays : weekdays);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18618);break;
            case 'D':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18619);__CLB4_1_2_bool0=true;} // day in year (number)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18620);rule = selectNumberRule(Calendar.DAY_OF_YEAR, tokenLen);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18621);break;
            case 'F':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18622);__CLB4_1_2_bool0=true;} // day of week in month (number)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18623);rule = selectNumberRule(Calendar.DAY_OF_WEEK_IN_MONTH, tokenLen);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18624);break;
            case 'w':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18625);__CLB4_1_2_bool0=true;} // week in year (number)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18626);rule = selectNumberRule(Calendar.WEEK_OF_YEAR, tokenLen);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18627);break;
            case 'W':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18628);__CLB4_1_2_bool0=true;} // week in month (number)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18629);rule = selectNumberRule(Calendar.WEEK_OF_MONTH, tokenLen);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18630);break;
            case 'a':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18631);__CLB4_1_2_bool0=true;} // am/pm marker (text)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18632);rule = new TextField(Calendar.AM_PM, AmPmStrings);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18633);break;
            case 'k':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18634);__CLB4_1_2_bool0=true;} // hour in day (1..24)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18635);rule = new TwentyFourHourField(selectNumberRule(Calendar.HOUR_OF_DAY, tokenLen));
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18636);break;
            case 'K':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18637);__CLB4_1_2_bool0=true;} // hour in am/pm (0..11)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18638);rule = selectNumberRule(Calendar.HOUR, tokenLen);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18639);break;
            case 'z':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18640);__CLB4_1_2_bool0=true;} // time zone (text)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18641);if ((((tokenLen >= 4)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18642)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18643)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18644);rule = new TimeZoneNameRule(mTimeZone, mLocale, TimeZone.LONG);
                } }else {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18645);rule = new TimeZoneNameRule(mTimeZone, mLocale, TimeZone.SHORT);
                }
                }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18646);break;
            case 'Z':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18647);__CLB4_1_2_bool0=true;} // time zone (value)
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18648);if ((((tokenLen == 1)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18649)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18650)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18651);rule = TimeZoneNumberRule.INSTANCE_NO_COLON;
                } }else {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18652);rule = TimeZoneNumberRule.INSTANCE_COLON;
                }
                }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18653);break;
            case '\'':if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18654);__CLB4_1_2_bool0=true;} // literal text
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18655);final String sub = token.substring(1);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18656);if ((((sub.length() == 1)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18657)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18658)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18659);rule = new CharacterLiteral(sub.charAt(0));
                } }else {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18660);rule = new StringLiteral(sub);
                }
                }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18661);break;
            default:if (!__CLB4_1_2_bool0) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18662);__CLB4_1_2_bool0=true;}
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18663);throw new IllegalArgumentException("Illegal pattern component: " + token);
            }

            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18664);rules.add(rule);
        }

        }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18665);return rules;
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /**
     * <p>Performs the parsing of tokens.</p>
     *
     * @param pattern  the pattern
     * @param indexRef  index references
     * @return parsed token
     */
    protected String parseToken(final String pattern, final int[] indexRef) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18666);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18667);final StringBuilder buf = new StringBuilder();

        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18668);int i = indexRef[0];
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18669);final int length = pattern.length();

        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18670);char c = pattern.charAt(i);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18671);if ((((c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18672)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18673)==0&false))) {{
            // Scan a run of the same character, which indicates a time
            // pattern.
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18674);buf.append(c);

            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18675);while ((((i + 1 < length)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18676)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18677)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18678);final char peek = pattern.charAt(i + 1);
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18679);if ((((peek == c)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18680)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18681)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18682);buf.append(c);
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18683);i++;
                } }else {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18684);break;
                }
            }}
        }} }else {{
            // This will identify token as text.
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18685);buf.append('\'');

            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18686);boolean inLiteral = false;

            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18687);for (; (((i < length)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18688)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18689)==0&false)); i++) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18690);c = pattern.charAt(i);

                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18691);if ((((c == '\'')&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18692)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18693)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18694);if ((((i + 1 < length && pattern.charAt(i + 1) == '\'')&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18695)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18696)==0&false))) {{
                        // '' is treated as escaped '
                        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18697);i++;
                        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18698);buf.append(c);
                    } }else {{
                        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18699);inLiteral = !inLiteral;
                    }
                }} }else {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18700);if ((((!inLiteral &&
                         (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'))&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18701)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18702)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18703);i--;
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18704);break;
                } }else {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18705);buf.append(c);
                }
            }}}
        }}

        }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18706);indexRef[0] = i;
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18707);return buf.toString();
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /**
     * <p>Gets an appropriate rule for the padding required.</p>
     *
     * @param field  the field to get a rule for
     * @param padding  the padding required
     * @return a new rule with the correct padding
     */
    protected NumberRule selectNumberRule(final int field, final int padding) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18708);
        boolean __CLB4_1_2_bool1=false;__CLR4_1_2eaqeaql3lqxsuw.R.inc(18709);switch (padding) {
        case 1:if (!__CLB4_1_2_bool1) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18710);__CLB4_1_2_bool1=true;}
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18711);return new UnpaddedNumberField(field);
        case 2:if (!__CLB4_1_2_bool1) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18712);__CLB4_1_2_bool1=true;}
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18713);return new TwoDigitNumberField(field);
        default:if (!__CLB4_1_2_bool1) {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18714);__CLB4_1_2_bool1=true;}
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18715);return new PaddedNumberField(field, padding);
        }
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    // Format methods
    //-----------------------------------------------------------------------
    /**
     * <p>Formats a {@code Date}, {@code Calendar} or
     * {@code Long} (milliseconds) object.</p>
     *
     * @param obj  the object to format
     * @param toAppendTo  the buffer to append to
     * @param pos  the position - ignored
     * @return the buffer passed in
     */
    @Override
    public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18716);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18717);if ((((obj instanceof Date)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18718)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18719)==0&false))) {{
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18720);return format((Date) obj, toAppendTo);
        } }else {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18721);if ((((obj instanceof Calendar)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18722)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18723)==0&false))) {{
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18724);return format((Calendar) obj, toAppendTo);
        } }else {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18725);if ((((obj instanceof Long)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18726)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18727)==0&false))) {{
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18728);return format(((Long) obj).longValue(), toAppendTo);
        } }else {{
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18729);throw new IllegalArgumentException("Unknown class: " +
                ((((obj == null )&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18730)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18731)==0&false))? "<null>" : obj.getClass().getName()));
        }
    }}}}finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(long)
     */
    @Override
    public String format(final long millis) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18732);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18733);final Calendar c = newCalendar();  // hard code GregorianCalendar
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18734);c.setTimeInMillis(millis);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18735);return applyRulesToString(c);
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    private String applyRulesToString(final Calendar c) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18736);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18737);return applyRules(c, new StringBuffer(mMaxLengthEstimate)).toString();
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    private GregorianCalendar newCalendar() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18738);
        // hard code GregorianCalendar
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18739);return new GregorianCalendar(mTimeZone, mLocale);
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date)
     */
    @Override
    public String format(final Date date) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18740);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18741);final Calendar c = newCalendar();  // hard code GregorianCalendar
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18742);c.setTime(date);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18743);return applyRulesToString(c);
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar)
     */
    @Override
    public String format(final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18744);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18745);return format(calendar, new StringBuffer(mMaxLengthEstimate)).toString();
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(long, java.lang.StringBuffer)
     */
    @Override
    public StringBuffer format(final long millis, final StringBuffer buf) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18746);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18747);return format(new Date(millis), buf);
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date, java.lang.StringBuffer)
     */
    @Override
    public StringBuffer format(final Date date, final StringBuffer buf) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18748);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18749);final Calendar c = newCalendar();  // hard code GregorianCalendar
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18750);c.setTime(date);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18751);return applyRules(c, buf);
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar, java.lang.StringBuffer)
     */
    @Override
    public StringBuffer format(final Calendar calendar, final StringBuffer buf) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18752);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18753);return applyRules(calendar, buf);
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /**
     * <p>Performs the formatting by applying the rules to the
     * specified calendar.</p>
     *
     * @param calendar  the calendar to format
     * @param buf  the buffer to format into
     * @return the specified string buffer
     */
    protected StringBuffer applyRules(final Calendar calendar, final StringBuffer buf) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18754);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18755);for (final Rule rule : mRules) {{
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18756);rule.appendTo(buf, calendar);
        }
        }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18757);return buf;
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    // Accessors
    //-----------------------------------------------------------------------
    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#getPattern()
     */
    @Override
    public String getPattern() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18758);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18759);return mPattern;
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#getTimeZone()
     */
    @Override
    public TimeZone getTimeZone() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18760);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18761);return mTimeZone;
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DatePrinter#getLocale()
     */
    @Override
    public Locale getLocale() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18762);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18763);return mLocale;
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /**
     * <p>Gets an estimate for the maximum string length that the
     * formatter will produce.</p>
     *
     * <p>The actual formatted length will almost always be less than or
     * equal to this amount.</p>
     *
     * @return the maximum formatted length
     */
    public int getMaxLengthEstimate() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18764);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18765);return mMaxLengthEstimate;
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    // Basics
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two objects for equality.</p>
     *
     * @param obj  the object to compare to
     * @return {@code true} if equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18766);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18767);if ((((obj instanceof FastDatePrinter == false)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18768)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18769)==0&false))) {{
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18770);return false;
        }
        }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18771);final FastDatePrinter other = (FastDatePrinter) obj;
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18772);return mPattern.equals(other.mPattern)
            && mTimeZone.equals(other.mTimeZone) 
            && mLocale.equals(other.mLocale);
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /**
     * <p>Returns a hashcode compatible with equals.</p>
     *
     * @return a hashcode compatible with equals
     */
    @Override
    public int hashCode() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18773);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18774);return mPattern.hashCode() + 13 * (mTimeZone.hashCode() + 13 * mLocale.hashCode());
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /**
     * <p>Gets a debugging string version of this formatter.</p>
     *
     * @return a debugging string
     */
    @Override
    public String toString() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18775);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18776);return "FastDatePrinter[" + mPattern + "," + mLocale + "," + mTimeZone.getID() + "]";
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    // Serializing
    //-----------------------------------------------------------------------
    /**
     * Create the object after serialization. This implementation reinitializes the
     * transient properties.
     *
     * @param in ObjectInputStream from which the object is being deserialized.
     * @throws IOException if there is an IO issue.
     * @throws ClassNotFoundException if a class cannot be found.
     */
    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18777);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18778);in.defaultReadObject();
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18779);init();
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    // Rules
    //-----------------------------------------------------------------------
    /**
     * <p>Inner class defining a rule.</p>
     */
    private interface Rule {
        /**
         * Returns the estimated lentgh of the result.
         *
         * @return the estimated length
         */
        int estimateLength();

        /**
         * Appends the value of the specified calendar to the output buffer based on the rule implementation.
         *
         * @param buffer the output buffer
         * @param calendar calendar to be appended
         */
        void appendTo(StringBuffer buffer, Calendar calendar);
    }

    /**
     * <p>Inner class defining a numeric rule.</p>
     */
    private interface NumberRule extends Rule {
        /**
         * Appends the specified value to the output buffer based on the rule implementation.
         *
         * @param buffer the output buffer
         * @param value the value to be appended
         */
        void appendTo(StringBuffer buffer, int value);
    }

    /**
     * <p>Inner class to output a constant single character.</p>
     */
    private static class CharacterLiteral implements Rule {
        private final char mValue;

        /**
         * Constructs a new instance of {@code CharacterLiteral}
         * to hold the specified value.
         *
         * @param value the character literal
         */
        CharacterLiteral(final char value) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18780);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18781);mValue = value;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18782);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18783);return 1;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18784);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18785);buffer.append(mValue);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a constant string.</p>
     */
    private static class StringLiteral implements Rule {
        private final String mValue;

        /**
         * Constructs a new instance of {@code StringLiteral}
         * to hold the specified value.
         *
         * @param value the string literal
         */
        StringLiteral(final String value) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18786);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18787);mValue = value;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18788);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18789);return mValue.length();
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18790);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18791);buffer.append(mValue);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output one of a set of values.</p>
     */
    private static class TextField implements Rule {
        private final int mField;
        private final String[] mValues;

        /**
         * Constructs an instance of {@code TextField}
         * with the specified field and values.
         *
         * @param field the field
         * @param values the field values
         */
        TextField(final int field, final String[] values) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18792);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18793);mField = field;
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18794);mValues = values;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18795);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18796);int max = 0;
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18797);for (int i=mValues.length; (((--i >= 0)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18798)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18799)==0&false)); ) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18800);final int len = mValues[i].length();
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18801);if ((((len > max)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18802)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18803)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18804);max = len;
                }
            }}
            }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18805);return max;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18806);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18807);buffer.append(mValues[calendar.get(mField)]);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output an unpadded number.</p>
     */
    private static class UnpaddedNumberField implements NumberRule {
        private final int mField;

        /**
         * Constructs an instance of {@code UnpadedNumberField} with the specified field.
         *
         * @param field the field
         */
        UnpaddedNumberField(final int field) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18808);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18809);mField = field;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18810);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18811);return 4;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18812);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18813);appendTo(buffer, calendar.get(mField));
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18814);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18815);if ((((value < 10)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18816)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18817)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18818);buffer.append((char)(value + '0'));
            } }else {__CLR4_1_2eaqeaql3lqxsuw.R.inc(18819);if ((((value < 100)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18820)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18821)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18822);buffer.append((char)(value / 10 + '0'));
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18823);buffer.append((char)(value % 10 + '0'));
            } }else {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18824);buffer.append(Integer.toString(value));
            }
        }}}finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output an unpadded month.</p>
     */
    private static class UnpaddedMonthField implements NumberRule {
        static final UnpaddedMonthField INSTANCE = new UnpaddedMonthField();

        /**
         * Constructs an instance of {@code UnpaddedMonthField}.
         *
         */
        UnpaddedMonthField() {
            super();__CLR4_1_2eaqeaql3lqxsuw.R.inc(18826);try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18825);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18827);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18828);return 2;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18829);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18830);appendTo(buffer, calendar.get(Calendar.MONTH) + 1);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18831);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18832);if ((((value < 10)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18833)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18834)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18835);buffer.append((char)(value + '0'));
            } }else {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18836);buffer.append((char)(value / 10 + '0'));
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18837);buffer.append((char)(value % 10 + '0'));
            }
        }}finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a padded number.</p>
     */
    private static class PaddedNumberField implements NumberRule {
        private final int mField;
        private final int mSize;

        /**
         * Constructs an instance of {@code PaddedNumberField}.
         *
         * @param field the field
         * @param size size of the output field
         */
        PaddedNumberField(final int field, final int size) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18838);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18839);if ((((size < 3)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18840)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18841)==0&false))) {{
                // Should use UnpaddedNumberField or TwoDigitNumberField.
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18842);throw new IllegalArgumentException();
            }
            }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18843);mField = field;
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18844);mSize = size;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18845);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18846);return 4;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18847);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18848);appendTo(buffer, calendar.get(mField));
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18849);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18850);if ((((value < 100)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18851)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18852)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18853);for (int i = mSize; (((--i >= 2)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18854)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18855)==0&false)); ) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18856);buffer.append('0');
                }
                }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18857);buffer.append((char)(value / 10 + '0'));
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18858);buffer.append((char)(value % 10 + '0'));
            } }else {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18859);int digits;
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18860);if ((((value < 1000)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18861)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18862)==0&false))) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18863);digits = 3;
                } }else {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18864);Validate.isTrue(value > -1, "Negative values should not be possible", value);
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18865);digits = Integer.toString(value).length();
                }
                }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18866);for (int i = mSize; (((--i >= digits)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18867)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18868)==0&false)); ) {{
                    __CLR4_1_2eaqeaql3lqxsuw.R.inc(18869);buffer.append('0');
                }
                }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18870);buffer.append(Integer.toString(value));
            }
        }}finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a two digit number.</p>
     */
    private static class TwoDigitNumberField implements NumberRule {
        private final int mField;

        /**
         * Constructs an instance of {@code TwoDigitNumberField} with the specified field.
         *
         * @param field the field
         */
        TwoDigitNumberField(final int field) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18871);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18872);mField = field;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18873);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18874);return 2;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18875);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18876);appendTo(buffer, calendar.get(mField));
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18877);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18878);if ((((value < 100)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18879)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18880)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18881);buffer.append((char)(value / 10 + '0'));
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18882);buffer.append((char)(value % 10 + '0'));
            } }else {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18883);buffer.append(Integer.toString(value));
            }
        }}finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a two digit year.</p>
     */
    private static class TwoDigitYearField implements NumberRule {
        static final TwoDigitYearField INSTANCE = new TwoDigitYearField();

        /**
         * Constructs an instance of {@code TwoDigitYearField}.
         */
        TwoDigitYearField() {
            super();__CLR4_1_2eaqeaql3lqxsuw.R.inc(18885);try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18884);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18886);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18887);return 2;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18888);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18889);appendTo(buffer, calendar.get(Calendar.YEAR) % 100);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18890);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18891);buffer.append((char)(value / 10 + '0'));
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18892);buffer.append((char)(value % 10 + '0'));
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a two digit month.</p>
     */
    private static class TwoDigitMonthField implements NumberRule {
        static final TwoDigitMonthField INSTANCE = new TwoDigitMonthField();

        /**
         * Constructs an instance of {@code TwoDigitMonthField}.
         */
        TwoDigitMonthField() {
            super();__CLR4_1_2eaqeaql3lqxsuw.R.inc(18894);try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18893);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18895);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18896);return 2;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18897);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18898);appendTo(buffer, calendar.get(Calendar.MONTH) + 1);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public final void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18899);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18900);buffer.append((char)(value / 10 + '0'));
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18901);buffer.append((char)(value % 10 + '0'));
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output the twelve hour field.</p>
     */
    private static class TwelveHourField implements NumberRule {
        private final NumberRule mRule;

        /**
         * Constructs an instance of {@code TwelveHourField} with the specified
         * {@code NumberRule}.
         *
         * @param rule the rule
         */
        TwelveHourField(final NumberRule rule) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18902);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18903);mRule = rule;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18904);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18905);return mRule.estimateLength();
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18906);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18907);int value = calendar.get(Calendar.HOUR);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18908);if ((((value == 0)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18909)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18910)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18911);value = calendar.getLeastMaximum(Calendar.HOUR) + 1;
            }
            }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18912);mRule.appendTo(buffer, value);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18913);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18914);mRule.appendTo(buffer, value);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output the twenty four hour field.</p>
     */
    private static class TwentyFourHourField implements NumberRule {
        private final NumberRule mRule;

        /**
         * Constructs an instance of {@code TwentyFourHourField} with the specified
         * {@code NumberRule}.
         *
         * @param rule the rule
         */
        TwentyFourHourField(final NumberRule rule) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18915);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18916);mRule = rule;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18917);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18918);return mRule.estimateLength();
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18919);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18920);int value = calendar.get(Calendar.HOUR_OF_DAY);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18921);if ((((value == 0)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18922)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18923)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18924);value = calendar.getMaximum(Calendar.HOUR_OF_DAY) + 1;
            }
            }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18925);mRule.appendTo(buffer, value);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final int value) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18926);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18927);mRule.appendTo(buffer, value);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    private static ConcurrentMap<TimeZoneDisplayKey, String> cTimeZoneDisplayCache =
        new ConcurrentHashMap<TimeZoneDisplayKey, String>(7);
    /**
     * <p>Gets the time zone display name, using a cache for performance.</p>
     *
     * @param tz  the zone to query
     * @param daylight  true if daylight savings
     * @param style  the style to use {@code TimeZone.LONG} or {@code TimeZone.SHORT}
     * @param locale  the locale to use
     * @return the textual name of the time zone
     */
    static String getTimeZoneDisplay(final TimeZone tz, final boolean daylight, final int style, final Locale locale) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18928);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18929);final TimeZoneDisplayKey key = new TimeZoneDisplayKey(tz, daylight, style, locale);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18930);String value = cTimeZoneDisplayCache.get(key);
        __CLR4_1_2eaqeaql3lqxsuw.R.inc(18931);if ((((value == null)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18932)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18933)==0&false))) {{
            // This is a very slow call, so cache the results.
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18934);value = tz.getDisplayName(daylight, style, locale);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18935);final String prior = cTimeZoneDisplayCache.putIfAbsent(key, value);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18936);if ((((prior != null)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18937)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18938)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18939);value= prior;
            }
        }}
        }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18940);return value;
    }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

    /**
     * <p>Inner class to output a time zone name.</p>
     */
    private static class TimeZoneNameRule implements Rule {
        private final Locale mLocale;
        private final int mStyle;
        private final String mStandard;
        private final String mDaylight;

        /**
         * Constructs an instance of {@code TimeZoneNameRule} with the specified properties.
         *
         * @param timeZone the time zone
         * @param locale the locale
         * @param style the style
         */
        TimeZoneNameRule(final TimeZone timeZone, final Locale locale, final int style) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18941);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18942);mLocale = locale;
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18943);mStyle = style;
            
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18944);mStandard = getTimeZoneDisplay(timeZone, false, style, locale);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18945);mDaylight = getTimeZoneDisplay(timeZone, true, style, locale);
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18946);
            // We have no access to the Calendar object that will be passed to
            // appendTo so base estimate on the TimeZone passed to the
            // constructor
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18947);return Math.max(mStandard.length(), mDaylight.length());
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18948);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18949);final TimeZone zone = calendar.getTimeZone();
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18950);if ((((zone.useDaylightTime()
                    && calendar.get(Calendar.DST_OFFSET) != 0)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18951)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18952)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18953);buffer.append(getTimeZoneDisplay(zone, true, mStyle, mLocale));
            } }else {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18954);buffer.append(getTimeZoneDisplay(zone, false, mStyle, mLocale));
            }
        }}finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    /**
     * <p>Inner class to output a time zone as a number {@code +/-HHMM}
     * or {@code +/-HH:MM}.</p>
     */
    private static class TimeZoneNumberRule implements Rule {
        static final TimeZoneNumberRule INSTANCE_COLON = new TimeZoneNumberRule(true);
        static final TimeZoneNumberRule INSTANCE_NO_COLON = new TimeZoneNumberRule(false);

        final boolean mColon;

        /**
         * Constructs an instance of {@code TimeZoneNumberRule} with the specified properties.
         *
         * @param colon add colon between HH and MM in the output if {@code true}
         */
        TimeZoneNumberRule(final boolean colon) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18955);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18956);mColon = colon;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int estimateLength() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18957);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18958);return 5;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public void appendTo(final StringBuffer buffer, final Calendar calendar) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18959);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18960);int offset = calendar.get(Calendar.ZONE_OFFSET) + calendar.get(Calendar.DST_OFFSET);

            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18961);if ((((offset < 0)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18962)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18963)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18964);buffer.append('-');
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18965);offset = -offset;
            } }else {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18966);buffer.append('+');
            }

            }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18967);final int hours = offset / (60 * 60 * 1000);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18968);buffer.append((char)(hours / 10 + '0'));
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18969);buffer.append((char)(hours % 10 + '0'));

            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18970);if ((((mColon)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18971)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18972)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18973);buffer.append(':');
            }

            }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18974);final int minutes = offset / (60 * 1000) - 60 * hours;
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18975);buffer.append((char)(minutes / 10 + '0'));
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18976);buffer.append((char)(minutes % 10 + '0'));
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }

    // ----------------------------------------------------------------------
    /**
     * <p>Inner class that acts as a compound key for time zone names.</p>
     */
    private static class TimeZoneDisplayKey {
        private final TimeZone mTimeZone;
        private final int mStyle;
        private final Locale mLocale;

        /**
         * Constructs an instance of {@code TimeZoneDisplayKey} with the specified properties.
         *
         * @param timeZone the time zone
         * @param daylight adjust the style for daylight saving time if {@code true}
         * @param style the timezone style
         * @param locale the timezone locale
         */
        TimeZoneDisplayKey(final TimeZone timeZone,
                           final boolean daylight, int style, final Locale locale) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18977);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18978);mTimeZone = timeZone;
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18979);if ((((daylight)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18980)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18981)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18982);style |= 0x80000000;
            }
            }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18983);mStyle = style;
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18984);mLocale = locale;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18985);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18986);return (mStyle * 31 + mLocale.hashCode() ) * 31 + mTimeZone.hashCode();
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(final Object obj) {try{__CLR4_1_2eaqeaql3lqxsuw.R.inc(18987);
            __CLR4_1_2eaqeaql3lqxsuw.R.inc(18988);if ((((this == obj)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18989)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18990)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18991);return true;
            }
            }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18992);if ((((obj instanceof TimeZoneDisplayKey)&&(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18993)!=0|true))||(__CLR4_1_2eaqeaql3lqxsuw.R.iget(18994)==0&false))) {{
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18995);final TimeZoneDisplayKey other = (TimeZoneDisplayKey)obj;
                __CLR4_1_2eaqeaql3lqxsuw.R.inc(18996);return
                    mTimeZone.equals(other.mTimeZone) &&
                    mStyle == other.mStyle &&
                    mLocale.equals(other.mLocale);
            }
            }__CLR4_1_2eaqeaql3lqxsuw.R.inc(18997);return false;
        }finally{__CLR4_1_2eaqeaql3lqxsuw.R.flushNeeded();}}
    }
}
