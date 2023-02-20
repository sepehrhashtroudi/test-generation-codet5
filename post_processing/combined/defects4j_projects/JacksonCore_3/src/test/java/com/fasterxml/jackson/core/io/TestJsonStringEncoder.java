package com.fasterxml.jackson.core.io;

import java.io.StringWriter;
import java.util.Random;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.JsonStringEncoder;

public class TestJsonStringEncoder
    extends com.fasterxml.jackson.test.BaseTest
{
public void testQuoteLongAsString84() throws Exception { 
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

