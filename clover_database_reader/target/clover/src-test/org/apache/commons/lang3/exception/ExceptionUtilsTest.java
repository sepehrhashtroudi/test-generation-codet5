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
package org.apache.commons.lang3.exception;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.List;

/**
 * Tests {@link org.apache.commons.lang3.exception.ExceptionUtils}.
 * 
 * <h3>Notes</h3>
 * <p>
 * Make sure this exception code does not depend on Java 1.4 nested exceptions. SVN revision 38990 does not compile with
 * Java 1.3.1.
 * </p>
 * <ul>
 * <li>Compiled with Sun Java 1.3.1_15</li>
 * <li>Tested with Sun Java 1.3.1_15</li>
 * <li>Tested with Sun Java 1.4.2_12</li>
 * <li>Tested with Sun Java 1.5.0_08</li>
 * <li>All of the above on Windows XP SP2 + patches.</li>
 * </ul>
 * <p>
 * Gary Gregory; August 16, 2006.
 * </p>
 * 
 * @since 1.0
 */
public class ExceptionUtilsTest {static class __CLR4_1_2qvhqvhl3lqxunb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,35113,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private NestableException nested;
    private Throwable withCause;
    private Throwable withoutCause;
    private Throwable jdkNoCause;
    private ExceptionWithCause cyclicCause;


    @Before
    public void setUp() {try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34829);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34830);withoutCause = createExceptionWithoutCause();
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34831);nested = new NestableException(withoutCause);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34832);withCause = new ExceptionWithCause(nested);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34833);jdkNoCause = new NullPointerException();
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34834);final ExceptionWithCause a = new ExceptionWithCause(null);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34835);final ExceptionWithCause b = new ExceptionWithCause(a);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34836);a.setCause(b);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34837);cyclicCause = new ExceptionWithCause(a);
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}


    @After
    public void tearDown() throws Exception {try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34838);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34839);withoutCause = null;
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34840);nested = null;
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34841);withCause = null;
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34842);jdkNoCause = null;
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34843);cyclicCause = null;
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private Throwable createExceptionWithoutCause() {try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34844);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34845);try {
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(34846);throw new ExceptionWithoutCause();
        } catch (final Throwable t) {
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(34847);return t;
        }
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    private Throwable createExceptionWithCause() {try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34848);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34849);try {
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(34850);try {
                __CLR4_1_2qvhqvhl3lqxunb.R.inc(34851);throw new ExceptionWithCause(createExceptionWithoutCause());
            } catch (final Throwable t) {
                __CLR4_1_2qvhqvhl3lqxunb.R.inc(34852);throw new ExceptionWithCause(t);
            }
        } catch (final Throwable t) {
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(34853);return t;
        }
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    
    @Test
    public void testConstructor() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hqw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34854,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hqw6(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34854);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34855);assertNotNull(new ExceptionUtils());
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34856);final Constructor<?>[] cons = ExceptionUtils.class.getDeclaredConstructors();
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34857);assertEquals(1, cons.length);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34858);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34859);assertTrue(Modifier.isPublic(ExceptionUtils.class.getModifiers()));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34860);assertFalse(Modifier.isFinal(ExceptionUtils.class.getModifiers()));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation") // Specifically tests the deprecated methods
    @Test
    public void testGetCause_Throwable() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aiond9qwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_Throwable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34861,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aiond9qwd(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34861);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34862);assertSame(null, ExceptionUtils.getCause(null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34863);assertSame(null, ExceptionUtils.getCause(withoutCause));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34864);assertSame(withoutCause, ExceptionUtils.getCause(nested));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34865);assertSame(nested, ExceptionUtils.getCause(withCause));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34866);assertSame(null, ExceptionUtils.getCause(jdkNoCause));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34867);assertSame(cyclicCause.getCause(), ExceptionUtils.getCause(cyclicCause));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34868);assertSame(((ExceptionWithCause) cyclicCause.getCause()).getCause(), ExceptionUtils.getCause(cyclicCause.getCause()));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34869);assertSame(cyclicCause.getCause(), ExceptionUtils.getCause(((ExceptionWithCause) cyclicCause.getCause()).getCause()));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @SuppressWarnings("deprecation") // Specifically tests the deprecated methods
    @Test
    public void testGetCause_ThrowableArray() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27jkp9iqwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_ThrowableArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34870,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27jkp9iqwm(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34870);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34871);assertSame(null, ExceptionUtils.getCause(null, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34872);assertSame(null, ExceptionUtils.getCause(null, new String[0]));

        // not known type, so match on supplied method names
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34873);assertSame(nested, ExceptionUtils.getCause(withCause, null));  // default names
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34874);assertSame(null, ExceptionUtils.getCause(withCause, new String[0]));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34875);assertSame(null, ExceptionUtils.getCause(withCause, new String[] {null}));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34876);assertSame(nested, ExceptionUtils.getCause(withCause, new String[] {"getCause"}));
        
        // not known type, so match on supplied method names
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34877);assertSame(null, ExceptionUtils.getCause(withoutCause, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34878);assertSame(null, ExceptionUtils.getCause(withoutCause, new String[0]));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34879);assertSame(null, ExceptionUtils.getCause(withoutCause, new String[] {null}));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34880);assertSame(null, ExceptionUtils.getCause(withoutCause, new String[] {"getCause"}));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34881);assertSame(null, ExceptionUtils.getCause(withoutCause, new String[] {"getTargetException"}));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testGetRootCause_Throwable() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o8zwdxqwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCause_Throwable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34882,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o8zwdxqwy(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34882);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34883);assertSame(null, ExceptionUtils.getRootCause(null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34884);assertSame(null, ExceptionUtils.getRootCause(withoutCause));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34885);assertSame(withoutCause, ExceptionUtils.getRootCause(nested));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34886);assertSame(withoutCause, ExceptionUtils.getRootCause(withCause));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34887);assertSame(null, ExceptionUtils.getRootCause(jdkNoCause));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34888);assertSame(((ExceptionWithCause) cyclicCause.getCause()).getCause(), ExceptionUtils.getRootCause(cyclicCause));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetThrowableCount_Throwable() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hbqm6zqx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableCount_Throwable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34889,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hbqm6zqx5(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34889);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34890);assertEquals(0, ExceptionUtils.getThrowableCount(null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34891);assertEquals(1, ExceptionUtils.getThrowableCount(withoutCause));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34892);assertEquals(2, ExceptionUtils.getThrowableCount(nested));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34893);assertEquals(3, ExceptionUtils.getThrowableCount(withCause));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34894);assertEquals(1, ExceptionUtils.getThrowableCount(jdkNoCause));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34895);assertEquals(3, ExceptionUtils.getThrowableCount(cyclicCause));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetThrowables_Throwable_null() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qrgt63qxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_null",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34896,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qrgt63qxc(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34896);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34897);assertEquals(0, ExceptionUtils.getThrowables(null).length);
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testGetThrowables_Throwable_withoutCause() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yh7i1bqxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withoutCause",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34898,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yh7i1bqxe(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34898);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34899);final Throwable[] throwables = ExceptionUtils.getThrowables(withoutCause);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34900);assertEquals(1, throwables.length);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34901);assertSame(withoutCause, throwables[0]);
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testGetThrowables_Throwable_nested() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c8m0p1qxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_nested",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34902,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c8m0p1qxi(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34902);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34903);final Throwable[] throwables = ExceptionUtils.getThrowables(nested);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34904);assertEquals(2, throwables.length);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34905);assertSame(nested, throwables[0]);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34906);assertSame(withoutCause, throwables[1]);
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testGetThrowables_Throwable_withCause() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26s4o2lqxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withCause",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34907,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26s4o2lqxn(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34907);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34908);final Throwable[] throwables = ExceptionUtils.getThrowables(withCause);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34909);assertEquals(3, throwables.length);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34910);assertSame(withCause, throwables[0]);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34911);assertSame(nested, throwables[1]);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34912);assertSame(withoutCause, throwables[2]);
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testGetThrowables_Throwable_jdkNoCause() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wp2h39qxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_jdkNoCause",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34913,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wp2h39qxt(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34913);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34914);final Throwable[] throwables = ExceptionUtils.getThrowables(jdkNoCause);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34915);assertEquals(1, throwables.length);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34916);assertSame(jdkNoCause, throwables[0]);
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testGetThrowables_Throwable_recursiveCause() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w1pjffqxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_recursiveCause",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34917,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w1pjffqxx(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34917);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34918);final Throwable[] throwables = ExceptionUtils.getThrowables(cyclicCause);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34919);assertEquals(3, throwables.length);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34920);assertSame(cyclicCause, throwables[0]);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34921);assertSame(cyclicCause.getCause(), throwables[1]);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34922);assertSame(((ExceptionWithCause) cyclicCause.getCause()).getCause(), throwables[2]);
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetThrowableList_Throwable_null() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2t31jouqy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_null",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34923,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2t31jouqy3(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34923);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34924);final List<?> throwables = ExceptionUtils.getThrowableList(null);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34925);assertEquals(0, throwables.size());
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testGetThrowableList_Throwable_withoutCause() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uzjmesqy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withoutCause",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34926,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uzjmesqy6(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34926);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34927);final List<?> throwables = ExceptionUtils.getThrowableList(withoutCause);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34928);assertEquals(1, throwables.size());
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34929);assertSame(withoutCause, throwables.get(0));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testGetThrowableList_Throwable_nested() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gtg8laqya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_nested",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34930,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gtg8laqya(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34930);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34931);final List<?> throwables = ExceptionUtils.getThrowableList(nested);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34932);assertEquals(2, throwables.size());
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34933);assertSame(nested, throwables.get(0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34934);assertSame(withoutCause, throwables.get(1));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testGetThrowableList_Throwable_withCause() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x1dvqqyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withCause",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34935,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x1dvqqyf(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34935);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34936);final List<?> throwables = ExceptionUtils.getThrowableList(withCause);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34937);assertEquals(3, throwables.size());
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34938);assertSame(withCause, throwables.get(0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34939);assertSame(nested, throwables.get(1));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34940);assertSame(withoutCause, throwables.get(2));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testGetThrowableList_Throwable_jdkNoCause() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cr629qqyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_jdkNoCause",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34941,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cr629qqyl(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34941);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34942);final List<?> throwables = ExceptionUtils.getThrowableList(jdkNoCause);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34943);assertEquals(1, throwables.size());
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34944);assertSame(jdkNoCause, throwables.get(0));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testGetThrowableList_Throwable_recursiveCause() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2avymn2qyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_recursiveCause",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34945,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2avymn2qyp(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34945);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34946);final List<?> throwables = ExceptionUtils.getThrowableList(cyclicCause);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34947);assertEquals(3, throwables.size());
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34948);assertSame(cyclicCause, throwables.get(0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34949);assertSame(cyclicCause.getCause(), throwables.get(1));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34950);assertSame(((ExceptionWithCause) cyclicCause.getCause()).getCause(), throwables.get(2));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIndexOf_ThrowableClass() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mh2hk7qyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34951,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mh2hk7qyv(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34951);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34952);assertEquals(-1, ExceptionUtils.indexOfThrowable(null, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34953);assertEquals(-1, ExceptionUtils.indexOfThrowable(null, NestableException.class));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34954);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34955);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, ExceptionWithCause.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34956);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, NestableException.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34957);assertEquals(0, ExceptionUtils.indexOfThrowable(withoutCause, ExceptionWithoutCause.class));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34958);assertEquals(-1, ExceptionUtils.indexOfThrowable(nested, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34959);assertEquals(-1, ExceptionUtils.indexOfThrowable(nested, ExceptionWithCause.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34960);assertEquals(0, ExceptionUtils.indexOfThrowable(nested, NestableException.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34961);assertEquals(1, ExceptionUtils.indexOfThrowable(nested, ExceptionWithoutCause.class));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34962);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34963);assertEquals(0, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34964);assertEquals(1, ExceptionUtils.indexOfThrowable(withCause, NestableException.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34965);assertEquals(2, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithoutCause.class));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34966);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, Exception.class));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testIndexOf_ThrowableClassInt() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yseihiqzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClassInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34967,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yseihiqzb(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34967);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34968);assertEquals(-1, ExceptionUtils.indexOfThrowable(null, null, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34969);assertEquals(-1, ExceptionUtils.indexOfThrowable(null, NestableException.class, 0));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34970);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34971);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, ExceptionWithCause.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34972);assertEquals(-1, ExceptionUtils.indexOfThrowable(withoutCause, NestableException.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34973);assertEquals(0, ExceptionUtils.indexOfThrowable(withoutCause, ExceptionWithoutCause.class, 0));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34974);assertEquals(-1, ExceptionUtils.indexOfThrowable(nested, null, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34975);assertEquals(-1, ExceptionUtils.indexOfThrowable(nested, ExceptionWithCause.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34976);assertEquals(0, ExceptionUtils.indexOfThrowable(nested, NestableException.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34977);assertEquals(1, ExceptionUtils.indexOfThrowable(nested, ExceptionWithoutCause.class, 0));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34978);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34979);assertEquals(0, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34980);assertEquals(1, ExceptionUtils.indexOfThrowable(withCause, NestableException.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34981);assertEquals(2, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithoutCause.class, 0));

        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34982);assertEquals(0, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class, -1));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34983);assertEquals(0, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34984);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class, 1));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34985);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, ExceptionWithCause.class, 9));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34986);assertEquals(-1, ExceptionUtils.indexOfThrowable(withCause, Exception.class, 0));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfType_ThrowableClass() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),34987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fjmeszqzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34987,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fjmeszqzv(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(34987);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34988);assertEquals(-1, ExceptionUtils.indexOfType(null, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34989);assertEquals(-1, ExceptionUtils.indexOfType(null, NestableException.class));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34990);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34991);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, ExceptionWithCause.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34992);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, NestableException.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34993);assertEquals(0, ExceptionUtils.indexOfType(withoutCause, ExceptionWithoutCause.class));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34994);assertEquals(-1, ExceptionUtils.indexOfType(nested, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34995);assertEquals(-1, ExceptionUtils.indexOfType(nested, ExceptionWithCause.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34996);assertEquals(0, ExceptionUtils.indexOfType(nested, NestableException.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34997);assertEquals(1, ExceptionUtils.indexOfType(nested, ExceptionWithoutCause.class));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34998);assertEquals(-1, ExceptionUtils.indexOfType(withCause, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(34999);assertEquals(0, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35000);assertEquals(1, ExceptionUtils.indexOfType(withCause, NestableException.class));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35001);assertEquals(2, ExceptionUtils.indexOfType(withCause, ExceptionWithoutCause.class));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35002);assertEquals(0, ExceptionUtils.indexOfType(withCause, Exception.class));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testIndexOfType_ThrowableClassInt() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),35003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27ra500r0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClassInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35003,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27ra500r0b(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35003);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35004);assertEquals(-1, ExceptionUtils.indexOfType(null, null, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35005);assertEquals(-1, ExceptionUtils.indexOfType(null, NestableException.class, 0));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35006);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35007);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, ExceptionWithCause.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35008);assertEquals(-1, ExceptionUtils.indexOfType(withoutCause, NestableException.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35009);assertEquals(0, ExceptionUtils.indexOfType(withoutCause, ExceptionWithoutCause.class, 0));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35010);assertEquals(-1, ExceptionUtils.indexOfType(nested, null, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35011);assertEquals(-1, ExceptionUtils.indexOfType(nested, ExceptionWithCause.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35012);assertEquals(0, ExceptionUtils.indexOfType(nested, NestableException.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35013);assertEquals(1, ExceptionUtils.indexOfType(nested, ExceptionWithoutCause.class, 0));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35014);assertEquals(-1, ExceptionUtils.indexOfType(withCause, null));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35015);assertEquals(0, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35016);assertEquals(1, ExceptionUtils.indexOfType(withCause, NestableException.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35017);assertEquals(2, ExceptionUtils.indexOfType(withCause, ExceptionWithoutCause.class, 0));

        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35018);assertEquals(0, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class, -1));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35019);assertEquals(0, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class, 0));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35020);assertEquals(-1, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class, 1));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35021);assertEquals(-1, ExceptionUtils.indexOfType(withCause, ExceptionWithCause.class, 9));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35022);assertEquals(0, ExceptionUtils.indexOfType(withCause, Exception.class, 0));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPrintRootCauseStackTrace_Throwable() throws Exception {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),35023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_257c2enr0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_Throwable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35023,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_257c2enr0v() throws Exception{try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35023);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35024);ExceptionUtils.printRootCauseStackTrace(null);
        // could pipe system.err to a known stream, but not much point as
        // internally this method calls stram method anyway
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}
    
    @Test
    public void testPrintRootCauseStackTrace_ThrowableStream() throws Exception {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),35025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ojxr0vr0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableStream",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35025,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ojxr0vr0x() throws Exception{try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35025);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35026);ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35027);ExceptionUtils.printRootCauseStackTrace(null, (PrintStream) null);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35028);ExceptionUtils.printRootCauseStackTrace(null, new PrintStream(out));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35029);assertEquals(0, out.toString().length());
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35030);out = new ByteArrayOutputStream(1024);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35031);try {
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(35032);ExceptionUtils.printRootCauseStackTrace(withCause, (PrintStream) null);
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(35033);fail();
        } catch (final IllegalArgumentException ex) {
        }
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35034);out = new ByteArrayOutputStream(1024);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35035);final Throwable withCause = createExceptionWithCause();
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35036);ExceptionUtils.printRootCauseStackTrace(withCause, new PrintStream(out));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35037);String stackTrace = out.toString();
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35038);assertTrue(stackTrace.indexOf(ExceptionUtils.WRAPPED_MARKER) != -1);
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35039);out = new ByteArrayOutputStream(1024);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35040);ExceptionUtils.printRootCauseStackTrace(withoutCause, new PrintStream(out));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35041);stackTrace = out.toString();
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35042);assertTrue(stackTrace.indexOf(ExceptionUtils.WRAPPED_MARKER) == -1);
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void testPrintRootCauseStackTrace_ThrowableWriter() throws Exception {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),35043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ajkfi4r1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableWriter",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35043,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ajkfi4r1f() throws Exception{try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35043);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35044);StringWriter writer = new StringWriter(1024);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35045);ExceptionUtils.printRootCauseStackTrace(null, (PrintWriter) null);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35046);ExceptionUtils.printRootCauseStackTrace(null, new PrintWriter(writer));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35047);assertEquals(0, writer.getBuffer().length());
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35048);writer = new StringWriter(1024);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35049);try {
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(35050);ExceptionUtils.printRootCauseStackTrace(withCause, (PrintWriter) null);
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(35051);fail();
        } catch (final IllegalArgumentException ex) {
        }
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35052);writer = new StringWriter(1024);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35053);final Throwable withCause = createExceptionWithCause();
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35054);ExceptionUtils.printRootCauseStackTrace(withCause, new PrintWriter(writer));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35055);String stackTrace = writer.toString();
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35056);assertTrue(stackTrace.indexOf(ExceptionUtils.WRAPPED_MARKER) != -1);
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35057);writer = new StringWriter(1024);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35058);ExceptionUtils.printRootCauseStackTrace(withoutCause, new PrintWriter(writer));
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35059);stackTrace = writer.toString();
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35060);assertTrue(stackTrace.indexOf(ExceptionUtils.WRAPPED_MARKER) == -1);
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetRootCauseStackTrace_Throwable() throws Exception {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),35061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ykc7e0r1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCauseStackTrace_Throwable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35061,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ykc7e0r1x() throws Exception{try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35061);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35062);assertEquals(0, ExceptionUtils.getRootCauseStackTrace(null).length);
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35063);final Throwable withCause = createExceptionWithCause();
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35064);String[] stackTrace = ExceptionUtils.getRootCauseStackTrace(withCause);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35065);boolean match = false;
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35066);for (final String element : stackTrace) {{
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(35067);if ((((element.startsWith(ExceptionUtils.WRAPPED_MARKER))&&(__CLR4_1_2qvhqvhl3lqxunb.R.iget(35068)!=0|true))||(__CLR4_1_2qvhqvhl3lqxunb.R.iget(35069)==0&false))) {{
                __CLR4_1_2qvhqvhl3lqxunb.R.inc(35070);match = true;
                __CLR4_1_2qvhqvhl3lqxunb.R.inc(35071);break;
            }
        }}
        }__CLR4_1_2qvhqvhl3lqxunb.R.inc(35072);assertTrue(match);
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35073);stackTrace = ExceptionUtils.getRootCauseStackTrace(withoutCause);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35074);match = false;
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35075);for (final String element : stackTrace) {{
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(35076);if ((((element.startsWith(ExceptionUtils.WRAPPED_MARKER))&&(__CLR4_1_2qvhqvhl3lqxunb.R.iget(35077)!=0|true))||(__CLR4_1_2qvhqvhl3lqxunb.R.iget(35078)==0&false))) {{
                __CLR4_1_2qvhqvhl3lqxunb.R.inc(35079);match = true;
                __CLR4_1_2qvhqvhl3lqxunb.R.inc(35080);break;
            }
        }}
        }__CLR4_1_2qvhqvhl3lqxunb.R.inc(35081);assertFalse(match);
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testRemoveCommonFrames_ListList() throws Exception {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),35082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mbghnr2i();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,67,111,109,109,111,110,70,114,97,109,101,115,95,76,105,115,116,76,105,115,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.testRemoveCommonFrames_ListList",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35082,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mbghnr2i() throws Exception{try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35082);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35083);ExceptionUtils.removeCommonFrames(null, null);
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void test_getMessage_Throwable() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),35084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bj51rar2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getMessage_Throwable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bj51rar2k(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35084);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35085);Throwable th = null;
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35086);assertEquals("", ExceptionUtils.getMessage(th));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35087);th = new IllegalArgumentException("Base");
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35088);assertEquals("IllegalArgumentException: Base", ExceptionUtils.getMessage(th));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35089);th = new ExceptionWithCause("Wrapper", th);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35090);assertEquals("ExceptionUtilsTest.ExceptionWithCause: Wrapper", ExceptionUtils.getMessage(th));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    @Test
    public void test_getRootCauseMessage_Throwable() {__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceStart(getClass().getName(),35091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j2nfo1r2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qvhqvhl3lqxunb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qvhqvhl3lqxunb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getRootCauseMessage_Throwable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35091,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j2nfo1r2r(){try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35091);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35092);Throwable th = null;
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35093);assertEquals("", ExceptionUtils.getRootCauseMessage(th));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35094);th = new IllegalArgumentException("Base");
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35095);assertEquals("IllegalArgumentException: Base", ExceptionUtils.getRootCauseMessage(th));
        
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35096);th = new ExceptionWithCause("Wrapper", th);
        __CLR4_1_2qvhqvhl3lqxunb.R.inc(35097);assertEquals("IllegalArgumentException: Base", ExceptionUtils.getRootCauseMessage(th));
    }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Provides a method with a well known chained/nested exception
     * name which matches the full signature (e.g. has a return value
     * of <code>Throwable</code>.
     */
    private static class ExceptionWithCause extends Exception {
        private Throwable cause;

        public ExceptionWithCause(final String str, final Throwable cause) {
            super(str);__CLR4_1_2qvhqvhl3lqxunb.R.inc(35099);try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35098);
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(35100);setCause(cause);
        }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

        public ExceptionWithCause(final Throwable cause) {
            super();__CLR4_1_2qvhqvhl3lqxunb.R.inc(35102);try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35101);
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(35103);setCause(cause);
        }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

        @Override
        public Throwable getCause() {try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35104);
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(35105);return cause;
        }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}

        public void setCause(final Throwable cause) {try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35106);
            __CLR4_1_2qvhqvhl3lqxunb.R.inc(35107);this.cause = cause;
        }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}
    }

    /**
     * Provides a method with a well known chained/nested exception
     * name which does not match the full signature (e.g. lacks a
     * return value of <code>Throwable</code>.
     */
    private static class ExceptionWithoutCause extends Exception {
        @SuppressWarnings("unused")
        public void getTargetException() {try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35108);
        }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}
    }

    // Temporary classes to allow the nested exception code to be removed 
    // prior to a rewrite of this test class. 
    private static class NestableException extends Exception { 
        @SuppressWarnings("unused")
        public NestableException() { super();__CLR4_1_2qvhqvhl3lqxunb.R.inc(35110);try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35109); }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}
        public NestableException(final Throwable t) { super(t);__CLR4_1_2qvhqvhl3lqxunb.R.inc(35112);try{__CLR4_1_2qvhqvhl3lqxunb.R.inc(35111); }finally{__CLR4_1_2qvhqvhl3lqxunb.R.flushNeeded();}}
    }

}
