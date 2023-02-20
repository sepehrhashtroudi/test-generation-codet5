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

package org.apache.commons.codec.digest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests DigestUtils methods.
 * 
 * @author Apache Software Foundation
 * @version $Id$
 */
public class DigestUtilsTest extends TestCase {

    private byte[] testData = new byte[1024*1024];
    
    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        new Random().nextBytes(testData);
    }


public void testSha38418() throws IOException { 
     assertEquals("cb00753f45a35e8bb5a03d699ac65007272c32ab0eded1631a8b605a43ff5bed" + "8086072ba1e7cc2358baeca134c825a7", DigestUtils.sha384Hex("abc")); 
     assertEquals("cb00753f45a35e8bb5a03d699ac65007272c32ab0eded1631a8b605a43ff5bed" + "8086072ba1e7cc2358baeca134c825a7", DigestUtils.sha384Hex("abc".getBytes())); 
     assertEquals("09330c33f71147e83d192fc782cd1b4753111b173b3b05d22fa08086e3b0f712" + "fcc7c71a557e2db966c3e9fa91746039", DigestUtils.sha384Hex("abcdefghbcdefghicdefghijdefghijkefghijklfghijklmghijklmn" + "hijklmnoijklmnopjklmnopqklmnopqrlmnopqrsmnopqrstnopqrstu")); 
     assertEquals(DigestUtils.sha384Hex(testData), DigestUtils.sha384Hex(new ByteArrayInputStream(testData))); 
 } 


public void testShaHex29() throws IOException { 
     assertEquals("a9993e364706816aba3e25717850c26c9cd0d89d", DigestUtils.shaHex("abc")); 
     assertEquals("a9993e364706816aba3e25717850c26c9cd0d89d", DigestUtils.shaHex("abc".getBytes())); 
     assertEquals("84983e441c3bd26ebaae4aa1f95129e5e54670f1", DigestUtils.shaHex("abcdbcdecdefdefgefghfghighij" + "hijkijkljklmklmnlmnomnopnopq")); 
     assertEquals(DigestUtils.shaHex(testData), DigestUtils.shaHex(new ByteArrayInputStream(testData))); 
 } 


public void testMD5HexLength39() { 
     String hashMe = "this is some string that is longer than 32 characters"; 
     String hash = DigestUtils.md5Hex(hashMe.getBytes()); 
     assertEquals(32, hash.length()); 
     hashMe = "length < 32"; 
     hash = DigestUtils.md5Hex(hashMe.getBytes()); 
     assertEquals(32, hash.length()); 
 } 


public void testSha25658() throws IOException { 
     assertEquals("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad", DigestUtils.sha256Hex("abc")); 
     assertEquals("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad", DigestUtils.sha256Hex("abc".getBytes())); 
     assertEquals("248d6a61d20638b8e5c026930c3e6039a33ce45964ff2167f6ecedd419db06c1", DigestUtils.sha256Hex("abcdbcdecdefdefgefghfghighijhijkijkljklmklmnlmnomnopnopq")); 
     assertEquals(DigestUtils.sha256Hex(testData), DigestUtils.sha256Hex(new ByteArrayInputStream(testData))); 
 } 


public void testMd5Hex80() throws IOException { 
     assertEquals("d41d8cd98f00b204e9800998ecf8427e", DigestUtils.md5Hex("")); 
     assertEquals("0cc175b9c0f1b6a831c399e269772661", DigestUtils.md5Hex("a")); 
     assertEquals("900150983cd24fb0d6963f7d28e17f72", DigestUtils.md5Hex("abc")); 
     assertEquals("f96b697d7cb7938d525a2f31aaf161d0", DigestUtils.md5Hex("message digest")); 
     assertEquals("c3fcd3d76192e4007dfb496cca67e13b", DigestUtils.md5Hex("abcdefghijklmnopqrstuvwxyz")); 
     assertEquals("d174ab98d277d9f5a5611c2c9f419d9f", DigestUtils.md5Hex("ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789")); 
     assertEquals("57edf4a22be3c955ac49da2e2107b67a", DigestUtils.md5Hex("1234567890123456789012345678901234567890" + "1234567890123456789012345678901234567890")); 
     assertEquals(DigestUtils.md5Hex(testData), DigestUtils.md5Hex(new ByteArrayInputStream(testData))); 
 } 


public void testInternalNoSuchAlgorithmException99() { 
     try { 
         DigestUtils.getDigest("Bogus Bogus"); 
         fail("A RuntimeException should have been thrown."); 
     } catch (RuntimeException e) { 
     } 
 } 

    

    
    
    /**
	 * An MD5 hash converted to hex should always be 32 characters.
	 */
    

    /**
	 * An MD5 hash should always be a 16 element byte[].
	 */
    

    

        

    

        
}
