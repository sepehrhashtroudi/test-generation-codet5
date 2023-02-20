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

    

    
    
    /**
	 * An MD5 hash converted to hex should always be 32 characters.
	 */
    

    /**
	 * An MD5 hash should always be a 16 element byte[].
	 */
    

    

        

    

        
}
