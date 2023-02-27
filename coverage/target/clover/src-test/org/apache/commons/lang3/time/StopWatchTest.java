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
package org.apache.commons.lang3.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Assert;

import org.junit.Test;

/**
 * TestCase for StopWatch.
 *
 * @version $Id$
 */
public class StopWatchTest  {static class __CLR4_1_2xz8xz8l3lqxv9h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,44158,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testStopWatchSimple(){__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceStart(getClass().getName(),44036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29307ucxz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xz8xz8l3lqxv9h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testStopWatchSimple",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44036,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29307ucxz8(){try{__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44036);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44037);final StopWatch watch = new StopWatch();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44038);watch.start();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44039);try {__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44040);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44041);watch.stop();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44042);final long time = watch.getTime();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44043);assertEquals(time, watch.getTime());
        
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44044);assertTrue(time >= 500);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44045);assertTrue(time < 700);
        
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44046);watch.reset();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44047);assertEquals(0, watch.getTime());
    }finally{__CLR4_1_2xz8xz8l3lqxv9h.R.flushNeeded();}}
    
    @Test
    public void testStopWatchSimpleGet(){__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceStart(getClass().getName(),44048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qb6574xzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xz8xz8l3lqxv9h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testStopWatchSimpleGet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44048,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qb6574xzk(){try{__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44048);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44049);final StopWatch watch = new StopWatch();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44050);assertEquals(0, watch.getTime());
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44051);assertEquals("0:00:00.000", watch.toString());
        
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44052);watch.start();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44053);try {__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44054);Thread.sleep(500);} catch (final InterruptedException ex) {}
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44055);assertTrue(watch.getTime() < 2000);
    }finally{__CLR4_1_2xz8xz8l3lqxv9h.R.flushNeeded();}}
    
    @Test
    public void testStopWatchSplit(){__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceStart(getClass().getName(),44056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aart4qxzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xz8xz8l3lqxv9h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testStopWatchSplit",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44056,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aart4qxzs(){try{__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44056);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44057);final StopWatch watch = new StopWatch();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44058);watch.start();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44059);try {__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44060);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44061);watch.split();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44062);final long splitTime = watch.getSplitTime();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44063);final String splitStr = watch.toSplitString();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44064);try {__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44065);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44066);watch.unsplit();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44067);try {__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44068);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44069);watch.stop();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44070);final long totalTime = watch.getTime();

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44071);assertEquals("Formatted split string not the correct length", 
                     splitStr.length(), 11);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44072);assertTrue(splitTime >= 500);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44073);assertTrue(splitTime < 700);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44074);assertTrue(totalTime >= 1500);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44075);assertTrue(totalTime < 1900);
    }finally{__CLR4_1_2xz8xz8l3lqxv9h.R.flushNeeded();}}
    
    @Test
    public void testStopWatchSuspend(){__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceStart(getClass().getName(),44076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n1sciwy0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xz8xz8l3lqxv9h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testStopWatchSuspend",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44076,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n1sciwy0c(){try{__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44076);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44077);final StopWatch watch = new StopWatch();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44078);watch.start();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44079);try {__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44080);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44081);watch.suspend();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44082);final long suspendTime = watch.getTime();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44083);try {__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44084);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44085);watch.resume();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44086);try {__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44087);Thread.sleep(550);} catch (final InterruptedException ex) {}
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44088);watch.stop();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44089);final long totalTime = watch.getTime();
        
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44090);assertTrue(suspendTime >= 500);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44091);assertTrue(suspendTime < 700);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44092);assertTrue(totalTime >= 1000);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44093);assertTrue(totalTime < 1300);
    }finally{__CLR4_1_2xz8xz8l3lqxv9h.R.flushNeeded();}}

    @Test
    public void testLang315() {__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceStart(getClass().getName(),44094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sek6g2y0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xz8xz8l3lqxv9h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testLang315",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44094,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sek6g2y0u(){try{__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44094);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44095);final StopWatch watch = new StopWatch();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44096);watch.start();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44097);try {__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44098);Thread.sleep(200);} catch (final InterruptedException ex) {}
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44099);watch.suspend();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44100);final long suspendTime = watch.getTime();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44101);try {__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44102);Thread.sleep(200);} catch (final InterruptedException ex) {}
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44103);watch.stop();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44104);final long totalTime = watch.getTime();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44105);assertTrue( suspendTime == totalTime );
    }finally{__CLR4_1_2xz8xz8l3lqxv9h.R.flushNeeded();}}

    // test bad states
    @Test
    public void testBadStates() {__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceStart(getClass().getName(),44106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b6e6p0y16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xz8xz8l3lqxv9h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testBadStates",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44106,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b6e6p0y16(){try{__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44106);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44107);final StopWatch watch = new StopWatch();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44108);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44109);watch.stop();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44110);fail("Calling stop on an unstarted StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44111);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44112);watch.stop();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44113);fail("Calling stop on an unstarted StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44114);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44115);watch.suspend();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44116);fail("Calling suspend on an unstarted StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44117);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44118);watch.split();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44119);fail("Calling split on a non-running StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44120);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44121);watch.unsplit();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44122);fail("Calling unsplit on an unsplit StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44123);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44124);watch.resume();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44125);fail("Calling resume on an unsuspended StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44126);watch.start();

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44127);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44128);watch.start();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44129);fail("Calling start on a started StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44130);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44131);watch.unsplit();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44132);fail("Calling unsplit on an unsplit StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44133);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44134);watch.getSplitTime();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44135);fail("Calling getSplitTime on an unsplit StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44136);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44137);watch.resume();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44138);fail("Calling resume on an unsuspended StopWatch should throw an exception. ");
        } catch(final IllegalStateException ise) {
            // expected
        }

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44139);watch.stop();

        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44140);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44141);watch.start();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44142);fail("Calling start on a stopped StopWatch should throw an exception as it needs to be reset. ");
        } catch(final IllegalStateException ise) {
            // expected
        }
    }finally{__CLR4_1_2xz8xz8l3lqxv9h.R.flushNeeded();}}

    @Test
    public void testGetStartTime() {__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceStart(getClass().getName(),44143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2emi6giy27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xz8xz8l3lqxv9h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xz8xz8l3lqxv9h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.StopWatchTest.testGetStartTime",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44143,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2emi6giy27(){try{__CLR4_1_2xz8xz8l3lqxv9h.R.inc(44143);
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44144);final long beforeStopWatch = System.currentTimeMillis();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44145);final StopWatch watch = new StopWatch();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44146);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44147);watch.getStartTime();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44148);fail("Calling getStartTime on an unstarted StopWatch should throw an exception");
        } catch (final IllegalStateException expected) {
            // expected
        }
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44149);watch.start();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44150);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44151);watch.getStartTime();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44152);Assert.assertTrue(watch.getStartTime() >= beforeStopWatch);
        } catch (final IllegalStateException ex) {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44153);fail("Start time should be available: " + ex.getMessage());
        }
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44154);watch.reset();
        __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44155);try {
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44156);watch.getStartTime();
            __CLR4_1_2xz8xz8l3lqxv9h.R.inc(44157);fail("Calling getStartTime on a reset, but unstarted StopWatch should throw an exception");
        } catch (final IllegalStateException expected) {
            // expected
        }
    }finally{__CLR4_1_2xz8xz8l3lqxv9h.R.flushNeeded();}}

}
