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

package org.apache.commons.lang3.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Assert;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests concurrent access for {@link ReflectionToStringBuilder}.
 * <p>
 * The {@link ToStringStyle} class includes a registry to avoid infinite loops for objects with circular references. We
 * want to make sure that we do not get concurrency exceptions accessing this registry.
 * </p>
 * <p>
 * The tests on the non-thread-safe collections do not pass.
 * </p>
 * 
 * @see <a href="https://issues.apache.org/jira/browse/LANG-762">[LANG-762] Handle or document ReflectionToStringBuilder
 *      and ToStringBuilder for collections that are not thread safe</a>
 * @since 3.1
 * @version $Id$
 */
public class ReflectionToStringBuilderConcurrencyTest {static class __CLR4_1_2p7op7ol3lqxuen{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,32706,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static class CollectionHolder<T extends Collection<?>> {
        T collection;

        CollectionHolder(final T collection) {try{__CLR4_1_2p7op7ol3lqxuen.R.inc(32676);
            __CLR4_1_2p7op7ol3lqxuen.R.inc(32677);this.collection = collection;
        }finally{__CLR4_1_2p7op7ol3lqxuen.R.flushNeeded();}}
    }

    private static final int DATA_SIZE = 100000;
    private static final int REPEAT = 100;

//    @Test
//    @Ignore
//    public void testLinkedList() throws InterruptedException, ExecutionException {
//        this.testConcurrency(new CollectionHolder<List<Integer>>(new LinkedList<Integer>()));
//    }

//    @Test
//    @Ignore
//    public void testArrayList() throws InterruptedException, ExecutionException {
//        this.testConcurrency(new CollectionHolder<List<Integer>>(new ArrayList<Integer>()));
//    }

//    @Test
//    @Ignore
//    public void testCopyOnWriteArrayList() throws InterruptedException, ExecutionException {
//        this.testConcurrency(new CollectionHolder<List<Integer>>(new CopyOnWriteArrayList<Integer>()));
//    }

    private void testConcurrency(final CollectionHolder<List<Integer>> holder) throws InterruptedException,
            ExecutionException {try{__CLR4_1_2p7op7ol3lqxuen.R.inc(32678);
        __CLR4_1_2p7op7ol3lqxuen.R.inc(32679);final List<Integer> list = holder.collection;
        // make a big array that takes a long time to toString()
        __CLR4_1_2p7op7ol3lqxuen.R.inc(32680);for (int i = 0; (((i < DATA_SIZE)&&(__CLR4_1_2p7op7ol3lqxuen.R.iget(32681)!=0|true))||(__CLR4_1_2p7op7ol3lqxuen.R.iget(32682)==0&false)); i++) {{
            __CLR4_1_2p7op7ol3lqxuen.R.inc(32683);list.add(Integer.valueOf(i));
        }
        // Create a thread pool with two threads to cause the most contention on the underlying resource.
        }__CLR4_1_2p7op7ol3lqxuen.R.inc(32684);final ExecutorService threadPool = Executors.newFixedThreadPool(2);
        // Consumes toStrings
        __CLR4_1_2p7op7ol3lqxuen.R.inc(32685);final Callable<Integer> consumer = new Callable<Integer>() {
            @Override
            public Integer call() {try{__CLR4_1_2p7op7ol3lqxuen.R.inc(32686);
                __CLR4_1_2p7op7ol3lqxuen.R.inc(32687);for (int i = 0; (((i < REPEAT)&&(__CLR4_1_2p7op7ol3lqxuen.R.iget(32688)!=0|true))||(__CLR4_1_2p7op7ol3lqxuen.R.iget(32689)==0&false)); i++) {{
                    __CLR4_1_2p7op7ol3lqxuen.R.inc(32690);final String s = ReflectionToStringBuilder.toString(holder);
                    __CLR4_1_2p7op7ol3lqxuen.R.inc(32691);Assert.assertNotNull(s);
                }
                }__CLR4_1_2p7op7ol3lqxuen.R.inc(32692);return Integer.valueOf(REPEAT);
            }finally{__CLR4_1_2p7op7ol3lqxuen.R.flushNeeded();}}
        };
        // Produces changes in the list
        __CLR4_1_2p7op7ol3lqxuen.R.inc(32693);final Callable<Integer> producer = new Callable<Integer>() {
            @Override
            public Integer call() {try{__CLR4_1_2p7op7ol3lqxuen.R.inc(32694);
                __CLR4_1_2p7op7ol3lqxuen.R.inc(32695);for (int i = 0; (((i < DATA_SIZE)&&(__CLR4_1_2p7op7ol3lqxuen.R.iget(32696)!=0|true))||(__CLR4_1_2p7op7ol3lqxuen.R.iget(32697)==0&false)); i++) {{
                    __CLR4_1_2p7op7ol3lqxuen.R.inc(32698);list.remove(list.get(0));
                }
                }__CLR4_1_2p7op7ol3lqxuen.R.inc(32699);return Integer.valueOf(REPEAT);
            }finally{__CLR4_1_2p7op7ol3lqxuen.R.flushNeeded();}}
        };
        __CLR4_1_2p7op7ol3lqxuen.R.inc(32700);final Collection<Callable<Integer>> tasks = new ArrayList<Callable<Integer>>();
        __CLR4_1_2p7op7ol3lqxuen.R.inc(32701);tasks.add(consumer);
        __CLR4_1_2p7op7ol3lqxuen.R.inc(32702);tasks.add(producer);
        __CLR4_1_2p7op7ol3lqxuen.R.inc(32703);final List<Future<Integer>> futures = threadPool.invokeAll(tasks);
        __CLR4_1_2p7op7ol3lqxuen.R.inc(32704);for (final Future<Integer> future : futures) {{
            __CLR4_1_2p7op7ol3lqxuen.R.inc(32705);Assert.assertEquals(REPEAT, future.get().intValue());
        }
    }}finally{__CLR4_1_2p7op7ol3lqxuen.R.flushNeeded();}}
}
