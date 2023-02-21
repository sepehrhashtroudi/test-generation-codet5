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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.SerializationUtils}.
 *
 * @version $Id$
 */
public class SerializationUtilsTest {static class __CLR4_1_2ko6ko6l3lqxtyf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,27014,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  static final String CLASS_NOT_FOUND_MESSAGE = "ClassNotFoundSerialization.readObject fake exception";
    protected static final String SERIALIZE_IO_EXCEPTION_MESSAGE = "Anonymous OutputStream I/O exception";
  
    private String iString;
    private Integer iInteger;
    private HashMap<Object, Object> iMap;

    @Before
    public void setUp() {try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26790);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26791);iString = "foo";
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26792);iInteger = Integer.valueOf(7);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26793);iMap = new HashMap<Object, Object>();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26794);iMap.put("FOO", iString);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26795);iMap.put("BAR", iInteger);
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testConstructor() {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hkoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26796,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hkoc(){try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26796);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26797);assertNotNull(new SerializationUtils());
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26798);final Constructor<?>[] cons = SerializationUtils.class.getDeclaredConstructors();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26799);assertEquals(1, cons.length);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26800);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26801);assertTrue(Modifier.isPublic(SerializationUtils.class.getModifiers()));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26802);assertFalse(Modifier.isFinal(SerializationUtils.class.getModifiers()));
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}
    
    @Test
    public void testException() {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22aalq4koj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26803,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22aalq4koj(){try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26803);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26804);SerializationException serEx;
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26805);final Exception ex = new Exception();
        
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26806);serEx = new SerializationException();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26807);assertSame(null, serEx.getMessage());
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26808);assertSame(null, serEx.getCause());
        
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26809);serEx = new SerializationException("Message");
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26810);assertSame("Message", serEx.getMessage());
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26811);assertSame(null, serEx.getCause());
        
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26812);serEx = new SerializationException(ex);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26813);assertEquals("java.lang.Exception", serEx.getMessage());
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26814);assertSame(ex, serEx.getCause());
        
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26815);serEx = new SerializationException("Message", ex);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26816);assertSame("Message", serEx.getMessage());
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26817);assertSame(ex, serEx.getCause());
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------

    @Test
    public void testSerializeStream() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24vpsyzkoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeStream",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26818,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24vpsyzkoy() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26818);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26819);final ByteArrayOutputStream streamTest = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26820);SerializationUtils.serialize(iMap, streamTest);

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26821);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26822);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26823);oos.writeObject(iMap);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26824);oos.flush();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26825);oos.close();

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26826);final byte[] testBytes = streamTest.toByteArray();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26827);final byte[] realBytes = streamReal.toByteArray();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26828);assertEquals(testBytes.length, realBytes.length);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26829);for (int i = 0; (((i < realBytes.length)&&(__CLR4_1_2ko6ko6l3lqxtyf.R.iget(26830)!=0|true))||(__CLR4_1_2ko6ko6l3lqxtyf.R.iget(26831)==0&false)); i++) {{
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26832);assertEquals(realBytes[i], testBytes[i]);
        }
    }}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testSerializeStreamUnserializable() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22evm0jkpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamUnserializable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26833,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22evm0jkpd() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26833);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26834);final ByteArrayOutputStream streamTest = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26835);try {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26836);iMap.put(new Object(), new Object());
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26837);SerializationUtils.serialize(iMap, streamTest);
        } catch (final SerializationException ex) {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26838);return;
        }
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26839);fail();
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testSerializeStreamNullObj() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2irtz7tkpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamNullObj",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26840,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2irtz7tkpk() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26840);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26841);final ByteArrayOutputStream streamTest = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26842);SerializationUtils.serialize(null, streamTest);

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26843);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26844);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26845);oos.writeObject(null);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26846);oos.flush();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26847);oos.close();

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26848);final byte[] testBytes = streamTest.toByteArray();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26849);final byte[] realBytes = streamReal.toByteArray();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26850);assertEquals(testBytes.length, realBytes.length);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26851);for (int i = 0; (((i < realBytes.length)&&(__CLR4_1_2ko6ko6l3lqxtyf.R.iget(26852)!=0|true))||(__CLR4_1_2ko6ko6l3lqxtyf.R.iget(26853)==0&false)); i++) {{
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26854);assertEquals(realBytes[i], testBytes[i]);
        }
    }}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testSerializeStreamObjNull() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_271v11lkpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamObjNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26855,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_271v11lkpz() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26855);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26856);try {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26857);SerializationUtils.serialize(iMap, null);
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26858);return;
        }
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26859);fail();
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testSerializeStreamNullNull() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p3b00tkq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamNullNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26860,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p3b00tkq4() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26860);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26861);try {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26862);SerializationUtils.serialize(null, null);
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26863);return;
        }
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26864);fail();
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}
    
    @Test
    public void testSerializeIOException() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ufu7pakq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeIOException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26865,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ufu7pakq9() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26865);
        // forces an IOException when the ObjectOutputStream is created, to test not closing the stream
        // in the finally block
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26866);final OutputStream streamTest = new OutputStream() {
            @Override
            public void write(final int arg0) throws IOException {try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26867);
                __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26868);throw new IOException(SERIALIZE_IO_EXCEPTION_MESSAGE);
            }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}
        };
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26869);try {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26870);SerializationUtils.serialize(iMap, streamTest);
        }
        catch(final SerializationException e) {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26871);assertEquals("java.io.IOException: " + SERIALIZE_IO_EXCEPTION_MESSAGE, e.getMessage());
        }
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testDeserializeStream() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2z12710kqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStream",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26872,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2z12710kqg() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26872);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26873);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26874);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26875);oos.writeObject(iMap);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26876);oos.flush();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26877);oos.close();

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26878);final ByteArrayInputStream inTest = new ByteArrayInputStream(streamReal.toByteArray());
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26879);final Object test = SerializationUtils.deserialize(inTest);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26880);assertNotNull(test);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26881);assertTrue(test instanceof HashMap<?, ?>);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26882);assertTrue(test != iMap);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26883);final HashMap<?, ?> testMap = (HashMap<?, ?>) test;
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26884);assertEquals(iString, testMap.get("FOO"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26885);assertTrue(iString != testMap.get("FOO"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26886);assertEquals(iInteger, testMap.get("BAR"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26887);assertTrue(iInteger != testMap.get("BAR"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26888);assertEquals(iMap, testMap);
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test(expected=ClassCastException.class)
    public void testDeserializeClassCastException() {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c6r838kqx();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,101,115,101,114,105,97,108,105,122,101,67,108,97,115,115,67,97,115,116,69,120,99,101,112,116,105,111,110,58,32,91,67,108,97,115,115,67,97,115,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ClassCastException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeClassCastException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26889,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c6r838kqx(){try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26889);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26890);final String value = "Hello";
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26891);final byte[] serialized = SerializationUtils.serialize(value);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26892);Assert.assertEquals(value, SerializationUtils.deserialize(serialized));
        // Causes ClassCastException in call site, not in SerializationUtils.deserialize
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26893);@SuppressWarnings("unused") // needed to cause Exception
        final Integer i = SerializationUtils.deserialize(serialized);
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testDeserializeStreamOfNull() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ajfbdakr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamOfNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26894,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ajfbdakr2() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26894);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26895);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26896);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26897);oos.writeObject(null);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26898);oos.flush();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26899);oos.close();

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26900);final ByteArrayInputStream inTest = new ByteArrayInputStream(streamReal.toByteArray());
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26901);final Object test = SerializationUtils.deserialize(inTest);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26902);assertNull(test);
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testDeserializeStreamNull() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tmrvs5krb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26903,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tmrvs5krb() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26903);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26904);try {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26905);SerializationUtils.deserialize((InputStream) null);
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26906);return;
        }
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26907);fail();
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testDeserializeStreamBadStream() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26clkqnkrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamBadStream",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26908,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26clkqnkrg() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26908);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26909);try {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26910);SerializationUtils.deserialize(new ByteArrayInputStream(new byte[0]));
        } catch (final SerializationException ex) {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26911);return;
        }
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26912);fail();
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testDeserializeStreamClassNotFound() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fgbu5bkrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamClassNotFound",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26913,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fgbu5bkrl() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26913);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26914);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26915);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26916);oos.writeObject(new ClassNotFoundSerialization());
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26917);oos.flush();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26918);oos.close();

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26919);final ByteArrayInputStream inTest = new ByteArrayInputStream(streamReal.toByteArray());
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26920);try {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26921);@SuppressWarnings("unused")
            final
            Object test = SerializationUtils.deserialize(inTest);
        } catch(final SerializationException se) {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26922);assertEquals("java.lang.ClassNotFoundException: " + CLASS_NOT_FOUND_MESSAGE, se.getMessage());
        }
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------

    @Test
    public void testSerializeBytes() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ov75twkrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytes",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26923,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ov75twkrv() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26923);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26924);final byte[] testBytes = SerializationUtils.serialize(iMap);

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26925);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26926);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26927);oos.writeObject(iMap);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26928);oos.flush();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26929);oos.close();

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26930);final byte[] realBytes = streamReal.toByteArray();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26931);assertEquals(testBytes.length, realBytes.length);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26932);for (int i = 0; (((i < realBytes.length)&&(__CLR4_1_2ko6ko6l3lqxtyf.R.iget(26933)!=0|true))||(__CLR4_1_2ko6ko6l3lqxtyf.R.iget(26934)==0&false)); i++) {{
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26935);assertEquals(realBytes[i], testBytes[i]);
        }
    }}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testSerializeBytesUnserializable() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x6yz7gks8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesUnserializable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26936,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x6yz7gks8() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26936);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26937);try {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26938);iMap.put(new Object(), new Object());
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26939);SerializationUtils.serialize(iMap);
        } catch (final SerializationException ex) {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26940);return;
        }
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26941);fail();
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testSerializeBytesNull() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mqdf91kse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26942,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mqdf91kse() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26942);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26943);final byte[] testBytes = SerializationUtils.serialize(null);

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26944);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26945);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26946);oos.writeObject(null);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26947);oos.flush();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26948);oos.close();

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26949);final byte[] realBytes = streamReal.toByteArray();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26950);assertEquals(testBytes.length, realBytes.length);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26951);for (int i = 0; (((i < realBytes.length)&&(__CLR4_1_2ko6ko6l3lqxtyf.R.iget(26952)!=0|true))||(__CLR4_1_2ko6ko6l3lqxtyf.R.iget(26953)==0&false)); i++) {{
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26954);assertEquals(realBytes[i], testBytes[i]);
        }
    }}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testDeserializeBytes() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zbhvmtksr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytes",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26955,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zbhvmtksr() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26955);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26956);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26957);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26958);oos.writeObject(iMap);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26959);oos.flush();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26960);oos.close();

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26961);final Object test = SerializationUtils.deserialize(streamReal.toByteArray());
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26962);assertNotNull(test);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26963);assertTrue(test instanceof HashMap<?, ?>);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26964);assertTrue(test != iMap);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26965);final HashMap<?, ?> testMap = (HashMap<?, ?>) test;
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26966);assertEquals(iString, testMap.get("FOO"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26967);assertTrue(iString != testMap.get("FOO"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26968);assertEquals(iInteger, testMap.get("BAR"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26969);assertTrue(iInteger != testMap.get("BAR"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26970);assertEquals(iMap, testMap);
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testDeserializeBytesOfNull() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ke4tz1kt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesOfNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ke4tz1kt7() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26971);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26972);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26973);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26974);oos.writeObject(null);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26975);oos.flush();
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26976);oos.close();

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26977);final Object test = SerializationUtils.deserialize(streamReal.toByteArray());
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26978);assertNull(test);
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testDeserializeBytesNull() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zh3j1oktf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26979,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zh3j1oktf() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26979);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26980);try {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26981);SerializationUtils.deserialize((byte[]) null);
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26982);return;
        }
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26983);fail();
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testDeserializeBytesBadStream() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pbu60iktk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesBadStream",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26984,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pbu60iktk() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26984);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26985);try {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26986);SerializationUtils.deserialize(new byte[0]);
        } catch (final SerializationException ex) {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26987);return;
        }
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26988);fail();
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testClone() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),26989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2csyejyktp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testClone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26989,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2csyejyktp() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(26989);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26990);final Object test = SerializationUtils.clone(iMap);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26991);assertNotNull(test);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26992);assertTrue(test instanceof HashMap<?,?>);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26993);assertTrue(test != iMap);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26994);final HashMap<?, ?> testMap = (HashMap<?, ?>) test;
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26995);assertEquals(iString, testMap.get("FOO"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26996);assertTrue(iString != testMap.get("FOO"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26997);assertEquals(iInteger, testMap.get("BAR"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26998);assertTrue(iInteger != testMap.get("BAR"));
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(26999);assertEquals(iMap, testMap);
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testCloneNull() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),27000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_239os87ku0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testCloneNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27000,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_239os87ku0() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(27000);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(27001);final Object test = SerializationUtils.clone(null);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(27002);assertNull(test);
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

    @Test
    public void testCloneUnserializable() throws Exception {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),27003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w0blmeku3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testCloneUnserializable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27003,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w0blmeku3() throws Exception{try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(27003);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(27004);try {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(27005);iMap.put(new Object(), new Object());
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(27006);SerializationUtils.clone(iMap);
        } catch (final SerializationException ex) {
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(27007);return;
        }
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(27008);fail();
    }finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}
    
    @Test
    public void testPrimitiveTypeClassSerialization() {__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceStart(getClass().getName(),27009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2miwbceku9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ko6ko6l3lqxtyf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testPrimitiveTypeClassSerialization",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27009,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2miwbceku9(){try{__CLR4_1_2ko6ko6l3lqxtyf.R.inc(27009);
        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(27010);final Class<?>[] primitiveTypes = { byte.class, short.class, int.class, long.class, float.class, double.class,
                boolean.class, char.class, void.class };

        __CLR4_1_2ko6ko6l3lqxtyf.R.inc(27011);for (final Class<?> primitiveType : primitiveTypes) {{
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(27012);final Class<?> clone = SerializationUtils.clone(primitiveType);
            __CLR4_1_2ko6ko6l3lqxtyf.R.inc(27013);assertEquals(primitiveType, clone);
        }
    }}finally{__CLR4_1_2ko6ko6l3lqxtyf.R.flushNeeded();}}

}

@SuppressWarnings("serial")
class ClassNotFoundSerialization implements Serializable
{public static class __CLR4_1_2ko6kuel3lqxtyf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,27016,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private void readObject(final ObjectInputStream in) throws ClassNotFoundException    {try{__CLR4_1_2ko6kuel3lqxtyf.R.inc(27014);
        __CLR4_1_2ko6kuel3lqxtyf.R.inc(27015);throw new ClassNotFoundException(SerializationUtilsTest.CLASS_NOT_FOUND_MESSAGE);
    }finally{__CLR4_1_2ko6kuel3lqxtyf.R.flushNeeded();}}
}
