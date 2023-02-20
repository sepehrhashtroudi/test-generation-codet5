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

package org.apache.commons.codec.language;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.StringEncoderAbstractTest;

/**
 * @author Apache Software Foundation
 * @version $Id$
 */
public class MetaphoneTest extends StringEncoderAbstractTest {

    public static Test suite() {
        return new TestSuite(MetaphoneTest.class);
    }

    private Metaphone metaphone = null;

    public MetaphoneTest(String name) {
        super(name);
    }

    public void assertIsMetaphoneEqual(String source, String[] matches) {
        // match source to all matches
        for (int i = 0; i < matches.length; i++) {
            assertTrue("Source: " + source + ", should have same Metaphone as: " + matches[i],
                       this.getMetaphone().isMetaphoneEqual(source, matches[i]));
        }
        // match to each other
        for (int i = 0; i < matches.length; i++) {
            for (int j = 0; j < matches.length; j++) {
                assertTrue(this.getMetaphone().isMetaphoneEqual(matches[i], matches[j]));
            }
        }
    }

    public void assertMetaphoneEqual(String[][] pairs) {
        this.validateFixture(pairs);
        for (int i = 0; i < pairs.length; i++) {
            String name0 = pairs[i][0];
            String name1 = pairs[i][1];
            String failMsg = "Expected match between " + name0 + " and " + name1;
            assertTrue(failMsg, this.getMetaphone().isMetaphoneEqual(name0, name1));
            assertTrue(failMsg, this.getMetaphone().isMetaphoneEqual(name1, name0));
        }
    }
    /**
	 * @return Returns the metaphone.
	 */
    private Metaphone getMetaphone() {
        return this.metaphone;
    }

    protected StringEncoder makeEncoder() {
        return new Metaphone();
    }

    /**
	 * @param metaphone
	 *                  The metaphone to set.
	 */
    private void setMetaphone(Metaphone metaphone) {
        this.metaphone = metaphone;
    }

    public void setUp() throws Exception {
        super.setUp();
        this.setMetaphone(new Metaphone());
    }

    public void tearDown() throws Exception {
        super.tearDown();
        this.setMetaphone(null);
    }

    

    /**
	 * Matches computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Initial AE case.
	 * 
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Initial WH case.
	 * 
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Initial A, not followed by an E case.
	 * 
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Initial KN case.
	 * 
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    
    /**
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Initial WR case.
	 * 
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    /**
	 * Match data computed from http://www.lanw.com/java/phonetic/default.htm
	 */
    

    
	
	

	

    /**
     * Tests (CODEC-57) Metaphone.metaphone(String) returns an empty string when passed the word "why"
     */
    

    

	

	

	

	

	

	

	

	

	

	

    public void validateFixture(String[][] pairs) {
        if (pairs.length == 0) {
            fail("Test fixture is empty");
        }
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i].length != 2) {
                fail("Error in test fixture in the data array at index " + i);
            }
        }
    }

}
