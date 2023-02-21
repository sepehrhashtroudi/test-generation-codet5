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
package org.apache.commons.lang3.math;

import java.math.BigInteger;

/**
 * <p><code>Fraction</code> is a <code>Number</code> implementation that
 * stores fractions accurately.</p>
 *
 * <p>This class is immutable, and interoperable with most methods that accept
 * a <code>Number</code>.</p>
 *
 * <p>Note that this class is intended for common use cases, it is <i>int</i>
 * based and thus suffers from various overflow issues. For a BigInteger based 
 * equivalent, please see the Commons Math BigFraction class. </p>
 *
 * @since 2.0
 * @version $Id$
 */
public final class Fraction extends Number implements Comparable<Fraction> {public static class __CLR4_1_28yc8ycl3lqxsfo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,12048,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support. Lang version 2.0.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 65382027393090L;

    /**
     * <code>Fraction</code> representation of 0.
     */
    public static final Fraction ZERO = new Fraction(0, 1);
    /**
     * <code>Fraction</code> representation of 1.
     */
    public static final Fraction ONE = new Fraction(1, 1);
    /**
     * <code>Fraction</code> representation of 1/2.
     */
    public static final Fraction ONE_HALF = new Fraction(1, 2);
    /**
     * <code>Fraction</code> representation of 1/3.
     */
    public static final Fraction ONE_THIRD = new Fraction(1, 3);
    /**
     * <code>Fraction</code> representation of 2/3.
     */
    public static final Fraction TWO_THIRDS = new Fraction(2, 3);
    /**
     * <code>Fraction</code> representation of 1/4.
     */
    public static final Fraction ONE_QUARTER = new Fraction(1, 4);
    /**
     * <code>Fraction</code> representation of 2/4.
     */
    public static final Fraction TWO_QUARTERS = new Fraction(2, 4);
    /**
     * <code>Fraction</code> representation of 3/4.
     */
    public static final Fraction THREE_QUARTERS = new Fraction(3, 4);
    /**
     * <code>Fraction</code> representation of 1/5.
     */
    public static final Fraction ONE_FIFTH = new Fraction(1, 5);
    /**
     * <code>Fraction</code> representation of 2/5.
     */
    public static final Fraction TWO_FIFTHS = new Fraction(2, 5);
    /**
     * <code>Fraction</code> representation of 3/5.
     */
    public static final Fraction THREE_FIFTHS = new Fraction(3, 5);
    /**
     * <code>Fraction</code> representation of 4/5.
     */
    public static final Fraction FOUR_FIFTHS = new Fraction(4, 5);


    /**
     * The numerator number part of the fraction (the three in three sevenths).
     */
    private final int numerator;
    /**
     * The denominator number part of the fraction (the seven in three sevenths).
     */
    private final int denominator;

    /**
     * Cached output hashCode (class is immutable).
     */
    private transient int hashCode = 0;
    /**
     * Cached output toString (class is immutable).
     */
    private transient String toString = null;
    /**
     * Cached output toProperString (class is immutable).
     */
    private transient String toProperString = null;

    /**
     * <p>Constructs a <code>Fraction</code> instance with the 2 parts
     * of a fraction Y/Z.</p>
     *
     * @param numerator  the numerator, for example the three in 'three sevenths'
     * @param denominator  the denominator, for example the seven in 'three sevenths'
     */
    private Fraction(final int numerator, final int denominator) {
        super();__CLR4_1_28yc8ycl3lqxsfo.R.inc(11605);try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11604);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11606);this.numerator = numerator;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11607);this.denominator = denominator;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Creates a <code>Fraction</code> instance with the 2 parts
     * of a fraction Y/Z.</p>
     *
     * <p>Any negative signs are resolved to be on the numerator.</p>
     *
     * @param numerator  the numerator, for example the three in 'three sevenths'
     * @param denominator  the denominator, for example the seven in 'three sevenths'
     * @return a new fraction instance
     * @throws ArithmeticException if the denominator is <code>zero</code>
     * or the denominator is {@code negative} and the numerator is {@code Integer#MIN_VALUE}
     */
    public static Fraction getFraction(int numerator, int denominator) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11608);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11609);if ((((denominator == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11610)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11611)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11612);throw new ArithmeticException("The denominator must not be zero");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11613);if ((((denominator < 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11614)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11615)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11616);if ((((numerator==Integer.MIN_VALUE ||
                    denominator==Integer.MIN_VALUE)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11617)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11618)==0&false))) {{
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11619);throw new ArithmeticException("overflow: can't negate");
            }
            }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11620);numerator = -numerator;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11621);denominator = -denominator;
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11622);return new Fraction(numerator, denominator);
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Creates a <code>Fraction</code> instance with the 3 parts
     * of a fraction X Y/Z.</p>
     *
     * <p>The negative sign must be passed in on the whole number part.</p>
     *
     * @param whole  the whole number, for example the one in 'one and three sevenths'
     * @param numerator  the numerator, for example the three in 'one and three sevenths'
     * @param denominator  the denominator, for example the seven in 'one and three sevenths'
     * @return a new fraction instance
     * @throws ArithmeticException if the denominator is <code>zero</code>
     * @throws ArithmeticException if the denominator is negative
     * @throws ArithmeticException if the numerator is negative
     * @throws ArithmeticException if the resulting numerator exceeds 
     *  <code>Integer.MAX_VALUE</code>
     */
    public static Fraction getFraction(final int whole, final int numerator, final int denominator) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11623);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11624);if ((((denominator == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11625)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11626)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11627);throw new ArithmeticException("The denominator must not be zero");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11628);if ((((denominator < 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11629)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11630)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11631);throw new ArithmeticException("The denominator must not be negative");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11632);if ((((numerator < 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11633)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11634)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11635);throw new ArithmeticException("The numerator must not be negative");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11636);long numeratorValue;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11637);if ((((whole < 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11638)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11639)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11640);numeratorValue = whole * (long)denominator - numerator;
        } }else {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11641);numeratorValue = whole * (long)denominator + numerator;
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11642);if ((((numeratorValue < Integer.MIN_VALUE ||
                numeratorValue > Integer.MAX_VALUE)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11643)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11644)==0&false)))  {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11645);throw new ArithmeticException("Numerator too large to represent as an Integer.");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11646);return new Fraction((int) numeratorValue, denominator);
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Creates a reduced <code>Fraction</code> instance with the 2 parts
     * of a fraction Y/Z.</p>
     *
     * <p>For example, if the input parameters represent 2/4, then the created
     * fraction will be 1/2.</p>
     *
     * <p>Any negative signs are resolved to be on the numerator.</p>
     *
     * @param numerator  the numerator, for example the three in 'three sevenths'
     * @param denominator  the denominator, for example the seven in 'three sevenths'
     * @return a new fraction instance, with the numerator and denominator reduced
     * @throws ArithmeticException if the denominator is <code>zero</code>
     */
    public static Fraction getReducedFraction(int numerator, int denominator) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11647);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11648);if ((((denominator == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11649)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11650)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11651);throw new ArithmeticException("The denominator must not be zero");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11652);if ((((numerator==0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11653)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11654)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11655);return ZERO; // normalize zero.
        }
        // allow 2^k/-2^31 as a valid fraction (where k>0)
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11656);if ((((denominator==Integer.MIN_VALUE && (numerator&1)==0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11657)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11658)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11659);numerator/=2; __CLR4_1_28yc8ycl3lqxsfo.R.inc(11660);denominator/=2;
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11661);if ((((denominator < 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11662)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11663)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11664);if ((((numerator==Integer.MIN_VALUE ||
                    denominator==Integer.MIN_VALUE)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11665)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11666)==0&false))) {{
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11667);throw new ArithmeticException("overflow: can't negate");
            }
            }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11668);numerator = -numerator;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11669);denominator = -denominator;
        }
        // simplify fraction.
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11670);final int gcd = greatestCommonDivisor(numerator, denominator);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11671);numerator /= gcd;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11672);denominator /= gcd;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11673);return new Fraction(numerator, denominator);
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Creates a <code>Fraction</code> instance from a <code>double</code> value.</p>
     *
     * <p>This method uses the <a href="http://archives.math.utk.edu/articles/atuyl/confrac/">
     *  continued fraction algorithm</a>, computing a maximum of
     *  25 convergents and bounding the denominator by 10,000.</p>
     *
     * @param value  the double value to convert
     * @return a new fraction instance that is close to the value
     * @throws ArithmeticException if <code>|value| > Integer.MAX_VALUE</code> 
     *  or <code>value = NaN</code>
     * @throws ArithmeticException if the calculated denominator is <code>zero</code>
     * @throws ArithmeticException if the the algorithm does not converge
     */
    public static Fraction getFraction(double value) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11674);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11675);final int sign = (((value < 0 )&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11676)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11677)==0&false))? -1 : 1;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11678);value = Math.abs(value);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11679);if ((((value  > Integer.MAX_VALUE || Double.isNaN(value))&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11680)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11681)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11682);throw new ArithmeticException
                ("The value must not be greater than Integer.MAX_VALUE or NaN");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11683);final int wholeNumber = (int) value;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11684);value -= wholeNumber;
        
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11685);int numer0 = 0;  // the pre-previous
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11686);int denom0 = 1;  // the pre-previous
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11687);int numer1 = 1;  // the previous
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11688);int denom1 = 0;  // the previous
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11689);int numer2 = 0;  // the current, setup in calculation
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11690);int denom2 = 0;  // the current, setup in calculation
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11691);int a1 = (int) value;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11692);int a2 = 0;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11693);double x1 = 1;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11694);double x2 = 0;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11695);double y1 = value - a1;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11696);double y2 = 0;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11697);double delta1, delta2 = Double.MAX_VALUE;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11698);double fraction;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11699);int i = 1;
//        System.out.println("---");
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11700);do {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11701);delta1 = delta2;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11702);a2 = (int) (x1 / y1);
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11703);x2 = y1;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11704);y2 = x1 - a2 * y1;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11705);numer2 = a1 * numer1 + numer0;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11706);denom2 = a1 * denom1 + denom0;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11707);fraction = (double) numer2 / (double) denom2;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11708);delta2 = Math.abs(value - fraction);
//            System.out.println(numer2 + " " + denom2 + " " + fraction + " " + delta2 + " " + y1);
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11709);a1 = a2;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11710);x1 = x2;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11711);y1 = y2;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11712);numer0 = numer1;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11713);denom0 = denom1;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11714);numer1 = numer2;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11715);denom1 = denom2;
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11716);i++;
//            System.out.println(">>" + delta1 +" "+ delta2+" "+(delta1 > delta2)+" "+i+" "+denom2);
        } }while ((((delta1 > delta2 && denom2 <= 10000 && denom2 > 0 && i < 25)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11717)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11718)==0&false)));
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11719);if ((((i == 25)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11720)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11721)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11722);throw new ArithmeticException("Unable to convert double to fraction");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11723);return getReducedFraction((numer0 + wholeNumber * denom0) * sign, denom0);
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Creates a Fraction from a <code>String</code>.</p>
     *
     * <p>The formats accepted are:</p>
     *
     * <ol>
     *  <li><code>double</code> String containing a dot</li>
     *  <li>'X Y/Z'</li>
     *  <li>'Y/Z'</li>
     *  <li>'X' (a simple whole number)</li>
     * </ol>
     * and a .</p>
     *
     * @param str  the string to parse, must not be <code>null</code>
     * @return the new <code>Fraction</code> instance
     * @throws IllegalArgumentException if the string is <code>null</code>
     * @throws NumberFormatException if the number format is invalid
     */
    public static Fraction getFraction(String str) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11724);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11725);if ((((str == null)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11726)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11727)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11728);throw new IllegalArgumentException("The string must not be null");
        }
        // parse double format
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11729);int pos = str.indexOf('.');
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11730);if ((((pos >= 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11731)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11732)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11733);return getFraction(Double.parseDouble(str));
        }

        // parse X Y/Z format
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11734);pos = str.indexOf(' ');
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11735);if ((((pos > 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11736)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11737)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11738);final int whole = Integer.parseInt(str.substring(0, pos));
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11739);str = str.substring(pos + 1);
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11740);pos = str.indexOf('/');
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11741);if ((((pos < 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11742)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11743)==0&false))) {{
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11744);throw new NumberFormatException("The fraction could not be parsed as the format X Y/Z");
            } }else {{
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11745);final int numer = Integer.parseInt(str.substring(0, pos));
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11746);final int denom = Integer.parseInt(str.substring(pos + 1));
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11747);return getFraction(whole, numer, denom);
            }
        }}

        // parse Y/Z format
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11748);pos = str.indexOf('/');
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11749);if ((((pos < 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11750)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11751)==0&false))) {{
            // simple whole number
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11752);return getFraction(Integer.parseInt(str), 1);
        } }else {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11753);final int numer = Integer.parseInt(str.substring(0, pos));
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11754);final int denom = Integer.parseInt(str.substring(pos + 1));
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11755);return getFraction(numer, denom);
        }
    }}finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    // Accessors
    //-------------------------------------------------------------------

    /**
     * <p>Gets the numerator part of the fraction.</p>
     *
     * <p>This method may return a value greater than the denominator, an
     * improper fraction, such as the seven in 7/4.</p>
     *
     * @return the numerator fraction part
     */
    public int getNumerator() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11756);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11757);return numerator;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets the denominator part of the fraction.</p>
     *
     * @return the denominator fraction part
     */
    public int getDenominator() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11758);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11759);return denominator;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets the proper numerator, always positive.</p>
     *
     * <p>An improper fraction 7/4 can be resolved into a proper one, 1 3/4.
     * This method returns the 3 from the proper fraction.</p>
     *
     * <p>If the fraction is negative such as -7/4, it can be resolved into
     * -1 3/4, so this method returns the positive proper numerator, 3.</p>
     *
     * @return the numerator fraction part of a proper fraction, always positive
     */
    public int getProperNumerator() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11760);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11761);return Math.abs(numerator % denominator);
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets the proper whole part of the fraction.</p>
     *
     * <p>An improper fraction 7/4 can be resolved into a proper one, 1 3/4.
     * This method returns the 1 from the proper fraction.</p>
     *
     * <p>If the fraction is negative such as -7/4, it can be resolved into
     * -1 3/4, so this method returns the positive whole part -1.</p>
     *
     * @return the whole fraction part of a proper fraction, that includes the sign
     */
    public int getProperWhole() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11762);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11763);return numerator / denominator;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    // Number methods
    //-------------------------------------------------------------------

    /**
     * <p>Gets the fraction as an <code>int</code>. This returns the whole number
     * part of the fraction.</p>
     *
     * @return the whole number fraction part
     */
    @Override
    public int intValue() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11764);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11765);return numerator / denominator;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>long</code>. This returns the whole number
     * part of the fraction.</p>
     *
     * @return the whole number fraction part
     */
    @Override
    public long longValue() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11766);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11767);return (long) numerator / denominator;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>float</code>. This calculates the fraction
     * as the numerator divided by denominator.</p>
     *
     * @return the fraction as a <code>float</code>
     */
    @Override
    public float floatValue() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11768);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11769);return (float) numerator / (float) denominator;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>double</code>. This calculates the fraction
     * as the numerator divided by denominator.</p>
     *
     * @return the fraction as a <code>double</code>
     */
    @Override
    public double doubleValue() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11770);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11771);return (double) numerator / (double) denominator;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    // Calculations
    //-------------------------------------------------------------------

    /**
     * <p>Reduce the fraction to the smallest values for the numerator and
     * denominator, returning the result.</p>
     * 
     * <p>For example, if this fraction represents 2/4, then the result
     * will be 1/2.</p>
     *
     * @return a new reduced fraction instance, or this if no simplification possible
     */
    public Fraction reduce() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11772);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11773);if ((((numerator == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11774)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11775)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11776);return (((equals(ZERO) )&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11777)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11778)==0&false))? this : ZERO;
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11779);final int gcd = greatestCommonDivisor(Math.abs(numerator), denominator);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11780);if ((((gcd == 1)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11781)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11782)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11783);return this;
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11784);return Fraction.getFraction(numerator / gcd, denominator / gcd);
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is the inverse (1/fraction) of this one.</p>
     * 
     * <p>The returned fraction is not reduced.</p>
     *
     * @return a new fraction instance with the numerator and denominator
     *         inverted.
     * @throws ArithmeticException if the fraction represents zero.
     */
    public Fraction invert() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11785);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11786);if ((((numerator == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11787)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11788)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11789);throw new ArithmeticException("Unable to invert zero.");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11790);if ((((numerator==Integer.MIN_VALUE)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11791)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11792)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11793);throw new ArithmeticException("overflow: can't negate numerator");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11794);if ((((numerator<0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11795)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11796)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11797);return new Fraction(-denominator, -numerator);
        } }else {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11798);return new Fraction(denominator, numerator);
        }
    }}finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is the negative (-fraction) of this one.</p>
     *
     * <p>The returned fraction is not reduced.</p>
     *
     * @return a new fraction instance with the opposite signed numerator
     */
    public Fraction negate() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11799);
        // the positive range is one smaller than the negative range of an int.
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11800);if ((((numerator==Integer.MIN_VALUE)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11801)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11802)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11803);throw new ArithmeticException("overflow: too large to negate");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11804);return new Fraction(-numerator, denominator);
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is the positive equivalent of this one.</p>
     * <p>More precisely: <code>(fraction >= 0 ? this : -fraction)</code></p>
     *
     * <p>The returned fraction is not reduced.</p>
     *
     * @return <code>this</code> if it is positive, or a new positive fraction
     *  instance with the opposite signed numerator
     */
    public Fraction abs() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11805);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11806);if ((((numerator >= 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11807)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11808)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11809);return this;
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11810);return negate();
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets a fraction that is raised to the passed in power.</p>
     *
     * <p>The returned fraction is in reduced form.</p>
     *
     * @param power  the power to raise the fraction to
     * @return <code>this</code> if the power is one, <code>ONE</code> if the power
     * is zero (even if the fraction equals ZERO) or a new fraction instance 
     * raised to the appropriate power
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction pow(final int power) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11811);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11812);if ((((power == 1)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11813)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11814)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11815);return this;
        } }else {__CLR4_1_28yc8ycl3lqxsfo.R.inc(11816);if ((((power == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11817)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11818)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11819);return ONE;
        } }else {__CLR4_1_28yc8ycl3lqxsfo.R.inc(11820);if ((((power < 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11821)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11822)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11823);if ((((power==Integer.MIN_VALUE)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11824)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11825)==0&false))) {{ // MIN_VALUE can't be negated.
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11826);return this.invert().pow(2).pow(-(power/2));
            }
            }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11827);return this.invert().pow(-power);
        } }else {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11828);final Fraction f = this.multiplyBy(this);
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11829);if ((((power % 2 == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11830)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11831)==0&false))) {{ // if even...
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11832);return f.pow(power/2);
            } }else {{ // if odd...
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11833);return f.pow(power/2).multiplyBy(this);
            }
        }}
    }}}}finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets the greatest common divisor of the absolute value of
     * two numbers, using the "binary gcd" method which avoids
     * division and modulo operations.  See Knuth 4.5.2 algorithm B.
     * This algorithm is due to Josef Stein (1961).</p>
     *
     * @param u  a non-zero number
     * @param v  a non-zero number
     * @return the greatest common divisor, never zero
     */
    private static int greatestCommonDivisor(int u, int v) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11834);
        // From Commons Math:
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11835);if ((((u == 0 || v == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11836)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11837)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11838);if ((((u == Integer.MIN_VALUE || v == Integer.MIN_VALUE)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11839)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11840)==0&false))) {{
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11841);throw new ArithmeticException("overflow: gcd is 2^31");
            }
            }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11842);return Math.abs(u) + Math.abs(v);
        }
        //if either operand is abs 1, return 1:
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11843);if ((((Math.abs(u) == 1 || Math.abs(v) == 1)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11844)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11845)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11846);return 1;
        }
        // keep u and v negative, as negative integers range down to
        // -2^31, while positive numbers can only be as large as 2^31-1
        // (i.e. we can't necessarily negate a negative number without
        // overflow)
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11847);if ((((u>0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11848)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11849)==0&false))) {{ __CLR4_1_28yc8ycl3lqxsfo.R.inc(11850);u=-u; } // make u negative
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11851);if ((((v>0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11852)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11853)==0&false))) {{ __CLR4_1_28yc8ycl3lqxsfo.R.inc(11854);v=-v; } // make v negative
        // B1. [Find power of 2]
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11855);int k=0;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11856);while (((((u&1)==0 && (v&1)==0 && k<31)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11857)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11858)==0&false))) {{ // while u and v are both even...
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11859);u/=2; __CLR4_1_28yc8ycl3lqxsfo.R.inc(11860);v/=2; __CLR4_1_28yc8ycl3lqxsfo.R.inc(11861);k++; // cast out twos.
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11862);if ((((k==31)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11863)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11864)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11865);throw new ArithmeticException("overflow: gcd is 2^31");
        }
        // B2. Initialize: u and v have been divided by 2^k and at least
        //     one is odd.
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11866);int t = ((((u&1)==1 )&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11867)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11868)==0&false))? v : -(u/2)/*B3*/;
        // t negative: u was odd, v may be even (t replaces v)
        // t positive: u was even, v is odd (t replaces u)
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11869);do {{
            /* assert u<0 && v<0; */
            // B4/B3: cast out twos from t.
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11870);while (((((t&1)==0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11871)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11872)==0&false))) {{ // while t is even..
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11873);t/=2; // cast out twos
            }
            // B5 [reset max(u,v)]
            }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11874);if ((((t>0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11875)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11876)==0&false))) {{
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11877);u = -t;
            } }else {{
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(11878);v = t;
            }
            // B6/B3. at this point both u and v should be odd.
            }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11879);t = (v - u)/2;
            // |u| larger: t positive (replace u)
            // |v| larger: t negative (replace v)
        } }while ((((t!=0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11880)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11881)==0&false)));
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11882);return -u*(1<<k); // gcd is u*2^k
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    // Arithmetic
    //-------------------------------------------------------------------

    /** 
     * Multiply two integers, checking for overflow.
     * 
     * @param x a factor
     * @param y a factor
     * @return the product <code>x*y</code>
     * @throws ArithmeticException if the result can not be represented as
     *                             an int
     */
    private static int mulAndCheck(final int x, final int y) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11883);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11884);final long m = (long)x*(long)y;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11885);if ((((m < Integer.MIN_VALUE ||
            m > Integer.MAX_VALUE)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11886)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11887)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11888);throw new ArithmeticException("overflow: mul");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11889);return (int)m;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}
    
    /**
     *  Multiply two non-negative integers, checking for overflow.
     * 
     * @param x a non-negative factor
     * @param y a non-negative factor
     * @return the product <code>x*y</code>
     * @throws ArithmeticException if the result can not be represented as
     * an int
     */
    private static int mulPosAndCheck(final int x, final int y) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11890);
        /* assert x>=0 && y>=0; */
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11891);final long m = (long)x*(long)y;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11892);if ((((m > Integer.MAX_VALUE)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11893)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11894)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11895);throw new ArithmeticException("overflow: mulPos");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11896);return (int)m;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}
    
    /** 
     * Add two integers, checking for overflow.
     * 
     * @param x an addend
     * @param y an addend
     * @return the sum <code>x+y</code>
     * @throws ArithmeticException if the result can not be represented as
     * an int
     */
    private static int addAndCheck(final int x, final int y) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11897);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11898);final long s = (long)x+(long)y;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11899);if ((((s < Integer.MIN_VALUE ||
            s > Integer.MAX_VALUE)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11900)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11901)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11902);throw new ArithmeticException("overflow: add");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11903);return (int)s;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}
    
    /** 
     * Subtract two integers, checking for overflow.
     * 
     * @param x the minuend
     * @param y the subtrahend
     * @return the difference <code>x-y</code>
     * @throws ArithmeticException if the result can not be represented as
     * an int
     */
    private static int subAndCheck(final int x, final int y) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11904);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11905);final long s = (long)x-(long)y;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11906);if ((((s < Integer.MIN_VALUE ||
            s > Integer.MAX_VALUE)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11907)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11908)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11909);throw new ArithmeticException("overflow: add");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11910);return (int)s;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}
    
    /**
     * <p>Adds the value of this fraction to another, returning the result in reduced form.
     * The algorithm follows Knuth, 4.5.1.</p>
     *
     * @param fraction  the fraction to add, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction add(final Fraction fraction) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11911);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11912);return addSub(fraction, true /* add */);
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Subtracts the value of another fraction from the value of this one, 
     * returning the result in reduced form.</p>
     *
     * @param fraction  the fraction to subtract, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator
     *   cannot be represented in an <code>int</code>.
     */
    public Fraction subtract(final Fraction fraction) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11913);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11914);return addSub(fraction, false /* subtract */);
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /** 
     * Implement add and subtract using algorithm described in Knuth 4.5.1.
     * 
     * @param fraction the fraction to subtract, must not be <code>null</code>
     * @param isAdd true to add, false to subtract
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator
     *   cannot be represented in an <code>int</code>.
     */
    private Fraction addSub(final Fraction fraction, final boolean isAdd) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11915);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11916);if ((((fraction == null)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11917)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11918)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11919);throw new IllegalArgumentException("The fraction must not be null");
        }
        // zero is identity for addition.
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11920);if ((((numerator == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11921)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11922)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11923);return (((isAdd )&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11924)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11925)==0&false))? fraction : fraction.negate();
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11926);if ((((fraction.numerator == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11927)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11928)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11929);return this;
        }     
        // if denominators are randomly distributed, d1 will be 1 about 61%
        // of the time.
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11930);final int d1 = greatestCommonDivisor(denominator, fraction.denominator);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11931);if ((((d1==1)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11932)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11933)==0&false))) {{
            // result is ( (u*v' +/- u'v) / u'v')
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11934);final int uvp = mulAndCheck(numerator, fraction.denominator);
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11935);final int upv = mulAndCheck(fraction.numerator, denominator);
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11936);return new Fraction
                ((((isAdd )&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11937)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11938)==0&false))? addAndCheck(uvp, upv) : subAndCheck(uvp, upv),
                 mulPosAndCheck(denominator, fraction.denominator));
        }
        // the quantity 't' requires 65 bits of precision; see knuth 4.5.1
        // exercise 7.  we're going to use a BigInteger.
        // t = u(v'/d1) +/- v(u'/d1)
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11939);final BigInteger uvp = BigInteger.valueOf(numerator)
            .multiply(BigInteger.valueOf(fraction.denominator/d1));
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11940);final BigInteger upv = BigInteger.valueOf(fraction.numerator)
            .multiply(BigInteger.valueOf(denominator/d1));
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11941);final BigInteger t = (((isAdd )&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11942)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11943)==0&false))? uvp.add(upv) : uvp.subtract(upv);
        // but d2 doesn't need extra precision because
        // d2 = gcd(t,d1) = gcd(t mod d1, d1)
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11944);final int tmodd1 = t.mod(BigInteger.valueOf(d1)).intValue();
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11945);final int d2 = (((tmodd1==0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11946)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11947)==0&false))?d1:greatestCommonDivisor(tmodd1, d1);

        // result is (t/d2) / (u'/d1)(v'/d2)
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11948);final BigInteger w = t.divide(BigInteger.valueOf(d2));
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11949);if ((((w.bitLength() > 31)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11950)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11951)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11952);throw new ArithmeticException
                ("overflow: numerator too large after multiply");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11953);return new Fraction
            (w.intValue(),
             mulPosAndCheck(denominator/d1, fraction.denominator/d2));
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Multiplies the value of this fraction by another, returning the 
     * result in reduced form.</p>
     *
     * @param fraction  the fraction to multiply by, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction multiplyBy(final Fraction fraction) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11954);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11955);if ((((fraction == null)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11956)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11957)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11958);throw new IllegalArgumentException("The fraction must not be null");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11959);if ((((numerator == 0 || fraction.numerator == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11960)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11961)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11962);return ZERO;
        }
        // knuth 4.5.1
        // make sure we don't overflow unless the result *must* overflow.
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11963);final int d1 = greatestCommonDivisor(numerator, fraction.denominator);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11964);final int d2 = greatestCommonDivisor(fraction.numerator, denominator);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11965);return getReducedFraction
            (mulAndCheck(numerator/d1, fraction.numerator/d2),
             mulPosAndCheck(denominator/d2, fraction.denominator/d1));
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Divide the value of this fraction by another.</p>
     *
     * @param fraction  the fraction to divide by, must not be <code>null</code>
     * @return a <code>Fraction</code> instance with the resulting values
     * @throws IllegalArgumentException if the fraction is <code>null</code>
     * @throws ArithmeticException if the fraction to divide by is zero
     * @throws ArithmeticException if the resulting numerator or denominator exceeds
     *  <code>Integer.MAX_VALUE</code>
     */
    public Fraction divideBy(final Fraction fraction) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11966);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11967);if ((((fraction == null)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11968)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11969)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11970);throw new IllegalArgumentException("The fraction must not be null");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11971);if ((((fraction.numerator == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11972)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11973)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11974);throw new ArithmeticException("The fraction to divide by must not be zero");
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11975);return multiplyBy(fraction.invert());
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    // Basics
    //-------------------------------------------------------------------

    /**
     * <p>Compares this fraction to another object to test if they are equal.</p>.
     *
     * <p>To be equal, both values must be equal. Thus 2/4 is not equal to 1/2.</p>
     *
     * @param obj the reference object with which to compare
     * @return <code>true</code> if this object is equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11976);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11977);if ((((obj == this)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11978)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11979)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11980);return true;
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11981);if ((((obj instanceof Fraction == false)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11982)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11983)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11984);return false;
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11985);final Fraction other = (Fraction) obj;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11986);return getNumerator() == other.getNumerator() &&
                getDenominator() == other.getDenominator();
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets a hashCode for the fraction.</p>
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11987);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11988);if ((((hashCode == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11989)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11990)==0&false))) {{
            // hashcode update should be atomic.
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11991);hashCode = 37 * (37 * 17 + getNumerator()) + getDenominator();
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11992);return hashCode;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Compares this object to another based on size.</p>
     *
     * <p>Note: this class has a natural ordering that is inconsistent
     * with equals, because, for example, equals treats 1/2 and 2/4 as
     * different, whereas compareTo treats them as equal.
     *
     * @param other  the object to compare to
     * @return -1 if this is less, 0 if equal, +1 if greater
     * @throws ClassCastException if the object is not a <code>Fraction</code>
     * @throws NullPointerException if the object is <code>null</code>
     */
    @Override
    public int compareTo(final Fraction other) {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(11993);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(11994);if ((((this==other)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11995)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11996)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(11997);return 0;
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(11998);if ((((numerator == other.numerator && denominator == other.denominator)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(11999)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12000)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(12001);return 0;
        }

        // otherwise see which is less
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(12002);final long first = (long) numerator * (long) other.denominator;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(12003);final long second = (long) other.numerator * (long) denominator;
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(12004);if ((((first == second)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12005)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12006)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(12007);return 0;
        } }else {__CLR4_1_28yc8ycl3lqxsfo.R.inc(12008);if ((((first < second)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12009)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12010)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(12011);return -1;
        } }else {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(12012);return 1;
        }
    }}}finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a <code>String</code>.</p>
     *
     * <p>The format used is '<i>numerator</i>/<i>denominator</i>' always.
     *
     * @return a <code>String</code> form of the fraction
     */
    @Override
    public String toString() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(12013);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(12014);if ((((toString == null)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12015)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12016)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(12017);toString = new StringBuilder(32)
                .append(getNumerator())
                .append('/')
                .append(getDenominator()).toString();
        }
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(12018);return toString;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}

    /**
     * <p>Gets the fraction as a proper <code>String</code> in the format X Y/Z.</p>
     *
     * <p>The format used in '<i>wholeNumber</i> <i>numerator</i>/<i>denominator</i>'.
     * If the whole number is zero it will be omitted. If the numerator is zero,
     * only the whole number is returned.</p>
     *
     * @return a <code>String</code> form of the fraction
     */
    public String toProperString() {try{__CLR4_1_28yc8ycl3lqxsfo.R.inc(12019);
        __CLR4_1_28yc8ycl3lqxsfo.R.inc(12020);if ((((toProperString == null)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12021)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12022)==0&false))) {{
            __CLR4_1_28yc8ycl3lqxsfo.R.inc(12023);if ((((numerator == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12024)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12025)==0&false))) {{
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(12026);toProperString = "0";
            } }else {__CLR4_1_28yc8ycl3lqxsfo.R.inc(12027);if ((((numerator == denominator)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12028)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12029)==0&false))) {{
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(12030);toProperString = "1";
            } }else {__CLR4_1_28yc8ycl3lqxsfo.R.inc(12031);if ((((numerator == -1 * denominator)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12032)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12033)==0&false))) {{
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(12034);toProperString = "-1";
            } }else {__CLR4_1_28yc8ycl3lqxsfo.R.inc(12035);if ((((((((numerator>0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12036)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12037)==0&false))?-numerator:numerator) < -denominator)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12038)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12039)==0&false))) {{
                // note that we do the magnitude comparison test above with
                // NEGATIVE (not positive) numbers, since negative numbers
                // have a larger range.  otherwise numerator==Integer.MIN_VALUE
                // is handled incorrectly.
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(12040);final int properNumerator = getProperNumerator();
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(12041);if ((((properNumerator == 0)&&(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12042)!=0|true))||(__CLR4_1_28yc8ycl3lqxsfo.R.iget(12043)==0&false))) {{
                    __CLR4_1_28yc8ycl3lqxsfo.R.inc(12044);toProperString = Integer.toString(getProperWhole());
                } }else {{
                    __CLR4_1_28yc8ycl3lqxsfo.R.inc(12045);toProperString = new StringBuilder(32)
                        .append(getProperWhole()).append(' ')
                        .append(properNumerator).append('/')
                        .append(getDenominator()).toString();
                }
            }} }else {{
                __CLR4_1_28yc8ycl3lqxsfo.R.inc(12046);toProperString = new StringBuilder(32)
                    .append(getNumerator()).append('/')
                    .append(getDenominator()).toString();
            }
        }}}}}
        }__CLR4_1_28yc8ycl3lqxsfo.R.inc(12047);return toProperString;
    }finally{__CLR4_1_28yc8ycl3lqxsfo.R.flushNeeded();}}
}
