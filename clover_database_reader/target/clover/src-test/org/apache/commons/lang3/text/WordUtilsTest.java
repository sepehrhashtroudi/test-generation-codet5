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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests for WordUtils class.
 * 
 * @version $Id$
 */
public class WordUtilsTest {static class __CLR4_1_2vstvstl3lqxv1g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,41457,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hvst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41213,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hvst(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41213);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41214);assertNotNull(new WordUtils());
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41215);final Constructor<?>[] cons = WordUtils.class.getDeclaredConstructors();
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41216);assertEquals(1, cons.length);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41217);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41218);assertTrue(Modifier.isPublic(WordUtils.class.getModifiers()));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41219);assertFalse(Modifier.isFinal(WordUtils.class.getModifiers()));
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testWrap_StringInt() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_279p47yvt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testWrap_StringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41220,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_279p47yvt0(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41220);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41221);assertEquals(null, WordUtils.wrap(null, 20));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41222);assertEquals(null, WordUtils.wrap(null, -1));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41223);assertEquals("", WordUtils.wrap("", 20));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41224);assertEquals("", WordUtils.wrap("", -1));
        
        // normal
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41225);final String systemNewLine = System.getProperty("line.separator");
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41226);String input = "Here is one line of text that is going to be wrapped after 20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41227);String expected = "Here is one line of" + systemNewLine + "text that is going" 
            + systemNewLine + "to be wrapped after" + systemNewLine + "20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41228);assertEquals(expected, WordUtils.wrap(input, 20));
        
        // long word at end
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41229);input = "Click here to jump to the jakarta website - http://jakarta.apache.org";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41230);expected = "Click here to jump" + systemNewLine + "to the jakarta" + systemNewLine 
            + "website -" + systemNewLine + "http://jakarta.apache.org";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41231);assertEquals(expected, WordUtils.wrap(input, 20));
        
        // long word in middle
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41232);input = "Click here, http://jakarta.apache.org, to jump to the jakarta website";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41233);expected = "Click here," + systemNewLine + "http://jakarta.apache.org," + systemNewLine 
            + "to jump to the" + systemNewLine + "jakarta website";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41234);assertEquals(expected, WordUtils.wrap(input, 20));
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}
    
    @Test
    public void testWrap_StringIntStringBoolean() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nnpyxpvtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testWrap_StringIntStringBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41235,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nnpyxpvtf(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41235);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41236);assertEquals(null, WordUtils.wrap(null, 20, "\n", false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41237);assertEquals(null, WordUtils.wrap(null, 20, "\n", true));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41238);assertEquals(null, WordUtils.wrap(null, 20, null, true));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41239);assertEquals(null, WordUtils.wrap(null, 20, null, false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41240);assertEquals(null, WordUtils.wrap(null, -1, null, true));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41241);assertEquals(null, WordUtils.wrap(null, -1, null, false));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41242);assertEquals("", WordUtils.wrap("", 20, "\n", false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41243);assertEquals("", WordUtils.wrap("", 20, "\n", true));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41244);assertEquals("", WordUtils.wrap("", 20, null, false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41245);assertEquals("", WordUtils.wrap("", 20, null, true));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41246);assertEquals("", WordUtils.wrap("", -1, null, false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41247);assertEquals("", WordUtils.wrap("", -1, null, true));
        
        // normal
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41248);String input = "Here is one line of text that is going to be wrapped after 20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41249);String expected = "Here is one line of\ntext that is going\nto be wrapped after\n20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41250);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41251);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));

        // unusual newline char
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41252);input = "Here is one line of text that is going to be wrapped after 20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41253);expected = "Here is one line of<br />text that is going<br />to be wrapped after<br />20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41254);assertEquals(expected, WordUtils.wrap(input, 20, "<br />", false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41255);assertEquals(expected, WordUtils.wrap(input, 20, "<br />", true));

        // short line length
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41256);input = "Here is one line";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41257);expected = "Here\nis one\nline";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41258);assertEquals(expected, WordUtils.wrap(input, 6, "\n", false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41259);expected = "Here\nis\none\nline";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41260);assertEquals(expected, WordUtils.wrap(input, 2, "\n", false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41261);assertEquals(expected, WordUtils.wrap(input, -1, "\n", false));

        // system newline char
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41262);final String systemNewLine = System.getProperty("line.separator");
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41263);input = "Here is one line of text that is going to be wrapped after 20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41264);expected = "Here is one line of" + systemNewLine + "text that is going" + systemNewLine 
            + "to be wrapped after" + systemNewLine + "20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41265);assertEquals(expected, WordUtils.wrap(input, 20, null, false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41266);assertEquals(expected, WordUtils.wrap(input, 20, null, true));

        // with extra spaces
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41267);input = " Here:  is  one  line  of  text  that  is  going  to  be  wrapped  after  20  columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41268);expected = "Here:  is  one  line\nof  text  that  is \ngoing  to  be \nwrapped  after  20 \ncolumns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41269);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41270);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // with tab
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41271);input = "Here is\tone line of text that is going to be wrapped after 20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41272);expected = "Here is\tone line of\ntext that is going\nto be wrapped after\n20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41273);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41274);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // with tab at wrapColumn
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41275);input = "Here is one line of\ttext that is going to be wrapped after 20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41276);expected = "Here is one line\nof\ttext that is\ngoing to be wrapped\nafter 20 columns.";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41277);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41278);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // difference because of long word
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41279);input = "Click here to jump to the jakarta website - http://jakarta.apache.org";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41280);expected = "Click here to jump\nto the jakarta\nwebsite -\nhttp://jakarta.apache.org";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41281);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41282);expected = "Click here to jump\nto the jakarta\nwebsite -\nhttp://jakarta.apach\ne.org";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41283);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
        
        // difference because of long word in middle
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41284);input = "Click here, http://jakarta.apache.org, to jump to the jakarta website";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41285);expected = "Click here,\nhttp://jakarta.apache.org,\nto jump to the\njakarta website";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41286);assertEquals(expected, WordUtils.wrap(input, 20, "\n", false));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41287);expected = "Click here,\nhttp://jakarta.apach\ne.org, to jump to\nthe jakarta website";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41288);assertEquals(expected, WordUtils.wrap(input, 20, "\n", true));
//        System.err.println(expected);
//        System.err.println(WordUtils.wrap(input, 20, "\n", false));
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testCapitalize_String() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23ujwc9vux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testCapitalize_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41289,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23ujwc9vux(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41289);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41290);assertEquals(null, WordUtils.capitalize(null));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41291);assertEquals("", WordUtils.capitalize(""));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41292);assertEquals("  ", WordUtils.capitalize("  "));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41293);assertEquals("I", WordUtils.capitalize("I") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41294);assertEquals("I", WordUtils.capitalize("i") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41295);assertEquals("I Am Here 123", WordUtils.capitalize("i am here 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41296);assertEquals("I Am Here 123", WordUtils.capitalize("I Am Here 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41297);assertEquals("I Am HERE 123", WordUtils.capitalize("i am HERE 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41298);assertEquals("I AM HERE 123", WordUtils.capitalize("I AM HERE 123") );
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}
    
    @Test
    public void testCapitalizeWithDelimiters_String() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xhhctjvv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testCapitalizeWithDelimiters_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41299,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xhhctjvv7(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41299);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41300);assertEquals(null, WordUtils.capitalize(null, null));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41301);assertEquals("", WordUtils.capitalize("", new char[0]));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41302);assertEquals("  ", WordUtils.capitalize("  ", new char[0]));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41303);char[] chars = new char[] { '-', '+', ' ', '@' };
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41304);assertEquals("I", WordUtils.capitalize("I", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41305);assertEquals("I", WordUtils.capitalize("i", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41306);assertEquals("I-Am Here+123", WordUtils.capitalize("i-am here+123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41307);assertEquals("I Am+Here-123", WordUtils.capitalize("I Am+Here-123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41308);assertEquals("I+Am-HERE 123", WordUtils.capitalize("i+am-HERE 123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41309);assertEquals("I-AM HERE+123", WordUtils.capitalize("I-AM HERE+123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41310);chars = new char[] {'.'};
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41311);assertEquals("I aM.Fine", WordUtils.capitalize("i aM.fine", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41312);assertEquals("I Am.fine", WordUtils.capitalize("i am.fine", null) );
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}

    @Test
    public void testCapitalizeFully_String() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xwas0bvvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testCapitalizeFully_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41313,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xwas0bvvl(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41313);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41314);assertEquals(null, WordUtils.capitalizeFully(null));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41315);assertEquals("", WordUtils.capitalizeFully(""));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41316);assertEquals("  ", WordUtils.capitalizeFully("  "));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41317);assertEquals("I", WordUtils.capitalizeFully("I") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41318);assertEquals("I", WordUtils.capitalizeFully("i") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41319);assertEquals("I Am Here 123", WordUtils.capitalizeFully("i am here 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41320);assertEquals("I Am Here 123", WordUtils.capitalizeFully("I Am Here 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41321);assertEquals("I Am Here 123", WordUtils.capitalizeFully("i am HERE 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41322);assertEquals("I Am Here 123", WordUtils.capitalizeFully("I AM HERE 123") );
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}
    
    @Test
    public void testCapitalizeFullyWithDelimiters_String() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29qnlonvvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testCapitalizeFullyWithDelimiters_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41323,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29qnlonvvv(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41323);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41324);assertEquals(null, WordUtils.capitalizeFully(null, null));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41325);assertEquals("", WordUtils.capitalizeFully("", new char[0]));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41326);assertEquals("  ", WordUtils.capitalizeFully("  ", new char[0]));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41327);char[] chars = new char[] { '-', '+', ' ', '@' };
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41328);assertEquals("I", WordUtils.capitalizeFully("I", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41329);assertEquals("I", WordUtils.capitalizeFully("i", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41330);assertEquals("I-Am Here+123", WordUtils.capitalizeFully("i-am here+123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41331);assertEquals("I Am+Here-123", WordUtils.capitalizeFully("I Am+Here-123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41332);assertEquals("I+Am-Here 123", WordUtils.capitalizeFully("i+am-HERE 123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41333);assertEquals("I-Am Here+123", WordUtils.capitalizeFully("I-AM HERE+123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41334);chars = new char[] {'.'};
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41335);assertEquals("I am.Fine", WordUtils.capitalizeFully("i aM.fine", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41336);assertEquals("I Am.fine", WordUtils.capitalizeFully("i am.fine", null) );
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}

    @Test
    public void testUncapitalize_String() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nvvdsvw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testUncapitalize_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41337,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nvvdsvw9(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41337);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41338);assertEquals(null, WordUtils.uncapitalize(null));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41339);assertEquals("", WordUtils.uncapitalize(""));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41340);assertEquals("  ", WordUtils.uncapitalize("  "));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41341);assertEquals("i", WordUtils.uncapitalize("I") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41342);assertEquals("i", WordUtils.uncapitalize("i") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41343);assertEquals("i am here 123", WordUtils.uncapitalize("i am here 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41344);assertEquals("i am here 123", WordUtils.uncapitalize("I Am Here 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41345);assertEquals("i am hERE 123", WordUtils.uncapitalize("i am HERE 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41346);assertEquals("i aM hERE 123", WordUtils.uncapitalize("I AM HERE 123") );
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}
    
    @Test
    public void testUncapitalizeWithDelimiters_String() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21yegwevwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testUncapitalizeWithDelimiters_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41347,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21yegwevwj(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41347);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41348);assertEquals(null, WordUtils.uncapitalize(null, null));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41349);assertEquals("", WordUtils.uncapitalize("", new char[0]));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41350);assertEquals("  ", WordUtils.uncapitalize("  ", new char[0]));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41351);char[] chars = new char[] { '-', '+', ' ', '@' };
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41352);assertEquals("i", WordUtils.uncapitalize("I", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41353);assertEquals("i", WordUtils.uncapitalize("i", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41354);assertEquals("i am-here+123", WordUtils.uncapitalize("i am-here+123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41355);assertEquals("i+am here-123", WordUtils.uncapitalize("I+Am Here-123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41356);assertEquals("i-am+hERE 123", WordUtils.uncapitalize("i-am+HERE 123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41357);assertEquals("i aM-hERE+123", WordUtils.uncapitalize("I AM-HERE+123", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41358);chars = new char[] {'.'};
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41359);assertEquals("i AM.fINE", WordUtils.uncapitalize("I AM.FINE", chars) );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41360);assertEquals("i aM.FINE", WordUtils.uncapitalize("I AM.FINE", null) );
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testInitials_String() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d9i4aevwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testInitials_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41361,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d9i4aevwx(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41361);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41362);assertEquals(null, WordUtils.initials(null));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41363);assertEquals("", WordUtils.initials(""));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41364);assertEquals("", WordUtils.initials("  "));

        __CLR4_1_2vstvstl3lqxv1g.R.inc(41365);assertEquals("I", WordUtils.initials("I"));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41366);assertEquals("i", WordUtils.initials("i"));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41367);assertEquals("BJL", WordUtils.initials("Ben John Lee"));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41368);assertEquals("BJ", WordUtils.initials("Ben J.Lee"));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41369);assertEquals("BJ.L", WordUtils.initials(" Ben   John  . Lee"));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41370);assertEquals("iah1", WordUtils.initials("i am here 123"));
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testInitials_String_charArray() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rgo4yivx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testInitials_String_charArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41371,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rgo4yivx7(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41371);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41372);char[] array = null;
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41373);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41374);assertEquals("", WordUtils.initials("", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41375);assertEquals("", WordUtils.initials("  ", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41376);assertEquals("I", WordUtils.initials("I", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41377);assertEquals("i", WordUtils.initials("i", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41378);assertEquals("S", WordUtils.initials("SJC", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41379);assertEquals("BJL", WordUtils.initials("Ben John Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41380);assertEquals("BJ", WordUtils.initials("Ben J.Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41381);assertEquals("BJ.L", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41382);assertEquals("KO", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41383);assertEquals("iah1", WordUtils.initials("i am here 123", array));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41384);array = new char[0];
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41385);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41386);assertEquals("", WordUtils.initials("", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41387);assertEquals("", WordUtils.initials("  ", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41388);assertEquals("", WordUtils.initials("I", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41389);assertEquals("", WordUtils.initials("i", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41390);assertEquals("", WordUtils.initials("SJC", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41391);assertEquals("", WordUtils.initials("Ben John Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41392);assertEquals("", WordUtils.initials("Ben J.Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41393);assertEquals("", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41394);assertEquals("", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41395);assertEquals("", WordUtils.initials("i am here 123", array));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41396);array = " ".toCharArray();
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41397);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41398);assertEquals("", WordUtils.initials("", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41399);assertEquals("", WordUtils.initials("  ", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41400);assertEquals("I", WordUtils.initials("I", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41401);assertEquals("i", WordUtils.initials("i", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41402);assertEquals("S", WordUtils.initials("SJC", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41403);assertEquals("BJL", WordUtils.initials("Ben John Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41404);assertEquals("BJ", WordUtils.initials("Ben J.Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41405);assertEquals("BJ.L", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41406);assertEquals("KO", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41407);assertEquals("iah1", WordUtils.initials("i am here 123", array));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41408);array = " .".toCharArray();
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41409);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41410);assertEquals("", WordUtils.initials("", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41411);assertEquals("", WordUtils.initials("  ", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41412);assertEquals("I", WordUtils.initials("I", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41413);assertEquals("i", WordUtils.initials("i", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41414);assertEquals("S", WordUtils.initials("SJC", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41415);assertEquals("BJL", WordUtils.initials("Ben John Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41416);assertEquals("BJL", WordUtils.initials("Ben J.Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41417);assertEquals("BJL", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41418);assertEquals("KO", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41419);assertEquals("iah1", WordUtils.initials("i am here 123", array));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41420);array = " .'".toCharArray();
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41421);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41422);assertEquals("", WordUtils.initials("", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41423);assertEquals("", WordUtils.initials("  ", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41424);assertEquals("I", WordUtils.initials("I", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41425);assertEquals("i", WordUtils.initials("i", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41426);assertEquals("S", WordUtils.initials("SJC", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41427);assertEquals("BJL", WordUtils.initials("Ben John Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41428);assertEquals("BJL", WordUtils.initials("Ben J.Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41429);assertEquals("BJL", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41430);assertEquals("KOM", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41431);assertEquals("iah1", WordUtils.initials("i am here 123", array));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41432);array = "SIJo1".toCharArray();
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41433);assertEquals(null, WordUtils.initials(null, array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41434);assertEquals("", WordUtils.initials("", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41435);assertEquals(" ", WordUtils.initials("  ", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41436);assertEquals("", WordUtils.initials("I", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41437);assertEquals("i", WordUtils.initials("i", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41438);assertEquals("C", WordUtils.initials("SJC", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41439);assertEquals("Bh", WordUtils.initials("Ben John Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41440);assertEquals("B.", WordUtils.initials("Ben J.Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41441);assertEquals(" h", WordUtils.initials(" Ben   John  . Lee", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41442);assertEquals("K", WordUtils.initials("Kay O'Murphy", array));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41443);assertEquals("i2", WordUtils.initials("i am here 123", array));
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSwapCase_String() {__CLR4_1_2vstvstl3lqxv1g.R.globalSliceStart(getClass().getName(),41444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vnsj26vz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vstvstl3lqxv1g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vstvstl3lqxv1g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.WordUtilsTest.testSwapCase_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41444,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vnsj26vz8(){try{__CLR4_1_2vstvstl3lqxv1g.R.inc(41444);
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41445);assertEquals(null, WordUtils.swapCase(null));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41446);assertEquals("", WordUtils.swapCase(""));
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41447);assertEquals("  ", WordUtils.swapCase("  "));
        
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41448);assertEquals("i", WordUtils.swapCase("I") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41449);assertEquals("I", WordUtils.swapCase("i") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41450);assertEquals("I AM HERE 123", WordUtils.swapCase("i am here 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41451);assertEquals("i aM hERE 123", WordUtils.swapCase("I Am Here 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41452);assertEquals("I AM here 123", WordUtils.swapCase("i am HERE 123") );
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41453);assertEquals("i am here 123", WordUtils.swapCase("I AM HERE 123") );

        __CLR4_1_2vstvstl3lqxv1g.R.inc(41454);final String test = "This String contains a TitleCase character: \u01c8";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41455);final String expect = "tHIS sTRING CONTAINS A tITLEcASE CHARACTER: \u01c9";
        __CLR4_1_2vstvstl3lqxv1g.R.inc(41456);assertEquals(expect, WordUtils.swapCase(test));
    }finally{__CLR4_1_2vstvstl3lqxv1g.R.flushNeeded();}}

}
