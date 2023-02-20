package com.fasterxml.jackson.core.io;

public class TestCharTypes
    extends com.fasterxml.jackson.test.BaseTest
{
public void testQuoting62() { 
     StringBuilder sb = new StringBuilder(); 
     CharTypes.appendQuoted(sb, "\n"); 
     assertEquals("\\n", sb.toString()); 
     sb = new StringBuilder(); 
     CharTypes.appendQuoted(sb, "\u0000"); 
     assertEquals("\\u0000", sb.toString()); 
 }
    
}
