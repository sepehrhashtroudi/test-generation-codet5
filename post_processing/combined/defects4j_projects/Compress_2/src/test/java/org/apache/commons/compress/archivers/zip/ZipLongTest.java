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
public void testEquals3() { 
     ZipLong zl = new ZipLong(0x12345678); 
     ZipLong zl2 = new ZipLong(0x12345678); 
     ZipLong zl3 = new ZipLong(0x87654321); 
     assertTrue("reflexive", zl.equals(zl)); 
     assertTrue("works", zl.equals(zl2)); 
     assertTrue("works, part two", !zl.equals(zl3)); 
     assertTrue("symmetric", zl2.equals(zl)); 
     assertTrue("null handling", !zl.equals(null)); 
 }
public void testEquals4() { 
     ZipLong zl = new ZipLong(0x12345678); 
     ZipLong zl2 = new ZipLong(0x12345678); 
     ZipLong zl3 = new ZipLong(0x87654321); 
     assertTrue("reflexive", zl.equals(zl)); 
     assertTrue("works", zl.equals(zl2)); 
     assertTrue("works, part two", !zl.equals(zl3)); 
     assertTrue("symmetric", zl2.equals(zl)); 
     assertTrue("null handling", !zl.equals(null)); 
     assertTrue("non ZipLong handling", !zl.equals(new Integer(0x1234))); 
 }
public void testSign5() { 
     ZipLong zl = new ZipLong(new byte[] { (byte) 0xFF, (byte) 0xFF }); 
     assertEquals(0x0000FFFF, zl.getValue()); 
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
