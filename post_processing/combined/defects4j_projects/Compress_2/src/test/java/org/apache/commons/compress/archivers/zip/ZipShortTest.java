/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.commons.compress.archivers.zip;

import junit.framework.TestCase;

/**
 * JUnit 3 testcases for org.apache.commons.compress.archivers.zip.ZipShort.
 *
 */
public class ZipShortTest extends TestCase {

    public ZipShortTest(String name) {
        super(name);
    }

    /**
     * Test conversion to bytes.
     */
public void testClone7() { 
     ZipShort zs = new ZipShort(0x1234); 
     ZipShort zs2 = (ZipShort) zs.clone(); 
     assertNotSame(zs, zs2); 
     assertEquals(zs, zs2); 
 }
public void testClone8() { 
     ZipShort s1 = new ZipShort(0x1234); 
     ZipShort s2 = (ZipShort) s1.clone(); 
     assertNotSame(s1, s2); 
     assertEquals(s1, s2); 
 }
    

    /**
     * Test conversion from bytes.
     */
    

    /**
     * Test the contract of the equals method.
     */
    

    /**
     * Test sign handling.
     */
    

    
}
