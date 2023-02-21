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
import static org.junit.Assert.*;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrBuilder}.
 * 
 * @version $Id$
 */
public class StrBuilderTest {static class __CLR4_1_2u30u30l3lqxuyp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,40218,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),38988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lwxaheu30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testConstructors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38988,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lwxaheu30(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(38988);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(38989);final StrBuilder sb0 = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(38990);assertEquals(32, sb0.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(38991);assertEquals(0, sb0.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(38992);assertEquals(0, sb0.size());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(38993);final StrBuilder sb1 = new StrBuilder(32);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(38994);assertEquals(32, sb1.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(38995);assertEquals(0, sb1.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(38996);assertEquals(0, sb1.size());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(38997);final StrBuilder sb2 = new StrBuilder(0);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(38998);assertEquals(32, sb2.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(38999);assertEquals(0, sb2.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39000);assertEquals(0, sb2.size());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39001);final StrBuilder sb3 = new StrBuilder(-1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39002);assertEquals(32, sb3.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39003);assertEquals(0, sb3.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39004);assertEquals(0, sb3.size());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39005);final StrBuilder sb4 = new StrBuilder(1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39006);assertEquals(1, sb4.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39007);assertEquals(0, sb4.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39008);assertEquals(0, sb4.size());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39009);final StrBuilder sb5 = new StrBuilder((String) null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39010);assertEquals(32, sb5.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39011);assertEquals(0, sb5.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39012);assertEquals(0, sb5.size());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39013);final StrBuilder sb6 = new StrBuilder("");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39014);assertEquals(32, sb6.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39015);assertEquals(0, sb6.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39016);assertEquals(0, sb6.size());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39017);final StrBuilder sb7 = new StrBuilder("foo");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39018);assertEquals(35, sb7.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39019);assertEquals(3, sb7.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39020);assertEquals(3, sb7.size());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testChaining() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ks9sm2u3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testChaining",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39021,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ks9sm2u3x(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39021);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39022);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39023);assertSame(sb, sb.setNewLineText(null));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39024);assertSame(sb, sb.setNullText(null));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39025);assertSame(sb, sb.setLength(1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39026);assertSame(sb, sb.setCharAt(0, 'a'));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39027);assertSame(sb, sb.ensureCapacity(0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39028);assertSame(sb, sb.minimizeCapacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39029);assertSame(sb, sb.clear());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39030);assertSame(sb, sb.reverse());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39031);assertSame(sb, sb.trim());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetSetNewLineText() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mr60k6u48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testGetSetNewLineText",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39032,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mr60k6u48(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39032);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39033);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39034);assertEquals(null, sb.getNewLineText());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39035);sb.setNewLineText("#");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39036);assertEquals("#", sb.getNewLineText());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39037);sb.setNewLineText("");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39038);assertEquals("", sb.getNewLineText());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39039);sb.setNewLineText((String) null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39040);assertEquals(null, sb.getNewLineText());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetSetNullText() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sltnafu4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testGetSetNullText",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39041,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sltnafu4h(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39041);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39042);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39043);assertEquals(null, sb.getNullText());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39044);sb.setNullText("null");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39045);assertEquals("null", sb.getNullText());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39046);sb.setNullText("");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39047);assertEquals(null, sb.getNullText());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39048);sb.setNullText("NULL");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39049);assertEquals("NULL", sb.getNullText());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39050);sb.setNullText((String) null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39051);assertEquals(null, sb.getNullText());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCapacityAndLength() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qzht4ou4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testCapacityAndLength",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39052,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qzht4ou4s(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39052);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39053);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39054);assertEquals(32, sb.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39055);assertEquals(0, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39056);assertEquals(0, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39057);assertTrue(sb.isEmpty());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39058);sb.minimizeCapacity();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39059);assertEquals(0, sb.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39060);assertEquals(0, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39061);assertEquals(0, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39062);assertTrue(sb.isEmpty());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39063);sb.ensureCapacity(32);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39064);assertTrue(sb.capacity() >= 32);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39065);assertEquals(0, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39066);assertEquals(0, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39067);assertTrue(sb.isEmpty());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39068);sb.append("foo");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39069);assertTrue(sb.capacity() >= 32);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39070);assertEquals(3, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39071);assertEquals(3, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39072);assertTrue(sb.isEmpty() == false);

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39073);sb.clear();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39074);assertTrue(sb.capacity() >= 32);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39075);assertEquals(0, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39076);assertEquals(0, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39077);assertTrue(sb.isEmpty());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39078);sb.append("123456789012345678901234567890123");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39079);assertTrue(sb.capacity() > 32);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39080);assertEquals(33, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39081);assertEquals(33, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39082);assertTrue(sb.isEmpty() == false);

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39083);sb.ensureCapacity(16);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39084);assertTrue(sb.capacity() > 16);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39085);assertEquals(33, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39086);assertEquals(33, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39087);assertTrue(sb.isEmpty() == false);

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39088);sb.minimizeCapacity();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39089);assertEquals(33, sb.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39090);assertEquals(33, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39091);assertEquals(33, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39092);assertTrue(sb.isEmpty() == false);

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39093);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39094);sb.setLength(-1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39095);fail("setLength(-1) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39096);sb.setLength(33);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39097);assertEquals(33, sb.capacity());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39098);assertEquals(33, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39099);assertEquals(33, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39100);assertTrue(sb.isEmpty() == false);

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39101);sb.setLength(16);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39102);assertTrue(sb.capacity() >= 16);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39103);assertEquals(16, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39104);assertEquals(16, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39105);assertEquals("1234567890123456", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39106);assertTrue(sb.isEmpty() == false);

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39107);sb.setLength(32);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39108);assertTrue(sb.capacity() >= 32);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39109);assertEquals(32, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39110);assertEquals(32, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39111);assertEquals("1234567890123456\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39112);assertTrue(sb.isEmpty() == false);

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39113);sb.setLength(0);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39114);assertTrue(sb.capacity() >= 32);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39115);assertEquals(0, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39116);assertEquals(0, sb.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39117);assertTrue(sb.isEmpty());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testLength() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25p23dtu6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLength",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39118,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25p23dtu6m(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39118);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39119);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39120);assertEquals(0, sb.length());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39121);sb.append("Hello");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39122);assertEquals(5, sb.length());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testSetLength() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cb8uf1u6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSetLength",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39123,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cb8uf1u6r(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39123);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39124);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39125);sb.append("Hello");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39126);sb.setLength(2);  // shorten
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39127);assertEquals("He", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39128);sb.setLength(2);  // no change
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39129);assertEquals("He", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39130);sb.setLength(3);  // lengthen
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39131);assertEquals("He\0", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39132);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39133);sb.setLength(-1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39134);fail("setLength(-1) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCapacity() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bmpwp9u73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testCapacity",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39135,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bmpwp9u73(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39135);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39136);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39137);assertEquals(sb.buffer.length, sb.capacity());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39138);sb.append("HelloWorldHelloWorldHelloWorldHelloWorld");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39139);assertEquals(sb.buffer.length, sb.capacity());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testEnsureCapacity() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oebgz3u78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testEnsureCapacity",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39140,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oebgz3u78(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39140);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39141);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39142);sb.ensureCapacity(2);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39143);assertTrue(sb.capacity() >= 2);
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39144);sb.ensureCapacity(-1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39145);assertTrue(sb.capacity() >= 0);
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39146);sb.append("HelloWorld");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39147);sb.ensureCapacity(40);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39148);assertTrue(sb.capacity() >= 40);
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testMinimizeCapacity() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22kk4b3u7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testMinimizeCapacity",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39149,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22kk4b3u7h(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39149);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39150);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39151);sb.minimizeCapacity();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39152);assertEquals(0, sb.capacity());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39153);sb.append("HelloWorld");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39154);sb.minimizeCapacity();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39155);assertEquals(10, sb.capacity());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSize() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27xx122u7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSize",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39156,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27xx122u7o(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39156);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39157);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39158);assertEquals(0, sb.size());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39159);sb.append("Hello");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39160);assertEquals(5, sb.size());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testIsEmpty() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2custqgu7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIsEmpty",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39161,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2custqgu7t(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39161);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39162);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39163);assertTrue(sb.isEmpty());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39164);sb.append("Hello");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39165);assertFalse(sb.isEmpty());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39166);sb.clear();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39167);assertTrue(sb.isEmpty());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testClear() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jlyl6qu80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testClear",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39168,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jlyl6qu80(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39168);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39169);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39170);sb.append("Hello");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39171);sb.clear();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39172);assertEquals(0, sb.length());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39173);assertTrue(sb.buffer.length >= 5);
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCharAt() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2u60p4yu86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testCharAt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39174,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2u60p4yu86(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39174);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39175);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39176);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39177);sb.charAt(0);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39178);fail("charAt(0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39179);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39180);sb.charAt(-1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39181);fail("charAt(-1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39182);sb.append("foo");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39183);assertEquals('f', sb.charAt(0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39184);assertEquals('o', sb.charAt(1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39185);assertEquals('o', sb.charAt(2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39186);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39187);sb.charAt(-1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39188);fail("charAt(-1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39189);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39190);sb.charAt(3);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39191);fail("charAt(3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetCharAt() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2musf1cu8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSetCharAt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39192,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2musf1cu8o(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39192);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39193);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39194);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39195);sb.setCharAt(0, 'f');
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39196);fail("setCharAt(0,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39197);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39198);sb.setCharAt(-1, 'f');
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39199);fail("setCharAt(-1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39200);sb.append("foo");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39201);sb.setCharAt(0, 'b');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39202);sb.setCharAt(1, 'a');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39203);sb.setCharAt(2, 'r');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39204);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39205);sb.setCharAt(3, '!');
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39206);fail("setCharAt(3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39207);assertEquals("bar", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDeleteCharAt() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tfjylpu94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteCharAt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39208,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tfjylpu94(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39208);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39209);final StrBuilder sb = new StrBuilder("abc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39210);sb.deleteCharAt(0);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39211);assertEquals("bc", sb.toString()); 
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39212);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39213);sb.deleteCharAt(1000);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39214);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToCharArray() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b7st8ju9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testToCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39215,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b7st8ju9b(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39215);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39216);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39217);assertEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39218);char[] a = sb.toCharArray();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39219);assertNotNull("toCharArray() result is null", a);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39220);assertEquals("toCharArray() result is too large", 0, a.length);

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39221);sb.append("junit");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39222);a = sb.toCharArray();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39223);assertEquals("toCharArray() result incorrect length", 5, a.length);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39224);assertTrue("toCharArray() result does not match", Arrays.equals("junit".toCharArray(), a));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testToCharArrayIntInt() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27g5zj1u9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testToCharArrayIntInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39225,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27g5zj1u9l(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39225);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39226);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39227);assertEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray(0, 0));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39228);sb.append("junit");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39229);char[] a = sb.toCharArray(0, 20); // too large test
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39230);assertEquals("toCharArray(int,int) result incorrect length", 5, a.length);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39231);assertTrue("toCharArray(int,int) result does not match", Arrays.equals("junit".toCharArray(), a));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39232);a = sb.toCharArray(0, 4);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39233);assertEquals("toCharArray(int,int) result incorrect length", 4, a.length);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39234);assertTrue("toCharArray(int,int) result does not match", Arrays.equals("juni".toCharArray(), a));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39235);a = sb.toCharArray(0, 4);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39236);assertEquals("toCharArray(int,int) result incorrect length", 4, a.length);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39237);assertTrue("toCharArray(int,int) result does not match", Arrays.equals("juni".toCharArray(), a));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39238);a = sb.toCharArray(0, 1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39239);assertNotNull("toCharArray(int,int) result is null", a);

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39240);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39241);sb.toCharArray(-1, 5);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39242);fail("no string index out of bound on -1");
        } catch (final IndexOutOfBoundsException e) {
        }

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39243);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39244);sb.toCharArray(6, 5);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39245);fail("no string index out of bound on -1");
        } catch (final IndexOutOfBoundsException e) {
        }
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testGetChars ( ) {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tcpedcua6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testGetChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39246,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tcpedcua6( ){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39246);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39247);final StrBuilder sb = new StrBuilder();
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39248);char[] input = new char[10];
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39249);char[] a = sb.getChars(input);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39250);assertSame (input, a);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39251);assertTrue(Arrays.equals(new char[10], a));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39252);sb.append("junit");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39253);a = sb.getChars(input);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39254);assertSame(input, a);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39255);assertTrue(Arrays.equals(new char[] {'j','u','n','i','t',0,0,0,0,0},a));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39256);a = sb.getChars(null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39257);assertNotSame(input,a);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39258);assertEquals(5,a.length);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39259);assertTrue(Arrays.equals("junit".toCharArray(),a));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39260);input = new char[5];
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39261);a = sb.getChars(input);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39262);assertSame(input, a);
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39263);input = new char[4];
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39264);a = sb.getChars(input);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39265);assertNotSame(input, a);
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testGetCharsIntIntCharArrayInt( ) {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a05k1guaq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testGetCharsIntIntCharArrayInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39266,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a05k1guaq( ){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39266);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39267);final StrBuilder sb = new StrBuilder();
               
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39268);sb.append("junit");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39269);char[] a = new char[5];
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39270);sb.getChars(0,5,a,0);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39271);assertTrue(Arrays.equals(new char[] {'j','u','n','i','t'},a));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39272);a = new char[5];
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39273);sb.getChars(0,2,a,3);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39274);assertTrue(Arrays.equals(new char[] {0,0,0,'j','u'},a));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39275);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39276);sb.getChars(-1,0,a,0);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39277);fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39278);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39279);sb.getChars(0,-1,a,0);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39280);fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39281);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39282);sb.getChars(0,20,a,0);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39283);fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39284);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39285);sb.getChars(4,2,a,0);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39286);fail("no exception");
        }
        catch (final IndexOutOfBoundsException e) {
        }
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDeleteIntInt() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qfiyjoubb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteIntInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39287,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qfiyjoubb(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39287);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39288);StrBuilder sb = new StrBuilder("abc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39289);sb.delete(0, 1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39290);assertEquals("bc", sb.toString()); 
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39291);sb.delete(1, 2);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39292);assertEquals("b", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39293);sb.delete(0, 1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39294);assertEquals("", sb.toString()); 
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39295);sb.delete(0, 1000);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39296);assertEquals("", sb.toString()); 
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39297);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39298);sb.delete(1, 2);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39299);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39300);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39301);sb.delete(-1, 1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39302);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39303);sb = new StrBuilder("anything");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39304);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39305);sb.delete(2, 1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39306);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDeleteAll_char() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2h916soubv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteAll_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39307,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2h916soubv(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39307);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39308);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39309);sb.deleteAll('X');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39310);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39311);sb.deleteAll('a');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39312);assertEquals("bcbccb", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39313);sb.deleteAll('c');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39314);assertEquals("bbb", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39315);sb.deleteAll('b');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39316);assertEquals("", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39317);sb = new StrBuilder("");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39318);sb.deleteAll('b');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39319);assertEquals("", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testDeleteFirst_char() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o3k5h3uc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteFirst_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39320,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o3k5h3uc8(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39320);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39321);StrBuilder sb = new StrBuilder("abcba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39322);sb.deleteFirst('X');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39323);assertEquals("abcba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39324);sb.deleteFirst('a');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39325);assertEquals("bcba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39326);sb.deleteFirst('c');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39327);assertEquals("bba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39328);sb.deleteFirst('b');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39329);assertEquals("ba", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39330);sb = new StrBuilder("");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39331);sb.deleteFirst('b');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39332);assertEquals("", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testDeleteAll_String() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_291lrzhucl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteAll_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39333,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_291lrzhucl(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39333);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39334);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39335);sb.deleteAll((String) null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39336);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39337);sb.deleteAll("");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39338);assertEquals("abcbccba", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39339);sb.deleteAll("X");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39340);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39341);sb.deleteAll("a");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39342);assertEquals("bcbccb", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39343);sb.deleteAll("c");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39344);assertEquals("bbb", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39345);sb.deleteAll("b");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39346);assertEquals("", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39347);sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39348);sb.deleteAll("bc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39349);assertEquals("acba", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39350);sb = new StrBuilder("");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39351);sb.deleteAll("bc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39352);assertEquals("", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testDeleteFirst_String() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fxnlxgud5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteFirst_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39353,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fxnlxgud5(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39353);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39354);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39355);sb.deleteFirst((String) null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39356);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39357);sb.deleteFirst("");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39358);assertEquals("abcbccba", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39359);sb.deleteFirst("X");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39360);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39361);sb.deleteFirst("a");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39362);assertEquals("bcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39363);sb.deleteFirst("c");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39364);assertEquals("bbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39365);sb.deleteFirst("b");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39366);assertEquals("bccba", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39367);sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39368);sb.deleteFirst("bc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39369);assertEquals("abccba", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39370);sb = new StrBuilder("");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39371);sb.deleteFirst("bc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39372);assertEquals("", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testDeleteAll_StrMatcher() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a0g2bhudp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteAll_StrMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39373,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a0g2bhudp(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39373);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39374);StrBuilder sb = new StrBuilder("A0xA1A2yA3");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39375);sb.deleteAll((StrMatcher) null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39376);assertEquals("A0xA1A2yA3", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39377);sb.deleteAll(A_NUMBER_MATCHER);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39378);assertEquals("xy", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39379);sb = new StrBuilder("Ax1");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39380);sb.deleteAll(A_NUMBER_MATCHER);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39381);assertEquals("Ax1", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39382);sb = new StrBuilder("");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39383);sb.deleteAll(A_NUMBER_MATCHER);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39384);assertEquals("", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testDeleteFirst_StrMatcher() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ca1h1oue1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testDeleteFirst_StrMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39385,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ca1h1oue1(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39385);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39386);StrBuilder sb = new StrBuilder("A0xA1A2yA3");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39387);sb.deleteFirst((StrMatcher) null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39388);assertEquals("A0xA1A2yA3", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39389);sb.deleteFirst(A_NUMBER_MATCHER);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39390);assertEquals("xA1A2yA3", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39391);sb = new StrBuilder("Ax1");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39392);sb.deleteFirst(A_NUMBER_MATCHER);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39393);assertEquals("Ax1", sb.toString());

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39394);sb = new StrBuilder("");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39395);sb.deleteFirst(A_NUMBER_MATCHER);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39396);assertEquals("", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testReplace_int_int_String() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sxj71xued();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_int_int_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39397,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sxj71xued(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39397);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39398);StrBuilder sb = new StrBuilder("abc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39399);sb.replace(0, 1, "d");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39400);assertEquals("dbc", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39401);sb.replace(0, 1, "aaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39402);assertEquals("aaabc", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39403);sb.replace(0, 3, "");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39404);assertEquals("bc", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39405);sb.replace(1, 2, (String) null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39406);assertEquals("b", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39407);sb.replace(1, 1000, "text");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39408);assertEquals("btext", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39409);sb.replace(0, 1000, "text");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39410);assertEquals("text", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39411);sb = new StrBuilder("atext");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39412);sb.replace(1, 1, "ny");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39413);assertEquals("anytext", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39414);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39415);sb.replace(2, 1, "anything");
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39416);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39417);sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39418);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39419);sb.replace(1, 2, "anything");
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39420);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39421);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39422);sb.replace(-1, 1, "anything");
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39423);fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReplaceAll_char_char() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o1ml6iuf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceAll_char_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39424,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o1ml6iuf4(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39424);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39425);final StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39426);sb.replaceAll('x', 'y');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39427);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39428);sb.replaceAll('a', 'd');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39429);assertEquals("dbcbccbd", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39430);sb.replaceAll('b', 'e');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39431);assertEquals("dececced", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39432);sb.replaceAll('c', 'f');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39433);assertEquals("defeffed", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39434);sb.replaceAll('d', 'd');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39435);assertEquals("defeffed", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReplaceFirst_char_char() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cq173pufg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceFirst_char_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39436,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cq173pufg(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39436);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39437);final StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39438);sb.replaceFirst('x', 'y');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39439);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39440);sb.replaceFirst('a', 'd');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39441);assertEquals("dbcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39442);sb.replaceFirst('b', 'e');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39443);assertEquals("decbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39444);sb.replaceFirst('c', 'f');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39445);assertEquals("defbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39446);sb.replaceFirst('d', 'd');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39447);assertEquals("defbccba", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReplaceAll_String_String() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hukdiufs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceAll_String_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39448,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hukdiufs(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39448);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39449);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39450);sb.replaceAll((String) null, null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39451);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39452);sb.replaceAll((String) null, "anything");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39453);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39454);sb.replaceAll("", null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39455);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39456);sb.replaceAll("", "anything");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39457);assertEquals("abcbccba", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39458);sb.replaceAll("x", "y");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39459);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39460);sb.replaceAll("a", "d");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39461);assertEquals("dbcbccbd", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39462);sb.replaceAll("d", null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39463);assertEquals("bcbccb", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39464);sb.replaceAll("cb", "-");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39465);assertEquals("b-c-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39466);sb = new StrBuilder("abcba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39467);sb.replaceAll("b", "xbx");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39468);assertEquals("axbxcxbxa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39469);sb = new StrBuilder("bb");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39470);sb.replaceAll("b", "xbx");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39471);assertEquals("xbxxbx", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testReplaceFirst_String_String() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lv9pudugg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceFirst_String_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39472,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lv9pudugg(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39472);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39473);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39474);sb.replaceFirst((String) null, null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39475);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39476);sb.replaceFirst((String) null, "anything");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39477);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39478);sb.replaceFirst("", null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39479);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39480);sb.replaceFirst("", "anything");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39481);assertEquals("abcbccba", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39482);sb.replaceFirst("x", "y");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39483);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39484);sb.replaceFirst("a", "d");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39485);assertEquals("dbcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39486);sb.replaceFirst("d", null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39487);assertEquals("bcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39488);sb.replaceFirst("cb", "-");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39489);assertEquals("b-ccba", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39490);sb = new StrBuilder("abcba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39491);sb.replaceFirst("b", "xbx");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39492);assertEquals("axbxcba", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39493);sb = new StrBuilder("bb");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39494);sb.replaceFirst("b", "xbx");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39495);assertEquals("xbxb", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReplaceAll_StrMatcher_String() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uxcsuiuh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceAll_StrMatcher_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39496,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uxcsuiuh4(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39496);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39497);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39498);sb.replaceAll((StrMatcher) null, null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39499);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39500);sb.replaceAll((StrMatcher) null, "anything");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39501);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39502);sb.replaceAll(StrMatcher.noneMatcher(), null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39503);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39504);sb.replaceAll(StrMatcher.noneMatcher(), "anything");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39505);assertEquals("abcbccba", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39506);sb.replaceAll(StrMatcher.charMatcher('x'), "y");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39507);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39508);sb.replaceAll(StrMatcher.charMatcher('a'), "d");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39509);assertEquals("dbcbccbd", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39510);sb.replaceAll(StrMatcher.charMatcher('d'), null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39511);assertEquals("bcbccb", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39512);sb.replaceAll(StrMatcher.stringMatcher("cb"), "-");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39513);assertEquals("b-c-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39514);sb = new StrBuilder("abcba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39515);sb.replaceAll(StrMatcher.charMatcher('b'), "xbx");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39516);assertEquals("axbxcxbxa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39517);sb = new StrBuilder("bb");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39518);sb.replaceAll(StrMatcher.charMatcher('b'), "xbx");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39519);assertEquals("xbxxbx", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39520);sb = new StrBuilder("A1-A2A3-A4");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39521);sb.replaceAll(A_NUMBER_MATCHER, "***");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39522);assertEquals("***-******-***", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testReplaceFirst_StrMatcher_String() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29gj6e3uhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplaceFirst_StrMatcher_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39523,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29gj6e3uhv(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39523);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39524);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39525);sb.replaceFirst((StrMatcher) null, null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39526);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39527);sb.replaceFirst((StrMatcher) null, "anything");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39528);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39529);sb.replaceFirst(StrMatcher.noneMatcher(), null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39530);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39531);sb.replaceFirst(StrMatcher.noneMatcher(), "anything");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39532);assertEquals("abcbccba", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39533);sb.replaceFirst(StrMatcher.charMatcher('x'), "y");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39534);assertEquals("abcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39535);sb.replaceFirst(StrMatcher.charMatcher('a'), "d");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39536);assertEquals("dbcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39537);sb.replaceFirst(StrMatcher.charMatcher('d'), null);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39538);assertEquals("bcbccba", sb.toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39539);sb.replaceFirst(StrMatcher.stringMatcher("cb"), "-");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39540);assertEquals("b-ccba", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39541);sb = new StrBuilder("abcba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39542);sb.replaceFirst(StrMatcher.charMatcher('b'), "xbx");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39543);assertEquals("axbxcba", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39544);sb = new StrBuilder("bb");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39545);sb.replaceFirst(StrMatcher.charMatcher('b'), "xbx");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39546);assertEquals("xbxb", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39547);sb = new StrBuilder("A1-A2A3-A4");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39548);sb.replaceFirst(A_NUMBER_MATCHER, "***");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39549);assertEquals("***-A2A3-A4", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReplace_StrMatcher_String_int_int_int_VaryMatcher() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kaxs22uim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_StrMatcher_String_int_int_int_VaryMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39550,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kaxs22uim(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39550);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39551);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39552);sb.replace((StrMatcher) null, "x", 0, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39553);assertEquals("abcbccba", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39554);sb.replace(StrMatcher.charMatcher('a'), "x", 0, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39555);assertEquals("xbcbccbx", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39556);sb.replace(StrMatcher.stringMatcher("cb"), "x", 0, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39557);assertEquals("xbxcxx", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39558);sb = new StrBuilder("A1-A2A3-A4");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39559);sb.replace(A_NUMBER_MATCHER, "***", 0, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39560);assertEquals("***-******-***", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39561);sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39562);sb.replace(A_NUMBER_MATCHER, "***", 0, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39563);assertEquals("", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testReplace_StrMatcher_String_int_int_int_VaryReplace() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sc5z7wuj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_StrMatcher_String_int_int_int_VaryReplace",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39564,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sc5z7wuj0(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39564);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39565);StrBuilder sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39566);sb.replace(StrMatcher.stringMatcher("cb"), "cb", 0, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39567);assertEquals("abcbccba", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39568);sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39569);sb.replace(StrMatcher.stringMatcher("cb"), "-", 0, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39570);assertEquals("ab-c-a", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39571);sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39572);sb.replace(StrMatcher.stringMatcher("cb"), "+++", 0, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39573);assertEquals("ab+++c+++a", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39574);sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39575);sb.replace(StrMatcher.stringMatcher("cb"), "", 0, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39576);assertEquals("abca", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39577);sb = new StrBuilder("abcbccba");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39578);sb.replace(StrMatcher.stringMatcher("cb"), null, 0, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39579);assertEquals("abca", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testReplace_StrMatcher_String_int_int_int_VaryStartIndex() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uo60pyujg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_StrMatcher_String_int_int_int_VaryStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39580,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uo60pyujg(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39580);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39581);StrBuilder sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39582);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39583);assertEquals("-x--y-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39584);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39585);sb.replace(StrMatcher.stringMatcher("aa"), "-", 1, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39586);assertEquals("aax--y-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39587);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39588);sb.replace(StrMatcher.stringMatcher("aa"), "-", 2, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39589);assertEquals("aax--y-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39590);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39591);sb.replace(StrMatcher.stringMatcher("aa"), "-", 3, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39592);assertEquals("aax--y-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39593);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39594);sb.replace(StrMatcher.stringMatcher("aa"), "-", 4, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39595);assertEquals("aaxa-ay-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39596);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39597);sb.replace(StrMatcher.stringMatcher("aa"), "-", 5, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39598);assertEquals("aaxaa-y-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39599);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39600);sb.replace(StrMatcher.stringMatcher("aa"), "-", 6, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39601);assertEquals("aaxaaaay-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39602);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39603);sb.replace(StrMatcher.stringMatcher("aa"), "-", 7, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39604);assertEquals("aaxaaaay-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39605);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39606);sb.replace(StrMatcher.stringMatcher("aa"), "-", 8, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39607);assertEquals("aaxaaaay-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39608);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39609);sb.replace(StrMatcher.stringMatcher("aa"), "-", 9, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39610);assertEquals("aaxaaaayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39611);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39612);sb.replace(StrMatcher.stringMatcher("aa"), "-", 10, sb.length(), -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39613);assertEquals("aaxaaaayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39614);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39615);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39616);sb.replace(StrMatcher.stringMatcher("aa"), "-", 11, sb.length(), -1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39617);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39618);assertEquals("aaxaaaayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39619);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39620);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39621);sb.replace(StrMatcher.stringMatcher("aa"), "-", -1, sb.length(), -1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39622);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39623);assertEquals("aaxaaaayaa", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testReplace_StrMatcher_String_int_int_int_VaryEndIndex() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kiz4mluko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_StrMatcher_String_int_int_int_VaryEndIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39624,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kiz4mluko(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39624);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39625);StrBuilder sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39626);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 0, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39627);assertEquals("aaxaaaayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39628);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39629);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 2, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39630);assertEquals("-xaaaayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39631);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39632);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 3, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39633);assertEquals("-xaaaayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39634);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39635);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 4, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39636);assertEquals("-xaaaayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39637);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39638);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 5, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39639);assertEquals("-x-aayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39640);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39641);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 6, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39642);assertEquals("-x-aayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39643);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39644);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 7, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39645);assertEquals("-x--yaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39646);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39647);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 8, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39648);assertEquals("-x--yaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39649);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39650);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 9, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39651);assertEquals("-x--yaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39652);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39653);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39654);assertEquals("-x--y-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39655);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39656);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 1000, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39657);assertEquals("-x--y-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39658);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39659);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39660);sb.replace(StrMatcher.stringMatcher("aa"), "-", 2, 1, -1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39661);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39662);assertEquals("aaxaaaayaa", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testReplace_StrMatcher_String_int_int_int_VaryCount() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22lix8nulr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReplace_StrMatcher_String_int_int_int_VaryCount",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39663,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22lix8nulr(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39663);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39664);StrBuilder sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39665);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, -1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39666);assertEquals("-x--y-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39667);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39668);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 0);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39669);assertEquals("aaxaaaayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39670);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39671);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39672);assertEquals("-xaaaayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39673);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39674);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 2);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39675);assertEquals("-x-aayaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39676);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39677);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 3);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39678);assertEquals("-x--yaa", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39679);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39680);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 4);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39681);assertEquals("-x--y-", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39682);sb = new StrBuilder("aaxaaaayaa");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39683);sb.replace(StrMatcher.stringMatcher("aa"), "-", 0, 10, 5);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39684);assertEquals("-x--y-", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReverse() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q8om2xumd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testReverse",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39685,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q8om2xumd(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39685);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39686);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39687);assertEquals("", sb.reverse().toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39688);sb.clear().append(true);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39689);assertEquals("eurt", sb.reverse().toString());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39690);assertEquals("true", sb.reverse().toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTrim() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bl47ffumj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testTrim",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39691,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bl47ffumj(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39691);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39692);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39693);assertEquals("", sb.reverse().toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39694);sb.clear().append(" \u0000 ");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39695);assertEquals("", sb.trim().toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39696);sb.clear().append(" \u0000 a b c");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39697);assertEquals("a b c", sb.trim().toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39698);sb.clear().append("a b c \u0000 ");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39699);assertEquals("a b c", sb.trim().toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39700);sb.clear().append(" \u0000 a b c \u0000 ");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39701);assertEquals("a b c", sb.trim().toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39702);sb.clear().append("a b c");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39703);assertEquals("a b c", sb.trim().toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testStartsWith() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_210ksuoumw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testStartsWith",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39704,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_210ksuoumw(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39704);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39705);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39706);assertFalse(sb.startsWith("a"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39707);assertFalse(sb.startsWith(null));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39708);assertTrue(sb.startsWith(""));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39709);sb.append("abc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39710);assertTrue(sb.startsWith("a"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39711);assertTrue(sb.startsWith("ab"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39712);assertTrue(sb.startsWith("abc"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39713);assertFalse(sb.startsWith("cba"));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testEndsWith() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yf5q6vun6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testEndsWith",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39714,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yf5q6vun6(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39714);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39715);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39716);assertFalse(sb.endsWith("a"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39717);assertFalse(sb.endsWith("c"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39718);assertTrue(sb.endsWith(""));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39719);assertFalse(sb.endsWith(null));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39720);sb.append("abc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39721);assertTrue(sb.endsWith("c"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39722);assertTrue(sb.endsWith("bc"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39723);assertTrue(sb.endsWith("abc"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39724);assertFalse(sb.endsWith("cba"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39725);assertFalse(sb.endsWith("abcd"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39726);assertFalse(sb.endsWith(" abc"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39727);assertFalse(sb.endsWith("abc "));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSubSequenceIntInt() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2t6ex6unk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSubSequenceIntInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39728,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2t6ex6unk(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39728);
       __CLR4_1_2u30u30l3lqxuyp.R.inc(39729);final StrBuilder sb = new StrBuilder ("hello goodbye");
       // Start index is negative
       __CLR4_1_2u30u30l3lqxuyp.R.inc(39730);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39731);sb.subSequence(-1, 5);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39732);fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // End index is negative
       __CLR4_1_2u30u30l3lqxuyp.R.inc(39733);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39734);sb.subSequence(2, -1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39735);fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // End index greater than length()
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39736);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39737);sb.subSequence(2, sb.length() + 1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39738);fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // Start index greater then end index
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39739);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39740);sb.subSequence(3, 2);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39741);fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        // Normal cases
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39742);assertEquals ("hello", sb.subSequence(0, 5));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39743);assertEquals ("hello goodbye".subSequence(0, 6), sb.subSequence(0, 6));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39744);assertEquals ("goodbye", sb.subSequence(6, 13));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39745);assertEquals ("hello goodbye".subSequence(6,13), sb.subSequence(6, 13));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testSubstringInt() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29itbmxuo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSubstringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39746,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29itbmxuo2(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39746);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39747);final StrBuilder sb = new StrBuilder ("hello goodbye");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39748);assertEquals ("goodbye", sb.substring(6));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39749);assertEquals ("hello goodbye".substring(6), sb.substring(6));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39750);assertEquals ("hello goodbye", sb.substring(0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39751);assertEquals ("hello goodbye".substring(0), sb.substring(0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39752);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39753);sb.substring(-1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39754);fail ();
        } catch (final IndexOutOfBoundsException e) {}
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39755);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39756);sb.substring(15);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39757);fail ();
        } catch (final IndexOutOfBoundsException e) {}
    
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}
    
    @Test
    public void testSubstringIntInt() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2h6nyhmuoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testSubstringIntInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39758,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2h6nyhmuoe(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39758);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39759);final StrBuilder sb = new StrBuilder ("hello goodbye");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39760);assertEquals ("hello", sb.substring(0, 5));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39761);assertEquals ("hello goodbye".substring(0, 6), sb.substring(0, 6));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39762);assertEquals ("goodbye", sb.substring(6, 13));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39763);assertEquals ("hello goodbye".substring(6,13), sb.substring(6, 13));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39764);assertEquals ("goodbye", sb.substring(6, 20));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39765);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39766);sb.substring(-1, 5);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39767);fail();
        } catch (final IndexOutOfBoundsException e) {}
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39768);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39769);sb.substring(15, 20);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(39770);fail();
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testMidString() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tk2f82uor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testMidString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39771,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tk2f82uor(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39771);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39772);final StrBuilder sb = new StrBuilder("hello goodbye hello");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39773);assertEquals("goodbye", sb.midString(6, 7));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39774);assertEquals("hello", sb.midString(0, 5));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39775);assertEquals("hello", sb.midString(-5, 5));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39776);assertEquals("", sb.midString(0, -1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39777);assertEquals("", sb.midString(20, 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39778);assertEquals("hello", sb.midString(14, 22));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testRightString() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a2v6wuuoz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testRightString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39779,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a2v6wuuoz(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39779);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39780);final StrBuilder sb = new StrBuilder("left right");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39781);assertEquals("right", sb.rightString(5));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39782);assertEquals("", sb.rightString(0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39783);assertEquals("", sb.rightString(-5));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39784);assertEquals("left right", sb.rightString(15));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testLeftString() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dovhsfup5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLeftString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39785,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dovhsfup5(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39785);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39786);final StrBuilder sb = new StrBuilder("left right");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39787);assertEquals("left", sb.leftString(4));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39788);assertEquals("", sb.leftString(0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39789);assertEquals("", sb.leftString(-5));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39790);assertEquals("left right", sb.leftString(15));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testContains_char() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i0rfp1upb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testContains_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39791,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i0rfp1upb(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39791);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39792);final StrBuilder sb = new StrBuilder("abcdefghijklmnopqrstuvwxyz");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39793);assertTrue(sb.contains('a'));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39794);assertTrue(sb.contains('o'));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39795);assertTrue(sb.contains('z'));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39796);assertFalse(sb.contains('1'));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testContains_String() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w2z9vquph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testContains_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39797,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w2z9vquph(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39797);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39798);final StrBuilder sb = new StrBuilder("abcdefghijklmnopqrstuvwxyz");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39799);assertTrue(sb.contains("a"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39800);assertTrue(sb.contains("pq"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39801);assertTrue(sb.contains("z"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39802);assertFalse(sb.contains("zyx"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39803);assertFalse(sb.contains((String) null));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testContains_StrMatcher() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zdf43aupo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testContains_StrMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39804,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zdf43aupo(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39804);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39805);StrBuilder sb = new StrBuilder("abcdefghijklmnopqrstuvwxyz");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39806);assertTrue(sb.contains(StrMatcher.charMatcher('a')));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39807);assertTrue(sb.contains(StrMatcher.stringMatcher("pq")));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39808);assertTrue(sb.contains(StrMatcher.charMatcher('z')));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39809);assertFalse(sb.contains(StrMatcher.stringMatcher("zy")));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39810);assertFalse(sb.contains((StrMatcher) null));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39811);sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39812);assertFalse(sb.contains(A_NUMBER_MATCHER));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39813);sb.append("B A1 C");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39814);assertTrue(sb.contains(A_NUMBER_MATCHER));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testIndexOf_char() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22eupffupz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39815,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22eupffupz(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39815);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39816);final StrBuilder sb = new StrBuilder("abab");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39817);assertEquals(0, sb.indexOf('a'));
        
        // should work like String#indexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39818);assertEquals("abab".indexOf('a'), sb.indexOf('a'));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39819);assertEquals(1, sb.indexOf('b'));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39820);assertEquals("abab".indexOf('b'), sb.indexOf('b'));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39821);assertEquals(-1, sb.indexOf('z'));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testIndexOf_char_int() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gf2423uq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_char_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39822,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gf2423uq6(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39822);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39823);StrBuilder sb = new StrBuilder("abab");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39824);assertEquals(0, sb.indexOf('a', -1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39825);assertEquals(0, sb.indexOf('a', 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39826);assertEquals(2, sb.indexOf('a', 1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39827);assertEquals(-1, sb.indexOf('a', 4));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39828);assertEquals(-1, sb.indexOf('a', 5));

        // should work like String#indexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39829);assertEquals("abab".indexOf('a', 1), sb.indexOf('a', 1));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39830);assertEquals(3, sb.indexOf('b', 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39831);assertEquals("abab".indexOf('b', 2), sb.indexOf('b', 2));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39832);assertEquals(-1, sb.indexOf('z', 2));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39833);sb = new StrBuilder("xyzabc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39834);assertEquals(2, sb.indexOf('z', 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39835);assertEquals(-1, sb.indexOf('z', 3));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_char() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hag5h7uqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39836,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hag5h7uqk(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39836);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39837);final StrBuilder sb = new StrBuilder("abab");
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39838);assertEquals (2, sb.lastIndexOf('a'));
        //should work like String#lastIndexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39839);assertEquals ("abab".lastIndexOf('a'), sb.lastIndexOf('a'));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39840);assertEquals(3, sb.lastIndexOf('b'));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39841);assertEquals ("abab".lastIndexOf('b'), sb.lastIndexOf('b'));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39842);assertEquals (-1, sb.lastIndexOf('z'));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_char_int() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x0ws9huqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_char_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39843,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x0ws9huqr(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39843);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39844);StrBuilder sb = new StrBuilder("abab");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39845);assertEquals(-1, sb.lastIndexOf('a', -1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39846);assertEquals(0, sb.lastIndexOf('a', 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39847);assertEquals(0, sb.lastIndexOf('a', 1));

        // should work like String#lastIndexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39848);assertEquals("abab".lastIndexOf('a', 1), sb.lastIndexOf('a', 1));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39849);assertEquals(1, sb.lastIndexOf('b', 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39850);assertEquals("abab".lastIndexOf('b', 2), sb.lastIndexOf('b', 2));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39851);assertEquals(-1, sb.lastIndexOf('z', 2));

        __CLR4_1_2u30u30l3lqxuyp.R.inc(39852);sb = new StrBuilder("xyzabc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39853);assertEquals(2, sb.lastIndexOf('z', sb.length()));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39854);assertEquals(-1, sb.lastIndexOf('z', 1));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testIndexOf_String() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qm76bkur3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39855,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qm76bkur3(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39855);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39856);final StrBuilder sb = new StrBuilder("abab");
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39857);assertEquals(0, sb.indexOf("a"));
        //should work like String#indexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39858);assertEquals("abab".indexOf("a"), sb.indexOf("a"));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39859);assertEquals(0, sb.indexOf("ab"));
        //should work like String#indexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39860);assertEquals("abab".indexOf("ab"), sb.indexOf("ab"));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39861);assertEquals(1, sb.indexOf("b"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39862);assertEquals("abab".indexOf("b"), sb.indexOf("b"));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39863);assertEquals(1, sb.indexOf("ba"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39864);assertEquals("abab".indexOf("ba"), sb.indexOf("ba"));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39865);assertEquals(-1, sb.indexOf("z"));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39866);assertEquals(-1, sb.indexOf((String) null));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testIndexOf_String_int() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2knlb74urf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_String_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39867,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2knlb74urf(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39867);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39868);StrBuilder sb = new StrBuilder("abab");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39869);assertEquals(0, sb.indexOf("a", -1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39870);assertEquals(0, sb.indexOf("a", 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39871);assertEquals(2, sb.indexOf("a", 1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39872);assertEquals(2, sb.indexOf("a", 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39873);assertEquals(-1, sb.indexOf("a", 3));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39874);assertEquals(-1, sb.indexOf("a", 4));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39875);assertEquals(-1, sb.indexOf("a", 5));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39876);assertEquals(-1, sb.indexOf("abcdef", 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39877);assertEquals(0, sb.indexOf("", 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39878);assertEquals(1, sb.indexOf("", 1));
        
        //should work like String#indexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39879);assertEquals ("abab".indexOf("a", 1), sb.indexOf("a", 1));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39880);assertEquals(2, sb.indexOf("ab", 1));
        //should work like String#indexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39881);assertEquals("abab".indexOf("ab", 1), sb.indexOf("ab", 1));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39882);assertEquals(3, sb.indexOf("b", 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39883);assertEquals("abab".indexOf("b", 2), sb.indexOf("b", 2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39884);assertEquals(1, sb.indexOf("ba", 1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39885);assertEquals("abab".indexOf("ba", 2), sb.indexOf("ba", 2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39886);assertEquals(-1, sb.indexOf("z", 2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39887);sb = new StrBuilder("xyzabc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39888);assertEquals(2, sb.indexOf("za", 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39889);assertEquals(-1, sb.indexOf("za", 3));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39890);assertEquals(-1, sb.indexOf((String) null, 2));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_String() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dkp8s6us3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39891,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dkp8s6us3(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39891);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39892);final StrBuilder sb = new StrBuilder("abab");
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39893);assertEquals(2, sb.lastIndexOf("a"));
        //should work like String#lastIndexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39894);assertEquals("abab".lastIndexOf("a"), sb.lastIndexOf("a"));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39895);assertEquals(2, sb.lastIndexOf("ab"));
        //should work like String#lastIndexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39896);assertEquals("abab".lastIndexOf("ab"), sb.lastIndexOf("ab"));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39897);assertEquals(3, sb.lastIndexOf("b"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39898);assertEquals("abab".lastIndexOf("b"), sb.lastIndexOf("b"));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39899);assertEquals(1, sb.lastIndexOf("ba"));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39900);assertEquals("abab".lastIndexOf("ba"), sb.lastIndexOf("ba"));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39901);assertEquals(-1, sb.lastIndexOf("z"));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39902);assertEquals(-1, sb.lastIndexOf((String) null));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_String_int() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rqyjkqusf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_String_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39903,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rqyjkqusf(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39903);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39904);StrBuilder sb = new StrBuilder("abab");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39905);assertEquals(-1, sb.lastIndexOf("a", -1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39906);assertEquals(0, sb.lastIndexOf("a", 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39907);assertEquals(0, sb.lastIndexOf("a", 1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39908);assertEquals(2, sb.lastIndexOf("a", 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39909);assertEquals(2, sb.lastIndexOf("a", 3));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39910);assertEquals(2, sb.lastIndexOf("a", 4));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39911);assertEquals(2, sb.lastIndexOf("a", 5));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39912);assertEquals(-1, sb.lastIndexOf("abcdef", 3));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39913);assertEquals("abab".lastIndexOf("", 3), sb.lastIndexOf("", 3));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39914);assertEquals("abab".lastIndexOf("", 1), sb.lastIndexOf("", 1));
        
        //should work like String#lastIndexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39915);assertEquals("abab".lastIndexOf("a", 1), sb.lastIndexOf("a", 1));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39916);assertEquals(0, sb.lastIndexOf("ab", 1));
        //should work like String#lastIndexOf
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39917);assertEquals("abab".lastIndexOf("ab", 1), sb.lastIndexOf("ab", 1));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39918);assertEquals(1, sb.lastIndexOf("b", 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39919);assertEquals("abab".lastIndexOf("b", 2), sb.lastIndexOf("b", 2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39920);assertEquals(1, sb.lastIndexOf("ba", 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39921);assertEquals("abab".lastIndexOf("ba", 2), sb.lastIndexOf("ba", 2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39922);assertEquals(-1, sb.lastIndexOf("z", 2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39923);sb = new StrBuilder("xyzabc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39924);assertEquals(2, sb.lastIndexOf("za", sb.length()));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39925);assertEquals(-1, sb.lastIndexOf("za", 1));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39926);assertEquals(-1, sb.lastIndexOf((String) null, 2));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testIndexOf_StrMatcher() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zd6rkgut3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_StrMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39927,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zd6rkgut3(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39927);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39928);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39929);assertEquals(-1, sb.indexOf((StrMatcher) null));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39930);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a')));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39931);sb.append("ab bd");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39932);assertEquals(0, sb.indexOf(StrMatcher.charMatcher('a')));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39933);assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b')));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39934);assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher()));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39935);assertEquals(4, sb.indexOf(StrMatcher.charMatcher('d')));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39936);assertEquals(-1, sb.indexOf(StrMatcher.noneMatcher()));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39937);assertEquals(-1, sb.indexOf((StrMatcher) null));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39938);sb.append(" A1 junction");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39939);assertEquals(6, sb.indexOf(A_NUMBER_MATCHER));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testIndexOf_StrMatcher_int() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k52gkgutg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOf_StrMatcher_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39940,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k52gkgutg(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39940);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39941);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39942);assertEquals(-1, sb.indexOf((StrMatcher) null, 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39943);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39944);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 0));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39945);sb.append("ab bd");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39946);assertEquals(0, sb.indexOf(StrMatcher.charMatcher('a'), -2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39947);assertEquals(0, sb.indexOf(StrMatcher.charMatcher('a'), 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39948);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39949);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('a'), 20));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39950);assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b'), -1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39951);assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b'), 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39952);assertEquals(1, sb.indexOf(StrMatcher.charMatcher('b'), 1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39953);assertEquals(3, sb.indexOf(StrMatcher.charMatcher('b'), 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39954);assertEquals(3, sb.indexOf(StrMatcher.charMatcher('b'), 3));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39955);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('b'), 4));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39956);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('b'), 5));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39957);assertEquals(-1, sb.indexOf(StrMatcher.charMatcher('b'), 6));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39958);assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher(), -2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39959);assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher(), 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39960);assertEquals(2, sb.indexOf(StrMatcher.spaceMatcher(), 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39961);assertEquals(-1, sb.indexOf(StrMatcher.spaceMatcher(), 4));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39962);assertEquals(-1, sb.indexOf(StrMatcher.spaceMatcher(), 20));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39963);assertEquals(-1, sb.indexOf(StrMatcher.noneMatcher(), 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39964);assertEquals(-1, sb.indexOf((StrMatcher) null, 0));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39965);sb.append(" A1 junction with A2");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39966);assertEquals(6, sb.indexOf(A_NUMBER_MATCHER, 5));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39967);assertEquals(6, sb.indexOf(A_NUMBER_MATCHER, 6));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39968);assertEquals(23, sb.indexOf(A_NUMBER_MATCHER, 7));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39969);assertEquals(23, sb.indexOf(A_NUMBER_MATCHER, 22));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39970);assertEquals(23, sb.indexOf(A_NUMBER_MATCHER, 23));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39971);assertEquals(-1, sb.indexOf(A_NUMBER_MATCHER, 24));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_StrMatcher() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cqmkd6uuc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_StrMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39972,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cqmkd6uuc(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39972);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39973);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39974);assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39975);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a')));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39976);sb.append("ab bd");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39977);assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a')));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39978);assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b')));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39979);assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher()));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39980);assertEquals(4, sb.lastIndexOf(StrMatcher.charMatcher('d')));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39981);assertEquals(-1, sb.lastIndexOf(StrMatcher.noneMatcher()));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39982);assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39983);sb.append(" A1 junction");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39984);assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_StrMatcher_int() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),39985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2h08oa2uup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLastIndexOf_StrMatcher_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),39985,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2h08oa2uup(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(39985);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39986);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39987);assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39988);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39989);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39990);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), -1));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39991);sb.append("ab bd");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39992);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('a'), -2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39993);assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a'), 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39994);assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a'), 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39995);assertEquals(0, sb.lastIndexOf(StrMatcher.charMatcher('a'), 20));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39996);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('b'), -1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39997);assertEquals(-1, sb.lastIndexOf(StrMatcher.charMatcher('b'), 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39998);assertEquals(1, sb.lastIndexOf(StrMatcher.charMatcher('b'), 1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(39999);assertEquals(1, sb.lastIndexOf(StrMatcher.charMatcher('b'), 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40000);assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 3));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40001);assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 4));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40002);assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 5));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40003);assertEquals(3, sb.lastIndexOf(StrMatcher.charMatcher('b'), 6));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40004);assertEquals(-1, sb.lastIndexOf(StrMatcher.spaceMatcher(), -2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40005);assertEquals(-1, sb.lastIndexOf(StrMatcher.spaceMatcher(), 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40006);assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher(), 2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40007);assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher(), 4));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40008);assertEquals(2, sb.lastIndexOf(StrMatcher.spaceMatcher(), 20));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40009);assertEquals(-1, sb.lastIndexOf(StrMatcher.noneMatcher(), 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40010);assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 0));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40011);sb.append(" A1 junction with A2");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40012);assertEquals(-1, sb.lastIndexOf(A_NUMBER_MATCHER, 5));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40013);assertEquals(-1, sb.lastIndexOf(A_NUMBER_MATCHER, 6)); // A matches, 1 is outside bounds
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40014);assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER, 7));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40015);assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER, 22));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40016);assertEquals(6, sb.lastIndexOf(A_NUMBER_MATCHER, 23)); // A matches, 2 is outside bounds
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40017);assertEquals(23, sb.lastIndexOf(A_NUMBER_MATCHER, 24));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    static final StrMatcher A_NUMBER_MATCHER = new StrMatcher() {
        @Override
        public int isMatch(final char[] buffer, int pos, final int bufferStart, final int bufferEnd) {try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40018);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(40019);if ((((buffer[pos] == 'A')&&(__CLR4_1_2u30u30l3lqxuyp.R.iget(40020)!=0|true))||(__CLR4_1_2u30u30l3lqxuyp.R.iget(40021)==0&false))) {{
                __CLR4_1_2u30u30l3lqxuyp.R.inc(40022);pos++;
                __CLR4_1_2u30u30l3lqxuyp.R.inc(40023);if ((((pos < bufferEnd && buffer[pos] >= '0' && buffer[pos] <= '9')&&(__CLR4_1_2u30u30l3lqxuyp.R.iget(40024)!=0|true))||(__CLR4_1_2u30u30l3lqxuyp.R.iget(40025)==0&false))) {{
                    __CLR4_1_2u30u30l3lqxuyp.R.inc(40026);return 2;
                }
            }}
            }__CLR4_1_2u30u30l3lqxuyp.R.inc(40027);return 0;
        }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}
    };

    //-----------------------------------------------------------------------
    @Test
    public void testAsTokenizer() throws Exception {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27n2uwquvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAsTokenizer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40028,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27n2uwquvw() throws Exception{try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40028);
        // from Javadoc
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40029);final StrBuilder b = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40030);b.append("a b ");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40031);final StrTokenizer t = b.asTokenizer();
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40032);final String[] tokens1 = t.getTokenArray();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40033);assertEquals(2, tokens1.length);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40034);assertEquals("a", tokens1[0]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40035);assertEquals("b", tokens1[1]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40036);assertEquals(2, t.size());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40037);b.append("c d ");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40038);final String[] tokens2 = t.getTokenArray();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40039);assertEquals(2, tokens2.length);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40040);assertEquals("a", tokens2[0]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40041);assertEquals("b", tokens2[1]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40042);assertEquals(2, t.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40043);assertEquals("a", t.next());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40044);assertEquals("b", t.next());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40045);t.reset();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40046);final String[] tokens3 = t.getTokenArray();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40047);assertEquals(4, tokens3.length);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40048);assertEquals("a", tokens3[0]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40049);assertEquals("b", tokens3[1]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40050);assertEquals("c", tokens3[2]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40051);assertEquals("d", tokens3[3]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40052);assertEquals(4, t.size());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40053);assertEquals("a", t.next());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40054);assertEquals("b", t.next());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40055);assertEquals("c", t.next());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40056);assertEquals("d", t.next());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40057);assertEquals("a b c d ", t.getContent());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testAsReader() throws Exception {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21qxnseuwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAsReader",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40058,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21qxnseuwq() throws Exception{try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40058);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40059);final StrBuilder sb = new StrBuilder("some text");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40060);Reader reader = sb.asReader();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40061);assertTrue(reader.ready());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40062);final char[] buf = new char[40];
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40063);assertEquals(9, reader.read(buf));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40064);assertEquals("some text", new String(buf, 0, 9));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40065);assertEquals(-1, reader.read());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40066);assertFalse(reader.ready());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40067);assertEquals(0, reader.skip(2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40068);assertEquals(0, reader.skip(-1));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40069);assertTrue(reader.markSupported());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40070);reader = sb.asReader();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40071);assertEquals('s', reader.read());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40072);reader.mark(-1);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40073);char[] array = new char[3];
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40074);assertEquals(3, reader.read(array, 0, 3));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40075);assertEquals('o', array[0]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40076);assertEquals('m', array[1]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40077);assertEquals('e', array[2]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40078);reader.reset();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40079);assertEquals(1, reader.read(array, 1, 1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40080);assertEquals('o', array[0]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40081);assertEquals('o', array[1]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40082);assertEquals('e', array[2]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40083);assertEquals(2, reader.skip(2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40084);assertEquals(' ', reader.read());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40085);assertTrue(reader.ready());
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40086);reader.close();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40087);assertTrue(reader.ready());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40088);reader = sb.asReader();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40089);array = new char[3];
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40090);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(40091);reader.read(array, -1, 0);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(40092);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40093);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(40094);reader.read(array, 0, -1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(40095);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40096);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(40097);reader.read(array, 100, 1);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(40098);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40099);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(40100);reader.read(array, 0, 100);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(40101);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40102);try {
            __CLR4_1_2u30u30l3lqxuyp.R.inc(40103);reader.read(array, Integer.MAX_VALUE, Integer.MAX_VALUE);
            __CLR4_1_2u30u30l3lqxuyp.R.inc(40104);fail();
        } catch (final IndexOutOfBoundsException ex) {}
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40105);assertEquals(0, reader.read(array, 0, 0));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40106);assertEquals(0, array[0]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40107);assertEquals(0, array[1]);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40108);assertEquals(0, array[2]);
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40109);reader.skip(9);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40110);assertEquals(-1, reader.read(array, 0, 1));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40111);reader.reset();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40112);array = new char[30];
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40113);assertEquals(9, reader.read(array, 0, 30));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAsWriter() throws Exception {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29k26jmuya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAsWriter",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40114,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29k26jmuya() throws Exception{try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40114);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40115);final StrBuilder sb = new StrBuilder("base");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40116);final Writer writer = sb.asWriter();
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40117);writer.write('l');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40118);assertEquals("basel", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40119);writer.write(new char[] {'i', 'n'});
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40120);assertEquals("baselin", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40121);writer.write(new char[] {'n', 'e', 'r'}, 1, 2);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40122);assertEquals("baseliner", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40123);writer.write(" rout");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40124);assertEquals("baseliner rout", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40125);writer.write("ping that server", 1, 3);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40126);assertEquals("baseliner routing", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40127);writer.flush();  // no effect
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40128);assertEquals("baseliner routing", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40129);writer.close();  // no effect
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40130);assertEquals("baseliner routing", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40131);writer.write(" hi");  // works after close
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40132);assertEquals("baseliner routing hi", sb.toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40133);sb.setLength(4);  // mix and match
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40134);writer.write('d');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40135);assertEquals("based", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsIgnoreCase() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c1544muyw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testEqualsIgnoreCase",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40136,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c1544muyw(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40136);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40137);final StrBuilder sb1 = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40138);final StrBuilder sb2 = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40139);assertTrue(sb1.equalsIgnoreCase(sb1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40140);assertTrue(sb1.equalsIgnoreCase(sb2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40141);assertTrue(sb2.equalsIgnoreCase(sb2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40142);sb1.append("abc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40143);assertFalse(sb1.equalsIgnoreCase(sb2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40144);sb2.append("ABC");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40145);assertTrue(sb1.equalsIgnoreCase(sb2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40146);sb2.clear().append("abc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40147);assertTrue(sb1.equalsIgnoreCase(sb2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40148);assertTrue(sb1.equalsIgnoreCase(sb1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40149);assertTrue(sb2.equalsIgnoreCase(sb2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40150);sb2.clear().append("aBc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40151);assertTrue(sb1.equalsIgnoreCase(sb2));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquals() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608uzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40152,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608uzc(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40152);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40153);final StrBuilder sb1 = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40154);final StrBuilder sb2 = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40155);assertTrue(sb1.equals(sb2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40156);assertTrue(sb1.equals(sb1));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40157);assertTrue(sb2.equals(sb2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40158);assertTrue(sb1.equals((Object) sb2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40159);sb1.append("abc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40160);assertFalse(sb1.equals(sb2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40161);assertFalse(sb1.equals((Object) sb2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40162);sb2.append("ABC");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40163);assertFalse(sb1.equals(sb2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40164);assertFalse(sb1.equals((Object) sb2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40165);sb2.clear().append("abc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40166);assertTrue(sb1.equals(sb2));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40167);assertTrue(sb1.equals((Object) sb2));
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40168);assertFalse(sb1.equals(Integer.valueOf(1)));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40169);assertFalse(sb1.equals("abc"));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testHashCode() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8uzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40170,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8uzu(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40170);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40171);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40172);final int hc1a = sb.hashCode();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40173);final int hc1b = sb.hashCode();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40174);assertEquals(0, hc1a);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40175);assertEquals(hc1a, hc1b);
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40176);sb.append("abc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40177);final int hc2a = sb.hashCode();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40178);final int hc2b = sb.hashCode();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40179);assertTrue(hc2a != 0);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40180);assertEquals(hc2a, hc2b);
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidv05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40181,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidv05(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40181);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40182);final StrBuilder sb = new StrBuilder("abc");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40183);assertEquals("abc", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStringBuffer() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vkk5ffv08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testToStringBuffer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40184,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vkk5ffv08(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40184);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40185);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40186);assertEquals(new StringBuffer().toString(), sb.toStringBuffer().toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40187);sb.append("junit");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40188);assertEquals(new StringBuffer("junit").toString(), sb.toStringBuffer().toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToStringBuilder() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27jio90v0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testToStringBuilder",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40189,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27jio90v0d(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40189);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40190);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40191);assertEquals(new StringBuilder().toString(), sb.toStringBuilder().toString());
        
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40192);sb.append("junit");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40193);assertEquals(new StringBuilder("junit").toString(), sb.toStringBuilder().toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testLang294() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24v6dykv0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLang294",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40194,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24v6dykv0i(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40194);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40195);final StrBuilder sb = new StrBuilder("\n%BLAH%\nDo more stuff\neven more stuff\n%BLAH%\n");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40196);sb.deleteAll("\n%BLAH%");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40197);assertEquals("\nDo more stuff\neven more stuff\n", sb.toString()); 
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testIndexOfLang294() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29yb7rjv0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testIndexOfLang294",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40198,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29yb7rjv0m(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40198);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40199);final StrBuilder sb = new StrBuilder("onetwothree");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40200);sb.deleteFirst("three");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40201);assertEquals(-1, sb.indexOf("three"));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testLang295() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21m6f63v0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLang295",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40202,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21m6f63v0q(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40202);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40203);final StrBuilder sb = new StrBuilder("onetwothree");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40204);sb.deleteFirst("three");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40205);assertFalse( "The contains(char) method is looking beyond the end of the string", sb.contains('h'));
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40206);assertEquals( "The indexOf(char) method is looking beyond the end of the string", -1, sb.indexOf('h'));
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testLang412Right() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23tm8jyv0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLang412Right",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40207,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23tm8jyv0v(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40207);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40208);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40209);sb.appendFixedWidthPadRight(null, 10, '*');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40210);assertEquals( "Failed to invoke appendFixedWidthPadRight correctly", "**********", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testLang412Left() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2150iqlv0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testLang412Left",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40211,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2150iqlv0z(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40211);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40212);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40213);sb.appendFixedWidthPadLeft(null, 10, '*');
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40214);assertEquals( "Failed to invoke appendFixedWidthPadLeft correctly", "**********", sb.toString());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

    @Test
    public void testAsBuilder() {__CLR4_1_2u30u30l3lqxuyp.R.globalSliceStart(getClass().getName(),40215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aaybk2v13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2u30u30l3lqxuyp.R.rethrow($CLV_t2$);}finally{__CLR4_1_2u30u30l3lqxuyp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderTest.testAsBuilder",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40215,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aaybk2v13(){try{__CLR4_1_2u30u30l3lqxuyp.R.inc(40215);
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40216);final StrBuilder sb = new StrBuilder().appendAll("Lorem", " ", "ipsum", " ", "dolor");
        __CLR4_1_2u30u30l3lqxuyp.R.inc(40217);assertEquals(sb.toString(), sb.build());
    }finally{__CLR4_1_2u30u30l3lqxuyp.R.flushNeeded();}}

}
