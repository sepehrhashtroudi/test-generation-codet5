/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ *//*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package org.apache.commons.lang3;

import java.util.UUID;


/**
 * <p>
 * Static methods to convert a type into another, with endianness and bit ordering awareness.
 * </p>
 * <p>
 * The methods names follow a naming rule:</br>
 * {@code <source type>[source endianness][source bit ordering]To<destination type>[destination endianness][destination bit ordering]}
 * </p>
 * <p>
 * Source/destination type fields is one of the following:
 * <ul>
 * <li>binary: an array of booleans</li>
 * <li>byte or byteArray</li>
 * <li>int or intArray</li>
 * <li>long or longArray</li>
 * <li>hex: a String containing hexadecimal digits (lowercase in destination)</li>
 * <li>hexDigit: a Char containing a hexadecimal digit (lowercase in destination)</li>
 * <li>uuid</li>
 * </ul>
 * Endianness field: little endian is the default, in this case the field is absent. In case of
 * big endian, the field is "Be".</br> Bit ordering: Lsb0 is the default, in this case the field
 * is absent. In case of Msb0, the field is "Msb0".
 * </p>
 * <p>
 * Example: intBeMsb0ToHex convert an int with big endian byte order and Msb0 bit order into its
 * hexadecimal string representation
 * </p>
 * <p>
 * Most of the methods provide only default encoding for destination, this limits the number of
 * ways to do one thing. Unless you are dealing with data from/to outside of the JVM platform,
 * you should not need to use "Be" and "Msb0" methods.
 * </p>
 * <p>
 * Development status: work on going, only a part of the little endian, Lsb0 methods implemented
 * so far.
 * </p>
 * 
 * @since Lang 3.2
 * @version $Id$
 */

@java.lang.SuppressWarnings({"fallthrough"}) public class Conversion {public static class __CLR4_1_22xg2xgl3lqxrtb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,4741,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * <p>
     * Converts a hexadecimal digit into an int using the default (Lsb0) bit ordering.
     * </p>
     * <p>
     * '1' is converted to 1
     * </p>
     * 
     * @param hexDigit the hexadecimal digit to convert
     * @return an int equals to {@code hexDigit}
     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit
     */
    public static int hexDigitToInt(final char hexDigit) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(3796);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3797);final int digit = Character.digit(hexDigit, 16);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3798);if ((((digit < 0)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3799)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3800)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3801);throw new IllegalArgumentException("Cannot interpret '"
                + hexDigit
                + "' as a hexadecimal digit");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(3802);return digit;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a hexadecimal digit into an int using the Msb0 bit ordering.
     * </p>
     * <p>
     * '1' is converted to 8
     * </p>
     * 
     * @param hexDigit the hexadecimal digit to convert
     * @return an int equals to {@code hexDigit}
     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit
     */
    public static int hexDigitMsb0ToInt(final char hexDigit) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(3803);
        boolean __CLB4_1_2_bool0=false;__CLR4_1_22xg2xgl3lqxrtb.R.inc(3804);switch (hexDigit) {
        case '0':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3805);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3806);return 0x0;
        case '1':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3807);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3808);return 0x8;
        case '2':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3809);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3810);return 0x4;
        case '3':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3811);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3812);return 0xC;
        case '4':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3813);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3814);return 0x2;
        case '5':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3815);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3816);return 0xA;
        case '6':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3817);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3818);return 0x6;
        case '7':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3819);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3820);return 0xE;
        case '8':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3821);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3822);return 0x1;
        case '9':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3823);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3824);return 0x9;
        case 'a':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3825);__CLB4_1_2_bool0=true;}// fall through
        case 'A':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3826);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3827);return 0x5;
        case 'b':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3828);__CLB4_1_2_bool0=true;}// fall through
        case 'B':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3829);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3830);return 0xD;
        case 'c':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3831);__CLB4_1_2_bool0=true;}// fall through
        case 'C':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3832);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3833);return 0x3;
        case 'd':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3834);__CLB4_1_2_bool0=true;}// fall through
        case 'D':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3835);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3836);return 0xB;
        case 'e':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3837);__CLB4_1_2_bool0=true;}// fall through
        case 'E':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3838);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3839);return 0x7;
        case 'f':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3840);__CLB4_1_2_bool0=true;}// fall through
        case 'F':if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3841);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3842);return 0xF;
        default:if (!__CLB4_1_2_bool0) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3843);__CLB4_1_2_bool0=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3844);throw new IllegalArgumentException("Cannot interpret '"
                + hexDigit
                + "' as a hexadecimal digit");
        }
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a hexadecimal digit into binary (represented as boolean array) using the default
     * (Lsb0) bit ordering.
     * </p>
     * <p>
     * '1' is converted as follow: (1, 0, 0, 0)
     * </p>
     * 
     * @param hexDigit the hexadecimal digit to convert
     * @return a boolean array with the binary representation of {@code hexDigit}
     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit
     */
    public static boolean[] hexDigitToBinary(final char hexDigit) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(3845);
        boolean __CLB4_1_2_bool1=false;__CLR4_1_22xg2xgl3lqxrtb.R.inc(3846);switch (hexDigit) {
        case '0':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3847);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3848);return new boolean[]{false, false, false, false};
        case '1':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3849);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3850);return new boolean[]{true, false, false, false};
        case '2':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3851);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3852);return new boolean[]{false, true, false, false};
        case '3':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3853);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3854);return new boolean[]{true, true, false, false};
        case '4':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3855);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3856);return new boolean[]{false, false, true, false};
        case '5':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3857);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3858);return new boolean[]{true, false, true, false};
        case '6':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3859);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3860);return new boolean[]{false, true, true, false};
        case '7':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3861);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3862);return new boolean[]{true, true, true, false};
        case '8':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3863);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3864);return new boolean[]{false, false, false, true};
        case '9':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3865);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3866);return new boolean[]{true, false, false, true};
        case 'a':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3867);__CLB4_1_2_bool1=true;}// fall through
        case 'A':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3868);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3869);return new boolean[]{false, true, false, true};
        case 'b':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3870);__CLB4_1_2_bool1=true;}// fall through
        case 'B':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3871);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3872);return new boolean[]{true, true, false, true};
        case 'c':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3873);__CLB4_1_2_bool1=true;}// fall through
        case 'C':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3874);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3875);return new boolean[]{false, false, true, true};
        case 'd':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3876);__CLB4_1_2_bool1=true;}// fall through
        case 'D':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3877);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3878);return new boolean[]{true, false, true, true};
        case 'e':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3879);__CLB4_1_2_bool1=true;}// fall through
        case 'E':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3880);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3881);return new boolean[]{false, true, true, true};
        case 'f':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3882);__CLB4_1_2_bool1=true;}// fall through
        case 'F':if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3883);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3884);return new boolean[]{true, true, true, true};
        default:if (!__CLB4_1_2_bool1) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3885);__CLB4_1_2_bool1=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3886);throw new IllegalArgumentException("Cannot interpret '"
                + hexDigit
                + "' as a hexadecimal digit");
        }
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a hexadecimal digit into binary (represented as boolean array) using the Msb0
     * bit ordering.
     * </p>
     * <p>
     * '1' is converted as follow: (0, 0, 0, 1)
     * </p>
     * 
     * @param hexDigit the hexadecimal digit to convert
     * @return a boolean array with the binary representation of {@code hexDigit}
     * @throws IllegalArgumentException if {@code hexDigit} is not a hexadecimal digit
     */
    public static boolean[] hexDigitMsb0ToBinary(final char hexDigit) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(3887);
        boolean __CLB4_1_2_bool2=false;__CLR4_1_22xg2xgl3lqxrtb.R.inc(3888);switch (hexDigit) {
        case '0':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3889);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3890);return new boolean[]{false, false, false, false};
        case '1':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3891);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3892);return new boolean[]{false, false, false, true};
        case '2':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3893);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3894);return new boolean[]{false, false, true, false};
        case '3':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3895);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3896);return new boolean[]{false, false, true, true};
        case '4':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3897);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3898);return new boolean[]{false, true, false, false};
        case '5':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3899);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3900);return new boolean[]{false, true, false, true};
        case '6':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3901);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3902);return new boolean[]{false, true, true, false};
        case '7':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3903);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3904);return new boolean[]{false, true, true, true};
        case '8':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3905);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3906);return new boolean[]{true, false, false, false};
        case '9':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3907);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3908);return new boolean[]{true, false, false, true};
        case 'a':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3909);__CLB4_1_2_bool2=true;}// fall through
        case 'A':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3910);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3911);return new boolean[]{true, false, true, false};
        case 'b':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3912);__CLB4_1_2_bool2=true;}// fall through
        case 'B':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3913);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3914);return new boolean[]{true, false, true, true};
        case 'c':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3915);__CLB4_1_2_bool2=true;}// fall through
        case 'C':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3916);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3917);return new boolean[]{true, true, false, false};
        case 'd':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3918);__CLB4_1_2_bool2=true;}// fall through
        case 'D':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3919);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3920);return new boolean[]{true, true, false, true};
        case 'e':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3921);__CLB4_1_2_bool2=true;}// fall through
        case 'E':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3922);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3923);return new boolean[]{true, true, true, false};
        case 'f':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3924);__CLB4_1_2_bool2=true;}// fall through
        case 'F':if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3925);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3926);return new boolean[]{true, true, true, true};
        default:if (!__CLB4_1_2_bool2) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(3927);__CLB4_1_2_bool2=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3928);throw new IllegalArgumentException("Cannot interpret '"
                + hexDigit
                + "' as a hexadecimal digit");
        }
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) to a hexadecimal digit using the default
     * (Lsb0) bit ordering.
     * </p>
     * <p>
     * (1, 0, 0, 0) is converted as follow: '1'
     * </p>
     * 
     * @param src the binary to convert
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryToHexDigit(final boolean[] src) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(3929);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3930);return binaryToHexDigit(src, 0);
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) to a hexadecimal digit using the default
     * (Lsb0) bit ordering.
     * </p>
     * <p>
     * (1, 0, 0, 0) is converted as follow: '1'
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position of the lsb to start the conversion
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryToHexDigit(final boolean[] src, final int srcPos) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(3931);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3932);if ((((src.length == 0)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3933)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3934)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3935);throw new IllegalArgumentException("Cannot convert an empty array.");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(3936);if ((((src.length > srcPos + 3 && src[srcPos + 3])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3937)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3938)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3939);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3940)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3941)==0&false))) {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(3942);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3943)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3944)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(3945);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3946)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3947)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3948);return 'f';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3949);return 'e';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(3950);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3951)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3952)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3953);return 'd';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3954);return 'c';
                    }
                }}
            }} }else {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(3955);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3956)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3957)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(3958);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3959)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3960)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3961);return 'b';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3962);return 'a';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(3963);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3964)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3965)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3966);return '9';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3967);return '8';
                    }
                }}
            }}
        }} }else {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(3968);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3969)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3970)==0&false))) {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(3971);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3972)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3973)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(3974);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3975)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3976)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3977);return '7';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3978);return '6';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(3979);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3980)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3981)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3982);return '5';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3983);return '4';
                    }
                }}
            }} }else {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(3984);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3985)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3986)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(3987);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3988)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3989)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3990);return '3';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3991);return '2';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(3992);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3993)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(3994)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3995);return '1';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3996);return '0';
                    }
                }}
            }}
        }}
    }}finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) to a hexadecimal digit using the Msb0 bit
     * ordering.
     * </p>
     * <p>
     * (1, 0, 0, 0) is converted as follow: '8'
     * </p>
     * 
     * @param src the binary to convert
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty, {@code src.length < 4} or
     *             {@code src.length > 8}
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryToHexDigitMsb0_4bits(final boolean[] src) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(3997);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(3998);return binaryToHexDigitMsb0_4bits(src, 0);
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) to a hexadecimal digit using the Msb0 bit
     * ordering.
     * </p>
     * <p>
     * (1, 0, 0, 0) is converted as follow: '8' (1,0,0,1,1,0,1,0) with srcPos = 3 is converted
     * to 'D'
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position of the lsb to start the conversion
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty, {@code src.length > 8} or
     *             {@code src.length - srcPos < 4}
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryToHexDigitMsb0_4bits(final boolean[] src, final int srcPos) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(3999);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4000);if ((((src.length > 8)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4001)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4002)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4003);throw new IllegalArgumentException("src.length>8: src.length=" + src.length);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4004);if ((((src.length - srcPos < 4)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4005)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4006)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4007);throw new IllegalArgumentException("src.length-srcPos<4: src.length="
                + src.length
                + ", srcPos="
                + srcPos);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4008);if ((((src[srcPos + 3])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4009)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4010)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4011);if ((((src[srcPos + 2])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4012)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4013)==0&false))) {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4014);if ((((src[srcPos + 1])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4015)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4016)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4017);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4018)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4019)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4020);return 'f';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4021);return '7';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4022);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4023)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4024)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4025);return 'b';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4026);return '3';
                    }
                }}
            }} }else {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4027);if ((((src[srcPos + 1])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4028)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4029)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4030);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4031)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4032)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4033);return 'd';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4034);return '5';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4035);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4036)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4037)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4038);return '9';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4039);return '1';
                    }
                }}
            }}
        }} }else {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4040);if ((((src[srcPos + 2])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4041)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4042)==0&false))) {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4043);if ((((src[srcPos + 1])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4044)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4045)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4046);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4047)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4048)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4049);return 'e';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4050);return '6';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4051);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4052)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4053)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4054);return 'a';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4055);return '2';
                    }
                }}
            }} }else {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4056);if ((((src[srcPos + 1])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4057)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4058)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4059);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4060)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4061)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4062);return 'c';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4063);return '4';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4064);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4065)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4066)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4067);return '8';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4068);return '0';
                    }
                }}
            }}
        }}
    }}finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts the first 4 bits of a binary (represented as boolean array) in big endian Msb0
     * bit ordering to a hexadecimal digit.
     * </p>
     * <p>
     * (1, 0, 0, 0) is converted as follow: '8' (1,0,0,0,0,0,0,0, 0,0,0,0,0,1,0,0) is converted
     * to '4'
     * </p>
     * 
     * @param src the binary to convert
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryBeMsb0ToHexDigit(final boolean[] src) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4069);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4070);return binaryBeMsb0ToHexDigit(src, 0);
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a binary (represented as boolean array) in big endian Msb0 bit ordering to a
     * hexadecimal digit.
     * </p>
     * <p>
     * (1, 0, 0, 0) with srcPos = 0 is converted as follow: '8' (1,0,0,0,0,0,0,0,
     * 0,0,0,1,0,1,0,0) with srcPos = 2 is converted to '5'
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position of the lsb to start the conversion
     * @return a hexadecimal digit representing the selected bits
     * @throws IllegalArgumentException if {@code src} is empty
     * @throws NullPointerException if {@code src} is {@code null}
     */
    public static char binaryBeMsb0ToHexDigit(boolean[] src, int srcPos) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4071);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4072);if ((((src.length == 0)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4073)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4074)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4075);throw new IllegalArgumentException("Cannot convert an empty array.");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4076);final int beSrcPos = src.length - 1 - srcPos;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4077);final int srcLen = Math.min(4, beSrcPos + 1);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4078);final boolean[] paddedSrc = new boolean[4];
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4079);System.arraycopy(src, beSrcPos + 1 - srcLen, paddedSrc, 4 - srcLen, srcLen);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4080);src = paddedSrc;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4081);srcPos = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4082);if ((((src[srcPos])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4083)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4084)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4085);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4086)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4087)==0&false))) {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4088);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4089)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4090)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4091);if ((((src.length > srcPos + 3 && src[srcPos + 3])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4092)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4093)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4094);return 'f';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4095);return 'e';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4096);if ((((src.length > srcPos + 3 && src[srcPos + 3])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4097)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4098)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4099);return 'd';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4100);return 'c';
                    }
                }}
            }} }else {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4101);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4102)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4103)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4104);if ((((src.length > srcPos + 3 && src[srcPos + 3])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4105)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4106)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4107);return 'b';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4108);return 'a';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4109);if ((((src.length > srcPos + 3 && src[srcPos + 3])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4110)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4111)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4112);return '9';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4113);return '8';
                    }
                }}
            }}
        }} }else {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4114);if ((((src.length > srcPos + 1 && src[srcPos + 1])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4115)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4116)==0&false))) {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4117);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4118)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4119)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4120);if ((((src.length > srcPos + 3 && src[srcPos + 3])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4121)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4122)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4123);return '7';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4124);return '6';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4125);if ((((src.length > srcPos + 3 && src[srcPos + 3])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4126)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4127)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4128);return '5';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4129);return '4';
                    }
                }}
            }} }else {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4130);if ((((src.length > srcPos + 2 && src[srcPos + 2])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4131)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4132)==0&false))) {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4133);if ((((src.length > srcPos + 3 && src[srcPos + 3])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4134)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4135)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4136);return '3';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4137);return '2';
                    }
                }} }else {{
                    __CLR4_1_22xg2xgl3lqxrtb.R.inc(4138);if ((((src.length > srcPos + 3 && src[srcPos + 3])&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4139)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4140)==0&false))) {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4141);return '1';
                    } }else {{
                        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4142);return '0';
                    }
                }}
            }}
        }}
    }}finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts the 4 lsb of an int to a hexadecimal digit.
     * </p>
     * <p>
     * 0 returns '0'
     * </p>
     * <p>
     * 1 returns '1'
     * </p>
     * <p>
     * 10 returns 'A' and so on...
     * </p>
     * 
     * @param nibble the 4 bits to convert
     * @return a hexadecimal digit representing the 4 lsb of {@code nibble}
     * @throws IllegalArgumentException if {@code nibble < 0} or {@code nibble > 15}
     */
    public static char intToHexDigit(final int nibble) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4143);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4144);final char c = Character.forDigit(nibble, 16);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4145);if ((((c == Character.MIN_VALUE)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4146)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4147)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4148);throw new IllegalArgumentException("nibble value not between 0 and 15: " + nibble);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4149);return c;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts the 4 lsb of an int to a hexadecimal digit encoded using the Msb0 bit ordering.
     * </p>
     * <p>
     * 0 returns '0'
     * </p>
     * <p>
     * 1 returns '8'
     * </p>
     * <p>
     * 10 returns '5' and so on...
     * </p>
     * 
     * @param nibble the 4 bits to convert
     * @return a hexadecimal digit representing the 4 lsb of {@code nibble}
     * @throws IllegalArgumentException if {@code nibble < 0} or {@code nibble > 15}
     */
    public static char intToHexDigitMsb0(final int nibble) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4150);
        boolean __CLB4_1_2_bool3=false;__CLR4_1_22xg2xgl3lqxrtb.R.inc(4151);switch (nibble) {
        case 0x0:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4152);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4153);return '0';
        case 0x1:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4154);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4155);return '8';
        case 0x2:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4156);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4157);return '4';
        case 0x3:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4158);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4159);return 'c';
        case 0x4:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4160);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4161);return '2';
        case 0x5:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4162);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4163);return 'a';
        case 0x6:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4164);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4165);return '6';
        case 0x7:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4166);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4167);return 'e';
        case 0x8:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4168);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4169);return '1';
        case 0x9:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4170);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4171);return '9';
        case 0xA:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4172);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4173);return '5';
        case 0xB:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4174);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4175);return 'd';
        case 0xC:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4176);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4177);return '3';
        case 0xD:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4178);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4179);return 'b';
        case 0xE:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4180);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4181);return '7';
        case 0xF:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4182);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4183);return 'f';
        default:if (!__CLB4_1_2_bool3) {__CLR4_1_22xg2xgl3lqxrtb.R.inc(4184);__CLB4_1_2_bool3=true;}
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4185);throw new IllegalArgumentException("nibble value not between 0 and 15: " + nibble);
        }
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of int into a long using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the int array to convert
     * @param srcPos the position in {@code src}, in int unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination long
     * @param dstPos the position of the lsb, in bits, in the result long
     * @param nInts the number of ints to convert
     * @return a long containing the selected bits
     * @throws IllegalArgumentException if {@code (nInts-1)*32+dstPos >= 64}
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nInts > src.length}
     */
    public static long intArrayToLong(final int[] src, final int srcPos, final long dstInit, final int dstPos, final int nInts) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4186);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4187);if (((((src.length == 0 && srcPos == 0) || 0 == nInts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4188)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4189)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4190);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4191);if (((((nInts - 1) * 32 + dstPos >= 64)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4192)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4193)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4194);throw new IllegalArgumentException(
                "(nInts-1)*32+dstPos is greather or equal to than 64");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4195);long out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4196);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4197);for (int i = 0; (((i < nInts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4198)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4199)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4200);shift = i * 32 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4201);final long bits = ((0xffffffffL & src[i + srcPos]) << shift);
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4202);final long mask = 0xffffffffL << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4203);out = (out & ~mask) | bits;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4204);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of short into a long using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the short array to convert
     * @param srcPos the position in {@code src}, in short unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination long
     * @param dstPos the position of the lsb, in bits, in the result long
     * @param nShorts the number of shorts to convert
     * @return a long containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code (nShorts-1)*16+dstPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nShorts > src.length}
     */
    public static long shortArrayToLong(final short[] src, final int srcPos, final long dstInit, final int dstPos,
        final int nShorts) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4205);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4206);if (((((src.length == 0 && srcPos == 0) || 0 == nShorts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4207)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4208)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4209);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4210);if (((((nShorts - 1) * 16 + dstPos >= 64)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4211)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4212)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4213);throw new IllegalArgumentException(
                "(nShorts-1)*16+dstPos is greather or equal to than 64");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4214);long out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4215);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4216);for (int i = 0; (((i < nShorts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4217)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4218)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4219);shift = i * 16 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4220);final long bits = (0xffffL & src[i + srcPos]) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4221);final long mask = 0xffffL << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4222);out = (out & ~mask) | bits;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4223);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of short into a int using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the short array to convert
     * @param srcPos the position in {@code src}, in short unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination int
     * @param dstPos the position of the lsb, in bits, in the result int
     * @param nShorts the number of shorts to convert
     * @return a int containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code (nShorts-1)*16+dstPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nShorts > src.length}
     */
    public static int shortArrayToInt(final short[] src, final int srcPos, final int dstInit, final int dstPos,
        final int nShorts) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4224);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4225);if (((((src.length == 0 && srcPos == 0) || 0 == nShorts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4226)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4227)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4228);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4229);if (((((nShorts - 1) * 16 + dstPos >= 32)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4230)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4231)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4232);throw new IllegalArgumentException(
                "(nShorts-1)*16+dstPos is greather or equal to than 32");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4233);int out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4234);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4235);for (int i = 0; (((i < nShorts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4236)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4237)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4238);shift = i * 16 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4239);final int bits = (0xffff & src[i + srcPos]) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4240);final int mask = 0xffff << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4241);out = (out & ~mask) | bits;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4242);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of byte into a long using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the byte array to convert
     * @param srcPos the position in {@code src}, in byte unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination long
     * @param dstPos the position of the lsb, in bits, in the result long
     * @param nBytes the number of bytes to convert
     * @return a long containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+dstPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBytes > src.length}
     */
    public static long byteArrayToLong(final byte[] src, final int srcPos, final long dstInit, final int dstPos,
        final int nBytes) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4243);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4244);if (((((src.length == 0 && srcPos == 0) || 0 == nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4245)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4246)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4247);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4248);if (((((nBytes - 1) * 8 + dstPos >= 64)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4249)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4250)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4251);throw new IllegalArgumentException(
                "(nBytes-1)*8+dstPos is greather or equal to than 64");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4252);long out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4253);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4254);for (int i = 0; (((i < nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4255)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4256)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4257);shift = i * 8 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4258);final long bits = (0xffL & src[i + srcPos]) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4259);final long mask = 0xffL << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4260);out = (out & ~mask) | bits;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4261);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of byte into a int using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the byte array to convert
     * @param srcPos the position in {@code src}, in byte unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination int
     * @param dstPos the position of the lsb, in bits, in the result int
     * @param nBytes the number of bytes to convert
     * @return a int containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+dstPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBytes > src.length}
     */
    public static int byteArrayToInt(final byte[] src, final int srcPos, final int dstInit, final int dstPos, final int nBytes) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4262);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4263);if (((((src.length == 0 && srcPos == 0) || 0 == nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4264)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4265)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4266);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4267);if (((((nBytes - 1) * 8 + dstPos >= 32)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4268)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4269)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4270);throw new IllegalArgumentException(
                "(nBytes-1)*8+dstPos is greather or equal to than 32");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4271);int out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4272);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4273);for (int i = 0; (((i < nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4274)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4275)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4276);shift = i * 8 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4277);final int bits = (0xff & src[i + srcPos]) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4278);final int mask = 0xff << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4279);out = (out & ~mask) | bits;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4280);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of byte into a short using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the byte array to convert
     * @param srcPos the position in {@code src}, in byte unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination short
     * @param dstPos the position of the lsb, in bits, in the result short
     * @param nBytes the number of bytes to convert
     * @return a short containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+dstPos >= 16}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBytes > src.length}
     */
    public static short byteArrayToShort(final byte[] src, final int srcPos, final short dstInit, final int dstPos,
        final int nBytes) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4281);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4282);if (((((src.length == 0 && srcPos == 0) || 0 == nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4283)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4284)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4285);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4286);if (((((nBytes - 1) * 8 + dstPos >= 16)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4287)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4288)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4289);throw new IllegalArgumentException(
                "(nBytes-1)*8+dstPos is greather or equal to than 16");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4290);short out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4291);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4292);for (int i = 0; (((i < nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4293)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4294)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4295);shift = i * 8 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4296);final int bits = (0xff & src[i + srcPos]) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4297);final int mask = 0xff << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4298);out = (short)((out & ~mask) | bits);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4299);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of Char into a long using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the hex string to convert
     * @param srcPos the position in {@code src}, in Char unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination long
     * @param dstPos the position of the lsb, in bits, in the result long
     * @param nHex the number of Chars to convert
     * @return a long containing the selected bits
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos >= 64}
     */
    public static long hexToLong(final String src, final int srcPos, final long dstInit, final int dstPos, final int nHex) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4300);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4301);if ((((0 == nHex)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4302)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4303)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4304);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4305);if (((((nHex - 1) * 4 + dstPos >= 64)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4306)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4307)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4308);throw new IllegalArgumentException(
                "(nHexs-1)*4+dstPos is greather or equal to than 64");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4309);long out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4310);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4311);for (int i = 0; (((i < nHex)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4312)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4313)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4314);shift = i * 4 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4315);final long bits = (0xfL & hexDigitToInt(src.charAt(i + srcPos))) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4316);final long mask = 0xfL << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4317);out = (out & ~mask) | bits;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4318);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of Char into a int using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the hex string to convert
     * @param srcPos the position in {@code src}, in Char unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination int
     * @param dstPos the position of the lsb, in bits, in the result int
     * @param nHex the number of Chars to convert
     * @return a int containing the selected bits
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos >= 32}
     */
    public static int hexToInt(final String src, final int srcPos, final int dstInit, final int dstPos, final int nHex) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4319);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4320);if ((((0 == nHex)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4321)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4322)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4323);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4324);if (((((nHex - 1) * 4 + dstPos >= 32)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4325)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4326)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4327);throw new IllegalArgumentException(
                "(nHexs-1)*4+dstPos is greather or equal to than 32");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4328);int out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4329);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4330);for (int i = 0; (((i < nHex)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4331)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4332)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4333);shift = i * 4 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4334);final int bits = (0xf & hexDigitToInt(src.charAt(i + srcPos))) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4335);final int mask = 0xf << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4336);out = (out & ~mask) | bits;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4337);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of Char into a short using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the hex string to convert
     * @param srcPos the position in {@code src}, in Char unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination short
     * @param dstPos the position of the lsb, in bits, in the result short
     * @param nHex the number of Chars to convert
     * @return a short containing the selected bits
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos >= 16}
     */
    public static short hexToShort(final String src, final int srcPos, final short dstInit, final int dstPos, final int nHex) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4338);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4339);if ((((0 == nHex)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4340)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4341)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4342);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4343);if (((((nHex - 1) * 4 + dstPos >= 16)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4344)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4345)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4346);throw new IllegalArgumentException(
                "(nHexs-1)*4+dstPos is greather or equal to than 16");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4347);short out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4348);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4349);for (int i = 0; (((i < nHex)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4350)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4351)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4352);shift = i * 4 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4353);final int bits = (0xf & hexDigitToInt(src.charAt(i + srcPos))) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4354);final int mask = 0xf << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4355);out = (short)((out & ~mask) | bits);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4356);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts an array of Char into a byte using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the hex string to convert
     * @param srcPos the position in {@code src}, in Char unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination byte
     * @param dstPos the position of the lsb, in bits, in the result byte
     * @param nHex the number of Chars to convert
     * @return a byte containing the selected bits
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+dstPos >= 8}
     */
    public static byte hexToByte(final String src, final int srcPos, final byte dstInit, final int dstPos, final int nHex) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4357);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4358);if ((((0 == nHex)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4359)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4360)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4361);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4362);if (((((nHex - 1) * 4 + dstPos >= 8)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4363)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4364)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4365);throw new IllegalArgumentException(
                "(nHexs-1)*4+dstPos is greather or equal to than 8");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4366);byte out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4367);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4368);for (int i = 0; (((i < nHex)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4369)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4370)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4371);shift = i * 4 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4372);final int bits = (0xf & hexDigitToInt(src.charAt(i + srcPos))) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4373);final int mask = 0xf << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4374);out = (byte)((out & ~mask) | bits);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4375);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) into a long using the default (little
     * endian, Lsb0) byte and bit ordering.
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position in {@code src}, in boolean unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination long
     * @param dstPos the position of the lsb, in bits, in the result long
     * @param nBools the number of booleans to convert
     * @return a long containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+dstPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools > src.length}
     */
    public static long binaryToLong(final boolean[] src, final int srcPos, final long dstInit, final int dstPos,
        final int nBools) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4376);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4377);if (((((src.length == 0 && srcPos == 0) || 0 == nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4378)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4379)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4380);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4381);if ((((nBools - 1 + dstPos >= 64)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4382)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4383)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4384);throw new IllegalArgumentException(
                "nBools-1+dstPos is greather or equal to than 64");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4385);long out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4386);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4387);for (int i = 0; (((i < nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4388)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4389)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4390);shift = i * 1 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4391);final long bits = ((((src[i + srcPos] )&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4392)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4393)==0&false))? 1L : 0) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4394);final long mask = 0x1L << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4395);out = (out & ~mask) | bits;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4396);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) into a int using the default (little
     * endian, Lsb0) byte and bit ordering.
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position in {@code src}, in boolean unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination int
     * @param dstPos the position of the lsb, in bits, in the result int
     * @param nBools the number of booleans to convert
     * @return a int containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+dstPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools > src.length}
     */
    public static int binaryToInt(final boolean[] src, final int srcPos, final int dstInit, final int dstPos, final int nBools) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4397);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4398);if (((((src.length == 0 && srcPos == 0) || 0 == nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4399)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4400)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4401);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4402);if ((((nBools - 1 + dstPos >= 32)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4403)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4404)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4405);throw new IllegalArgumentException(
                "nBools-1+dstPos is greather or equal to than 32");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4406);int out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4407);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4408);for (int i = 0; (((i < nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4409)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4410)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4411);shift = i * 1 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4412);final int bits = ((((src[i + srcPos] )&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4413)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4414)==0&false))? 1 : 0) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4415);final int mask = 0x1 << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4416);out = (out & ~mask) | bits;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4417);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) into a short using the default (little
     * endian, Lsb0) byte and bit ordering.
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position in {@code src}, in boolean unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination short
     * @param dstPos the position of the lsb, in bits, in the result short
     * @param nBools the number of booleans to convert
     * @return a short containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+dstPos >= 16}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools > src.length}
     */
    public static short binaryToShort(final boolean[] src, final int srcPos, final short dstInit, final int dstPos,
        final int nBools) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4418);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4419);if (((((src.length == 0 && srcPos == 0) || 0 == nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4420)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4421)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4422);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4423);if ((((nBools - 1 + dstPos >= 16)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4424)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4425)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4426);throw new IllegalArgumentException(
                "nBools-1+dstPos is greather or equal to than 16");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4427);short out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4428);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4429);for (int i = 0; (((i < nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4430)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4431)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4432);shift = i * 1 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4433);final int bits = ((((src[i + srcPos] )&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4434)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4435)==0&false))? 1 : 0) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4436);final int mask = 0x1 << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4437);out = (short)((out & ~mask) | bits);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4438);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts binary (represented as boolean array) into a byte using the default (little
     * endian, Lsb0) byte and bit ordering.
     * </p>
     * 
     * @param src the binary to convert
     * @param srcPos the position in {@code src}, in boolean unit, from where to start the
     *            conversion
     * @param dstInit initial value of the destination byte
     * @param dstPos the position of the lsb, in bits, in the result byte
     * @param nBools the number of booleans to convert
     * @return a byte containing the selected bits
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+dstPos >= 8}
     * @throws ArrayIndexOutOfBoundsException if {@code srcPos + nBools > src.length}
     */
    public static byte binaryToByte(final boolean[] src, final int srcPos, final byte dstInit, final int dstPos,
        final int nBools) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4439);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4440);if (((((src.length == 0 && srcPos == 0) || 0 == nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4441)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4442)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4443);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4444);if ((((nBools - 1 + dstPos >= 8)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4445)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4446)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4447);throw new IllegalArgumentException("nBools-1+dstPos is greather or equal to than 8");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4448);byte out = dstInit;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4449);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4450);for (int i = 0; (((i < nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4451)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4452)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4453);shift = i * 1 + dstPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4454);final int bits = ((((src[i + srcPos] )&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4455)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4456)==0&false))? 1 : 0) << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4457);final int mask = 0x1 << shift;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4458);out = (byte)((out & ~mask) | bits);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4459);return out;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a long into an array of int using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the long to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nInts the number of ints to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null} and {@code nInts > 0}
     * @throws IllegalArgumentException if {@code (nInts-1)*32+srcPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nInts > dst.length}
     */
    public static int[] longToIntArray(final long src, final int srcPos, final int[] dst, final int dstPos, final int nInts) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4460);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4461);if ((((0 == nInts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4462)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4463)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4464);return dst;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4465);if (((((nInts - 1) * 32 + srcPos >= 64)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4466)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4467)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4468);throw new IllegalArgumentException(
                "(nInts-1)*32+srcPos is greather or equal to than 64");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4469);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4470);for (int i = 0; (((i < nInts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4471)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4472)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4473);shift = i * 32 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4474);dst[dstPos + i] = (int)(0xffffffff & (src >> shift));
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4475);return dst;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a long into an array of short using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the long to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nShorts the number of shorts to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code (nShorts-1)*16+srcPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nShorts > dst.length}
     */
    public static short[] longToShortArray(final long src, final int srcPos, final short[] dst, final int dstPos,
        final int nShorts) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4476);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4477);if ((((0 == nShorts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4478)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4479)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4480);return dst;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4481);if (((((nShorts - 1) * 16 + srcPos >= 64)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4482)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4483)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4484);throw new IllegalArgumentException(
                "(nShorts-1)*16+srcPos is greather or equal to than 64");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4485);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4486);for (int i = 0; (((i < nShorts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4487)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4488)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4489);shift = i * 16 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4490);dst[dstPos + i] = (short)(0xffff & (src >> shift));
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4491);return dst;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a int into an array of short using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the int to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nShorts the number of shorts to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code (nShorts-1)*16+srcPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nShorts > dst.length}
     */
    public static short[] intToShortArray(final int src, final int srcPos, final short[] dst, final int dstPos,
        final int nShorts) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4492);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4493);if ((((0 == nShorts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4494)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4495)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4496);return dst;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4497);if (((((nShorts - 1) * 16 + srcPos >= 32)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4498)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4499)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4500);throw new IllegalArgumentException(
                "(nShorts-1)*16+srcPos is greather or equal to than 32");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4501);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4502);for (int i = 0; (((i < nShorts)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4503)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4504)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4505);shift = i * 16 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4506);dst[dstPos + i] = (short)(0xffff & (src >> shift));
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4507);return dst;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a long into an array of byte using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the long to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+srcPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes > dst.length}
     */
    public static byte[] longToByteArray(final long src, final int srcPos, final byte[] dst, final int dstPos,
        final int nBytes) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4508);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4509);if ((((0 == nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4510)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4511)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4512);return dst;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4513);if (((((nBytes - 1) * 8 + srcPos >= 64)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4514)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4515)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4516);throw new IllegalArgumentException(
                "(nBytes-1)*8+srcPos is greather or equal to than 64");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4517);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4518);for (int i = 0; (((i < nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4519)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4520)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4521);shift = i * 8 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4522);dst[dstPos + i] = (byte)(0xff & (src >> shift));
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4523);return dst;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a int into an array of byte using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the int to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+srcPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes > dst.length}
     */
    public static byte[] intToByteArray(final int src, final int srcPos, final byte[] dst, final int dstPos, final int nBytes) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4524);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4525);if ((((0 == nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4526)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4527)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4528);return dst;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4529);if (((((nBytes - 1) * 8 + srcPos >= 32)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4530)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4531)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4532);throw new IllegalArgumentException(
                "(nBytes-1)*8+srcPos is greather or equal to than 32");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4533);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4534);for (int i = 0; (((i < nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4535)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4536)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4537);shift = i * 8 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4538);dst[dstPos + i] = (byte)(0xff & (src >> shift));
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4539);return dst;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a short into an array of byte using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the short to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code (nBytes-1)*8+srcPos >= 16}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes > dst.length}
     */
    public static byte[] shortToByteArray(final short src, final int srcPos, final byte[] dst, final int dstPos,
        final int nBytes) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4540);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4541);if ((((0 == nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4542)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4543)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4544);return dst;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4545);if (((((nBytes - 1) * 8 + srcPos >= 16)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4546)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4547)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4548);throw new IllegalArgumentException(
                "(nBytes-1)*8+srcPos is greather or equal to than 16");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4549);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4550);for (int i = 0; (((i < nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4551)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4552)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4553);shift = i * 8 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4554);dst[dstPos + i] = (byte)(0xff & (src >> shift));
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4555);return dst;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a long into an array of Char using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the long to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dstInit the initial value for the result String
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos >= 64}
     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() < dstPos}
     */
    public static String longToHex(final long src, final int srcPos, final String dstInit, final int dstPos, final int nHexs) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4556);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4557);if ((((0 == nHexs)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4558)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4559)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4560);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4561);if (((((nHexs - 1) * 4 + srcPos >= 64)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4562)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4563)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4564);throw new IllegalArgumentException(
                "(nHexs-1)*4+srcPos is greather or equal to than 64");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4565);final StringBuilder sb = new StringBuilder(dstInit);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4566);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4567);int append = sb.length();
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4568);for (int i = 0; (((i < nHexs)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4569)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4570)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4571);shift = i * 4 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4572);final int bits = (int)(0xF & (src >> shift));
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4573);if ((((dstPos + i == append)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4574)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4575)==0&false))) {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4576);++append;
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4577);sb.append(intToHexDigit(bits));
            } }else {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4578);sb.setCharAt(dstPos + i, intToHexDigit(bits));
            }
        }}
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4579);return sb.toString();
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a int into an array of Char using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the int to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dstInit the initial value for the result String
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos >= 32}
     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() < dstPos}
     */
    public static String intToHex(final int src, final int srcPos, final String dstInit, final int dstPos, final int nHexs) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4580);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4581);if ((((0 == nHexs)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4582)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4583)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4584);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4585);if (((((nHexs - 1) * 4 + srcPos >= 32)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4586)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4587)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4588);throw new IllegalArgumentException(
                "(nHexs-1)*4+srcPos is greather or equal to than 32");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4589);final StringBuilder sb = new StringBuilder(dstInit);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4590);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4591);int append = sb.length();
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4592);for (int i = 0; (((i < nHexs)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4593)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4594)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4595);shift = i * 4 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4596);final int bits = 0xF & (src >> shift);
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4597);if ((((dstPos + i == append)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4598)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4599)==0&false))) {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4600);++append;
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4601);sb.append(intToHexDigit(bits));
            } }else {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4602);sb.setCharAt(dstPos + i, intToHexDigit(bits));
            }
        }}
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4603);return sb.toString();
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a short into an array of Char using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the short to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dstInit the initial value for the result String
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos >= 16}
     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() < dstPos}
     */
    public static String shortToHex(final short src, final int srcPos, final String dstInit, final int dstPos, final int nHexs) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4604);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4605);if ((((0 == nHexs)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4606)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4607)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4608);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4609);if (((((nHexs - 1) * 4 + srcPos >= 16)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4610)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4611)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4612);throw new IllegalArgumentException(
                "(nHexs-1)*4+srcPos is greather or equal to than 16");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4613);final StringBuilder sb = new StringBuilder(dstInit);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4614);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4615);int append = sb.length();
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4616);for (int i = 0; (((i < nHexs)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4617)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4618)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4619);shift = i * 4 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4620);final int bits = 0xF & (src >> shift);
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4621);if ((((dstPos + i == append)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4622)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4623)==0&false))) {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4624);++append;
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4625);sb.append(intToHexDigit(bits));
            } }else {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4626);sb.setCharAt(dstPos + i, intToHexDigit(bits));
            }
        }}
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4627);return sb.toString();
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a byte into an array of Char using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the byte to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dstInit the initial value for the result String
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nHexs the number of Chars to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws IllegalArgumentException if {@code (nHexs-1)*4+srcPos >= 8}
     * @throws StringIndexOutOfBoundsException if {@code dst.init.length() < dstPos}
     */
    public static String byteToHex(final byte src, final int srcPos, final String dstInit, final int dstPos, final int nHexs) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4628);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4629);if ((((0 == nHexs)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4630)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4631)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4632);return dstInit;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4633);if (((((nHexs - 1) * 4 + srcPos >= 8)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4634)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4635)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4636);throw new IllegalArgumentException(
                "(nHexs-1)*4+srcPos is greather or equal to than 8");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4637);final StringBuilder sb = new StringBuilder(dstInit);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4638);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4639);int append = sb.length();
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4640);for (int i = 0; (((i < nHexs)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4641)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4642)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4643);shift = i * 4 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4644);final int bits = 0xF & (src >> shift);
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4645);if ((((dstPos + i == append)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4646)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4647)==0&false))) {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4648);++append;
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4649);sb.append(intToHexDigit(bits));
            } }else {{
                __CLR4_1_22xg2xgl3lqxrtb.R.inc(4650);sb.setCharAt(dstPos + i, intToHexDigit(bits));
            }
        }}
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4651);return sb.toString();
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a long into an array of boolean using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the long to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+srcPos >= 64}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools > dst.length}
     */
    public static boolean[] longToBinary(final long src, final int srcPos, final boolean[] dst, final int dstPos,
        final int nBools) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4652);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4653);if ((((0 == nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4654)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4655)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4656);return dst;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4657);if ((((nBools - 1 + srcPos >= 64)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4658)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4659)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4660);throw new IllegalArgumentException(
                "nBools-1+srcPos is greather or equal to than 64");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4661);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4662);for (int i = 0; (((i < nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4663)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4664)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4665);shift = i * 1 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4666);dst[dstPos + i] = ((0x1 & (src >> shift)) != 0);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4667);return dst;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a int into an array of boolean using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the int to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+srcPos >= 32}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools > dst.length}
     */
    public static boolean[] intToBinary(final int src, final int srcPos, final boolean[] dst, final int dstPos,
        final int nBools) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4668);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4669);if ((((0 == nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4670)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4671)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4672);return dst;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4673);if ((((nBools - 1 + srcPos >= 32)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4674)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4675)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4676);throw new IllegalArgumentException(
                "nBools-1+srcPos is greather or equal to than 32");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4677);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4678);for (int i = 0; (((i < nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4679)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4680)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4681);shift = i * 1 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4682);dst[dstPos + i] = ((0x1 & (src >> shift)) != 0);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4683);return dst;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a short into an array of boolean using the default (little endian, Lsb0) byte
     * and bit ordering.
     * </p>
     * 
     * @param src the short to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+srcPos >= 16}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools > dst.length}
     */
    public static boolean[] shortToBinary(final short src, final int srcPos, final boolean[] dst, final int dstPos,
        final int nBools) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4684);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4685);if ((((0 == nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4686)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4687)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4688);return dst;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4689);if ((((nBools - 1 + srcPos >= 16)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4690)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4691)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4692);throw new IllegalArgumentException(
                "nBools-1+srcPos is greather or equal to than 16");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4693);int shift = 0;
        assert (((((nBools - 1) * 1 < 16 - srcPos))&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4694)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4695)==0&false));
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4696);for (int i = 0; (((i < nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4697)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4698)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4699);shift = i * 1 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4700);dst[dstPos + i] = ((0x1 & (src >> shift)) != 0);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4701);return dst;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts a byte into an array of boolean using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the byte to convert
     * @param srcPos the position in {@code src}, in bits, from where to start the conversion
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBools the number of booleans to copy to {@code dst}, must be smaller or equal to
     *            the width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code nBools-1+srcPos >= 8}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBools > dst.length}
     */
    public static boolean[] byteToBinary(final byte src, final int srcPos, final boolean[] dst, final int dstPos,
        final int nBools) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4702);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4703);if ((((0 == nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4704)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4705)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4706);return dst;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4707);if ((((nBools - 1 + srcPos >= 8)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4708)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4709)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4710);throw new IllegalArgumentException("nBools-1+srcPos is greather or equal to than 8");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4711);int shift = 0;
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4712);for (int i = 0; (((i < nBools)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4713)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4714)==0&false)); i++ ) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4715);shift = i * 1 + srcPos;
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4716);dst[dstPos + i] = ((0x1 & (src >> shift)) != 0);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4717);return dst;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts UUID into an array of byte using the default (little endian, Lsb0) byte and bit
     * ordering.
     * </p>
     * 
     * @param src the UUID to convert
     * @param dst the destination array
     * @param dstPos the position in {@code dst} where to copy the result
     * @param nBytes the number of bytes to copy to {@code dst}, must be smaller or equal to the
     *            width of the input (from srcPos to msb)
     * @return {@code dst}
     * @throws NullPointerException if {@code dst} is {@code null}
     * @throws IllegalArgumentException if {@code nBytes > 16}
     * @throws ArrayIndexOutOfBoundsException if {@code dstPos + nBytes > dst.length}
     */
    public static byte[] uuidToByteArray(final UUID src, final byte[] dst, final int dstPos, final int nBytes) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4718);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4719);if ((((0 == nBytes)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4720)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4721)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4722);return dst;
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4723);if ((((nBytes > 16)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4724)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4725)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4726);throw new IllegalArgumentException("nBytes is greather than 16");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4727);longToByteArray(src.getMostSignificantBits(), 0, dst, dstPos, (((nBytes > 8 )&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4728)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4729)==0&false))? 8 : nBytes);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4730);if ((((nBytes >= 8)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4731)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4732)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4733);longToByteArray(src.getLeastSignificantBits(), 0, dst, dstPos + 8, nBytes - 8);
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4734);return dst;
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}

    /**
     * <p>
     * Converts bytes from an array into a UUID using the default (little endian, Lsb0) byte and
     * bit ordering.
     * </p>
     * 
     * @param src the byte array to convert
     * @param srcPos the position in {@code src} where to copy the result from
     * @return a UUID
     * @throws NullPointerException if {@code src} is {@code null}
     * @throws IllegalArgumentException if array does not contain at least 16 bytes beginning
     *             with {@code srcPos}
     */
    public static UUID byteArrayToUuid(final byte[] src, final int srcPos) {try{__CLR4_1_22xg2xgl3lqxrtb.R.inc(4735);
        __CLR4_1_22xg2xgl3lqxrtb.R.inc(4736);if ((((src.length - srcPos < 16)&&(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4737)!=0|true))||(__CLR4_1_22xg2xgl3lqxrtb.R.iget(4738)==0&false))) {{
            __CLR4_1_22xg2xgl3lqxrtb.R.inc(4739);throw new IllegalArgumentException("Need at least 16 bytes for UUID");
        }
        }__CLR4_1_22xg2xgl3lqxrtb.R.inc(4740);return new UUID(byteArrayToLong(src, srcPos, 0, 0, 8), byteArrayToLong(
            src, srcPos + 8, 0, 0, 8));
    }finally{__CLR4_1_22xg2xgl3lqxrtb.R.flushNeeded();}}
}
