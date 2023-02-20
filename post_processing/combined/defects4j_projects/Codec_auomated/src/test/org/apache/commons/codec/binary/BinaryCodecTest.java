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

import junit.framework.TestCase;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/**
 * TestCase for BinaryCodec class.
 * 
 * @author Apache Software Foundation
 * @version $Id$
 */
public class BinaryCodecTest extends TestCase {
    /** mask with bit zero based index 0 raised */
    private static final int BIT_0 = 0x01;

    /** mask with bit zero based index 0 raised */
    private static final int BIT_1 = 0x02;

    /** mask with bit zero based index 0 raised */
    private static final int BIT_2 = 0x04;

    /** mask with bit zero based index 0 raised */
    private static final int BIT_3 = 0x08;

    /** mask with bit zero based index 0 raised */
    private static final int BIT_4 = 0x10;

    /** mask with bit zero based index 0 raised */
    private static final int BIT_5 = 0x20;

    /** mask with bit zero based index 0 raised */
    private static final int BIT_6 = 0x40;

    /** mask with bit zero based index 0 raised */
    private static final int BIT_7 = 0x80;

    /** an instance of the binary codec */
    BinaryCodec instance = null;

    /*
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.instance = new BinaryCodec();
    }

    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
        this.instance = null;
    }

    /**
     * Constructor for BinaryTest.
     * 
     * @param arg0
     */
    public BinaryCodecTest(String arg0) {
        super(arg0);
    }

    // ------------------------------------------------------------------------
    //
    // Test decode(Object)
    //
    // ------------------------------------------------------------------------
    /**
     * Tests for Object decode(Object)
     */
    

    /**
     * Tests for Object decode(Object)
     */
    

    // ------------------------------------------------------------------------
    //
    // Test decode(byte[])
    //
    // ------------------------------------------------------------------------
    /**
     * Utility used to assert the encoded and decoded values.
     * 
     * @param bits
     *                  the pre-encoded data
     * @param encodeMe
     *                  data to encode and compare
     */
    void assertDecodeObject(byte[] bits, String encodeMe) throws DecoderException {
        byte[] decoded;
        decoded = (byte[]) instance.decode(encodeMe);
        assertEquals(new String(bits), new String(decoded));
        if (encodeMe == null) {
            decoded = instance.decode((byte[]) null);
        } else {
            decoded = (byte[]) instance.decode((Object) encodeMe.getBytes());
        }
        assertEquals(new String(bits), new String(decoded));
        if (encodeMe == null) {
            decoded = (byte[]) instance.decode((char[]) null);
        } else {
            decoded = (byte[]) instance.decode(encodeMe.toCharArray());
        }
        assertEquals(new String(bits), new String(decoded));
    }

    /*
     * Tests for byte[] decode(byte[])
     */
    

    // ------------------------------------------------------------------------
    //
    // Test toByteArray(String)
    //
    // ------------------------------------------------------------------------
    /*
     * Tests for byte[] toByteArray(String)
     */
    

    // ------------------------------------------------------------------------
    //
    // Test fromAscii(char[])
    //
    // ------------------------------------------------------------------------
    /*
     * Tests for byte[] fromAscii(char[])
     */
    

    // ------------------------------------------------------------------------
    //
    // Test fromAscii(byte[])
    //
    // ------------------------------------------------------------------------
    /*
     * Tests for byte[] fromAscii(byte[])
     */
    

    // ------------------------------------------------------------------------
    //
    // Test encode(byte[])
    //
    // ------------------------------------------------------------------------
    /*
     * Tests for byte[] encode(byte[])
     */
    

    // ------------------------------------------------------------------------
    //
    // Test toAsciiBytes
    //
    // ------------------------------------------------------------------------
    

    // ------------------------------------------------------------------------
    //
    // Test toAsciiChars
    //
    // ------------------------------------------------------------------------
    

    // ------------------------------------------------------------------------
    //
    // Test toAsciiString
    //
    // ------------------------------------------------------------------------
    /**
     * Tests the toAsciiString(byte[]) method
     */
    

    // ------------------------------------------------------------------------
    //
    // Test encode(Object)
    //
    // ------------------------------------------------------------------------
    /*
     * Tests for Object encode(Object)
     */
    

    /*
     * Tests for Object encode(Object)
     */
    

    /*
     * Tests for Object encode(Object)
     */
    
}
