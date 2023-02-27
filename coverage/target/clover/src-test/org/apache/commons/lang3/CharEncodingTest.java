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

import static org.apache.commons.lang3.JavaVersion.JAVA_1_1;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_2;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_3;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests CharEncoding.
 * 
 * @see CharEncoding
 * @version $Id$
 */
public class CharEncodingTest  {static class __CLR4_1_2htmhtml3lqxtk2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,23142,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private void assertSupportedEncoding(final String name) {try{__CLR4_1_2htmhtml3lqxtk2.R.inc(23098);
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23099);assertTrue("Encoding should be supported: " + name, CharEncoding.isSupported(name));
    }finally{__CLR4_1_2htmhtml3lqxtk2.R.flushNeeded();}}

    /**
     * The class can be instantiated.
     */
    @Test
    public void testConstructor() {__CLR4_1_2htmhtml3lqxtk2.R.globalSliceStart(getClass().getName(),23100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hhto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2htmhtml3lqxtk2.R.rethrow($CLV_t2$);}finally{__CLR4_1_2htmhtml3lqxtk2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharEncodingTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23100,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hhto(){try{__CLR4_1_2htmhtml3lqxtk2.R.inc(23100);
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23101);new CharEncoding();
    }finally{__CLR4_1_2htmhtml3lqxtk2.R.flushNeeded();}}

    @Test
    public void testMustBeSupportedJava1_3_1() {__CLR4_1_2htmhtml3lqxtk2.R.globalSliceStart(getClass().getName(),23102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pdjqa4htq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2htmhtml3lqxtk2.R.rethrow($CLV_t2$);}finally{__CLR4_1_2htmhtml3lqxtk2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharEncodingTest.testMustBeSupportedJava1_3_1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23102,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pdjqa4htq(){try{__CLR4_1_2htmhtml3lqxtk2.R.inc(23102);
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23103);if ((((SystemUtils.isJavaVersionAtLeast(JAVA_1_3))&&(__CLR4_1_2htmhtml3lqxtk2.R.iget(23104)!=0|true))||(__CLR4_1_2htmhtml3lqxtk2.R.iget(23105)==0&false))) {{
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23106);this.assertSupportedEncoding(CharEncoding.ISO_8859_1);
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23107);this.assertSupportedEncoding(CharEncoding.US_ASCII);
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23108);this.assertSupportedEncoding(CharEncoding.UTF_16);
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23109);this.assertSupportedEncoding(CharEncoding.UTF_16BE);
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23110);this.assertSupportedEncoding(CharEncoding.UTF_16LE);
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23111);this.assertSupportedEncoding(CharEncoding.UTF_8);
        } }else {{
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23112);this.warn("Java 1.3 tests not run since the current version is " + SystemUtils.JAVA_SPECIFICATION_VERSION);
        }
    }}finally{__CLR4_1_2htmhtml3lqxtk2.R.flushNeeded();}}

    @Test
    public void testSupported() {__CLR4_1_2htmhtml3lqxtk2.R.globalSliceStart(getClass().getName(),23113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qwxfjxhu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2htmhtml3lqxtk2.R.rethrow($CLV_t2$);}finally{__CLR4_1_2htmhtml3lqxtk2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharEncodingTest.testSupported",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23113,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qwxfjxhu1(){try{__CLR4_1_2htmhtml3lqxtk2.R.inc(23113);
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23114);assertTrue(CharEncoding.isSupported("UTF8"));
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23115);assertTrue(CharEncoding.isSupported("UTF-8"));
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23116);assertTrue(CharEncoding.isSupported("ASCII"));
    }finally{__CLR4_1_2htmhtml3lqxtk2.R.flushNeeded();}}

    @Test
    public void testNotSupported() {__CLR4_1_2htmhtml3lqxtk2.R.globalSliceStart(getClass().getName(),23117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jubkp8hu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2htmhtml3lqxtk2.R.rethrow($CLV_t2$);}finally{__CLR4_1_2htmhtml3lqxtk2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharEncodingTest.testNotSupported",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23117,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jubkp8hu5(){try{__CLR4_1_2htmhtml3lqxtk2.R.inc(23117);
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23118);assertFalse(CharEncoding.isSupported(null));
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23119);assertFalse(CharEncoding.isSupported(""));
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23120);assertFalse(CharEncoding.isSupported(" "));
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23121);assertFalse(CharEncoding.isSupported("\t\r\n"));
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23122);assertFalse(CharEncoding.isSupported("DOESNOTEXIST"));
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23123);assertFalse(CharEncoding.isSupported("this is not a valid encoding name"));
    }finally{__CLR4_1_2htmhtml3lqxtk2.R.flushNeeded();}}

    @Test
    public void testWorksOnJava1_1_8() {__CLR4_1_2htmhtml3lqxtk2.R.globalSliceStart(getClass().getName(),23124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sttwoehuc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2htmhtml3lqxtk2.R.rethrow($CLV_t2$);}finally{__CLR4_1_2htmhtml3lqxtk2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharEncodingTest.testWorksOnJava1_1_8",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23124,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sttwoehuc(){try{__CLR4_1_2htmhtml3lqxtk2.R.inc(23124);
        //
        // In this test, I simply deleted the encodings from the 1.3.1 list.
        // The Javadoc do not specify which encodings are required.
        //
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23125);if ((((SystemUtils.isJavaVersionAtLeast(JAVA_1_1))&&(__CLR4_1_2htmhtml3lqxtk2.R.iget(23126)!=0|true))||(__CLR4_1_2htmhtml3lqxtk2.R.iget(23127)==0&false))) {{
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23128);this.assertSupportedEncoding(CharEncoding.ISO_8859_1);
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23129);this.assertSupportedEncoding(CharEncoding.US_ASCII);
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23130);this.assertSupportedEncoding(CharEncoding.UTF_8);
        } }else {{
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23131);this.warn("Java 1.1 tests not run since the current version is " + SystemUtils.JAVA_SPECIFICATION_VERSION);
        }
    }}finally{__CLR4_1_2htmhtml3lqxtk2.R.flushNeeded();}}

    @Test
    public void testWorksOnJava1_2_2() {__CLR4_1_2htmhtml3lqxtk2.R.globalSliceStart(getClass().getName(),23132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kkfnothuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2htmhtml3lqxtk2.R.rethrow($CLV_t2$);}finally{__CLR4_1_2htmhtml3lqxtk2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharEncodingTest.testWorksOnJava1_2_2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23132,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kkfnothuk(){try{__CLR4_1_2htmhtml3lqxtk2.R.inc(23132);
        //
        // In this test, I simply deleted the encodings from the 1.3.1 list.
        // The Javadoc do not specify which encodings are required.
        //
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23133);if ((((SystemUtils.isJavaVersionAtLeast(JAVA_1_2))&&(__CLR4_1_2htmhtml3lqxtk2.R.iget(23134)!=0|true))||(__CLR4_1_2htmhtml3lqxtk2.R.iget(23135)==0&false))) {{
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23136);this.assertSupportedEncoding(CharEncoding.ISO_8859_1);
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23137);this.assertSupportedEncoding(CharEncoding.US_ASCII);
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23138);this.assertSupportedEncoding(CharEncoding.UTF_8);
        } }else {{
            __CLR4_1_2htmhtml3lqxtk2.R.inc(23139);this.warn("Java 1.2 tests not run since the current version is " + SystemUtils.JAVA_SPECIFICATION_VERSION);
        }
    }}finally{__CLR4_1_2htmhtml3lqxtk2.R.flushNeeded();}}

    void warn(final String msg) {try{__CLR4_1_2htmhtml3lqxtk2.R.inc(23140);
        __CLR4_1_2htmhtml3lqxtk2.R.inc(23141);System.err.println(msg);
    }finally{__CLR4_1_2htmhtml3lqxtk2.R.flushNeeded();}}
}
