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
 * JUnit 3 testcases for org.apache.commons.compress.archivers.zip.ZipLong.
 *
 */
public class ZipLongTest extends TestCase {

    public ZipLongTest(String name) {
        super(name);
    }

    /**
     * Test conversion to bytes.
     */
public void testZipLong43() { 
     assertEquals(0, new ZipLong(0).getValue()); 
     assertEquals(1, new ZipLong(1).getValue()); 
     assertEquals(2, new ZipLong(2).getValue()); 
     assertEquals(3, new ZipLong(3).getValue()); 
     assertEquals(4, new ZipLong(4).getValue()); 
     assertEquals(5, new ZipLong(5).getValue()); 
     assertEquals(6, new ZipLong(6).getValue()); 
     assertEquals(7, new ZipLong(7).getValue()); 
     assertEquals(8, new ZipLong(8).getValue()); 
     assertEquals(9, new ZipLong(9).getValue()); 
     assertEquals(10, new ZipLong(10).getValue()); 
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
