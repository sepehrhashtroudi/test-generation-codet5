package com.fasterxml.jackson.databind.convert;

import java.util.*;

import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.*;

public class TestStringConversions
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    final ObjectMapper MAPPER = new ObjectMapper();

public void testByteArrayAsNumbers122() throws Exception { 
     final int LEN = 37000; 
     StringBuilder sb = new StringBuilder(); 
     sb.append('['); 
     for (int i = 0; i < LEN; ++i) { 
         int value = i - 128; 
         sb.append((value < 256) ? value : (value & 0x7F)); 
         sb.append(','); 
     } 
     sb.append("0]"); 
     byte[] result = MAPPER.readValue(sb.toString(), byte[].class); 
     assertNotNull(result); 
     assertEquals(LEN + 1, result.length); 
     for (int i = 0; i < LEN; ++i) { 
         int value = i - 128; 
         byte exp = (byte) ((value < 256) ? value : (value & 0x7F)); 
         if (exp != result[i]) { 
             fail("At offset #" + i + " (" + result.length + "), expected " + exp + ", got " + result[i]); 
         } 
         assertEquals(exp, result[i]); 
     } 
     assertEquals(0, result[LEN]); 
 }
    

    

    
    
    
}
