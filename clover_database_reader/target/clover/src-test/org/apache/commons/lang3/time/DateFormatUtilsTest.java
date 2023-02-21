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

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * TestCase for DateFormatUtils.
 *
 */
public class DateFormatUtilsTest {static class __CLR4_1_2w3kw3kl3lqxv2c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,41724,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceStart(getClass().getName(),41600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hw3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w3kw3kl3lqxv2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41600,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hw3k(){try{__CLR4_1_2w3kw3kl3lqxv2c.R.inc(41600);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41601);assertNotNull(new DateFormatUtils());
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41602);final Constructor<?>[] cons = DateFormatUtils.class.getDeclaredConstructors();
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41603);assertEquals(1, cons.length);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41604);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41605);assertTrue(Modifier.isPublic(DateFormatUtils.class.getModifiers()));
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41606);assertFalse(Modifier.isFinal(DateFormatUtils.class.getModifiers()));
    }finally{__CLR4_1_2w3kw3kl3lqxv2c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testFormat() {__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceStart(getClass().getName(),41607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27ezusww3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w3kw3kl3lqxv2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testFormat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41607,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27ezusww3r(){try{__CLR4_1_2w3kw3kl3lqxv2c.R.inc(41607);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41608);final Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41609);c.set(2005,0,1,12,0,0);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41610);c.setTimeZone(TimeZone.getDefault());
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41611);final StringBuilder buffer = new StringBuilder ();
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41612);final int year = c.get(Calendar.YEAR);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41613);final int month = c.get(Calendar.MONTH) + 1;
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41614);final int day = c.get(Calendar.DAY_OF_MONTH);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41615);final int hour = c.get(Calendar.HOUR_OF_DAY);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41616);buffer.append (year);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41617);buffer.append(month);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41618);buffer.append(day);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41619);buffer.append(hour);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41620);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime(), "yyyyMdH"));
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41621);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime().getTime(), "yyyyMdH"));
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41622);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime(), "yyyyMdH", Locale.US));
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41623);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime().getTime(), "yyyyMdH", Locale.US));
    }finally{__CLR4_1_2w3kw3kl3lqxv2c.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testFormatCalendar() {__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceStart(getClass().getName(),41624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fxrimqw48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w3kw3kl3lqxv2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testFormatCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41624,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fxrimqw48(){try{__CLR4_1_2w3kw3kl3lqxv2c.R.inc(41624);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41625);final Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41626);c.set(2005,0,1,12,0,0);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41627);c.setTimeZone(TimeZone.getDefault());
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41628);final StringBuilder buffer = new StringBuilder ();
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41629);final int year = c.get(Calendar.YEAR);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41630);final int month = c.get(Calendar.MONTH) + 1;
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41631);final int day = c.get(Calendar.DAY_OF_MONTH);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41632);final int hour = c.get(Calendar.HOUR_OF_DAY);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41633);buffer.append (year);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41634);buffer.append(month);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41635);buffer.append(day);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41636);buffer.append(hour);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41637);assertEquals(buffer.toString(), DateFormatUtils.format(c, "yyyyMdH"));
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41638);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime(), "yyyyMdH"));
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41639);assertEquals(buffer.toString(), DateFormatUtils.format(c, "yyyyMdH", Locale.US));
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41640);assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime(), "yyyyMdH", Locale.US));
    }finally{__CLR4_1_2w3kw3kl3lqxv2c.R.flushNeeded();}}
    
    @Test
    public void testFormatUTC() {__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceStart(getClass().getName(),41641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tnw5emw4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w3kw3kl3lqxv2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testFormatUTC",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41641,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tnw5emw4p(){try{__CLR4_1_2w3kw3kl3lqxv2c.R.inc(41641);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41642);final Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41643);c.set(2005,0,1,12,0,0);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41644);assertEquals ("2005-01-01T12:00:00", DateFormatUtils.formatUTC(c.getTime(), DateFormatUtils.ISO_DATETIME_FORMAT.getPattern()));
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41645);assertEquals ("2005-01-01T12:00:00", DateFormatUtils.formatUTC(c.getTime().getTime(), DateFormatUtils.ISO_DATETIME_FORMAT.getPattern()));
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41646);assertEquals ("2005-01-01T12:00:00", DateFormatUtils.formatUTC(c.getTime(), DateFormatUtils.ISO_DATETIME_FORMAT.getPattern(), Locale.US));
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41647);assertEquals ("2005-01-01T12:00:00", DateFormatUtils.formatUTC(c.getTime().getTime(), DateFormatUtils.ISO_DATETIME_FORMAT.getPattern(), Locale.US));
    }finally{__CLR4_1_2w3kw3kl3lqxv2c.R.flushNeeded();}}
    
    @Test
    public void testDateTimeISO(){__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceStart(getClass().getName(),41648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2henqynw4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w3kw3kl3lqxv2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testDateTimeISO",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41648,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2henqynw4w(){try{__CLR4_1_2w3kw3kl3lqxv2c.R.inc(41648);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41649);final TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41650);final Calendar cal = Calendar.getInstance(timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41651);cal.set(2002,1,23,9,11,12);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41652);String text = DateFormatUtils.format(cal.getTime(), 
                        DateFormatUtils.ISO_DATETIME_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41653);assertEquals("2002-02-23T09:11:12", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41654);text = DateFormatUtils.format(cal.getTime().getTime(), 
                      DateFormatUtils.ISO_DATETIME_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41655);assertEquals("2002-02-23T09:11:12", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41656);text = DateFormatUtils.ISO_DATETIME_FORMAT.format(cal);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41657);assertEquals("2002-02-23T09:11:12", text);
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41658);text = DateFormatUtils.format(cal.getTime(), 
                      DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41659);assertEquals("2002-02-23T09:11:12-03:00", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41660);text = DateFormatUtils.format(cal.getTime().getTime(), 
                      DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41661);assertEquals("2002-02-23T09:11:12-03:00", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41662);text = DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(cal);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41663);assertEquals("2002-02-23T09:11:12-03:00", text);
    }finally{__CLR4_1_2w3kw3kl3lqxv2c.R.flushNeeded();}}

    @Test
    public void testDateISO(){__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceStart(getClass().getName(),41664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21ysgusw5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w3kw3kl3lqxv2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testDateISO",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41664,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21ysgusw5c(){try{__CLR4_1_2w3kw3kl3lqxv2c.R.inc(41664);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41665);final TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41666);final Calendar cal = Calendar.getInstance(timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41667);cal.set(2002,1,23,10,11,12);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41668);String text = DateFormatUtils.format(cal.getTime(), 
                        DateFormatUtils.ISO_DATE_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41669);assertEquals("2002-02-23", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41670);text = DateFormatUtils.format(cal.getTime().getTime(), 
                        DateFormatUtils.ISO_DATE_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41671);assertEquals("2002-02-23", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41672);text = DateFormatUtils.ISO_DATE_FORMAT.format(cal);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41673);assertEquals("2002-02-23", text);
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41674);text = DateFormatUtils.format(cal.getTime(), 
                      DateFormatUtils.ISO_DATE_TIME_ZONE_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41675);assertEquals("2002-02-23-03:00", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41676);text = DateFormatUtils.format(cal.getTime().getTime(), 
                      DateFormatUtils.ISO_DATE_TIME_ZONE_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41677);assertEquals("2002-02-23-03:00", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41678);text = DateFormatUtils.ISO_DATE_TIME_ZONE_FORMAT.format(cal);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41679);assertEquals("2002-02-23-03:00", text);
    }finally{__CLR4_1_2w3kw3kl3lqxv2c.R.flushNeeded();}}

    @Test
    public void testTimeISO(){__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceStart(getClass().getName(),41680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2h7ca31w5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w3kw3kl3lqxv2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testTimeISO",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41680,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2h7ca31w5s(){try{__CLR4_1_2w3kw3kl3lqxv2c.R.inc(41680);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41681);final TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41682);final Calendar cal = Calendar.getInstance(timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41683);cal.set(2002,1,23,10,11,12);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41684);String text = DateFormatUtils.format(cal.getTime(), 
                        DateFormatUtils.ISO_TIME_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41685);assertEquals("T10:11:12", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41686);text = DateFormatUtils.format(cal.getTime().getTime(), 
                        DateFormatUtils.ISO_TIME_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41687);assertEquals("T10:11:12", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41688);text = DateFormatUtils.ISO_TIME_FORMAT.format(cal);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41689);assertEquals("T10:11:12", text);
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41690);text = DateFormatUtils.format(cal.getTime(), 
                      DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41691);assertEquals("T10:11:12-03:00", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41692);text = DateFormatUtils.format(cal.getTime().getTime(), 
                      DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41693);assertEquals("T10:11:12-03:00", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41694);text = DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT.format(cal);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41695);assertEquals("T10:11:12-03:00", text);
    }finally{__CLR4_1_2w3kw3kl3lqxv2c.R.flushNeeded();}}

    @Test
    public void testTimeNoTISO(){__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceStart(getClass().getName(),41696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bdbo8w68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w3kw3kl3lqxv2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testTimeNoTISO",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41696,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bdbo8w68(){try{__CLR4_1_2w3kw3kl3lqxv2c.R.inc(41696);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41697);final TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41698);final Calendar cal = Calendar.getInstance(timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41699);cal.set(2002,1,23,10,11,12);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41700);String text = DateFormatUtils.format(cal.getTime(), 
                        DateFormatUtils.ISO_TIME_NO_T_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41701);assertEquals("10:11:12", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41702);text = DateFormatUtils.format(cal.getTime().getTime(), 
                        DateFormatUtils.ISO_TIME_NO_T_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41703);assertEquals("10:11:12", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41704);text = DateFormatUtils.ISO_TIME_NO_T_FORMAT.format(cal);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41705);assertEquals("10:11:12", text);
        
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41706);text = DateFormatUtils.format(cal.getTime(), 
                      DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41707);assertEquals("10:11:12-03:00", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41708);text = DateFormatUtils.format(cal.getTime().getTime(), 
                      DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT.getPattern(), timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41709);assertEquals("10:11:12-03:00", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41710);text = DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT.format(cal);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41711);assertEquals("10:11:12-03:00", text);
    }finally{__CLR4_1_2w3kw3kl3lqxv2c.R.flushNeeded();}}

    @Test
    public void testSMTP(){__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceStart(getClass().getName(),41712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26nzlm7w6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w3kw3kl3lqxv2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w3kw3kl3lqxv2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateFormatUtilsTest.testSMTP",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41712,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26nzlm7w6o(){try{__CLR4_1_2w3kw3kl3lqxv2c.R.inc(41712);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41713);final TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41714);final Calendar cal = Calendar.getInstance(timeZone);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41715);cal.set(2003,5,8,10,11,12);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41716);String text = DateFormatUtils.format(cal.getTime(), 
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern(), timeZone,
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getLocale());
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41717);assertEquals("Sun, 08 Jun 2003 10:11:12 -0300", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41718);text = DateFormatUtils.format(cal.getTime().getTime(), 
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern(), timeZone,
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getLocale());
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41719);assertEquals("Sun, 08 Jun 2003 10:11:12 -0300", text);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41720);text = DateFormatUtils.SMTP_DATETIME_FORMAT.format(cal);
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41721);assertEquals("Sun, 08 Jun 2003 10:11:12 -0300", text);
        
        // format UTC
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41722);text = DateFormatUtils.formatUTC(cal.getTime().getTime(), 
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern(),
                        DateFormatUtils.SMTP_DATETIME_FORMAT.getLocale());
        __CLR4_1_2w3kw3kl3lqxv2c.R.inc(41723);assertEquals("Sun, 08 Jun 2003 13:11:12 +0000", text);
    }finally{__CLR4_1_2w3kw3kl3lqxv2c.R.flushNeeded();}}

    /*
    public void testLang312() {
        String pattern = "dd/MM/yyyy";
        String expected = "19/04/1948";
        TimeZone timeZone = TimeZone.getTimeZone("CET");
        Locale locale = Locale.GERMANY;

        // show Calendar is good
        Calendar cal = Calendar.getInstance(timeZone, locale);
        cal.set(1948, 3, 19);
        assertEquals(expected, DateFormatUtils.format( cal.getTime(), pattern, timeZone, locale ) );

        Date date = new Date(48, 3, 19);

        // test JDK
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(pattern, locale);
        sdf.setTimeZone(timeZone);
// There's nothing we can do if the JDK fails, so just going to pring a warning in this case
//        assertEquals(expected, sdf.format( date ) );
        if( ! expected.equals( sdf.format( date ) ) ) {
            System.out.println("WARNING: JDK test failed - testLang312()");
        }

        // test Commons
        assertEquals(expected, DateFormatUtils.format( date, pattern, timeZone, locale ) );
    }
    */

}
