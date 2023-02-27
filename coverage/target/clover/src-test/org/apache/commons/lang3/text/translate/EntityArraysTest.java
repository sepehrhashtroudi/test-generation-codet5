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

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.translate.EntityArrays}.
 * @version $Id$
 */
public class EntityArraysTest  {static class __CLR4_1_2vzlvzll3lqxv1l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,41489,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructorExists() {__CLR4_1_2vzlvzll3lqxv1l.R.globalSliceStart(getClass().getName(),41457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21fvlx1vzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vzlvzll3lqxv1l.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vzlvzll3lqxv1l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.EntityArraysTest.testConstructorExists",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41457,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21fvlx1vzl(){try{__CLR4_1_2vzlvzll3lqxv1l.R.inc(41457);
        __CLR4_1_2vzlvzll3lqxv1l.R.inc(41458);new EntityArrays();
    }finally{__CLR4_1_2vzlvzll3lqxv1l.R.flushNeeded();}}
    
    // LANG-659 - check arrays for duplicate entries
    @Test
    public void testHTML40_EXTENDED_ESCAPE(){__CLR4_1_2vzlvzll3lqxv1l.R.globalSliceStart(getClass().getName(),41459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mewrq0vzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vzlvzll3lqxv1l.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vzlvzll3lqxv1l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.EntityArraysTest.testHTML40_EXTENDED_ESCAPE",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41459,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mewrq0vzn(){try{__CLR4_1_2vzlvzll3lqxv1l.R.inc(41459);
        __CLR4_1_2vzlvzll3lqxv1l.R.inc(41460);final Set<String> col0 = new HashSet<String>();
        __CLR4_1_2vzlvzll3lqxv1l.R.inc(41461);final Set<String> col1 = new HashSet<String>();
        __CLR4_1_2vzlvzll3lqxv1l.R.inc(41462);final String [][] sa = EntityArrays.HTML40_EXTENDED_ESCAPE();
        __CLR4_1_2vzlvzll3lqxv1l.R.inc(41463);for(int i =0; (((i <sa.length)&&(__CLR4_1_2vzlvzll3lqxv1l.R.iget(41464)!=0|true))||(__CLR4_1_2vzlvzll3lqxv1l.R.iget(41465)==0&false)); i++){{
            __CLR4_1_2vzlvzll3lqxv1l.R.inc(41466);assertTrue("Already added entry 0: "+i+" "+sa[i][0],col0.add(sa[i][0]));
            __CLR4_1_2vzlvzll3lqxv1l.R.inc(41467);assertTrue("Already added entry 1: "+i+" "+sa[i][1],col1.add(sa[i][1]));
        }
    }}finally{__CLR4_1_2vzlvzll3lqxv1l.R.flushNeeded();}}
    
   // LANG-658 - check arrays for duplicate entries
    @Test
    public void testISO8859_1_ESCAPE(){__CLR4_1_2vzlvzll3lqxv1l.R.globalSliceStart(getClass().getName(),41468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pg8e2mvzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vzlvzll3lqxv1l.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vzlvzll3lqxv1l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.EntityArraysTest.testISO8859_1_ESCAPE",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41468,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pg8e2mvzw(){try{__CLR4_1_2vzlvzll3lqxv1l.R.inc(41468);
        __CLR4_1_2vzlvzll3lqxv1l.R.inc(41469);final Set<String> col0 = new HashSet<String>();
        __CLR4_1_2vzlvzll3lqxv1l.R.inc(41470);final Set<String> col1 = new HashSet<String>();
        __CLR4_1_2vzlvzll3lqxv1l.R.inc(41471);final String [][] sa = EntityArrays.ISO8859_1_ESCAPE();
        __CLR4_1_2vzlvzll3lqxv1l.R.inc(41472);boolean success = true;
        __CLR4_1_2vzlvzll3lqxv1l.R.inc(41473);for(int i =0; (((i <sa.length)&&(__CLR4_1_2vzlvzll3lqxv1l.R.iget(41474)!=0|true))||(__CLR4_1_2vzlvzll3lqxv1l.R.iget(41475)==0&false)); i++){{
            __CLR4_1_2vzlvzll3lqxv1l.R.inc(41476);final boolean add0 = col0.add(sa[i][0]);
            __CLR4_1_2vzlvzll3lqxv1l.R.inc(41477);final boolean add1 = col1.add(sa[i][1]);
            __CLR4_1_2vzlvzll3lqxv1l.R.inc(41478);if ((((!add0)&&(__CLR4_1_2vzlvzll3lqxv1l.R.iget(41479)!=0|true))||(__CLR4_1_2vzlvzll3lqxv1l.R.iget(41480)==0&false))) {{ 
                __CLR4_1_2vzlvzll3lqxv1l.R.inc(41481);success = false;
                __CLR4_1_2vzlvzll3lqxv1l.R.inc(41482);System.out.println("Already added entry 0: "+i+" "+sa[i][0]+" "+sa[i][1]);
            }
            }__CLR4_1_2vzlvzll3lqxv1l.R.inc(41483);if ((((!add1)&&(__CLR4_1_2vzlvzll3lqxv1l.R.iget(41484)!=0|true))||(__CLR4_1_2vzlvzll3lqxv1l.R.iget(41485)==0&false))) {{
                __CLR4_1_2vzlvzll3lqxv1l.R.inc(41486);success = false;
                __CLR4_1_2vzlvzll3lqxv1l.R.inc(41487);System.out.println("Already added entry 1: "+i+" "+sa[i][0]+" "+sa[i][1]);
            }
        }}
        }__CLR4_1_2vzlvzll3lqxv1l.R.inc(41488);assertTrue("One or more errors detected",success);
    }finally{__CLR4_1_2vzlvzll3lqxv1l.R.flushNeeded();}}
    
    
}
