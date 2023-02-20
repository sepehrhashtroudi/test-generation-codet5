/*
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


package org.apache.commons.codec.net;

import junit.framework.TestCase;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/**
 * Quoted-printable codec test cases
 * 
 * @author <a href="mailto:oleg@ural.ru">Oleg Kalnichevski</a>
 * @version $Id$
 */
public class QCodecTest extends TestCase {
    
    static final int SWISS_GERMAN_STUFF_UNICODE [] = {
        0x47, 0x72, 0xFC, 0x65, 0x7A, 0x69, 0x5F, 0x7A, 0xE4, 0x6D, 0xE4
    };
    
    static final int RUSSIAN_STUFF_UNICODE [] = {
        0x412, 0x441, 0x435, 0x43C, 0x5F, 0x43F, 0x440, 0x438, 
        0x432, 0x435, 0x442 
    }; 

    public QCodecTest(String name) {
        super(name);
    }

    private String constructString(int [] unicodeChars) {
        StringBuffer buffer = new StringBuffer();
        if (unicodeChars != null) {
            for (int i = 0; i < unicodeChars.length; i++) {
                buffer.append((char)unicodeChars[i]); 
            }
        }
        return buffer.toString();
    }


public void testBasicEncodeDecode1() throws Exception { 
     QCodec qcodec = new QCodec(); 
     String plain = "= Hello there =\r\n"; 
     String encoded = qcodec.encode(plain); 
     assertEquals("Basic Q encoding test", "=?UTF-8?Q?=3D Hello there =3D=0D=0A?=", encoded); 
     assertEquals("Basic Q decoding test", plain, qcodec.decode(encoded)); 
 } 


public void testDecodeObjects13() throws Exception { 
     QCodec qcodec = new QCodec(); 
     String decoded = "=?UTF-8?Q?1+1 =3D 2?="; 
     String plain = (String) qcodec.decode((Object) decoded); 
     assertEquals("Basic Q decoding test", "1+1 = 2", plain); 
     Object result = qcodec.decode((Object) null); 
     assertEquals("Decoding a null Object should return null", null, result); 
     try { 
         Object dObj = new Double(3.0); 
         qcodec.decode(dObj); 
         fail("Trying to url encode a Double object should cause an exception."); 
     } catch (DecoderException ee) { 
     } 
 } 


public void testInvalidEncoding28() { 
     QCodec qcodec = new QCodec("NONSENSE"); 
     try { 
         qcodec.encode("Hello there!"); 
         fail("We set the encoding to a bogus NONSENSE vlaue, this shouldn't have worked."); 
     } catch (EncoderException ee) { 
     } 
     try { 
         qcodec.decode("=?NONSENSE?Q?Hello there!?="); 
         fail("We set the encoding to a bogus NONSENSE vlaue, this shouldn't have worked."); 
     } catch (DecoderException ee) { 
     } 
 } 


public void testEncodeDecodeNull30() throws Exception { 
     QCodec qcodec = new QCodec(); 
     assertNull("Null string Q encoding test", qcodec.encode((String) null)); 
     assertNull("Null string Q decoding test", qcodec.decode((String) null)); 
 } 


public void testEncodeObjects36() throws Exception { 
     QCodec qcodec = new QCodec(); 
     String plain = "1+1 = 2"; 
     String encoded = (String) qcodec.encode((Object) plain); 
     assertEquals("Basic Q encoding test", "=?UTF-8?Q?1+1 =3D 2?=", encoded); 
     Object result = qcodec.encode((Object) null); 
     assertEquals("Encoding a null Object should return null", null, result); 
     try { 
         Object dObj = new Double(3.0); 
         qcodec.encode(dObj); 
         fail("Trying to url encode a Double object should cause an exception."); 
     } catch (EncoderException ee) { 
     } 
 } 


public void testLetUsMakeCloverHappy68() throws Exception { 
     QCodec qcodec = new QCodec(); 
     qcodec.setEncodeBlanks(true); 
     assertTrue(qcodec.isEncodeBlanks()); 
     qcodec.setEncodeBlanks(false); 
     assertFalse(qcodec.isEncodeBlanks()); 
 } 


public void testEncodeDecodeBlanks81() throws Exception { 
     String plain = "Mind those pesky blanks"; 
     String encoded1 = "=?UTF-8?Q?Mind those pesky blanks?="; 
     String encoded2 = "=?UTF-8?Q?Mind_those_pesky_blanks?="; 
     QCodec qcodec = new QCodec(); 
     qcodec.setEncodeBlanks(false); 
     String s = qcodec.encode(plain); 
     assertEquals("Blanks encoding with the Q codec test", encoded1, s); 
     qcodec.setEncodeBlanks(true); 
     s = qcodec.encode(plain); 
     assertEquals("Blanks encoding with the Q codec test", encoded2, s); 
     s = qcodec.decode(encoded1); 
     assertEquals("Blanks decoding with the Q codec test", plain, s); 
     s = qcodec.decode(encoded2); 
     assertEquals("Blanks decoding with the Q codec test", plain, s); 
 } 


public void testNullInput91() throws Exception { 
     QCodec qcodec = new QCodec(); 
     assertNull(qcodec.doDecoding(null)); 
     assertNull(qcodec.doEncoding(null)); 
 } 


public void testDecodeStringWithNull100() throws Exception { 
     QCodec qcodec = new QCodec(); 
     String test = null; 
     String result = qcodec.decode(test); 
     assertEquals("Result should be null", null, result); 
 } 


public void testEncodeStringWithNull122() throws Exception { 
     QCodec qcodec = new QCodec(); 
     String test = null; 
     String result = qcodec.encode(test, "charset"); 
     assertEquals("Result should be null", null, result); 
 } 

    

    


    

    

    

    

    
    

    
    

    

    


    


    

}
