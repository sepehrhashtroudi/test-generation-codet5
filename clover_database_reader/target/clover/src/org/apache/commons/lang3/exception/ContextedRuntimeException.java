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

import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.tuple.Pair;

/**
 * <p>
 * A runtime exception that provides an easy and safe way to add contextual information.
 * </p><p>
 * An exception trace itself is often insufficient to provide rapid diagnosis of the issue.
 * Frequently what is needed is a select few pieces of local contextual data.
 * Providing this data is tricky however, due to concerns over formatting and nulls.
 * </p><p>
 * The contexted exception approach allows the exception to be created together with a
 * list of context label-value pairs. This additional information is automatically included in
 * the message and printed stack trace.
 * </p><p>
 * A checked version of this exception is provided by ContextedException.
 * </p>
 * <p>
 * To use this class write code as follows:
 * </p>
 * <pre>
 *   try {
 *     ...
 *   } catch (Exception e) {
 *     throw new ContextedRuntimeException("Error posting account transaction", e)
 *          .addContextValue("Account Number", accountNumber)
 *          .addContextValue("Amount Posted", amountPosted)
 *          .addContextValue("Previous Balance", previousBalance)
 *   }
 * }
 * </pre> or improve diagnose data at a higher level:
 * <pre>
 *   try {
 *     ...
 *   } catch (ContextedRuntimeException e) {
 *     throw e.setContextValue("Transaction Id", transactionId);
 *   } catch (Exception e) {
 *     if (e instanceof ExceptionContext) {
 *       e.setContextValue("Transaction Id", transactionId);
 *     }
 *     throw e;
 *   }
 * }
 * </pre>
 * </p><p>
 * The output in a printStacktrace() (which often is written to a log) would look something like the following:
 * <pre>
 * org.apache.commons.lang3.exception.ContextedRuntimeException: java.lang.Exception: Error posting account transaction
 *  Exception Context:
 *  [1:Account Number=null]
 *  [2:Amount Posted=100.00]
 *  [3:Previous Balance=-2.17]
 *  [4:Transaction Id=94ef1d15-d443-46c4-822b-637f26244899]
 *
 *  ---------------------------------
 *  at org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testAddValue(ContextedExceptionTest.java:88)
 *  ..... (rest of trace)
 * </pre>
 * </p>
 * 
 * @see ContextedException
 * @since 3.0
 */
public class ContextedRuntimeException extends RuntimeException implements ExceptionContext {public static class __CLR4_1_28p58p5l3lqxse2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,11312,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The serialization version. */
    private static final long serialVersionUID = 20110706L;
    /** The context where the data is stored. */
    private final ExceptionContext exceptionContext;

    /**
     * Instantiates ContextedRuntimeException without message or cause.
     * <p>
     * The context information is stored using a default implementation.
     */
    public ContextedRuntimeException() {
        super();__CLR4_1_28p58p5l3lqxse2.R.inc(11274);try{__CLR4_1_28p58p5l3lqxse2.R.inc(11273);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11275);exceptionContext = new DefaultExceptionContext();
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * Instantiates ContextedRuntimeException with message, but without cause.
     * <p>
     * The context information is stored using a default implementation.
     * 
     * @param message  the exception message, may be null
     */
    public ContextedRuntimeException(final String message) {
        super(message);__CLR4_1_28p58p5l3lqxse2.R.inc(11277);try{__CLR4_1_28p58p5l3lqxse2.R.inc(11276);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11278);exceptionContext = new DefaultExceptionContext();
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * Instantiates ContextedRuntimeException with cause, but without message.
     * <p>
     * The context information is stored using a default implementation.
     * 
     * @param cause  the underlying cause of the exception, may be null
     */
    public ContextedRuntimeException(final Throwable cause) {
        super(cause);__CLR4_1_28p58p5l3lqxse2.R.inc(11280);try{__CLR4_1_28p58p5l3lqxse2.R.inc(11279);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11281);exceptionContext = new DefaultExceptionContext();
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * Instantiates ContextedRuntimeException with cause and message.
     * <p>
     * The context information is stored using a default implementation.
     * 
     * @param message  the exception message, may be null
     * @param cause  the underlying cause of the exception, may be null
     */
    public ContextedRuntimeException(final String message, final Throwable cause) {
        super(message, cause);__CLR4_1_28p58p5l3lqxse2.R.inc(11283);try{__CLR4_1_28p58p5l3lqxse2.R.inc(11282);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11284);exceptionContext = new DefaultExceptionContext();
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * Instantiates ContextedRuntimeException with cause, message, and ExceptionContext.
     * 
     * @param message  the exception message, may be null
     * @param cause  the underlying cause of the exception, may be null
     * @param context  the context used to store the additional information, null uses default implementation
     */
    public ContextedRuntimeException(final String message, final Throwable cause, ExceptionContext context) {
        super(message, cause);__CLR4_1_28p58p5l3lqxse2.R.inc(11286);try{__CLR4_1_28p58p5l3lqxse2.R.inc(11285);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11287);if ((((context == null)&&(__CLR4_1_28p58p5l3lqxse2.R.iget(11288)!=0|true))||(__CLR4_1_28p58p5l3lqxse2.R.iget(11289)==0&false))) {{
            __CLR4_1_28p58p5l3lqxse2.R.inc(11290);context = new DefaultExceptionContext();
        }
        }__CLR4_1_28p58p5l3lqxse2.R.inc(11291);exceptionContext = context;
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds information helpful to a developer in diagnosing and correcting the problem.
     * For the information to be meaningful, the value passed should have a reasonable
     * toString() implementation.
     * Different values can be added with the same label multiple times.
     * <p>
     * Note: This exception is only serializable if the object added is serializable.
     * </p>
     * 
     * @param label  a textual label associated with information, {@code null} not recommended
     * @param value  information needed to understand exception, may be {@code null}
     * @return {@code this}, for method chaining, not {@code null}
     */
    @Override
    public ContextedRuntimeException addContextValue(final String label, final Object value) {try{__CLR4_1_28p58p5l3lqxse2.R.inc(11292);        
        __CLR4_1_28p58p5l3lqxse2.R.inc(11293);exceptionContext.addContextValue(label, value);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11294);return this;
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * Sets information helpful to a developer in diagnosing and correcting the problem.
     * For the information to be meaningful, the value passed should have a reasonable
     * toString() implementation.
     * Any existing values with the same labels are removed before the new one is added.
     * <p>
     * Note: This exception is only serializable if the object added as value is serializable.
     * </p>
     * 
     * @param label  a textual label associated with information, {@code null} not recommended
     * @param value  information needed to understand exception, may be {@code null}
     * @return {@code this}, for method chaining, not {@code null}
     */
    @Override
    public ContextedRuntimeException setContextValue(final String label, final Object value) {try{__CLR4_1_28p58p5l3lqxse2.R.inc(11295);        
        __CLR4_1_28p58p5l3lqxse2.R.inc(11296);exceptionContext.setContextValue(label, value);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11297);return this;
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Object> getContextValues(final String label) {try{__CLR4_1_28p58p5l3lqxse2.R.inc(11298);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11299);return this.exceptionContext.getContextValues(label);
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getFirstContextValue(final String label) {try{__CLR4_1_28p58p5l3lqxse2.R.inc(11300);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11301);return this.exceptionContext.getFirstContextValue(label);
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Pair<String, Object>> getContextEntries() {try{__CLR4_1_28p58p5l3lqxse2.R.inc(11302);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11303);return this.exceptionContext.getContextEntries();
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<String> getContextLabels() {try{__CLR4_1_28p58p5l3lqxse2.R.inc(11304);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11305);return exceptionContext.getContextLabels();
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * Provides the message explaining the exception, including the contextual data.
     * 
     * @see java.lang.Throwable#getMessage()
     * @return the message, never null
     */
    @Override
    public String getMessage(){try{__CLR4_1_28p58p5l3lqxse2.R.inc(11306);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11307);return getFormattedExceptionMessage(super.getMessage());
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * Provides the message explaining the exception without the contextual data.
     * 
     * @see java.lang.Throwable#getMessage()
     * @return the message
     * @since 3.0.1
     */
    public String getRawMessage() {try{__CLR4_1_28p58p5l3lqxse2.R.inc(11308);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11309);return super.getMessage();
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFormattedExceptionMessage(final String baseMessage) {try{__CLR4_1_28p58p5l3lqxse2.R.inc(11310);
        __CLR4_1_28p58p5l3lqxse2.R.inc(11311);return exceptionContext.getFormattedExceptionMessage(baseMessage);
    }finally{__CLR4_1_28p58p5l3lqxse2.R.flushNeeded();}}

}
