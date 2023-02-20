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


public void testIsMetaphoneEqualWright11() { 
     this.assertIsMetaphoneEqual("Wright", new String[] { "Rota", "Rudd", "Ryde" }); 
 } 


public void testSHAndSIOAndSIAToX14() { 
     assertEquals("XT", this.getMetaphone().metaphone("SHOT")); 
     assertEquals("OTXN", this.getMetaphone().metaphone("ODSIAN")); 
     assertEquals("PLXN", this.getMetaphone().metaphone("PULSION")); 
 } 


public void testTIOAndTIAToX16() { 
     assertEquals("OX", this.getMetaphone().metaphone("OTIA")); 
     assertEquals("PRXN", this.getMetaphone().metaphone("PORTION")); 
 } 


public void testTCH21() { 
     assertEquals("RX", this.getMetaphone().metaphone("RETCH")); 
     assertEquals("WX", this.getMetaphone().metaphone("WATCH")); 
 } 


public void testSetMaxLengthWithTruncation44() { 
     this.getMetaphone().setMaxCodeLen(6); 
     assertEquals("AKSKSK", this.getMetaphone().metaphone("AXEAXEAXE")); 
 } 


public void testIsMetaphoneEqual148() { 
     this.assertMetaphoneEqual(new String[][] { { "Case", "case" }, { "CASE", "Case" }, { "caSe", "cAsE" }, { "quick", "cookie" } }); 
 } 


public void testIsMetaphoneEqualAlbert59() { 
     this.assertIsMetaphoneEqual("Albert", new String[] { "Ailbert", "Alberik", "Albert", "Alberto", "Albrecht" }); 
 } 


public void testIsMetaphoneEqualGary61() { 
     this.assertIsMetaphoneEqual("Gary", new String[] { "Cahra", "Cara", "Carey", "Cari", "Caria", "Carie", "Caro", "Carree", "Carri", "Carrie", "Carry", "Cary", "Cora", "Corey", "Cori", "Corie", "Correy", "Corri", "Corrie", "Corry", "Cory", "Gray", "Kara", "Kare", "Karee", "Kari", "Karia", "Karie", "Karrah", "Karrie", "Karry", "Kary", "Keri", "Kerri", "Kerrie", "Kerry", "Kira", "Kiri", "Kora", "Kore", "Kori", "Korie", "Korrie", "Korry" }); 
 } 


public void testIsMetaphoneEqualWhite69() { 
     this.assertIsMetaphoneEqual("White", new String[] { "Wade", "Wait", "Waite", "Wat", "Whit", "Wiatt", "Wit", "Wittie", "Witty", "Wood", "Woodie", "Woody" }); 
 } 


public void testIsMetaphoneEqualXalan71() { 
     this.assertIsMetaphoneEqual("Xalan", new String[] { "Celene", "Celina", "Celine", "Selena", "Selene", "Selina", "Seline", "Suellen", "Xylina" }); 
 } 


public void testMetaphone75() { 
     assertEquals("HL", this.getMetaphone().metaphone("howl")); 
     assertEquals("TSTN", this.getMetaphone().metaphone("testing")); 
     assertEquals("0", this.getMetaphone().metaphone("The")); 
     assertEquals("KK", this.getMetaphone().metaphone("quick")); 
     assertEquals("BRN", this.getMetaphone().metaphone("brown")); 
     assertEquals("FKS", this.getMetaphone().metaphone("fox")); 
     assertEquals("JMPT", this.getMetaphone().metaphone("jumped")); 
     assertEquals("OFR", this.getMetaphone().metaphone("over")); 
     assertEquals("0", this.getMetaphone().metaphone("the")); 
     assertEquals("LS", this.getMetaphone().metaphone("lazy")); 
     assertEquals("TKS", this.getMetaphone().metaphone("dogs")); 
 } 


public void testWordEndingInMB82() { 
     assertEquals("KM", this.getMetaphone().metaphone("COMB")); 
     assertEquals("TM", this.getMetaphone().metaphone("TOMB")); 
     assertEquals("WM", this.getMetaphone().metaphone("WOMB")); 
 } 


public void testTranslateOfSCHAndCH84() { 
     assertEquals("SKTL", this.getMetaphone().metaphone("SCHEDULE")); 
     assertEquals("SKMT", this.getMetaphone().metaphone("SCHEMATIC")); 
     assertEquals("KRKT", this.getMetaphone().metaphone("CHARACTER")); 
     assertEquals("TX", this.getMetaphone().metaphone("TEACH")); 
 } 


public void testDiscardOfSilentHAfterG87() { 
     assertEquals("KNT", this.getMetaphone().metaphone("GHENT")); 
     assertEquals("B", this.getMetaphone().metaphone("BAUGH")); 
 } 


public void testWordsWithCIA94() { 
     assertEquals("XP", this.getMetaphone().metaphone("CIAPO")); 
 } 


public void testIsMetaphoneEqualKnight101() { 
     this.assertIsMetaphoneEqual("Knight", new String[] { "Hynda", "Nada", "Nadia", "Nady", "Nat", "Nata", "Natty", "Neda", "Nedda", "Nedi", "Netta", "Netti", "Nettie", "Netty", "Nita", "Nydia" }); 
 } 


public void testIsMetaphoneEqualAero105() { 
     this.assertIsMetaphoneEqual("Aero", new String[] { "Eure" }); 
 } 


public void testDiscardOfSilentGN109() { 
     assertEquals("N", this.getMetaphone().metaphone("GNU")); 
     assertEquals("SNT", this.getMetaphone().metaphone("SIGNED")); 
 } 


public void testTranslateToJOfDGEOrDGIOrDGY113() { 
     assertEquals("TJ", this.getMetaphone().metaphone("DODGY")); 
     assertEquals("TJ", this.getMetaphone().metaphone("DODGE")); 
     assertEquals("AJMT", this.getMetaphone().metaphone("ADGIEMTI")); 
 } 


public void testPHTOF114() { 
     assertEquals("FX", this.getMetaphone().metaphone("PHISH")); 
 } 


public void testDiscardOfSCEOrSCIOrSCY116() { 
     assertEquals("SNS", this.getMetaphone().metaphone("SCIENCE")); 
     assertEquals("SN", this.getMetaphone().metaphone("SCENE")); 
     assertEquals("S", this.getMetaphone().metaphone("SCY")); 
 } 


public void testIsMetaphoneEqualMary118() { 
     this.assertIsMetaphoneEqual("Mary", new String[] { "Mair", "Maire", "Mara", "Mareah", "Mari", "Maria", "Marie", "Mary", "Maura", "Maure", "Meara", "Merrie", "Merry", "Mira", "Moira", "Mora", "Moria", "Moyra", "Muire", "Myra", "Myrah" }); 
 } 


public void testIsMetaphoneEqualJohn125() { 
     this.assertIsMetaphoneEqual("John", new String[] { "Gena", "Gene", "Genia", "Genna", "Genni", "Gennie", "Genny", "Giana", "Gianna", "Gina", "Ginni", "Ginnie", "Ginny", "Jaine", "Jan", "Jana", "Jane", "Janey", "Jania", "Janie", "Janna", "Jany", "Jayne", "Jean", "Jeana", "Jeane", "Jeanie", "Jeanna", "Jeanne", "Jeannie", "Jen", "Jena", "Jeni", "Jenn", "Jenna", "Jennee", "Jenni", "Jennie", "Jenny", "Jinny", "Jo Ann", "Jo-Ann", "Jo-Anne", "Joan", "Joana", "Joane", "Joanie", "Joann", "Joanna", "Joanne", "Joeann", "Johna", "Johnna", "Joni", "Jonie", "Juana", "June", "Junia", "Junie" }); 
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
    

    

	

	

	

	

	

	

	

	

	

	

    

}
