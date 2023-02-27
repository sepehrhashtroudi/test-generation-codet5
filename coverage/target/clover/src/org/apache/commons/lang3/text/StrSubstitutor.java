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

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Substitutes variables within a string by values.
 * <p>
 * This class takes a piece of text and substitutes all the variables within it.
 * The default definition of a variable is <code>${variableName}</code>.
 * The prefix and suffix can be changed via constructors and set methods.
 * <p>
 * Variable values are typically resolved from a map, but could also be resolved
 * from system properties, or by supplying a custom variable resolver.
 * <p>
 * The simplest example is to use this class to replace Java System properties. For example:
 * <pre>
 * StrSubstitutor.replaceSystemProperties(
 *      "You are running with java.version = ${java.version} and os.name = ${os.name}.");
 * </pre>
 * <p>
 * Typical usage of this class follows the following pattern: First an instance is created
 * and initialized with the map that contains the values for the available variables.
 * If a prefix and/or suffix for variables should be used other than the default ones,
 * the appropriate settings can be performed. After that the <code>replace()</code>
 * method can be called passing in the source text for interpolation. In the returned
 * text all variable references (as long as their values are known) will be resolved.
 * The following example demonstrates this:
 * <pre>
 * Map valuesMap = HashMap();
 * valuesMap.put(&quot;animal&quot;, &quot;quick brown fox&quot;);
 * valuesMap.put(&quot;target&quot;, &quot;lazy dog&quot;);
 * String templateString = &quot;The ${animal} jumped over the ${target}.&quot;;
 * StrSubstitutor sub = new StrSubstitutor(valuesMap);
 * String resolvedString = sub.replace(templateString);
 * </pre>
 * yielding:
 * <pre>
 *      The quick brown fox jumped over the lazy dog.
 * </pre>
 * <p>
 * In addition to this usage pattern there are some static convenience methods that
 * cover the most common use cases. These methods can be used without the need of
 * manually creating an instance. However if multiple replace operations are to be
 * performed, creating and reusing an instance of this class will be more efficient.
 * <p>
 * Variable replacement works in a recursive way. Thus, if a variable value contains
 * a variable then that variable will also be replaced. Cyclic replacements are
 * detected and will cause an exception to be thrown.
 * <p>
 * Sometimes the interpolation's result must contain a variable prefix. As an example
 * take the following source text:
 * <pre>
 *   The variable ${${name}} must be used.
 * </pre>
 * Here only the variable's name referred to in the text should be replaced resulting
 * in the text (assuming that the value of the <code>name</code> variable is <code>x</code>):
 * <pre>
 *   The variable ${x} must be used.
 * </pre>
 * To achieve this effect there are two possibilities: Either set a different prefix
 * and suffix for variables which do not conflict with the result text you want to
 * produce. The other possibility is to use the escape character, by default '$'.
 * If this character is placed before a variable reference, this reference is ignored
 * and won't be replaced. For example:
 * <pre>
 *   The variable $${${name}} must be used.
 * </pre>
 * <p>
 * In some complex scenarios you might even want to perform substitution in the
 * names of variables, for instance
 * <pre>
 * ${jre-${java.specification.version}}
 * </pre>
 * <code>StrSubstitutor</code> supports this recursive substitution in variable
 * names, but it has to be enabled explicitly by setting the
 * {@link #setEnableSubstitutionInVariables(boolean) enableSubstitutionInVariables}
 * property to <b>true</b>.
 *
 * @version $Id$
 * @since 2.2
 */
public class StrSubstitutor {public static class __CLR4_1_2cclccll3lqxsob{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,16306,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constant for the default escape character.
     */
    public static final char DEFAULT_ESCAPE = '$';
    /**
     * Constant for the default variable prefix.
     */
    public static final StrMatcher DEFAULT_PREFIX = StrMatcher.stringMatcher("${");
    /**
     * Constant for the default variable suffix.
     */
    public static final StrMatcher DEFAULT_SUFFIX = StrMatcher.stringMatcher("}");

    /**
     * Stores the escape character.
     */
    private char escapeChar;
    /**
     * Stores the variable prefix.
     */
    private StrMatcher prefixMatcher;
    /**
     * Stores the variable suffix.
     */
    private StrMatcher suffixMatcher;
    /**
     * Variable resolution is delegated to an implementor of VariableResolver.
     */
    private StrLookup<?> variableResolver;
    /**
     * The flag whether substitution in variable names is enabled.
     */
    private boolean enableSubstitutionInVariables;

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the map.
     *
     * @param <V> the type of the values in the map
     * @param source  the source text containing the variables to substitute, null returns null
     * @param valueMap  the map with the values, may be null
     * @return the result of the replace operation
     */
    public static <V> String replace(final Object source, final Map<String, V> valueMap) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16005);
        __CLR4_1_2cclccll3lqxsob.R.inc(16006);return new StrSubstitutor(valueMap).replace(source);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the map. This method allows to specifiy a
     * custom variable prefix and suffix
     *
     * @param <V> the type of the values in the map
     * @param source  the source text containing the variables to substitute, null returns null
     * @param valueMap  the map with the values, may be null
     * @param prefix  the prefix of variables, not null
     * @param suffix  the suffix of variables, not null
     * @return the result of the replace operation
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public static <V> String replace(final Object source, final Map<String, V> valueMap, final String prefix, final String suffix) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16007);
        __CLR4_1_2cclccll3lqxsob.R.inc(16008);return new StrSubstitutor(valueMap, prefix, suffix).replace(source);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables in the given source object with their matching
     * values from the properties.
     *
     * @param source the source text containing the variables to substitute, null returns null
     * @param valueProperties the properties with values, may be null
     * @return the result of the replace operation
     */
    public static String replace(final Object source, final Properties valueProperties) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16009);
        __CLR4_1_2cclccll3lqxsob.R.inc(16010);if ((((valueProperties == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16011)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16012)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16013);return source.toString();
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16014);final Map<String,String> valueMap = new HashMap<String,String>();
        __CLR4_1_2cclccll3lqxsob.R.inc(16015);final Enumeration<?> propNames = valueProperties.propertyNames();
        __CLR4_1_2cclccll3lqxsob.R.inc(16016);while ((((propNames.hasMoreElements())&&(__CLR4_1_2cclccll3lqxsob.R.iget(16017)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16018)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16019);final String propName = (String)propNames.nextElement();
            __CLR4_1_2cclccll3lqxsob.R.inc(16020);final String propValue = valueProperties.getProperty(propName);
            __CLR4_1_2cclccll3lqxsob.R.inc(16021);valueMap.put(propName, propValue);
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16022);return StrSubstitutor.replace(source, valueMap);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the system properties.
     *
     * @param source  the source text containing the variables to substitute, null returns null
     * @return the result of the replace operation
     */
    public static String replaceSystemProperties(final Object source) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16023);
        __CLR4_1_2cclccll3lqxsob.R.inc(16024);return new StrSubstitutor(StrLookup.systemPropertiesLookup()).replace(source);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new instance with defaults for variable prefix and suffix
     * and the escaping character.
     */
    public StrSubstitutor() {
        this((StrLookup<?>) null, DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);__CLR4_1_2cclccll3lqxsob.R.inc(16026);try{__CLR4_1_2cclccll3lqxsob.R.inc(16025);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it. Uses defaults for variable
     * prefix and suffix and the escaping character.
     *
     * @param <V> the type of the values in the map
     * @param valueMap  the map with the variables' values, may be null
     */
    public <V> StrSubstitutor(final Map<String, V> valueMap) {
        this(StrLookup.mapLookup(valueMap), DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);__CLR4_1_2cclccll3lqxsob.R.inc(16028);try{__CLR4_1_2cclccll3lqxsob.R.inc(16027);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it. Uses a default escaping character.
     *
     * @param <V> the type of the values in the map
     * @param valueMap  the map with the variables' values, may be null
     * @param prefix  the prefix for variables, not null
     * @param suffix  the suffix for variables, not null
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public <V> StrSubstitutor(final Map<String, V> valueMap, final String prefix, final String suffix) {
        this(StrLookup.mapLookup(valueMap), prefix, suffix, DEFAULT_ESCAPE);__CLR4_1_2cclccll3lqxsob.R.inc(16030);try{__CLR4_1_2cclccll3lqxsob.R.inc(16029);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param <V> the type of the values in the map
     * @param valueMap  the map with the variables' values, may be null
     * @param prefix  the prefix for variables, not null
     * @param suffix  the suffix for variables, not null
     * @param escape  the escape character
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public <V> StrSubstitutor(final Map<String, V> valueMap, final String prefix, final String suffix, final char escape) {
        this(StrLookup.mapLookup(valueMap), prefix, suffix, escape);__CLR4_1_2cclccll3lqxsob.R.inc(16032);try{__CLR4_1_2cclccll3lqxsob.R.inc(16031);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param variableResolver  the variable resolver, may be null
     */
    public StrSubstitutor(final StrLookup<?> variableResolver) {
        this(variableResolver, DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_ESCAPE);__CLR4_1_2cclccll3lqxsob.R.inc(16034);try{__CLR4_1_2cclccll3lqxsob.R.inc(16033);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param variableResolver  the variable resolver, may be null
     * @param prefix  the prefix for variables, not null
     * @param suffix  the suffix for variables, not null
     * @param escape  the escape character
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public StrSubstitutor(final StrLookup<?> variableResolver, final String prefix, final String suffix, final char escape) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16035);
        __CLR4_1_2cclccll3lqxsob.R.inc(16036);this.setVariableResolver(variableResolver);
        __CLR4_1_2cclccll3lqxsob.R.inc(16037);this.setVariablePrefix(prefix);
        __CLR4_1_2cclccll3lqxsob.R.inc(16038);this.setVariableSuffix(suffix);
        __CLR4_1_2cclccll3lqxsob.R.inc(16039);this.setEscapeChar(escape);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Creates a new instance and initializes it.
     *
     * @param variableResolver  the variable resolver, may be null
     * @param prefixMatcher  the prefix for variables, not null
     * @param suffixMatcher  the suffix for variables, not null
     * @param escape  the escape character
     * @throws IllegalArgumentException if the prefix or suffix is null
     */
    public StrSubstitutor(
            final StrLookup<?> variableResolver, final StrMatcher prefixMatcher, final StrMatcher suffixMatcher, final char escape) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16040);
        __CLR4_1_2cclccll3lqxsob.R.inc(16041);this.setVariableResolver(variableResolver);
        __CLR4_1_2cclccll3lqxsob.R.inc(16042);this.setVariablePrefixMatcher(prefixMatcher);
        __CLR4_1_2cclccll3lqxsob.R.inc(16043);this.setVariableSuffixMatcher(suffixMatcher);
        __CLR4_1_2cclccll3lqxsob.R.inc(16044);this.setEscapeChar(escape);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source string as a template.
     *
     * @param source  the string to replace in, null returns null
     * @return the result of the replace operation
     */
    public String replace(final String source) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16045);
        __CLR4_1_2cclccll3lqxsob.R.inc(16046);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16047)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16048)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16049);return null;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16050);final StrBuilder buf = new StrBuilder(source);
        __CLR4_1_2cclccll3lqxsob.R.inc(16051);if ((((substitute(buf, 0, source.length()) == false)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16052)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16053)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16054);return source;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16055);return buf.toString();
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source string as a template.
     * <p>
     * Only the specified portion of the string will be processed.
     * The rest of the string is not processed, and is not returned.
     *
     * @param source  the string to replace in, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final String source, final int offset, final int length) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16056);
        __CLR4_1_2cclccll3lqxsob.R.inc(16057);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16058)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16059)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16060);return null;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16061);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_1_2cclccll3lqxsob.R.inc(16062);if ((((substitute(buf, 0, length) == false)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16063)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16064)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16065);return source.substring(offset, offset + length);
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16066);return buf.toString();
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source array as a template.
     * The array is not altered by this method.
     *
     * @param source  the character array to replace in, not altered, null returns null
     * @return the result of the replace operation
     */
    public String replace(final char[] source) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16067);
        __CLR4_1_2cclccll3lqxsob.R.inc(16068);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16069)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16070)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16071);return null;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16072);final StrBuilder buf = new StrBuilder(source.length).append(source);
        __CLR4_1_2cclccll3lqxsob.R.inc(16073);substitute(buf, 0, source.length);
        __CLR4_1_2cclccll3lqxsob.R.inc(16074);return buf.toString();
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source array as a template.
     * The array is not altered by this method.
     * <p>
     * Only the specified portion of the array will be processed.
     * The rest of the array is not processed, and is not returned.
     *
     * @param source  the character array to replace in, not altered, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final char[] source, final int offset, final int length) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16075);
        __CLR4_1_2cclccll3lqxsob.R.inc(16076);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16077)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16078)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16079);return null;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16080);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_1_2cclccll3lqxsob.R.inc(16081);substitute(buf, 0, length);
        __CLR4_1_2cclccll3lqxsob.R.inc(16082);return buf.toString();
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source buffer as a template.
     * The buffer is not altered by this method.
     *
     * @param source  the buffer to use as a template, not changed, null returns null
     * @return the result of the replace operation
     */
    public String replace(final StringBuffer source) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16083);
        __CLR4_1_2cclccll3lqxsob.R.inc(16084);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16085)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16086)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16087);return null;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16088);final StrBuilder buf = new StrBuilder(source.length()).append(source);
        __CLR4_1_2cclccll3lqxsob.R.inc(16089);substitute(buf, 0, buf.length());
        __CLR4_1_2cclccll3lqxsob.R.inc(16090);return buf.toString();
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source buffer as a template.
     * The buffer is not altered by this method.
     * <p>
     * Only the specified portion of the buffer will be processed.
     * The rest of the buffer is not processed, and is not returned.
     *
     * @param source  the buffer to use as a template, not changed, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final StringBuffer source, final int offset, final int length) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16091);
        __CLR4_1_2cclccll3lqxsob.R.inc(16092);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16093)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16094)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16095);return null;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16096);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_1_2cclccll3lqxsob.R.inc(16097);substitute(buf, 0, length);
        __CLR4_1_2cclccll3lqxsob.R.inc(16098);return buf.toString();
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source builder as a template.
     * The builder is not altered by this method.
     *
     * @param source  the builder to use as a template, not changed, null returns null
     * @return the result of the replace operation
     */
    public String replace(final StrBuilder source) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16099);
        __CLR4_1_2cclccll3lqxsob.R.inc(16100);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16101)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16102)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16103);return null;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16104);final StrBuilder buf = new StrBuilder(source.length()).append(source);
        __CLR4_1_2cclccll3lqxsob.R.inc(16105);substitute(buf, 0, buf.length());
        __CLR4_1_2cclccll3lqxsob.R.inc(16106);return buf.toString();
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables with their matching values
     * from the resolver using the given source builder as a template.
     * The builder is not altered by this method.
     * <p>
     * Only the specified portion of the builder will be processed.
     * The rest of the builder is not processed, and is not returned.
     *
     * @param source  the builder to use as a template, not changed, null returns null
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the array to be processed, must be valid
     * @return the result of the replace operation
     */
    public String replace(final StrBuilder source, final int offset, final int length) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16107);
        __CLR4_1_2cclccll3lqxsob.R.inc(16108);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16109)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16110)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16111);return null;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16112);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_1_2cclccll3lqxsob.R.inc(16113);substitute(buf, 0, length);
        __CLR4_1_2cclccll3lqxsob.R.inc(16114);return buf.toString();
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables in the given source object with
     * their matching values from the resolver. The input source object is
     * converted to a string using <code>toString</code> and is not altered.
     *
     * @param source  the source to replace in, null returns null
     * @return the result of the replace operation
     */
    public String replace(final Object source) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16115);
        __CLR4_1_2cclccll3lqxsob.R.inc(16116);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16117)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16118)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16119);return null;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16120);final StrBuilder buf = new StrBuilder().append(source);
        __CLR4_1_2cclccll3lqxsob.R.inc(16121);substitute(buf, 0, buf.length());
        __CLR4_1_2cclccll3lqxsob.R.inc(16122);return buf.toString();
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables within the given source buffer
     * with their matching values from the resolver.
     * The buffer is updated with the result.
     *
     * @param source  the buffer to replace in, updated, null returns zero
     * @return true if altered
     */
    public boolean replaceIn(final StringBuffer source) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16123);
        __CLR4_1_2cclccll3lqxsob.R.inc(16124);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16125)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16126)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16127);return false;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16128);return replaceIn(source, 0, source.length());
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables within the given source buffer
     * with their matching values from the resolver.
     * The buffer is updated with the result.
     * <p>
     * Only the specified portion of the buffer will be processed.
     * The rest of the buffer is not processed, but it is not deleted.
     *
     * @param source  the buffer to replace in, updated, null returns zero
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the buffer to be processed, must be valid
     * @return true if altered
     */
    public boolean replaceIn(final StringBuffer source, final int offset, final int length) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16129);
        __CLR4_1_2cclccll3lqxsob.R.inc(16130);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16131)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16132)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16133);return false;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16134);final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        __CLR4_1_2cclccll3lqxsob.R.inc(16135);if ((((substitute(buf, 0, length) == false)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16136)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16137)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16138);return false;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16139);source.replace(offset, offset + length, buf.toString());
        __CLR4_1_2cclccll3lqxsob.R.inc(16140);return true;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all the occurrences of variables within the given source
     * builder with their matching values from the resolver.
     *
     * @param source  the builder to replace in, updated, null returns zero
     * @return true if altered
     */
    public boolean replaceIn(final StrBuilder source) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16141);
        __CLR4_1_2cclccll3lqxsob.R.inc(16142);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16143)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16144)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16145);return false;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16146);return substitute(source, 0, source.length());
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Replaces all the occurrences of variables within the given source
     * builder with their matching values from the resolver.
     * <p>
     * Only the specified portion of the builder will be processed.
     * The rest of the builder is not processed, but it is not deleted.
     *
     * @param source  the builder to replace in, null returns zero
     * @param offset  the start offset within the array, must be valid
     * @param length  the length within the builder to be processed, must be valid
     * @return true if altered
     */
    public boolean replaceIn(final StrBuilder source, final int offset, final int length) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16147);
        __CLR4_1_2cclccll3lqxsob.R.inc(16148);if ((((source == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16149)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16150)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16151);return false;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16152);return substitute(source, offset, length);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Internal method that substitutes the variables.
     * <p>
     * Most users of this class do not need to call this method. This method will
     * be called automatically by another (public) method.
     * <p>
     * Writers of subclasses can override this method if they need access to
     * the substitution process at the start or end.
     *
     * @param buf  the string builder to substitute into, not null
     * @param offset  the start offset within the builder, must be valid
     * @param length  the length within the builder to be processed, must be valid
     * @return true if altered
     */
    protected boolean substitute(final StrBuilder buf, final int offset, final int length) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16153);
        __CLR4_1_2cclccll3lqxsob.R.inc(16154);return substitute(buf, offset, length, null) > 0;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Recursive handler for multiple levels of interpolation. This is the main
     * interpolation method, which resolves the values of all variable references
     * contained in the passed in text.
     *
     * @param buf  the string builder to substitute into, not null
     * @param offset  the start offset within the builder, must be valid
     * @param length  the length within the builder to be processed, must be valid
     * @param priorVariables  the stack keeping track of the replaced variables, may be null
     * @return the length change that occurs, unless priorVariables is null when the int
     *  represents a boolean flag as to whether any change occurred.
     */
    private int substitute(final StrBuilder buf, final int offset, final int length, List<String> priorVariables) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16155);
        __CLR4_1_2cclccll3lqxsob.R.inc(16156);final StrMatcher prefixMatcher = getVariablePrefixMatcher();
        __CLR4_1_2cclccll3lqxsob.R.inc(16157);final StrMatcher suffixMatcher = getVariableSuffixMatcher();
        __CLR4_1_2cclccll3lqxsob.R.inc(16158);final char escape = getEscapeChar();

        __CLR4_1_2cclccll3lqxsob.R.inc(16159);final boolean top = priorVariables == null;
        __CLR4_1_2cclccll3lqxsob.R.inc(16160);boolean altered = false;
        __CLR4_1_2cclccll3lqxsob.R.inc(16161);int lengthChange = 0;
        __CLR4_1_2cclccll3lqxsob.R.inc(16162);char[] chars = buf.buffer;
        __CLR4_1_2cclccll3lqxsob.R.inc(16163);int bufEnd = offset + length;
        __CLR4_1_2cclccll3lqxsob.R.inc(16164);int pos = offset;
        __CLR4_1_2cclccll3lqxsob.R.inc(16165);while ((((pos < bufEnd)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16166)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16167)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16168);final int startMatchLen = prefixMatcher.isMatch(chars, pos, offset,
                    bufEnd);
            __CLR4_1_2cclccll3lqxsob.R.inc(16169);if ((((startMatchLen == 0)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16170)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16171)==0&false))) {{
                __CLR4_1_2cclccll3lqxsob.R.inc(16172);pos++;
            } }else {{
                // found variable start marker
                __CLR4_1_2cclccll3lqxsob.R.inc(16173);if ((((pos > offset && chars[pos - 1] == escape)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16174)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16175)==0&false))) {{
                    // escaped
                    __CLR4_1_2cclccll3lqxsob.R.inc(16176);buf.deleteCharAt(pos - 1);
                    __CLR4_1_2cclccll3lqxsob.R.inc(16177);chars = buf.buffer; // in case buffer was altered
                    __CLR4_1_2cclccll3lqxsob.R.inc(16178);lengthChange--;
                    __CLR4_1_2cclccll3lqxsob.R.inc(16179);altered = true;
                    __CLR4_1_2cclccll3lqxsob.R.inc(16180);bufEnd--;
                } }else {{
                    // find suffix
                    __CLR4_1_2cclccll3lqxsob.R.inc(16181);final int startPos = pos;
                    __CLR4_1_2cclccll3lqxsob.R.inc(16182);pos += startMatchLen;
                    __CLR4_1_2cclccll3lqxsob.R.inc(16183);int endMatchLen = 0;
                    __CLR4_1_2cclccll3lqxsob.R.inc(16184);int nestedVarCount = 0;
                    __CLR4_1_2cclccll3lqxsob.R.inc(16185);while ((((pos < bufEnd)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16186)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16187)==0&false))) {{
                        __CLR4_1_2cclccll3lqxsob.R.inc(16188);if (isEnableSubstitutionInVariables()
                                && (endMatchLen = prefixMatcher.isMatch(chars,
                                        pos, offset, bufEnd)) != 0) {{
                            // found a nested variable start
                            __CLR4_1_2cclccll3lqxsob.R.inc(16191);nestedVarCount++;
                            __CLR4_1_2cclccll3lqxsob.R.inc(16192);pos += endMatchLen;
                            __CLR4_1_2cclccll3lqxsob.R.inc(16193);continue;
                        }

                        }__CLR4_1_2cclccll3lqxsob.R.inc(16194);endMatchLen = suffixMatcher.isMatch(chars, pos, offset,
                                bufEnd);
                        __CLR4_1_2cclccll3lqxsob.R.inc(16195);if ((((endMatchLen == 0)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16196)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16197)==0&false))) {{
                            __CLR4_1_2cclccll3lqxsob.R.inc(16198);pos++;
                        } }else {{
                            // found variable end marker
                            __CLR4_1_2cclccll3lqxsob.R.inc(16199);if ((((nestedVarCount == 0)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16200)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16201)==0&false))) {{
                                __CLR4_1_2cclccll3lqxsob.R.inc(16202);String varName = new String(chars, startPos
                                        + startMatchLen, pos - startPos
                                        - startMatchLen);
                                __CLR4_1_2cclccll3lqxsob.R.inc(16203);if ((((isEnableSubstitutionInVariables())&&(__CLR4_1_2cclccll3lqxsob.R.iget(16204)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16205)==0&false))) {{
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16206);final StrBuilder bufName = new StrBuilder(varName);
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16207);substitute(bufName, 0, bufName.length());
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16208);varName = bufName.toString();
                                }
                                }__CLR4_1_2cclccll3lqxsob.R.inc(16209);pos += endMatchLen;
                                __CLR4_1_2cclccll3lqxsob.R.inc(16210);final int endPos = pos;

                                // on the first call initialize priorVariables
                                __CLR4_1_2cclccll3lqxsob.R.inc(16211);if ((((priorVariables == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16212)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16213)==0&false))) {{
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16214);priorVariables = new ArrayList<String>();
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16215);priorVariables.add(new String(chars,
                                            offset, length));
                                }

                                // handle cyclic substitution
                                }__CLR4_1_2cclccll3lqxsob.R.inc(16216);checkCyclicSubstitution(varName, priorVariables);
                                __CLR4_1_2cclccll3lqxsob.R.inc(16217);priorVariables.add(varName);

                                // resolve the variable
                                __CLR4_1_2cclccll3lqxsob.R.inc(16218);final String varValue = resolveVariable(varName, buf,
                                        startPos, endPos);
                                __CLR4_1_2cclccll3lqxsob.R.inc(16219);if ((((varValue != null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16220)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16221)==0&false))) {{
                                    // recursive replace
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16222);final int varLen = varValue.length();
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16223);buf.replace(startPos, endPos, varValue);
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16224);altered = true;
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16225);int change = substitute(buf, startPos,
                                            varLen, priorVariables);
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16226);change = change
                                            + varLen - (endPos - startPos);
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16227);pos += change;
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16228);bufEnd += change;
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16229);lengthChange += change;
                                    __CLR4_1_2cclccll3lqxsob.R.inc(16230);chars = buf.buffer; // in case buffer was
                                                        // altered
                                }

                                // remove variable from the cyclic stack
                                }__CLR4_1_2cclccll3lqxsob.R.inc(16231);priorVariables
                                        .remove(priorVariables.size() - 1);
                                __CLR4_1_2cclccll3lqxsob.R.inc(16232);break;
                            } }else {{
                                __CLR4_1_2cclccll3lqxsob.R.inc(16233);nestedVarCount--;
                                __CLR4_1_2cclccll3lqxsob.R.inc(16234);pos += endMatchLen;
                            }
                        }}
                    }}
                }}
            }}
        }}
        }__CLR4_1_2cclccll3lqxsob.R.inc(16235);if ((((top)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16236)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16237)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16238);return (((altered )&&(__CLR4_1_2cclccll3lqxsob.R.iget(16239)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16240)==0&false))? 1 : 0;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16241);return lengthChange;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Checks if the specified variable is already in the stack (list) of variables.
     *
     * @param varName  the variable name to check
     * @param priorVariables  the list of prior variables
     */
    private void checkCyclicSubstitution(final String varName, final List<String> priorVariables) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16242);
        __CLR4_1_2cclccll3lqxsob.R.inc(16243);if ((((priorVariables.contains(varName) == false)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16244)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16245)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16246);return;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16247);final StrBuilder buf = new StrBuilder(256);
        __CLR4_1_2cclccll3lqxsob.R.inc(16248);buf.append("Infinite loop in property interpolation of ");
        __CLR4_1_2cclccll3lqxsob.R.inc(16249);buf.append(priorVariables.remove(0));
        __CLR4_1_2cclccll3lqxsob.R.inc(16250);buf.append(": ");
        __CLR4_1_2cclccll3lqxsob.R.inc(16251);buf.appendWithSeparators(priorVariables, "->");
        __CLR4_1_2cclccll3lqxsob.R.inc(16252);throw new IllegalStateException(buf.toString());
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Internal method that resolves the value of a variable.
     * <p>
     * Most users of this class do not need to call this method. This method is
     * called automatically by the substitution process.
     * <p>
     * Writers of subclasses can override this method if they need to alter
     * how each substitution occurs. The method is passed the variable's name
     * and must return the corresponding value. This implementation uses the
     * {@link #getVariableResolver()} with the variable's name as the key.
     *
     * @param variableName  the name of the variable, not null
     * @param buf  the buffer where the substitution is occurring, not null
     * @param startPos  the start position of the variable including the prefix, valid
     * @param endPos  the end position of the variable including the suffix, valid
     * @return the variable's value or <b>null</b> if the variable is unknown
     */
    protected String resolveVariable(final String variableName, final StrBuilder buf, final int startPos, final int endPos) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16253);
        __CLR4_1_2cclccll3lqxsob.R.inc(16254);final StrLookup<?> resolver = getVariableResolver();
        __CLR4_1_2cclccll3lqxsob.R.inc(16255);if ((((resolver == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16256)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16257)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16258);return null;
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16259);return resolver.lookup(variableName);
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    // Escape
    //-----------------------------------------------------------------------
    /**
     * Returns the escape character.
     *
     * @return the character used for escaping variable references
     */
    public char getEscapeChar() {try{__CLR4_1_2cclccll3lqxsob.R.inc(16260);
        __CLR4_1_2cclccll3lqxsob.R.inc(16261);return this.escapeChar;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Sets the escape character.
     * If this character is placed before a variable reference in the source
     * text, this variable will be ignored.
     *
     * @param escapeCharacter  the escape character (0 for disabling escaping)
     */
    public void setEscapeChar(final char escapeCharacter) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16262);
        __CLR4_1_2cclccll3lqxsob.R.inc(16263);this.escapeChar = escapeCharacter;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    // Prefix
    //-----------------------------------------------------------------------
    /**
     * Gets the variable prefix matcher currently in use.
     * <p>
     * The variable prefix is the characer or characters that identify the
     * start of a variable. This prefix is expressed in terms of a matcher
     * allowing advanced prefix matches.
     *
     * @return the prefix matcher in use
     */
    public StrMatcher getVariablePrefixMatcher() {try{__CLR4_1_2cclccll3lqxsob.R.inc(16264);
        __CLR4_1_2cclccll3lqxsob.R.inc(16265);return prefixMatcher;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Sets the variable prefix matcher currently in use.
     * <p>
     * The variable prefix is the characer or characters that identify the
     * start of a variable. This prefix is expressed in terms of a matcher
     * allowing advanced prefix matches.
     *
     * @param prefixMatcher  the prefix matcher to use, null ignored
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the prefix matcher is null
     */
    public StrSubstitutor setVariablePrefixMatcher(final StrMatcher prefixMatcher) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16266);
        __CLR4_1_2cclccll3lqxsob.R.inc(16267);if ((((prefixMatcher == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16268)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16269)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16270);throw new IllegalArgumentException("Variable prefix matcher must not be null!");
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16271);this.prefixMatcher = prefixMatcher;
        __CLR4_1_2cclccll3lqxsob.R.inc(16272);return this;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Sets the variable prefix to use.
     * <p>
     * The variable prefix is the character or characters that identify the
     * start of a variable. This method allows a single character prefix to
     * be easily set.
     *
     * @param prefix  the prefix character to use
     * @return this, to enable chaining
     */
    public StrSubstitutor setVariablePrefix(final char prefix) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16273);
        __CLR4_1_2cclccll3lqxsob.R.inc(16274);return setVariablePrefixMatcher(StrMatcher.charMatcher(prefix));
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Sets the variable prefix to use.
     * <p>
     * The variable prefix is the characer or characters that identify the
     * start of a variable. This method allows a string prefix to be easily set.
     *
     * @param prefix  the prefix for variables, not null
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the prefix is null
     */
    public StrSubstitutor setVariablePrefix(final String prefix) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16275);
       __CLR4_1_2cclccll3lqxsob.R.inc(16276);if ((((prefix == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16277)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16278)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16279);throw new IllegalArgumentException("Variable prefix must not be null!");
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16280);return setVariablePrefixMatcher(StrMatcher.stringMatcher(prefix));
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    // Suffix
    //-----------------------------------------------------------------------
    /**
     * Gets the variable suffix matcher currently in use.
     * <p>
     * The variable suffix is the characer or characters that identify the
     * end of a variable. This suffix is expressed in terms of a matcher
     * allowing advanced suffix matches.
     *
     * @return the suffix matcher in use
     */
    public StrMatcher getVariableSuffixMatcher() {try{__CLR4_1_2cclccll3lqxsob.R.inc(16281);
        __CLR4_1_2cclccll3lqxsob.R.inc(16282);return suffixMatcher;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Sets the variable suffix matcher currently in use.
     * <p>
     * The variable suffix is the characer or characters that identify the
     * end of a variable. This suffix is expressed in terms of a matcher
     * allowing advanced suffix matches.
     *
     * @param suffixMatcher  the suffix matcher to use, null ignored
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the suffix matcher is null
     */
    public StrSubstitutor setVariableSuffixMatcher(final StrMatcher suffixMatcher) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16283);
        __CLR4_1_2cclccll3lqxsob.R.inc(16284);if ((((suffixMatcher == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16285)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16286)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16287);throw new IllegalArgumentException("Variable suffix matcher must not be null!");
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16288);this.suffixMatcher = suffixMatcher;
        __CLR4_1_2cclccll3lqxsob.R.inc(16289);return this;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Sets the variable suffix to use.
     * <p>
     * The variable suffix is the characer or characters that identify the
     * end of a variable. This method allows a single character suffix to
     * be easily set.
     *
     * @param suffix  the suffix character to use
     * @return this, to enable chaining
     */
    public StrSubstitutor setVariableSuffix(final char suffix) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16290);
        __CLR4_1_2cclccll3lqxsob.R.inc(16291);return setVariableSuffixMatcher(StrMatcher.charMatcher(suffix));
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Sets the variable suffix to use.
     * <p>
     * The variable suffix is the character or characters that identify the
     * end of a variable. This method allows a string suffix to be easily set.
     *
     * @param suffix  the suffix for variables, not null
     * @return this, to enable chaining
     * @throws IllegalArgumentException if the suffix is null
     */
    public StrSubstitutor setVariableSuffix(final String suffix) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16292);
       __CLR4_1_2cclccll3lqxsob.R.inc(16293);if ((((suffix == null)&&(__CLR4_1_2cclccll3lqxsob.R.iget(16294)!=0|true))||(__CLR4_1_2cclccll3lqxsob.R.iget(16295)==0&false))) {{
            __CLR4_1_2cclccll3lqxsob.R.inc(16296);throw new IllegalArgumentException("Variable suffix must not be null!");
        }
        }__CLR4_1_2cclccll3lqxsob.R.inc(16297);return setVariableSuffixMatcher(StrMatcher.stringMatcher(suffix));
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    // Resolver
    //-----------------------------------------------------------------------
    /**
     * Gets the VariableResolver that is used to lookup variables.
     *
     * @return the VariableResolver
     */
    public StrLookup<?> getVariableResolver() {try{__CLR4_1_2cclccll3lqxsob.R.inc(16298);
        __CLR4_1_2cclccll3lqxsob.R.inc(16299);return this.variableResolver;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Sets the VariableResolver that is used to lookup variables.
     *
     * @param variableResolver  the VariableResolver
     */
    public void setVariableResolver(final StrLookup<?> variableResolver) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16300);
        __CLR4_1_2cclccll3lqxsob.R.inc(16301);this.variableResolver = variableResolver;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    // Substitution support in variable names
    //-----------------------------------------------------------------------
    /**
     * Returns a flag whether substitution is done in variable names.
     *
     * @return the substitution in variable names flag
     * @since 3.0
     */
    public boolean isEnableSubstitutionInVariables() {try{__CLR4_1_2cclccll3lqxsob.R.inc(16302);
        __CLR4_1_2cclccll3lqxsob.R.inc(16303);return enableSubstitutionInVariables;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}

    /**
     * Sets a flag whether substitution is done in variable names. If set to
     * <b>true</b>, the names of variables can contain other variables which are
     * processed first before the original variable is evaluated, e.g.
     * <code>${jre-${java.version}}</code>. The default value is <b>false</b>.
     *
     * @param enableSubstitutionInVariables the new value of the flag
     * @since 3.0
     */
    public void setEnableSubstitutionInVariables(
            final boolean enableSubstitutionInVariables) {try{__CLR4_1_2cclccll3lqxsob.R.inc(16304);
        __CLR4_1_2cclccll3lqxsob.R.inc(16305);this.enableSubstitutionInVariables = enableSubstitutionInVariables;
    }finally{__CLR4_1_2cclccll3lqxsob.R.flushNeeded();}}
}
