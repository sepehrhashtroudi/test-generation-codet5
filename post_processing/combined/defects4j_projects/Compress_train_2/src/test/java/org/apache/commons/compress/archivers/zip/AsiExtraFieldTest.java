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
 * JUnit 3 testcases for org.apache.commons.compress.archivers.zip.AsiExtraField.
 *
 */
public class AsiExtraFieldTest extends TestCase implements UnixStat {
    public AsiExtraFieldTest(String name) {
        super(name);
    }

    /**
     * Test file mode magic.
     */

public void testModes34() { 
     AsiExtraField a = new AsiExtraField(); 
     a.setMode(0123); 
     assertEquals("plain file", 0100123, a.getMode()); 
     a.setDirectory(true); 
     assertEquals("directory", 040123, a.getMode()); 
     a.setLinkedFile("test"); 
     assertEquals("symbolic link", 0120123, a.getMode()); 
 } 


public void testContent35() { 
     AsiExtraField a = new AsiExtraField(); 
     a.setMode(0123); 
     a.setUserId(5); 
     a.setGroupId(6); 
     byte[] b = a.getLocalFileDataData(); 
     byte[] expect = { (byte) 0xC6, 0x02, 0x78, (byte) 0xB6, 0123, (byte) 0x80, 0, 0, 0, 0, 5, 0, 6, 0 }; 
     assertEquals("no link", expect.length, b.length); 
     for (int i = 0; i < expect.length; i++) { 
         assertEquals("no link, byte " + i, expect[i], b[i]); 
     } 
     a.setLinkedFile("test"); 
     expect = new byte[] { 0x75, (byte) 0x8E, 0x41, (byte) 0xFD, 0123, (byte) 0xA0, 4, 0, 0, 0, 5, 0, 6, 0, (byte) 't', (byte) 'e', (byte) 's', (byte) 't' }; 
     b = a.getLocalFileDataData(); 
     assertEquals("no link", expect.length, b.length); 
     for (int i = 0; i < expect.length; i++) { 
         assertEquals("no link, byte " + i, expect[i], b[i]); 
     } 
 } 

    

    /**
     * Test content.
     */
    

    /**
     * Test reparse
     */
    

    
}
