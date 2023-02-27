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
package org.apache.commons.lang3.concurrent;

/**
 * <p>
 * An exception class used for reporting runtime error conditions related to
 * accessing data of background tasks.
 * </p>
 * <p>
 * This class is an analogon of the {@link ConcurrentException} exception class.
 * However, it is a runtime exception and thus does not need explicit catch
 * clauses. Some methods of {@link ConcurrentUtils} throw {@code
 * ConcurrentRuntimeException} exceptions rather than
 * {@link ConcurrentException} exceptions. They can be used by client code that
 * does not want to be bothered with checked exceptions.
 * </p>
 *
 * @since 3.0
 * @version $Id$
 */
public class ConcurrentRuntimeException extends RuntimeException {public static class __CLR4_1_28e18e1l3lqxsce{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,10879,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * The serial version UID.
     */
    private static final long serialVersionUID = -6582182735562919670L;

    /**
     * Creates a new, uninitialized instance of {@code
     * ConcurrentRuntimeException}.
     */
    protected ConcurrentRuntimeException() {
        super();__CLR4_1_28e18e1l3lqxsce.R.inc(10874);try{__CLR4_1_28e18e1l3lqxsce.R.inc(10873);
    }finally{__CLR4_1_28e18e1l3lqxsce.R.flushNeeded();}}

    /**
     * Creates a new instance of {@code ConcurrentRuntimeException} and
     * initializes it with the given cause.
     *
     * @param cause the cause of this exception
     * @throws IllegalArgumentException if the cause is not a checked exception
     */
    public ConcurrentRuntimeException(final Throwable cause) {
        super(ConcurrentUtils.checkedException(cause));__CLR4_1_28e18e1l3lqxsce.R.inc(10876);try{__CLR4_1_28e18e1l3lqxsce.R.inc(10875);
    }finally{__CLR4_1_28e18e1l3lqxsce.R.flushNeeded();}}

    /**
     * Creates a new instance of {@code ConcurrentRuntimeException} and
     * initializes it with the given message and cause.
     *
     * @param msg the error message
     * @param cause the cause of this exception
     * @throws IllegalArgumentException if the cause is not a checked exception
     */
    public ConcurrentRuntimeException(final String msg, final Throwable cause) {
        super(msg, ConcurrentUtils.checkedException(cause));__CLR4_1_28e18e1l3lqxsce.R.inc(10878);try{__CLR4_1_28e18e1l3lqxsce.R.inc(10877);
    }finally{__CLR4_1_28e18e1l3lqxsce.R.flushNeeded();}}
}
