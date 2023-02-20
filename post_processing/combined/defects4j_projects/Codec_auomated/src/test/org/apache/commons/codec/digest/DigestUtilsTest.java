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

public void testSha5122() throws IOException { 
     assertEquals("cb00753f45a35e8bb5a03d699ac65007272c32ab0eded1631a8b605a43ff5bed" + "8086072ba1e7cc2358baeca134c825a7", DigestUtils.sha512Hex("abc")); 
     assertEquals("cb00753f45a35e8bb5a03d699ac65007272c32ab0eded1631a8b605a43ff5bed" + "8086072ba1e7cc2358baeca134c825a7", DigestUtils.sha512Hex("abc".getBytes())); 
     assertEquals("09330c33f71147e83d192fc782cd1b4753111b173b3b05d22fa08086e3b0f712" + "fcc7c71a557e2db966c3e9fa91746039", DigestUtils.sha512Hex("abcdefghbcdefghicdefghijdefghijkefghijklfghijklmghijklmn" + "hijklmnoijklmnopjklmnopqklmnopqrlmnopqrsmnopqrstnopqrstu")); 
     assertEquals(DigestUtils.sha512Hex(testData), DigestUtils.sha512Hex(new ByteArrayInputStream(testData))); 
 }
public void testSha51212() throws IOException { 
     assertEquals("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad", DigestUtils.sha512Hex("abc")); 
     assertEquals("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad", DigestUtils.sha512Hex("abc".getBytes())); 
     assertEquals("248d6a61d20638b8e5c026930c3e6039a33ce45964ff2167f6ecedd419db06c1", DigestUtils.sha512Hex("abcdbcdecdefdefgefghfghighijhijkijkljklmklmnlmnomnopnopq")); 
     assertEquals(DigestUtils.sha512Hex(testData), DigestUtils.sha512Hex(new ByteArrayInputStream(testData))); 
 }
    

    
    
    /**
	 * An MD5 hash converted to hex should always be 32 characters.
	 */
    

    /**
	 * An MD5 hash should always be a 16 element byte[].
	 */
    

    

        

    

        
}
