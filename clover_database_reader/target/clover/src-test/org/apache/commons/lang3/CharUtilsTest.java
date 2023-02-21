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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.CharUtils}.
 *
 * @version $Id$
 */
public class CharUtilsTest {static class __CLR4_1_2ii3ii3l3lqxtmg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,24222,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Character CHARACTER_A = new Character('A');
    private static final Character CHARACTER_B = new Character('B');
    private static final char CHAR_COPY = '\u00a9';
    
    @Test
    public void testConstructor() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),23979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hii3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23979,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hii3(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(23979);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23980);assertNotNull(new CharUtils());
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23981);final Constructor<?>[] cons = CharUtils.class.getDeclaredConstructors();
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23982);assertEquals(1, cons.length);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23983);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23984);assertTrue(Modifier.isPublic(BooleanUtils.class.getModifiers()));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23985);assertFalse(Modifier.isFinal(BooleanUtils.class.getModifiers()));
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @SuppressWarnings("deprecation") // intentional test of deprecated method
    @Test
    public void testToCharacterObject_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),23986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kllvpdiia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToCharacterObject_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23986,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kllvpdiia(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(23986);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23987);assertEquals(new Character('a'), CharUtils.toCharacterObject('a'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23988);assertSame(CharUtils.toCharacterObject('a'), CharUtils.toCharacterObject('a'));
       
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23989);for (int i = 0; (((i < 128)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(23990)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(23991)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23992);final Character ch = CharUtils.toCharacterObject((char) i);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23993);final Character ch2 = CharUtils.toCharacterObject((char) i);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23994);assertSame(ch, ch2);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23995);assertEquals(i, ch.charValue());
        }
        }__CLR4_1_2ii3ii3l3lqxtmg.R.inc(23996);for (int i = 128; (((i < 196)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(23997)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(23998)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(23999);final Character ch = CharUtils.toCharacterObject((char) i);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24000);final Character ch2 = CharUtils.toCharacterObject((char) i);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24001);assertEquals(ch, ch2);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24002);assertTrue(ch != ch2);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24003);assertEquals(i, ch.charValue());
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24004);assertEquals(i, ch2.charValue());
        }
        }__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24005);assertSame(CharUtils.toCharacterObject("a"), CharUtils.toCharacterObject('a'));
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToCharacterObject_String() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21xg43oiiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToCharacterObject_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24006,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21xg43oiiu(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24006);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24007);assertEquals(null, CharUtils.toCharacterObject(null));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24008);assertEquals(null, CharUtils.toCharacterObject(""));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24009);assertEquals(new Character('a'), CharUtils.toCharacterObject("a"));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24010);assertEquals(new Character('a'), CharUtils.toCharacterObject("abc"));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24011);assertSame(CharUtils.toCharacterObject("a"), CharUtils.toCharacterObject("a"));
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToChar_Character() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rmj1n8ij0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToChar_Character",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24012,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rmj1n8ij0(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24012);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24013);assertEquals('A', CharUtils.toChar(CHARACTER_A));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24014);assertEquals('B', CharUtils.toChar(CHARACTER_B));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24015);try {
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24016);CharUtils.toChar((Character) null);
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToChar_Character_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f4yfo1ij5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToChar_Character_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24017,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f4yfo1ij5(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24017);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24018);assertEquals('A', CharUtils.toChar(CHARACTER_A, 'X'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24019);assertEquals('B', CharUtils.toChar(CHARACTER_B, 'X'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24020);assertEquals('X', CharUtils.toChar((Character) null, 'X'));
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToChar_String() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qq3ylwij9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToChar_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24021,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qq3ylwij9(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24021);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24022);assertEquals('A', CharUtils.toChar("A"));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24023);assertEquals('B', CharUtils.toChar("BA"));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24024);try {
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24025);CharUtils.toChar((String) null);
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24026);try {
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24027);CharUtils.toChar("");
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToChar_String_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28yvmfjijg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToChar_String_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24028,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28yvmfjijg(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24028);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24029);assertEquals('A', CharUtils.toChar("A", 'X'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24030);assertEquals('B', CharUtils.toChar("BA", 'X'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24031);assertEquals('X', CharUtils.toChar("", 'X'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24032);assertEquals('X', CharUtils.toChar((String) null, 'X'));
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToIntValue_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rp10tvijl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToIntValue_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24033,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rp10tvijl(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24033);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24034);assertEquals(0, CharUtils.toIntValue('0'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24035);assertEquals(1, CharUtils.toIntValue('1'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24036);assertEquals(2, CharUtils.toIntValue('2'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24037);assertEquals(3, CharUtils.toIntValue('3'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24038);assertEquals(4, CharUtils.toIntValue('4'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24039);assertEquals(5, CharUtils.toIntValue('5'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24040);assertEquals(6, CharUtils.toIntValue('6'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24041);assertEquals(7, CharUtils.toIntValue('7'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24042);assertEquals(8, CharUtils.toIntValue('8'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24043);assertEquals(9, CharUtils.toIntValue('9'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24044);try {
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24045);CharUtils.toIntValue('a');
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToIntValue_char_int() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29rji2rijy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToIntValue_char_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24046,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29rji2rijy(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24046);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24047);assertEquals(0, CharUtils.toIntValue('0', -1));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24048);assertEquals(3, CharUtils.toIntValue('3', -1));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24049);assertEquals(-1, CharUtils.toIntValue('a', -1));
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToIntValue_Character() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2evzgjkik2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToIntValue_Character",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24050,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2evzgjkik2(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24050);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24051);assertEquals(0, CharUtils.toIntValue(new Character('0')));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24052);assertEquals(3, CharUtils.toIntValue(new Character('3')));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24053);try {
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24054);CharUtils.toIntValue(null);
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24055);try {
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24056);CharUtils.toIntValue(CHARACTER_A);
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToIntValue_Character_int() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2z0ivv4ik9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToIntValue_Character_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24057,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2z0ivv4ik9(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24057);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24058);assertEquals(0, CharUtils.toIntValue(new Character('0'), -1));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24059);assertEquals(3, CharUtils.toIntValue(new Character('3'), -1));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24060);assertEquals(-1, CharUtils.toIntValue(new Character('A'), -1));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24061);assertEquals(-1, CharUtils.toIntValue(null, -1));
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToString_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sj7cjiike();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToString_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24062,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sj7cjiike(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24062);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24063);assertEquals("a", CharUtils.toString('a'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24064);assertSame(CharUtils.toString('a'), CharUtils.toString('a'));
       
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24065);for (int i = 0; (((i < 128)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24066)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24067)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24068);final String str = CharUtils.toString((char) i);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24069);final String str2 = CharUtils.toString((char) i);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24070);assertSame(str, str2);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24071);assertEquals(1, str.length());
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24072);assertEquals(i, str.charAt(0));
        }
        }__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24073);for (int i = 128; (((i < 196)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24074)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24075)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24076);final String str = CharUtils.toString((char) i);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24077);final String str2 = CharUtils.toString((char) i);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24078);assertEquals(str, str2);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24079);assertTrue(str != str2);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24080);assertEquals(1, str.length());
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24081);assertEquals(i, str.charAt(0));
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24082);assertEquals(1, str2.length());
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24083);assertEquals(i, str2.charAt(0));
        }
    }}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToString_Character() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v0rxinil0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToString_Character",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v0rxinil0(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24084);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24085);assertEquals(null, CharUtils.toString(null));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24086);assertEquals("A", CharUtils.toString(CHARACTER_A));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24087);assertSame(CharUtils.toString(CHARACTER_A), CharUtils.toString(CHARACTER_A));
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToUnicodeEscaped_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22n3e7dil4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToUnicodeEscaped_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24088,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22n3e7dil4(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24088);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24089);assertEquals("\\u0041", CharUtils.unicodeEscaped('A'));
       
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24090);for (int i = 0; (((i < 196)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24091)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24092)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24093);final String str = CharUtils.unicodeEscaped((char) i);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24094);assertEquals(6, str.length());
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24095);final int val = Integer.parseInt(str.substring(2), 16);
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24096);assertEquals(i, val);
        }
        }__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24097);assertEquals("\\u0999", CharUtils.unicodeEscaped((char) 0x999));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24098);assertEquals("\\u1001", CharUtils.unicodeEscaped((char) 0x1001));
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testToUnicodeEscaped_Character() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r2zkt8ilf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testToUnicodeEscaped_Character",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24099,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r2zkt8ilf(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24099);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24100);assertEquals(null, CharUtils.unicodeEscaped(null));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24101);assertEquals("\\u0041", CharUtils.unicodeEscaped(CHARACTER_A));
    }finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testIsAscii_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x0qwqvili();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAscii_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24102,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x0qwqvili(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24102);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24103);assertTrue(CharUtils.isAscii('a'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24104);assertTrue(CharUtils.isAscii('A'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24105);assertTrue(CharUtils.isAscii('3'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24106);assertTrue(CharUtils.isAscii('-'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24107);assertTrue(CharUtils.isAscii('\n'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24108);assertFalse(CharUtils.isAscii(CHAR_COPY));
       
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24109);for (int i = 0; (((i < 128)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24110)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24111)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24112);if ((((i < 128)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24113)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24114)==0&false))) {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24115);assertTrue(CharUtils.isAscii((char) i));
            } }else {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24116);assertFalse(CharUtils.isAscii((char) i));
            }
        }}
    }}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiPrintable_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25qr9liilx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiPrintable_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24117,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25qr9liilx(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24117);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24118);assertTrue(CharUtils.isAsciiPrintable('a'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24119);assertTrue(CharUtils.isAsciiPrintable('A'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24120);assertTrue(CharUtils.isAsciiPrintable('3'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24121);assertTrue(CharUtils.isAsciiPrintable('-'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24122);assertFalse(CharUtils.isAsciiPrintable('\n'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24123);assertFalse(CharUtils.isAscii(CHAR_COPY));
       
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24124);for (int i = 0; (((i < 196)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24125)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24126)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24127);if ((((i >= 32 && i <= 126)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24128)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24129)==0&false))) {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24130);assertTrue(CharUtils.isAsciiPrintable((char) i));
            } }else {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24131);assertFalse(CharUtils.isAsciiPrintable((char) i));
            }
        }}
    }}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiControl_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m8dw18imc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiControl_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24132,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m8dw18imc(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24132);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24133);assertFalse(CharUtils.isAsciiControl('a'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24134);assertFalse(CharUtils.isAsciiControl('A'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24135);assertFalse(CharUtils.isAsciiControl('3'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24136);assertFalse(CharUtils.isAsciiControl('-'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24137);assertTrue(CharUtils.isAsciiControl('\n'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24138);assertFalse(CharUtils.isAsciiControl(CHAR_COPY));
       
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24139);for (int i = 0; (((i < 196)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24140)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24141)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24142);if ((((i < 32 || i == 127)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24143)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24144)==0&false))) {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24145);assertTrue(CharUtils.isAsciiControl((char) i));
            } }else {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24146);assertFalse(CharUtils.isAsciiControl((char) i));
            }
        }}
    }}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiAlpha_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ypcuwdimr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiAlpha_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24147,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ypcuwdimr(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24147);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24148);assertTrue(CharUtils.isAsciiAlpha('a'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24149);assertTrue(CharUtils.isAsciiAlpha('A'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24150);assertFalse(CharUtils.isAsciiAlpha('3'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24151);assertFalse(CharUtils.isAsciiAlpha('-'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24152);assertFalse(CharUtils.isAsciiAlpha('\n'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24153);assertFalse(CharUtils.isAsciiAlpha(CHAR_COPY));
       
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24154);for (int i = 0; (((i < 196)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24155)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24156)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24157);if (((((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z'))&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24158)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24159)==0&false))) {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24160);assertTrue(CharUtils.isAsciiAlpha((char) i));
            } }else {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24161);assertFalse(CharUtils.isAsciiAlpha((char) i));
            }
        }}
    }}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiAlphaUpper_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2blkigzin6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiAlphaUpper_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24162,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2blkigzin6(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24162);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24163);assertFalse(CharUtils.isAsciiAlphaUpper('a'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24164);assertTrue(CharUtils.isAsciiAlphaUpper('A'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24165);assertFalse(CharUtils.isAsciiAlphaUpper('3'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24166);assertFalse(CharUtils.isAsciiAlphaUpper('-'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24167);assertFalse(CharUtils.isAsciiAlphaUpper('\n'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24168);assertFalse(CharUtils.isAsciiAlphaUpper(CHAR_COPY));
       
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24169);for (int i = 0; (((i < 196)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24170)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24171)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24172);if ((((i >= 'A' && i <= 'Z')&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24173)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24174)==0&false))) {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24175);assertTrue(CharUtils.isAsciiAlphaUpper((char) i));
            } }else {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24176);assertFalse(CharUtils.isAsciiAlphaUpper((char) i));
            }
        }}
    }}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiAlphaLower_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_234oiosinl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiAlphaLower_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24177,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_234oiosinl(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24177);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24178);assertTrue(CharUtils.isAsciiAlphaLower('a'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24179);assertFalse(CharUtils.isAsciiAlphaLower('A'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24180);assertFalse(CharUtils.isAsciiAlphaLower('3'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24181);assertFalse(CharUtils.isAsciiAlphaLower('-'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24182);assertFalse(CharUtils.isAsciiAlphaLower('\n'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24183);assertFalse(CharUtils.isAsciiAlphaLower(CHAR_COPY));
       
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24184);for (int i = 0; (((i < 196)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24185)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24186)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24187);if ((((i >= 'a' && i <= 'z')&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24188)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24189)==0&false))) {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24190);assertTrue(CharUtils.isAsciiAlphaLower((char) i));
            } }else {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24191);assertFalse(CharUtils.isAsciiAlphaLower((char) i));
            }
        }}
    }}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiNumeric_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yd48v8io0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiNumeric_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24192,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yd48v8io0(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24192);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24193);assertFalse(CharUtils.isAsciiNumeric('a'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24194);assertFalse(CharUtils.isAsciiNumeric('A'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24195);assertTrue(CharUtils.isAsciiNumeric('3'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24196);assertFalse(CharUtils.isAsciiNumeric('-'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24197);assertFalse(CharUtils.isAsciiNumeric('\n'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24198);assertFalse(CharUtils.isAsciiNumeric(CHAR_COPY));
       
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24199);for (int i = 0; (((i < 196)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24200)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24201)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24202);if ((((i >= '0' && i <= '9')&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24203)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24204)==0&false))) {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24205);assertTrue(CharUtils.isAsciiNumeric((char) i));
            } }else {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24206);assertFalse(CharUtils.isAsciiNumeric((char) i));
            }
        }}
    }}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
    @Test
    public void testIsAsciiAlphanumeric_char() {__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceStart(getClass().getName(),24207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21hdurciof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ii3ii3l3lqxtmg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharUtilsTest.testIsAsciiAlphanumeric_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24207,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21hdurciof(){try{__CLR4_1_2ii3ii3l3lqxtmg.R.inc(24207);
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24208);assertTrue(CharUtils.isAsciiAlphanumeric('a'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24209);assertTrue(CharUtils.isAsciiAlphanumeric('A'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24210);assertTrue(CharUtils.isAsciiAlphanumeric('3'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24211);assertFalse(CharUtils.isAsciiAlphanumeric('-'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24212);assertFalse(CharUtils.isAsciiAlphanumeric('\n'));
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24213);assertFalse(CharUtils.isAsciiAlphanumeric(CHAR_COPY));
       
        __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24214);for (int i = 0; (((i < 196)&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24215)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24216)==0&false)); i++) {{
            __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24217);if (((((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z') || (i >= '0' && i <= '9'))&&(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24218)!=0|true))||(__CLR4_1_2ii3ii3l3lqxtmg.R.iget(24219)==0&false))) {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24220);assertTrue(CharUtils.isAsciiAlphanumeric((char) i));
            } }else {{
                __CLR4_1_2ii3ii3l3lqxtmg.R.inc(24221);assertFalse(CharUtils.isAsciiAlphanumeric((char) i));
            }
        }}
    }}finally{__CLR4_1_2ii3ii3l3lqxtmg.R.flushNeeded();}}
    
}
