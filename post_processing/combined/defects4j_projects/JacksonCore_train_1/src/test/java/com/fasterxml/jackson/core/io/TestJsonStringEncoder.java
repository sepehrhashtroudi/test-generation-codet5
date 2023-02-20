package com.fasterxml.jackson.core.io;

import java.io.StringWriter;
import java.util.Random;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.JsonStringEncoder;

public class TestJsonStringEncoder
    extends com.fasterxml.jackson.test.BaseTest
{

public void testQuoteAsUTF841() throws Exception { 
     JsonFactory f = new JsonFactory(); 
     JsonStringEncoder encoder = new JsonStringEncoder(); 
     int[] lengths = new int[] { 5, 19, 200, 7000, 21000, 37000 }; 
     for (int length : lengths) { 
         String str = generateRandom(length); 
         StringWriter sw = new StringWriter(length * 2); 
         JsonGenerator jgen = f.createGenerator(sw); 
         jgen.writeString(str); 
         jgen.close(); 
         String encoded = sw.toString(); 
         encoded = encoded.substring(1, encoded.length() - 1); 
         byte[] expected = encoded.getBytes("UTF-8"); 
         byte[] actual = encoder.quoteAsUTF8(str); 
         assertArrayEquals(expected, actual); 
     } 
 } 


public void testCtrlChars125() throws Exception { 
     char[] input = new char[] { 0, 1, 2, 3, 4 }; 
     char[] quoted = JsonStringEncoder.getInstance().quoteAsString(new String(input)); 
     assertEquals("\\u0000\\u0001\\u0002\\u0003\\u0004", new String(quoted)); 
 } 


public void testQuoteAsString126() throws Exception { 
     JsonStringEncoder encoder = new JsonStringEncoder(); 
     char[] result = encoder.quoteAsString("foobar"); 
     assertArrayEquals("foobar".toCharArray(), result); 
     result = encoder.quoteAsString("\"x\""); 
     assertArrayEquals("\\\"x\\\"".toCharArray(), result); 
 } 


public void testEncodeAsUTF8127() throws Exception { 
     JsonStringEncoder encoder = new JsonStringEncoder(); 
     String[] strings = new String[] { "a", "foobar", "p\u00f6ll\u00f6", "\"foo\"", generateRandom(200), generateRandom(5000), generateRandom(39000) }; 
     for (String str : strings) { 
         assertArrayEquals(str.getBytes("UTF-8"), encoder.encodeAsUTF8(str)); 
     } 
 } 

    

    // For [JACKSON-853]
    
    
    

    

    // [JACKSON-884]
    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    
    private String generateRandom(int length)
    {
        StringBuilder sb = new StringBuilder(length);
        Random rnd = new Random(length);
        for (int i = 0; i < length; ++i) {
            // let's limit it not to include surrogate pairs:
            char ch = (char) rnd.nextInt(0xCFFF);
            sb.append(ch);
        }
        return sb.toString();
    }
}

