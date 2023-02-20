package com.fasterxml.jackson.core.sym;

import java.io.IOException;

public class TestSymbolTables extends com.fasterxml.jackson.test.BaseTest
{
    // 11 3-char snippets that hash to 0xFFFF (with default JDK hashCode() calc),
    // and which can be combined as
    // sequences, like, say, 11x11x11 (1331) 9-character thingies
    final static String[] CHAR_COLLISION_SNIPPETS_31 = {
        "@~}", "@\u007f^", "A_}", "A`^", 
        "Aa?", "B@}", "BA^", "BB?", 
        "C!}", "C\"^", "C#?"
    };

    final static String[] CHAR_COLLISIONS;
    static {
        final String[] SNIPPETS = CHAR_COLLISION_SNIPPETS_31;
        
        final int len = SNIPPETS.length;
        CHAR_COLLISIONS = new String[len*len*len];
        int ix = 0;
        for (int i1 = 0; i1 < len; ++i1) {
            for (int i2 = 0; i2 < len; ++i2) {
                for (int i3 = 0; i3 < len; ++i3) {
                    CHAR_COLLISIONS[ix++] = SNIPPETS[i1]+SNIPPETS[i2] + SNIPPETS[i3];
                }
            }
        }
    }

    /*
    public void testCharBasedCollisions()
    {
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot(0);

        // first, verify that we'd get a few collisions...
        try {
            int firstHash = 0;
            for (String str : CHAR_COLLISIONS) {
                int hash = sym.calcHash(str);
                if (firstHash == 0) {
                    firstHash = hash;
                } else {
                    assertEquals(firstHash, hash); 
                }
                sym.findSymbol(str.toCharArray(), 0, str.length(), hash);
            }
            fail("Should have thrown exception");
        } catch (IllegalStateException e) {
            verifyException(e, "exceeds maximum");
            // should fail right after addition:
            assertEquals(CharsToNameCanonicalizer.MAX_COLL_CHAIN_LENGTH+1, sym.maxCollisionLength());
            assertEquals(CharsToNameCanonicalizer.MAX_COLL_CHAIN_LENGTH+1, sym.collisionCount());
            // one "non-colliding" entry (head of collision chain), thus:
            assertEquals(CharsToNameCanonicalizer.MAX_COLL_CHAIN_LENGTH+2, sym.size());
        }
    }
    */

    // Test for verifying stability of hashCode, wrt collisions, using
    // synthetic field name generation and character-based input

public void testSyntheticWithChars5() { 
     CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot(1); 
     final int COUNT = 6000; 
     for (int i = 0; i < COUNT; ++i) { 
         String id = fieldNameFor(i); 
         char[] ch = id.toCharArray(); 
         symbols.findSymbol(ch, 0, ch.length, symbols.calcHash(id)); 
     } 
     assertEquals(8192, symbols.bucketCount()); 
     assertEquals(COUNT, symbols.size()); 
     assertEquals(1401, symbols.collisionCount()); 
     assertEquals(4, symbols.maxCollisionLength()); 
 } 


public void testSyntheticWithBytes30() throws IOException { 
     BytesToNameCanonicalizer symbols = BytesToNameCanonicalizer.createRoot(33333).makeChild(true, true); 
     final int COUNT = 6000; 
     for (int i = 0; i < COUNT; ++i) { 
         String id = fieldNameFor(i); 
         int[] quads = BytesToNameCanonicalizer.calcQuads(id.getBytes("UTF-8")); 
         symbols.addName(id, quads, quads.length); 
     } 
     assertEquals(COUNT, symbols.size()); 
     assertEquals(8192, symbols.bucketCount()); 
     assertEquals(1686, symbols.collisionCount()); 
     assertEquals(9, symbols.maxCollisionLength()); 
 } 

    

    // Test for verifying stability of hashCode, wrt collisions, using
    // synthetic field name generation and byte-based input (UTF-8)
    
}
