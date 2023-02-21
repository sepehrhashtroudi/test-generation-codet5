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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Assists with the serialization process and performs additional functionality based
 * on serialization.</p>
 * <p>
 * <ul>
 * <li>Deep clone using serialization
 * <li>Serialize managing finally and IOException
 * <li>Deserialize managing finally and IOException
 * </ul>
 *
 * <p>This class throws exceptions for invalid {@code null} inputs.
 * Each method documents its behaviour in more detail.</p>
 *
 * <p>#ThreadSafe#</p>
 * @since 1.0
 * @version $Id$
 */
public class SerializationUtils {public static class __CLR4_1_248v48vl3lqxrx5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,5592,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>SerializationUtils instances should NOT be constructed in standard programming.
     * Instead, the class should be used as {@code SerializationUtils.clone(object)}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     * @since 2.0
     */
    public SerializationUtils() {
        super();__CLR4_1_248v48vl3lqxrx5.R.inc(5504);try{__CLR4_1_248v48vl3lqxrx5.R.inc(5503);
    }finally{__CLR4_1_248v48vl3lqxrx5.R.flushNeeded();}}

    // Clone
    //-----------------------------------------------------------------------
    /**
     * <p>Deep clone an {@code Object} using serialization.</p>
     *
     * <p>This is many times slower than writing clone methods by hand
     * on all objects in your object graph. However, for complex object
     * graphs, or for those that don't support deep cloning this can
     * be a simple alternative implementation. Of course all the objects
     * must be {@code Serializable}.</p>
     *
     * @param <T> the type of the object involved
     * @param object  the {@code Serializable} object to clone
     * @return the cloned object
     * @throws SerializationException (runtime) if the serialization fails
     */
    public static <T extends Serializable> T clone(final T object) {try{__CLR4_1_248v48vl3lqxrx5.R.inc(5505);
        __CLR4_1_248v48vl3lqxrx5.R.inc(5506);if ((((object == null)&&(__CLR4_1_248v48vl3lqxrx5.R.iget(5507)!=0|true))||(__CLR4_1_248v48vl3lqxrx5.R.iget(5508)==0&false))) {{
            __CLR4_1_248v48vl3lqxrx5.R.inc(5509);return null;
        }
        }__CLR4_1_248v48vl3lqxrx5.R.inc(5510);final byte[] objectData = serialize(object);
        __CLR4_1_248v48vl3lqxrx5.R.inc(5511);final ByteArrayInputStream bais = new ByteArrayInputStream(objectData);

        __CLR4_1_248v48vl3lqxrx5.R.inc(5512);ClassLoaderAwareObjectInputStream in = null;
        __CLR4_1_248v48vl3lqxrx5.R.inc(5513);try {
            // stream closed in the finally
            __CLR4_1_248v48vl3lqxrx5.R.inc(5514);in = new ClassLoaderAwareObjectInputStream(bais, object.getClass().getClassLoader());
            /*
             * when we serialize and deserialize an object,
             * it is reasonable to assume the deserialized object
             * is of the same type as the original serialized object
             */
            __CLR4_1_248v48vl3lqxrx5.R.inc(5515);@SuppressWarnings("unchecked") // see above
            final
            T readObject = (T) in.readObject();
            __CLR4_1_248v48vl3lqxrx5.R.inc(5516);return readObject;

        } catch (final ClassNotFoundException ex) {
            __CLR4_1_248v48vl3lqxrx5.R.inc(5517);throw new SerializationException("ClassNotFoundException while reading cloned object data", ex);
        } catch (final IOException ex) {
            __CLR4_1_248v48vl3lqxrx5.R.inc(5518);throw new SerializationException("IOException while reading cloned object data", ex);
        } finally {
            __CLR4_1_248v48vl3lqxrx5.R.inc(5519);try {
                __CLR4_1_248v48vl3lqxrx5.R.inc(5520);if ((((in != null)&&(__CLR4_1_248v48vl3lqxrx5.R.iget(5521)!=0|true))||(__CLR4_1_248v48vl3lqxrx5.R.iget(5522)==0&false))) {{
                    __CLR4_1_248v48vl3lqxrx5.R.inc(5523);in.close();
                }
            }} catch (final IOException ex) {
                __CLR4_1_248v48vl3lqxrx5.R.inc(5524);throw new SerializationException("IOException on closing cloned object data InputStream.", ex);
            }
        }
    }finally{__CLR4_1_248v48vl3lqxrx5.R.flushNeeded();}}

    // Serialize
    //-----------------------------------------------------------------------
    /**
     * <p>Serializes an {@code Object} to the specified stream.</p>
     *
     * <p>The stream will be closed once the object is written.
     * This avoids the need for a finally clause, and maybe also exception
     * handling, in the application code.</p>
     *
     * <p>The stream passed in is not buffered internally within this method.
     * This is the responsibility of your application if desired.</p>
     *
     * @param obj  the object to serialize to bytes, may be null
     * @param outputStream  the stream to write to, must not be null
     * @throws IllegalArgumentException if {@code outputStream} is {@code null}
     * @throws SerializationException (runtime) if the serialization fails
     */
    public static void serialize(final Serializable obj, final OutputStream outputStream) {try{__CLR4_1_248v48vl3lqxrx5.R.inc(5525);
        __CLR4_1_248v48vl3lqxrx5.R.inc(5526);if ((((outputStream == null)&&(__CLR4_1_248v48vl3lqxrx5.R.iget(5527)!=0|true))||(__CLR4_1_248v48vl3lqxrx5.R.iget(5528)==0&false))) {{
            __CLR4_1_248v48vl3lqxrx5.R.inc(5529);throw new IllegalArgumentException("The OutputStream must not be null");
        }
        }__CLR4_1_248v48vl3lqxrx5.R.inc(5530);ObjectOutputStream out = null;
        __CLR4_1_248v48vl3lqxrx5.R.inc(5531);try {
            // stream closed in the finally
            __CLR4_1_248v48vl3lqxrx5.R.inc(5532);out = new ObjectOutputStream(outputStream);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5533);out.writeObject(obj);

        } catch (final IOException ex) {
            __CLR4_1_248v48vl3lqxrx5.R.inc(5534);throw new SerializationException(ex);
        } finally {
            __CLR4_1_248v48vl3lqxrx5.R.inc(5535);try {
                __CLR4_1_248v48vl3lqxrx5.R.inc(5536);if ((((out != null)&&(__CLR4_1_248v48vl3lqxrx5.R.iget(5537)!=0|true))||(__CLR4_1_248v48vl3lqxrx5.R.iget(5538)==0&false))) {{
                    __CLR4_1_248v48vl3lqxrx5.R.inc(5539);out.close();
                }
            }} catch (final IOException ex) { // NOPMD
                // ignore close exception
            }
        }
    }finally{__CLR4_1_248v48vl3lqxrx5.R.flushNeeded();}}

    /**
     * <p>Serializes an {@code Object} to a byte array for
     * storage/serialization.</p>
     *
     * @param obj  the object to serialize to bytes
     * @return a byte[] with the converted Serializable
     * @throws SerializationException (runtime) if the serialization fails
     */
    public static byte[] serialize(final Serializable obj) {try{__CLR4_1_248v48vl3lqxrx5.R.inc(5540);
        __CLR4_1_248v48vl3lqxrx5.R.inc(5541);final ByteArrayOutputStream baos = new ByteArrayOutputStream(512);
        __CLR4_1_248v48vl3lqxrx5.R.inc(5542);serialize(obj, baos);
        __CLR4_1_248v48vl3lqxrx5.R.inc(5543);return baos.toByteArray();
    }finally{__CLR4_1_248v48vl3lqxrx5.R.flushNeeded();}}

    // Deserialize
    //-----------------------------------------------------------------------
    /**
     * <p>
     * Deserializes an {@code Object} from the specified stream.
     * </p>
     * 
     * <p>
     * The stream will be closed once the object is written. This avoids the need for a finally clause, and maybe also
     * exception handling, in the application code.
     * </p>
     * 
     * <p>
     * The stream passed in is not buffered internally within this method. This is the responsibility of your
     * application if desired.
     * </p>
     * 
     * <p>
     * If the call site incorrectly types the return value, a {@link ClassCastException} is thrown from the call site.
     * Without Generics in this declaration, the call site must type cast and can cause the same ClassCastException.
     * Note that in both cases, the ClassCastException is in the call site, not in this method.
     * </p>
     *
     * @param <T>  the object type to be deserialized
     * @param inputStream
     *            the serialized object input stream, must not be null
     * @return the deserialized object
     * @throws IllegalArgumentException
     *             if {@code inputStream} is {@code null}
     * @throws SerializationException
     *             (runtime) if the serialization fails
     */
    public static <T> T deserialize(final InputStream inputStream) {try{__CLR4_1_248v48vl3lqxrx5.R.inc(5544);
        __CLR4_1_248v48vl3lqxrx5.R.inc(5545);if ((((inputStream == null)&&(__CLR4_1_248v48vl3lqxrx5.R.iget(5546)!=0|true))||(__CLR4_1_248v48vl3lqxrx5.R.iget(5547)==0&false))) {{
            __CLR4_1_248v48vl3lqxrx5.R.inc(5548);throw new IllegalArgumentException("The InputStream must not be null");
        }
        }__CLR4_1_248v48vl3lqxrx5.R.inc(5549);ObjectInputStream in = null;
        __CLR4_1_248v48vl3lqxrx5.R.inc(5550);try {
            // stream closed in the finally
            __CLR4_1_248v48vl3lqxrx5.R.inc(5551);in = new ObjectInputStream(inputStream);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5552);@SuppressWarnings("unchecked") // may fail with CCE if serialised form is incorrect
            final T obj = (T) in.readObject();
            __CLR4_1_248v48vl3lqxrx5.R.inc(5553);return obj;

        } catch (final ClassCastException ex) {
            __CLR4_1_248v48vl3lqxrx5.R.inc(5554);throw new SerializationException(ex);
        } catch (final ClassNotFoundException ex) {
            __CLR4_1_248v48vl3lqxrx5.R.inc(5555);throw new SerializationException(ex);
        } catch (final IOException ex) {
            __CLR4_1_248v48vl3lqxrx5.R.inc(5556);throw new SerializationException(ex);
        } finally {
            __CLR4_1_248v48vl3lqxrx5.R.inc(5557);try {
                __CLR4_1_248v48vl3lqxrx5.R.inc(5558);if ((((in != null)&&(__CLR4_1_248v48vl3lqxrx5.R.iget(5559)!=0|true))||(__CLR4_1_248v48vl3lqxrx5.R.iget(5560)==0&false))) {{
                    __CLR4_1_248v48vl3lqxrx5.R.inc(5561);in.close();
                }
            }} catch (final IOException ex) { // NOPMD
                // ignore close exception
            }
        }
    }finally{__CLR4_1_248v48vl3lqxrx5.R.flushNeeded();}}

    /**
     * <p>
     * Deserializes a single {@code Object} from an array of bytes.
     * </p>
     * 
     * <p>
     * If the call site incorrectly types the return value, a {@link ClassCastException} is thrown from the call site.
     * Without Generics in this declaration, the call site must type cast and can cause the same ClassCastException.
     * Note that in both cases, the ClassCastException is in the call site, not in this method.
     * </p>
     * 
     * @param <T>  the object type to be deserialized
     * @param objectData
     *            the serialized object, must not be null
     * @return the deserialized object
     * @throws IllegalArgumentException
     *             if {@code objectData} is {@code null}
     * @throws SerializationException
     *             (runtime) if the serialization fails
     */
    public static <T> T deserialize(final byte[] objectData) {try{__CLR4_1_248v48vl3lqxrx5.R.inc(5562);
        __CLR4_1_248v48vl3lqxrx5.R.inc(5563);if ((((objectData == null)&&(__CLR4_1_248v48vl3lqxrx5.R.iget(5564)!=0|true))||(__CLR4_1_248v48vl3lqxrx5.R.iget(5565)==0&false))) {{
            __CLR4_1_248v48vl3lqxrx5.R.inc(5566);throw new IllegalArgumentException("The byte[] must not be null");
        }
        }__CLR4_1_248v48vl3lqxrx5.R.inc(5567);return SerializationUtils.<T>deserialize(new ByteArrayInputStream(objectData));
    }finally{__CLR4_1_248v48vl3lqxrx5.R.flushNeeded();}}

    /**
     * <p>Custom specialization of the standard JDK {@link java.io.ObjectInputStream}
     * that uses a custom  <code>ClassLoader</code> to resolve a class.
     * If the specified <code>ClassLoader</code> is not able to resolve the class,
     * the context classloader of the current thread will be used.
     * This way, the standard deserialization work also in web-application
     * containers and application servers, no matter in which of the
     * <code>ClassLoader</code> the particular class that encapsulates
     * serialization/deserialization lives. </p>
     * 
     * <p>For more in-depth information about the problem for which this
     * class here is a workaround, see the JIRA issue LANG-626. </p>
     */
     static class ClassLoaderAwareObjectInputStream extends ObjectInputStream {
        private static final Map<String, Class<?>> primitiveTypes = 
                new HashMap<String, Class<?>>();
        private final ClassLoader classLoader;
        
        /**
         * Constructor.
         * @param in The <code>InputStream</code>.
         * @param classLoader classloader to use
         * @throws IOException if an I/O error occurs while reading stream header.
         * @see java.io.ObjectInputStream
         */
        public ClassLoaderAwareObjectInputStream(final InputStream in, final ClassLoader classLoader) throws IOException {
            super(in);__CLR4_1_248v48vl3lqxrx5.R.inc(5569);try{__CLR4_1_248v48vl3lqxrx5.R.inc(5568);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5570);this.classLoader = classLoader;

            __CLR4_1_248v48vl3lqxrx5.R.inc(5571);primitiveTypes.put("byte", byte.class);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5572);primitiveTypes.put("short", short.class);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5573);primitiveTypes.put("int", int.class);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5574);primitiveTypes.put("long", long.class);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5575);primitiveTypes.put("float", float.class);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5576);primitiveTypes.put("double", double.class);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5577);primitiveTypes.put("boolean", boolean.class);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5578);primitiveTypes.put("char", char.class);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5579);primitiveTypes.put("void", void.class);
        }finally{__CLR4_1_248v48vl3lqxrx5.R.flushNeeded();}}

        /**
         * Overriden version that uses the parametrized <code>ClassLoader</code> or the <code>ClassLoader</code>
         * of the current <code>Thread</code> to resolve the class.
         * @param desc An instance of class <code>ObjectStreamClass</code>.
         * @return A <code>Class</code> object corresponding to <code>desc</code>.
         * @throws IOException Any of the usual Input/Output exceptions.
         * @throws ClassNotFoundException If class of a serialized object cannot be found.
         */
        @Override
        protected Class<?> resolveClass(final ObjectStreamClass desc) throws IOException, ClassNotFoundException {try{__CLR4_1_248v48vl3lqxrx5.R.inc(5580);
            __CLR4_1_248v48vl3lqxrx5.R.inc(5581);final String name = desc.getName();
            __CLR4_1_248v48vl3lqxrx5.R.inc(5582);try {
                __CLR4_1_248v48vl3lqxrx5.R.inc(5583);return Class.forName(name, false, classLoader);
            } catch (final ClassNotFoundException ex) {
                __CLR4_1_248v48vl3lqxrx5.R.inc(5584);try {
                    __CLR4_1_248v48vl3lqxrx5.R.inc(5585);return Class.forName(name, false, Thread.currentThread().getContextClassLoader());
                } catch (final ClassNotFoundException cnfe) {
                    __CLR4_1_248v48vl3lqxrx5.R.inc(5586);final Class<?> cls = primitiveTypes.get(name);
                    __CLR4_1_248v48vl3lqxrx5.R.inc(5587);if ((((cls != null)&&(__CLR4_1_248v48vl3lqxrx5.R.iget(5588)!=0|true))||(__CLR4_1_248v48vl3lqxrx5.R.iget(5589)==0&false))) {{
                        __CLR4_1_248v48vl3lqxrx5.R.inc(5590);return cls;
                    } }else {{
                        __CLR4_1_248v48vl3lqxrx5.R.inc(5591);throw cnfe;
                    }
                }}
            }
        }finally{__CLR4_1_248v48vl3lqxrx5.R.flushNeeded();}}

    }

}
