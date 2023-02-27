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

import java.io.Serializable;
import java.util.Comparator;

/**
 * <p>An immutable range of objects from a minimum to maximum point inclusive.</p>
 * 
 * <p>The objects need to either be implementations of {@code Comparable}
 * or you need to supply a {@code Comparator}. </p>
 *
 * <p>#ThreadSafe# if the objects and comparator are thread-safe</p>
 * 
 * @since 3.0
 * @version $Id$
 */
public final class Range<T> implements Serializable {public static class __CLR4_1_244a44al3lqxrwl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,5495,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version.
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * The ordering scheme used in this range.
     */
    private final Comparator<T> comparator;
    /**
     * The minimum value in this range (inclusive).
     */
    private final T minimum;
    /**
     * The maximum value in this range (inclusive).
     */
    private final T maximum;
    /**
     * Cached output hashCode (class is immutable).
     */
    private transient int hashCode;
    /**
     * Cached output toString (class is immutable).
     */
    private transient String toString;

    /**
     * <p>Obtains a range using the specified element as both the minimum
     * and maximum in this range.</p>
     * 
     * <p>The range uses the natural ordering of the elements to determine where
     * values lie in the range.</p>
     *
     * @param <T> the type of the elements in this range
     * @param element  the value to use for this range, not null
     * @return the range object, not null
     * @throws IllegalArgumentException if the element is null
     * @throws ClassCastException if the element is not {@code Comparable}
     */
    public static <T extends Comparable<T>> Range<T> is(final T element) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5338);
        __CLR4_1_244a44al3lqxrwl.R.inc(5339);return between(element, element, null);
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Obtains a range using the specified element as both the minimum
     * and maximum in this range.</p>
     * 
     * <p>The range uses the specified {@code Comparator} to determine where
     * values lie in the range.</p>
     *
     * @param <T> the type of the elements in this range
     * @param element  the value to use for this range, must not be {@code null}
     * @param comparator  the comparator to be used, null for natural ordering
     * @return the range object, not null
     * @throws IllegalArgumentException if the element is null
     * @throws ClassCastException if using natural ordering and the elements are not {@code Comparable}
     */
    public static <T> Range<T> is(final T element, final Comparator<T> comparator) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5340);
        __CLR4_1_244a44al3lqxrwl.R.inc(5341);return between(element, element, comparator);
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Obtains a range with the specified minimum and maximum values (both inclusive).</p>
     * 
     * <p>The range uses the natural ordering of the elements to determine where
     * values lie in the range.</p>
     *
     * <p>The arguments may be passed in the order (min,max) or (max,min).
     * The getMinimum and getMaximum methods will return the correct values.</p>
     *
     * @param <T> the type of the elements in this range
     * @param fromInclusive  the first value that defines the edge of the range, inclusive
     * @param toInclusive  the second value that defines the edge of the range, inclusive
     * @return the range object, not null
     * @throws IllegalArgumentException if either element is null
     * @throws ClassCastException if the elements are not {@code Comparable}
     */
    public static <T extends Comparable<T>> Range<T> between(final T fromInclusive, final T toInclusive) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5342);
        __CLR4_1_244a44al3lqxrwl.R.inc(5343);return between(fromInclusive, toInclusive, null);
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Obtains a range with the specified minimum and maximum values (both inclusive).</p>
     * 
     * <p>The range uses the specified {@code Comparator} to determine where
     * values lie in the range.</p>
     *
     * <p>The arguments may be passed in the order (min,max) or (max,min).
     * The getMinimum and getMaximum methods will return the correct values.</p>
     *
     * @param <T> the type of the elements in this range
     * @param fromInclusive  the first value that defines the edge of the range, inclusive
     * @param toInclusive  the second value that defines the edge of the range, inclusive
     * @param comparator  the comparator to be used, null for natural ordering
     * @return the range object, not null
     * @throws IllegalArgumentException if either element is null
     * @throws ClassCastException if using natural ordering and the elements are not {@code Comparable}
     */
    public static <T> Range<T> between(final T fromInclusive, final T toInclusive, final Comparator<T> comparator) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5344);
        __CLR4_1_244a44al3lqxrwl.R.inc(5345);return new Range<T>(fromInclusive, toInclusive, comparator);
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * Creates an instance.
     *
     * @param element1  the first element, not null
     * @param element2  the second element, not null
     * @param comparator  the comparator to be used, null for natural ordering
     */
    @SuppressWarnings("unchecked")
    private Range(final T element1, final T element2, Comparator<T> comparator) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5346);
        __CLR4_1_244a44al3lqxrwl.R.inc(5347);if ((((element1 == null || element2 == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5348)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5349)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5350);throw new IllegalArgumentException("Elements in a range must not be null: element1=" +
                                               element1 + ", element2=" + element2);
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5351);if ((((comparator == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5352)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5353)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5354);comparator = ComparableComparator.INSTANCE;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5355);if ((((comparator.compare(element1, element2) < 1)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5356)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5357)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5358);this.minimum = element1;
            __CLR4_1_244a44al3lqxrwl.R.inc(5359);this.maximum = element2;
        } }else {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5360);this.minimum = element2;
            __CLR4_1_244a44al3lqxrwl.R.inc(5361);this.maximum = element1;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5362);this.comparator = comparator;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    // Accessors
    //--------------------------------------------------------------------

    /**
     * <p>Gets the minimum value in this range.</p>
     *
     * @return the minimum value in this range, not null
     */
    public T getMinimum() {try{__CLR4_1_244a44al3lqxrwl.R.inc(5363);
        __CLR4_1_244a44al3lqxrwl.R.inc(5364);return minimum;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Gets the maximum value in this range.</p>
     *
     * @return the maximum value in this range, not null
     */
    public T getMaximum() {try{__CLR4_1_244a44al3lqxrwl.R.inc(5365);
        __CLR4_1_244a44al3lqxrwl.R.inc(5366);return maximum;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Gets the comparator being used to determine if objects are within the range.</p>
     * 
     * <p>Natural ordering uses an internal comparator implementation, thus this
     * method never returns null. See {@link #isNaturalOrdering()}.</p>
     *
     * @return the comparator being used, not null
     */
    public Comparator<T> getComparator() {try{__CLR4_1_244a44al3lqxrwl.R.inc(5367);
        __CLR4_1_244a44al3lqxrwl.R.inc(5368);return comparator;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Whether or not the Range is using the natural ordering of the elements.</p>
     * 
     * <p>Natural ordering uses an internal comparator implementation, thus this
     * method is the only way to check if a null comparator was specified.</p>
     *
     * @return true if using natural ordering
     */
    public boolean isNaturalOrdering() {try{__CLR4_1_244a44al3lqxrwl.R.inc(5369);
        __CLR4_1_244a44al3lqxrwl.R.inc(5370);return comparator == ComparableComparator.INSTANCE;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    // Element tests
    //--------------------------------------------------------------------

    /**
     * <p>Checks whether the specified element occurs within this range.</p>
     *
     * @param element  the element to check for, null returns false
     * @return true if the specified element occurs within this range
     */
    public boolean contains(final T element) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5371);
        __CLR4_1_244a44al3lqxrwl.R.inc(5372);if ((((element == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5373)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5374)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5375);return false;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5376);return comparator.compare(element, minimum) > -1 && comparator.compare(element, maximum) < 1;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Checks whether this range is after the specified element.</p>
     *
     * @param element  the element to check for, null returns false
     * @return true if this range is entirely after the specified element
     */
    public boolean isAfter(final T element) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5377);
        __CLR4_1_244a44al3lqxrwl.R.inc(5378);if ((((element == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5379)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5380)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5381);return false;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5382);return comparator.compare(element, minimum) < 0;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Checks whether this range starts with the specified element.</p>
     *
     * @param element  the element to check for, null returns false
     * @return true if the specified element occurs within this range
     */
    public boolean isStartedBy(final T element) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5383);
        __CLR4_1_244a44al3lqxrwl.R.inc(5384);if ((((element == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5385)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5386)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5387);return false;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5388);return comparator.compare(element, minimum) == 0;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Checks whether this range starts with the specified element.</p>
     *
     * @param element  the element to check for, null returns false
     * @return true if the specified element occurs within this range
     */
    public boolean isEndedBy(final T element) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5389);
        __CLR4_1_244a44al3lqxrwl.R.inc(5390);if ((((element == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5391)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5392)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5393);return false;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5394);return comparator.compare(element, maximum) == 0;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Checks whether this range is before the specified element.</p>
     *
     * @param element  the element to check for, null returns false
     * @return true if this range is entirely before the specified element
     */
    public boolean isBefore(final T element) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5395);
        __CLR4_1_244a44al3lqxrwl.R.inc(5396);if ((((element == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5397)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5398)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5399);return false;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5400);return comparator.compare(element, maximum) > 0;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Checks where the specified element occurs relative to this range.</p>
     * 
     * <p>The API is reminiscent of the Comparable interface returning {@code -1} if
     * the element is before the range, {@code 0} if contained within the range and
     * {@code 1} if the element is after the range. </p>
     *
     * @param element  the element to check for, not null
     * @return -1, 0 or +1 depending on the element's location relative to the range
     */
    public int elementCompareTo(final T element) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5401);
        __CLR4_1_244a44al3lqxrwl.R.inc(5402);if ((((element == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5403)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5404)==0&false))) {{
            // Comparable API says throw NPE on null
            __CLR4_1_244a44al3lqxrwl.R.inc(5405);throw new NullPointerException("Element is null");
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5406);if ((((isAfter(element))&&(__CLR4_1_244a44al3lqxrwl.R.iget(5407)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5408)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5409);return -1;
        } }else {__CLR4_1_244a44al3lqxrwl.R.inc(5410);if ((((isBefore(element))&&(__CLR4_1_244a44al3lqxrwl.R.iget(5411)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5412)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5413);return 1;
        } }else {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5414);return 0;
        }
    }}}finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    // Range tests
    //--------------------------------------------------------------------

    /**
     * <p>Checks whether this range contains all the elements of the specified range.</p>
     *
     * <p>This method may fail if the ranges have two different comparators or element types.</p>
     *
     * @param otherRange  the range to check, null returns false
     * @return true if this range contains the specified range
     * @throws RuntimeException if ranges cannot be compared
     */
    public boolean containsRange(final Range<T> otherRange) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5415);
        __CLR4_1_244a44al3lqxrwl.R.inc(5416);if ((((otherRange == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5417)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5418)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5419);return false;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5420);return contains(otherRange.minimum)
            && contains(otherRange.maximum);
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Checks whether this range is completely after the specified range.</p>
     *
     * <p>This method may fail if the ranges have two different comparators or element types.</p>
     *
     * @param otherRange  the range to check, null returns false
     * @return true if this range is completely after the specified range
     * @throws RuntimeException if ranges cannot be compared
     */
    public boolean isAfterRange(final Range<T> otherRange) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5421);
        __CLR4_1_244a44al3lqxrwl.R.inc(5422);if ((((otherRange == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5423)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5424)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5425);return false;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5426);return isAfter(otherRange.maximum);
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Checks whether this range is overlapped by the specified range.</p>
     * 
     * <p>Two ranges overlap if there is at least one element in common.</p>
     *
     * <p>This method may fail if the ranges have two different comparators or element types.</p>
     *
     * @param otherRange  the range to test, null returns false
     * @return true if the specified range overlaps with this
     *  range; otherwise, {@code false}
     * @throws RuntimeException if ranges cannot be compared
     */
    public boolean isOverlappedBy(final Range<T> otherRange) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5427);
        __CLR4_1_244a44al3lqxrwl.R.inc(5428);if ((((otherRange == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5429)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5430)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5431);return false;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5432);return otherRange.contains(minimum)
            || otherRange.contains(maximum)
            || contains(otherRange.minimum);
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Checks whether this range is completely before the specified range.</p>
     *
     * <p>This method may fail if the ranges have two different comparators or element types.</p>
     *
     * @param otherRange  the range to check, null returns false
     * @return true if this range is completely before the specified range
     * @throws RuntimeException if ranges cannot be compared
     */
    public boolean isBeforeRange(final Range<T> otherRange) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5433);
        __CLR4_1_244a44al3lqxrwl.R.inc(5434);if ((((otherRange == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5435)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5436)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5437);return false;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5438);return isBefore(otherRange.minimum);
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * Calculate the intersection of {@code this} and an overlapping Range.
     * @param other overlapping Range
     * @return range representing the intersection of {@code this} and {@code other} ({@code this} if equal)
     * @throws IllegalArgumentException if {@code other} does not overlap {@code this}
     * @since 3.0.1
     */
    public Range<T> intersectionWith(final Range<T> other) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5439);
        __CLR4_1_244a44al3lqxrwl.R.inc(5440);if ((((!this.isOverlappedBy(other))&&(__CLR4_1_244a44al3lqxrwl.R.iget(5441)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5442)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5443);throw new IllegalArgumentException(String.format(
                "Cannot calculate intersection with non-overlapping range %s", other));
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5444);if ((((this.equals(other))&&(__CLR4_1_244a44al3lqxrwl.R.iget(5445)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5446)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5447);return this;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5448);final T min = (((getComparator().compare(minimum, other.minimum) < 0 )&&(__CLR4_1_244a44al3lqxrwl.R.iget(5449)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5450)==0&false))? other.minimum : minimum;
        __CLR4_1_244a44al3lqxrwl.R.inc(5451);final T max = (((getComparator().compare(maximum, other.maximum) < 0 )&&(__CLR4_1_244a44al3lqxrwl.R.iget(5452)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5453)==0&false))? maximum : other.maximum;
        __CLR4_1_244a44al3lqxrwl.R.inc(5454);return between(min, max, getComparator());
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    // Basics
    //--------------------------------------------------------------------

    /**
     * <p>Compares this range to another object to test if they are equal.</p>.
     *
     * <p>To be equal, the minimum and maximum values must be equal, which
     * ignores any differences in the comparator.</p>
     *
     * @param obj the reference object with which to compare
     * @return true if this object is equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5455);
        __CLR4_1_244a44al3lqxrwl.R.inc(5456);if ((((obj == this)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5457)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5458)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5459);return true;
        } }else {__CLR4_1_244a44al3lqxrwl.R.inc(5460);if ((((obj == null || obj.getClass() != getClass())&&(__CLR4_1_244a44al3lqxrwl.R.iget(5461)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5462)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5463);return false;
        } }else {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5464);@SuppressWarnings("unchecked") // OK because we checked the class above
            final
            Range<T> range = (Range<T>) obj;
            __CLR4_1_244a44al3lqxrwl.R.inc(5465);return minimum.equals(range.minimum) &&
                   maximum.equals(range.maximum);
        }
    }}}finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Gets a suitable hash code for the range.</p>
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_1_244a44al3lqxrwl.R.inc(5466);
        __CLR4_1_244a44al3lqxrwl.R.inc(5467);int result = hashCode;
        __CLR4_1_244a44al3lqxrwl.R.inc(5468);if ((((hashCode == 0)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5469)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5470)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5471);result = 17;
            __CLR4_1_244a44al3lqxrwl.R.inc(5472);result = 37 * result + getClass().hashCode();
            __CLR4_1_244a44al3lqxrwl.R.inc(5473);result = 37 * result + minimum.hashCode();
            __CLR4_1_244a44al3lqxrwl.R.inc(5474);result = 37 * result + maximum.hashCode();
            __CLR4_1_244a44al3lqxrwl.R.inc(5475);hashCode = result;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5476);return result;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Gets the range as a {@code String}.</p>
     *
     * <p>The format of the String is '[<i>min</i>..<i>max</i>]'.</p>
     *
     * @return the {@code String} representation of this range
     */
    @Override
    public String toString() {try{__CLR4_1_244a44al3lqxrwl.R.inc(5477);
        __CLR4_1_244a44al3lqxrwl.R.inc(5478);String result = toString;
        __CLR4_1_244a44al3lqxrwl.R.inc(5479);if ((((result == null)&&(__CLR4_1_244a44al3lqxrwl.R.iget(5480)!=0|true))||(__CLR4_1_244a44al3lqxrwl.R.iget(5481)==0&false))) {{
            __CLR4_1_244a44al3lqxrwl.R.inc(5482);final StringBuilder buf = new StringBuilder(32);
            __CLR4_1_244a44al3lqxrwl.R.inc(5483);buf.append('[');
            __CLR4_1_244a44al3lqxrwl.R.inc(5484);buf.append(minimum);
            __CLR4_1_244a44al3lqxrwl.R.inc(5485);buf.append("..");
            __CLR4_1_244a44al3lqxrwl.R.inc(5486);buf.append(maximum);
            __CLR4_1_244a44al3lqxrwl.R.inc(5487);buf.append(']');
            __CLR4_1_244a44al3lqxrwl.R.inc(5488);result = buf.toString();
            __CLR4_1_244a44al3lqxrwl.R.inc(5489);toString = result;
        }
        }__CLR4_1_244a44al3lqxrwl.R.inc(5490);return result;
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    /**
     * <p>Formats the receiver using the given format.</p>
     * 
     * <p>This uses {@link java.util.Formattable} to perform the formatting. Three variables may
     * be used to embed the minimum, maximum and comparator.
     * Use {@code %1$s} for the minimum element, {@code %2$s} for the maximum element
     * and {@code %3$s} for the comparator.
     * The default format used by {@code toString()} is {@code [%1$s..%2$s]}.</p>
     * 
     * @param format  the format string, optionally containing {@code %1$s}, {@code %2$s} and  {@code %3$s}, not null
     * @return the formatted string, not null
     */
    public String toString(final String format) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5491);
        __CLR4_1_244a44al3lqxrwl.R.inc(5492);return String.format(format, minimum, maximum, comparator);
    }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings({"rawtypes", "unchecked"})
    private enum ComparableComparator implements Comparator {
        INSTANCE;
        /**
         * Comparable based compare implementation. 
         *
         * @param obj1 left hand side of comparison
         * @param obj2 right hand side of comparison
         * @return negative, 0, positive comparison value
         */
        @Override
        public int compare(final Object obj1, final Object obj2) {try{__CLR4_1_244a44al3lqxrwl.R.inc(5493);
            __CLR4_1_244a44al3lqxrwl.R.inc(5494);return ((Comparable) obj1).compareTo(obj2);
        }finally{__CLR4_1_244a44al3lqxrwl.R.flushNeeded();}}
    }

}
