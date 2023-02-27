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

import java.util.BitSet;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test to show whether using BitSet for removeAll() methods is faster than using HashSet.
 */
public class HashSetvBitSetTest {static class __CLR4_1_2jxijxil3lqxtvn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,25945,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int LOOPS = 2000; // number of times to invoke methods
    private static final int LOOPS2 = 10000;

    @Test
    public void testTimes() {__CLR4_1_2jxijxil3lqxtvn.R.globalSliceStart(getClass().getName(),25830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vvzm91jxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2jxijxil3lqxtvn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2jxijxil3lqxtvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.HashSetvBitSetTest.testTimes",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25830,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vvzm91jxi(){try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25830);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25831);timeHashSet(10); // warmup
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25832);timeBitSet(10); // warmup
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25833);long timeDiff = printTimes(0);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25834);timeDiff += printTimes(5);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25835);timeDiff += printTimes(10);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25836);timeDiff += printTimes(200);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25837);timeDiff += printTimes(50);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25838);timeDiff += printTimes(100);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25839);timeDiff += printTimes(1000);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25840);timeDiff += printTimes(2000);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25841);Assert.assertTrue(timeDiff <= 0);
    }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}

    /**
     * @return bitSet - HashSet
     */
    private long printTimes(final int count) {try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25842);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25843);final long hashSet = timeHashSet(count);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25844);final long bitSet = timeBitSet(count);
        // If percent is less than 100, then bitset is faster
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25845);System.out.println("Ratio="+(bitSet*100/hashSet)+"% count="+count+" hash="+hashSet+" bits="+bitSet);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25846);return bitSet - hashSet;
    }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}

    private static long timeHashSet(final int count) {try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25847);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25848);int [] result = new int[0];
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25849);final long start = System.nanoTime();
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25850);for (int i = 0; (((i < LOOPS)&&(__CLR4_1_2jxijxil3lqxtvn.R.iget(25851)!=0|true))||(__CLR4_1_2jxijxil3lqxtvn.R.iget(25852)==0&false)); i++) {{
            __CLR4_1_2jxijxil3lqxtvn.R.inc(25853);result = testHashSet(count);
        }
        }__CLR4_1_2jxijxil3lqxtvn.R.inc(25854);final long elapsed = System.nanoTime() - start;
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25855);Assert.assertEquals(count, result.length);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25856);return elapsed;
    }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}

    private static long timeBitSet(final int count) {try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25857);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25858);int [] result = new int[0];
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25859);final long start = System.nanoTime();
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25860);for (int i = 0; (((i < LOOPS)&&(__CLR4_1_2jxijxil3lqxtvn.R.iget(25861)!=0|true))||(__CLR4_1_2jxijxil3lqxtvn.R.iget(25862)==0&false)); i++) {{
            __CLR4_1_2jxijxil3lqxtvn.R.inc(25863);result = testBitSet(count);
        }
        }__CLR4_1_2jxijxil3lqxtvn.R.inc(25864);final long elapsed = System.nanoTime() - start;
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25865);Assert.assertEquals(count, result.length);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25866);return elapsed;
    }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}

    @SuppressWarnings("boxing")
    private static int[] testHashSet(final int count) {try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25867);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25868);final HashSet<Integer> toRemove = new HashSet<Integer>();
            __CLR4_1_2jxijxil3lqxtvn.R.inc(25869);int found = 0;
            __CLR4_1_2jxijxil3lqxtvn.R.inc(25870);for (int i = 0; (((i < count)&&(__CLR4_1_2jxijxil3lqxtvn.R.iget(25871)!=0|true))||(__CLR4_1_2jxijxil3lqxtvn.R.iget(25872)==0&false)); i++) {{
                __CLR4_1_2jxijxil3lqxtvn.R.inc(25873);toRemove.add(found++);
            }
            }__CLR4_1_2jxijxil3lqxtvn.R.inc(25874);return extractIndices(toRemove);
        }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}
    
    private static int[] testBitSet(final int count) {try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25875);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25876);final BitSet toRemove = new BitSet();
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25877);int found = 0;
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25878);for (int i = 0; (((i < count)&&(__CLR4_1_2jxijxil3lqxtvn.R.iget(25879)!=0|true))||(__CLR4_1_2jxijxil3lqxtvn.R.iget(25880)==0&false)); i++) {{
            __CLR4_1_2jxijxil3lqxtvn.R.inc(25881);toRemove.set(found++);
        }
        }__CLR4_1_2jxijxil3lqxtvn.R.inc(25882);return extractIndices(toRemove);
    }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}
    

    private static int[] extractIndices(final HashSet<Integer> coll) {try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25883);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25884);final int[] result = new int[coll.size()];
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25885);int i = 0;
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25886);for (final Integer index : coll) {{
            __CLR4_1_2jxijxil3lqxtvn.R.inc(25887);result[i++] = index.intValue();
        }
        }__CLR4_1_2jxijxil3lqxtvn.R.inc(25888);return result;
    }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}

    private static int[] extractIndices(final BitSet coll) {try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25889);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25890);final int[] result = new int[coll.cardinality()];
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25891);int i = 0;
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25892);int j=0;
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25893);while((j=coll.nextSetBit(j)) != -1) {{
            __CLR4_1_2jxijxil3lqxtvn.R.inc(25896);result[i++] = j++;            
        }
        }__CLR4_1_2jxijxil3lqxtvn.R.inc(25897);return result;
    }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}
    
    @Test
    public void testTimesExtractOrBitset() {__CLR4_1_2jxijxil3lqxtvn.R.globalSliceStart(getClass().getName(),25898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29wtl1ojze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2jxijxil3lqxtvn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2jxijxil3lqxtvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.HashSetvBitSetTest.testTimesExtractOrBitset",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25898,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29wtl1ojze(){try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25898);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25899);final BitSet toRemove = new BitSet();
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25900);final int[] array = new int[100];
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25901);toRemove.set(10, 20);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25902);timeBitSetRemoveAll(array, toRemove); // warmup
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25903);timeExtractRemoveAll(array, toRemove); // warmup
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25904);long timeDiff = printTimes(100,1);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25905);timeDiff += printTimes(100,10);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25906);timeDiff += printTimes(100,50);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25907);timeDiff += printTimes(100,100);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25908);timeDiff += printTimes(1000,10);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25909);timeDiff += printTimes(1000,100);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25910);timeDiff += printTimes(1000,500);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25911);timeDiff += printTimes(1000,1000);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25912);Assert.assertTrue(timeDiff <= 0);
    }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}

    private long printTimes(final int arraySize, final int bitSetSize) {try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25913);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25914);final int[] array = new int[arraySize];
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25915);final BitSet remove = new BitSet();
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25916);for (int i = 0; (((i < bitSetSize)&&(__CLR4_1_2jxijxil3lqxtvn.R.iget(25917)!=0|true))||(__CLR4_1_2jxijxil3lqxtvn.R.iget(25918)==0&false)); i++) {{
            __CLR4_1_2jxijxil3lqxtvn.R.inc(25919);remove.set(i);
        }
        }__CLR4_1_2jxijxil3lqxtvn.R.inc(25920);final long bitSet = timeBitSetRemoveAll(array, remove );
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25921);final long extract = timeExtractRemoveAll(array, remove);
        // If percent is less than 100, then direct use of bitset is faster
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25922);System.out.println("Ratio="+(bitSet*100/extract)+"% array="+array.length+" count="+remove.cardinality()+" extract="+extract+" bitset="+bitSet);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25923);return bitSet - extract;
    }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}

    private long timeBitSetRemoveAll(final int[] array, final BitSet toRemove) {try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25924);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25925);int[] output = new int[0];
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25926);final long start = System.nanoTime();
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25927);for(int i = 0; (((i < LOOPS2)&&(__CLR4_1_2jxijxil3lqxtvn.R.iget(25928)!=0|true))||(__CLR4_1_2jxijxil3lqxtvn.R.iget(25929)==0&false)); i++){{
            __CLR4_1_2jxijxil3lqxtvn.R.inc(25930);output = (int[]) ArrayUtils.removeAll(array, toRemove);            
        }
        }__CLR4_1_2jxijxil3lqxtvn.R.inc(25931);final long end = System.nanoTime();
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25932);Assert.assertEquals(array.length-toRemove.cardinality(), output.length);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25933);return end - start;
    }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}
    
    private long timeExtractRemoveAll(final int[] array, final BitSet toRemove) {try{__CLR4_1_2jxijxil3lqxtvn.R.inc(25934);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25935);int[] output = new int[0];
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25936);final long start = System.nanoTime();
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25937);for(int i = 0; (((i < LOOPS2)&&(__CLR4_1_2jxijxil3lqxtvn.R.iget(25938)!=0|true))||(__CLR4_1_2jxijxil3lqxtvn.R.iget(25939)==0&false)); i++){{
            __CLR4_1_2jxijxil3lqxtvn.R.inc(25940);final int[] extractIndices = extractIndices(toRemove);
            __CLR4_1_2jxijxil3lqxtvn.R.inc(25941);output = (int[]) ArrayUtils.removeAll((Object)array, extractIndices);
        }
        }__CLR4_1_2jxijxil3lqxtvn.R.inc(25942);final long end = System.nanoTime();
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25943);Assert.assertEquals(array.length-toRemove.cardinality(), output.length);
        __CLR4_1_2jxijxil3lqxtvn.R.inc(25944);return end - start;
    }finally{__CLR4_1_2jxijxil3lqxtvn.R.flushNeeded();}}
    
}