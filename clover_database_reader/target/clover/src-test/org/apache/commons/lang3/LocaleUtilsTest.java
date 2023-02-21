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

import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link LocaleUtils}.
 *
 * @version $Id$
 */
public class LocaleUtilsTest  {static class __CLR4_1_2k19k19l3lqxtw6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,26199,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Locale LOCALE_EN = new Locale("en", "");
    private static final Locale LOCALE_EN_US = new Locale("en", "US");
    private static final Locale LOCALE_EN_US_ZZZZ = new Locale("en", "US", "ZZZZ");
    private static final Locale LOCALE_FR = new Locale("fr", "");
    private static final Locale LOCALE_FR_CA = new Locale("fr", "CA");
    private static final Locale LOCALE_QQ = new Locale("qq", "");
    private static final Locale LOCALE_QQ_ZZ = new Locale("qq", "ZZ");



    @Before
    public void setUp() throws Exception {try{__CLR4_1_2k19k19l3lqxtw6.R.inc(25965);
        // Testing #LANG-304. Must be called before availableLocaleSet is called.
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25966);LocaleUtils.isAvailableLocale(Locale.getDefault());
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test that constructors are public, and work, etc.
     */
    @Test
    public void testConstructor() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),25967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hk1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25967,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hk1b(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(25967);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25968);assertNotNull(new LocaleUtils());
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25969);final Constructor<?>[] cons = LocaleUtils.class.getDeclaredConstructors();
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25970);assertEquals(1, cons.length);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25971);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25972);assertTrue(Modifier.isPublic(LocaleUtils.class.getModifiers()));
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25973);assertFalse(Modifier.isFinal(LocaleUtils.class.getModifiers()));
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Pass in a valid language, test toLocale.
     *
     * @param language  the language string
     */
    private void assertValidToLocale(final String language) {try{__CLR4_1_2k19k19l3lqxtw6.R.inc(25974);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25975);final Locale locale = LocaleUtils.toLocale(language);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25976);assertNotNull("valid locale", locale);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25977);assertEquals(language, locale.getLanguage());
        //country and variant are empty
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25978);assertTrue(locale.getCountry() == null || locale.getCountry().isEmpty());
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25979);assertTrue(locale.getVariant() == null || locale.getVariant().isEmpty());
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    /**
     * Pass in a valid language, test toLocale.
     *
     * @param localeString to pass to toLocale()
     * @param language of the resulting Locale
     * @param country of the resulting Locale
     */
    private void assertValidToLocale(final String localeString, final String language, final String country) {try{__CLR4_1_2k19k19l3lqxtw6.R.inc(25980);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25981);final Locale locale = LocaleUtils.toLocale(localeString);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25982);assertNotNull("valid locale", locale);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25983);assertEquals(language, locale.getLanguage());
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25984);assertEquals(country, locale.getCountry());
        //variant is empty
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25985);assertTrue(locale.getVariant() == null || locale.getVariant().isEmpty());
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    /**
     * Pass in a valid language, test toLocale.
     *
     * @param localeString to pass to toLocale()
     * @param language of the resulting Locale
     * @param country of the resulting Locale
     * @param variant of the resulting Locale
     */
    private void assertValidToLocale(
            final String localeString, final String language, 
            final String country, final String variant) {try{__CLR4_1_2k19k19l3lqxtw6.R.inc(25986);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25987);final Locale locale = LocaleUtils.toLocale(localeString);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25988);assertNotNull("valid locale", locale);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25989);assertEquals(language, locale.getLanguage());
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25990);assertEquals(country, locale.getCountry());
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25991);assertEquals(variant, locale.getVariant());
        
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    /**
     * Test toLocale() method.
     */
    @Test
    public void testToLocale_1Part() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),25992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bnlwzk20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testToLocale_1Part",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25992,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bnlwzk20(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(25992);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25993);assertEquals(null, LocaleUtils.toLocale((String) null));
        
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25994);assertValidToLocale("us");
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25995);assertValidToLocale("fr");
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25996);assertValidToLocale("de");
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25997);assertValidToLocale("zh");
        // Valid format but lang doesnt exist, should make instance anyway
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25998);assertValidToLocale("qq");
        
        __CLR4_1_2k19k19l3lqxtw6.R.inc(25999);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26000);LocaleUtils.toLocale("Us");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26001);fail("Should fail if not lowercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26002);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26003);LocaleUtils.toLocale("US");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26004);fail("Should fail if not lowercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26005);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26006);LocaleUtils.toLocale("uS");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26007);fail("Should fail if not lowercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26008);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26009);LocaleUtils.toLocale("u#");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26010);fail("Should fail if not lowercase");
        } catch (final IllegalArgumentException iae) {}
        
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26011);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26012);LocaleUtils.toLocale("u");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26013);fail("Must be 2 chars if less than 5");
        } catch (final IllegalArgumentException iae) {}
       
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26014);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26015);LocaleUtils.toLocale("uuu");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26016);fail("Must be 2 chars if less than 5");
        } catch (final IllegalArgumentException iae) {}

        __CLR4_1_2k19k19l3lqxtw6.R.inc(26017);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26018);LocaleUtils.toLocale("uu_U");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26019);fail("Must be 2 chars if less than 5");
        } catch (final IllegalArgumentException iae) {}
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}        

    /**
     * Test toLocale() method.
     */
    @Test
    public void testToLocale_2Part() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),26020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28onhg4k2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testToLocale_2Part",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26020,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28onhg4k2s(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26020);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26021);assertValidToLocale("us_EN", "us", "EN");
        //valid though doesnt exist
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26022);assertValidToLocale("us_ZH", "us", "ZH");
        
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26023);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26024);LocaleUtils.toLocale("us-EN");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26025);fail("Should fail as not underscore");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26026);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26027);LocaleUtils.toLocale("us_En");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26028);fail("Should fail second part not uppercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26029);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26030);LocaleUtils.toLocale("us_en");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26031);fail("Should fail second part not uppercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26032);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26033);LocaleUtils.toLocale("us_eN");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26034);fail("Should fail second part not uppercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26035);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26036);LocaleUtils.toLocale("uS_EN");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26037);fail("Should fail first part not lowercase");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26038);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26039);LocaleUtils.toLocale("us_E3");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26040);fail("Should fail second part not uppercase");
        } catch (final IllegalArgumentException iae) {}
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}        

    /**
     * Test toLocale() method.
     */
    @Test
    public void testToLocale_3Part() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),26041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2h1ncz9k3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testToLocale_3Part",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26041,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2h1ncz9k3d(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26041);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26042);assertValidToLocale("us_EN_A", "us", "EN", "A");
        // this isn't pretty, but was caused by a jdk bug it seems
        // http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4210525
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26043);if ((((SystemUtils.isJavaVersionAtLeast(JAVA_1_4))&&(__CLR4_1_2k19k19l3lqxtw6.R.iget(26044)!=0|true))||(__CLR4_1_2k19k19l3lqxtw6.R.iget(26045)==0&false))) {{
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26046);assertValidToLocale("us_EN_a", "us", "EN", "a");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26047);assertValidToLocale("us_EN_SFsafdFDsdfF", "us", "EN", "SFsafdFDsdfF");
        } }else {{
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26048);assertValidToLocale("us_EN_a", "us", "EN", "A");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26049);assertValidToLocale("us_EN_SFsafdFDsdfF", "us", "EN", "SFSAFDFDSDFF");
        }
        
        }__CLR4_1_2k19k19l3lqxtw6.R.inc(26050);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26051);LocaleUtils.toLocale("us_EN-a");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26052);fail("Should fail as not underscore");
        } catch (final IllegalArgumentException iae) {}
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26053);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26054);LocaleUtils.toLocale("uu_UU_");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26055);fail("Must be 3, 5 or 7+ in length");
        } catch (final IllegalArgumentException iae) {}
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Helper method for local lookups.
     *
     * @param locale  the input locale
     * @param defaultLocale  the input default locale
     * @param expected  expected results
     */
    private void assertLocaleLookupList(final Locale locale, final Locale defaultLocale, final Locale[] expected) {try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26056);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26057);final List<Locale> localeList = (((defaultLocale == null )&&(__CLR4_1_2k19k19l3lqxtw6.R.iget(26058)!=0|true))||(__CLR4_1_2k19k19l3lqxtw6.R.iget(26059)==0&false))?
                LocaleUtils.localeLookupList(locale) :
                LocaleUtils.localeLookupList(locale, defaultLocale);
        
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26060);assertEquals(expected.length, localeList.size());
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26061);assertEquals(Arrays.asList(expected), localeList);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26062);assertUnmodifiableCollection(localeList);
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test localeLookupList() method.
     */
    @Test
    public void testLocaleLookupList_Locale() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),26063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24ma3fgk3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testLocaleLookupList_Locale",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26063,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24ma3fgk3z(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26063);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26064);assertLocaleLookupList(null, null, new Locale[0]);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26065);assertLocaleLookupList(LOCALE_QQ, null, new Locale[]{LOCALE_QQ});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26066);assertLocaleLookupList(LOCALE_EN, null, new Locale[]{LOCALE_EN});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26067);assertLocaleLookupList(LOCALE_EN, null, new Locale[]{LOCALE_EN});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26068);assertLocaleLookupList(LOCALE_EN_US, null,
            new Locale[] {
                LOCALE_EN_US,
                LOCALE_EN});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26069);assertLocaleLookupList(LOCALE_EN_US_ZZZZ, null,
            new Locale[] {
                LOCALE_EN_US_ZZZZ,
                LOCALE_EN_US,
                LOCALE_EN});
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}        

    /**
     * Test localeLookupList() method.
     */
    @Test
    public void testLocaleLookupList_LocaleLocale() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),26070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yx057ak46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testLocaleLookupList_LocaleLocale",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26070,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yx057ak46(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26070);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26071);assertLocaleLookupList(LOCALE_QQ, LOCALE_QQ, 
                new Locale[]{LOCALE_QQ});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26072);assertLocaleLookupList(LOCALE_EN, LOCALE_EN, 
                new Locale[]{LOCALE_EN});
        
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26073);assertLocaleLookupList(LOCALE_EN_US, LOCALE_EN_US, 
            new Locale[]{
                LOCALE_EN_US,
                LOCALE_EN});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26074);assertLocaleLookupList(LOCALE_EN_US, LOCALE_QQ,
            new Locale[] {
                LOCALE_EN_US,
                LOCALE_EN,
                LOCALE_QQ});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26075);assertLocaleLookupList(LOCALE_EN_US, LOCALE_QQ_ZZ,
            new Locale[] {
                LOCALE_EN_US,
                LOCALE_EN,
                LOCALE_QQ_ZZ});
        
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26076);assertLocaleLookupList(LOCALE_EN_US_ZZZZ, null,
            new Locale[] {
                LOCALE_EN_US_ZZZZ,
                LOCALE_EN_US,
                LOCALE_EN});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26077);assertLocaleLookupList(LOCALE_EN_US_ZZZZ, LOCALE_EN_US_ZZZZ,
            new Locale[] {
                LOCALE_EN_US_ZZZZ,
                LOCALE_EN_US,
                LOCALE_EN});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26078);assertLocaleLookupList(LOCALE_EN_US_ZZZZ, LOCALE_QQ,
            new Locale[] {
                LOCALE_EN_US_ZZZZ,
                LOCALE_EN_US,
                LOCALE_EN,
                LOCALE_QQ});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26079);assertLocaleLookupList(LOCALE_EN_US_ZZZZ, LOCALE_QQ_ZZ,
            new Locale[] {
                LOCALE_EN_US_ZZZZ,
                LOCALE_EN_US,
                LOCALE_EN,
                LOCALE_QQ_ZZ});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26080);assertLocaleLookupList(LOCALE_FR_CA, LOCALE_EN,
            new Locale[] {
                LOCALE_FR_CA,
                LOCALE_FR,
                LOCALE_EN});
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test availableLocaleList() method.
     */
    @Test
    public void testAvailableLocaleList() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),26081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tgyeoak4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleList",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26081,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tgyeoak4h(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26081);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26082);final List<Locale> list = LocaleUtils.availableLocaleList();
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26083);final List<Locale> list2 = LocaleUtils.availableLocaleList();
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26084);assertNotNull(list);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26085);assertSame(list, list2);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26086);assertUnmodifiableCollection(list);
        
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26087);final Locale[] jdkLocaleArray = Locale.getAvailableLocales();
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26088);final List<Locale> jdkLocaleList = Arrays.asList(jdkLocaleArray);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26089);assertEquals(jdkLocaleList, list);
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test availableLocaleSet() method.
     */
    @Test
    public void testAvailableLocaleSet() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),26090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_228t83ck4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testAvailableLocaleSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26090,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_228t83ck4q(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26090);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26091);final Set<Locale> set = LocaleUtils.availableLocaleSet();
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26092);final Set<Locale> set2 = LocaleUtils.availableLocaleSet();
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26093);assertNotNull(set);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26094);assertSame(set, set2);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26095);assertUnmodifiableCollection(set);
        
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26096);final Locale[] jdkLocaleArray = Locale.getAvailableLocales();
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26097);final List<Locale> jdkLocaleList = Arrays.asList(jdkLocaleArray);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26098);final Set<Locale> jdkLocaleSet = new HashSet<Locale>(jdkLocaleList);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26099);assertEquals(jdkLocaleSet, set);
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test availableLocaleSet() method.
     */
    @SuppressWarnings("boxing") // JUnit4 does not support primitive equality testing apart from long
    @Test
    public void testIsAvailableLocale() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),26100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n2kwkuk50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testIsAvailableLocale",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26100,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n2kwkuk50(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26100);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26101);final Set<Locale> set = LocaleUtils.availableLocaleSet();
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26102);assertEquals(set.contains(LOCALE_EN), LocaleUtils.isAvailableLocale(LOCALE_EN));
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26103);assertEquals(set.contains(LOCALE_EN_US), LocaleUtils.isAvailableLocale(LOCALE_EN_US));
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26104);assertEquals(set.contains(LOCALE_EN_US_ZZZZ), LocaleUtils.isAvailableLocale(LOCALE_EN_US_ZZZZ));
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26105);assertEquals(set.contains(LOCALE_FR), LocaleUtils.isAvailableLocale(LOCALE_FR));
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26106);assertEquals(set.contains(LOCALE_FR_CA), LocaleUtils.isAvailableLocale(LOCALE_FR_CA));
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26107);assertEquals(set.contains(LOCALE_QQ), LocaleUtils.isAvailableLocale(LOCALE_QQ));
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26108);assertEquals(set.contains(LOCALE_QQ_ZZ), LocaleUtils.isAvailableLocale(LOCALE_QQ_ZZ));
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Make sure the language by country is correct. It checks that 
     * the LocaleUtils.languagesByCountry(country) call contains the 
     * array of languages passed in. It may contain more due to JVM 
     * variations.
     *
     * @param country
     * @param languages array of languages that should be returned
     */
    private void assertLanguageByCountry(final String country, final String[] languages) {try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26109);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26110);final List<Locale> list = LocaleUtils.languagesByCountry(country);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26111);final List<Locale> list2 = LocaleUtils.languagesByCountry(country);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26112);assertNotNull(list);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26113);assertSame(list, list2);
        //search through langauges
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26114);for (final String language : languages) {{
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26115);final Iterator<Locale> iterator = list.iterator();
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26116);boolean found = false;
            // see if it was returned by the set
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26117);while ((((iterator.hasNext())&&(__CLR4_1_2k19k19l3lqxtw6.R.iget(26118)!=0|true))||(__CLR4_1_2k19k19l3lqxtw6.R.iget(26119)==0&false))) {{
                __CLR4_1_2k19k19l3lqxtw6.R.inc(26120);final Locale locale = iterator.next();
                // should have an en empty variant
                __CLR4_1_2k19k19l3lqxtw6.R.inc(26121);assertTrue(locale.getVariant() == null
                        || locale.getVariant().isEmpty());
                __CLR4_1_2k19k19l3lqxtw6.R.inc(26122);assertEquals(country, locale.getCountry());
                __CLR4_1_2k19k19l3lqxtw6.R.inc(26123);if ((((language.equals(locale.getLanguage()))&&(__CLR4_1_2k19k19l3lqxtw6.R.iget(26124)!=0|true))||(__CLR4_1_2k19k19l3lqxtw6.R.iget(26125)==0&false))) {{
                    __CLR4_1_2k19k19l3lqxtw6.R.inc(26126);found = true;
                    __CLR4_1_2k19k19l3lqxtw6.R.inc(26127);break;
                }
            }}
            }__CLR4_1_2k19k19l3lqxtw6.R.inc(26128);if ((((!found)&&(__CLR4_1_2k19k19l3lqxtw6.R.iget(26129)!=0|true))||(__CLR4_1_2k19k19l3lqxtw6.R.iget(26130)==0&false))) {{
                __CLR4_1_2k19k19l3lqxtw6.R.inc(26131);fail("Cound not find language: " + language
                        + " for country: " + country);
            }
        }}
        }__CLR4_1_2k19k19l3lqxtw6.R.inc(26132);assertUnmodifiableCollection(list);
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    /**
     * Test languagesByCountry() method.
     */
    @Test
    public void testLanguagesByCountry() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),26133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q63hulk5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testLanguagesByCountry",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26133,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q63hulk5x(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26133);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26134);assertLanguageByCountry(null, new String[0]);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26135);assertLanguageByCountry("GB", new String[]{"en"});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26136);assertLanguageByCountry("ZZ", new String[0]);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26137);assertLanguageByCountry("CH", new String[]{"fr", "de", "it"});
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Make sure the country by language is correct. It checks that 
     * the LocaleUtils.countryByLanguage(language) call contains the 
     * array of countries passed in. It may contain more due to JVM 
     * variations.
     *
     *
     * @param language
     * @param countries array of countries that should be returned
     */
    private void assertCountriesByLanguage(final String language, final String[] countries) {try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26138);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26139);final List<Locale> list = LocaleUtils.countriesByLanguage(language);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26140);final List<Locale> list2 = LocaleUtils.countriesByLanguage(language);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26141);assertNotNull(list);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26142);assertSame(list, list2);
        //search through langauges
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26143);for (final String countrie : countries) {{
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26144);final Iterator<Locale> iterator = list.iterator();
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26145);boolean found = false;
            // see if it was returned by the set
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26146);while ((((iterator.hasNext())&&(__CLR4_1_2k19k19l3lqxtw6.R.iget(26147)!=0|true))||(__CLR4_1_2k19k19l3lqxtw6.R.iget(26148)==0&false))) {{
                __CLR4_1_2k19k19l3lqxtw6.R.inc(26149);final Locale locale = iterator.next();
                // should have an en empty variant
                __CLR4_1_2k19k19l3lqxtw6.R.inc(26150);assertTrue(locale.getVariant() == null
                        || locale.getVariant().isEmpty());
                __CLR4_1_2k19k19l3lqxtw6.R.inc(26151);assertEquals(language, locale.getLanguage());
                __CLR4_1_2k19k19l3lqxtw6.R.inc(26152);if ((((countrie.equals(locale.getCountry()))&&(__CLR4_1_2k19k19l3lqxtw6.R.iget(26153)!=0|true))||(__CLR4_1_2k19k19l3lqxtw6.R.iget(26154)==0&false))) {{
                    __CLR4_1_2k19k19l3lqxtw6.R.inc(26155);found = true;
                    __CLR4_1_2k19k19l3lqxtw6.R.inc(26156);break;
                }
            }}
            }__CLR4_1_2k19k19l3lqxtw6.R.inc(26157);if ((((!found)&&(__CLR4_1_2k19k19l3lqxtw6.R.iget(26158)!=0|true))||(__CLR4_1_2k19k19l3lqxtw6.R.iget(26159)==0&false))) {{
                __CLR4_1_2k19k19l3lqxtw6.R.inc(26160);fail("Cound not find language: " + countrie
                        + " for country: " + language);
            }
        }}
        }__CLR4_1_2k19k19l3lqxtw6.R.inc(26161);assertUnmodifiableCollection(list);
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    /**
     * Test countriesByLanguage() method.
     */
    @Test
    public void testCountriesByLanguage() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),26162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f0svrsk6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testCountriesByLanguage",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26162,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f0svrsk6q(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26162);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26163);assertCountriesByLanguage(null, new String[0]);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26164);assertCountriesByLanguage("de", new String[]{"DE", "CH", "AT", "LU"});
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26165);assertCountriesByLanguage("zz", new String[0]);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26166);assertCountriesByLanguage("it", new String[]{"IT", "CH"});
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    /**
     * @param coll  the collection to check
     */
    private static void assertUnmodifiableCollection(final Collection<?> coll) {try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26167);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26168);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26169);coll.add(null);
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26170);fail();
        } catch (final UnsupportedOperationException ex) {}
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    /**
     * Tests #LANG-328 - only language+variant
     */
    @Test
    public void testLang328() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),26171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b2amgwk6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testLang328",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26171,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b2amgwk6z(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26171);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26172);assertValidToLocale("fr__P", "fr", "", "P");
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26173);assertValidToLocale("fr__POSIX", "fr", "", "POSIX");
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

    /**
     * Tests #LANG-865, strings starting with an underscore.
     */
    @Test
    public void testLang865() {__CLR4_1_2k19k19l3lqxtw6.R.globalSliceStart(getClass().getName(),26174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wjr802k72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k19k19l3lqxtw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k19k19l3lqxtw6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.LocaleUtilsTest.testLang865",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26174,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wjr802k72(){try{__CLR4_1_2k19k19l3lqxtw6.R.inc(26174);
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26175);assertValidToLocale("_GB", "", "GB", "");
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26176);assertValidToLocale("_GB_P", "", "GB", "P");
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26177);assertValidToLocale("_GB_POSIX", "", "GB", "POSIX");
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26178);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26179);LocaleUtils.toLocale("_G");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26180);fail("Must be at least 3 chars if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26181);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26182);LocaleUtils.toLocale("_Gb");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26183);fail("Must be uppercase if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26184);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26185);LocaleUtils.toLocale("_gB");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26186);fail("Must be uppercase if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26187);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26188);LocaleUtils.toLocale("_1B");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26189);fail("Must be letter if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26190);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26191);LocaleUtils.toLocale("_G1");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26192);fail("Must be letter if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26193);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26194);LocaleUtils.toLocale("_GB_");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26195);fail("Must be at least 5 chars if starts with underscore");
        } catch (final IllegalArgumentException iae) {
        }
        __CLR4_1_2k19k19l3lqxtw6.R.inc(26196);try {
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26197);LocaleUtils.toLocale("_GBAP");
            __CLR4_1_2k19k19l3lqxtw6.R.inc(26198);fail("Must have underscore after the country if starts with underscore and is at least 5 chars");
        } catch (final IllegalArgumentException iae) {
        }
    }finally{__CLR4_1_2k19k19l3lqxtw6.R.flushNeeded();}}

}
