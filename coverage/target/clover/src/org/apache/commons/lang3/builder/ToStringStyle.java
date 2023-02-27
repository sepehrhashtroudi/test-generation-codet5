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

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.SystemUtils;

/**
 * <p>Controls <code>String</code> formatting for {@link ToStringBuilder}.
 * The main public interface is always via <code>ToStringBuilder</code>.</p>
 *
 * <p>These classes are intended to be used as <code>Singletons</code>.
 * There is no need to instantiate a new style each time. A program
 * will generally use one of the predefined constants on this class.
 * Alternatively, the {@link StandardToStringStyle} class can be used
 * to set the individual settings. Thus most styles can be achieved
 * without subclassing.</p>
 *
 * <p>If required, a subclass can override as many or as few of the
 * methods as it requires. Each object type (from <code>boolean</code>
 * to <code>long</code> to <code>Object</code> to <code>int[]</code>) has
 * its own methods to output it. Most have two versions, detail and summary.
 *
 * <p>For example, the detail version of the array based methods will
 * output the whole array, whereas the summary method will just output
 * the array length.</p>
 *
 * <p>If you want to format the output of certain objects, such as dates, you
 * must create a subclass and override a method.
 * <pre>
 * public class MyStyle extends ToStringStyle {
 *   protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {
 *     if (value instanceof Date) {
 *       value = new SimpleDateFormat("yyyy-MM-dd").format(value);
 *     }
 *     buffer.append(value);
 *   }
 * }
 * </pre>
 * </p>
 *
 * @since 1.0
 * @version $Id$
 */
public abstract class ToStringStyle implements Serializable {public static class __CLR4_1_27pd7pdl3lqxsbc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,10692,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version ID.
     */
    private static final long serialVersionUID = -2587890625525655916L;

    /**
     * The default toString style. Using the Using the <code>Person</code>
     * example from {@link ToStringBuilder}, the output would look like this:
     *
     * <pre>
     * Person@182f0db[name=John Doe,age=33,smoker=false]
     * </pre>
     */
    public static final ToStringStyle DEFAULT_STYLE = new DefaultToStringStyle();

    /**
     * The multi line toString style. Using the Using the <code>Person</code>
     * example from {@link ToStringBuilder}, the output would look like this:
     *
     * <pre>
     * Person@182f0db[
     *   name=John Doe
     *   age=33
     *   smoker=false
     * ]
     * </pre>
     */
    public static final ToStringStyle MULTI_LINE_STYLE = new MultiLineToStringStyle();

    /**
     * The no field names toString style. Using the Using the
     * <code>Person</code> example from {@link ToStringBuilder}, the output
     * would look like this:
     *
     * <pre>
     * Person@182f0db[John Doe,33,false]
     * </pre>
     */
    public static final ToStringStyle NO_FIELD_NAMES_STYLE = new NoFieldNameToStringStyle();

    /**
     * The short prefix toString style. Using the <code>Person</code> example
     * from {@link ToStringBuilder}, the output would look like this:
     *
     * <pre>
     * Person[name=John Doe,age=33,smoker=false]
     * </pre>
     *
     * @since 2.1
     */
    public static final ToStringStyle SHORT_PREFIX_STYLE = new ShortPrefixToStringStyle();

    /**
     * The simple toString style. Using the Using the <code>Person</code>
     * example from {@link ToStringBuilder}, the output would look like this:
     *
     * <pre>
     * John Doe,33,false
     * </pre>
     */
    public static final ToStringStyle SIMPLE_STYLE = new SimpleToStringStyle();

    /**
     * <p>
     * A registry of objects used by <code>reflectionToString</code> methods
     * to detect cyclical object references and avoid infinite loops.
     * </p>
     */
    private static final ThreadLocal<WeakHashMap<Object, Object>> REGISTRY =
        new ThreadLocal<WeakHashMap<Object,Object>>();
    /*
     * Note that objects of this class are generally shared between threads, so
     * an instance variable would not be suitable here.
     * 
     * In normal use the registry should always be left empty, because the caller
     * should call toString() which will clean up.
     * 
     * See LANG-792
     */

    /**
     * <p>
     * Returns the registry of objects being traversed by the <code>reflectionToString</code>
     * methods in the current thread.
     * </p>
     *
     * @return Set the registry of objects being traversed
     */
    static Map<Object, Object> getRegistry() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(9985);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(9986);return REGISTRY.get();
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>
     * Returns <code>true</code> if the registry contains the given object.
     * Used by the reflection methods to avoid infinite loops.
     * </p>
     *
     * @param value
     *                  The object to lookup in the registry.
     * @return boolean <code>true</code> if the registry contains the given
     *             object.
     */
    static boolean isRegistered(final Object value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(9987);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(9988);final Map<Object, Object> m = getRegistry();
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(9989);return m != null && m.containsKey(value);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>
     * Registers the given object. Used by the reflection methods to avoid
     * infinite loops.
     * </p>
     *
     * @param value
     *                  The object to register.
     */
    static void register(final Object value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(9990);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(9991);if ((((value != null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(9992)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(9993)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(9994);final Map<Object, Object> m = getRegistry();
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(9995);if ((((m == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(9996)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(9997)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(9998);REGISTRY.set(new WeakHashMap<Object, Object>());
            }
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(9999);getRegistry().put(value, null);
        }
    }}finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>
     * Unregisters the given object.
     * </p>
     *
     * <p>
     * Used by the reflection methods to avoid infinite loops.
     * </p>
     *
     * @param value
     *                  The object to unregister.
     */
    static void unregister(final Object value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10000);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10001);if ((((value != null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10002)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10003)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10004);final Map<Object, Object> m = getRegistry();
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10005);if ((((m != null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10006)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10007)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10008);m.remove(value);
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10009);if ((((m.isEmpty())&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10010)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10011)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10012);REGISTRY.remove();
                }
            }}
        }}
    }}finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * Whether to use the field names, the default is <code>true</code>.
     */
    private boolean useFieldNames = true;

    /**
     * Whether to use the class name, the default is <code>true</code>.
     */
    private boolean useClassName = true;

    /**
     * Whether to use short class names, the default is <code>false</code>.
     */
    private boolean useShortClassName = false;

    /**
     * Whether to use the identity hash code, the default is <code>true</code>.
     */
    private boolean useIdentityHashCode = true;

    /**
     * The content start <code>'['</code>.
     */
    private String contentStart = "[";

    /**
     * The content end <code>']'</code>.
     */
    private String contentEnd = "]";

    /**
     * The field name value separator <code>'='</code>.
     */
    private String fieldNameValueSeparator = "=";

    /**
     * Whether the field separator should be added before any other fields.
     */
    private boolean fieldSeparatorAtStart = false;

    /**
     * Whether the field separator should be added after any other fields.
     */
    private boolean fieldSeparatorAtEnd = false;

    /**
     * The field separator <code>','</code>.
     */
    private String fieldSeparator = ",";

    /**
     * The array start <code>'{'</code>.
     */
    private String arrayStart = "{";

    /**
     * The array separator <code>','</code>.
     */
    private String arraySeparator = ",";

    /**
     * The detail for array content.
     */
    private boolean arrayContentDetail = true;

    /**
     * The array end <code>'}'</code>.
     */
    private String arrayEnd = "}";

    /**
     * The value to use when fullDetail is <code>null</code>,
     * the default value is <code>true</code>.
     */
    private boolean defaultFullDetail = true;

    /**
     * The <code>null</code> text <code>'&lt;null&gt;'</code>.
     */
    private String nullText = "<null>";

    /**
     * The summary size text start <code>'<size'</code>.
     */
    private String sizeStartText = "<size=";

    /**
     * The summary size text start <code>'&gt;'</code>.
     */
    private String sizeEndText = ">";

    /**
     * The summary object text start <code>'&lt;'</code>.
     */
    private String summaryObjectStartText = "<";

    /**
     * The summary object text start <code>'&gt;'</code>.
     */
    private String summaryObjectEndText = ">";

    //----------------------------------------------------------------------------

    /**
     * <p>Constructor.</p>
     */
    protected ToStringStyle() {
        super();__CLR4_1_27pd7pdl3lqxsbc.R.inc(10014);try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10013);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> the superclass toString.</p>
     * <p>NOTE: It assumes that the toString has been created from the same ToStringStyle. </p>
     *
     * <p>A <code>null</code> <code>superToString</code> is ignored.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param superToString  the <code>super.toString()</code>
     * @since 2.0
     */
    public void appendSuper(final StringBuffer buffer, final String superToString) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10015);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10016);appendToString(buffer, superToString);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> another toString.</p>
     * <p>NOTE: It assumes that the toString has been created from the same ToStringStyle. </p>
     *
     * <p>A <code>null</code> <code>toString</code> is ignored.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param toString  the additional <code>toString</code>
     * @since 2.0
     */
    public void appendToString(final StringBuffer buffer, final String toString) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10017);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10018);if ((((toString != null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10019)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10020)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10021);final int pos1 = toString.indexOf(contentStart) + contentStart.length();
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10022);final int pos2 = toString.lastIndexOf(contentEnd);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10023);if ((((pos1 != pos2 && pos1 >= 0 && pos2 >= 0)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10024)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10025)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10026);final String data = toString.substring(pos1, pos2);
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10027);if ((((fieldSeparatorAtStart)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10028)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10029)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10030);removeLastFieldSeparator(buffer);
                }
                }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10031);buffer.append(data);
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10032);appendFieldSeparator(buffer);
            }
        }}
    }}finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the start of data indicator.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param object  the <code>Object</code> to build a <code>toString</code> for
     */
    public void appendStart(final StringBuffer buffer, final Object object) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10033);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10034);if ((((object != null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10035)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10036)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10037);appendClassName(buffer, object);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10038);appendIdentityHashCode(buffer, object);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10039);appendContentStart(buffer);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10040);if ((((fieldSeparatorAtStart)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10041)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10042)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10043);appendFieldSeparator(buffer);
            }
        }}
    }}finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the end of data indicator.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param object  the <code>Object</code> to build a
     *  <code>toString</code> for.
     */
    public void appendEnd(final StringBuffer buffer, final Object object) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10044);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10045);if ((((this.fieldSeparatorAtEnd == false)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10046)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10047)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10048);removeLastFieldSeparator(buffer);
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10049);appendContentEnd(buffer);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10050);unregister(object);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Remove the last field separator from the buffer.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @since 2.0
     */
    protected void removeLastFieldSeparator(final StringBuffer buffer) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10051);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10052);final int len = buffer.length();
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10053);final int sepLen = fieldSeparator.length();
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10054);if ((((len > 0 && sepLen > 0 && len >= sepLen)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10055)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10056)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10057);boolean match = true;
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10058);for (int i = 0; (((i < sepLen)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10059)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10060)==0&false)); i++) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10061);if ((((buffer.charAt(len - 1 - i) != fieldSeparator.charAt(sepLen - 1 - i))&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10062)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10063)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10064);match = false;
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10065);break;
                }
            }}
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10066);if ((((match)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10067)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10068)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10069);buffer.setLength(len - sepLen);
            }
        }}
    }}finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value, printing the full <code>toString</code> of the
     * <code>Object</code> passed in.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final Object value, final Boolean fullDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10070);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10071);appendFieldStart(buffer, fieldName);

        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10072);if ((((value == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10073)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10074)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10075);appendNullText(buffer, fieldName);

        } }else {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10076);appendInternal(buffer, fieldName, value, isFullDetail(fullDetail));
        }

        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10077);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>,
     * correctly interpreting its type.</p>
     *
     * <p>This method performs the main lookup by Class type to correctly
     * route arrays, <code>Collections</code>, <code>Maps</code> and
     * <code>Objects</code> to the appropriate method.</p>
     *
     * <p>Either detail or summary views can be specified.</p>
     *
     * <p>If a cycle is detected, an object will be appended with the
     * <code>Object.toString()</code> format.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>,
     *  not <code>null</code>
     * @param detail  output detail or not
     */
    protected void appendInternal(final StringBuffer buffer, final String fieldName, final Object value, final boolean detail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10078);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10079);if ((((isRegistered(value)
            && !(value instanceof Number || value instanceof Boolean || value instanceof Character))&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10080)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10081)==0&false))) {{
           __CLR4_1_27pd7pdl3lqxsbc.R.inc(10082);appendCyclicObject(buffer, fieldName, value);
           __CLR4_1_27pd7pdl3lqxsbc.R.inc(10083);return;
        }

        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10084);register(value);

        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10085);try {
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10086);if ((((value instanceof Collection<?>)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10087)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10088)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10089);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10090)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10091)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10092);appendDetail(buffer, fieldName, (Collection<?>) value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10093);appendSummarySize(buffer, fieldName, ((Collection<?>) value).size());
                }

            }} }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10094);if ((((value instanceof Map<?, ?>)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10095)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10096)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10097);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10098)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10099)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10100);appendDetail(buffer, fieldName, (Map<?, ?>) value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10101);appendSummarySize(buffer, fieldName, ((Map<?, ?>) value).size());
                }

            }} }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10102);if ((((value instanceof long[])&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10103)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10104)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10105);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10106)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10107)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10108);appendDetail(buffer, fieldName, (long[]) value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10109);appendSummary(buffer, fieldName, (long[]) value);
                }

            }} }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10110);if ((((value instanceof int[])&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10111)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10112)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10113);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10114)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10115)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10116);appendDetail(buffer, fieldName, (int[]) value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10117);appendSummary(buffer, fieldName, (int[]) value);
                }

            }} }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10118);if ((((value instanceof short[])&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10119)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10120)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10121);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10122)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10123)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10124);appendDetail(buffer, fieldName, (short[]) value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10125);appendSummary(buffer, fieldName, (short[]) value);
                }

            }} }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10126);if ((((value instanceof byte[])&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10127)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10128)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10129);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10130)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10131)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10132);appendDetail(buffer, fieldName, (byte[]) value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10133);appendSummary(buffer, fieldName, (byte[]) value);
                }

            }} }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10134);if ((((value instanceof char[])&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10135)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10136)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10137);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10138)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10139)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10140);appendDetail(buffer, fieldName, (char[]) value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10141);appendSummary(buffer, fieldName, (char[]) value);
                }

            }} }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10142);if ((((value instanceof double[])&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10143)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10144)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10145);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10146)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10147)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10148);appendDetail(buffer, fieldName, (double[]) value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10149);appendSummary(buffer, fieldName, (double[]) value);
                }

            }} }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10150);if ((((value instanceof float[])&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10151)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10152)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10153);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10154)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10155)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10156);appendDetail(buffer, fieldName, (float[]) value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10157);appendSummary(buffer, fieldName, (float[]) value);
                }

            }} }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10158);if ((((value instanceof boolean[])&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10159)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10160)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10161);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10162)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10163)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10164);appendDetail(buffer, fieldName, (boolean[]) value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10165);appendSummary(buffer, fieldName, (boolean[]) value);
                }

            }} }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10166);if ((((value.getClass().isArray())&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10167)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10168)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10169);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10170)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10171)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10172);appendDetail(buffer, fieldName, (Object[]) value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10173);appendSummary(buffer, fieldName, (Object[]) value);
                }

            }} }else {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10174);if ((((detail)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10175)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10176)==0&false))) {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10177);appendDetail(buffer, fieldName, value);
                } }else {{
                    __CLR4_1_27pd7pdl3lqxsbc.R.inc(10178);appendSummary(buffer, fieldName, value);
                }
            }}
        }}}}}}}}}}}} finally {
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10179);unregister(value);
        }
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value that has been detected to participate in a cycle. This
     * implementation will print the standard string value of the value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>,
     *  not <code>null</code>
     *
     * @since 2.2
     */
    protected void appendCyclicObject(final StringBuffer buffer, final String fieldName, final Object value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10180);
       __CLR4_1_27pd7pdl3lqxsbc.R.inc(10181);ObjectUtils.identityToString(buffer, value);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value, printing the full detail of the <code>Object</code>.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final Object value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10182);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10183);buffer.append(value);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>Collection</code>.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param coll  the <code>Collection</code> to add to the
     *  <code>toString</code>, not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final Collection<?> coll) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10184);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10185);buffer.append(coll);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>Map<code>.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param map  the <code>Map</code> to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final Map<?, ?> map) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10186);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10187);buffer.append(map);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value, printing a summary of the <code>Object</code>.</P>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final Object value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10188);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10189);buffer.append(summaryObjectStartText);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10190);buffer.append(getShortClassName(value.getClass()));
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10191);buffer.append(summaryObjectEndText);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final long value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10192);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10193);appendFieldStart(buffer, fieldName);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10194);appendDetail(buffer, fieldName, value);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10195);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final long value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10196);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10197);buffer.append(value);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final int value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10198);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10199);appendFieldStart(buffer, fieldName);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10200);appendDetail(buffer, fieldName, value);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10201);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final int value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10202);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10203);buffer.append(value);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final short value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10204);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10205);appendFieldStart(buffer, fieldName);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10206);appendDetail(buffer, fieldName, value);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10207);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final short value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10208);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10209);buffer.append(value);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final byte value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10210);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10211);appendFieldStart(buffer, fieldName);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10212);appendDetail(buffer, fieldName, value);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10213);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final byte value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10214);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10215);buffer.append(value);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final char value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10216);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10217);appendFieldStart(buffer, fieldName);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10218);appendDetail(buffer, fieldName, value);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10219);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final char value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10220);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10221);buffer.append(value);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final double value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10222);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10223);appendFieldStart(buffer, fieldName);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10224);appendDetail(buffer, fieldName, value);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10225);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final double value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10226);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10227);buffer.append(value);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final float value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10228);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10229);appendFieldStart(buffer, fieldName);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10230);appendDetail(buffer, fieldName, value);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10231);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final float value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10232);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10233);buffer.append(value);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final boolean value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10234);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10235);appendFieldStart(buffer, fieldName);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10236);appendDetail(buffer, fieldName, value);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10237);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final boolean value) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10238);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10239);buffer.append(value);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the toString
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final Object[] array, final Boolean fullDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10240);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10241);appendFieldStart(buffer, fieldName);

        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10242);if ((((array == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10243)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10244)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10245);appendNullText(buffer, fieldName);

        } }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10246);if ((((isFullDetail(fullDetail))&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10247)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10248)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10249);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10250);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_1_27pd7pdl3lqxsbc.R.inc(10251);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> the detail of an
     * <code>Object</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final Object[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10252);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10253);buffer.append(arrayStart);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10254);for (int i = 0; (((i < array.length)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10255)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10256)==0&false)); i++) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10257);final Object item = array[i];
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10258);if ((((i > 0)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10259)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10260)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10261);buffer.append(arraySeparator);
            }
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10262);if ((((item == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10263)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10264)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10265);appendNullText(buffer, fieldName);

            } }else {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10266);appendInternal(buffer, fieldName, item, arrayContentDetail);
            }
        }}
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10267);buffer.append(arrayEnd);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of an array type.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     * @since 2.0
     */
    protected void reflectionAppendArrayDetail(final StringBuffer buffer, final String fieldName, final Object array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10268);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10269);buffer.append(arrayStart);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10270);final int length = Array.getLength(array);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10271);for (int i = 0; (((i < length)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10272)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10273)==0&false)); i++) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10274);final Object item = Array.get(array, i);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10275);if ((((i > 0)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10276)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10277)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10278);buffer.append(arraySeparator);
            }
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10279);if ((((item == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10280)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10281)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10282);appendNullText(buffer, fieldName);

            } }else {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10283);appendInternal(buffer, fieldName, item, arrayContentDetail);
            }
        }}
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10284);buffer.append(arrayEnd);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of an
     * <code>Object</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final Object[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10285);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10286);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final long[] array, final Boolean fullDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10287);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10288);appendFieldStart(buffer, fieldName);

        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10289);if ((((array == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10290)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10291)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10292);appendNullText(buffer, fieldName);

        } }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10293);if ((((isFullDetail(fullDetail))&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10294)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10295)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10296);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10297);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_1_27pd7pdl3lqxsbc.R.inc(10298);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>long</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final long[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10299);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10300);buffer.append(arrayStart);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10301);for (int i = 0; (((i < array.length)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10302)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10303)==0&false)); i++) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10304);if ((((i > 0)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10305)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10306)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10307);buffer.append(arraySeparator);
            }
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10308);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10309);buffer.append(arrayEnd);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>long</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final long[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10310);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10311);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final int[] array, final Boolean fullDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10312);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10313);appendFieldStart(buffer, fieldName);

        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10314);if ((((array == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10315)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10316)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10317);appendNullText(buffer, fieldName);

        } }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10318);if ((((isFullDetail(fullDetail))&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10319)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10320)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10321);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10322);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_1_27pd7pdl3lqxsbc.R.inc(10323);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of an
     * <code>int</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final int[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10324);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10325);buffer.append(arrayStart);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10326);for (int i = 0; (((i < array.length)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10327)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10328)==0&false)); i++) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10329);if ((((i > 0)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10330)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10331)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10332);buffer.append(arraySeparator);
            }
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10333);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10334);buffer.append(arrayEnd);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of an
     * <code>int</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final int[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10335);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10336);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final short[] array, final Boolean fullDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10337);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10338);appendFieldStart(buffer, fieldName);

        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10339);if ((((array == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10340)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10341)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10342);appendNullText(buffer, fieldName);

        } }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10343);if ((((isFullDetail(fullDetail))&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10344)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10345)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10346);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10347);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_1_27pd7pdl3lqxsbc.R.inc(10348);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>short</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final short[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10349);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10350);buffer.append(arrayStart);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10351);for (int i = 0; (((i < array.length)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10352)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10353)==0&false)); i++) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10354);if ((((i > 0)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10355)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10356)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10357);buffer.append(arraySeparator);
            }
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10358);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10359);buffer.append(arrayEnd);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>short</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final short[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10360);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10361);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final byte[] array, final Boolean fullDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10362);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10363);appendFieldStart(buffer, fieldName);

        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10364);if ((((array == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10365)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10366)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10367);appendNullText(buffer, fieldName);

        } }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10368);if ((((isFullDetail(fullDetail))&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10369)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10370)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10371);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10372);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_1_27pd7pdl3lqxsbc.R.inc(10373);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>byte</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final byte[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10374);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10375);buffer.append(arrayStart);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10376);for (int i = 0; (((i < array.length)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10377)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10378)==0&false)); i++) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10379);if ((((i > 0)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10380)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10381)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10382);buffer.append(arraySeparator);
            }
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10383);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10384);buffer.append(arrayEnd);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>byte</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final byte[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10385);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10386);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final char[] array, final Boolean fullDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10387);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10388);appendFieldStart(buffer, fieldName);

        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10389);if ((((array == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10390)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10391)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10392);appendNullText(buffer, fieldName);

        } }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10393);if ((((isFullDetail(fullDetail))&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10394)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10395)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10396);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10397);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_1_27pd7pdl3lqxsbc.R.inc(10398);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>char</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final char[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10399);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10400);buffer.append(arrayStart);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10401);for (int i = 0; (((i < array.length)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10402)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10403)==0&false)); i++) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10404);if ((((i > 0)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10405)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10406)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10407);buffer.append(arraySeparator);
            }
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10408);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10409);buffer.append(arrayEnd);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>char</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final char[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10410);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10411);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the toString
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final double[] array, final Boolean fullDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10412);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10413);appendFieldStart(buffer, fieldName);

        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10414);if ((((array == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10415)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10416)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10417);appendNullText(buffer, fieldName);

        } }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10418);if ((((isFullDetail(fullDetail))&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10419)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10420)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10421);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10422);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_1_27pd7pdl3lqxsbc.R.inc(10423);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>double</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final double[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10424);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10425);buffer.append(arrayStart);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10426);for (int i = 0; (((i < array.length)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10427)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10428)==0&false)); i++) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10429);if ((((i > 0)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10430)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10431)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10432);buffer.append(arraySeparator);
            }
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10433);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10434);buffer.append(arrayEnd);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>double</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final double[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10435);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10436);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the toString
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final float[] array, final Boolean fullDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10437);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10438);appendFieldStart(buffer, fieldName);

        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10439);if ((((array == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10440)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10441)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10442);appendNullText(buffer, fieldName);

        } }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10443);if ((((isFullDetail(fullDetail))&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10444)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10445)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10446);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10447);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_1_27pd7pdl3lqxsbc.R.inc(10448);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>float</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final float[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10449);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10450);buffer.append(arrayStart);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10451);for (int i = 0; (((i < array.length)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10452)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10453)==0&false)); i++) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10454);if ((((i > 0)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10455)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10456)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10457);buffer.append(arraySeparator);
            }
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10458);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10459);buffer.append(arrayEnd);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>float</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final float[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10460);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10461);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the toString
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final boolean[] array, final Boolean fullDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10462);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10463);appendFieldStart(buffer, fieldName);

        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10464);if ((((array == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10465)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10466)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10467);appendNullText(buffer, fieldName);

        } }else {__CLR4_1_27pd7pdl3lqxsbc.R.inc(10468);if ((((isFullDetail(fullDetail))&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10469)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10470)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10471);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10472);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_1_27pd7pdl3lqxsbc.R.inc(10473);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>boolean</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final boolean[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10474);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10475);buffer.append(arrayStart);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10476);for (int i = 0; (((i < array.length)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10477)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10478)==0&false)); i++) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10479);if ((((i > 0)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10480)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10481)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10482);buffer.append(arraySeparator);
            }
            }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10483);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10484);buffer.append(arrayEnd);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>boolean</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final boolean[] array) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10485);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10486);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> the class name.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param object  the <code>Object</code> whose name to output
     */
    protected void appendClassName(final StringBuffer buffer, final Object object) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10487);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10488);if ((((useClassName && object != null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10489)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10490)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10491);register(object);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10492);if ((((useShortClassName)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10493)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10494)==0&false))) {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10495);buffer.append(getShortClassName(object.getClass()));
            } }else {{
                __CLR4_1_27pd7pdl3lqxsbc.R.inc(10496);buffer.append(object.getClass().getName());
            }
        }}
    }}finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append the {@link System#identityHashCode(java.lang.Object)}.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param object  the <code>Object</code> whose id to output
     */
    protected void appendIdentityHashCode(final StringBuffer buffer, final Object object) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10497);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10498);if ((((this.isUseIdentityHashCode() && object!=null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10499)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10500)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10501);register(object);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10502);buffer.append('@');
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10503);buffer.append(Integer.toHexString(System.identityHashCode(object)));
        }
    }}finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the content start.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     */
    protected void appendContentStart(final StringBuffer buffer) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10504);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10505);buffer.append(contentStart);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the content end.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     */
    protected void appendContentEnd(final StringBuffer buffer) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10506);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10507);buffer.append(contentEnd);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an indicator for <code>null</code>.</p>
     *
     * <p>The default indicator is <code>'&lt;null&gt;'</code>.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     */
    protected void appendNullText(final StringBuffer buffer, final String fieldName) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10508);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10509);buffer.append(nullText);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the field separator.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     */
    protected void appendFieldSeparator(final StringBuffer buffer) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10510);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10511);buffer.append(fieldSeparator);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the field start.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     */
    protected void appendFieldStart(final StringBuffer buffer, final String fieldName) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10512);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10513);if ((((useFieldNames && fieldName != null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10514)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10515)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10516);buffer.append(fieldName);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10517);buffer.append(fieldNameValueSeparator);
        }
    }}finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString<code> the field end.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     */
    protected void appendFieldEnd(final StringBuffer buffer, final String fieldName) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10518);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10519);appendFieldSeparator(buffer);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a size summary.</p>
     *
     * <p>The size summary is used to summarize the contents of
     * <code>Collections</code>, <code>Maps</code> and arrays.</p>
     *
     * <p>The output consists of a prefix, the passed in size
     * and a suffix.</p>
     *
     * <p>The default format is <code>'&lt;size=n&gt;'<code>.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param size  the size to append
     */
    protected void appendSummarySize(final StringBuffer buffer, final String fieldName, final int size) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10520);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10521);buffer.append(sizeStartText);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10522);buffer.append(size);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10523);buffer.append(sizeEndText);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Is this field to be output in full detail.</p>
     *
     * <p>This method converts a detail request into a detail level.
     * The calling code may request full detail (<code>true</code>),
     * but a subclass might ignore that and always return
     * <code>false</code>. The calling code may pass in
     * <code>null</code> indicating that it doesn't care about
     * the detail level. In this case the default detail level is
     * used.</p>
     *
     * @param fullDetailRequest  the detail level requested
     * @return whether full detail is to be shown
     */
    protected boolean isFullDetail(final Boolean fullDetailRequest) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10524);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10525);if ((((fullDetailRequest == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10526)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10527)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10528);return defaultFullDetail;
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10529);return fullDetailRequest.booleanValue();
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Gets the short class name for a class.</p>
     *
     * <p>The short class name is the classname excluding
     * the package name.</p>
     *
     * @param cls  the <code>Class</code> to get the short name of
     * @return the short name
     */
    protected String getShortClassName(final Class<?> cls) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10530);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10531);return ClassUtils.getShortClassName(cls);
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    // Setters and getters for the customizable parts of the style
    // These methods are not expected to be overridden, except to make public
    // (They are not public so that immutable subclasses can be written)
    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to use the class name.</p>
     *
     * @return the current useClassName flag
     */
    protected boolean isUseClassName() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10532);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10533);return useClassName;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets whether to use the class name.</p>
     *
     * @param useClassName  the new useClassName flag
     */
    protected void setUseClassName(final boolean useClassName) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10534);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10535);this.useClassName = useClassName;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to output short or long class names.</p>
     *
     * @return the current useShortClassName flag
     * @since 2.0
     */
    protected boolean isUseShortClassName() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10536);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10537);return useShortClassName;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets whether to output short or long class names.</p>
     *
     * @param useShortClassName  the new useShortClassName flag
     * @since 2.0
     */
    protected void setUseShortClassName(final boolean useShortClassName) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10538);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10539);this.useShortClassName = useShortClassName;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to use the identity hash code.</p>
     *
     * @return the current useIdentityHashCode flag
     */
    protected boolean isUseIdentityHashCode() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10540);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10541);return useIdentityHashCode;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets whether to use the identity hash code.</p>
     *
     * @param useIdentityHashCode  the new useIdentityHashCode flag
     */
    protected void setUseIdentityHashCode(final boolean useIdentityHashCode) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10542);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10543);this.useIdentityHashCode = useIdentityHashCode;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to use the field names passed in.</p>
     *
     * @return the current useFieldNames flag
     */
    protected boolean isUseFieldNames() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10544);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10545);return useFieldNames;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets whether to use the field names passed in.</p>
     *
     * @param useFieldNames  the new useFieldNames flag
     */
    protected void setUseFieldNames(final boolean useFieldNames) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10546);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10547);this.useFieldNames = useFieldNames;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to use full detail when the caller doesn't
     * specify.</p>
     *
     * @return the current defaultFullDetail flag
     */
    protected boolean isDefaultFullDetail() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10548);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10549);return defaultFullDetail;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets whether to use full detail when the caller doesn't
     * specify.</p>
     *
     * @param defaultFullDetail  the new defaultFullDetail flag
     */
    protected void setDefaultFullDetail(final boolean defaultFullDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10550);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10551);this.defaultFullDetail = defaultFullDetail;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to output array content detail.</p>
     *
     * @return the current array content detail setting
     */
    protected boolean isArrayContentDetail() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10552);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10553);return arrayContentDetail;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets whether to output array content detail.</p>
     *
     * @param arrayContentDetail  the new arrayContentDetail flag
     */
    protected void setArrayContentDetail(final boolean arrayContentDetail) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10554);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10555);this.arrayContentDetail = arrayContentDetail;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the array start text.</p>
     *
     * @return the current array start text
     */
    protected String getArrayStart() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10556);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10557);return arrayStart;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the array start text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param arrayStart  the new array start text
     */
    protected void setArrayStart(String arrayStart) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10558);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10559);if ((((arrayStart == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10560)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10561)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10562);arrayStart = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10563);this.arrayStart = arrayStart;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the array end text.</p>
     *
     * @return the current array end text
     */
    protected String getArrayEnd() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10564);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10565);return arrayEnd;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the array end text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param arrayEnd  the new array end text
     */
    protected void setArrayEnd(String arrayEnd) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10566);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10567);if ((((arrayEnd == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10568)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10569)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10570);arrayEnd = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10571);this.arrayEnd = arrayEnd;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the array separator text.</p>
     *
     * @return the current array separator text
     */
    protected String getArraySeparator() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10572);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10573);return arraySeparator;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the array separator text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param arraySeparator  the new array separator text
     */
    protected void setArraySeparator(String arraySeparator) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10574);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10575);if ((((arraySeparator == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10576)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10577)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10578);arraySeparator = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10579);this.arraySeparator = arraySeparator;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the content start text.</p>
     *
     * @return the current content start text
     */
    protected String getContentStart() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10580);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10581);return contentStart;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the content start text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param contentStart  the new content start text
     */
    protected void setContentStart(String contentStart) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10582);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10583);if ((((contentStart == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10584)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10585)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10586);contentStart = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10587);this.contentStart = contentStart;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the content end text.</p>
     *
     * @return the current content end text
     */
    protected String getContentEnd() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10588);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10589);return contentEnd;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the content end text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param contentEnd  the new content end text
     */
    protected void setContentEnd(String contentEnd) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10590);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10591);if ((((contentEnd == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10592)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10593)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10594);contentEnd = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10595);this.contentEnd = contentEnd;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the field name value separator text.</p>
     *
     * @return the current field name value separator text
     */
    protected String getFieldNameValueSeparator() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10596);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10597);return fieldNameValueSeparator;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the field name value separator text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param fieldNameValueSeparator  the new field name value separator text
     */
    protected void setFieldNameValueSeparator(String fieldNameValueSeparator) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10598);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10599);if ((((fieldNameValueSeparator == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10600)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10601)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10602);fieldNameValueSeparator = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10603);this.fieldNameValueSeparator = fieldNameValueSeparator;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the field separator text.</p>
     *
     * @return the current field separator text
     */
    protected String getFieldSeparator() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10604);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10605);return fieldSeparator;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the field separator text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param fieldSeparator  the new field separator text
     */
    protected void setFieldSeparator(String fieldSeparator) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10606);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10607);if ((((fieldSeparator == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10608)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10609)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10610);fieldSeparator = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10611);this.fieldSeparator = fieldSeparator;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether the field separator should be added at the start
     * of each buffer.</p>
     *
     * @return the fieldSeparatorAtStart flag
     * @since 2.0
     */
    protected boolean isFieldSeparatorAtStart() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10612);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10613);return fieldSeparatorAtStart;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets whether the field separator should be added at the start
     * of each buffer.</p>
     *
     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag
     * @since 2.0
     */
    protected void setFieldSeparatorAtStart(final boolean fieldSeparatorAtStart) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10614);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10615);this.fieldSeparatorAtStart = fieldSeparatorAtStart;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether the field separator should be added at the end
     * of each buffer.</p>
     *
     * @return fieldSeparatorAtEnd flag
     * @since 2.0
     */
    protected boolean isFieldSeparatorAtEnd() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10616);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10617);return fieldSeparatorAtEnd;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets whether the field separator should be added at the end
     * of each buffer.</p>
     *
     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag
     * @since 2.0
     */
    protected void setFieldSeparatorAtEnd(final boolean fieldSeparatorAtEnd) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10618);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10619);this.fieldSeparatorAtEnd = fieldSeparatorAtEnd;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the text to output when <code>null</code> found.</p>
     *
     * @return the current text to output when null found
     */
    protected String getNullText() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10620);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10621);return nullText;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the text to output when <code>null</code> found.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param nullText  the new text to output when null found
     */
    protected void setNullText(String nullText) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10622);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10623);if ((((nullText == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10624)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10625)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10626);nullText = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10627);this.nullText = nullText;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the start text to output when a <code>Collection</code>,
     * <code>Map</code> or array size is output.</p>
     *
     * <p>This is output before the size value.</p>
     *
     * @return the current start of size text
     */
    protected String getSizeStartText() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10628);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10629);return sizeStartText;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the start text to output when a <code>Collection</code>,
     * <code>Map</code> or array size is output.</p>
     *
     * <p>This is output before the size value.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param sizeStartText  the new start of size text
     */
    protected void setSizeStartText(String sizeStartText) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10630);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10631);if ((((sizeStartText == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10632)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10633)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10634);sizeStartText = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10635);this.sizeStartText = sizeStartText;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the end text to output when a <code>Collection</code>,
     * <code>Map</code> or array size is output.</p>
     *
     * <p>This is output after the size value.</p>
     *
     * @return the current end of size text
     */
    protected String getSizeEndText() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10636);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10637);return sizeEndText;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the end text to output when a <code>Collection</code>,
     * <code>Map</code> or array size is output.</p>
     *
     * <p>This is output after the size value.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param sizeEndText  the new end of size text
     */
    protected void setSizeEndText(String sizeEndText) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10638);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10639);if ((((sizeEndText == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10640)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10641)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10642);sizeEndText = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10643);this.sizeEndText = sizeEndText;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the start text to output when an <code>Object</code> is
     * output in summary mode.</p>
     *
     * <p>This is output before the size value.</p>
     *
     * @return the current start of summary text
     */
    protected String getSummaryObjectStartText() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10644);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10645);return summaryObjectStartText;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the start text to output when an <code>Object</code> is
     * output in summary mode.</p>
     *
     * <p>This is output before the size value.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param summaryObjectStartText  the new start of summary text
     */
    protected void setSummaryObjectStartText(String summaryObjectStartText) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10646);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10647);if ((((summaryObjectStartText == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10648)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10649)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10650);summaryObjectStartText = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10651);this.summaryObjectStartText = summaryObjectStartText;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the end text to output when an <code>Object</code> is
     * output in summary mode.</p>
     *
     * <p>This is output after the size value.</p>
     *
     * @return the current end of summary text
     */
    protected String getSummaryObjectEndText() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10652);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10653);return summaryObjectEndText;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    /**
     * <p>Sets the end text to output when an <code>Object</code> is
     * output in summary mode.</p>
     *
     * <p>This is output after the size value.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param summaryObjectEndText  the new end of summary text
     */
    protected void setSummaryObjectEndText(String summaryObjectEndText) {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10654);
        __CLR4_1_27pd7pdl3lqxsbc.R.inc(10655);if ((((summaryObjectEndText == null)&&(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10656)!=0|true))||(__CLR4_1_27pd7pdl3lqxsbc.R.iget(10657)==0&false))) {{
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10658);summaryObjectEndText = "";
        }
        }__CLR4_1_27pd7pdl3lqxsbc.R.inc(10659);this.summaryObjectEndText = summaryObjectEndText;
    }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Default <code>ToStringStyle</code>.</p>
     *
     * <p>This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.</p>
     */
    private static final class DefaultToStringStyle extends ToStringStyle {

        /**
         * Required for serialization support.
         *
         * @see java.io.Serializable
         */
        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        DefaultToStringStyle() {
            super();__CLR4_1_27pd7pdl3lqxsbc.R.inc(10661);try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10660);
        }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

        /**
         * <p>Ensure <code>Singleton</code> after serialization.</p>
         *
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10662);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10663);return ToStringStyle.DEFAULT_STYLE;
        }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    }

    //----------------------------------------------------------------------------

    /**
     * <p><code>ToStringStyle</code> that does not print out
     * the field names.</p>
     *
     * <p>This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.
     */
    private static final class NoFieldNameToStringStyle extends ToStringStyle {

        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        NoFieldNameToStringStyle() {
            super();__CLR4_1_27pd7pdl3lqxsbc.R.inc(10665);try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10664);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10666);this.setUseFieldNames(false);
        }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

        /**
         * <p>Ensure <code>Singleton</code> after serialization.</p>
         *
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10667);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10668);return ToStringStyle.NO_FIELD_NAMES_STYLE;
        }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    }

    //----------------------------------------------------------------------------

    /**
     * <p><code>ToStringStyle</code> that prints out the short
     * class name and no identity hashcode.</p>
     *
     * <p>This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.</p>
     */
    private static final class ShortPrefixToStringStyle extends ToStringStyle {

        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        ShortPrefixToStringStyle() {
            super();__CLR4_1_27pd7pdl3lqxsbc.R.inc(10670);try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10669);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10671);this.setUseShortClassName(true);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10672);this.setUseIdentityHashCode(false);
        }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

        /**
         * <p>Ensure <code>Singleton</ode> after serialization.</p>
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10673);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10674);return ToStringStyle.SHORT_PREFIX_STYLE;
        }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    }

    /**
     * <p><code>ToStringStyle</code> that does not print out the
     * classname, identity hashcode, content start or field name.</p>
     *
     * <p>This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.</p>
     */
    private static final class SimpleToStringStyle extends ToStringStyle {

        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        SimpleToStringStyle() {
            super();__CLR4_1_27pd7pdl3lqxsbc.R.inc(10676);try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10675);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10677);this.setUseClassName(false);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10678);this.setUseIdentityHashCode(false);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10679);this.setUseFieldNames(false);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10680);this.setContentStart("");
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10681);this.setContentEnd("");
        }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

        /**
         * <p>Ensure <code>Singleton</ode> after serialization.</p>
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10682);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10683);return ToStringStyle.SIMPLE_STYLE;
        }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    }

    //----------------------------------------------------------------------------

    /**
     * <p><code>ToStringStyle</code> that outputs on multiple lines.</p>
     *
     * <p>This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.</p>
     */
    private static final class MultiLineToStringStyle extends ToStringStyle {

        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        MultiLineToStringStyle() {
            super();__CLR4_1_27pd7pdl3lqxsbc.R.inc(10685);try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10684);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10686);this.setContentStart("[");
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10687);this.setFieldSeparator(SystemUtils.LINE_SEPARATOR + "  ");
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10688);this.setFieldSeparatorAtStart(true);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10689);this.setContentEnd(SystemUtils.LINE_SEPARATOR + "]");
        }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

        /**
         * <p>Ensure <code>Singleton</code> after serialization.</p>
         *
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_1_27pd7pdl3lqxsbc.R.inc(10690);
            __CLR4_1_27pd7pdl3lqxsbc.R.inc(10691);return ToStringStyle.MULTI_LINE_STYLE;
        }finally{__CLR4_1_27pd7pdl3lqxsbc.R.flushNeeded();}}

    }

}
