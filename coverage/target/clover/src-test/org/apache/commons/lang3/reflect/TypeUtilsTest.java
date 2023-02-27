/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
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
package org.apache.commons.lang3.reflect;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URI;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.reflect.testbed.Foo;
import org.apache.commons.lang3.reflect.testbed.GenericParent;
import org.apache.commons.lang3.reflect.testbed.GenericTypeHolder;
import org.apache.commons.lang3.reflect.testbed.StringParameterizedChild;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test TypeUtils
 * @version $Id$
 */
@SuppressWarnings({ "unchecked", "unused" , "rawtypes", "null"})
//raw types, where used, are used purposely
public class TypeUtilsTest<B> {static class __CLR4_4_1shkshkl3arw5gv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1652829301771L,8589935092L,37367,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public interface This<K, V> {
    }

    public class That<K, V> implements This<K, V> {
    }

    public interface And<K, V> extends This<Number, Number> {
    }

    public class The<K, V> extends That<Number, Number> implements And<String, String> {
    }

    public class Other<T> implements This<String, T> {
    }

    public class Thing<Q> extends Other<B> {
    }

    public class Tester implements This<String, B> {
    }

    public This<String, String> dis;

    public That<String, String> dat;

    public The<String, String> da;

    public Other<String> uhder;

    public Thing ding;

    public TypeUtilsTest<String>.Tester tester;

    public Tester tester2;

    public TypeUtilsTest<String>.That<String, String> dat2;

    public TypeUtilsTest<Number>.That<String, String> dat3;

    public Comparable<? extends Integer>[] intWildcardComparable;

    public static Comparable<String> stringComparable;

    public static Comparable<URI> uriComparable;

    public static Comparable<Integer> intComparable;

    public static Comparable<Long> longComparable;

    public static URI uri;

    public void dummyMethod(final List list0, final List<Object> list1, final List<?> list2,
            final List<? super Object> list3, final List<String> list4, final List<? extends String> list5,
            final List<? super String> list6, final List[] list7, final List<Object>[] list8, final List<?>[] list9,
            final List<? super Object>[] list10, final List<String>[] list11, final List<? extends String>[] list12,
            final List<? super String>[] list13) {try{__CLR4_4_1shkshkl3arw5gv.R.inc(36920);
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    @SuppressWarnings("boxing") // deliberately used here
    @Test
    public void testIsAssignable() throws SecurityException, NoSuchMethodException,
            NoSuchFieldException {__CLR4_4_1shkshkl3arw5gv.R.globalSliceStart(getClass().getName(),36921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143to2cshl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shkshkl3arw5gv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shkshkl3arw5gv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testIsAssignable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143to2cshl() throws SecurityException, NoSuchMethodException, NoSuchFieldException{try{__CLR4_4_1shkshkl3arw5gv.R.inc(36921);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36922);List list0 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36923);List<Object> list1 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36924);List<?> list2 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36925);List<? super Object> list3 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36926);List<String> list4 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36927);List<? extends String> list5 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36928);List<? super String> list6 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36929);List[] list7 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36930);List<Object>[] list8 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36931);List<?>[] list9 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36932);List<? super Object>[] list10 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36933);List<String>[] list11 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36934);List<? extends String>[] list12 = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36935);List<? super String>[] list13;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36936);final Class<?> clazz = getClass();
        __CLR4_4_1shkshkl3arw5gv.R.inc(36937);final Method method = clazz.getMethod("dummyMethod", List.class, List.class, List.class,
                List.class, List.class, List.class, List.class, List[].class, List[].class,
                List[].class, List[].class, List[].class, List[].class, List[].class);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36938);final Type[] types = method.getGenericParameterTypes();
//        list0 = list0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36939);delegateBooleanAssertion(types, 0, 0, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36940);list1 = list0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36941);delegateBooleanAssertion(types, 0, 1, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36942);list0 = list1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36943);delegateBooleanAssertion(types, 1, 0, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36944);list2 = list0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36945);delegateBooleanAssertion(types, 0, 2, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36946);list0 = list2;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36947);delegateBooleanAssertion(types, 2, 0, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36948);list3 = list0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36949);delegateBooleanAssertion(types, 0, 3, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36950);list0 = list3;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36951);delegateBooleanAssertion(types, 3, 0, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36952);list4 = list0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36953);delegateBooleanAssertion(types, 0, 4, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36954);list0 = list4;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36955);delegateBooleanAssertion(types, 4, 0, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36956);list5 = list0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36957);delegateBooleanAssertion(types, 0, 5, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36958);list0 = list5;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36959);delegateBooleanAssertion(types, 5, 0, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36960);list6 = list0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36961);delegateBooleanAssertion(types, 0, 6, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36962);list0 = list6;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36963);delegateBooleanAssertion(types, 6, 0, true);
//        list1 = list1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36964);delegateBooleanAssertion(types, 1, 1, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36965);list2 = list1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36966);delegateBooleanAssertion(types, 1, 2, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36967);list1 = (List<Object>) list2;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36968);delegateBooleanAssertion(types, 2, 1, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36969);list3 = list1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36970);delegateBooleanAssertion(types, 1, 3, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36971);list1 = (List<Object>) list3;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36972);delegateBooleanAssertion(types, 3, 1, false);
        // list4 = list1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36973);delegateBooleanAssertion(types, 1, 4, false);
        // list1 = list4;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36974);delegateBooleanAssertion(types, 4, 1, false);
        // list5 = list1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36975);delegateBooleanAssertion(types, 1, 5, false);
        // list1 = list5;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36976);delegateBooleanAssertion(types, 5, 1, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36977);list6 = list1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36978);delegateBooleanAssertion(types, 1, 6, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36979);list1 = (List<Object>) list6;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36980);delegateBooleanAssertion(types, 6, 1, false);
//        list2 = list2;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36981);delegateBooleanAssertion(types, 2, 2, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36982);list2 = list3;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36983);delegateBooleanAssertion(types, 2, 3, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36984);list2 = list4;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36985);delegateBooleanAssertion(types, 3, 2, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36986);list3 = (List<? super Object>) list2;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36987);delegateBooleanAssertion(types, 2, 4, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36988);list2 = list5;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36989);delegateBooleanAssertion(types, 4, 2, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36990);list4 = (List<String>) list2;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36991);delegateBooleanAssertion(types, 2, 5, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36992);list2 = list6;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36993);delegateBooleanAssertion(types, 5, 2, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36994);list5 = (List<? extends String>) list2;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36995);delegateBooleanAssertion(types, 2, 6, false);
//        list3 = list3;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36996);delegateBooleanAssertion(types, 6, 2, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(36997);list6 = (List<? super String>) list2;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36998);delegateBooleanAssertion(types, 3, 3, true);
        // list4 = list3;
        __CLR4_4_1shkshkl3arw5gv.R.inc(36999);delegateBooleanAssertion(types, 3, 4, false);
        // list3 = list4;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37000);delegateBooleanAssertion(types, 4, 3, false);
        // list5 = list3;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37001);delegateBooleanAssertion(types, 3, 5, false);
        // list3 = list5;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37002);delegateBooleanAssertion(types, 5, 3, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37003);list6 = list3;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37004);delegateBooleanAssertion(types, 3, 6, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37005);list3 = (List<? super Object>) list6;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37006);delegateBooleanAssertion(types, 6, 3, false);
//        list4 = list4;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37007);delegateBooleanAssertion(types, 4, 4, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37008);list5 = list4;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37009);delegateBooleanAssertion(types, 4, 5, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37010);list4 = (List<String>) list5;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37011);delegateBooleanAssertion(types, 5, 4, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37012);list6 = list4;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37013);delegateBooleanAssertion(types, 4, 6, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37014);list4 = (List<String>) list6;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37015);delegateBooleanAssertion(types, 6, 4, false);
//        list5 = list5;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37016);delegateBooleanAssertion(types, 5, 5, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37017);list6 = (List<? super String>) list5;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37018);delegateBooleanAssertion(types, 5, 6, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37019);list5 = (List<? extends String>) list6;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37020);delegateBooleanAssertion(types, 6, 5, false);
//        list6 = list6;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37021);delegateBooleanAssertion(types, 6, 6, true);

//        list7 = list7;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37022);delegateBooleanAssertion(types, 7, 7, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37023);list8 = list7;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37024);delegateBooleanAssertion(types, 7, 8, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37025);list7 = list8;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37026);delegateBooleanAssertion(types, 8, 7, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37027);list9 = list7;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37028);delegateBooleanAssertion(types, 7, 9, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37029);list7 = list9;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37030);delegateBooleanAssertion(types, 9, 7, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37031);list10 = list7;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37032);delegateBooleanAssertion(types, 7, 10, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37033);list7 = list10;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37034);delegateBooleanAssertion(types, 10, 7, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37035);list11 = list7;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37036);delegateBooleanAssertion(types, 7, 11, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37037);list7 = list11;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37038);delegateBooleanAssertion(types, 11, 7, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37039);list12 = list7;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37040);delegateBooleanAssertion(types, 7, 12, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37041);list7 = list12;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37042);delegateBooleanAssertion(types, 12, 7, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37043);list13 = list7;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37044);delegateBooleanAssertion(types, 7, 13, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37045);list7 = list13;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37046);delegateBooleanAssertion(types, 13, 7, true);
//        list8 = list8;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37047);delegateBooleanAssertion(types, 8, 8, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37048);list9 = list8;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37049);delegateBooleanAssertion(types, 8, 9, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37050);list8 = (List<Object>[]) list9;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37051);delegateBooleanAssertion(types, 9, 8, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37052);list10 = list8;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37053);delegateBooleanAssertion(types, 8, 10, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37054);list8 = (List<Object>[]) list10; // NOTE cast is required by Sun Java, but not by Eclipse
        __CLR4_4_1shkshkl3arw5gv.R.inc(37055);delegateBooleanAssertion(types, 10, 8, false);
        // list11 = list8;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37056);delegateBooleanAssertion(types, 8, 11, false);
        // list8 = list11;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37057);delegateBooleanAssertion(types, 11, 8, false);
        // list12 = list8;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37058);delegateBooleanAssertion(types, 8, 12, false);
        // list8 = list12;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37059);delegateBooleanAssertion(types, 12, 8, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37060);list13 = list8;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37061);delegateBooleanAssertion(types, 8, 13, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37062);list8 = (List<Object>[]) list13;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37063);delegateBooleanAssertion(types, 13, 8, false);
//        list9 = list9;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37064);delegateBooleanAssertion(types, 9, 9, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37065);list10 = (List<? super Object>[]) list9;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37066);delegateBooleanAssertion(types, 9, 10, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37067);list9 = list10;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37068);delegateBooleanAssertion(types, 10, 9, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37069);list11 = (List<String>[]) list9;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37070);delegateBooleanAssertion(types, 9, 11, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37071);list9 = list11;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37072);delegateBooleanAssertion(types, 11, 9, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37073);list12 = (List<? extends String>[]) list9;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37074);delegateBooleanAssertion(types, 9, 12, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37075);list9 = list12;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37076);delegateBooleanAssertion(types, 12, 9, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37077);list13 = (List<? super String>[]) list9;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37078);delegateBooleanAssertion(types, 9, 13, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37079);list9 = list13;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37080);delegateBooleanAssertion(types, 13, 9, true);
//        list10 = list10;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37081);delegateBooleanAssertion(types, 10, 10, true);
        // list11 = list10;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37082);delegateBooleanAssertion(types, 10, 11, false);
        // list10 = list11;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37083);delegateBooleanAssertion(types, 11, 10, false);
        // list12 = list10;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37084);delegateBooleanAssertion(types, 10, 12, false);
        // list10 = list12;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37085);delegateBooleanAssertion(types, 12, 10, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37086);list13 = list10;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37087);delegateBooleanAssertion(types, 10, 13, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37088);list10 = (List<? super Object>[]) list13;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37089);delegateBooleanAssertion(types, 13, 10, false);
//        list11 = list11;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37090);delegateBooleanAssertion(types, 11, 11, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37091);list12 = list11;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37092);delegateBooleanAssertion(types, 11, 12, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37093);list11 = (List<String>[]) list12;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37094);delegateBooleanAssertion(types, 12, 11, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37095);list13 = list11;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37096);delegateBooleanAssertion(types, 11, 13, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37097);list11 = (List<String>[]) list13;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37098);delegateBooleanAssertion(types, 13, 11, false);
//        list12 = list12;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37099);delegateBooleanAssertion(types, 12, 12, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37100);list13 = (List<? super String>[]) list12;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37101);delegateBooleanAssertion(types, 12, 13, false);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37102);list12 = (List<? extends String>[]) list13;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37103);delegateBooleanAssertion(types, 13, 12, false);
//        list13 = list13;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37104);delegateBooleanAssertion(types, 13, 13, true);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37105);final Type disType = getClass().getField("dis").getGenericType();
        // Reporter.log( ( ( ParameterizedType ) disType
        // ).getOwnerType().getClass().toString() );
        __CLR4_4_1shkshkl3arw5gv.R.inc(37106);final Type datType = getClass().getField("dat").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37107);final Type daType = getClass().getField("da").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37108);final Type uhderType = getClass().getField("uhder").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37109);final Type dingType = getClass().getField("ding").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37110);final Type testerType = getClass().getField("tester").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37111);final Type tester2Type = getClass().getField("tester2").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37112);final Type dat2Type = getClass().getField("dat2").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37113);final Type dat3Type = getClass().getField("dat3").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37114);dis = dat;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37115);Assert.assertTrue(TypeUtils.isAssignable(datType, disType));
        // dis = da;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37116);Assert.assertFalse(TypeUtils.isAssignable(daType, disType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37117);dis = uhder;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37118);Assert.assertTrue(TypeUtils.isAssignable(uhderType, disType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37119);dis = ding;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37120);Assert.assertFalse(String.format("type %s not assignable to %s!", dingType, disType),
                TypeUtils.isAssignable(dingType, disType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37121);dis = tester;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37122);Assert.assertTrue(TypeUtils.isAssignable(testerType, disType));
        // dis = tester2;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37123);Assert.assertFalse(TypeUtils.isAssignable(tester2Type, disType));
        // dat = dat2;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37124);Assert.assertFalse(TypeUtils.isAssignable(dat2Type, datType));
        // dat2 = dat;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37125);Assert.assertFalse(TypeUtils.isAssignable(datType, dat2Type));
        // dat = dat3;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37126);Assert.assertFalse(TypeUtils.isAssignable(dat3Type, datType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37127);final char ch = 0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37128);final boolean bo = false;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37129);final byte by = 0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37130);final short sh = 0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37131);int in = 0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37132);long lo = 0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37133);final float fl = 0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37134);double du = 0;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37135);du = ch;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37136);Assert.assertTrue(TypeUtils.isAssignable(char.class, double.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37137);du = by;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37138);Assert.assertTrue(TypeUtils.isAssignable(byte.class, double.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37139);du = sh;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37140);Assert.assertTrue(TypeUtils.isAssignable(short.class, double.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37141);du = in;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37142);Assert.assertTrue(TypeUtils.isAssignable(int.class, double.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37143);du = lo;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37144);Assert.assertTrue(TypeUtils.isAssignable(long.class, double.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37145);du = fl;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37146);Assert.assertTrue(TypeUtils.isAssignable(float.class, double.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37147);lo = in;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37148);Assert.assertTrue(TypeUtils.isAssignable(int.class, long.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37149);lo = Integer.valueOf(0);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37150);Assert.assertTrue(TypeUtils.isAssignable(Integer.class, long.class));
        // Long lngW = 1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37151);Assert.assertFalse(TypeUtils.isAssignable(int.class, Long.class));
        // lngW = Integer.valueOf( 0 );
        __CLR4_4_1shkshkl3arw5gv.R.inc(37152);Assert.assertFalse(TypeUtils.isAssignable(Integer.class, Long.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37153);in = Integer.valueOf(0);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37154);Assert.assertTrue(TypeUtils.isAssignable(Integer.class, int.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37155);final Integer inte = in;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37156);Assert.assertTrue(TypeUtils.isAssignable(int.class, Integer.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37157);Assert.assertTrue(TypeUtils.isAssignable(int.class, Number.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37158);Assert.assertTrue(TypeUtils.isAssignable(int.class, Object.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37159);final Type intComparableType = getClass().getField("intComparable").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37160);intComparable = 1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37161);Assert.assertTrue(TypeUtils.isAssignable(int.class, intComparableType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37162);Assert.assertTrue(TypeUtils.isAssignable(int.class, Comparable.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37163);final Serializable ser = 1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37164);Assert.assertTrue(TypeUtils.isAssignable(int.class, Serializable.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37165);final Type longComparableType = getClass().getField("longComparable").getGenericType();
        // longComparable = 1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37166);Assert.assertFalse(TypeUtils.isAssignable(int.class, longComparableType));
        // longComparable = Integer.valueOf( 0 );
        __CLR4_4_1shkshkl3arw5gv.R.inc(37167);Assert.assertFalse(TypeUtils.isAssignable(Integer.class, longComparableType));
        // int[] ia;
        // long[] la = ia;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37168);Assert.assertFalse(TypeUtils.isAssignable(int[].class, long[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37169);final Integer[] ia = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37170);final Type caType = getClass().getField("intWildcardComparable").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37171);intWildcardComparable = ia;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37172);Assert.assertTrue(TypeUtils.isAssignable(Integer[].class, caType));
        // int[] ina = ia;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37173);Assert.assertFalse(TypeUtils.isAssignable(Integer[].class, int[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37174);final int[] ina = null;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37175);Object[] oa;
        // oa = ina;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37176);Assert.assertFalse(TypeUtils.isAssignable(int[].class, Object[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37177);oa = new Integer[0];
        __CLR4_4_1shkshkl3arw5gv.R.inc(37178);Assert.assertTrue(TypeUtils.isAssignable(Integer[].class, Object[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37179);final Type bClassType = AClass.class.getField("bClass").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37180);final Type cClassType = AClass.class.getField("cClass").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37181);final Type dClassType = AClass.class.getField("dClass").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37182);final Type eClassType = AClass.class.getField("eClass").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37183);final Type fClassType = AClass.class.getField("fClass").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37184);final AClass aClass = new AClass(new AAClass<String>());
        __CLR4_4_1shkshkl3arw5gv.R.inc(37185);aClass.bClass = aClass.cClass;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37186);Assert.assertTrue(TypeUtils.isAssignable(cClassType, bClassType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37187);aClass.bClass = aClass.dClass;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37188);Assert.assertTrue(TypeUtils.isAssignable(dClassType, bClassType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37189);aClass.bClass = aClass.eClass;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37190);Assert.assertTrue(TypeUtils.isAssignable(eClassType, bClassType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37191);aClass.bClass = aClass.fClass;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37192);Assert.assertTrue(TypeUtils.isAssignable(fClassType, bClassType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37193);aClass.cClass = aClass.dClass;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37194);Assert.assertTrue(TypeUtils.isAssignable(dClassType, cClassType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37195);aClass.cClass = aClass.eClass;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37196);Assert.assertTrue(TypeUtils.isAssignable(eClassType, cClassType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37197);aClass.cClass = aClass.fClass;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37198);Assert.assertTrue(TypeUtils.isAssignable(fClassType, cClassType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37199);aClass.dClass = aClass.eClass;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37200);Assert.assertTrue(TypeUtils.isAssignable(eClassType, dClassType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37201);aClass.dClass = aClass.fClass;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37202);Assert.assertTrue(TypeUtils.isAssignable(fClassType, dClassType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37203);aClass.eClass = aClass.fClass;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37204);Assert.assertTrue(TypeUtils.isAssignable(fClassType, eClassType));
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    public void delegateBooleanAssertion(final Type[] types, final int i2, final int i1, final boolean expected) {try{__CLR4_4_1shkshkl3arw5gv.R.inc(37205);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37206);final Type type1 = types[i1];
        __CLR4_4_1shkshkl3arw5gv.R.inc(37207);final Type type2 = types[i2];
        __CLR4_4_1shkshkl3arw5gv.R.inc(37208);final boolean isAssignable = TypeUtils.isAssignable(type2, type1);

        __CLR4_4_1shkshkl3arw5gv.R.inc(37209);if ((((expected)&&(__CLR4_4_1shkshkl3arw5gv.R.iget(37210)!=0|true))||(__CLR4_4_1shkshkl3arw5gv.R.iget(37211)==0&false))) {{
            __CLR4_4_1shkshkl3arw5gv.R.inc(37212);Assert.assertTrue("[" + i1 + ", " + i2 + "]: From "
                    + StringEscapeUtils.escapeHtml4(String.valueOf(type2)) + " to "
                    + StringEscapeUtils.escapeHtml4(String.valueOf(type1)), isAssignable);
        } }else {{
            __CLR4_4_1shkshkl3arw5gv.R.inc(37213);Assert.assertFalse("[" + i1 + ", " + i2 + "]: From "
                    + StringEscapeUtils.escapeHtml4(String.valueOf(type2)) + " to "
                    + StringEscapeUtils.escapeHtml4(String.valueOf(type1)), isAssignable);
        }
    }}finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    @SuppressWarnings("boxing") // boxing is deliberate here
    @Test
    public void testIsInstance() throws SecurityException, NoSuchFieldException {__CLR4_4_1shkshkl3arw5gv.R.globalSliceStart(getClass().getName(),37214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ojkxqgspq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shkshkl3arw5gv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shkshkl3arw5gv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testIsInstance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ojkxqgspq() throws SecurityException, NoSuchFieldException{try{__CLR4_4_1shkshkl3arw5gv.R.inc(37214);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37215);final Type intComparableType = getClass().getField("intComparable").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37216);final Type uriComparableType = getClass().getField("uriComparable").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37217);intComparable = 1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37218);Assert.assertTrue(TypeUtils.isInstance(1, intComparableType));
        // uriComparable = 1;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37219);Assert.assertFalse(TypeUtils.isInstance(1, uriComparableType));
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    @Test
    public void testGetTypeArguments() {__CLR4_4_1shkshkl3arw5gv.R.globalSliceStart(getClass().getName(),37220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b8w29rspw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shkshkl3arw5gv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shkshkl3arw5gv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testGetTypeArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b8w29rspw(){try{__CLR4_4_1shkshkl3arw5gv.R.inc(37220);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37221);Map<TypeVariable<?>, Type> typeVarAssigns;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37222);TypeVariable<?> treeSetTypeVar;
        __CLR4_4_1shkshkl3arw5gv.R.inc(37223);Type typeArg;

        __CLR4_4_1shkshkl3arw5gv.R.inc(37224);typeVarAssigns = TypeUtils.getTypeArguments(Integer.class, Comparable.class);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37225);treeSetTypeVar = Comparable.class.getTypeParameters()[0];
        __CLR4_4_1shkshkl3arw5gv.R.inc(37226);Assert.assertTrue("Type var assigns for Comparable from Integer: " + typeVarAssigns,
                typeVarAssigns.containsKey(treeSetTypeVar));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37227);typeArg = typeVarAssigns.get(treeSetTypeVar);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37228);Assert.assertEquals("Type argument of Comparable from Integer: " + typeArg, Integer.class,
                typeVarAssigns.get(treeSetTypeVar));

        __CLR4_4_1shkshkl3arw5gv.R.inc(37229);typeVarAssigns = TypeUtils.getTypeArguments(int.class, Comparable.class);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37230);treeSetTypeVar = Comparable.class.getTypeParameters()[0];
        __CLR4_4_1shkshkl3arw5gv.R.inc(37231);Assert.assertTrue("Type var assigns for Comparable from int: " + typeVarAssigns,
                typeVarAssigns.containsKey(treeSetTypeVar));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37232);typeArg = typeVarAssigns.get(treeSetTypeVar);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37233);Assert.assertEquals("Type argument of Comparable from int: " + typeArg, Integer.class,
                typeVarAssigns.get(treeSetTypeVar));

        __CLR4_4_1shkshkl3arw5gv.R.inc(37234);final Collection<Integer> col = Arrays.asList(new Integer[0]);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37235);typeVarAssigns = TypeUtils.getTypeArguments(List.class, Collection.class);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37236);treeSetTypeVar = Comparable.class.getTypeParameters()[0];
        __CLR4_4_1shkshkl3arw5gv.R.inc(37237);Assert.assertFalse("Type var assigns for Collection from List: " + typeVarAssigns,
                typeVarAssigns.containsKey(treeSetTypeVar));

        __CLR4_4_1shkshkl3arw5gv.R.inc(37238);typeVarAssigns = TypeUtils.getTypeArguments(AAAClass.BBBClass.class, AAClass.BBClass.class);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37239);Assert.assertTrue(typeVarAssigns.size() == 2);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37240);Assert.assertEquals(String.class, typeVarAssigns.get(AAClass.class.getTypeParameters()[0]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37241);Assert.assertEquals(String.class, typeVarAssigns.get(AAClass.BBClass.class.getTypeParameters()[0]));

        __CLR4_4_1shkshkl3arw5gv.R.inc(37242);typeVarAssigns = TypeUtils.getTypeArguments(Other.class, This.class);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37243);Assert.assertEquals(2, typeVarAssigns.size());
        __CLR4_4_1shkshkl3arw5gv.R.inc(37244);Assert.assertEquals(String.class, typeVarAssigns.get(This.class.getTypeParameters()[0]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37245);Assert.assertEquals(Other.class.getTypeParameters()[0], typeVarAssigns.get(This.class.getTypeParameters()[1]));

        __CLR4_4_1shkshkl3arw5gv.R.inc(37246);typeVarAssigns = TypeUtils.getTypeArguments(And.class, This.class);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37247);Assert.assertEquals(2, typeVarAssigns.size());
        __CLR4_4_1shkshkl3arw5gv.R.inc(37248);Assert.assertEquals(Number.class, typeVarAssigns.get(This.class.getTypeParameters()[0]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37249);Assert.assertEquals(Number.class, typeVarAssigns.get(This.class.getTypeParameters()[1]));

        __CLR4_4_1shkshkl3arw5gv.R.inc(37250);typeVarAssigns = TypeUtils.getTypeArguments(Thing.class, Other.class);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37251);Assert.assertEquals(2, typeVarAssigns.size());
        __CLR4_4_1shkshkl3arw5gv.R.inc(37252);Assert.assertEquals(getClass().getTypeParameters()[0], typeVarAssigns.get(getClass().getTypeParameters()[0]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37253);Assert.assertEquals(getClass().getTypeParameters()[0], typeVarAssigns.get(Other.class.getTypeParameters()[0]));
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    @Test
    public void testTypesSatisfyVariables() throws SecurityException, NoSuchFieldException,
            NoSuchMethodException {__CLR4_4_1shkshkl3arw5gv.R.globalSliceStart(getClass().getName(),37254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdktcusqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shkshkl3arw5gv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shkshkl3arw5gv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testTypesSatisfyVariables",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdktcusqu() throws SecurityException, NoSuchFieldException, NoSuchMethodException{try{__CLR4_4_1shkshkl3arw5gv.R.inc(37254);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37255);final Map<TypeVariable<?>, Type> typeVarAssigns = new HashMap<TypeVariable<?>, Type>();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37256);final Integer max = TypeUtilsTest.stub();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37257);typeVarAssigns.put(getClass().getMethod("stub").getTypeParameters()[0], Integer.class);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37258);Assert.assertTrue(TypeUtils.typesSatisfyVariables(typeVarAssigns));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37259);typeVarAssigns.clear();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37260);typeVarAssigns.put(getClass().getMethod("stub2").getTypeParameters()[0], Integer.class);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37261);Assert.assertTrue(TypeUtils.typesSatisfyVariables(typeVarAssigns));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37262);typeVarAssigns.clear();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37263);typeVarAssigns.put(getClass().getMethod("stub3").getTypeParameters()[0], Integer.class);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37264);Assert.assertTrue(TypeUtils.typesSatisfyVariables(typeVarAssigns));
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    @Test
    public void testDetermineTypeVariableAssignments() throws SecurityException,
            NoSuchFieldException, NoSuchMethodException {__CLR4_4_1shkshkl3arw5gv.R.globalSliceStart(getClass().getName(),37265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bv7d92sr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shkshkl3arw5gv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shkshkl3arw5gv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testDetermineTypeVariableAssignments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bv7d92sr5() throws SecurityException, NoSuchFieldException, NoSuchMethodException{try{__CLR4_4_1shkshkl3arw5gv.R.inc(37265);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37266);final ParameterizedType iterableType = (ParameterizedType) getClass().getField("iterable")
                .getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37267);final Map<TypeVariable<?>, Type> typeVarAssigns = TypeUtils.determineTypeArguments(TreeSet.class,
                iterableType);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37268);final TypeVariable<?> treeSetTypeVar = TreeSet.class.getTypeParameters()[0];
        __CLR4_4_1shkshkl3arw5gv.R.inc(37269);Assert.assertTrue(typeVarAssigns.containsKey(treeSetTypeVar));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37270);Assert.assertEquals(iterableType.getActualTypeArguments()[0], typeVarAssigns
                .get(treeSetTypeVar));
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    @Test
    public void testGetRawType() throws SecurityException, NoSuchFieldException {__CLR4_4_1shkshkl3arw5gv.R.globalSliceStart(getClass().getName(),37271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11t0cudsrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shkshkl3arw5gv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shkshkl3arw5gv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testGetRawType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11t0cudsrb() throws SecurityException, NoSuchFieldException{try{__CLR4_4_1shkshkl3arw5gv.R.inc(37271);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37272);final Type stringParentFieldType = GenericTypeHolder.class.getDeclaredField("stringParent")
                .getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37273);final Type integerParentFieldType = GenericTypeHolder.class.getDeclaredField("integerParent")
                .getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37274);final Type foosFieldType = GenericTypeHolder.class.getDeclaredField("foos").getGenericType();
        __CLR4_4_1shkshkl3arw5gv.R.inc(37275);final Type genericParentT = GenericParent.class.getTypeParameters()[0];
        __CLR4_4_1shkshkl3arw5gv.R.inc(37276);Assert.assertEquals(GenericParent.class, TypeUtils.getRawType(stringParentFieldType, null));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37277);Assert
                .assertEquals(GenericParent.class, TypeUtils.getRawType(integerParentFieldType,
                        null));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37278);Assert.assertEquals(List.class, TypeUtils.getRawType(foosFieldType, null));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37279);Assert.assertEquals(String.class, TypeUtils.getRawType(genericParentT,
                StringParameterizedChild.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37280);Assert.assertEquals(String.class, TypeUtils.getRawType(genericParentT,
                stringParentFieldType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37281);Assert.assertEquals(Foo.class, TypeUtils.getRawType(Iterable.class.getTypeParameters()[0],
                foosFieldType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37282);Assert.assertEquals(Foo.class, TypeUtils.getRawType(List.class.getTypeParameters()[0],
                foosFieldType));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37283);Assert.assertNull(TypeUtils.getRawType(genericParentT, GenericParent.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37284);Assert.assertEquals(GenericParent[].class, TypeUtils.getRawType(GenericTypeHolder.class
                .getDeclaredField("barParents").getGenericType(), null));
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    @Test
    public void testIsArrayTypeClasses() {__CLR4_4_1shkshkl3arw5gv.R.globalSliceStart(getClass().getName(),37285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e9kbx2srp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shkshkl3arw5gv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shkshkl3arw5gv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testIsArrayTypeClasses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e9kbx2srp(){try{__CLR4_4_1shkshkl3arw5gv.R.inc(37285);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37286);Assert.assertTrue(TypeUtils.isArrayType(boolean[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37287);Assert.assertTrue(TypeUtils.isArrayType(byte[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37288);Assert.assertTrue(TypeUtils.isArrayType(short[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37289);Assert.assertTrue(TypeUtils.isArrayType(int[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37290);Assert.assertTrue(TypeUtils.isArrayType(char[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37291);Assert.assertTrue(TypeUtils.isArrayType(long[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37292);Assert.assertTrue(TypeUtils.isArrayType(float[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37293);Assert.assertTrue(TypeUtils.isArrayType(double[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37294);Assert.assertTrue(TypeUtils.isArrayType(Object[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37295);Assert.assertTrue(TypeUtils.isArrayType(String[].class));

        __CLR4_4_1shkshkl3arw5gv.R.inc(37296);Assert.assertFalse(TypeUtils.isArrayType(boolean.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37297);Assert.assertFalse(TypeUtils.isArrayType(byte.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37298);Assert.assertFalse(TypeUtils.isArrayType(short.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37299);Assert.assertFalse(TypeUtils.isArrayType(int.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37300);Assert.assertFalse(TypeUtils.isArrayType(char.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37301);Assert.assertFalse(TypeUtils.isArrayType(long.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37302);Assert.assertFalse(TypeUtils.isArrayType(float.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37303);Assert.assertFalse(TypeUtils.isArrayType(double.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37304);Assert.assertFalse(TypeUtils.isArrayType(Object.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37305);Assert.assertFalse(TypeUtils.isArrayType(String.class));
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    @Test
    public void testIsArrayGenericTypes() throws Exception {__CLR4_4_1shkshkl3arw5gv.R.globalSliceStart(getClass().getName(),37306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1an9cxmssa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shkshkl3arw5gv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shkshkl3arw5gv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testIsArrayGenericTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1an9cxmssa() throws Exception{try{__CLR4_4_1shkshkl3arw5gv.R.inc(37306);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37307);final Method method = getClass().getMethod("dummyMethod", List.class, List.class, List.class,
                List.class, List.class, List.class, List.class, List[].class, List[].class,
                List[].class, List[].class, List[].class, List[].class, List[].class);

        __CLR4_4_1shkshkl3arw5gv.R.inc(37308);final Type[] types = method.getGenericParameterTypes();

        __CLR4_4_1shkshkl3arw5gv.R.inc(37309);Assert.assertFalse(TypeUtils.isArrayType(types[0]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37310);Assert.assertFalse(TypeUtils.isArrayType(types[1]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37311);Assert.assertFalse(TypeUtils.isArrayType(types[2]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37312);Assert.assertFalse(TypeUtils.isArrayType(types[3]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37313);Assert.assertFalse(TypeUtils.isArrayType(types[4]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37314);Assert.assertFalse(TypeUtils.isArrayType(types[5]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37315);Assert.assertFalse(TypeUtils.isArrayType(types[6]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37316);Assert.assertTrue(TypeUtils.isArrayType(types[7]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37317);Assert.assertTrue(TypeUtils.isArrayType(types[8]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37318);Assert.assertTrue(TypeUtils.isArrayType(types[9]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37319);Assert.assertTrue(TypeUtils.isArrayType(types[10]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37320);Assert.assertTrue(TypeUtils.isArrayType(types[11]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37321);Assert.assertTrue(TypeUtils.isArrayType(types[12]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37322);Assert.assertTrue(TypeUtils.isArrayType(types[13]));
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    @Test
    public void testGetPrimitiveArrayComponentType() throws Exception {__CLR4_4_1shkshkl3arw5gv.R.globalSliceStart(getClass().getName(),37323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15cgtjsssr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shkshkl3arw5gv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shkshkl3arw5gv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testGetPrimitiveArrayComponentType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15cgtjsssr() throws Exception{try{__CLR4_4_1shkshkl3arw5gv.R.inc(37323);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37324);Assert.assertEquals(boolean.class, TypeUtils.getArrayComponentType(boolean[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37325);Assert.assertEquals(byte.class, TypeUtils.getArrayComponentType(byte[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37326);Assert.assertEquals(short.class, TypeUtils.getArrayComponentType(short[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37327);Assert.assertEquals(int.class, TypeUtils.getArrayComponentType(int[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37328);Assert.assertEquals(char.class, TypeUtils.getArrayComponentType(char[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37329);Assert.assertEquals(long.class, TypeUtils.getArrayComponentType(long[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37330);Assert.assertEquals(float.class, TypeUtils.getArrayComponentType(float[].class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37331);Assert.assertEquals(double.class, TypeUtils.getArrayComponentType(double[].class));

        __CLR4_4_1shkshkl3arw5gv.R.inc(37332);Assert.assertNull(TypeUtils.getArrayComponentType(boolean.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37333);Assert.assertNull(TypeUtils.getArrayComponentType(byte.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37334);Assert.assertNull(TypeUtils.getArrayComponentType(short.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37335);Assert.assertNull(TypeUtils.getArrayComponentType(int.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37336);Assert.assertNull(TypeUtils.getArrayComponentType(char.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37337);Assert.assertNull(TypeUtils.getArrayComponentType(long.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37338);Assert.assertNull(TypeUtils.getArrayComponentType(float.class));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37339);Assert.assertNull(TypeUtils.getArrayComponentType(double.class));
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    @Test
    public void testGetArrayComponentType() throws Exception {__CLR4_4_1shkshkl3arw5gv.R.globalSliceStart(getClass().getName(),37340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i67ertst8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shkshkl3arw5gv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shkshkl3arw5gv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testGetArrayComponentType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i67ertst8() throws Exception{try{__CLR4_4_1shkshkl3arw5gv.R.inc(37340);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37341);final Method method = getClass().getMethod("dummyMethod", List.class, List.class, List.class,
                List.class, List.class, List.class, List.class, List[].class, List[].class,
                List[].class, List[].class, List[].class, List[].class, List[].class);

        __CLR4_4_1shkshkl3arw5gv.R.inc(37342);final Type[] types = method.getGenericParameterTypes();

        __CLR4_4_1shkshkl3arw5gv.R.inc(37343);Assert.assertNull(TypeUtils.getArrayComponentType(types[0]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37344);Assert.assertNull(TypeUtils.getArrayComponentType(types[1]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37345);Assert.assertNull(TypeUtils.getArrayComponentType(types[2]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37346);Assert.assertNull(TypeUtils.getArrayComponentType(types[3]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37347);Assert.assertNull(TypeUtils.getArrayComponentType(types[4]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37348);Assert.assertNull(TypeUtils.getArrayComponentType(types[5]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37349);Assert.assertNull(TypeUtils.getArrayComponentType(types[6]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37350);Assert.assertEquals(types[0], TypeUtils.getArrayComponentType(types[7]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37351);Assert.assertEquals(types[1], TypeUtils.getArrayComponentType(types[8]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37352);Assert.assertEquals(types[2], TypeUtils.getArrayComponentType(types[9]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37353);Assert.assertEquals(types[3], TypeUtils.getArrayComponentType(types[10]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37354);Assert.assertEquals(types[4], TypeUtils.getArrayComponentType(types[11]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37355);Assert.assertEquals(types[5], TypeUtils.getArrayComponentType(types[12]));
        __CLR4_4_1shkshkl3arw5gv.R.inc(37356);Assert.assertEquals(types[6], TypeUtils.getArrayComponentType(types[13]));
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    @Test
    public void testLang820() throws Exception {__CLR4_4_1shkshkl3arw5gv.R.globalSliceStart(getClass().getName(),37357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plyk6bstp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1shkshkl3arw5gv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1shkshkl3arw5gv.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.TypeUtilsTest.testLang820",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plyk6bstp() throws Exception{try{__CLR4_4_1shkshkl3arw5gv.R.inc(37357);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37358);final Type[] typeArray = {String.class, String.class};
        __CLR4_4_1shkshkl3arw5gv.R.inc(37359);final Type[] expectedArray = {String.class};
        __CLR4_4_1shkshkl3arw5gv.R.inc(37360);Assert.assertArrayEquals(expectedArray, TypeUtils.normalizeUpperBounds(typeArray));
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    public Iterable<? extends Map<Integer, ? extends Collection<?>>> iterable;

    public static <G extends Comparable<G>> G stub() {try{__CLR4_4_1shkshkl3arw5gv.R.inc(37361);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37362);return null;
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    public static <G extends Comparable<? super G>> G stub2() {try{__CLR4_4_1shkshkl3arw5gv.R.inc(37363);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37364);return null;
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}

    public static <T extends Comparable<? extends T>> T stub3() {try{__CLR4_4_1shkshkl3arw5gv.R.inc(37365);
        __CLR4_4_1shkshkl3arw5gv.R.inc(37366);return null;
    }finally{__CLR4_4_1shkshkl3arw5gv.R.flushNeeded();}}
}

class AAClass<T> {

    public class BBClass<S> {
    }
}

class AAAClass extends AAClass<String> {
    public class BBBClass extends BBClass<String> {
    }
}

@SuppressWarnings("rawtypes")
//raw types, where used, are used purposely
class AClass extends AAClass<String>.BBClass<Number> {public static class __CLR4_4_1shkstzl3arw5gx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1652829301771L,8589935092L,37369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AClass(final AAClass<String> enclosingInstance) {
        enclosingInstance.super();__CLR4_4_1shkstzl3arw5gx.R.inc(37368);try{__CLR4_4_1shkstzl3arw5gx.R.inc(37367);
    }finally{__CLR4_4_1shkstzl3arw5gx.R.flushNeeded();}}

    public class BClass<T> {
    }

    public class CClass<T> extends BClass {
    }

    public class DClass<T> extends CClass<T> {
    }

    public class EClass<T> extends DClass {
    }

    public class FClass extends EClass<String> {
    }

    public class GClass<T extends BClass<? extends T> & AInterface<AInterface<? super T>>> {
    }

    public BClass<Number> bClass;

    public CClass<? extends String> cClass;

    public DClass<String> dClass;

    public EClass<String> eClass;

    public FClass fClass;

    public GClass gClass;

    public interface AInterface<T> {
    }
}
