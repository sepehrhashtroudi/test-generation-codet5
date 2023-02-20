package com.fasterxml.jackson.core.base64;

import org.junit.Assert;

import com.fasterxml.jackson.core.*;

public class TestBase64Codec
    extends com.fasterxml.jackson.test.BaseTest
{

@SuppressWarnings("unused") 
 public void testErrors109() throws Exception { 
     try { 
         Base64Variant b = new Base64Variant("foobar", "xyz", false, '!', 24); 
     } catch (IllegalArgumentException iae) { 
         verifyException(iae, "length must be exactly"); 
     } 
 } 


public void testProps110() { 
     Base64Variant std = Base64Variants.MIME; 
     assertEquals("MIME", std.getName()); 
     assertEquals("MIME", std.toString()); 
     assertTrue(std.usesPadding()); 
     assertFalse(std.usesPaddingChar('X')); 
     assertEquals('=', std.getPaddingChar()); 
     assertTrue(std.usesPaddingChar('=')); 
     assertEquals((byte) '=', std.getPaddingByte()); 
     assertEquals(76, std.getMaxLineLength()); 
 } 

    

    

    
}
