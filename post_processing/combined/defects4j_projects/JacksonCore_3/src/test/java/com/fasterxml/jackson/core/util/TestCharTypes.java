package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.CharTypes;

public class TestCharTypes
    extends com.fasterxml.jackson.test.BaseTest
{
public void testAppendQuoted0_3181() { 
     final String[] inputs = { "\u0000", "\u001F", "abcd", "\u0001ABCD\u0002", "WX\u000F\u0010YZ" }; 
     final String[] expecteds = { "\\u0000", "\\u001F", "abcd", "\\u0001ABCD\\u0002", "WX\\u000F\\u0010YZ" }; 
     assert inputs.length == expecteds.length; 
     for (int i = 0; i < inputs.length; i++) { 
         final String input = inputs[i]; 
         final String expected = expecteds[i]; 
         final StringBuilder sb = new StringBuilder(); 
         CharTypes.appendQuoted(sb, input); 
         final String actual = sb.toString(); 
         assertEquals(expected, actual); 
     } 
 }
    
}
