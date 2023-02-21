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
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>FastDateParser is a fast and thread-safe version of
 * {@link java.text.SimpleDateFormat}.</p>
 *
 * <p>This class can be used as a direct replacement for
 * <code>SimpleDateFormat</code> in most parsing situations.
 * This class is especially useful in multi-threaded server environments.
 * <code>SimpleDateFormat</code> is not thread-safe in any JDK version,
 * nor will it be as Sun have closed the
 * <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4228335">bug</a>/RFE.
 * </p>
 *
 * <p>Only parsing is supported, but all patterns are compatible with
 * SimpleDateFormat.</p>
 *
 * <p>Timing tests indicate this class is as about as fast as SimpleDateFormat
 * in single thread applications and about 25% faster in multi-thread applications.</p>
 *
 * <p>Note that the code only handles Gregorian calendars. The following non-Gregorian
 * calendars use SimpleDateFormat internally, and so will be slower:
 * <ul>
 * <li>ja_JP_TH - Japanese Imperial</li>
 * <li>th_TH (any variant) - Thai Buddhist</li>
 * </ul>
 * </p>
 * @since 3.2
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class FastDateParser implements DateParser, Serializable {public static class __CLR4_1_2e1xe1xl3lqxstz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,18530,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;

    static final Locale JAPANESE_IMPERIAL = new Locale("ja","JP","JP");

    // defining fields
    private final String pattern;
    private final TimeZone timeZone;
    private final Locale locale;

    // derived fields
    private transient Pattern parsePattern;
    private transient Strategy[] strategies;
    private transient int thisYear;

    // dynamic fields to communicate with Strategy
    private transient String currentFormatField;
    private transient Strategy nextStrategy;

    /**
     * <p>Constructs a new FastDateParser.</p>
     *
     * @param pattern non-null {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone non-null time zone to use
     * @param locale non-null locale
     */
    protected FastDateParser(final String pattern, final TimeZone timeZone, final Locale locale) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18213);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18214);this.pattern = pattern;
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18215);this.timeZone = timeZone;
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18216);this.locale = locale;
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18217);init();
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /**
     * Initialize derived fields from defining fields.
     * This is called from constructor and from readObject (de-serialization)
     */
    private void init() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18218);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18219);final Calendar definingCalendar = Calendar.getInstance(timeZone, locale);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18220);thisYear= definingCalendar.get(Calendar.YEAR);

        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18221);final StringBuilder regex= new StringBuilder();
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18222);final List<Strategy> collector = new ArrayList<Strategy>();

        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18223);final Matcher patternMatcher= formatPattern.matcher(pattern);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18224);if((((!patternMatcher.lookingAt())&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18225)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18226)==0&false))) {{
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18227);throw new IllegalArgumentException(
                    "Illegal pattern character '" + pattern.charAt(patternMatcher.regionStart()) + "'");
        }

        }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18228);currentFormatField= patternMatcher.group();
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18229);Strategy currentStrategy= getStrategy(currentFormatField, definingCalendar);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18230);for(;;) {{
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18231);patternMatcher.region(patternMatcher.end(), patternMatcher.regionEnd());
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18232);if((((!patternMatcher.lookingAt())&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18233)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18234)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18235);nextStrategy = null;
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18236);break;
            }
            }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18237);final String nextFormatField= patternMatcher.group();
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18238);nextStrategy = getStrategy(nextFormatField, definingCalendar);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18239);if((((currentStrategy.addRegex(this, regex))&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18240)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18241)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18242);collector.add(currentStrategy);
            }
            }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18243);currentFormatField= nextFormatField;
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18244);currentStrategy= nextStrategy;
        }
        }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18245);if ((((patternMatcher.regionStart() != patternMatcher.regionEnd())&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18246)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18247)==0&false))) {{
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18248);throw new IllegalArgumentException("Failed to parse \""+pattern+"\" ; gave up at index "+patternMatcher.regionStart());
        }
        }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18249);if((((currentStrategy.addRegex(this, regex))&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18250)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18251)==0&false))) {{
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18252);collector.add(currentStrategy);
        }
        }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18253);currentFormatField= null;
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18254);strategies= collector.toArray(new Strategy[collector.size()]);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18255);parsePattern= Pattern.compile(regex.toString());
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    // Accessors
    //-----------------------------------------------------------------------
    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#getPattern()
     */
    @Override
    public String getPattern() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18256);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18257);return pattern;
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#getTimeZone()
     */
    @Override
    public TimeZone getTimeZone() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18258);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18259);return timeZone;
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#getLocale()
     */
    @Override
    public Locale getLocale() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18260);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18261);return locale;
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    // Give access to generated pattern for test code
    Pattern getParsePattern() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18262);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18263);return parsePattern;
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    // Basics
    //-----------------------------------------------------------------------
    /**
     * <p>Compare another object for equality with this object.</p>
     *
     * @param obj  the object to compare to
     * @return <code>true</code>if equal to this instance
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18264);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18265);if ((((! (obj instanceof FastDateParser) )&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18266)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18267)==0&false))) {{
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18268);return false;
        }
        }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18269);final FastDateParser other = (FastDateParser) obj;
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18270);return pattern.equals(other.pattern)
            && timeZone.equals(other.timeZone)
            && locale.equals(other.locale);
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /**
     * <p>Return a hashcode compatible with equals.</p>
     *
     * @return a hashcode compatible with equals
     */
    @Override
    public int hashCode() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18271);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18272);return pattern.hashCode() + 13 * (timeZone.hashCode() + 13 * locale.hashCode());
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /**
     * <p>Get a string version of this formatter.</p>
     *
     * @return a debugging string
     */
    @Override
    public String toString() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18273);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18274);return "FastDateParser[" + pattern + "," + locale + "," + timeZone.getID() + "]";
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

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
    private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18275);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18276);in.defaultReadObject();
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18277);init();
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String)
     */
    @Override
    public Object parseObject(final String source) throws ParseException {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18278);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18279);return parse(source);
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String)
     */
    @Override
    public Date parse(final String source) throws ParseException {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18280);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18281);final Date date= parse(source, new ParsePosition(0));
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18282);if((((date==null)&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18283)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18284)==0&false))) {{
            // Add a note re supported date range
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18285);if ((((locale.equals(JAPANESE_IMPERIAL))&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18286)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18287)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18288);throw new ParseException(
                        "(The " +locale + " locale does not support dates before 1868 AD)\n" +
                                "Unparseable date: \""+source+"\" does not match "+parsePattern.pattern(), 0);
            }
            }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18289);throw new ParseException("Unparseable date: \""+source+"\" does not match "+parsePattern.pattern(), 0);
        }
        }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18290);return date;
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parseObject(java.lang.String, java.text.ParsePosition)
     */
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18291);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18292);return parse(source, pos);
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.apache.commons.lang3.time.DateParser#parse(java.lang.String, java.text.ParsePosition)
     */
    @Override
    public Date parse(final String source, final ParsePosition pos) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18293);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18294);final int offset= pos.getIndex();
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18295);final Matcher matcher= parsePattern.matcher(source.substring(offset));
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18296);if((((!matcher.lookingAt())&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18297)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18298)==0&false))) {{
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18299);return null;
        }
        // timing tests indicate getting new instance is 19% faster than cloning
        }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18300);final Calendar cal= Calendar.getInstance(timeZone, locale);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18301);cal.clear();

        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18302);for(int i=0; (((i<strategies.length)&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18303)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18304)==0&false));) {{
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18305);final Strategy strategy= strategies[i++];
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18306);strategy.setCalendar(this, cal, matcher.group(i));
        }
        }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18307);pos.setIndex(offset+matcher.end());
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18308);return cal.getTime();
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    // Support for strategies
    //-----------------------------------------------------------------------

    /**
     * Escape constant fields into regular expression
     * @param regex The destination regex
     * @param value The source field
     * @param unquote If true, replace two success quotes ('') with single quote (')
     * @return The <code>StringBuilder</code>
     */
    private static StringBuilder escapeRegex(final StringBuilder regex, final String value, final boolean unquote) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18309);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18310);regex.append("\\Q");
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18311);for(int i= 0; (((i<value.length())&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18312)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18313)==0&false)); ++i) {{
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18314);char c= value.charAt(i);
            boolean __CLB4_1_2_bool0=false;__CLR4_1_2e1xe1xl3lqxstz.R.inc(18315);switch(c) {
            case '\'':if (!__CLB4_1_2_bool0) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18316);__CLB4_1_2_bool0=true;}
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18317);if((((unquote)&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18318)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18319)==0&false))) {{
                    __CLR4_1_2e1xe1xl3lqxstz.R.inc(18320);if((((++i==value.length())&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18321)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18322)==0&false))) {{
                        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18323);return regex;
                    }
                    }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18324);c= value.charAt(i);
                }
                }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18325);break;
            case '\\':if (!__CLB4_1_2_bool0) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18326);__CLB4_1_2_bool0=true;}
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18327);if((((++i==value.length())&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18328)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18329)==0&false))) {{
                    __CLR4_1_2e1xe1xl3lqxstz.R.inc(18330);break;
                }                
                /*
                 * If we have found \E, we replace it with \E\\E\Q, i.e. we stop the quoting,
                 * quote the \ in \E, then restart the quoting.
                 * 
                 * Otherwise we just output the two characters.
                 * In each case the initial \ needs to be output and the final char is done at the end
                 */
                }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18331);regex.append(c); // we always want the original \
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18332);c = value.charAt(i); // Is it followed by E ?
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18333);if ((((c == 'E')&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18334)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18335)==0&false))) {{ // \E detected
                  __CLR4_1_2e1xe1xl3lqxstz.R.inc(18336);regex.append("E\\\\E\\"); // see comment above
                  __CLR4_1_2e1xe1xl3lqxstz.R.inc(18337);c = 'Q'; // appended below
                }
                }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18338);break;
            }
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18339);regex.append(c);
        }
        }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18340);regex.append("\\E");
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18341);return regex;
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}


    /**
     * Get the short and long values displayed for a field
     * @param field The field of interest
     * @param definingCalendar The calendar to obtain the short and long values
     * @param locale The locale of display names
     * @return A Map of the field key / value pairs
     */
    private static Map<String, Integer> getDisplayNames(final int field, final Calendar definingCalendar, final Locale locale) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18342);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18343);return definingCalendar.getDisplayNames(field, Calendar.ALL_STYLES, locale);
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /**
     * Adjust dates to be within 80 years before and 20 years after instantiation
     * @param twoDigitYear The year to adjust
     * @return A value within -80 and +20 years from instantiation of this instance
     */
    int adjustYear(final int twoDigitYear) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18344);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18345);final int trial= twoDigitYear + thisYear - thisYear%100;
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18346);if((((trial < thisYear+20)&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18347)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18348)==0&false))) {{
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18349);return trial;
        }
        }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18350);return trial-100;
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /**
     * Is the next field a number?
     * @return true, if next field will be a number
     */
    boolean isNextNumber() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18351);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18352);return nextStrategy!=null && nextStrategy.isNumber();
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /**
     * What is the width of the current field?
     * @return The number of characters in the current format field
     */
    int getFieldWidth() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18353);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18354);return currentFormatField.length();
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /**
     * A strategy to parse a single field from the parsing pattern
     */
    private static abstract class Strategy {
        /**
         * Is this field a number?
         * The default implementation returns true.
         * 
         * @return true, if field is a number
         */
        boolean isNumber() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18355);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18356);return false;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}
        /**
         * Set the Calendar with the parsed field.
         * 
         * The default implementation does nothing.
         * 
         * @param parser The parser calling this strategy
         * @param cal The <code>Calendar</code> to set
         * @param value The parsed field to translate and set in cal
         */
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18357);
            
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}
        /**
         * Generate a <code>Pattern</code> regular expression to the <code>StringBuilder</code>
         * which will accept this field
         * @param parser The parser calling this strategy
         * @param regex The <code>StringBuilder</code> to append to
         * @return true, if this field will set the calendar;
         * false, if this field is a constant value
         */
        abstract boolean addRegex(FastDateParser parser, StringBuilder regex);
    }

    /**
     * A <code>Pattern</code> to parse the user supplied SimpleDateFormat pattern
     */
    private static final Pattern formatPattern= Pattern.compile(
            "D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");

    /**
     * Obtain a Strategy given a field from a SimpleDateFormat pattern
     * @param formatField A sub-sequence of the SimpleDateFormat pattern
     * @param definingCalendar The calendar to obtain the short and long values
     * @return The Strategy that will handle parsing for the field
     */
    private Strategy getStrategy(String formatField, final Calendar definingCalendar) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18358);
        boolean __CLB4_1_2_bool1=false;__CLR4_1_2e1xe1xl3lqxstz.R.inc(18359);switch(formatField.charAt(0)) {
        case '\'':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18360);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18361);if((((formatField.length()>2)&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18362)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18363)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18364);formatField= formatField.substring(1, formatField.length()-1);
            }
            //$FALL-THROUGH$
        }default:if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18365);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18366);return new CopyQuotedStrategy(formatField);
        case 'D':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18367);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18368);return DAY_OF_YEAR_STRATEGY;
        case 'E':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18369);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18370);return getLocaleSpecificStrategy(Calendar.DAY_OF_WEEK, definingCalendar);
        case 'F':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18371);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18372);return DAY_OF_WEEK_IN_MONTH_STRATEGY;
        case 'G':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18373);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18374);return getLocaleSpecificStrategy(Calendar.ERA, definingCalendar);
        case 'H':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18375);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18376);return MODULO_HOUR_OF_DAY_STRATEGY;
        case 'K':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18377);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18378);return HOUR_STRATEGY;
        case 'M':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18379);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18380);return (((formatField.length()>=3 )&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18381)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18382)==0&false))?getLocaleSpecificStrategy(Calendar.MONTH, definingCalendar) :NUMBER_MONTH_STRATEGY;
        case 'S':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18383);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18384);return MILLISECOND_STRATEGY;
        case 'W':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18385);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18386);return WEEK_OF_MONTH_STRATEGY;
        case 'a':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18387);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18388);return getLocaleSpecificStrategy(Calendar.AM_PM, definingCalendar);
        case 'd':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18389);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18390);return DAY_OF_MONTH_STRATEGY;
        case 'h':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18391);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18392);return MODULO_HOUR_STRATEGY;
        case 'k':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18393);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18394);return HOUR_OF_DAY_STRATEGY;
        case 'm':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18395);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18396);return MINUTE_STRATEGY;
        case 's':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18397);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18398);return SECOND_STRATEGY;
        case 'w':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18399);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18400);return WEEK_OF_YEAR_STRATEGY;
        case 'y':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18401);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18402);return (((formatField.length()>2 )&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18403)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18404)==0&false))?LITERAL_YEAR_STRATEGY :ABBREVIATED_YEAR_STRATEGY;
        case 'Z':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18405);__CLB4_1_2_bool1=true;}
        case 'z':if (!__CLB4_1_2_bool1) {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18406);__CLB4_1_2_bool1=true;}
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18407);return getLocaleSpecificStrategy(Calendar.ZONE_OFFSET, definingCalendar);
        }
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    @SuppressWarnings("unchecked") // OK because we are creating an array with no entries
    private static ConcurrentMap<Locale, Strategy>[] caches = new ConcurrentMap[Calendar.FIELD_COUNT];

    /**
     * Get a cache of Strategies for a particular field
     * @param field The Calendar field
     * @return a cache of Locale to Strategy
     */
    private static ConcurrentMap<Locale, Strategy> getCache(final int field) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18408);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18409);synchronized(caches) {
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18410);if((((caches[field]==null)&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18411)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18412)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18413);caches[field]= new ConcurrentHashMap<Locale,Strategy>(3);
            }
            }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18414);return caches[field];
        }
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /**
     * Construct a Strategy that parses a Text field
     * @param field The Calendar field
     * @param definingCalendar The calendar to obtain the short and long values
     * @return a TextStrategy for the field and Locale
     */
    private Strategy getLocaleSpecificStrategy(final int field, final Calendar definingCalendar) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18415);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18416);final ConcurrentMap<Locale,Strategy> cache = getCache(field);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18417);Strategy strategy= cache.get(locale);
        __CLR4_1_2e1xe1xl3lqxstz.R.inc(18418);if((((strategy==null)&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18419)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18420)==0&false))) {{
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18421);strategy= (((field==Calendar.ZONE_OFFSET
                    )&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18422)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18423)==0&false))? new TimeZoneStrategy(locale)
                    : new TextStrategy(field, definingCalendar, locale);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18424);final Strategy inCache= cache.putIfAbsent(locale, strategy);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18425);if((((inCache!=null)&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18426)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18427)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18428);return inCache;
            }
        }}
        }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18429);return strategy;
    }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

    /**
     * A strategy that copies the static or quoted field in the parsing pattern
     */
    private static class CopyQuotedStrategy extends Strategy {
        private final String formatField;

        /**
         * Construct a Strategy that ensures the formatField has literal text
         * @param formatField The literal text to match
         */
        CopyQuotedStrategy(final String formatField) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18430);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18431);this.formatField= formatField;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean isNumber() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18432);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18433);char c= formatField.charAt(0);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18434);if((((c=='\'')&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18435)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18436)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18437);c= formatField.charAt(1);
            }
            }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18438);return Character.isDigit(c);
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean addRegex(final FastDateParser parser, final StringBuilder regex) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18439);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18440);escapeRegex(regex, formatField, true);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18441);return false;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}
    }

    /**
     * A strategy that handles a text field in the parsing pattern
     */
     private static class TextStrategy extends Strategy {
        private final int field;
        private final Map<String, Integer> keyValues;

        /**
         * Construct a Strategy that parses a Text field
         * @param field  The Calendar field
         * @param definingCalendar  The Calendar to use
         * @param locale  The Locale to use
         */
        TextStrategy(final int field, final Calendar definingCalendar, final Locale locale) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18442);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18443);this.field= field;
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18444);this.keyValues= getDisplayNames(field, definingCalendar, locale);
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean addRegex(final FastDateParser parser, final StringBuilder regex) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18445);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18446);regex.append('(');
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18447);for(final String textKeyValue : keyValues.keySet()) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18448);escapeRegex(regex, textKeyValue, false).append('|');
            }
            }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18449);regex.setCharAt(regex.length()-1, ')');
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18450);return true;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18451);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18452);final Integer iVal = keyValues.get(value);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18453);if((((iVal == null)&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18454)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18455)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18456);final StringBuilder sb= new StringBuilder(value);
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18457);sb.append(" not in (");
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18458);for(final String textKeyValue : keyValues.keySet()) {{
                    __CLR4_1_2e1xe1xl3lqxstz.R.inc(18459);sb.append(textKeyValue).append(' ');
                }
                }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18460);sb.setCharAt(sb.length()-1, ')');
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18461);throw new IllegalArgumentException(sb.toString());
            }
            }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18462);cal.set(field, iVal.intValue());
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}
    }


    /**
     * A strategy that handles a number field in the parsing pattern
     */
    private static class NumberStrategy extends Strategy {
        private final int field;

        /**
         * Construct a Strategy that parses a Number field
         * @param field The Calendar field
         */
        NumberStrategy(final int field) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18463);
             __CLR4_1_2e1xe1xl3lqxstz.R.inc(18464);this.field= field;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean isNumber() {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18465);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18466);return true;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean addRegex(final FastDateParser parser, final StringBuilder regex) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18467);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18468);if((((parser.isNextNumber())&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18469)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18470)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18471);regex.append("(\\p{IsNd}{").append(parser.getFieldWidth()).append("}+)");
            }
            }else {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18472);regex.append("(\\p{IsNd}++)");
            }
            }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18473);return true;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18474);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18475);cal.set(field, modify(Integer.parseInt(value)));
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

        /**
         * Make any modifications to parsed integer
         * @param iValue The parsed integer
         * @return The modified value
         */
        int modify(final int iValue) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18476);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18477);return iValue;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}
    }

    private static final Strategy ABBREVIATED_YEAR_STRATEGY = new NumberStrategy(Calendar.YEAR) {
        /**
         * {@inheritDoc}
         */
        @Override
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18478);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18479);int iValue= Integer.parseInt(value);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18480);if((((iValue<100)&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18481)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18482)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18483);iValue= parser.adjustYear(iValue);
            }
            }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18484);cal.set(Calendar.YEAR, iValue);
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}
    };

    /**
     * A strategy that handles a timezone field in the parsing pattern
     */
    private static class TimeZoneStrategy extends Strategy {

        private final String validTimeZoneChars;
        private final SortedMap<String, TimeZone> tzNames= new TreeMap<String, TimeZone>(String.CASE_INSENSITIVE_ORDER);

        /**
         * Construct a Strategy that parses a TimeZone
         * @param locale The Locale
         */
        TimeZoneStrategy(final Locale locale) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18485);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18486);for(final String id : TimeZone.getAvailableIDs()) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18487);if((((id.startsWith("GMT"))&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18488)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18489)==0&false))) {{
                    __CLR4_1_2e1xe1xl3lqxstz.R.inc(18490);continue;
                }
                }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18491);final TimeZone tz= TimeZone.getTimeZone(id);
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18492);tzNames.put(tz.getDisplayName(false, TimeZone.SHORT, locale), tz);
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18493);tzNames.put(tz.getDisplayName(false, TimeZone.LONG, locale), tz);
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18494);if((((tz.useDaylightTime())&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18495)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18496)==0&false))) {{
                    __CLR4_1_2e1xe1xl3lqxstz.R.inc(18497);tzNames.put(tz.getDisplayName(true, TimeZone.SHORT, locale), tz);
                    __CLR4_1_2e1xe1xl3lqxstz.R.inc(18498);tzNames.put(tz.getDisplayName(true, TimeZone.LONG, locale), tz);
                }
            }}
            }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18499);final StringBuilder sb= new StringBuilder();
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18500);sb.append("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18501);for(final String id : tzNames.keySet()) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18502);escapeRegex(sb, id, false).append('|');
            }
            }__CLR4_1_2e1xe1xl3lqxstz.R.inc(18503);sb.setCharAt(sb.length()-1, ')');
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18504);validTimeZoneChars= sb.toString();
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        boolean addRegex(final FastDateParser parser, final StringBuilder regex) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18505);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18506);regex.append(validTimeZoneChars);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18507);return true;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        void setCalendar(final FastDateParser parser, final Calendar cal, final String value) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18508);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18509);TimeZone tz;
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18510);if((((value.charAt(0)=='+' || value.charAt(0)=='-')&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18511)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18512)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18513);tz= TimeZone.getTimeZone("GMT"+value);
            }
            }else {__CLR4_1_2e1xe1xl3lqxstz.R.inc(18514);if((((value.startsWith("GMT"))&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18515)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18516)==0&false))) {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18517);tz= TimeZone.getTimeZone(value);
            }
            }else {{
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18518);tz= tzNames.get(value);
                __CLR4_1_2e1xe1xl3lqxstz.R.inc(18519);if((((tz==null)&&(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18520)!=0|true))||(__CLR4_1_2e1xe1xl3lqxstz.R.iget(18521)==0&false))) {{
                    __CLR4_1_2e1xe1xl3lqxstz.R.inc(18522);throw new IllegalArgumentException(value + " is not a supported timezone name");
                }
            }}
            }}__CLR4_1_2e1xe1xl3lqxstz.R.inc(18523);cal.setTimeZone(tz);
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}
    }

    private static final Strategy NUMBER_MONTH_STRATEGY = new NumberStrategy(Calendar.MONTH) {
        @Override
        int modify(final int iValue) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18524);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18525);return iValue-1;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}
    };
    private static final Strategy LITERAL_YEAR_STRATEGY = new NumberStrategy(Calendar.YEAR);
    private static final Strategy WEEK_OF_YEAR_STRATEGY = new NumberStrategy(Calendar.WEEK_OF_YEAR);
    private static final Strategy WEEK_OF_MONTH_STRATEGY = new NumberStrategy(Calendar.WEEK_OF_MONTH);
    private static final Strategy DAY_OF_YEAR_STRATEGY = new NumberStrategy(Calendar.DAY_OF_YEAR);
    private static final Strategy DAY_OF_MONTH_STRATEGY = new NumberStrategy(Calendar.DAY_OF_MONTH);
    private static final Strategy DAY_OF_WEEK_IN_MONTH_STRATEGY = new NumberStrategy(Calendar.DAY_OF_WEEK_IN_MONTH);
    private static final Strategy HOUR_OF_DAY_STRATEGY = new NumberStrategy(Calendar.HOUR_OF_DAY);
    private static final Strategy MODULO_HOUR_OF_DAY_STRATEGY = new NumberStrategy(Calendar.HOUR_OF_DAY) {
        @Override
        int modify(final int iValue) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18526);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18527);return iValue%24;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}
    };
    private static final Strategy MODULO_HOUR_STRATEGY = new NumberStrategy(Calendar.HOUR) {
        @Override
        int modify(final int iValue) {try{__CLR4_1_2e1xe1xl3lqxstz.R.inc(18528);
            __CLR4_1_2e1xe1xl3lqxstz.R.inc(18529);return iValue%12;
        }finally{__CLR4_1_2e1xe1xl3lqxstz.R.flushNeeded();}}
    };
    private static final Strategy HOUR_STRATEGY = new NumberStrategy(Calendar.HOUR);
    private static final Strategy MINUTE_STRATEGY = new NumberStrategy(Calendar.MINUTE);
    private static final Strategy SECOND_STRATEGY = new NumberStrategy(Calendar.SECOND);
    private static final Strategy MILLISECOND_STRATEGY = new NumberStrategy(Calendar.MILLISECOND);
}
