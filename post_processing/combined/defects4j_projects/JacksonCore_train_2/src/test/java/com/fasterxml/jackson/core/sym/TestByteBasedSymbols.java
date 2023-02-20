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

public void testAuxMethods32() throws Exception { 
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


