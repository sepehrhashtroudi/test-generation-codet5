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
 * JUnit 3 testcases for org.apache.commons.compress.archivers.zip.ZipEntry.
 *
 */
public class ZipArchiveEntryTest extends TestCase {

    public ZipArchiveEntryTest(String name) {
        super(name);
    }

    /**
     * test handling of extra fields
     */
public void testExtraFieldMerging16() { 
     AsiExtraField a = new AsiExtraField(); 
     a.setDirectory(true); 
     a.setMode(0755); 
     UnrecognizedExtraField u = new UnrecognizedExtraField(); 
     u.setHeaderId(new ZipShort(1)); 
     u.setLocalFileDataData(new byte[0]); 
     ZipArchiveEntry ze = new ZipArchiveEntry("test/"); 
     ze.setExtraFields(new ZipExtraField[] { a, u }); 
     ze.setCentralDirectoryExtra(new byte[] { 1, 0, 1, 0, 127 }); 
     ZipExtraField[] result = ze.getExtraFields(); 
     assertEquals("first pass", 2, result.length); 
     assertSame(a, result[0]); 
     assertEquals(new ZipShort(1), result[1].getHeaderId()); 
     assertEquals(new ZipShort(0), result[1].getLocalFileDataLength()); 
     assertEquals(new ZipShort(1), result[1].getCentralDirectoryLength()); 
     ze.setCentralDirectoryExtra(new byte[] { 2, 0, 0, 0 }); 
     result = ze.getExtraFields(); 
     assertEquals("second pass", 3, result.length); 
     ze.setExtra(new byte[] { 2, 0, 1, 0, 127 }); 
     result = ze.getExtraFields(); 
     assertEquals("third pass", 3, result.length); 
     assertSame(a, result[0]); 
     assertEquals(new ZipShort(2), result[2].getHeaderId()); 
     assertEquals(new ZipShort(1), result[2].getLocalFileDataLength()); 
     assertEquals(new ZipShort(0), result[2].getCentralDirectoryLength()); 
 }
public void testContent19() { 
     AsiExtraField a = new AsiExtraField(); 
     a.setDirectory(true); 
     a.setMode(0755); 
     UnrecognizedExtraField u = new UnrecognizedExtraField(); 
     u.setHeaderId(new ZipShort(1)); 
     u.setLocalFileDataData(new byte[0]); 
     ZipArchiveEntry ze = new ZipArchiveEntry("test/"); 
     ze.setExtraFields(new ZipExtraField[] { a, u }); 
     ze.setCentralDirectoryExtra(new byte[] { 1, 0, 1, 0, 127 }); 
     ZipExtraField[] result = ze.getExtraFields(); 
     assertEquals("first pass", 2, result.length); 
     assertSame(a, result[0]); 
     assertEquals(new ZipShort(1), result[1].getHeaderId()); 
     assertEquals(new ZipShort(0), result[1].getLocalFileDataLength()); 
     assertEquals(new ZipShort(1), result[1].getCentralDirectoryLength()); 
     ze.setCentralDirectoryExtra(new byte[] { 2, 0, 0, 0 }); 
     result = ze.getExtraFields(); 
     assertEquals("second pass", 3, result.length); 
     ze.setExtra(new byte[] { 2, 0, 1, 0, 127 }); 
     result = ze.getExtraFields(); 
     assertEquals("third pass", 3, result.length); 
     assertSame(a, result[0]); 
     assertEquals(new ZipShort(2), result[2].getHeaderId()); 
     assertEquals(new ZipShort(1), result[2].getLocalFileDataLength()); 
     assertEquals(new ZipShort(0), result[2].getCentralDirectoryLength()); 
 }
public void testContent21() { 
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
     * test handling of extra fields via central directory
     */
    

    /**
     * test handling of extra fields
     */
    

    

}
