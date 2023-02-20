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

package org.apache.commons.codec.binary;

import java.util.Arrays;
import java.util.Random;

import junit.framework.TestCase;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/**
 * Tests {@link org.apache.commons.codec.binary.Hex}.
 * 
 * @author Apache Software Foundation
 * @version $Id$
 */

public class HexTest extends TestCase {

    public HexTest(String name) {
        super(name);
    }
    

public void testEncodeDecodeRandom8() throws DecoderException, EncoderException { 
     Random random = new Random(); 
     Hex hex = new Hex(); 
     for (int i = 5; i > 0; i--) { 
         byte[] data = new byte[random.nextInt(10000) + 1]; 
         random.nextBytes(data); 
         char[] encodedChars = Hex.encodeHex(data); 
         byte[] decodedBytes = Hex.decodeHex(encodedChars); 
         assertTrue(Arrays.equals(data, decodedBytes)); 
         byte[] encodedStringBytes = hex.encode(data); 
         decodedBytes = hex.decode(encodedStringBytes); 
         assertTrue(Arrays.equals(data, decodedBytes)); 
         String dataString = new String(encodedChars); 
         char[] encodedStringChars = (char[]) hex.encode(dataString); 
         decodedBytes = (byte[]) hex.decode(encodedStringChars); 
         assertTrue(Arrays.equals(dataString.getBytes(), decodedBytes)); 
         dataString = new String(encodedChars); 
         encodedStringChars = (char[]) hex.encode(dataString); 
         decodedBytes = (byte[]) hex.decode(new String(encodedStringChars)); 
         assertTrue(Arrays.equals(dataString.getBytes(), decodedBytes)); 
     } 
 } 


public void testHelloWorld31() { 
     byte[] b = "Hello World".getBytes(); 
     char[] c = Hex.encodeHex(b); 
     assertEquals("48656c6c6f20576f726c64", new String(c)); 
 } 


public void testEncodeClassCastException47() { 
     try { 
         new Hex().encode(new int[] { 65 }); 
         fail("An exception wasn't thrown when trying to encode."); 
     } catch (EncoderException e) { 
     } 
 } 


public void testDecodeClassCastException89() { 
     try { 
         new Hex().decode(new int[] { 65 }); 
         fail("An exception wasn't thrown when trying to decode."); 
     } catch (DecoderException e) { 
     } 
 } 


public void testDecodeArrayOddCharacters107() { 
     try { 
         new Hex().decode(new byte[] { 65 }); 
         fail("An exception wasn't thrown when trying to decode an odd number of characters"); 
     } catch (DecoderException e) { 
     } 
 } 


public void testDecodeBadCharacterPos0111() { 
     try { 
         new Hex().decode("q0"); 
         fail("An exception wasn't thrown when trying to decode an illegal character"); 
     } catch (DecoderException e) { 
     } 
 } 

    

    

    

    

    

    

    
    
    

    

    

    

    
}
