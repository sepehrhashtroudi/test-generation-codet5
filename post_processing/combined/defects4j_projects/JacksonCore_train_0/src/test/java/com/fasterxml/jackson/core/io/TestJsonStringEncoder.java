package com.fasterxml.jackson.core.io;

import java.io.StringWriter;
import java.util.Random;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.JsonStringEncoder;

public class TestJsonStringEncoder
    extends com.fasterxml.jackson.test.BaseTest
{

public void testQuoteLongAsString126() throws Exception { 
     JsonStringEncoder encoder = new JsonStringEncoder(); 
     StringBuilder sb = new StringBuilder(); 
     StringBuilder sb2 = new StringBuilder(); 
     for (int i = 0; i < 1111; ++i) { 
         sb.append('"'); 
         sb2.append("\\\""); 
     } 
     String input = sb.toString(); 
     String exp = sb2.toString(); 
     char[] result = encoder.quoteAsString(input); 
     assertEquals(2 * input.length(), result.length); 
     assertEquals(exp, new String(result)); 
 } 


public void testCtrlChars127() throws Exception { 
     char[] input = new char[] { 0, 1, 2, 3, 4 }; 
     char[] quoted = JsonStringEncoder.getInstance().quoteAsString(new String(input)); 
     assertEquals("\\u0000\\u0001\\u0002\\u0003\\u0004", new String(quoted)); 
 } 


public void testEncodeAsUTF8128() throws Exception { 
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

