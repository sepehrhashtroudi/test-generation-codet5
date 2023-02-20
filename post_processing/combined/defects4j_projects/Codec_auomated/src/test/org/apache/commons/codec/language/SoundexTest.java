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

// (FYI: Formatted and sorted with Eclipse)
package org.apache.commons.codec.language;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.StringEncoderAbstractTest;

/**
 * Tests {@link Soundex}
 *
 * @author Apache Software Foundation
 * @version $Id$
 */
public class SoundexTest extends StringEncoderAbstractTest {

    public static Test suite() {
        return new TestSuite(SoundexTest.class);
    }

    private Soundex encoder = null;

    public SoundexTest(String name) {
        super(name);
    }

    void encodeAll(String[] strings, String expectedEncoding) {
        for (int i = 0; i < strings.length; i++) {
            assertEquals(expectedEncoding, this.getEncoder().encode(strings[i]));
        }
    }

    /**
	 * @return Returns the _encoder.
	 */
    public Soundex getEncoder() {
        return this.encoder;
    }

    protected StringEncoder makeEncoder() {
        return new Soundex();
    }

    /**
	 * @param encoder
	 *                  The encoder to set.
	 */
    public void setEncoder(Soundex encoder) {
        this.encoder = encoder;
    }

    public void setUp() throws Exception {
        super.setUp();
        this.setEncoder(new Soundex());
    }

    public void tearDown() throws Exception {
        super.tearDown();
        this.setEncoder(null);
    }

    

    

    

    /**
	 * Examples from
	 * http://www.bradandkathy.com/genealogy/overviewofsoundex.html
	 */
    

    /**
	 * Examples from
	 * http://www.archives.gov/research_room/genealogy/census/soundex.html
	 */
    

    /**
	 * Examples from: http://www.myatt.demon.co.uk/sxalg.htm
	 */
    

	

    

    /**
	 * Test data from http://www.myatt.demon.co.uk/sxalg.htm
	 */
    

    

    /**
	 * Consonants from the same code group separated by W or H are treated as
	 * one.
	 */
    

    /**
	 * Consonants from the same code group separated by W or H are treated as
	 * one.
	 *
	 * Test data from http://www.myatt.demon.co.uk/sxalg.htm
	 */
    

    /**
	 * Consonants from the same code group separated by W or H are treated as
	 * one.
	 */
    

    

    

    /**
     * Examples for MS SQLServer from
     * http://msdn.microsoft.com/library/default.asp?url=/library/en-us/tsqlref/ts_setu-sus_3o6w.asp
     */
    

    /**
     * Examples for MS SQLServer from
     * http://support.microsoft.com/default.aspx?scid=http://support.microsoft.com:80/support/kb/articles/Q100/3/65.asp&NoWebContent=1
     */
    
    /**
     * Examples for MS SQLServer from
     * http://databases.about.com/library/weekly/aa042901a.htm
     */
    

    /**
     * Fancy characters are not mapped by the default US mapping.
     *
     * http://issues.apache.org/bugzilla/show_bug.cgi?id=29080
     */
      /**
     * Fancy characters are not mapped by the default US mapping.
     *
     * http://issues.apache.org/bugzilla/show_bug.cgi?id=29080
     */
    public void testUsMappingEWithAcute() {
        assertEquals("E000", this.getEncoder().encode("e"));
        if ( Character.isLetter('é') ) {
            try {
                assertEquals("É000", this.getEncoder().encode("é"));
                fail("Expected IllegalArgumentException not thrown");
            } catch (IllegalArgumentException e) {
                // expected
            }
        } else {
            assertEquals("", this.getEncoder().encode("é"));
        }
    }
    
    /**
     * https://issues.apache.org/jira/browse/CODEC-54
     * https://issues.apache.org/jira/browse/CODEC-56
     */
    public void testUsEnglishStatic() {
        assertEquals(Soundex.US_ENGLISH.soundex("Williams"), "W452");
    }

    /**
     * https://issues.apache.org/jira/browse/CODEC-54
     * https://issues.apache.org/jira/browse/CODEC-56
     */
    public void testNewInstance() {
        assertEquals(new Soundex().soundex("Williams"), "W452");
    }
}
