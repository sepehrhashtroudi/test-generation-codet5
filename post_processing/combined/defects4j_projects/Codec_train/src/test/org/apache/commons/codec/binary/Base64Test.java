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
import java.math.BigInteger;
import junit.framework.TestCase;

/**
 * @author Apache Software Foundation
 * @version $Id$
 */
public class Base64Test extends TestCase {

    /**
     * Construct a new instance of this test case.
     *
     * @param name Name of the test case
     */
    public Base64Test(String name) {
        super(name);
    }


    /**
     *  Test the Base64 implementation
     */

public void testNonBase64Test3() throws Exception { 
     byte[] bArray = { '%' }; 
     assertFalse("Invalid Base64 array was incorrectly validated as " + "an array of Base64 encoded data", Base64.isArrayByteBase64(bArray)); 
     boolean exceptionThrown = false; 
     try { 
         Base64 b64 = new Base64(); 
         byte[] result = b64.decode(bArray); 
         assertTrue("The result should be empty as the test encoded content did " + "not contain any valid base 64 characters", result.length == 0); 
     } catch (Exception e) { 
         exceptionThrown = true; 
     } 
     assertFalse("Exception was thrown when trying to decode " + "invalid base64 encoded data - RFC 2045 requires that all " + "non base64 character be discarded, an exception should not" + " have been thrown", exceptionThrown); 
 } 


public void testCodeInteger26() { 
     String encodedInt2 = "9B5ypLY9pMOmtxCeTDHgwdNFeGs="; 
     BigInteger bigInt2 = new BigInteger("13936727572861167254666467268" + "91466679477132949611"); 
     assertEquals(encodedInt2, new String(Base64.encodeInteger(bigInt2))); 
     assertEquals(bigInt2, Base64.decodeInteger(encodedInt2.getBytes())); 
 } 


public void testTripletsChunked20() { 
     assertEquals("AAAA\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 0 }))); 
     assertEquals("AAAB\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 1 }))); 
     assertEquals("AAAC\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 2 }))); 
     assertEquals("AAAD\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 3 }))); 
     assertEquals("AAAE\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 4 }))); 
     assertEquals("AAAF\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 5 }))); 
     assertEquals("AAAG\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 6 }))); 
     assertEquals("AAAH\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 7 }))); 
     assertEquals("AAAI\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 8 }))); 
     assertEquals("AAAJ\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 9 }))); 
     assertEquals("AAAK\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 10 }))); 
     assertEquals("AAAL\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 11 }))); 
     assertEquals("AAAM\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 12 }))); 
     assertEquals("AAAN\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 13 }))); 
     assertEquals("AAAO\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 14 }))); 
     assertEquals("AAAP\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 15 }))); 
     assertEquals("AAAQ\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 16 }))); 
     assertEquals("AAAR\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 17 }))); 
     assertEquals("AAAS\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 18 }))); 
     assertEquals("AAAT\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 19 }))); 
     assertEquals("AAAU\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 20 }))); 
     assertEquals("AAAV\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 21 }))); 
     assertEquals("AAAW\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 22 }))); 
     assertEquals("AAAX\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 23 }))); 
     assertEquals("AAAY\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 24 }))); 
     assertEquals("AAAZ\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 25 }))); 
     assertEquals("AAAa\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 26 }))); 
     assertEquals("AAAb\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 27 }))); 
     assertEquals("AAAc\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 28 }))); 
     assertEquals("AAAd\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 29 }))); 
     assertEquals("AAAe\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 30 }))); 
     assertEquals("AAAf\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 31 }))); 
     assertEquals("AAAg\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 32 }))); 
     assertEquals("AAAh\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 33 }))); 
     assertEquals("AAAi\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 34 }))); 
     assertEquals("AAAj\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 35 }))); 
     assertEquals("AAAk\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 36 }))); 
     assertEquals("AAAl\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 37 }))); 
     assertEquals("AAAm\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 38 }))); 
     assertEquals("AAAn\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 39 }))); 
     assertEquals("AAAo\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 40 }))); 
     assertEquals("AAAp\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 41 }))); 
     assertEquals("AAAq\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 42 }))); 
     assertEquals("AAAr\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 43 }))); 
     assertEquals("AAAs\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 44 }))); 
     assertEquals("AAAt\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 45 }))); 
     assertEquals("AAAu\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 46 }))); 
     assertEquals("AAAv\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 47 }))); 
     assertEquals("AAAw\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 48 }))); 
     assertEquals("AAAx\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 49 }))); 
     assertEquals("AAAy\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 50 }))); 
     assertEquals("AAAz\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 51 }))); 
     assertEquals("AAA0\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 52 }))); 
     assertEquals("AAA1\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 53 }))); 
     assertEquals("AAA2\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 54 }))); 
     assertEquals("AAA3\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 55 }))); 
     assertEquals("AAA4\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 56 }))); 
     assertEquals("AAA5\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 57 }))); 
     assertEquals("AAA6\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 58 }))); 
     assertEquals("AAA7\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 59 }))); 
     assertEquals("AAA8\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 60 }))); 
     assertEquals("AAA9\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 61 }))); 
     assertEquals("AAA+\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 62 }))); 
     assertEquals("AAA/\r\n", new String(Base64.encodeBase64Chunked(new byte[] { (byte) 0, (byte) 0, (byte) 63 }))); 
 } 


public void testDiscardWhitespace22() throws Exception { 
     String orig = "I am a late night coder."; 
     byte[] encodedArray = Base64.encodeBase64(orig.getBytes()); 
     StringBuffer intermediate = new StringBuffer(new String(encodedArray)); 
     intermediate.insert(2, ' '); 
     intermediate.insert(5, '\t'); 
     intermediate.insert(10, '\r'); 
     intermediate.insert(15, '\n'); 
     byte[] encodedWithWS = intermediate.toString().getBytes(); 
     byte[] encodedNoWS = Base64.discardWhitespace(encodedWithWS); 
     byte[] decodedWithWS = Base64.decodeBase64(encodedWithWS); 
     byte[] decodedNoWS = Base64.decodeBase64(encodedNoWS); 
     String destFromWS = new String(decodedWithWS); 
     String destFromNoWS = new String(decodedNoWS); 
     assertTrue("Dest string doesn't eausl original", destFromWS.equals(orig)); 
     assertTrue("Dest string doesn't eausl original", destFromNoWS.equals(orig)); 
 } 


public void testSingletons23() { 
     assertEquals("AA==", new String(Base64.encodeBase64(new byte[] { (byte) 0 }))); 
     assertEquals("AQ==", new String(Base64.encodeBase64(new byte[] { (byte) 1 }))); 
     assertEquals("Ag==", new String(Base64.encodeBase64(new byte[] { (byte) 2 }))); 
     assertEquals("Aw==", new String(Base64.encodeBase64(new byte[] { (byte) 3 }))); 
     assertEquals("BA==", new String(Base64.encodeBase64(new byte[] { (byte) 4 }))); 
     assertEquals("BQ==", new String(Base64.encodeBase64(new byte[] { (byte) 5 }))); 
     assertEquals("Bg==", new String(Base64.encodeBase64(new byte[] { (byte) 6 }))); 
     assertEquals("Bw==", new String(Base64.encodeBase64(new byte[] { (byte) 7 }))); 
     assertEquals("CA==", new String(Base64.encodeBase64(new byte[] { (byte) 8 }))); 
     assertEquals("CQ==", new String(Base64.encodeBase64(new byte[] { (byte) 9 }))); 
     assertEquals("Cg==", new String(Base64.encodeBase64(new byte[] { (byte) 10 }))); 
     assertEquals("Cw==", new String(Base64.encodeBase64(new byte[] { (byte) 11 }))); 
     assertEquals("DA==", new String(Base64.encodeBase64(new byte[] { (byte) 12 }))); 
     assertEquals("DQ==", new String(Base64.encodeBase64(new byte[] { (byte) 13 }))); 
     assertEquals("Dg==", new String(Base64.encodeBase64(new byte[] { (byte) 14 }))); 
     assertEquals("Dw==", new String(Base64.encodeBase64(new byte[] { (byte) 15 }))); 
     assertEquals("EA==", new String(Base64.encodeBase64(new byte[] { (byte) 16 }))); 
     assertEquals("EQ==", new String(Base64.encodeBase64(new byte[] { (byte) 17 }))); 
     assertEquals("Eg==", new String(Base64.encodeBase64(new byte[] { (byte) 18 }))); 
     assertEquals("Ew==", new String(Base64.encodeBase64(new byte[] { (byte) 19 }))); 
     assertEquals("FA==", new String(Base64.encodeBase64(new byte[] { (byte) 20 }))); 
     assertEquals("FQ==", new String(Base64.encodeBase64(new byte[] { (byte) 21 }))); 
     assertEquals("Fg==", new String(Base64.encodeBase64(new byte[] { (byte) 22 }))); 
     assertEquals("Fw==", new String(Base64.encodeBase64(new byte[] { (byte) 23 }))); 
     assertEquals("GA==", new String(Base64.encodeBase64(new byte[] { (byte) 24 }))); 
     assertEquals("GQ==", new String(Base64.encodeBase64(new byte[] { (byte) 25 }))); 
     assertEquals("Gg==", new String(Base64.encodeBase64(new byte[] { (byte) 26 }))); 
     assertEquals("Gw==", new String(Base64.encodeBase64(new byte[] { (byte) 27 }))); 
     assertEquals("HA==", new String(Base64.encodeBase64(new byte[] { (byte) 28 }))); 
     assertEquals("HQ==", new String(Base64.encodeBase64(new byte[] { (byte) 29 }))); 
     assertEquals("Hg==", new String(Base64.encodeBase64(new byte[] { (byte) 30 }))); 
     assertEquals("Hw==", new String(Base64.encodeBase64(new byte[] { (byte) 31 }))); 
     assertEquals("IA==", new String(Base64.encodeBase64(new byte[] { (byte) 32 }))); 
     assertEquals("IQ==", new String(Base64.encodeBase64(new byte[] { (byte) 33 }))); 
     assertEquals("Ig==", new String(Base64.encodeBase64(new byte[] { (byte) 34 }))); 
     assertEquals("Iw==", new String(Base64.encodeBase64(new byte[] { (byte) 35 }))); 
     assertEquals("JA==", new String(Base64.encodeBase64(new byte[] { (byte) 36 }))); 
     assertEquals("JQ==", new String(Base64.encodeBase64(new byte[] { (byte) 37 }))); 
     assertEquals("Jg==", new String(Base64.encodeBase64(new byte[] { (byte) 38 }))); 
     assertEquals("Jw==", new String(Base64.encodeBase64(new byte[] { (byte) 39 }))); 
     assertEquals("KA==", new String(Base64.encodeBase64(new byte[] { (byte) 40 }))); 
     assertEquals("KQ==", new String(Base64.encodeBase64(new byte[] { (byte) 41 }))); 
     assertEquals("Kg==", new String(Base64.encodeBase64(new byte[] { (byte) 42 }))); 
     assertEquals("Kw==", new String(Base64.encodeBase64(new byte[] { (byte) 43 }))); 
     assertEquals("LA==", new String(Base64.encodeBase64(new byte[] { (byte) 44 }))); 
     assertEquals("LQ==", new String(Base64.encodeBase64(new byte[] { (byte) 45 }))); 
     assertEquals("Lg==", new String(Base64.encodeBase64(new byte[] { (byte) 46 }))); 
     assertEquals("Lw==", new String(Base64.encodeBase64(new byte[] { (byte) 47 }))); 
     assertEquals("MA==", new String(Base64.encodeBase64(new byte[] { (byte) 48 }))); 
     assertEquals("MQ==", new String(Base64.encodeBase64(new byte[] { (byte) 49 }))); 
     assertEquals("Mg==", new String(Base64.encodeBase64(new byte[] { (byte) 50 }))); 
     assertEquals("Mw==", new String(Base64.encodeBase64(new byte[] { (byte) 51 }))); 
     assertEquals("NA==", new String(Base64.encodeBase64(new byte[] { (byte) 52 }))); 
     assertEquals("NQ==", new String(Base64.encodeBase64(new byte[] { (byte) 53 }))); 
     assertEquals("Ng==", new String(Base64.encodeBase64(new byte[] { (byte) 54 }))); 
     assertEquals("Nw==", new String(Base64.encodeBase64(new byte[] { (byte) 55 }))); 
     assertEquals("OA==", new String(Base64.encodeBase64(new byte[] { (byte) 56 }))); 
     assertEquals("OQ==", new String(Base64.encodeBase64(new byte[] { (byte) 57 }))); 
     assertEquals("Og==", new String(Base64.encodeBase64(new byte[] { (byte) 58 }))); 
     assertEquals("Ow==", new String(Base64.encodeBase64(new byte[] { (byte) 59 }))); 
     assertEquals("PA==", new String(Base64.encodeBase64(new byte[] { (byte) 60 }))); 
     assertEquals("PQ==", new String(Base64.encodeBase64(new byte[] { (byte) 61 }))); 
     assertEquals("Pg==", new String(Base64.encodeBase64(new byte[] { (byte) 62 }))); 
     assertEquals("Pw==", new String(Base64.encodeBase64(new byte[] { (byte) 63 }))); 
     assertEquals("QA==", new String(Base64.encodeBase64(new byte[] { (byte) 64 }))); 
     assertEquals("QQ==", new String(Base64.encodeBase64(new byte[] { (byte) 65 }))); 
     assertEquals("Qg==", new String(Base64.encodeBase64(new byte[] { (byte) 66 }))); 
     assertEquals("Qw==", new String(Base64.encodeBase64(new byte[] { (byte) 67 }))); 
     assertEquals("RA==", new String(Base64.encodeBase64(new byte[] { (byte) 68 }))); 
     assertEquals("RQ==", new String(Base64.encodeBase64(new byte[] { (byte) 69 }))); 
     assertEquals("Rg==", new String(Base64.encodeBase64(new byte[] { (byte) 70 }))); 
     assertEquals("Rw==", new String(Base64.encodeBase64(new byte[] { (byte) 71 }))); 
     assertEquals("SA==", new String(Base64.encodeBase64(new byte[] { (byte) 72 }))); 
     assertEquals("SQ==", new String(Base64.encodeBase64(new byte[] { (byte) 73 }))); 
     assertEquals("Sg==", new String(Base64.encodeBase64(new byte[] { (byte) 74 }))); 
     assertEquals("Sw==", new String(Base64.encodeBase64(new byte[] { (byte) 75 }))); 
     assertEquals("TA==", new String(Base64.encodeBase64(new byte[] { (byte) 76 }))); 
     assertEquals("TQ==", new String(Base64.encodeBase64(new byte[] { (byte) 77 }))); 
     assertEquals("Tg==", new String(Base64.encodeBase64(new byte[] { (byte) 78 }))); 
     assertEquals("Tw==", new String(Base64.encodeBase64(new byte[] { (byte) 79 }))); 
     assertEquals("UA==", new String(Base64.encodeBase64(new byte[] { (byte) 80 }))); 
     assertEquals("UQ==", new String(Base64.encodeBase64(new byte[] { (byte) 81 }))); 
     assertEquals("Ug==", new String(Base64.encodeBase64(new byte[] { (byte) 82 }))); 
     assertEquals("Uw==", new String(Base64.encodeBase64(new byte[] { (byte) 83 }))); 
     assertEquals("VA==", new String(Base64.encodeBase64(new byte[] { (byte) 84 }))); 
     assertEquals("VQ==", new String(Base64.encodeBase64(new byte[] { (byte) 85 }))); 
     assertEquals("Vg==", new String(Base64.encodeBase64(new byte[] { (byte) 86 }))); 
     assertEquals("Vw==", new String(Base64.encodeBase64(new byte[] { (byte) 87 }))); 
     assertEquals("WA==", new String(Base64.encodeBase64(new byte[] { (byte) 88 }))); 
     assertEquals("WQ==", new String(Base64.encodeBase64(new byte[] { (byte) 89 }))); 
     assertEquals("Wg==", new String(Base64.encodeBase64(new byte[] { (byte) 90 }))); 
     assertEquals("Ww==", new String(Base64.encodeBase64(new byte[] { (byte) 91 }))); 
     assertEquals("XA==", new String(Base64.encodeBase64(new byte[] { (byte) 92 }))); 
     assertEquals("XQ==", new String(Base64.encodeBase64(new byte[] { (byte) 93 }))); 
     assertEquals("Xg==", new String(Base64.encodeBase64(new byte[] { (byte) 94 }))); 
     assertEquals("Xw==", new String(Base64.encodeBase64(new byte[] { (byte) 95 }))); 
     assertEquals("YA==", new String(Base64.encodeBase64(new byte[] { (byte) 96 }))); 
     assertEquals("YQ==", new String(Base64.encodeBase64(new byte[] { (byte) 97 }))); 
     assertEquals("Yg==", new String(Base64.encodeBase64(new byte[] { (byte) 98 }))); 
     assertEquals("Yw==", new String(Base64.encodeBase64(new byte[] { (byte) 99 }))); 
     assertEquals("ZA==", new String(Base64.encodeBase64(new byte[] { (byte) 100 }))); 
     assertEquals("ZQ==", new String(Base64.encodeBase64(new byte[] { (byte) 101 }))); 
     assertEquals("Zg==", new String(Base64.encodeBase64(new byte[] { (byte) 102 }))); 
     assertEquals("Zw==", new String(Base64.encodeBase64(new byte[] { (byte) 103 }))); 
     assertEquals("aA==", new String(Base64.encodeBase64(new byte[] { (byte) 104 }))); 
 } 


public void testObjectEncodeWithInvalidParameter25() throws Exception { 
     boolean exceptionThrown = false; 
     Base64 b64 = new Base64(); 
     try { 
         Object o = new String("Yadayadayada"); 
         b64.encode(o); 
     } catch (Exception e) { 
         exceptionThrown = true; 
     } 
     assertTrue("encode(Object) didn't throw an exception when passed a " + "String object", exceptionThrown); 
 } 


public void testKnownDecodings45() { 
     assertEquals("The quick brown fox jumped over the lazy dogs.", new String(Base64.decodeBase64("VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2dzLg==".getBytes()))); 
     assertEquals("It was the best of times, it was the worst of times.", new String(Base64.decodeBase64("SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN0IG9mIHRpbWVzLg==".getBytes()))); 
     assertEquals("http://jakarta.apache.org/commmons", new String(Base64.decodeBase64("aHR0cDovL2pha2FydGEuYXBhY2hlLm9yZy9jb21tbW9ucw==".getBytes()))); 
     assertEquals("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz", new String(Base64.decodeBase64("QWFCYkNjRGRFZUZmR2dIaElpSmpLa0xsTW1Obk9vUHBRcVJyU3NUdFV1VnZXd1h4WXlaeg==".getBytes()))); 
     assertEquals("{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }", new String(Base64.decodeBase64("eyAwLCAxLCAyLCAzLCA0LCA1LCA2LCA3LCA4LCA5IH0=".getBytes()))); 
     assertEquals("xyzzy!", new String(Base64.decodeBase64("eHl6enkh".getBytes()))); 
 } 


public void testKnownEncodings46() { 
     assertEquals("VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2dzLg==", new String(Base64.encodeBase64("The quick brown fox jumped over the lazy dogs.".getBytes()))); 
     assertEquals("YmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJs\r\nYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFo\r\nIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBi\r\nbGFoIGJsYWg=\r\n", new String(Base64.encodeBase64Chunked("blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah".getBytes()))); 
     assertEquals("SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN0IG9mIHRpbWVzLg==", new String(Base64.encodeBase64("It was the best of times, it was the worst of times.".getBytes()))); 
     assertEquals("aHR0cDovL2pha2FydGEuYXBhY2hlLm9yZy9jb21tbW9ucw==", new String(Base64.encodeBase64("http://jakarta.apache.org/commmons".getBytes()))); 
     assertEquals("QWFCYkNjRGRFZUZmR2dIaElpSmpLa0xsTW1Obk9vUHBRcVJyU3NUdFV1VnZXd1h4WXlaeg==", new String(Base64.encodeBase64("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".getBytes()))); 
     assertEquals("eyAwLCAxLCAyLCAzLCA0LCA1LCA2LCA3LCA4LCA5IH0=", new String(Base64.encodeBase64("{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }".getBytes()))); 
     assertEquals("eHl6enkh", new String(Base64.encodeBase64("xyzzy!".getBytes()))); 
 } 


public void testDecodePadOnlyChunked49() { 
     assertTrue(Base64.decodeBase64("====\n".getBytes()).length == 0); 
     assertEquals("", new String(Base64.decodeBase64("====\n".getBytes()))); 
 } 


public void testEncodeDecodeSmall85() { 
     for (int i = 0; i < 12; i++) { 
         byte[] data = new byte[i]; 
         this.getRandom().nextBytes(data); 
         byte[] enc = Base64.encodeBase64(data); 
         assertTrue("\"" + (new String(enc)) + "\" is Base64 data.", Base64.isArrayByteBase64(enc)); 
         byte[] data2 = Base64.decodeBase64(enc); 
         assertTrue(toString(data) + " equals " + toString(data2), Arrays.equals(data, data2)); 
     } 
 } 


public void testObjectEncodeWithValidParameter86() throws Exception { 
     String original = "Hello World!"; 
     byte[] origBytes = original.getBytes(); 
     Object origObj = origBytes; 
     Base64 b64 = new Base64(); 
     Object oEncoded = b64.encode(origObj); 
     byte[] bArray = Base64.decodeBase64((byte[]) oEncoded); 
     String dest = new String(bArray); 
     assertTrue("dest string down not equal original", dest.equals(original)); 
 } 


public void testObjectDecodeWithInvalidParameter97() throws Exception { 
     boolean exceptionThrown = false; 
     Base64 b64 = new Base64(); 
     try { 
         Object o = new String("Yadayadayada"); 
         b64.decode(o); 
     } catch (Exception e) { 
         exceptionThrown = true; 
     } 
     assertTrue("decode(Object) didn't throw an exception when passed a " + "String object", exceptionThrown); 
 } 


public void testObjectDecodeWithValidParameter106() throws Exception { 
     String original = "Hello World!"; 
     byte[] bArray = Base64.encodeBase64((new String(original)).getBytes()); 
     Object o = bArray; 
     Base64 b64 = new Base64(); 
     Object oDecoded = b64.decode(o); 
     byte[] baDecoded = (byte[]) oDecoded; 
     String dest = new String(baDecoded); 
     assertTrue("dest string down not equal original", dest.equals(original)); 
 } 

    

    /**
     * Tests conditional true branch for "marker0" test.
     */
    
    
    /**
     * Tests conditional branches for "marker1" test.
     */
    
    
    
    
    
    
    // encode/decode random arrays from size 0 to size 11
    

    // encode/decode a large random array
    

    /**
     * Tests RFC 2045 section 2.1 CRLF definition.
     */
    

    /**
     * Tests RFC 2045 section 6.8 chuck size definition.
     */
    

    

    

    

    

    

     

	
    
	

    

    

    

    

    

    

    

    

    

    

    

    

    // -------------------------------------------------------- Private Methods

    private String toString(byte[] data) {
        StringBuffer buf = new StringBuffer();
        for(int i=0;i<data.length;i++) {
            buf.append(data[i]);
            if(i != data.length-1) {
                buf.append(",");
            }
        }
        return buf.toString();
    }

    // ------------------------------------------------------------------------

    private Random _random = new Random();

    /**
     * @return Returns the _random.
     */
    public Random getRandom() {
        return this._random;
    }

}
