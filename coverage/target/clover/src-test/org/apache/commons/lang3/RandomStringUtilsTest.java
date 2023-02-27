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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Random;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.RandomStringUtils}.
 *
 * @version $Id$
 */
public class RandomStringUtilsTest {static class __CLR4_1_2kf2kf2l3lqxtxf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,26608,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceStart(getClass().getName(),26462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hkf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kf2kf2l3lqxtxf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26462,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hkf2(){try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26462);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26463);assertNotNull(new RandomStringUtils());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26464);final Constructor<?>[] cons = RandomStringUtils.class.getDeclaredConstructors();
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26465);assertEquals(1, cons.length);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26466);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26467);assertTrue(Modifier.isPublic(RandomStringUtils.class.getModifiers()));
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26468);assertFalse(Modifier.isFinal(RandomStringUtils.class.getModifiers()));
    }finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Test the implementation
     */
    @Test
    public void testRandomStringUtils() {__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceStart(getClass().getName(),26469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_222a85ukf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kf2kf2l3lqxtxf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomStringUtils",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26469,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_222a85ukf9(){try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26469);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26470);String r1 = RandomStringUtils.random(50);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26471);assertEquals("random(50) length", 50, r1.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26472);String r2 = RandomStringUtils.random(50);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26473);assertEquals("random(50) length", 50, r2.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26474);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26475);r1 = RandomStringUtils.randomAscii(50);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26476);assertEquals("randomAscii(50) length", 50, r1.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26477);for(int i = 0; (((i < r1.length())&&(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26478)!=0|true))||(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26479)==0&false)); i++) {{
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26480);assertTrue("char between 32 and 127", r1.charAt(i) >= 32 && r1.charAt(i) <= 127);
        }        
        }__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26481);r2 = RandomStringUtils.randomAscii(50);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26482);assertTrue("!r1.equals(r2)", !r1.equals(r2));

        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26483);r1 = RandomStringUtils.randomAlphabetic(50);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26484);assertEquals("randomAlphabetic(50)", 50, r1.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26485);for(int i = 0; (((i < r1.length())&&(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26486)!=0|true))||(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26487)==0&false)); i++) {{
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26488);assertTrue("r1 contains alphabetic", Character.isLetter(r1.charAt(i)) && !Character.isDigit(r1.charAt(i)));
        }
        }__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26489);r2 = RandomStringUtils.randomAlphabetic(50);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26490);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26491);r1 = RandomStringUtils.randomAlphanumeric(50);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26492);assertEquals("randomAlphanumeric(50)", 50, r1.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26493);for(int i = 0; (((i < r1.length())&&(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26494)!=0|true))||(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26495)==0&false)); i++) {{
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26496);assertTrue("r1 contains alphanumeric", Character.isLetterOrDigit(r1.charAt(i)));
        }
        }__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26497);r2 = RandomStringUtils.randomAlphabetic(50);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26498);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26499);r1 = RandomStringUtils.randomNumeric(50);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26500);assertEquals("randomNumeric(50)", 50, r1.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26501);for(int i = 0; (((i < r1.length())&&(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26502)!=0|true))||(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26503)==0&false)); i++) {{
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26504);assertTrue("r1 contains numeric", Character.isDigit(r1.charAt(i)) && !Character.isLetter(r1.charAt(i)));
        }
        }__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26505);r2 = RandomStringUtils.randomNumeric(50);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26506);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26507);String set = "abcdefg";
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26508);r1 = RandomStringUtils.random(50, set);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26509);assertEquals("random(50, \"abcdefg\")", 50, r1.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26510);for(int i = 0; (((i < r1.length())&&(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26511)!=0|true))||(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26512)==0&false)); i++) {{
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26513);assertTrue("random char in set", set.indexOf(r1.charAt(i)) > -1);
        }
        }__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26514);r2 = RandomStringUtils.random(50, set);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26515);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26516);r1 = RandomStringUtils.random(50, (String) null);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26517);assertEquals("random(50) length", 50, r1.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26518);r2 = RandomStringUtils.random(50, (String) null);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26519);assertEquals("random(50) length", 50, r2.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26520);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26521);set = "stuvwxyz";
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26522);r1 = RandomStringUtils.random(50, set.toCharArray());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26523);assertEquals("random(50, \"stuvwxyz\")", 50, r1.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26524);for(int i = 0; (((i < r1.length())&&(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26525)!=0|true))||(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26526)==0&false)); i++) {{
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26527);assertTrue("random char in set", set.indexOf(r1.charAt(i)) > -1);
        }
        }__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26528);r2 = RandomStringUtils.random(50, set);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26529);assertTrue("!r1.equals(r2)", !r1.equals(r2));
        
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26530);r1 = RandomStringUtils.random(50, (char[]) null);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26531);assertEquals("random(50) length", 50, r1.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26532);r2 = RandomStringUtils.random(50, (char[]) null);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26533);assertEquals("random(50) length", 50, r2.length());
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26534);assertTrue("!r1.equals(r2)", !r1.equals(r2));

        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26535);final long seed = System.currentTimeMillis();
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26536);r1 = RandomStringUtils.random(50,0,0,true,true,null,new Random(seed));
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26537);r2 = RandomStringUtils.random(50,0,0,true,true,null,new Random(seed));
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26538);assertEquals("r1.equals(r2)", r1, r2);

        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26539);r1 = RandomStringUtils.random(0);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26540);assertEquals("random(0).equals(\"\")", "", r1);
    }finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}

    @Test
    public void testLANG805() {__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceStart(getClass().getName(),26541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m2wqjokh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kf2kf2l3lqxtxf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testLANG805",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26541,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m2wqjokh9(){try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26541);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26542);final long seed = System.currentTimeMillis();
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26543);assertEquals("aaa", RandomStringUtils.random(3,0,0,false,false,new char[]{'a'},new Random(seed)));
    }finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}

    @Test
    public void testLANG807() {__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceStart(getClass().getName(),26544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2skwo4mkhc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kf2kf2l3lqxtxf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testLANG807",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26544,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2skwo4mkhc(){try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26544);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26545);try {
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26546);RandomStringUtils.random(3,5,5,false,false);
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26547);fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException ex) { // distinguish from Random#nextInt message
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26548);final String msg = ex.getMessage();
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26549);assertTrue("Message (" + msg + ") must contain 'start'", msg.contains("start"));
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26550);assertTrue("Message (" + msg + ") must contain 'end'", msg.contains("end"));
        }
    }finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}

    @Test
    public void testExceptions() {__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceStart(getClass().getName(),26551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tx2tdvkhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kf2kf2l3lqxtxf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testExceptions",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26551,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tx2tdvkhj(){try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26551);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26552);final char[] DUMMY = new char[]{'a'}; // valid char array
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26553);try {
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26554);RandomStringUtils.random(-1);
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26555);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26556);try {
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26557);RandomStringUtils.random(-1, true, true);
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26558);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26559);try {
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26560);RandomStringUtils.random(-1, DUMMY);
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26561);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26562);try {
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26563);RandomStringUtils.random(1, new char[0]); // must not provide empty array => IAE
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26564);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26565);try {
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26566);RandomStringUtils.random(-1, "");
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26567);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26568);try {
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26569);RandomStringUtils.random(-1, (String)null);
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26570);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26571);try {
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26572);RandomStringUtils.random(-1, 'a', 'z', false, false);
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26573);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26574);try {
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26575);RandomStringUtils.random(-1, 'a', 'z', false, false, DUMMY);
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26576);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26577);try {
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26578);RandomStringUtils.random(-1, 'a', 'z', false, false, DUMMY, new Random());
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26579);fail();
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}
    
    /**
     * Make sure boundary alphanumeric characters are generated by randomAlphaNumeric
     * This test will fail randomly with probability = 6 * (61/62)**1000 ~ 5.2E-7
     */  
    @Test
    public void testRandomAlphaNumeric() {__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceStart(getClass().getName(),26580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n3n9atkic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kf2kf2l3lqxtxf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomAlphaNumeric",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26580,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n3n9atkic(){try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26580);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testRandomAlphaNumeric() {
//         final char[] testChars = {'a', 'z', 'A', 'Z', '0', '9'};
//         final boolean[] found = {false, false, false, false, false, false};
//         for (int i = 0; i < 100; i++) {
//             final String randString = RandomStringUtils.randomAlphanumeric(10);
//             for (int j = 0; j < testChars.length; j++) {
//                 if (randString.indexOf(testChars[j]) > 0) {
//                     found[j] = true;
//                 }
//             }
//         }
//         for (int i = 0; i < testChars.length; i++) {
//             if (!found[i]) {
//                 fail("alphanumeric character not generated in 1000 attempts: " 
//                    + testChars[i] +" -- repeated failures indicate a problem ");
//             }
//         }
//     }
    
    /**
     * Make sure '0' and '9' are generated by randomNumeric
     * This test will fail randomly with probability = 2 * (9/10)**1000 ~ 3.5E-46
     */  
    @Test
    public void testRandomNumeric() {__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceStart(getClass().getName(),26581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22jp47zkid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kf2kf2l3lqxtxf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomNumeric",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26581,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22jp47zkid(){try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26581);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testRandomNumeric() {
//         final char[] testChars = {'0','9'};
//         final boolean[] found = {false, false};
//         for (int i = 0; i < 100; i++) {
//             final String randString = RandomStringUtils.randomNumeric(10);
//             for (int j = 0; j < testChars.length; j++) {
//                 if (randString.indexOf(testChars[j]) > 0) {
//                     found[j] = true;
//                 }
//             }
//         }
//         for (int i = 0; i < testChars.length; i++) {
//             if (!found[i]) {
//                 fail("digit not generated in 1000 attempts: " 
//                    + testChars[i] +" -- repeated failures indicate a problem ");
//             }
//         }  
//     }
    
    /**
     * Make sure boundary alpha characters are generated by randomAlphabetic
     * This test will fail randomly with probability = 4 * (51/52)**1000 ~ 1.58E-8
     */  
    @Test
    public void testRandomAlphabetic() {__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceStart(getClass().getName(),26582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cyhp3rkie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kf2kf2l3lqxtxf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomAlphabetic",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26582,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cyhp3rkie(){try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26582);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testRandomAlphabetic() {
//         final char[] testChars = {'a', 'z', 'A', 'Z'};
//         final boolean[] found = {false, false, false, false};
//         for (int i = 0; i < 100; i++) {
//             final String randString = RandomStringUtils.randomAlphabetic(10);
//             for (int j = 0; j < testChars.length; j++) {
//                 if (randString.indexOf(testChars[j]) > 0) {
//                     found[j] = true;
//                 }
//             }
//         }
//         for (int i = 0; i < testChars.length; i++) {
//             if (!found[i]) {
//                 fail("alphanumeric character not generated in 1000 attempts: " 
//                    + testChars[i] +" -- repeated failures indicate a problem ");
//             }
//         }
//     }
    
    /**
     * Make sure 32 and 127 are generated by randomNumeric
     * This test will fail randomly with probability = 2*(95/96)**1000 ~ 5.7E-5
     */  
    @Test
    public void testRandomAscii() {__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceStart(getClass().getName(),26583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lnkafxkif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kf2kf2l3lqxtxf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomAscii",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26583,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lnkafxkif(){try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26583);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testRandomAscii() {
//         final char[] testChars = {(char) 32, (char) 126};
//         final boolean[] found = {false, false};
//         for (int i = 0; i < 100; i++) {
//             final String randString = RandomStringUtils.randomAscii(10);
//             for (int j = 0; j < testChars.length; j++) {
//                 if (randString.indexOf(testChars[j]) > 0) {
//                     found[j] = true;
//                 }
//             }
//         }
//         for (int i = 0; i < testChars.length; i++) {
//             if (!found[i]) {
//                 fail("ascii character not generated in 1000 attempts: " 
//                 + (int) testChars[i] + 
//                  " -- repeated failures indicate a problem");
//             }
//         }  
//     }
    
    /** 
     * Test homogeneity of random strings generated --
     * i.e., test that characters show up with expected frequencies
     * in generated strings.  Will fail randomly about 1 in 1000 times.
     * Repeated failures indicate a problem.
     */
    @Test
    public void testRandomStringUtilsHomog() {__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceStart(getClass().getName(),26584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26bn9nqkig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kf2kf2l3lqxtxf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testRandomStringUtilsHomog",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26584,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26bn9nqkig(){try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26584);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testRandomStringUtilsHomog() {
//         final String set = "abc";
//         final char[] chars = set.toCharArray();
//         String gen = "";
//         final int[] counts = {0,0,0};
//         final int[] expected = {200,200,200};
//         for (int i = 0; i< 100; i++) {
//            gen = RandomStringUtils.random(6,chars);
//            for (int j = 0; j < 6; j++) {
//                switch (gen.charAt(j)) {
//                    case 'a': {counts[0]++; break;}
//                    case 'b': {counts[1]++; break;}
//                    case 'c': {counts[2]++; break;}
//                    default: {fail("generated character not in set");}
//                }
//            }
//         } 
//         // Perform chi-square test with df = 3-1 = 2, testing at .001 level
//         assertTrue("test homogeneity -- will fail about 1 in 1000 times",
//             chiSquare(expected,counts) < 13.82);  
//     }
    
    /**
     * Computes Chi-Square statistic given observed and expected counts
     * @param observed array of observed frequency counts
     * @param expected array of expected frequency counts
     */
    private double chiSquare(final int[] expected, final int[] observed) {try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26585);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26586);double sumSq = 0.0d;
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26587);double dev = 0.0d;
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26588);for (int i = 0; (((i < observed.length)&&(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26589)!=0|true))||(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26590)==0&false)); i++) {{
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26591);dev = observed[i] - expected[i];
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26592);sumSq += dev * dev / expected[i];
        }
        }__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26593);return sumSq;
    }finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}           

    /**
     * Checks if the string got by {@link RandomStringUtils#random(int)}
     * can be converted to UTF-8 and back without loss.
     *
     * @see <a href="http://issues.apache.org/jira/browse/LANG-100">LANG-100</a>
     *
     * @throws Exception
     */
    @Test
    public void testLang100() throws Exception {__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceStart(getClass().getName(),26594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xeirckiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kf2kf2l3lqxtxf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kf2kf2l3lqxtxf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RandomStringUtilsTest.testLang100",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26594,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xeirckiq() throws Exception{try{__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26594);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26595);final int size = 5000;
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26596);final String encoding = "UTF-8";
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26597);final String orig = RandomStringUtils.random(size);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26598);final byte[] bytes = orig.getBytes(encoding);
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26599);final String copy = new String(bytes, encoding);

        // for a verbose compare:
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26600);for (int i=0; (((i < orig.length() && i < copy.length())&&(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26601)!=0|true))||(__CLR4_1_2kf2kf2l3lqxtxf.R.iget(26602)==0&false)); i++) {{
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26603);final char o = orig.charAt(i);
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26604);final char c = copy.charAt(i);
            __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26605);assertEquals("differs at " + i + "(" + Integer.toHexString(new Character(o).hashCode()) + "," +
            Integer.toHexString(new Character(c).hashCode()) + ")", o, c);
        }
        // compare length also
        }__CLR4_1_2kf2kf2l3lqxtxf.R.inc(26606);assertEquals(orig.length(), copy.length());
        // just to be complete
        __CLR4_1_2kf2kf2l3lqxtxf.R.inc(26607);assertEquals(orig, copy);
    }finally{__CLR4_1_2kf2kf2l3lqxtxf.R.flushNeeded();}}
}

