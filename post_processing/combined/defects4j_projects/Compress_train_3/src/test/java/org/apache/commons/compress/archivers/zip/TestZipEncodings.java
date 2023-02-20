/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.nio.ByteBuffer;

import junit.framework.TestCase;

/**
 * Test zip encodings.
 */
public class TestZipEncodings extends TestCase {
    private static final String UNENC_STRING = "\u2016";

    // stress test for internal grow method.
    private static final String BAD_STRING =
        "\u2016\u2015\u2016\u2015\u2016\u2015\u2016\u2015\u2016\u2015\u2016";

    private static final String BAD_STRING_ENC =
        "%U2016%U2015%U2016%U2015%U2016%U2015%U2016%U2015%U2016%U2015%U2016";


public void testSimpleCp850Encoding26() throws IOException { 
     doSimpleEncodingTest("Cp850", null); 
 } 

    

    

    

    private static final void assertEquals(byte[] expected, ByteBuffer actual) {

        assertEquals(expected.length, actual.limit());

        for (int i = 0; i < expected.length; ++i) {

            byte a = actual.get();
            assertEquals(expected[i], a);
        }

    }

    private void doSimpleEncodingTest(String name, byte[] testBytes)
        throws IOException {

        ZipEncoding enc = ZipEncodingHelper.getZipEncoding(name);

        if (testBytes == null) {

            testBytes = new byte[256];
            for (int i = 0; i < 256; ++i) {
                testBytes[i] = (byte) i;
            }
        }

        String decoded = enc.decode(testBytes);

        assertEquals(true, enc.canEncode(decoded));

        ByteBuffer encoded = enc.encode(decoded);

        assertEquals(testBytes, encoded);

        assertEquals(false, enc.canEncode(UNENC_STRING));
        assertEquals("%U2016".getBytes("US-ASCII"), enc.encode(UNENC_STRING));
        assertEquals(false, enc.canEncode(BAD_STRING));
        assertEquals(BAD_STRING_ENC.getBytes("US-ASCII"),
                     enc.encode(BAD_STRING));
    }

}
