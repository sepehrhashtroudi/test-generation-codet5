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

/**
 * <p>An enum representing all the versions of the Java specification.
 * This is intended to mirror available values from the
 * <em>java.specification.version</em> System property. </p>
 *
 * @since 3.0
 * @version $Id: $
 */
public enum JavaVersion {
    
    /**
     * The Java version reported by Android. This is not an official Java version number.
     */
    JAVA_0_9(1.5f, "0.9"),
    
    /**
     * Java 1.1.
     */
    JAVA_1_1(1.1f, "1.1"),

    /**
     * Java 1.2.
     */
    JAVA_1_2(1.2f, "1.2"),

    /**
     * Java 1.3.
     */
    JAVA_1_3(1.3f, "1.3"),

    /**
     * Java 1.4.
     */
    JAVA_1_4(1.4f, "1.4"),

    /**
     * Java 1.5.
     */
    JAVA_1_5(1.5f, "1.5"),

    /**
     * Java 1.6.
     */
    JAVA_1_6(1.6f, "1.6"),

    /**
     * Java 1.7.
     */
    JAVA_1_7(1.7f, "1.7"),

    /**
     * Java 1.8.
     */
    JAVA_1_8(1.8f, "1.8");

    /**
     * The float value.
     */
    private float value;
    /**
     * The standard name.
     */
    private String name;

    /**
     * Constructor.
     *
     * @param value  the float value
     * @param name  the standard name, not null
     */
    JavaVersion(final float value, final String name) {try{__CLR4_1_23px3pxl3lqxrud.R.inc(4821);
        __CLR4_1_23px3pxl3lqxrud.R.inc(4822);this.value = value;
        __CLR4_1_23px3pxl3lqxrud.R.inc(4823);this.name = name;
    }finally{__CLR4_1_23px3pxl3lqxrud.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Whether this version of Java is at least the version of Java passed in.</p>
     *
     * <p>For example:<br />
     *  {@code myVersion.atLeast(JavaVersion.JAVA_1_4)}<p>
     *
     * @param requiredVersion  the version to check against, not null
     * @return true if this version is equal to or greater than the specified version
     */
    public boolean atLeast(final JavaVersion requiredVersion) {try{__CLR4_1_23px3pxl3lqxrud.R.inc(4824);
        __CLR4_1_23px3pxl3lqxrud.R.inc(4825);return this.value >= requiredVersion.value;
    }finally{__CLR4_1_23px3pxl3lqxrud.R.flushNeeded();}}

    /**
     * Transforms the given string with a Java version number to the
     * corresponding constant of this enumeration class. This method is used
     * internally.
     *
     * @param nom the Java version as string
     * @return the corresponding enumeration constant or <b>null</b> if the
     * version is unknown
     */
    // helper for static importing
    static JavaVersion getJavaVersion(final String nom) {try{__CLR4_1_23px3pxl3lqxrud.R.inc(4826);
        __CLR4_1_23px3pxl3lqxrud.R.inc(4827);return get(nom);
    }finally{__CLR4_1_23px3pxl3lqxrud.R.flushNeeded();}}

    /**
     * Transforms the given string with a Java version number to the
     * corresponding constant of this enumeration class. This method is used
     * internally.
     *
     * @param nom the Java version as string
     * @return the corresponding enumeration constant or <b>null</b> if the
     * version is unknown
     */
    static JavaVersion get(final String nom) {try{__CLR4_1_23px3pxl3lqxrud.R.inc(4828);
        __CLR4_1_23px3pxl3lqxrud.R.inc(4829);if (((("0.9".equals(nom))&&(__CLR4_1_23px3pxl3lqxrud.R.iget(4830)!=0|true))||(__CLR4_1_23px3pxl3lqxrud.R.iget(4831)==0&false))) {{
            __CLR4_1_23px3pxl3lqxrud.R.inc(4832);return JAVA_0_9;
        } }else {__CLR4_1_23px3pxl3lqxrud.R.inc(4833);if (((("1.1".equals(nom))&&(__CLR4_1_23px3pxl3lqxrud.R.iget(4834)!=0|true))||(__CLR4_1_23px3pxl3lqxrud.R.iget(4835)==0&false))) {{
            __CLR4_1_23px3pxl3lqxrud.R.inc(4836);return JAVA_1_1;
        } }else {__CLR4_1_23px3pxl3lqxrud.R.inc(4837);if (((("1.2".equals(nom))&&(__CLR4_1_23px3pxl3lqxrud.R.iget(4838)!=0|true))||(__CLR4_1_23px3pxl3lqxrud.R.iget(4839)==0&false))) {{
            __CLR4_1_23px3pxl3lqxrud.R.inc(4840);return JAVA_1_2;
        } }else {__CLR4_1_23px3pxl3lqxrud.R.inc(4841);if (((("1.3".equals(nom))&&(__CLR4_1_23px3pxl3lqxrud.R.iget(4842)!=0|true))||(__CLR4_1_23px3pxl3lqxrud.R.iget(4843)==0&false))) {{
            __CLR4_1_23px3pxl3lqxrud.R.inc(4844);return JAVA_1_3;
        } }else {__CLR4_1_23px3pxl3lqxrud.R.inc(4845);if (((("1.4".equals(nom))&&(__CLR4_1_23px3pxl3lqxrud.R.iget(4846)!=0|true))||(__CLR4_1_23px3pxl3lqxrud.R.iget(4847)==0&false))) {{
            __CLR4_1_23px3pxl3lqxrud.R.inc(4848);return JAVA_1_4;
        } }else {__CLR4_1_23px3pxl3lqxrud.R.inc(4849);if (((("1.5".equals(nom))&&(__CLR4_1_23px3pxl3lqxrud.R.iget(4850)!=0|true))||(__CLR4_1_23px3pxl3lqxrud.R.iget(4851)==0&false))) {{
            __CLR4_1_23px3pxl3lqxrud.R.inc(4852);return JAVA_1_5;
        } }else {__CLR4_1_23px3pxl3lqxrud.R.inc(4853);if (((("1.6".equals(nom))&&(__CLR4_1_23px3pxl3lqxrud.R.iget(4854)!=0|true))||(__CLR4_1_23px3pxl3lqxrud.R.iget(4855)==0&false))) {{
            __CLR4_1_23px3pxl3lqxrud.R.inc(4856);return JAVA_1_6;
        } }else {__CLR4_1_23px3pxl3lqxrud.R.inc(4857);if (((("1.7".equals(nom))&&(__CLR4_1_23px3pxl3lqxrud.R.iget(4858)!=0|true))||(__CLR4_1_23px3pxl3lqxrud.R.iget(4859)==0&false))) {{
            __CLR4_1_23px3pxl3lqxrud.R.inc(4860);return JAVA_1_7;
        } }else {__CLR4_1_23px3pxl3lqxrud.R.inc(4861);if (((("1.8".equals(nom))&&(__CLR4_1_23px3pxl3lqxrud.R.iget(4862)!=0|true))||(__CLR4_1_23px3pxl3lqxrud.R.iget(4863)==0&false))) {{
            __CLR4_1_23px3pxl3lqxrud.R.inc(4864);return JAVA_1_8;
        } }else {{
            __CLR4_1_23px3pxl3lqxrud.R.inc(4865);return null;
        }
    }}}}}}}}}}finally{__CLR4_1_23px3pxl3lqxrud.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>The string value is overridden to return the standard name.</p>
     *
     * <p>For example, <code>"1.5"</code>.</p>
     *
     * @return the name, not null
     */
    @Override
    public String toString() {try{__CLR4_1_23px3pxl3lqxrud.R.inc(4866);
        __CLR4_1_23px3pxl3lqxrud.R.inc(4867);return name;
    }finally{__CLR4_1_23px3pxl3lqxrud.R.flushNeeded();}}

;public static class __CLR4_1_23px3pxl3lqxrud{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,4868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
