package com.fasterxml.jackson.core.sym;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.Name;

/**
 * Unit test(s) to verify that handling of (byte-based) symbol tables
 * is working. Created to verify fix to [JACKSON-5] (although not very
 * good at catching it...).
 */
public class TestByteBasedSymbols
    extends com.fasterxml.jackson.test.BaseTest
{
    final static String[] FIELD_NAMES = new String[] {
        "a", "b", "c", "x", "y", "b13", "abcdefg", "a123",
        "a0", "b0", "c0", "d0", "e0", "f0", "g0", "h0",
        "x2", "aa", "ba", "ab", "b31", "___x", "aX", "xxx",
        "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2",
        "a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3",
        "a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1",
    };

    /**
     * This unit test checks that [JACKSON-5] is fixed; if not, a
     * symbol table corruption should result in odd problems.
     */

public void testSharedSymbols26() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     String DOC0 = "{ \"a\" : 1, \"x\" : [ ] }"; 
     JsonParser jp0 = createParser(jf, DOC0); 
     while (jp0.nextToken() != JsonToken.START_ARRAY) { 
     } 
     String doc1 = createDoc(FIELD_NAMES, true); 
     String doc2 = createDoc(FIELD_NAMES, false); 
     for (int x = 0; x < 2; ++x) { 
         JsonParser jp1 = createParser(jf, doc1); 
         JsonParser jp2 = createParser(jf, doc2); 
         assertToken(JsonToken.START_OBJECT, jp1.nextToken()); 
         assertToken(JsonToken.START_OBJECT, jp2.nextToken()); 
         int len = FIELD_NAMES.length; 
         for (int i = 0; i < len; ++i) { 
             assertToken(JsonToken.FIELD_NAME, jp1.nextToken()); 
             assertToken(JsonToken.FIELD_NAME, jp2.nextToken()); 
             assertEquals(FIELD_NAMES[i], jp1.getCurrentName()); 
             assertEquals(FIELD_NAMES[len - (i + 1)], jp2.getCurrentName()); 
             assertToken(JsonToken.VALUE_NUMBER_INT, jp1.nextToken()); 
             assertToken(JsonToken.VALUE_NUMBER_INT, jp2.nextToken()); 
             assertEquals(i, jp1.getIntValue()); 
             assertEquals(i, jp2.getIntValue()); 
         } 
         assertToken(JsonToken.END_OBJECT, jp1.nextToken()); 
         assertToken(JsonToken.END_OBJECT, jp2.nextToken()); 
         jp1.close(); 
         jp2.close(); 
     } 
     jp0.close(); 
 } 


public void testAuxMethods29() throws Exception { 
     final int A_BYTES = 0x41414141; 
     final int B_BYTES = 0x42424242; 
     BytesToNameCanonicalizer nc = BytesToNameCanonicalizer.createRoot().makeChild(true, true); 
     assertNull(nc.findName(A_BYTES)); 
     assertNull(nc.findName(A_BYTES, B_BYTES)); 
     nc.addName("AAAA", new int[] { A_BYTES }, 1); 
     Name n1 = nc.findName(A_BYTES); 
     assertNotNull(n1); 
     assertEquals("AAAA", n1.getName()); 
     nc.addName("AAAABBBB", new int[] { A_BYTES, B_BYTES }, 2); 
     Name n2 = nc.findName(A_BYTES, B_BYTES); 
     assertEquals("AAAABBBB", n2.getName()); 
     assertNotNull(n2); 
     assertNotNull(nc.toString()); 
 } 

    

    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    protected JsonParser createParser(JsonFactory jf, String input)
        throws IOException, JsonParseException
    {
        byte[] data = input.getBytes("UTF-8");
        InputStream is = new ByteArrayInputStream(data);
        return jf.createParser(is);
    }

    private String createDoc(String[] fieldNames, boolean add)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        int len = fieldNames.length;
        for (int i = 0; i < len; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append('"');
            sb.append(add ? fieldNames[i] : fieldNames[len - (i+1)]);
            sb.append("\" : ");
            sb.append(i);
        }
        sb.append(" }");
        return sb.toString();
    }
}


