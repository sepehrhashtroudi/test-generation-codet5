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

/**
 * <p>
 * <code>StopWatch</code> provides a convenient API for timings.
 * </p>
 * 
 * <p>
 * To start the watch, call {@link #start()}. At this point you can:
 * </p>
 * <ul>
 * <li>{@link #split()} the watch to get the time whilst the watch continues in the background. {@link #unsplit()} will
 * remove the effect of the split. At this point, these three options are available again.</li>
 * <li>{@link #suspend()} the watch to pause it. {@link #resume()} allows the watch to continue. Any time between the
 * suspend and resume will not be counted in the total. At this point, these three options are available again.</li>
 * <li>{@link #stop()} the watch to complete the timing session.</li>
 * </ul>
 * 
 * <p>
 * It is intended that the output methods {@link #toString()} and {@link #getTime()} should only be called after stop,
 * split or suspend, however a suitable result will be returned at other points.
 * </p>
 * 
 * <p>
 * NOTE: As from v2.1, the methods protect against inappropriate calls. Thus you cannot now call stop before start,
 * resume before suspend or unsplit before split.
 * </p>
 * 
 * <p>
 * 1. split(), suspend(), or stop() cannot be invoked twice<br />
 * 2. unsplit() may only be called if the watch has been split()<br />
 * 3. resume() may only be called if the watch has been suspend()<br />
 * 4. start() cannot be called twice without calling reset()
 * </p>
 * 
 * <p>This class is not thread-safe</p>
 * 
 * @since 2.0
 * @version $Id$
 */
public class StopWatch {public static class __CLR4_1_2epzepzl3lqxsvd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,19167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long NANO_2_MILLIS = 1000000L;

    // running states
    private static final int STATE_UNSTARTED = 0;

    private static final int STATE_RUNNING = 1;

    private static final int STATE_STOPPED = 2;

    private static final int STATE_SUSPENDED = 3;

    // split state
    private static final int STATE_UNSPLIT = 10;

    private static final int STATE_SPLIT = 11;

    /**
     * The current running state of the StopWatch.
     */
    private int runningState = STATE_UNSTARTED;

    /**
     * Whether the stopwatch has a split time recorded.
     */
    private int splitState = STATE_UNSPLIT;

    /**
     * The start time.
     */
    private long startTime;

    /**
     * The start time in Millis - nanoTime is only for elapsed time so we 
     * need to also store the currentTimeMillis to maintain the old 
     * getStartTime API.
     */
    private long startTimeMillis;

    /**
     * The stop time.
     */
    private long stopTime;

    /**
     * <p>
     * Constructor.
     * </p>
     */
    public StopWatch() {
        super();__CLR4_1_2epzepzl3lqxsvd.R.inc(19080);try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19079);
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * <p>
     * Start the stopwatch.
     * </p>
     * 
     * <p>
     * This method starts a new timing session, clearing any previous values.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch is already running.
     */
    public void start() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19081);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19082);if ((((this.runningState == STATE_STOPPED)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19083)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19084)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19085);throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
        }
        }__CLR4_1_2epzepzl3lqxsvd.R.inc(19086);if ((((this.runningState != STATE_UNSTARTED)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19087)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19088)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19089);throw new IllegalStateException("Stopwatch already started. ");
        }
        }__CLR4_1_2epzepzl3lqxsvd.R.inc(19090);this.startTime = System.nanoTime();
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19091);this.startTimeMillis = System.currentTimeMillis();
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19092);this.runningState = STATE_RUNNING;
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * <p>
     * Stop the stopwatch.
     * </p>
     * 
     * <p>
     * This method ends a new timing session, allowing the time to be retrieved.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch is not running.
     */
    public void stop() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19093);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19094);if ((((this.runningState != STATE_RUNNING && this.runningState != STATE_SUSPENDED)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19095)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19096)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19097);throw new IllegalStateException("Stopwatch is not running. ");
        }
        }__CLR4_1_2epzepzl3lqxsvd.R.inc(19098);if ((((this.runningState == STATE_RUNNING)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19099)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19100)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19101);this.stopTime = System.nanoTime();
        }
        }__CLR4_1_2epzepzl3lqxsvd.R.inc(19102);this.runningState = STATE_STOPPED;
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * <p>
     * Resets the stopwatch. Stops it if need be.
     * </p>
     * 
     * <p>
     * This method clears the internal values to allow the object to be reused.
     * </p>
     */
    public void reset() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19103);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19104);this.runningState = STATE_UNSTARTED;
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19105);this.splitState = STATE_UNSPLIT;
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * <p>
     * Split the time.
     * </p>
     * 
     * <p>
     * This method sets the stop time of the watch to allow a time to be extracted. The start time is unaffected,
     * enabling {@link #unsplit()} to continue the timing from the original start point.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch is not running.
     */
    public void split() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19106);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19107);if ((((this.runningState != STATE_RUNNING)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19108)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19109)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19110);throw new IllegalStateException("Stopwatch is not running. ");
        }
        }__CLR4_1_2epzepzl3lqxsvd.R.inc(19111);this.stopTime = System.nanoTime();
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19112);this.splitState = STATE_SPLIT;
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * <p>
     * Remove a split.
     * </p>
     * 
     * <p>
     * This method clears the stop time. The start time is unaffected, enabling timing from the original start point to
     * continue.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch has not been split.
     */
    public void unsplit() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19113);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19114);if ((((this.splitState != STATE_SPLIT)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19115)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19116)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19117);throw new IllegalStateException("Stopwatch has not been split. ");
        }
        }__CLR4_1_2epzepzl3lqxsvd.R.inc(19118);this.splitState = STATE_UNSPLIT;
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * <p>
     * Suspend the stopwatch for later resumption.
     * </p>
     * 
     * <p>
     * This method suspends the watch until it is resumed. The watch will not include time between the suspend and
     * resume calls in the total time.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch is not currently running.
     */
    public void suspend() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19119);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19120);if ((((this.runningState != STATE_RUNNING)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19121)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19122)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19123);throw new IllegalStateException("Stopwatch must be running to suspend. ");
        }
        }__CLR4_1_2epzepzl3lqxsvd.R.inc(19124);this.stopTime = System.nanoTime();
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19125);this.runningState = STATE_SUSPENDED;
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * <p>
     * Resume the stopwatch after a suspend.
     * </p>
     * 
     * <p>
     * This method resumes the watch after it was suspended. The watch will not include time between the suspend and
     * resume calls in the total time.
     * </p>
     * 
     * @throws IllegalStateException
     *             if the StopWatch has not been suspended.
     */
    public void resume() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19126);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19127);if ((((this.runningState != STATE_SUSPENDED)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19128)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19129)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19130);throw new IllegalStateException("Stopwatch must be suspended to resume. ");
        }
        }__CLR4_1_2epzepzl3lqxsvd.R.inc(19131);this.startTime += System.nanoTime() - this.stopTime;
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19132);this.runningState = STATE_RUNNING;
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * <p>
     * Get the time on the stopwatch.
     * </p>
     * 
     * <p>
     * This is either the time between the start and the moment this method is called, or the amount of time between
     * start and stop.
     * </p>
     * 
     * @return the time in milliseconds
     */
    public long getTime() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19133);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19134);return getNanoTime() / NANO_2_MILLIS;
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}
    /**
     * <p>
     * Get the time on the stopwatch in nanoseconds.
     * </p>
     * 
     * <p>
     * This is either the time between the start and the moment this method is called, or the amount of time between
     * start and stop.
     * </p>
     * 
     * @return the time in nanoseconds
     * @since 3.0
     */
    public long getNanoTime() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19135);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19136);if ((((this.runningState == STATE_STOPPED || this.runningState == STATE_SUSPENDED)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19137)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19138)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19139);return this.stopTime - this.startTime;
        } }else {__CLR4_1_2epzepzl3lqxsvd.R.inc(19140);if ((((this.runningState == STATE_UNSTARTED)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19141)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19142)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19143);return 0;
        } }else {__CLR4_1_2epzepzl3lqxsvd.R.inc(19144);if ((((this.runningState == STATE_RUNNING)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19145)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19146)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19147);return System.nanoTime() - this.startTime;
        }
        }}}__CLR4_1_2epzepzl3lqxsvd.R.inc(19148);throw new RuntimeException("Illegal running state has occurred.");
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * <p>
     * Get the split time on the stopwatch.
     * </p>
     * 
     * <p>
     * This is the time between start and latest split.
     * </p>
     * 
     * @return the split time in milliseconds
     * 
     * @throws IllegalStateException
     *             if the StopWatch has not yet been split.
     * @since 2.1
     */
    public long getSplitTime() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19149);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19150);return getSplitNanoTime() / NANO_2_MILLIS;
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}
    /**
     * <p>
     * Get the split time on the stopwatch in nanoseconds.
     * </p>
     * 
     * <p>
     * This is the time between start and latest split.
     * </p>
     * 
     * @return the split time in nanoseconds
     * 
     * @throws IllegalStateException
     *             if the StopWatch has not yet been split.
     * @since 3.0
     */
    public long getSplitNanoTime() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19151);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19152);if ((((this.splitState != STATE_SPLIT)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19153)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19154)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19155);throw new IllegalStateException("Stopwatch must be split to get the split time. ");
        }
        }__CLR4_1_2epzepzl3lqxsvd.R.inc(19156);return this.stopTime - this.startTime;
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * Returns the time this stopwatch was started.
     * 
     * @return the time this stopwatch was started
     * @throws IllegalStateException
     *             if this StopWatch has not been started
     * @since 2.4
     */
    public long getStartTime() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19157);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19158);if ((((this.runningState == STATE_UNSTARTED)&&(__CLR4_1_2epzepzl3lqxsvd.R.iget(19159)!=0|true))||(__CLR4_1_2epzepzl3lqxsvd.R.iget(19160)==0&false))) {{
            __CLR4_1_2epzepzl3lqxsvd.R.inc(19161);throw new IllegalStateException("Stopwatch has not been started");
        }
        // System.nanoTime is for elapsed time
        }__CLR4_1_2epzepzl3lqxsvd.R.inc(19162);return this.startTimeMillis;
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * <p>
     * Gets a summary of the time that the stopwatch recorded as a string.
     * </p>
     * 
     * <p>
     * The format used is ISO8601-like, <i>hours</i>:<i>minutes</i>:<i>seconds</i>.<i>milliseconds</i>.
     * </p>
     * 
     * @return the time as a String
     */
    @Override
    public String toString() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19163);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19164);return DurationFormatUtils.formatDurationHMS(getTime());
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

    /**
     * <p>
     * Gets a summary of the split time that the stopwatch recorded as a string.
     * </p>
     * 
     * <p>
     * The format used is ISO8601-like, <i>hours</i>:<i>minutes</i>:<i>seconds</i>.<i>milliseconds</i>.
     * </p>
     * 
     * @return the split time as a String
     * @since 2.1
     */
    public String toSplitString() {try{__CLR4_1_2epzepzl3lqxsvd.R.inc(19165);
        __CLR4_1_2epzepzl3lqxsvd.R.inc(19166);return DurationFormatUtils.formatDurationHMS(getSplitTime());
    }finally{__CLR4_1_2epzepzl3lqxsvd.R.flushNeeded();}}

}
