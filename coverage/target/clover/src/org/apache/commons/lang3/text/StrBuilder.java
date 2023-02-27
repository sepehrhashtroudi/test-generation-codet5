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
package org.apache.commons.lang3.text;

import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.builder.Builder;

/**
 * Builds a string from constituent parts providing a more flexible and powerful API
 * than StringBuffer.
 * <p>
 * The main differences from StringBuffer/StringBuilder are:
 * <ul>
 * <li>Not synchronized</li>
 * <li>Not final</li>
 * <li>Subclasses have direct access to character array</li>
 * <li>Additional methods
 *  <ul>
 *   <li>appendWithSeparators - adds an array of values, with a separator</li>
 *   <li>appendPadding - adds a length padding characters</li>
 *   <li>appendFixedLength - adds a fixed width field to the builder</li>
 *   <li>toCharArray/getChars - simpler ways to get a range of the character array</li>
 *   <li>delete - delete char or string</li>
 *   <li>replace - search and replace for a char or string</li>
 *   <li>leftString/rightString/midString - substring without exceptions</li>
 *   <li>contains - whether the builder contains a char or string</li>
 *   <li>size/clear/isEmpty - collections style API methods</li>
 *  </ul>
 * </li>
 * </ul>
 * <li>Views
 *  <ul>
 *   <li>asTokenizer - uses the internal buffer as the source of a StrTokenizer</li>
 *   <li>asReader - uses the internal buffer as the source of a Reader</li>
 *   <li>asWriter - allows a Writer to write directly to the internal buffer</li>
 *  </ul>
 * </li>
 * </ul>
 * <p>
 * The aim has been to provide an API that mimics very closely what StringBuffer
 * provides, but with additional methods. It should be noted that some edge cases,
 * with invalid indices or null input, have been altered - see individual methods.
 * The biggest of these changes is that by default, null will not output the text
 * 'null'. This can be controlled by a property, {@link #setNullText(String)}.
 * <p>
 * Prior to 3.0, this class implemented Cloneable but did not implement the 
 * clone method so could not be used. From 3.0 onwards it no longer implements 
 * the interface. 
 *
 * @since 2.2
 * @version $Id$
 */
public class StrBuilder implements CharSequence, Appendable, Serializable, Builder<String> {public static class __CLR4_1_2b8nb8nl3lqxsn1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,15883,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The extra capacity for new builders.
     */
    static final int CAPACITY = 32;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 7628716375283629643L;

    /** Internal data storage. */
    protected char[] buffer; // TODO make private?
    /** Current size of the buffer. */
    protected int size; // TODO make private?
    /** The new line. */
    private String newLine;
    /** The null text. */
    private String nullText;

    //-----------------------------------------------------------------------
    /**
     * Constructor that creates an empty builder initial capacity 32 characters.
     */
    public StrBuilder() {
        this(CAPACITY);__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14568);try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14567);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Constructor that creates an empty builder the specified initial capacity.
     *
     * @param initialCapacity  the initial capacity, zero or less will be converted to 32
     */
    public StrBuilder(int initialCapacity) {
        super();__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14570);try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14569);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14571);if ((((initialCapacity <= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14572)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14573)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14574);initialCapacity = CAPACITY;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14575);buffer = new char[initialCapacity];
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Constructor that creates a builder from the string, allocating
     * 32 extra characters for growth.
     *
     * @param str  the string to copy, null treated as blank string
     */
    public StrBuilder(final String str) {
        super();__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14577);try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14576);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14578);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14579)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14580)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14581);buffer = new char[CAPACITY];
        } }else {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14582);buffer = new char[str.length() + CAPACITY];
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14583);append(str);
        }
    }}finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the text to be appended when a new line is added.
     *
     * @return the new line text, null means use system default
     */
    public String getNewLineText() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14584);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14585);return newLine;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Sets the text to be appended when a new line is added.
     *
     * @param newLine  the new line text, null means use system default
     * @return this, to enable chaining
     */
    public StrBuilder setNewLineText(final String newLine) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14586);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14587);this.newLine = newLine;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14588);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the text to be appended when null is added.
     *
     * @return the null text, null means no append
     */
    public String getNullText() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14589);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14590);return nullText;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Sets the text to be appended when null is added.
     *
     * @param nullText  the null text, null means no append
     * @return this, to enable chaining
     */
    public StrBuilder setNullText(String nullText) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14591);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14592);if ((((nullText != null && nullText.length() == 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14593)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14594)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14595);nullText = null;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14596);this.nullText = nullText;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14597);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the length of the string builder.
     *
     * @return the length
     */
    @Override
    public int length() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14598);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14599);return size;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Updates the length of the builder by either dropping the last characters
     * or adding filler of Unicode zero.
     *
     * @param length  the length to set to, must be zero or positive
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the length is negative
     */
    public StrBuilder setLength(final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14600);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14601);if ((((length < 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14602)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14603)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14604);throw new StringIndexOutOfBoundsException(length);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14605);if ((((length < size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14606)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14607)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14608);size = length;
        } }else {__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14609);if ((((length > size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14610)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14611)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14612);ensureCapacity(length);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14613);final int oldEnd = size;
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14614);final int newEnd = length;
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14615);size = length;
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14616);for (int i = oldEnd; (((i < newEnd)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14617)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14618)==0&false)); i++) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14619);buffer[i] = '\0';
            }
        }}
        }}__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14620);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the current size of the internal character array buffer.
     *
     * @return the capacity
     */
    public int capacity() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14621);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14622);return buffer.length;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Checks the capacity and ensures that it is at least the size specified.
     *
     * @param capacity  the capacity to ensure
     * @return this, to enable chaining
     */
    public StrBuilder ensureCapacity(final int capacity) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14623);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14624);if ((((capacity > buffer.length)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14625)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14626)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14627);final char[] old = buffer;
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14628);buffer = new char[capacity * 2];
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14629);System.arraycopy(old, 0, buffer, 0, size);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14630);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Minimizes the capacity to the actual length of the string.
     *
     * @return this, to enable chaining
     */
    public StrBuilder minimizeCapacity() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14631);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14632);if ((((buffer.length > length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14633)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14634)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14635);final char[] old = buffer;
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14636);buffer = new char[length()];
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14637);System.arraycopy(old, 0, buffer, 0, size);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14638);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the length of the string builder.
     * <p>
     * This method is the same as {@link #length()} and is provided to match the
     * API of Collections.
     *
     * @return the length
     */
    public int size() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14639);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14640);return size;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Checks is the string builder is empty (convenience Collections API style method).
     * <p>
     * This method is the same as checking {@link #length()} and is provided to match the
     * API of Collections.
     *
     * @return <code>true</code> if the size is <code>0</code>.
     */
    public boolean isEmpty() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14641);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14642);return size == 0;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Clears the string builder (convenience Collections API style method).
     * <p>
     * This method does not reduce the size of the internal character buffer.
     * To do that, call <code>clear()</code> followed by {@link #minimizeCapacity()}.
     * <p>
     * This method is the same as {@link #setLength(int)} called with zero
     * and is provided to match the API of Collections.
     *
     * @return this, to enable chaining
     */
    public StrBuilder clear() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14643);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14644);size = 0;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14645);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the character at the specified index.
     *
     * @see #setCharAt(int, char)
     * @see #deleteCharAt(int)
     * @param index  the index to retrieve, must be valid
     * @return the character at the index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    @Override
    public char charAt(final int index) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14646);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14647);if ((((index < 0 || index >= length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14648)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14649)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14650);throw new StringIndexOutOfBoundsException(index);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14651);return buffer[index];
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Sets the character at the specified index.
     *
     * @see #charAt(int)
     * @see #deleteCharAt(int)
     * @param index  the index to set
     * @param ch  the new character
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder setCharAt(final int index, final char ch) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14652);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14653);if ((((index < 0 || index >= length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14654)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14655)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14656);throw new StringIndexOutOfBoundsException(index);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14657);buffer[index] = ch;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14658);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Deletes the character at the specified index.
     *
     * @see #charAt(int)
     * @see #setCharAt(int, char)
     * @param index  the index to delete
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder deleteCharAt(final int index) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14659);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14660);if ((((index < 0 || index >= size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14661)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14662)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14663);throw new StringIndexOutOfBoundsException(index);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14664);deleteImpl(index, index + 1, 1);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14665);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Copies the builder's character array into a new character array.
     * 
     * @return a new array that represents the contents of the builder
     */
    public char[] toCharArray() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14666);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14667);if ((((size == 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14668)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14669)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14670);return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14671);final char chars[] = new char[size];
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14672);System.arraycopy(buffer, 0, chars, 0, size);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14673);return chars;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Copies part of the builder's character array into a new character array.
     * 
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except that
     *  if too large it is treated as end of string
     * @return a new array that holds part of the contents of the builder
     * @throws IndexOutOfBoundsException if startIndex is invalid,
     *  or if endIndex is invalid (but endIndex greater than size is valid)
     */
    public char[] toCharArray(final int startIndex, int endIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14674);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14675);endIndex = validateRange(startIndex, endIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14676);final int len = endIndex - startIndex;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14677);if ((((len == 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14678)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14679)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14680);return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14681);final char chars[] = new char[len];
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14682);System.arraycopy(buffer, startIndex, chars, 0, len);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14683);return chars;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Copies the character array into the specified array.
     * 
     * @param destination  the destination array, null will cause an array to be created
     * @return the input array, unless that was null or too small
     */
    public char[] getChars(char[] destination) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14684);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14685);final int len = length();
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14686);if ((((destination == null || destination.length < len)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14687)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14688)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14689);destination = new char[len];
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14690);System.arraycopy(buffer, 0, destination, 0, len);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14691);return destination;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Copies the character array into the specified array.
     *
     * @param startIndex  first index to copy, inclusive, must be valid
     * @param endIndex  last index, exclusive, must be valid
     * @param destination  the destination array, must not be null or too small
     * @param destinationIndex  the index to start copying in destination
     * @throws NullPointerException if the array is null
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    public void getChars(final int startIndex, final int endIndex, final char destination[], final int destinationIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14692);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14693);if ((((startIndex < 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14694)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14695)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14696);throw new StringIndexOutOfBoundsException(startIndex);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14697);if ((((endIndex < 0 || endIndex > length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14698)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14699)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14700);throw new StringIndexOutOfBoundsException(endIndex);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14701);if ((((startIndex > endIndex)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14702)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14703)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14704);throw new StringIndexOutOfBoundsException("end < start");
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14705);System.arraycopy(buffer, startIndex, destination, destinationIndex, endIndex - startIndex);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends the new line string to this string builder.
     * <p>
     * The new line string can be altered using {@link #setNewLineText(String)}.
     * This might be used to force the output to always use Unix line endings
     * even when on Windows.
     *
     * @return this, to enable chaining
     */
    public StrBuilder appendNewLine() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14706);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14707);if ((((newLine == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14708)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14709)==0&false)))  {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14710);append(SystemUtils.LINE_SEPARATOR);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14711);return this;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14712);return append(newLine);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends the text representing <code>null</code> to this string builder.
     *
     * @return this, to enable chaining
     */
    public StrBuilder appendNull() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14713);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14714);if ((((nullText == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14715)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14716)==0&false)))  {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14717);return this;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14718);return append(nullText);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends an object to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param obj  the object to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final Object obj) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14719);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14720);if ((((obj == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14721)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14722)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14723);return appendNull();
        } 
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14724);return append(obj.toString());        
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a CharSequence to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param seq  the CharSequence to append
     * @return this, to enable chaining
     * @since 3.0
     */
    @Override
    public StrBuilder append(final CharSequence seq) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14725);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14726);if ((((seq == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14727)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14728)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14729);return appendNull();
        } 
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14730);return append(seq.toString());        
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends part of a CharSequence to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param seq  the CharSequence to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 3.0
     */
    @Override
    public StrBuilder append(final CharSequence seq, final int startIndex, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14731);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14732);if ((((seq == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14733)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14734)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14735);return appendNull();
        } 
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14736);return append(seq.toString(), startIndex, length);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}
    
    /**
     * Appends a string to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final String str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14737);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14738);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14739)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14740)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14741);return appendNull();
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14742);final int strLen = str.length();
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14743);if ((((strLen > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14744)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14745)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14746);final int len = length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14747);ensureCapacity(len + strLen);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14748);str.getChars(0, strLen, buffer, len);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14749);size += strLen;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14750);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}
   

    /**
     * Appends part of a string to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final String str, final int startIndex, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14751);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14752);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14753)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14754)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14755);return appendNull();
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14756);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14757)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14758)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14759);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14760);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14761)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14762)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14763);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14764);if ((((length > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14765)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14766)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14767);final int len = length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14768);ensureCapacity(len + length);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14769);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14770);size += length;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14771);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Calls {@link String#format(String, Object...)} and appends the result.
     *
     * @param format the format string
     * @param objs the objects to use in the format string
     * @return {@code this} to enable chaining
     * @see String#format(String, Object...)
     * @since 3.2
     */
    public StrBuilder append(final String format, final Object... objs) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14772);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14773);return append(String.format(format, objs));
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a string buffer to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string buffer to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final StringBuffer str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14774);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14775);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14776)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14777)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14778);return appendNull();
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14779);final int strLen = str.length();
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14780);if ((((strLen > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14781)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14782)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14783);final int len = length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14784);ensureCapacity(len + strLen);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14785);str.getChars(0, strLen, buffer, len);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14786);size += strLen;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14787);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends part of a string buffer to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final StringBuffer str, final int startIndex, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14788);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14789);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14790)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14791)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14792);return appendNull();
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14793);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14794)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14795)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14796);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14797);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14798)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14799)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14800);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14801);if ((((length > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14802)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14803)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14804);final int len = length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14805);ensureCapacity(len + length);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14806);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14807);size += length;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14808);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a StringBuilder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str the StringBuilder to append
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder append(final StringBuilder str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14809);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14810);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14811)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14812)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14813);return appendNull();
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14814);final int strLen = str.length();
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14815);if ((((strLen > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14816)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14817)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14818);final int len = length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14819);ensureCapacity(len + strLen);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14820);str.getChars(0, strLen, buffer, len);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14821);size += strLen;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14822);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}
    
    /**
     * Appends part of a StringBuilder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str the StringBuilder to append
     * @param startIndex the start index, inclusive, must be valid
     * @param length the length to append, must be valid
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder append(final StringBuilder str, final int startIndex, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14823);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14824);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14825)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14826)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14827);return appendNull();
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14828);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14829)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14830)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14831);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14832);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14833)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14834)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14835);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14836);if ((((length > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14837)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14838)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14839);final int len = length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14840);ensureCapacity(len + length);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14841);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14842);size += length;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14843);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends another string builder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final StrBuilder str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14844);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14845);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14846)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14847)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14848);return appendNull();
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14849);final int strLen = str.length();
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14850);if ((((strLen > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14851)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14852)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14853);final int len = length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14854);ensureCapacity(len + strLen);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14855);System.arraycopy(str.buffer, 0, buffer, len, strLen);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14856);size += strLen;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14857);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends part of a string builder to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final StrBuilder str, final int startIndex, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14858);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14859);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14860)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14861)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14862);return appendNull();
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14863);if ((((startIndex < 0 || startIndex > str.length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14864)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14865)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14866);throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14867);if ((((length < 0 || (startIndex + length) > str.length())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14868)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14869)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14870);throw new StringIndexOutOfBoundsException("length must be valid");
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14871);if ((((length > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14872)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14873)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14874);final int len = length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14875);ensureCapacity(len + length);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14876);str.getChars(startIndex, startIndex + length, buffer, len);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14877);size += length;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14878);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a char array to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final char[] chars) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14879);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14880);if ((((chars == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14881)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14882)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14883);return appendNull();
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14884);final int strLen = chars.length;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14885);if ((((strLen > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14886)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14887)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14888);final int len = length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14889);ensureCapacity(len + strLen);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14890);System.arraycopy(chars, 0, buffer, len, strLen);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14891);size += strLen;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14892);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a char array to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     */
    public StrBuilder append(final char[] chars, final int startIndex, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14893);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14894);if ((((chars == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14895)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14896)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14897);return appendNull();
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14898);if ((((startIndex < 0 || startIndex > chars.length)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14899)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14900)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14901);throw new StringIndexOutOfBoundsException("Invalid startIndex: " + length);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14902);if ((((length < 0 || (startIndex + length) > chars.length)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14903)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14904)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14905);throw new StringIndexOutOfBoundsException("Invalid length: " + length);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14906);if ((((length > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14907)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14908)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14909);final int len = length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14910);ensureCapacity(len + length);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14911);System.arraycopy(chars, startIndex, buffer, len, length);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14912);size += length;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14913);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a boolean value to the string builder.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final boolean value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14914);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14915);if ((((value)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14916)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14917)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14918);ensureCapacity(size + 4);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14919);buffer[size++] = 't';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14920);buffer[size++] = 'r';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14921);buffer[size++] = 'u';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14922);buffer[size++] = 'e';
        } }else {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14923);ensureCapacity(size + 5);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14924);buffer[size++] = 'f';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14925);buffer[size++] = 'a';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14926);buffer[size++] = 'l';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14927);buffer[size++] = 's';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14928);buffer[size++] = 'e';
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14929);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a char value to the string builder.
     *
     * @param ch  the value to append
     * @return this, to enable chaining
     * @since 3.0
     */
    @Override
    public StrBuilder append(final char ch) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14930);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14931);final int len = length();
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14932);ensureCapacity(len + 1);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14933);buffer[size++] = ch;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14934);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends an int value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final int value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14935);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14936);return append(String.valueOf(value));
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a long value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final long value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14937);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14938);return append(String.valueOf(value));
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a float value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final float value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14939);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14940);return append(String.valueOf(value));
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a double value to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     */
    public StrBuilder append(final double value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14941);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14942);return append(String.valueOf(value));
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends an object followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param obj  the object to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final Object obj) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14943);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14944);return append(obj).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a string followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final String str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14945);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14946);return append(str).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends part of a string followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final String str, final int startIndex, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14947);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14948);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Calls {@link String#format(String, Object...)} and appends the result.
     *
     * @param format the format string
     * @param objs the objects to use in the format string
     * @return {@code this} to enable chaining
     * @see String#format(String, Object...)
     * @since 3.2
     */
    public StrBuilder appendln(final String format, final Object... objs) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14949);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14950);return append(format, objs).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a string buffer followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string buffer to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StringBuffer str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14951);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14952);return append(str).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder appendln(final StringBuilder str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14953);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14954);return append(str).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends part of a string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 3.2
     */
    public StrBuilder appendln(final StringBuilder str, final int startIndex, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14955);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14956);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends part of a string buffer followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StringBuffer str, final int startIndex, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14957);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14958);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends another string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string builder to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StrBuilder str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14959);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14960);return append(str).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends part of a string builder followed by a new line to this string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param str  the string to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final StrBuilder str, final int startIndex, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14961);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14962);return append(str, startIndex, length).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a char array followed by a new line to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final char[] chars) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14963);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14964);return append(chars).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a char array followed by a new line to the string builder.
     * Appending null will call {@link #appendNull()}.
     *
     * @param chars  the char array to append
     * @param startIndex  the start index, inclusive, must be valid
     * @param length  the length to append, must be valid
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final char[] chars, final int startIndex, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14965);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14966);return append(chars, startIndex, length).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a boolean value followed by a new line to the string builder.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final boolean value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14967);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14968);return append(value).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a char value followed by a new line to the string builder.
     *
     * @param ch  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final char ch) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14969);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14970);return append(ch).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends an int value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final int value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14971);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14972);return append(value).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a long value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final long value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14973);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14974);return append(value).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a float value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final float value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14975);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14976);return append(value).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a double value followed by a new line to the string builder using <code>String.valueOf</code>.
     *
     * @param value  the value to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendln(final double value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14977);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14978);return append(value).appendNewLine();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends each item in an array to the builder without any separators.
     * Appending a null array will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param <T>  the element type
     * @param array  the array to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public <T> StrBuilder appendAll(final T... array) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14979);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14980);if ((((array != null && array.length > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14981)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14982)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14983);for (final Object element : array) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14984);append(element);
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14985);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends each item in a iterable to the builder without any separators.
     * Appending a null iterable will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param iterable  the iterable to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendAll(final Iterable<?> iterable) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14986);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14987);if ((((iterable != null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14988)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14989)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14990);for (final Object o : iterable) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14991);append(o);
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14992);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends each item in an iterator to the builder without any separators.
     * Appending a null iterator will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param it  the iterator to append
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendAll(final Iterator<?> it) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(14993);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14994);if ((((it != null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14995)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14996)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(14997);while ((((it.hasNext())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14998)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(14999)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15000);append(it.next());
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15001);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends an array placing separators between each value, but
     * not before the first or after the last.
     * Appending a null array will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param array  the array to append
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     */
    public StrBuilder appendWithSeparators(final Object[] array, String separator) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15002);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15003);if ((((array != null && array.length > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15004)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15005)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15006);separator = ObjectUtils.toString(separator);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15007);append(array[0]);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15008);for (int i = 1; (((i < array.length)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15009)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15010)==0&false)); i++) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15011);append(separator);
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15012);append(array[i]);
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15013);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a iterable placing separators between each value, but
     * not before the first or after the last.
     * Appending a null iterable will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param iterable  the iterable to append
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     */
    public StrBuilder appendWithSeparators(final Iterable<?> iterable, String separator) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15014);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15015);if ((((iterable != null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15016)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15017)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15018);separator = ObjectUtils.toString(separator);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15019);final Iterator<?> it = iterable.iterator();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15020);while ((((it.hasNext())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15021)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15022)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15023);append(it.next());
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15024);if ((((it.hasNext())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15025)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15026)==0&false))) {{
                    __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15027);append(separator);
                }
            }}
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15028);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends an iterator placing separators between each value, but
     * not before the first or after the last.
     * Appending a null iterator will have no effect.
     * Each object is appended using {@link #append(Object)}.
     *
     * @param it  the iterator to append
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     */
    public StrBuilder appendWithSeparators(final Iterator<?> it, String separator) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15029);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15030);if ((((it != null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15031)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15032)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15033);separator = ObjectUtils.toString(separator);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15034);while ((((it.hasNext())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15035)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15036)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15037);append(it.next());
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15038);if ((((it.hasNext())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15039)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15040)==0&false))) {{
                    __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15041);append(separator);
                }
            }}
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15042);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends a separator if the builder is currently non-empty.
     * Appending a null separator will have no effect.
     * The separator is appended using {@link #append(String)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * <pre>
     * for (Iterator it = list.iterator(); it.hasNext(); ) {
     *   appendSeparator(",");
     *   append(it.next());
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use, null means no separator
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final String separator) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15043);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15044);return appendSeparator(separator, null);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends one of both separators to the StrBuilder.
     * If the builder is currently empty it will append the defaultIfEmpty-separator
     * Otherwise it will append the standard-separator
     * 
     * Appending a null separator will have no effect.
     * The separator is appended using {@link #append(String)}.
     * <p>
     * This method is for example useful for constructing queries
     * <pre>
     * StrBuilder whereClause = new StrBuilder();
     * if(searchCommand.getPriority() != null) {
     *  whereClause.appendSeparator(" and", " where");
     *  whereClause.append(" priority = ?")
     * }
     * if(searchCommand.getComponent() != null) {
     *  whereClause.appendSeparator(" and", " where");
     *  whereClause.append(" component = ?")
     * }
     * selectClause.append(whereClause)
     * </pre>
     * 
     * @param standard the separator if builder is not empty, null means no separator
     * @param defaultIfEmpty the separator if builder is empty, null means no separator
     * @return this, to enable chaining
     * @since 2.5
     */
    public StrBuilder appendSeparator(final String standard, final String defaultIfEmpty) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15045);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15046);final String str = (((isEmpty() )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15047)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15048)==0&false))? defaultIfEmpty : standard;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15049);if ((((str != null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15050)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15051)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15052);append(str);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15053);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a separator if the builder is currently non-empty.
     * The separator is appended using {@link #append(char)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * <pre>
     * for (Iterator it = list.iterator(); it.hasNext(); ) {
     *   appendSeparator(',');
     *   append(it.next());
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final char separator) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15054);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15055);if ((((size() > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15056)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15057)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15058);append(separator);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15059);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Append one of both separators to the builder
     * If the builder is currently empty it will append the defaultIfEmpty-separator
     * Otherwise it will append the standard-separator
     *
     * The separator is appended using {@link #append(char)}.
     * @param standard the separator if builder is not empty
     * @param defaultIfEmpty the separator if builder is empty
     * @return this, to enable chaining
     * @since 2.5
     */
    public StrBuilder appendSeparator(final char standard, final char defaultIfEmpty) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15060);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15061);if ((((size() > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15062)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15063)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15064);append(standard);
        } }else {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15065);append(defaultIfEmpty);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15066);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}
    /**
     * Appends a separator to the builder if the loop index is greater than zero.
     * Appending a null separator will have no effect.
     * The separator is appended using {@link #append(String)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * <pre>
     * for (int i = 0; i < list.size(); i++) {
     *   appendSeparator(",", i);
     *   append(list.get(i));
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use, null means no separator
     * @param loopIndex  the loop index
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final String separator, final int loopIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15067);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15068);if ((((separator != null && loopIndex > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15069)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15070)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15071);append(separator);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15072);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends a separator to the builder if the loop index is greater than zero.
     * The separator is appended using {@link #append(char)}.
     * <p>
     * This method is useful for adding a separator each time around the
     * loop except the first.
     * <pre>
     * for (int i = 0; i < list.size(); i++) {
     *   appendSeparator(",", i);
     *   append(list.get(i));
     * }
     * </pre>
     * Note that for this simple example, you should use
     * {@link #appendWithSeparators(Iterable, String)}.
     * 
     * @param separator  the separator to use
     * @param loopIndex  the loop index
     * @return this, to enable chaining
     * @since 2.3
     */
    public StrBuilder appendSeparator(final char separator, final int loopIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15073);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15074);if ((((loopIndex > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15075)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15076)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15077);append(separator);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15078);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends the pad character to the builder the specified number of times.
     * 
     * @param length  the length to append, negative means no append
     * @param padChar  the character to append
     * @return this, to enable chaining
     */
    public StrBuilder appendPadding(final int length, final char padChar) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15079);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15080);if ((((length >= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15081)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15082)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15083);ensureCapacity(size + length);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15084);for (int i = 0; (((i < length)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15085)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15086)==0&false)); i++) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15087);buffer[size++] = padChar;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15088);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Appends an object to the builder padding on the left to a fixed width.
     * The <code>toString</code> of the object is used.
     * If the object is larger than the length, the left hand side is lost.
     * If the object is null, the null text value is used.
     * 
     * @param obj  the object to append, null uses null text
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadLeft(final Object obj, final int width, final char padChar) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15089);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15090);if ((((width > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15091)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15092)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15093);ensureCapacity(size + width);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15094);String str = ((((obj == null )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15095)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15096)==0&false))? getNullText() : obj.toString());
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15097);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15098)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15099)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15100);str = "";
            }
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15101);final int strLen = str.length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15102);if ((((strLen >= width)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15103)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15104)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15105);str.getChars(strLen - width, strLen, buffer, size);
            } }else {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15106);final int padLen = width - strLen;
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15107);for (int i = 0; (((i < padLen)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15108)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15109)==0&false)); i++) {{
                    __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15110);buffer[size + i] = padChar;
                }
                }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15111);str.getChars(0, strLen, buffer, size + padLen);
            }
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15112);size += width;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15113);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends an object to the builder padding on the left to a fixed width.
     * The <code>String.valueOf</code> of the <code>int</code> value is used.
     * If the formatted value is larger than the length, the left hand side is lost.
     * 
     * @param value  the value to append
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadLeft(final int value, final int width, final char padChar) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15114);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15115);return appendFixedWidthPadLeft(String.valueOf(value), width, padChar);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends an object to the builder padding on the right to a fixed length.
     * The <code>toString</code> of the object is used.
     * If the object is larger than the length, the right hand side is lost.
     * If the object is null, null text value is used.
     * 
     * @param obj  the object to append, null uses null text
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadRight(final Object obj, final int width, final char padChar) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15116);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15117);if ((((width > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15118)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15119)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15120);ensureCapacity(size + width);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15121);String str = ((((obj == null )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15122)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15123)==0&false))? getNullText() : obj.toString());
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15124);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15125)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15126)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15127);str = "";
            }
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15128);final int strLen = str.length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15129);if ((((strLen >= width)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15130)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15131)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15132);str.getChars(0, width, buffer, size);
            } }else {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15133);final int padLen = width - strLen;
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15134);str.getChars(0, strLen, buffer, size);
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15135);for (int i = 0; (((i < padLen)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15136)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15137)==0&false)); i++) {{
                    __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15138);buffer[size + strLen + i] = padChar;
                }
            }}
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15139);size += width;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15140);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Appends an object to the builder padding on the right to a fixed length.
     * The <code>String.valueOf</code> of the <code>int</code> value is used.
     * If the object is larger than the length, the right hand side is lost.
     * 
     * @param value  the value to append
     * @param width  the fixed field width, zero or negative has no effect
     * @param padChar  the pad character to use
     * @return this, to enable chaining
     */
    public StrBuilder appendFixedWidthPadRight(final int value, final int width, final char padChar) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15141);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15142);return appendFixedWidthPadRight(String.valueOf(value), width, padChar);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Inserts the string representation of an object into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param obj  the object to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final Object obj) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15143);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15144);if ((((obj == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15145)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15146)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15147);return insert(index, nullText);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15148);return insert(index, obj.toString());
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Inserts the string into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param str  the string to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, String str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15149);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15150);validateIndex(index);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15151);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15152)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15153)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15154);str = nullText;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15155);if ((((str != null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15156)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15157)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15158);final int strLen = str.length();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15159);if ((((strLen > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15160)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15161)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15162);final int newSize = size + strLen;
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15163);ensureCapacity(newSize);
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15164);System.arraycopy(buffer, index, buffer, index + strLen, size - index);
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15165);size = newSize;
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15166);str.getChars(0, strLen, buffer, index);
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15167);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Inserts the character array into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param chars  the char array to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final char chars[]) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15168);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15169);validateIndex(index);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15170);if ((((chars == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15171)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15172)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15173);return insert(index, nullText);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15174);final int len = chars.length;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15175);if ((((len > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15176)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15177)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15178);ensureCapacity(size + len);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15179);System.arraycopy(buffer, index, buffer, index + len, size - index);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15180);System.arraycopy(chars, 0, buffer, index, len);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15181);size += len;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15182);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Inserts part of the character array into this builder.
     * Inserting null will use the stored null text value.
     *
     * @param index  the index to add at, must be valid
     * @param chars  the char array to insert
     * @param offset  the offset into the character array to start at, must be valid
     * @param length  the length of the character array part to copy, must be positive
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    public StrBuilder insert(final int index, final char chars[], final int offset, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15183);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15184);validateIndex(index);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15185);if ((((chars == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15186)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15187)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15188);return insert(index, nullText);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15189);if ((((offset < 0 || offset > chars.length)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15190)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15191)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15192);throw new StringIndexOutOfBoundsException("Invalid offset: " + offset);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15193);if ((((length < 0 || offset + length > chars.length)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15194)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15195)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15196);throw new StringIndexOutOfBoundsException("Invalid length: " + length);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15197);if ((((length > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15198)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15199)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15200);ensureCapacity(size + length);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15201);System.arraycopy(buffer, index, buffer, index + length, size - index);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15202);System.arraycopy(chars, offset, buffer, index, length);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15203);size += length;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15204);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(int index, final boolean value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15205);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15206);validateIndex(index);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15207);if ((((value)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15208)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15209)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15210);ensureCapacity(size + 4);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15211);System.arraycopy(buffer, index, buffer, index + 4, size - index);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15212);buffer[index++] = 't';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15213);buffer[index++] = 'r';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15214);buffer[index++] = 'u';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15215);buffer[index] = 'e';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15216);size += 4;
        } }else {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15217);ensureCapacity(size + 5);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15218);System.arraycopy(buffer, index, buffer, index + 5, size - index);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15219);buffer[index++] = 'f';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15220);buffer[index++] = 'a';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15221);buffer[index++] = 'l';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15222);buffer[index++] = 's';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15223);buffer[index] = 'e';
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15224);size += 5;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15225);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final char value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15226);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15227);validateIndex(index);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15228);ensureCapacity(size + 1);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15229);System.arraycopy(buffer, index, buffer, index + 1, size - index);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15230);buffer[index] = value;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15231);size++;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15232);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final int value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15233);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15234);return insert(index, String.valueOf(value));
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final long value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15235);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15236);return insert(index, String.valueOf(value));
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final float value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15237);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15238);return insert(index, String.valueOf(value));
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Inserts the value into this builder.
     *
     * @param index  the index to add at, must be valid
     * @param value  the value to insert
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder insert(final int index, final double value) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15239);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15240);return insert(index, String.valueOf(value));
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Internal method to delete a range without validation.
     *
     * @param startIndex  the start index, must be valid
     * @param endIndex  the end index (exclusive), must be valid
     * @param len  the length, must be valid
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    private void deleteImpl(final int startIndex, final int endIndex, final int len) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15241);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15242);System.arraycopy(buffer, endIndex, buffer, startIndex, size - endIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15243);size -= len;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Deletes the characters between the two specified indices.
     *
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder delete(final int startIndex, int endIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15244);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15245);endIndex = validateRange(startIndex, endIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15246);final int len = endIndex - startIndex;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15247);if ((((len > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15248)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15249)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15250);deleteImpl(startIndex, endIndex, len);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15251);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Deletes the character wherever it occurs in the builder.
     *
     * @param ch  the character to delete
     * @return this, to enable chaining
     */
    public StrBuilder deleteAll(final char ch) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15252);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15253);for (int i = 0; (((i < size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15254)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15255)==0&false)); i++) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15256);if ((((buffer[i] == ch)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15257)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15258)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15259);final int start = i;
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15260);while ((((++i < size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15261)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15262)==0&false))) {{
                    __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15263);if ((((buffer[i] != ch)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15264)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15265)==0&false))) {{
                        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15266);break;
                    }
                }}
                }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15267);final int len = i - start;
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15268);deleteImpl(start, i, len);
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15269);i -= len;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15270);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Deletes the character wherever it occurs in the builder.
     *
     * @param ch  the character to delete
     * @return this, to enable chaining
     */
    public StrBuilder deleteFirst(final char ch) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15271);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15272);for (int i = 0; (((i < size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15273)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15274)==0&false)); i++) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15275);if ((((buffer[i] == ch)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15276)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15277)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15278);deleteImpl(i, i + 1, 1);
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15279);break;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15280);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Deletes the string wherever it occurs in the builder.
     *
     * @param str  the string to delete, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteAll(final String str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15281);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15282);final int len = ((((str == null )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15283)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15284)==0&false))? 0 : str.length());
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15285);if ((((len > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15286)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15287)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15288);int index = indexOf(str, 0);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15289);while ((((index >= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15290)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15291)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15292);deleteImpl(index, index + len, len);
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15293);index = indexOf(str, index);
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15294);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Deletes the string wherever it occurs in the builder.
     *
     * @param str  the string to delete, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteFirst(final String str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15295);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15296);final int len = ((((str == null )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15297)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15298)==0&false))? 0 : str.length());
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15299);if ((((len > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15300)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15301)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15302);final int index = indexOf(str, 0);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15303);if ((((index >= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15304)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15305)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15306);deleteImpl(index, index + len, len);
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15307);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Deletes all parts of the builder that the matcher matches.
     * <p>
     * Matchers can be used to perform advanced deletion behaviour.
     * For example you could write a matcher to delete all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteAll(final StrMatcher matcher) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15308);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15309);return replace(matcher, null, 0, size, -1);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Deletes the first match within the builder using the specified matcher.
     * <p>
     * Matchers can be used to perform advanced deletion behaviour.
     * For example you could write a matcher to delete
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @return this, to enable chaining
     */
    public StrBuilder deleteFirst(final StrMatcher matcher) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15310);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15311);return replace(matcher, null, 0, size, 1);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Internal method to delete a range without validation.
     *
     * @param startIndex  the start index, must be valid
     * @param endIndex  the end index (exclusive), must be valid
     * @param removeLen  the length to remove (endIndex - startIndex), must be valid
     * @param insertStr  the string to replace with, null means delete range
     * @param insertLen  the length of the insert string, must be valid
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    private void replaceImpl(final int startIndex, final int endIndex, final int removeLen, final String insertStr, final int insertLen) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15312);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15313);final int newSize = size - removeLen + insertLen;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15314);if ((((insertLen != removeLen)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15315)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15316)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15317);ensureCapacity(newSize);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15318);System.arraycopy(buffer, endIndex, buffer, startIndex + insertLen, size - endIndex);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15319);size = newSize;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15320);if ((((insertLen > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15321)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15322)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15323);insertStr.getChars(0, insertLen, buffer, startIndex);
        }
    }}finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Replaces a portion of the string builder with another string.
     * The length of the inserted string does not have to match the removed length.
     *
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @param replaceStr  the string to replace with, null means delete range
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public StrBuilder replace(final int startIndex, int endIndex, final String replaceStr) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15324);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15325);endIndex = validateRange(startIndex, endIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15326);final int insertLen = ((((replaceStr == null )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15327)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15328)==0&false))? 0 : replaceStr.length());
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15329);replaceImpl(startIndex, endIndex, endIndex - startIndex, replaceStr, insertLen);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15330);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces the search character with the replace character
     * throughout the builder.
     *
     * @param search  the search character
     * @param replace  the replace character
     * @return this, to enable chaining
     */
    public StrBuilder replaceAll(final char search, final char replace) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15331);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15332);if ((((search != replace)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15333)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15334)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15335);for (int i = 0; (((i < size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15336)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15337)==0&false)); i++) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15338);if ((((buffer[i] == search)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15339)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15340)==0&false))) {{
                    __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15341);buffer[i] = replace;
                }
            }}
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15342);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Replaces the first instance of the search character with the
     * replace character in the builder.
     *
     * @param search  the search character
     * @param replace  the replace character
     * @return this, to enable chaining
     */
    public StrBuilder replaceFirst(final char search, final char replace) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15343);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15344);if ((((search != replace)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15345)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15346)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15347);for (int i = 0; (((i < size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15348)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15349)==0&false)); i++) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15350);if ((((buffer[i] == search)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15351)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15352)==0&false))) {{
                    __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15353);buffer[i] = replace;
                    __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15354);break;
                }
            }}
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15355);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces the search string with the replace string throughout the builder.
     *
     * @param searchStr  the search string, null causes no action to occur
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceAll(final String searchStr, final String replaceStr) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15356);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15357);final int searchLen = ((((searchStr == null )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15358)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15359)==0&false))? 0 : searchStr.length());
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15360);if ((((searchLen > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15361)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15362)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15363);final int replaceLen = ((((replaceStr == null )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15364)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15365)==0&false))? 0 : replaceStr.length());
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15366);int index = indexOf(searchStr, 0);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15367);while ((((index >= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15368)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15369)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15370);replaceImpl(index, index + searchLen, searchLen, replaceStr, replaceLen);
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15371);index = indexOf(searchStr, index + replaceLen);
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15372);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Replaces the first instance of the search string with the replace string.
     *
     * @param searchStr  the search string, null causes no action to occur
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceFirst(final String searchStr, final String replaceStr) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15373);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15374);final int searchLen = ((((searchStr == null )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15375)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15376)==0&false))? 0 : searchStr.length());
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15377);if ((((searchLen > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15378)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15379)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15380);final int index = indexOf(searchStr, 0);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15381);if ((((index >= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15382)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15383)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15384);final int replaceLen = ((((replaceStr == null )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15385)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15386)==0&false))? 0 : replaceStr.length());
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15387);replaceImpl(index, index + searchLen, searchLen, replaceStr, replaceLen);
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15388);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Replaces all matches within the builder with the replace string.
     * <p>
     * Matchers can be used to perform advanced replace behaviour.
     * For example you could write a matcher to replace all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceAll(final StrMatcher matcher, final String replaceStr) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15389);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15390);return replace(matcher, replaceStr, 0, size, -1);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Replaces the first match within the builder with the replace string.
     * <p>
     * Matchers can be used to perform advanced replace behaviour.
     * For example you could write a matcher to replace
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the replace string, null is equivalent to an empty string
     * @return this, to enable chaining
     */
    public StrBuilder replaceFirst(final StrMatcher matcher, final String replaceStr) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15391);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15392);return replace(matcher, replaceStr, 0, size, 1);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    /**
     * Advanced search and replaces within the builder using a matcher.
     * <p>
     * Matchers can be used to perform advanced behaviour.
     * For example you could write a matcher to delete all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the string to replace the match with, null is a delete
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @param replaceCount  the number of times to replace, -1 for replace all
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if start index is invalid
     */
    public StrBuilder replace(
            final StrMatcher matcher, final String replaceStr,
            final int startIndex, int endIndex, final int replaceCount) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15393);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15394);endIndex = validateRange(startIndex, endIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15395);return replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Replaces within the builder using a matcher.
     * <p>
     * Matchers can be used to perform advanced behaviour.
     * For example you could write a matcher to delete all occurrences
     * where the character 'a' is followed by a number.
     *
     * @param matcher  the matcher to use to find the deletion, null causes no action
     * @param replaceStr  the string to replace the match with, null is a delete
     * @param from  the start index, must be valid
     * @param to  the end index (exclusive), must be valid
     * @param replaceCount  the number of times to replace, -1 for replace all
     * @return this, to enable chaining
     * @throws IndexOutOfBoundsException if any index is invalid
     */
    private StrBuilder replaceImpl(
            final StrMatcher matcher, final String replaceStr,
            final int from, int to, int replaceCount) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15396);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15397);if ((((matcher == null || size == 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15398)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15399)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15400);return this;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15401);final int replaceLen = ((((replaceStr == null )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15402)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15403)==0&false))? 0 : replaceStr.length());
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15404);final char[] buf = buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15405);for (int i = from; (((i < to && replaceCount != 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15406)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15407)==0&false)); i++) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15408);final int removeLen = matcher.isMatch(buf, i, from, to);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15409);if ((((removeLen > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15410)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15411)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15412);replaceImpl(i, i + removeLen, removeLen, replaceStr, replaceLen);
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15413);to = to - removeLen + replaceLen;
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15414);i = i + replaceLen - 1;
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15415);if ((((replaceCount > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15416)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15417)==0&false))) {{
                    __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15418);replaceCount--;
                }
            }}
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15419);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Reverses the string builder placing each character in the opposite index.
     * 
     * @return this, to enable chaining
     */
    public StrBuilder reverse() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15420);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15421);if ((((size == 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15422)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15423)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15424);return this;
        }
        
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15425);final int half = size / 2;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15426);final char[] buf = buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15427);for (int leftIdx = 0, rightIdx = size - 1; (((leftIdx < half)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15428)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15429)==0&false)); leftIdx++,rightIdx--) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15430);final char swap = buf[leftIdx];
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15431);buf[leftIdx] = buf[rightIdx];
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15432);buf[rightIdx] = swap;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15433);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Trims the builder by removing characters less than or equal to a space
     * from the beginning and end.
     *
     * @return this, to enable chaining
     */
    public StrBuilder trim() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15434);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15435);if ((((size == 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15436)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15437)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15438);return this;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15439);int len = size;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15440);final char[] buf = buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15441);int pos = 0;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15442);while ((((pos < len && buf[pos] <= ' ')&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15443)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15444)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15445);pos++;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15446);while ((((pos < len && buf[len - 1] <= ' ')&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15447)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15448)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15449);len--;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15450);if ((((len < size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15451)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15452)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15453);delete(len, size);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15454);if ((((pos > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15455)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15456)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15457);delete(0, pos);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15458);return this;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks whether this builder starts with the specified string.
     * <p>
     * Note that this method handles null input quietly, unlike String.
     * 
     * @param str  the string to search for, null returns false
     * @return true if the builder starts with the string
     */
    public boolean startsWith(final String str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15459);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15460);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15461)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15462)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15463);return false;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15464);final int len = str.length();
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15465);if ((((len == 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15466)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15467)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15468);return true;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15469);if ((((len > size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15470)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15471)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15472);return false;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15473);for (int i = 0; (((i < len)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15474)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15475)==0&false)); i++) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15476);if ((((buffer[i] != str.charAt(i))&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15477)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15478)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15479);return false;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15480);return true;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Checks whether this builder ends with the specified string.
     * <p>
     * Note that this method handles null input quietly, unlike String.
     * 
     * @param str  the string to search for, null returns false
     * @return true if the builder ends with the string
     */
    public boolean endsWith(final String str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15481);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15482);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15483)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15484)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15485);return false;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15486);final int len = str.length();
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15487);if ((((len == 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15488)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15489)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15490);return true;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15491);if ((((len > size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15492)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15493)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15494);return false;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15495);int pos = size - len;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15496);for (int i = 0; (((i < len)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15497)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15498)==0&false)); i++,pos++) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15499);if ((((buffer[pos] != str.charAt(i))&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15500)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15501)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15502);return false;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15503);return true;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * {@inheritDoc}
     * @since 3.0
     */
    @Override
    public CharSequence subSequence(final int startIndex, final int endIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15504);
      __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15505);if ((((startIndex < 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15506)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15507)==0&false))) {{
          __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15508);throw new StringIndexOutOfBoundsException(startIndex);
      }
      }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15509);if ((((endIndex > size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15510)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15511)==0&false))) {{
          __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15512);throw new StringIndexOutOfBoundsException(endIndex);
      }
      }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15513);if ((((startIndex > endIndex)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15514)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15515)==0&false))) {{
          __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15516);throw new StringIndexOutOfBoundsException(endIndex - startIndex);
      }
      }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15517);return substring(startIndex, endIndex);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Extracts a portion of this string builder as a string.
     * 
     * @param start  the start index, inclusive, must be valid
     * @return the new string
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public String substring(final int start) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15518);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15519);return substring(start, size);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Extracts a portion of this string builder as a string.
     * <p>
     * Note: This method treats an endIndex greater than the length of the
     * builder as equal to the length of the builder, and continues
     * without error, unlike StringBuffer or String.
     * 
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @return the new string
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public String substring(final int startIndex, int endIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15520);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15521);endIndex = validateRange(startIndex, endIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15522);return new String(buffer, startIndex, endIndex - startIndex);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Extracts the leftmost characters from the string builder without
     * throwing an exception.
     * <p>
     * This method extracts the left <code>length</code> characters from
     * the builder. If this many characters are not available, the whole
     * builder is returned. Thus the returned string may be shorter than the
     * length requested.
     * 
     * @param length  the number of characters to extract, negative returns empty string
     * @return the new string
     */
    public String leftString(final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15523);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15524);if ((((length <= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15525)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15526)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15527);return "";
        } }else {__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15528);if ((((length >= size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15529)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15530)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15531);return new String(buffer, 0, size);
        } }else {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15532);return new String(buffer, 0, length);
        }
    }}}finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Extracts the rightmost characters from the string builder without
     * throwing an exception.
     * <p>
     * This method extracts the right <code>length</code> characters from
     * the builder. If this many characters are not available, the whole
     * builder is returned. Thus the returned string may be shorter than the
     * length requested.
     * 
     * @param length  the number of characters to extract, negative returns empty string
     * @return the new string
     */
    public String rightString(final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15533);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15534);if ((((length <= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15535)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15536)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15537);return "";
        } }else {__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15538);if ((((length >= size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15539)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15540)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15541);return new String(buffer, 0, size);
        } }else {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15542);return new String(buffer, size - length, length);
        }
    }}}finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Extracts some characters from the middle of the string builder without
     * throwing an exception.
     * <p>
     * This method extracts <code>length</code> characters from the builder
     * at the specified index.
     * If the index is negative it is treated as zero.
     * If the index is greater than the builder size, it is treated as the builder size.
     * If the length is negative, the empty string is returned.
     * If insufficient characters are available in the builder, as much as possible is returned.
     * Thus the returned string may be shorter than the length requested.
     * 
     * @param index  the index to start at, negative means zero
     * @param length  the number of characters to extract, negative returns empty string
     * @return the new string
     */
    public String midString(int index, final int length) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15543);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15544);if ((((index < 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15545)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15546)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15547);index = 0;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15548);if ((((length <= 0 || index >= size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15549)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15550)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15551);return "";
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15552);if ((((size <= index + length)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15553)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15554)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15555);return new String(buffer, index, size - index);
        } }else {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15556);return new String(buffer, index, length);
        }
    }}finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if the string builder contains the specified char.
     *
     * @param ch  the character to find
     * @return true if the builder contains the character
     */
    public boolean contains(final char ch) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15557);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15558);final char[] thisBuf = buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15559);for (int i = 0; (((i < this.size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15560)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15561)==0&false)); i++) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15562);if ((((thisBuf[i] == ch)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15563)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15564)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15565);return true;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15566);return false;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Checks if the string builder contains the specified string.
     *
     * @param str  the string to find
     * @return true if the builder contains the string
     */
    public boolean contains(final String str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15567);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15568);return indexOf(str, 0) >= 0;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Checks if the string builder contains a string matched using the
     * specified matcher.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to search for the character
     * 'a' followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @return true if the matcher finds a match in the builder
     */
    public boolean contains(final StrMatcher matcher) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15569);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15570);return indexOf(matcher, 0) >= 0;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Searches the string builder to find the first reference to the specified char.
     * 
     * @param ch  the character to find
     * @return the first index of the character, or -1 if not found
     */
    public int indexOf(final char ch) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15571);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15572);return indexOf(ch, 0);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the first reference to the specified char.
     * 
     * @param ch  the character to find
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the first index of the character, or -1 if not found
     */
    public int indexOf(final char ch, int startIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15573);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15574);startIndex = ((((startIndex < 0 )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15575)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15576)==0&false))? 0 : startIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15577);if ((((startIndex >= size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15578)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15579)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15580);return -1;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15581);final char[] thisBuf = buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15582);for (int i = startIndex; (((i < size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15583)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15584)==0&false)); i++) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15585);if ((((thisBuf[i] == ch)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15586)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15587)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15588);return i;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15589);return -1;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the first reference to the specified string.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @return the first index of the string, or -1 if not found
     */
    public int indexOf(final String str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15590);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15591);return indexOf(str, 0);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the first reference to the specified
     * string starting searching from the given index.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the first index of the string, or -1 if not found
     */
    public int indexOf(final String str, int startIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15592);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15593);startIndex = ((((startIndex < 0 )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15594)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15595)==0&false))? 0 : startIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15596);if ((((str == null || startIndex >= size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15597)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15598)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15599);return -1;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15600);final int strLen = str.length();
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15601);if ((((strLen == 1)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15602)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15603)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15604);return indexOf(str.charAt(0), startIndex);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15605);if ((((strLen == 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15606)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15607)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15608);return startIndex;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15609);if ((((strLen > size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15610)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15611)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15612);return -1;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15613);final char[] thisBuf = buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15614);final int len = size - strLen + 1;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15615);outer:
        for (int i = startIndex; (((i < len)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15616)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15617)==0&false)); i++) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15618);for (int j = 0; (((j < strLen)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15619)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15620)==0&false)); j++) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15621);if ((((str.charAt(j) != thisBuf[i + j])&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15622)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15623)==0&false))) {{
                    __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15624);continue outer;
                }
            }}
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15625);return i;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15626);return -1;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the first match.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @return the first index matched, or -1 if not found
     */
    public int indexOf(final StrMatcher matcher) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15627);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15628);return indexOf(matcher, 0);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the first
     * match searching from the given index.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the first index matched, or -1 if not found
     */
    public int indexOf(final StrMatcher matcher, int startIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15629);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15630);startIndex = ((((startIndex < 0 )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15631)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15632)==0&false))? 0 : startIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15633);if ((((matcher == null || startIndex >= size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15634)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15635)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15636);return -1;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15637);final int len = size;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15638);final char[] buf = buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15639);for (int i = startIndex; (((i < len)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15640)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15641)==0&false)); i++) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15642);if ((((matcher.isMatch(buf, i, startIndex, len) > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15643)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15644)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15645);return i;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15646);return -1;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Searches the string builder to find the last reference to the specified char.
     * 
     * @param ch  the character to find
     * @return the last index of the character, or -1 if not found
     */
    public int lastIndexOf(final char ch) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15647);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15648);return lastIndexOf(ch, size - 1);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the last reference to the specified char.
     * 
     * @param ch  the character to find
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the last index of the character, or -1 if not found
     */
    public int lastIndexOf(final char ch, int startIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15649);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15650);startIndex = ((((startIndex >= size )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15651)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15652)==0&false))? size - 1 : startIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15653);if ((((startIndex < 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15654)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15655)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15656);return -1;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15657);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15658)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15659)==0&false)); i--) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15660);if ((((buffer[i] == ch)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15661)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15662)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15663);return i;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15664);return -1;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the last reference to the specified string.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @return the last index of the string, or -1 if not found
     */
    public int lastIndexOf(final String str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15665);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15666);return lastIndexOf(str, size - 1);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Searches the string builder to find the last reference to the specified
     * string starting searching from the given index.
     * <p>
     * Note that a null input string will return -1, whereas the JDK throws an exception.
     * 
     * @param str  the string to find, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the last index of the string, or -1 if not found
     */
    public int lastIndexOf(final String str, int startIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15667);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15668);startIndex = ((((startIndex >= size )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15669)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15670)==0&false))? size - 1 : startIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15671);if ((((str == null || startIndex < 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15672)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15673)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15674);return -1;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15675);final int strLen = str.length();
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15676);if ((((strLen > 0 && strLen <= size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15677)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15678)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15679);if ((((strLen == 1)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15680)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15681)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15682);return lastIndexOf(str.charAt(0), startIndex);
            }

            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15683);outer:
            for (int i = startIndex - strLen + 1; (((i >= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15684)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15685)==0&false)); i--) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15686);for (int j = 0; (((j < strLen)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15687)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15688)==0&false)); j++) {{
                    __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15689);if ((((str.charAt(j) != buffer[i + j])&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15690)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15691)==0&false))) {{
                        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15692);continue outer;
                    }
                }}
                }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15693);return i;
            }
            
        }} }else {__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15694);if ((((strLen == 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15695)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15696)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15697);return startIndex;
        }
        }}__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15698);return -1;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the last match.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @return the last index matched, or -1 if not found
     */
    public int lastIndexOf(final StrMatcher matcher) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15699);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15700);return lastIndexOf(matcher, size);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Searches the string builder using the matcher to find the last
     * match searching from the given index.
     * <p>
     * Matchers can be used to perform advanced searching behaviour.
     * For example you could write a matcher to find the character 'a'
     * followed by a number.
     *
     * @param matcher  the matcher to use, null returns -1
     * @param startIndex  the index to start at, invalid index rounded to edge
     * @return the last index matched, or -1 if not found
     */
    public int lastIndexOf(final StrMatcher matcher, int startIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15701);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15702);startIndex = ((((startIndex >= size )&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15703)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15704)==0&false))? size - 1 : startIndex);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15705);if ((((matcher == null || startIndex < 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15706)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15707)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15708);return -1;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15709);final char[] buf = buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15710);final int endIndex = startIndex + 1;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15711);for (int i = startIndex; (((i >= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15712)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15713)==0&false)); i--) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15714);if ((((matcher.isMatch(buf, i, 0, endIndex) > 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15715)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15716)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15717);return i;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15718);return -1;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a tokenizer that can tokenize the contents of this builder.
     * <p>
     * This method allows the contents of this builder to be tokenized.
     * The tokenizer will be setup by default to tokenize on space, tab,
     * newline and formfeed (as per StringTokenizer). These values can be
     * changed on the tokenizer class, before retrieving the tokens.
     * <p>
     * The returned tokenizer is linked to this builder. You may intermix
     * calls to the buider and tokenizer within certain limits, however
     * there is no synchronization. Once the tokenizer has been used once,
     * it must be {@link StrTokenizer#reset() reset} to pickup the latest
     * changes in the builder. For example:
     * <pre>
     * StrBuilder b = new StrBuilder();
     * b.append("a b ");
     * StrTokenizer t = b.asTokenizer();
     * String[] tokens1 = t.getTokenArray();  // returns a,b
     * b.append("c d ");
     * String[] tokens2 = t.getTokenArray();  // returns a,b (c and d ignored)
     * t.reset();              // reset causes builder changes to be picked up
     * String[] tokens3 = t.getTokenArray();  // returns a,b,c,d
     * </pre>
     * In addition to simply intermixing appends and tokenization, you can also
     * call the set methods on the tokenizer to alter how it tokenizes. Just
     * remember to call reset when you want to pickup builder changes.
     * <p>
     * Calling {@link StrTokenizer#reset(String)} or {@link StrTokenizer#reset(char[])}
     * with a non-null value will break the link with the builder.
     *
     * @return a tokenizer that is linked to this builder
     */
    public StrTokenizer asTokenizer() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15719);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15720);return new StrBuilderTokenizer();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the contents of this builder as a Reader.
     * <p>
     * This method allows the contents of the builder to be read
     * using any standard method that expects a Reader.
     * <p>
     * To use, simply create a <code>StrBuilder</code>, populate it with
     * data, call <code>asReader</code>, and then read away.
     * <p>
     * The internal character array is shared between the builder and the reader.
     * This allows you to append to the builder after creating the reader,
     * and the changes will be picked up.
     * Note however, that no synchronization occurs, so you must perform
     * all operations with the builder and the reader in one thread.
     * <p>
     * The returned reader supports marking, and ignores the flush method.
     *
     * @return a reader that reads from this builder
     */
    public Reader asReader() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15721);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15722);return new StrBuilderReader();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this builder as a Writer that can be written to.
     * <p>
     * This method allows you to populate the contents of the builder
     * using any standard method that takes a Writer.
     * <p>
     * To use, simply create a <code>StrBuilder</code>,
     * call <code>asWriter</code>, and populate away. The data is available
     * at any time using the methods of the <code>StrBuilder</code>.
     * <p>
     * The internal character array is shared between the builder and the writer.
     * This allows you to intermix calls that append to the builder and
     * write using the writer and the changes will be occur correctly.
     * Note however, that no synchronization occurs, so you must perform
     * all operations with the builder and the writer in one thread.
     * <p>
     * The returned writer ignores the close and flush methods.
     *
     * @return a writer that populates this builder
     */
    public Writer asWriter() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15723);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15724);return new StrBuilderWriter();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
//    /**
//     * Gets a String version of the string builder by calling the internal
//     * constructor of String by reflection.
//     * <p>
//     * WARNING: You must not use the StrBuilder after calling this method
//     * as the buffer is now shared with the String object. To ensure this,
//     * the internal character array is set to null, so you will get
//     * NullPointerExceptions on all method calls.
//     *
//     * @return the builder as a String
//     */
//    public String toSharedString() {
//        try {
//            Constructor con = String.class.getDeclaredConstructor(
//                new Class[] {int.class, int.class, char[].class});
//            con.setAccessible(true);
//            char[] buffer = buf;
//            buf = null;
//            size = -1;
//            nullText = null;
//            return (String) con.newInstance(
//                new Object[] {Integer.valueOf(0), Integer.valueOf(size), buffer});
//            
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            throw new UnsupportedOperationException("StrBuilder.toSharedString is unsupported: " + ex.getMessage());
//        }
//    }

    //-----------------------------------------------------------------------
    /**
     * Checks the contents of this builder against another to see if they
     * contain the same character content ignoring case.
     *
     * @param other  the object to check, null returns false
     * @return true if the builders contain the same characters in the same order
     */
    public boolean equalsIgnoreCase(final StrBuilder other) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15725);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15726);if ((((this == other)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15727)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15728)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15729);return true;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15730);if ((((this.size != other.size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15731)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15732)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15733);return false;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15734);final char thisBuf[] = this.buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15735);final char otherBuf[] = other.buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15736);for (int i = size - 1; (((i >= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15737)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15738)==0&false)); i--) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15739);final char c1 = thisBuf[i];
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15740);final char c2 = otherBuf[i];
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15741);if ((((c1 != c2 && Character.toUpperCase(c1) != Character.toUpperCase(c2))&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15742)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15743)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15744);return false;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15745);return true;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Checks the contents of this builder against another to see if they
     * contain the same character content.
     *
     * @param other  the object to check, null returns false
     * @return true if the builders contain the same characters in the same order
     */
    public boolean equals(final StrBuilder other) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15746);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15747);if ((((this == other)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15748)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15749)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15750);return true;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15751);if ((((this.size != other.size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15752)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15753)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15754);return false;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15755);final char thisBuf[] = this.buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15756);final char otherBuf[] = other.buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15757);for (int i = size - 1; (((i >= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15758)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15759)==0&false)); i--) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15760);if ((((thisBuf[i] != otherBuf[i])&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15761)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15762)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15763);return false;
            }
        }}
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15764);return true;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Checks the contents of this builder against another to see if they
     * contain the same character content.
     *
     * @param obj  the object to check, null returns false
     * @return true if the builders contain the same characters in the same order
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15765);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15766);if ((((obj instanceof StrBuilder)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15767)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15768)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15769);return equals((StrBuilder) obj);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15770);return false;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Gets a suitable hash code for this builder.
     *
     * @return a hash code
     */
    @Override
    public int hashCode() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15771);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15772);final char buf[] = buffer;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15773);int hash = 0;
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15774);for (int i = size - 1; (((i >= 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15775)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15776)==0&false)); i--) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15777);hash = 31 * hash + buf[i];
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15778);return hash;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a String version of the string builder, creating a new instance
     * each time the method is called.
     * <p>
     * Note that unlike StringBuffer, the string version returned is
     * independent of the string builder.
     *
     * @return the builder as a String
     */
    @Override
    public String toString() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15779);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15780);return new String(buffer, 0, size);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Gets a StringBuffer version of the string builder, creating a
     * new instance each time the method is called.
     *
     * @return the builder as a StringBuffer
     */
    public StringBuffer toStringBuffer() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15781);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15782);return new StringBuffer(size).append(buffer, 0, size);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Gets a StringBuilder version of the string builder, creating a
     * new instance each time the method is called.
     *
     * @return the builder as a StringBuilder
     * @since Apache Commons Lang 3.2
     */
    public StringBuilder toStringBuilder() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15783);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15784);return new StringBuilder(size).append(buffer, 0, size);
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Implement the {@link Builder} interface.
     * @return the builder as a String
     * @since Apache Commons Lang 3.2
     * @see #toString()
     */
    @Override
    public String build() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15785);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15786);return toString();
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Validates parameters defining a range of the builder.
     * 
     * @param startIndex  the start index, inclusive, must be valid
     * @param endIndex  the end index, exclusive, must be valid except
     *  that if too large it is treated as end of string
     * @return the new string
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    protected int validateRange(final int startIndex, int endIndex) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15787);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15788);if ((((startIndex < 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15789)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15790)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15791);throw new StringIndexOutOfBoundsException(startIndex);
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15792);if ((((endIndex > size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15793)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15794)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15795);endIndex = size;
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15796);if ((((startIndex > endIndex)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15797)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15798)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15799);throw new StringIndexOutOfBoundsException("end < start");
        }
        }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15800);return endIndex;
    }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    /**
     * Validates parameters defining a single index in the builder.
     * 
     * @param index  the index, must be valid
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    protected void validateIndex(final int index) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15801);
        __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15802);if ((((index < 0 || index > size)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15803)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15804)==0&false))) {{
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15805);throw new StringIndexOutOfBoundsException(index);
        }
    }}finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Inner class to allow StrBuilder to operate as a tokenizer.
     */
    class StrBuilderTokenizer extends StrTokenizer {

        /**
         * Default constructor.
         */
        StrBuilderTokenizer() {
            super();__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15807);try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15806);
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        protected List<String> tokenize(final char[] chars, final int offset, final int count) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15808);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15809);if ((((chars == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15810)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15811)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15812);return super.tokenize(StrBuilder.this.buffer, 0, StrBuilder.this.size());
            } }else {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15813);return super.tokenize(chars, offset, count);
            }
        }}finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public String getContent() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15814);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15815);final String str = super.getContent();
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15816);if ((((str == null)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15817)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15818)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15819);return StrBuilder.this.toString();
            } }else {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15820);return str;
            }
        }}finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Inner class to allow StrBuilder to operate as a writer.
     */
    class StrBuilderReader extends Reader {
        /** The current stream position. */
        private int pos;
        /** The last mark position. */
        private int mark;

        /**
         * Default constructor.
         */
        StrBuilderReader() {
            super();__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15822);try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15821);
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void close() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15823);
            // do nothing
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int read() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15824);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15825);if ((((ready() == false)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15826)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15827)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15828);return -1;
            }
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15829);return StrBuilder.this.charAt(pos++);
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public int read(final char b[], final int off, int len) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15830);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15831);if ((((off < 0 || len < 0 || off > b.length ||
                    (off + len) > b.length || (off + len) < 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15832)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15833)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15834);throw new IndexOutOfBoundsException();
            }
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15835);if ((((len == 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15836)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15837)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15838);return 0;
            }
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15839);if ((((pos >= StrBuilder.this.size())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15840)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15841)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15842);return -1;
            }
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15843);if ((((pos + len > size())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15844)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15845)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15846);len = StrBuilder.this.size() - pos;
            }
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15847);StrBuilder.this.getChars(pos, pos + len, b, off);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15848);pos += len;
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15849);return len;
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public long skip(long n) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15850);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15851);if ((((pos + n > StrBuilder.this.size())&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15852)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15853)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15854);n = StrBuilder.this.size() - pos;
            }
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15855);if ((((n < 0)&&(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15856)!=0|true))||(__CLR4_1_2b8nb8nl3lqxsn1.R.iget(15857)==0&false))) {{
                __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15858);return 0;
            }
            }__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15859);pos += n;
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15860);return n;
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public boolean ready() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15861);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15862);return pos < StrBuilder.this.size();
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public boolean markSupported() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15863);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15864);return true;
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void mark(final int readAheadLimit) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15865);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15866);mark = pos;
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void reset() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15867);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15868);pos = mark;
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    /**
     * Inner class to allow StrBuilder to operate as a writer.
     */
    class StrBuilderWriter extends Writer {

        /**
         * Default constructor.
         */
        StrBuilderWriter() {
            super();__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15870);try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15869);
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void close() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15871);
            // do nothing
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void flush() {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15872);
            // do nothing
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final int c) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15873);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15874);StrBuilder.this.append((char) c);
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final char[] cbuf) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15875);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15876);StrBuilder.this.append(cbuf);
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final char[] cbuf, final int off, final int len) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15877);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15878);StrBuilder.this.append(cbuf, off, len);
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final String str) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15879);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15880);StrBuilder.this.append(str);
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}

        /** {@inheritDoc} */
        @Override
        public void write(final String str, final int off, final int len) {try{__CLR4_1_2b8nb8nl3lqxsn1.R.inc(15881);
            __CLR4_1_2b8nb8nl3lqxsn1.R.inc(15882);StrBuilder.this.append(str, off, len);
        }finally{__CLR4_1_2b8nb8nl3lqxsn1.R.flushNeeded();}}
    }

}
