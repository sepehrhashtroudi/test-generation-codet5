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

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;

import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang3.SystemUtils;

/**
 * Test case for {@link ExtendedMessageFormat}.
 *
 * @since 2.4
 * @version $Id$
 */
public class ExtendedMessageFormatTest {static class __CLR4_1_2t74t74l3lqxuur{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,38026,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();

    @Before
    public void setUp() throws Exception {try{__CLR4_1_2t74t74l3lqxuur.R.inc(37840);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37841);registry.put("lower", new LowerCaseFormatFactory());
        __CLR4_1_2t74t74l3lqxuur.R.inc(37842);registry.put("upper", new UpperCaseFormatFactory());
    }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    /**
     * Test extended formats.
     */
    @Test
    public void testExtendedFormats() {__CLR4_1_2t74t74l3lqxuur.R.globalSliceStart(getClass().getName(),37843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jgzvvct77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t74t74l3lqxuur.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t74t74l3lqxuur.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testExtendedFormats",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37843,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jgzvvct77(){try{__CLR4_1_2t74t74l3lqxuur.R.inc(37843);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37844);final String pattern = "Lower: {0,lower} Upper: {1,upper}";
        __CLR4_1_2t74t74l3lqxuur.R.inc(37845);final ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37846);assertPatternsEqual("TOPATTERN", pattern, emf.toPattern());
        __CLR4_1_2t74t74l3lqxuur.R.inc(37847);assertEquals("Lower: foo Upper: BAR", emf.format(new Object[] {"foo", "bar"}));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37848);assertEquals("Lower: foo Upper: BAR", emf.format(new Object[] {"Foo", "Bar"}));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37849);assertEquals("Lower: foo Upper: BAR", emf.format(new Object[] {"FOO", "BAR"}));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37850);assertEquals("Lower: foo Upper: BAR", emf.format(new Object[] {"FOO", "bar"}));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37851);assertEquals("Lower: foo Upper: BAR", emf.format(new Object[] {"foo", "BAR"}));
    }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    /**
     * Test Bug LANG-477 - out of memory error with escaped quote
     */
    @Test
    public void testEscapedQuote_LANG_477() {__CLR4_1_2t74t74l3lqxuur.R.globalSliceStart(getClass().getName(),37852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23dbssit7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t74t74l3lqxuur.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t74t74l3lqxuur.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testEscapedQuote_LANG_477",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37852,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23dbssit7g(){try{__CLR4_1_2t74t74l3lqxuur.R.inc(37852);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37853);final String pattern = "it''s a {0,lower} 'test'!";
        __CLR4_1_2t74t74l3lqxuur.R.inc(37854);final ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37855);assertEquals("it's a dummy test!", emf.format(new Object[] {"DUMMY"}));
    }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    /**
     * Test extended and built in formats.
     */
    @Test
    public void testExtendedAndBuiltInFormats() {__CLR4_1_2t74t74l3lqxuur.R.globalSliceStart(getClass().getName(),37856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i6x26kt7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t74t74l3lqxuur.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t74t74l3lqxuur.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testExtendedAndBuiltInFormats",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37856,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i6x26kt7k(){try{__CLR4_1_2t74t74l3lqxuur.R.inc(37856);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37857);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2t74t74l3lqxuur.R.inc(37858);cal.set(2007, Calendar.JANUARY, 23, 18, 33, 05);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37859);final Object[] args = new Object[] {"John Doe", cal.getTime(), Double.valueOf("12345.67")};
        __CLR4_1_2t74t74l3lqxuur.R.inc(37860);final String builtinsPattern = "DOB: {1,date,short} Salary: {2,number,currency}";
        __CLR4_1_2t74t74l3lqxuur.R.inc(37861);final String extendedPattern = "Name: {0,upper} ";
        __CLR4_1_2t74t74l3lqxuur.R.inc(37862);final String pattern = extendedPattern + builtinsPattern;

        __CLR4_1_2t74t74l3lqxuur.R.inc(37863);final HashSet<Locale> testLocales = new HashSet<Locale>();
        __CLR4_1_2t74t74l3lqxuur.R.inc(37864);testLocales.addAll(Arrays.asList(DateFormat.getAvailableLocales()));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37865);testLocales.retainAll(Arrays.asList(NumberFormat.getAvailableLocales()));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37866);testLocales.add(null);

        __CLR4_1_2t74t74l3lqxuur.R.inc(37867);for (final Locale locale : testLocales) {{
            __CLR4_1_2t74t74l3lqxuur.R.inc(37868);final MessageFormat builtins = createMessageFormat(builtinsPattern, locale);
            __CLR4_1_2t74t74l3lqxuur.R.inc(37869);final String expectedPattern = extendedPattern + builtins.toPattern();
            __CLR4_1_2t74t74l3lqxuur.R.inc(37870);DateFormat df = null;
            __CLR4_1_2t74t74l3lqxuur.R.inc(37871);NumberFormat nf = null;
            __CLR4_1_2t74t74l3lqxuur.R.inc(37872);ExtendedMessageFormat emf = null;
            __CLR4_1_2t74t74l3lqxuur.R.inc(37873);if ((((locale == null)&&(__CLR4_1_2t74t74l3lqxuur.R.iget(37874)!=0|true))||(__CLR4_1_2t74t74l3lqxuur.R.iget(37875)==0&false))) {{
                __CLR4_1_2t74t74l3lqxuur.R.inc(37876);df = DateFormat.getDateInstance(DateFormat.SHORT);
                __CLR4_1_2t74t74l3lqxuur.R.inc(37877);nf = NumberFormat.getCurrencyInstance();
                __CLR4_1_2t74t74l3lqxuur.R.inc(37878);emf = new ExtendedMessageFormat(pattern, registry);
            } }else {{
                __CLR4_1_2t74t74l3lqxuur.R.inc(37879);df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
                __CLR4_1_2t74t74l3lqxuur.R.inc(37880);nf = NumberFormat.getCurrencyInstance(locale);
                __CLR4_1_2t74t74l3lqxuur.R.inc(37881);emf = new ExtendedMessageFormat(pattern, locale, registry);
            }
            }__CLR4_1_2t74t74l3lqxuur.R.inc(37882);final StringBuilder expected = new StringBuilder();
            __CLR4_1_2t74t74l3lqxuur.R.inc(37883);expected.append("Name: ");
            __CLR4_1_2t74t74l3lqxuur.R.inc(37884);expected.append(args[0].toString().toUpperCase());
            __CLR4_1_2t74t74l3lqxuur.R.inc(37885);expected.append(" DOB: ");
            __CLR4_1_2t74t74l3lqxuur.R.inc(37886);expected.append(df.format(args[1]));
            __CLR4_1_2t74t74l3lqxuur.R.inc(37887);expected.append(" Salary: ");
            __CLR4_1_2t74t74l3lqxuur.R.inc(37888);expected.append(nf.format(args[2]));
            __CLR4_1_2t74t74l3lqxuur.R.inc(37889);assertPatternsEqual("pattern comparison for locale " + locale, expectedPattern, emf.toPattern());
            __CLR4_1_2t74t74l3lqxuur.R.inc(37890);assertEquals(String.valueOf(locale), expected.toString(), emf.format(args));
        }
    }}finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

//    /**
//     * Test extended formats with choice format.
//     *
//     * NOTE: FAILING - currently sub-formats not supported
//     */
//    public void testExtendedWithChoiceFormat() {
//        String pattern = "Choice: {0,choice,1.0#{1,lower}|2.0#{1,upper}}";
//        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
//        assertPatterns(null, pattern, emf.toPattern());
//        try {
//            assertEquals("one", emf.format(new Object[] {Integer.valueOf(1), "ONE"}));
//            assertEquals("TWO", emf.format(new Object[] {Integer.valueOf(2), "two"}));
//        } catch (IllegalArgumentException e) {
//            // currently sub-formats not supported
//        }
//    }

//    /**
//     * Test mixed extended and built-in formats with choice format.
//     *
//     * NOTE: FAILING - currently sub-formats not supported
//     */
//    public void testExtendedAndBuiltInWithChoiceFormat() {
//        String pattern = "Choice: {0,choice,1.0#{0} {1,lower} {2,number}|2.0#{0} {1,upper} {2,number,currency}}";
//        Object[] lowArgs  = new Object[] {Integer.valueOf(1), "Low",  Double.valueOf("1234.56")};
//        Object[] highArgs = new Object[] {Integer.valueOf(2), "High", Double.valueOf("9876.54")};
//        Locale[] availableLocales = ChoiceFormat.getAvailableLocales();
//        Locale[] testLocales = new Locale[availableLocales.length + 1];
//        testLocales[0] = null;
//        System.arraycopy(availableLocales, 0, testLocales, 1, availableLocales.length);
//        for (int i = 0; i < testLocales.length; i++) {
//            NumberFormat nf = null;
//            NumberFormat cf = null;
//            ExtendedMessageFormat emf = null;
//            if (testLocales[i] == null) {
//                nf = NumberFormat.getNumberInstance();
//                cf = NumberFormat.getCurrencyInstance();
//                emf = new ExtendedMessageFormat(pattern, registry);
//            } else {
//                nf = NumberFormat.getNumberInstance(testLocales[i]);
//                cf = NumberFormat.getCurrencyInstance(testLocales[i]);
//                emf = new ExtendedMessageFormat(pattern, testLocales[i], registry);
//            }
//            assertPatterns(null, pattern, emf.toPattern());
//            try {
//                String lowExpected = lowArgs[0] + " low "    + nf.format(lowArgs[2]);
//                String highExpected = highArgs[0] + " HIGH "  + cf.format(highArgs[2]);
//                assertEquals(lowExpected,  emf.format(lowArgs));
//                assertEquals(highExpected, emf.format(highArgs));
//            } catch (IllegalArgumentException e) {
//                // currently sub-formats not supported
//            }
//        }
//    }

    /**
     * Test the built in choice format.
     */
    @Test
    public void testBuiltInChoiceFormat() {__CLR4_1_2t74t74l3lqxuur.R.globalSliceStart(getClass().getName(),37891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gsn10wt8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t74t74l3lqxuur.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t74t74l3lqxuur.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testBuiltInChoiceFormat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37891,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gsn10wt8j(){try{__CLR4_1_2t74t74l3lqxuur.R.inc(37891);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37892);final Object[] values = new Number[] {Integer.valueOf(1), Double.valueOf("2.2"), Double.valueOf("1234.5")};
        __CLR4_1_2t74t74l3lqxuur.R.inc(37893);String choicePattern = null;
        __CLR4_1_2t74t74l3lqxuur.R.inc(37894);final Locale[] availableLocales = ChoiceFormat.getAvailableLocales();

        __CLR4_1_2t74t74l3lqxuur.R.inc(37895);choicePattern = "{0,choice,1#One|2#Two|3#Many {0,number}}";
        __CLR4_1_2t74t74l3lqxuur.R.inc(37896);for (final Object value : values) {{
            __CLR4_1_2t74t74l3lqxuur.R.inc(37897);checkBuiltInFormat(value + ": " + choicePattern, new Object[] {value}, availableLocales);
        }

        }__CLR4_1_2t74t74l3lqxuur.R.inc(37898);choicePattern = "{0,choice,1#''One''|2#\"Two\"|3#''{Many}'' {0,number}}";
        __CLR4_1_2t74t74l3lqxuur.R.inc(37899);for (final Object value : values) {{
            __CLR4_1_2t74t74l3lqxuur.R.inc(37900);checkBuiltInFormat(value + ": " + choicePattern, new Object[] {value}, availableLocales);
        }
    }}finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    /**
     * Test the built in date/time formats
     */
    @Test
    public void testBuiltInDateTimeFormat() {__CLR4_1_2t74t74l3lqxuur.R.globalSliceStart(getClass().getName(),37901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_234jv2it8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t74t74l3lqxuur.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t74t74l3lqxuur.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testBuiltInDateTimeFormat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37901,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_234jv2it8t(){try{__CLR4_1_2t74t74l3lqxuur.R.inc(37901);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37902);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2t74t74l3lqxuur.R.inc(37903);cal.set(2007, Calendar.JANUARY, 23, 18, 33, 05);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37904);final Object[] args = new Object[] {cal.getTime()};
        __CLR4_1_2t74t74l3lqxuur.R.inc(37905);final Locale[] availableLocales = DateFormat.getAvailableLocales();

        __CLR4_1_2t74t74l3lqxuur.R.inc(37906);checkBuiltInFormat("1: {0,date,short}",    args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37907);checkBuiltInFormat("2: {0,date,medium}",   args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37908);checkBuiltInFormat("3: {0,date,long}",     args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37909);checkBuiltInFormat("4: {0,date,full}",     args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37910);checkBuiltInFormat("5: {0,date,d MMM yy}", args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37911);checkBuiltInFormat("6: {0,time,short}",    args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37912);checkBuiltInFormat("7: {0,time,medium}",   args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37913);checkBuiltInFormat("8: {0,time,long}",     args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37914);checkBuiltInFormat("9: {0,time,full}",     args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37915);checkBuiltInFormat("10: {0,time,HH:mm}",   args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37916);checkBuiltInFormat("11: {0,date}",         args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37917);checkBuiltInFormat("12: {0,time}",         args, availableLocales);
    }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    @Test
    public void testOverriddenBuiltinFormat() {__CLR4_1_2t74t74l3lqxuur.R.globalSliceStart(getClass().getName(),37918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ndi0e3t9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t74t74l3lqxuur.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t74t74l3lqxuur.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testOverriddenBuiltinFormat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ndi0e3t9a(){try{__CLR4_1_2t74t74l3lqxuur.R.inc(37918);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37919);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2t74t74l3lqxuur.R.inc(37920);cal.set(2007, Calendar.JANUARY, 23);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37921);final Object[] args = new Object[] {cal.getTime()};
        __CLR4_1_2t74t74l3lqxuur.R.inc(37922);final Locale[] availableLocales = DateFormat.getAvailableLocales();
        __CLR4_1_2t74t74l3lqxuur.R.inc(37923);final Map<String, ? extends FormatFactory> registry = Collections.singletonMap("date", new OverrideShortDateFormatFactory());

        //check the non-overridden builtins:
        __CLR4_1_2t74t74l3lqxuur.R.inc(37924);checkBuiltInFormat("1: {0,date}", registry,          args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37925);checkBuiltInFormat("2: {0,date,medium}", registry,   args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37926);checkBuiltInFormat("3: {0,date,long}", registry,     args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37927);checkBuiltInFormat("4: {0,date,full}", registry,     args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37928);checkBuiltInFormat("5: {0,date,d MMM yy}", registry, args, availableLocales);

        //check the overridden format:
        __CLR4_1_2t74t74l3lqxuur.R.inc(37929);for (int i = -1; (((i < availableLocales.length)&&(__CLR4_1_2t74t74l3lqxuur.R.iget(37930)!=0|true))||(__CLR4_1_2t74t74l3lqxuur.R.iget(37931)==0&false)); i++) {{
            __CLR4_1_2t74t74l3lqxuur.R.inc(37932);final Locale locale = (((i < 0 )&&(__CLR4_1_2t74t74l3lqxuur.R.iget(37933)!=0|true))||(__CLR4_1_2t74t74l3lqxuur.R.iget(37934)==0&false))? null : availableLocales[i];
            __CLR4_1_2t74t74l3lqxuur.R.inc(37935);final MessageFormat dateDefault = createMessageFormat("{0,date}", locale);
            __CLR4_1_2t74t74l3lqxuur.R.inc(37936);final String pattern = "{0,date,short}";
            __CLR4_1_2t74t74l3lqxuur.R.inc(37937);final ExtendedMessageFormat dateShort = new ExtendedMessageFormat(pattern, locale, registry);
            __CLR4_1_2t74t74l3lqxuur.R.inc(37938);assertEquals("overridden date,short format", dateDefault.format(args), dateShort.format(args));
            __CLR4_1_2t74t74l3lqxuur.R.inc(37939);assertEquals("overridden date,short pattern", pattern, dateShort.toPattern());
        }
    }}finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    /**
     * Test the built in number formats.
     */
    @Test
    public void testBuiltInNumberFormat() {__CLR4_1_2t74t74l3lqxuur.R.globalSliceStart(getClass().getName(),37940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pbliuwt9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t74t74l3lqxuur.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t74t74l3lqxuur.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testBuiltInNumberFormat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37940,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pbliuwt9w(){try{__CLR4_1_2t74t74l3lqxuur.R.inc(37940);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37941);final Object[] args = new Object[] {Double.valueOf("6543.21")};
        __CLR4_1_2t74t74l3lqxuur.R.inc(37942);final Locale[] availableLocales = NumberFormat.getAvailableLocales();
        __CLR4_1_2t74t74l3lqxuur.R.inc(37943);checkBuiltInFormat("1: {0,number}",            args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37944);checkBuiltInFormat("2: {0,number,integer}",    args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37945);checkBuiltInFormat("3: {0,number,currency}",   args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37946);checkBuiltInFormat("4: {0,number,percent}",    args, availableLocales);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37947);checkBuiltInFormat("5: {0,number,00000.000}",  args, availableLocales);
    }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    /**
     * Test equals() and hashcode.
     */
    @Test
    public void testEqualsHashcode() {__CLR4_1_2t74t74l3lqxuur.R.globalSliceStart(getClass().getName(),37948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vnww19ta4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t74t74l3lqxuur.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t74t74l3lqxuur.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.ExtendedMessageFormatTest.testEqualsHashcode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37948,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vnww19ta4(){try{__CLR4_1_2t74t74l3lqxuur.R.inc(37948);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37949);final Map<String, ? extends FormatFactory> registry = Collections.singletonMap("testfmt", new LowerCaseFormatFactory());
        __CLR4_1_2t74t74l3lqxuur.R.inc(37950);final Map<String, ? extends FormatFactory> otherRegitry = Collections.singletonMap("testfmt", new UpperCaseFormatFactory());

        __CLR4_1_2t74t74l3lqxuur.R.inc(37951);final String pattern = "Pattern: {0,testfmt}";
        __CLR4_1_2t74t74l3lqxuur.R.inc(37952);final ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, Locale.US, registry);

        __CLR4_1_2t74t74l3lqxuur.R.inc(37953);ExtendedMessageFormat other = null;

        // Same object
        __CLR4_1_2t74t74l3lqxuur.R.inc(37954);assertTrue("same, equals()",   emf.equals(emf));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37955);assertTrue("same, hashcode()", emf.hashCode() == emf.hashCode());

        // Equal Object
        __CLR4_1_2t74t74l3lqxuur.R.inc(37956);other = new ExtendedMessageFormat(pattern, Locale.US, registry);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37957);assertTrue("equal, equals()",   emf.equals(other));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37958);assertTrue("equal, hashcode()", emf.hashCode() == other.hashCode());

        // Different Class
        __CLR4_1_2t74t74l3lqxuur.R.inc(37959);other = new OtherExtendedMessageFormat(pattern, Locale.US, registry);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37960);assertFalse("class, equals()",  emf.equals(other));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37961);assertTrue("class, hashcode()", emf.hashCode() == other.hashCode()); // same hashcode
        
        // Different pattern
        __CLR4_1_2t74t74l3lqxuur.R.inc(37962);other = new ExtendedMessageFormat("X" + pattern, Locale.US, registry);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37963);assertFalse("pattern, equals()",   emf.equals(other));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37964);assertFalse("pattern, hashcode()", emf.hashCode() == other.hashCode());

        // Different registry
        __CLR4_1_2t74t74l3lqxuur.R.inc(37965);other = new ExtendedMessageFormat(pattern, Locale.US, otherRegitry);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37966);assertFalse("registry, equals()",   emf.equals(other));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37967);assertFalse("registry, hashcode()", emf.hashCode() == other.hashCode());

        // Different Locale
        __CLR4_1_2t74t74l3lqxuur.R.inc(37968);other = new ExtendedMessageFormat(pattern, Locale.FRANCE, registry);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37969);assertFalse("locale, equals()",  emf.equals(other));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37970);assertTrue("locale, hashcode()", emf.hashCode() == other.hashCode()); // same hashcode
    }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    /**
     * Test a built in format for the specified Locales, plus <code>null</code> Locale.
     * @param pattern MessageFormat pattern
     * @param args MessageFormat arguments
     * @param locales to test
     */
    private void checkBuiltInFormat(final String pattern, final Object[] args, final Locale[] locales) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(37971);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37972);checkBuiltInFormat(pattern, null, args, locales);
    }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    /**
     * Test a built in format for the specified Locales, plus <code>null</code> Locale.
     * @param pattern MessageFormat pattern
     * @param registry FormatFactory registry to use
     * @param args MessageFormat arguments
     * @param locales to test
     */
    private void checkBuiltInFormat(final String pattern, final Map<String, ?> registry, final Object[] args, final Locale[] locales) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(37973);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37974);checkBuiltInFormat(pattern, registry, args, (Locale) null);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37975);for (final Locale locale : locales) {{
            __CLR4_1_2t74t74l3lqxuur.R.inc(37976);checkBuiltInFormat(pattern, registry, args, locale);
        }
    }}finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    /**
     * Create an ExtendedMessageFormat for the specified pattern and locale and check the
     * formated output matches the expected result for the parameters.
     * @param pattern string
     * @param registry map
     * @param args Object[]
     * @param locale Locale
     */
    private void checkBuiltInFormat(final String pattern, final Map<String, ?> registry, final Object[] args, final Locale locale) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(37977);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37978);final StringBuilder buffer = new StringBuilder();
        __CLR4_1_2t74t74l3lqxuur.R.inc(37979);buffer.append("Pattern=[");
        __CLR4_1_2t74t74l3lqxuur.R.inc(37980);buffer.append(pattern);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37981);buffer.append("], locale=[");
        __CLR4_1_2t74t74l3lqxuur.R.inc(37982);buffer.append(locale);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37983);buffer.append("]");
        __CLR4_1_2t74t74l3lqxuur.R.inc(37984);final MessageFormat mf = createMessageFormat(pattern, locale);
        // System.out.println(buffer + ", result=[" + mf.format(args) +"]");
        __CLR4_1_2t74t74l3lqxuur.R.inc(37985);ExtendedMessageFormat emf = null;
        __CLR4_1_2t74t74l3lqxuur.R.inc(37986);if ((((locale == null)&&(__CLR4_1_2t74t74l3lqxuur.R.iget(37987)!=0|true))||(__CLR4_1_2t74t74l3lqxuur.R.iget(37988)==0&false))) {{
            __CLR4_1_2t74t74l3lqxuur.R.inc(37989);emf = new ExtendedMessageFormat(pattern);
        } }else {{
            __CLR4_1_2t74t74l3lqxuur.R.inc(37990);emf = new ExtendedMessageFormat(pattern, locale);
        }
        }__CLR4_1_2t74t74l3lqxuur.R.inc(37991);assertEquals("format "    + buffer.toString(), mf.format(args), emf.format(args));
        __CLR4_1_2t74t74l3lqxuur.R.inc(37992);assertPatternsEqual("toPattern " + buffer.toString(), mf.toPattern(),  emf.toPattern());
    }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    //can't trust what MessageFormat does with toPattern() pre 1.4:
    private void assertPatternsEqual(final String message, final String expected, final String actual) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(37993);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37994);if ((((SystemUtils.isJavaVersionAtLeast(JAVA_1_4))&&(__CLR4_1_2t74t74l3lqxuur.R.iget(37995)!=0|true))||(__CLR4_1_2t74t74l3lqxuur.R.iget(37996)==0&false))) {{
            __CLR4_1_2t74t74l3lqxuur.R.inc(37997);assertEquals(message, expected, actual);
        }
    }}finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    /**
     * Replace MessageFormat(String, Locale) constructor (not available until JDK 1.4).
     * @param pattern string
     * @param locale Locale
     * @return MessageFormat
     */
    private MessageFormat createMessageFormat(final String pattern, final Locale locale) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(37998);
        __CLR4_1_2t74t74l3lqxuur.R.inc(37999);final MessageFormat result = new MessageFormat(pattern);
        __CLR4_1_2t74t74l3lqxuur.R.inc(38000);if ((((locale != null)&&(__CLR4_1_2t74t74l3lqxuur.R.iget(38001)!=0|true))||(__CLR4_1_2t74t74l3lqxuur.R.iget(38002)==0&false))) {{
            __CLR4_1_2t74t74l3lqxuur.R.inc(38003);result.setLocale(locale);
            __CLR4_1_2t74t74l3lqxuur.R.inc(38004);result.applyPattern(pattern);
        }
        }__CLR4_1_2t74t74l3lqxuur.R.inc(38005);return result;
    }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}

    // ------------------------ Test Formats ------------------------

    /**
     * {@link Format} implementation which converts to lower case.
     */
    private static class LowerCaseFormat extends Format {
        @Override
        public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(38006);
            __CLR4_1_2t74t74l3lqxuur.R.inc(38007);return toAppendTo.append(((String)obj).toLowerCase());
        }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}
        @Override
        public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(38008);__CLR4_1_2t74t74l3lqxuur.R.inc(38009);throw new UnsupportedOperationException();}finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}
    }

    /**
     * {@link Format} implementation which converts to upper case.
     */
    private static class UpperCaseFormat extends Format {
        @Override
        public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(38010);
            __CLR4_1_2t74t74l3lqxuur.R.inc(38011);return toAppendTo.append(((String)obj).toUpperCase());
        }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}
        @Override
        public Object parseObject(final String source, final ParsePosition pos) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(38012);__CLR4_1_2t74t74l3lqxuur.R.inc(38013);throw new UnsupportedOperationException();}finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}
    }


    // ------------------------ Test Format Factories ---------------
    /**
     * {@link FormatFactory} implementation for lower case format.
     */
    private static class LowerCaseFormatFactory implements FormatFactory {
        private static final Format LOWER_INSTANCE = new LowerCaseFormat();
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(38014);
            __CLR4_1_2t74t74l3lqxuur.R.inc(38015);return LOWER_INSTANCE;
        }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}
    }
    /**
     * {@link FormatFactory} implementation for upper case format.
     */
    private static class UpperCaseFormatFactory implements FormatFactory {
        private static final Format UPPER_INSTANCE = new UpperCaseFormat();
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(38016);
            __CLR4_1_2t74t74l3lqxuur.R.inc(38017);return UPPER_INSTANCE;
        }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}
    }
    /**
     * {@link FormatFactory} implementation to override date format "short" to "default".
     */
    private static class OverrideShortDateFormatFactory implements FormatFactory {
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {try{__CLR4_1_2t74t74l3lqxuur.R.inc(38018);
            __CLR4_1_2t74t74l3lqxuur.R.inc(38019);return (((!"short".equals(arguments) )&&(__CLR4_1_2t74t74l3lqxuur.R.iget(38020)!=0|true))||(__CLR4_1_2t74t74l3lqxuur.R.iget(38021)==0&false))? null
                    : (((locale == null )&&(__CLR4_1_2t74t74l3lqxuur.R.iget(38022)!=0|true))||(__CLR4_1_2t74t74l3lqxuur.R.iget(38023)==0&false))? DateFormat
                            .getDateInstance(DateFormat.DEFAULT) : DateFormat
                            .getDateInstance(DateFormat.DEFAULT, locale);
        }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}
    }

    /**
     * Alternative ExtendedMessageFormat impl.
     */
    private static class OtherExtendedMessageFormat extends ExtendedMessageFormat {
        public OtherExtendedMessageFormat(final String pattern, final Locale locale,
                final Map<String, ? extends FormatFactory> registry) {
            super(pattern, locale, registry);__CLR4_1_2t74t74l3lqxuur.R.inc(38025);try{__CLR4_1_2t74t74l3lqxuur.R.inc(38024);
        }finally{__CLR4_1_2t74t74l3lqxuur.R.flushNeeded();}}
        
    }

}
