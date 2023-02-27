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

import java.util.Map;

/**
 * Lookup a String key to a String value.
 * <p>
 * This class represents the simplest form of a string to string map.
 * It has a benefit over a map in that it can create the result on
 * demand based on the key.
 * <p>
 * This class comes complete with various factory methods.
 * If these do not suffice, you can subclass and implement your own matcher.
 * <p>
 * For example, it would be possible to implement a lookup that used the
 * key as a primary key, and looked up the value on demand from the database
 *
 * @since 2.2
 * @version $Id$
 */
public abstract class StrLookup<V> {public static class __CLR4_1_2c97c97l3lqxsnh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,15913,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Lookup that always returns null.
     */
    private static final StrLookup<String> NONE_LOOKUP;
    /**
     * Lookup that uses System properties.
     */
    private static final StrLookup<String> SYSTEM_PROPERTIES_LOOKUP;
    static {try{__CLR4_1_2c97c97l3lqxsnh.R.inc(15883);
        __CLR4_1_2c97c97l3lqxsnh.R.inc(15884);NONE_LOOKUP = new MapStrLookup<String>(null);
        __CLR4_1_2c97c97l3lqxsnh.R.inc(15885);StrLookup<String> lookup = null;
        __CLR4_1_2c97c97l3lqxsnh.R.inc(15886);try {
            __CLR4_1_2c97c97l3lqxsnh.R.inc(15887);final Map<?, ?> propMap = System.getProperties();
            __CLR4_1_2c97c97l3lqxsnh.R.inc(15888);@SuppressWarnings("unchecked") // System property keys and values are always Strings
            final Map<String, String> properties = (Map<String, String>) propMap;
            __CLR4_1_2c97c97l3lqxsnh.R.inc(15889);lookup = new MapStrLookup<String>(properties);
        } catch (final SecurityException ex) {
            __CLR4_1_2c97c97l3lqxsnh.R.inc(15890);lookup = NONE_LOOKUP;
        }
        __CLR4_1_2c97c97l3lqxsnh.R.inc(15891);SYSTEM_PROPERTIES_LOOKUP = lookup;
    }finally{__CLR4_1_2c97c97l3lqxsnh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a lookup which always returns null.
     *
     * @return a lookup that always returns null, not null
     */
    public static StrLookup<?> noneLookup() {try{__CLR4_1_2c97c97l3lqxsnh.R.inc(15892);
        __CLR4_1_2c97c97l3lqxsnh.R.inc(15893);return NONE_LOOKUP;
    }finally{__CLR4_1_2c97c97l3lqxsnh.R.flushNeeded();}}

    /**
     * Returns a lookup which uses {@link System#getProperties() System properties}
     * to lookup the key to value.
     * <p>
     * If a security manager blocked access to system properties, then null will
     * be returned from every lookup.
     * <p>
     * If a null key is used, this lookup will throw a NullPointerException.
     *
     * @return a lookup using system properties, not null
     */
    public static StrLookup<String> systemPropertiesLookup() {try{__CLR4_1_2c97c97l3lqxsnh.R.inc(15894);
        __CLR4_1_2c97c97l3lqxsnh.R.inc(15895);return SYSTEM_PROPERTIES_LOOKUP;
    }finally{__CLR4_1_2c97c97l3lqxsnh.R.flushNeeded();}}

    /**
     * Returns a lookup which looks up values using a map.
     * <p>
     * If the map is null, then null will be returned from every lookup.
     * The map result object is converted to a string using toString().
     *
     * @param <V> the type of the values supported by the lookup
     * @param map  the map of keys to values, may be null
     * @return a lookup using the map, not null
     */
    public static <V> StrLookup<V> mapLookup(final Map<String, V> map) {try{__CLR4_1_2c97c97l3lqxsnh.R.inc(15896);
        __CLR4_1_2c97c97l3lqxsnh.R.inc(15897);return new MapStrLookup<V>(map);
    }finally{__CLR4_1_2c97c97l3lqxsnh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructor.
     */
    protected StrLookup() {
        super();__CLR4_1_2c97c97l3lqxsnh.R.inc(15899);try{__CLR4_1_2c97c97l3lqxsnh.R.inc(15898);
    }finally{__CLR4_1_2c97c97l3lqxsnh.R.flushNeeded();}}

    /**
     * Looks up a String key to a String value.
     * <p>
     * The internal implementation may use any mechanism to return the value.
     * The simplest implementation is to use a Map. However, virtually any
     * implementation is possible.
     * <p>
     * For example, it would be possible to implement a lookup that used the
     * key as a primary key, and looked up the value on demand from the database
     * Or, a numeric based implementation could be created that treats the key
     * as an integer, increments the value and return the result as a string -
     * converting 1 to 2, 15 to 16 etc.
     * <p>
     * The {@link #lookup(String)} method always returns a String, regardless of
     * the underlying data, by converting it as necessary. For example:
     * <pre>
     * Map<String, Object> map = new HashMap<String, Object>();
     * map.put("number", Integer.valueOf(2));
     * assertEquals("2", StrLookup.mapLookup(map).lookup("number"));
     * </pre>
     * @param key  the key to be looked up, may be null
     * @return the matching value, null if no match
     */
    public abstract String lookup(String key);

    //-----------------------------------------------------------------------
    /**
     * Lookup implementation that uses a Map.
     */
    static class MapStrLookup<V> extends StrLookup<V> {

        /** Map keys are variable names and value. */
        private final Map<String, V> map;

        /**
         * Creates a new instance backed by a Map.
         *
         * @param map  the map of keys to values, may be null
         */
        MapStrLookup(final Map<String, V> map) {try{__CLR4_1_2c97c97l3lqxsnh.R.inc(15900);
            __CLR4_1_2c97c97l3lqxsnh.R.inc(15901);this.map = map;
        }finally{__CLR4_1_2c97c97l3lqxsnh.R.flushNeeded();}}

        /**
         * Looks up a String key to a String value using the map.
         * <p>
         * If the map is null, then null is returned.
         * The map result object is converted to a string using toString().
         *
         * @param key  the key to be looked up, may be null
         * @return the matching value, null if no match
         */
        @Override
        public String lookup(final String key) {try{__CLR4_1_2c97c97l3lqxsnh.R.inc(15902);
            __CLR4_1_2c97c97l3lqxsnh.R.inc(15903);if ((((map == null)&&(__CLR4_1_2c97c97l3lqxsnh.R.iget(15904)!=0|true))||(__CLR4_1_2c97c97l3lqxsnh.R.iget(15905)==0&false))) {{
                __CLR4_1_2c97c97l3lqxsnh.R.inc(15906);return null;
            }
            }__CLR4_1_2c97c97l3lqxsnh.R.inc(15907);final Object obj = map.get(key);
            __CLR4_1_2c97c97l3lqxsnh.R.inc(15908);if ((((obj == null)&&(__CLR4_1_2c97c97l3lqxsnh.R.iget(15909)!=0|true))||(__CLR4_1_2c97c97l3lqxsnh.R.iget(15910)==0&false))) {{
                __CLR4_1_2c97c97l3lqxsnh.R.inc(15911);return null;
            }
            }__CLR4_1_2c97c97l3lqxsnh.R.inc(15912);return obj.toString();
        }finally{__CLR4_1_2c97c97l3lqxsnh.R.flushNeeded();}}
    }
}
