package com.fasterxml.jackson.core.io;

import java.io.StringWriter;
import java.util.Random;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.JsonStringEncoder;

public class TestJsonStringEncoder
    extends com.fasterxml.jackson.test.BaseTest
{
public void testCtrlChars80() throws Exception { 
     char[] input = new char[] { 0, 1, 2, 3, 4 }; 
     char[] quoted = JsonStringEncoder.getInstance().quoteAsString(new String(input)); 
     assertEquals("\\u0000\\u0001\\u0002\\u0003\\u0004", new String(quoted)); 
 }
public void testQuoteAsString81() throws Exception { 
     JsonStringEncoder encoder = new JsonStringEncoder(); 
     char[] result = encoder.quoteAsString("foobar"); 
     assertArrayEquals("foobar".toCharArray(), result); 
     result = encoder.quoteAsString("\"x\""); 
     assertArrayEquals("\\\"x\\\"".toCharArray(), result); 
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

