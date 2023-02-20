package com.fasterxml.jackson.core.base64;

import org.junit.Assert;

import com.fasterxml.jackson.core.*;

public class TestBase64Codec
    extends com.fasterxml.jackson.test.BaseTest
{

@SuppressWarnings("unused") 
 public void testErrors108() throws Exception { 
     try { 
         Base64Variant b = new Base64Variant("foobar", "xyz", false, '!', 24); 
     } catch (IllegalArgumentException iae) { 
         verifyException(iae, "length must be exactly"); 
     } 
 } 


public void testCharEncoding109() throws Exception { 
     Base64Variant std = Base64Variants.MIME; 
     assertEquals(Base64Variant.BASE64_VALUE_INVALID, std.decodeBase64Char('?')); 
     assertEquals(Base64Variant.BASE64_VALUE_INVALID, std.decodeBase64Char((int) '?')); 
     assertEquals(Base64Variant.BASE64_VALUE_INVALID, std.decodeBase64Char((byte) '?')); 
     assertEquals(0, std.decodeBase64Char('A')); 
     assertEquals(1, std.decodeBase64Char((int) 'B')); 
     assertEquals(2, std.decodeBase64Char((byte) 'C')); 
     assertEquals('/', std.encodeBase64BitsAsChar(63)); 
     assertEquals((byte) 'b', std.encodeBase64BitsAsByte(27)); 
     String EXP_STR = "HwdJ"; 
     int TRIPLET = 0x1F0749; 
     StringBuilder sb = new StringBuilder(); 
     std.encodeBase64Chunk(sb, TRIPLET); 
     assertEquals(EXP_STR, sb.toString()); 
     byte[] exp = EXP_STR.getBytes("UTF-8"); 
     byte[] act = new byte[exp.length]; 
     std.encodeBase64Chunk(TRIPLET, act, 0); 
     Assert.assertArrayEquals(exp, act); 
 } 

    

    

    
}
