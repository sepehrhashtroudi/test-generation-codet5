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
public void testCodeInteger27() { 
     String encodedInt2 = "9B5ypLY9pMOmtxCeTDHgwdNFeGs="; 
     BigInteger bigInt2 = new BigInteger("13936727572861167254666467268" + "91466679477132949611"); 
     assertEquals(encodedInt2, new String(Base64.encodeInteger(bigInt2))); 
     assertEquals(bigInt2, Base64.decodeInteger(encodedInt2.getBytes())); 
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
