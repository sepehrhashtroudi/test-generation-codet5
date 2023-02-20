package com.fasterxml.jackson.databind.convert;

import java.util.*;

import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.*;

public class TestStringConversions
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    final ObjectMapper MAPPER = new ObjectMapper();

public void testBytesToBase64AndBack44() throws Exception { 
     byte[] input = new byte[] { 1, 2, 3, 4, 5, 6, 7 }; 
     String encoded = MAPPER.convertValue(input, String.class); 
     assertNotNull(encoded); 
     byte[] result = MAPPER.convertValue(encoded, byte[].class); 
     assertArrayEquals(input, result); 
 }
    

    

    
    
    
}
