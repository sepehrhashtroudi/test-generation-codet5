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
package org.apache.commons.lang3.text;

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

/**
 * Extends <code>java.text.MessageFormat</code> to allow pluggable/additional formatting
 * options for embedded format elements.  Client code should specify a registry
 * of <code>FormatFactory</code> instances associated with <code>String</code>
 * format names.  This registry will be consulted when the format elements are
 * parsed from the message pattern.  In this way custom patterns can be specified,
 * and the formats supported by <code>java.text.MessageFormat</code> can be overridden
 * at the format and/or format style level (see MessageFormat).  A "format element"
 * embedded in the message pattern is specified (<b>()?</b> signifies optionality):<br />
 * <code>{</code><i>argument-number</i><b>(</b><code>,</code><i>format-name</i><b>
 * (</b><code>,</code><i>format-style</i><b>)?)?</b><code>}</code>
 *
 * <p>
 * <i>format-name</i> and <i>format-style</i> values are trimmed of surrounding whitespace
 * in the manner of <code>java.text.MessageFormat</code>.  If <i>format-name</i> denotes
 * <code>FormatFactory formatFactoryInstance</code> in <code>registry</code>, a <code>Format</code>
 * matching <i>format-name</i> and <i>format-style</i> is requested from
 * <code>formatFactoryInstance</code>.  If this is successful, the <code>Format</code>
 * found is used for this format element.
 * </p>
 *
 * <p><b>NOTICE:</b> The various subformat mutator methods are considered unnecessary; they exist on the parent
 * class to allow the type of customization which it is the job of this class to provide in
 * a configurable fashion.  These methods have thus been disabled and will throw
 * <code>UnsupportedOperationException</code> if called.
 * </p>
 *
 * <p>Limitations inherited from <code>java.text.MessageFormat</code>:
 * <ul>
 * <li>When using "choice" subformats, support for nested formatting instructions is limited
 *     to that provided by the base class.</li>
 * <li>Thread-safety of <code>Format</code>s, including <code>MessageFormat</code> and thus
 *     <code>ExtendedMessageFormat</code>, is not guaranteed.</li>
 * </ul>
 * </p>
 *
 * @since 2.4
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ExtendedMessageFormat extends MessageFormat {public static class __CLR4_1_2b02b02l3lqxsl4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,14540,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long serialVersionUID = -2362048321261811743L;
    private static final int HASH_SEED = 31;

    private static final String DUMMY_PATTERN = "";
    private static final String ESCAPED_QUOTE = "''";
    private static final char START_FMT = ',';
    private static final char END_FE = '}';
    private static final char START_FE = '{';
    private static final char QUOTE = '\'';

    private String toPattern;
    private final Map<String, ? extends FormatFactory> registry;

    /**
     * Create a new ExtendedMessageFormat for the default locale.
     *
     * @param pattern  the pattern to use, not null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern) {
        this(pattern, Locale.getDefault());__CLR4_1_2b02b02l3lqxsl4.R.inc(14259);try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14258);
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Create a new ExtendedMessageFormat.
     *
     * @param pattern  the pattern to use, not null
     * @param locale  the locale to use, not null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern, final Locale locale) {
        this(pattern, locale, null);__CLR4_1_2b02b02l3lqxsl4.R.inc(14261);try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14260);
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Create a new ExtendedMessageFormat for the default locale.
     *
     * @param pattern  the pattern to use, not null
     * @param registry  the registry of format factories, may be null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern, final Map<String, ? extends FormatFactory> registry) {
        this(pattern, Locale.getDefault(), registry);__CLR4_1_2b02b02l3lqxsl4.R.inc(14263);try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14262);
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Create a new ExtendedMessageFormat.
     *
     * @param pattern  the pattern to use, not null
     * @param locale  the locale to use, not null
     * @param registry  the registry of format factories, may be null
     * @throws IllegalArgumentException in case of a bad pattern.
     */
    public ExtendedMessageFormat(final String pattern, final Locale locale, final Map<String, ? extends FormatFactory> registry) {
        super(DUMMY_PATTERN);__CLR4_1_2b02b02l3lqxsl4.R.inc(14265);try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14264);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14266);setLocale(locale);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14267);this.registry = registry;
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14268);applyPattern(pattern);
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String toPattern() {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14269);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14270);return toPattern;
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Apply the specified pattern.
     *
     * @param pattern String
     */
    @Override
    public final void applyPattern(final String pattern) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14271);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14272);if ((((registry == null)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14273)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14274)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14275);super.applyPattern(pattern);
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14276);toPattern = super.toPattern();
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14277);return;
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14278);final ArrayList<Format> foundFormats = new ArrayList<Format>();
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14279);final ArrayList<String> foundDescriptions = new ArrayList<String>();
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14280);final StringBuilder stripCustom = new StringBuilder(pattern.length());

        __CLR4_1_2b02b02l3lqxsl4.R.inc(14281);final ParsePosition pos = new ParsePosition(0);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14282);final char[] c = pattern.toCharArray();
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14283);int fmtCount = 0;
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14284);while ((((pos.getIndex() < pattern.length())&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14285)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14286)==0&false))) {{
            boolean __CLB4_1_2_bool0=false;__CLR4_1_2b02b02l3lqxsl4.R.inc(14287);switch (c[pos.getIndex()]) {
            case QUOTE:if (!__CLB4_1_2_bool0) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14288);__CLB4_1_2_bool0=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14289);appendQuotedString(pattern, pos, stripCustom, true);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14290);break;
            case START_FE:if (!__CLB4_1_2_bool0) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14291);__CLB4_1_2_bool0=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14292);fmtCount++;
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14293);seekNonWs(pattern, pos);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14294);final int start = pos.getIndex();
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14295);final int index = readArgumentIndex(pattern, next(pos));
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14296);stripCustom.append(START_FE).append(index);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14297);seekNonWs(pattern, pos);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14298);Format format = null;
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14299);String formatDescription = null;
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14300);if ((((c[pos.getIndex()] == START_FMT)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14301)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14302)==0&false))) {{
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14303);formatDescription = parseFormatDescription(pattern,
                            next(pos));
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14304);format = getFormat(formatDescription);
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14305);if ((((format == null)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14306)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14307)==0&false))) {{
                        __CLR4_1_2b02b02l3lqxsl4.R.inc(14308);stripCustom.append(START_FMT).append(formatDescription);
                    }
                }}
                }__CLR4_1_2b02b02l3lqxsl4.R.inc(14309);foundFormats.add(format);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14310);foundDescriptions.add((((format == null )&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14311)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14312)==0&false))? null : formatDescription);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14313);Validate.isTrue(foundFormats.size() == fmtCount);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14314);Validate.isTrue(foundDescriptions.size() == fmtCount);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14315);if ((((c[pos.getIndex()] != END_FE)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14316)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14317)==0&false))) {{
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14318);throw new IllegalArgumentException(
                            "Unreadable format element at position " + start);
                }
                //$FALL-THROUGH$
            }default:if (!__CLB4_1_2_bool0) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14319);__CLB4_1_2_bool0=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14320);stripCustom.append(c[pos.getIndex()]);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14321);next(pos);
            }
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14322);super.applyPattern(stripCustom.toString());
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14323);toPattern = insertFormats(super.toPattern(), foundDescriptions);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14324);if ((((containsElements(foundFormats))&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14325)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14326)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14327);final Format[] origFormats = getFormats();
            // only loop over what we know we have, as MessageFormat on Java 1.3
            // seems to provide an extra format element:
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14328);int i = 0;
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14329);for (final Iterator<Format> it = foundFormats.iterator(); (((it.hasNext())&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14330)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14331)==0&false)); i++) {{
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14332);final Format f = it.next();
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14333);if ((((f != null)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14334)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14335)==0&false))) {{
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14336);origFormats[i] = f;
                }
            }}
            }__CLR4_1_2b02b02l3lqxsl4.R.inc(14337);super.setFormats(origFormats);
        }
    }}finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param formatElementIndex format element index
     * @param newFormat the new format
     * @throws UnsupportedOperationException
     */
    @Override
    public void setFormat(final int formatElementIndex, final Format newFormat) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14338);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14339);throw new UnsupportedOperationException();
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param argumentIndex argument index
     * @param newFormat the new format
     * @throws UnsupportedOperationException
     */
    @Override
    public void setFormatByArgumentIndex(final int argumentIndex, final Format newFormat) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14340);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14341);throw new UnsupportedOperationException();
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param newFormats new formats
     * @throws UnsupportedOperationException
     */
    @Override
    public void setFormats(final Format[] newFormats) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14342);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14343);throw new UnsupportedOperationException();
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Throws UnsupportedOperationException - see class Javadoc for details.
     *
     * @param newFormats new formats
     * @throws UnsupportedOperationException
     */
    @Override
    public void setFormatsByArgumentIndex(final Format[] newFormats) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14344);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14345);throw new UnsupportedOperationException();
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Check if this extended message format is equal to another object.
     *
     * @param obj the object to compare to
     * @return true if this object equals the other, otherwise false
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14346);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14347);if ((((obj == this)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14348)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14349)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14350);return true;
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14351);if ((((obj == null)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14352)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14353)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14354);return false;
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14355);if ((((!super.equals(obj))&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14356)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14357)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14358);return false;
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14359);if ((((ObjectUtils.notEqual(getClass(), obj.getClass()))&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14360)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14361)==0&false))) {{
          __CLR4_1_2b02b02l3lqxsl4.R.inc(14362);return false;
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14363);final ExtendedMessageFormat rhs = (ExtendedMessageFormat)obj;
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14364);if ((((ObjectUtils.notEqual(toPattern, rhs.toPattern))&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14365)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14366)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14367);return false;
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14368);if ((((ObjectUtils.notEqual(registry, rhs.registry))&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14369)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14370)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14371);return false;
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14372);return true;
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Return the hashcode.
     *
     * @return the hashcode
     */
    @Override
    public int hashCode() {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14373);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14374);int result = super.hashCode();
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14375);result = HASH_SEED * result + ObjectUtils.hashCode(registry);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14376);result = HASH_SEED * result + ObjectUtils.hashCode(toPattern);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14377);return result;
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Get a custom format from a format description.
     *
     * @param desc String
     * @return Format
     */
    private Format getFormat(final String desc) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14378);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14379);if ((((registry != null)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14380)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14381)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14382);String name = desc;
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14383);String args = null;
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14384);final int i = desc.indexOf(START_FMT);
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14385);if ((((i > 0)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14386)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14387)==0&false))) {{
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14388);name = desc.substring(0, i).trim();
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14389);args = desc.substring(i + 1).trim();
            }
            }__CLR4_1_2b02b02l3lqxsl4.R.inc(14390);final FormatFactory factory = registry.get(name);
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14391);if ((((factory != null)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14392)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14393)==0&false))) {{
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14394);return factory.getFormat(name, args, getLocale());
            }
        }}
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14395);return null;
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Read the argument index from the current format element
     *
     * @param pattern pattern to parse
     * @param pos current parse position
     * @return argument index
     */
    private int readArgumentIndex(final String pattern, final ParsePosition pos) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14396);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14397);final int start = pos.getIndex();
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14398);seekNonWs(pattern, pos);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14399);final StringBuilder result = new StringBuilder();
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14400);boolean error = false;
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14401);for (; (((!error && pos.getIndex() < pattern.length())&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14402)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14403)==0&false)); next(pos)) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14404);char c = pattern.charAt(pos.getIndex());
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14405);if ((((Character.isWhitespace(c))&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14406)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14407)==0&false))) {{
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14408);seekNonWs(pattern, pos);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14409);c = pattern.charAt(pos.getIndex());
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14410);if ((((c != START_FMT && c != END_FE)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14411)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14412)==0&false))) {{
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14413);error = true;
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14414);continue;
                }
            }}
            }__CLR4_1_2b02b02l3lqxsl4.R.inc(14415);if (((((c == START_FMT || c == END_FE) && result.length() > 0)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14416)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14417)==0&false))) {{
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14418);try {
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14419);return Integer.parseInt(result.toString());
                } catch (final NumberFormatException e) { // NOPMD
                    // we've already ensured only digits, so unless something
                    // outlandishly large was specified we should be okay.
                }
            }
            }__CLR4_1_2b02b02l3lqxsl4.R.inc(14420);error = !Character.isDigit(c);
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14421);result.append(c);
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14422);if ((((error)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14423)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14424)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14425);throw new IllegalArgumentException(
                    "Invalid format argument index at position " + start + ": "
                            + pattern.substring(start, pos.getIndex()));
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14426);throw new IllegalArgumentException(
                "Unterminated format element at position " + start);
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Parse the format component of a format element.
     *
     * @param pattern string to parse
     * @param pos current parse position
     * @return Format description String
     */
    private String parseFormatDescription(final String pattern, final ParsePosition pos) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14427);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14428);final int start = pos.getIndex();
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14429);seekNonWs(pattern, pos);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14430);final int text = pos.getIndex();
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14431);int depth = 1;
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14432);for (; (((pos.getIndex() < pattern.length())&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14433)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14434)==0&false)); next(pos)) {{
            boolean __CLB4_1_2_bool1=false;__CLR4_1_2b02b02l3lqxsl4.R.inc(14435);switch (pattern.charAt(pos.getIndex())) {
            case START_FE:if (!__CLB4_1_2_bool1) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14436);__CLB4_1_2_bool1=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14437);depth++;
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14438);break;
            case END_FE:if (!__CLB4_1_2_bool1) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14439);__CLB4_1_2_bool1=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14440);depth--;
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14441);if ((((depth == 0)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14442)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14443)==0&false))) {{
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14444);return pattern.substring(text, pos.getIndex());
                }
                }__CLR4_1_2b02b02l3lqxsl4.R.inc(14445);break;
            case QUOTE:if (!__CLB4_1_2_bool1) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14446);__CLB4_1_2_bool1=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14447);getQuotedString(pattern, pos, false);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14448);break;
            }
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14449);throw new IllegalArgumentException(
                "Unterminated format element at position " + start);
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Insert formats back into the pattern for toPattern() support.
     *
     * @param pattern source
     * @param customPatterns The custom patterns to re-insert, if any
     * @return full pattern
     */
    private String insertFormats(final String pattern, final ArrayList<String> customPatterns) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14450);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14451);if ((((!containsElements(customPatterns))&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14452)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14453)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14454);return pattern;
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14455);final StringBuilder sb = new StringBuilder(pattern.length() * 2);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14456);final ParsePosition pos = new ParsePosition(0);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14457);int fe = -1;
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14458);int depth = 0;
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14459);while ((((pos.getIndex() < pattern.length())&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14460)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14461)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14462);final char c = pattern.charAt(pos.getIndex());
            boolean __CLB4_1_2_bool2=false;__CLR4_1_2b02b02l3lqxsl4.R.inc(14463);switch (c) {
            case QUOTE:if (!__CLB4_1_2_bool2) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14464);__CLB4_1_2_bool2=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14465);appendQuotedString(pattern, pos, sb, false);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14466);break;
            case START_FE:if (!__CLB4_1_2_bool2) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14467);__CLB4_1_2_bool2=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14468);depth++;
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14469);if ((((depth == 1)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14470)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14471)==0&false))) {{
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14472);fe++;
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14473);sb.append(START_FE).append(
                            readArgumentIndex(pattern, next(pos)));
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14474);final String customPattern = customPatterns.get(fe);
                    __CLR4_1_2b02b02l3lqxsl4.R.inc(14475);if ((((customPattern != null)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14476)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14477)==0&false))) {{
                        __CLR4_1_2b02b02l3lqxsl4.R.inc(14478);sb.append(START_FMT).append(customPattern);
                    }
                }}
                }__CLR4_1_2b02b02l3lqxsl4.R.inc(14479);break;
            case END_FE:if (!__CLB4_1_2_bool2) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14480);__CLB4_1_2_bool2=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14481);depth--;
                //$FALL-THROUGH$
            default:if (!__CLB4_1_2_bool2) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14482);__CLB4_1_2_bool2=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14483);sb.append(c);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14484);next(pos);
            }
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14485);return sb.toString();
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Consume whitespace from the current parse position.
     *
     * @param pattern String to read
     * @param pos current position
     */
    private void seekNonWs(final String pattern, final ParsePosition pos) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14486);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14487);int len = 0;
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14488);final char[] buffer = pattern.toCharArray();
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14489);do {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14490);len = StrMatcher.splitMatcher().isMatch(buffer, pos.getIndex());
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14491);pos.setIndex(pos.getIndex() + len);
        } }while ((((len > 0 && pos.getIndex() < pattern.length())&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14492)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14493)==0&false)));
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Convenience method to advance parse position by 1
     *
     * @param pos ParsePosition
     * @return <code>pos</code>
     */
    private ParsePosition next(final ParsePosition pos) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14494);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14495);pos.setIndex(pos.getIndex() + 1);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14496);return pos;
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Consume a quoted string, adding it to <code>appendTo</code> if
     * specified.
     *
     * @param pattern pattern to parse
     * @param pos current parse position
     * @param appendTo optional StringBuilder to append
     * @param escapingOn whether to process escaped quotes
     * @return <code>appendTo</code>
     */
    private StringBuilder appendQuotedString(final String pattern, final ParsePosition pos,
            final StringBuilder appendTo, final boolean escapingOn) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14497);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14498);final int start = pos.getIndex();
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14499);final char[] c = pattern.toCharArray();
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14500);if ((((escapingOn && c[start] == QUOTE)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14501)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14502)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14503);next(pos);
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14504);return (((appendTo == null )&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14505)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14506)==0&false))? null : appendTo.append(QUOTE);
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14507);int lastHold = start;
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14508);for (int i = pos.getIndex(); (((i < pattern.length())&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14509)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14510)==0&false)); i++) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14511);if ((((escapingOn && pattern.substring(i).startsWith(ESCAPED_QUOTE))&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14512)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14513)==0&false))) {{
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14514);appendTo.append(c, lastHold, pos.getIndex() - lastHold).append(
                        QUOTE);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14515);pos.setIndex(i + ESCAPED_QUOTE.length());
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14516);lastHold = pos.getIndex();
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14517);continue;
            }
            }boolean __CLB4_1_2_bool3=false;__CLR4_1_2b02b02l3lqxsl4.R.inc(14518);switch (c[pos.getIndex()]) {
            case QUOTE:if (!__CLB4_1_2_bool3) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14519);__CLB4_1_2_bool3=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14520);next(pos);
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14521);return (((appendTo == null )&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14522)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14523)==0&false))? null : appendTo.append(c, lastHold,
                        pos.getIndex() - lastHold);
            default:if (!__CLB4_1_2_bool3) {__CLR4_1_2b02b02l3lqxsl4.R.inc(14524);__CLB4_1_2_bool3=true;}
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14525);next(pos);
            }
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14526);throw new IllegalArgumentException(
                "Unterminated quoted string at position " + start);
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Consume quoted string only
     *
     * @param pattern pattern to parse
     * @param pos current parse position
     * @param escapingOn whether to process escaped quotes
     */
    private void getQuotedString(final String pattern, final ParsePosition pos,
            final boolean escapingOn) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14527);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14528);appendQuotedString(pattern, pos, null, escapingOn);
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}

    /**
     * Learn whether the specified Collection contains non-null elements.
     * @param coll to check
     * @return <code>true</code> if some Object was found, <code>false</code> otherwise.
     */
    private boolean containsElements(final Collection<?> coll) {try{__CLR4_1_2b02b02l3lqxsl4.R.inc(14529);
        __CLR4_1_2b02b02l3lqxsl4.R.inc(14530);if ((((coll == null || coll.isEmpty())&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14531)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14532)==0&false))) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14533);return false;
        }
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14534);for (final Object name : coll) {{
            __CLR4_1_2b02b02l3lqxsl4.R.inc(14535);if ((((name != null)&&(__CLR4_1_2b02b02l3lqxsl4.R.iget(14536)!=0|true))||(__CLR4_1_2b02b02l3lqxsl4.R.iget(14537)==0&false))) {{
                __CLR4_1_2b02b02l3lqxsl4.R.inc(14538);return true;
            }
        }}
        }__CLR4_1_2b02b02l3lqxsl4.R.inc(14539);return false;
    }finally{__CLR4_1_2b02b02l3lqxsl4.R.flushNeeded();}}
}
