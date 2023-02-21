/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package org.apache.commons.lang3.builder;

// adapted from org.apache.axis.utils.IDKey

/**
 * Wrap an identity key (System.identityHashCode()) 
 * so that an object can only be equal() to itself.
 * 
 * This is necessary to disambiguate the occasional duplicate
 * identityHashCodes that can occur.
 * 
 */ 
final class IDKey {public static class __CLR4_1_27do7dol3lqxs89{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,9580,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
        private final Object value;
        private final int id;

        /**
         * Constructor for IDKey
         * @param _value The value
         */ 
        public IDKey(final Object _value) {try{__CLR4_1_27do7dol3lqxs89.R.inc(9564);
            // This is the Object hashcode 
            __CLR4_1_27do7dol3lqxs89.R.inc(9565);id = System.identityHashCode(_value);  
            // There have been some cases (LANG-459) that return the 
            // same identity hash code for different objects.  So 
            // the value is also added to disambiguate these cases.
            __CLR4_1_27do7dol3lqxs89.R.inc(9566);value = _value;
        }finally{__CLR4_1_27do7dol3lqxs89.R.flushNeeded();}}

        /**
         * returns hashcode - i.e. the system identity hashcode.
         * @return the hashcode
         */ 
        @Override
        public int hashCode() {try{__CLR4_1_27do7dol3lqxs89.R.inc(9567);
           __CLR4_1_27do7dol3lqxs89.R.inc(9568);return id;
        }finally{__CLR4_1_27do7dol3lqxs89.R.flushNeeded();}}

        /**
         * checks if instances are equal
         * @param other The other object to compare to
         * @return if the instances are for the same object
         */ 
        @Override
        public boolean equals(final Object other) {try{__CLR4_1_27do7dol3lqxs89.R.inc(9569);
            __CLR4_1_27do7dol3lqxs89.R.inc(9570);if ((((!(other instanceof IDKey))&&(__CLR4_1_27do7dol3lqxs89.R.iget(9571)!=0|true))||(__CLR4_1_27do7dol3lqxs89.R.iget(9572)==0&false))) {{
                __CLR4_1_27do7dol3lqxs89.R.inc(9573);return false;
            }
            }__CLR4_1_27do7dol3lqxs89.R.inc(9574);final IDKey idKey = (IDKey) other;
            __CLR4_1_27do7dol3lqxs89.R.inc(9575);if ((((id != idKey.id)&&(__CLR4_1_27do7dol3lqxs89.R.iget(9576)!=0|true))||(__CLR4_1_27do7dol3lqxs89.R.iget(9577)==0&false))) {{
                __CLR4_1_27do7dol3lqxs89.R.inc(9578);return false;
            }
            // Note that identity equals is used.
            }__CLR4_1_27do7dol3lqxs89.R.inc(9579);return value == idKey.value;
         }finally{__CLR4_1_27do7dol3lqxs89.R.flushNeeded();}}
}
