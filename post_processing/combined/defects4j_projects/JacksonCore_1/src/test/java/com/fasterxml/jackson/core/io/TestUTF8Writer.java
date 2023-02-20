package com.fasterxml.jackson.core.io;

import java.io.*;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class TestUTF8Writer
    extends com.fasterxml.jackson.test.BaseTest
{
public void testSimple42() throws Exception { 
     BufferRecycler rec = new BufferRecycler(); 
     IOContext ctxt = new IOContext(rec, null, false); 
     ByteArrayOutputStream out = new ByteArrayOutputStream(); 
     UTF8Writer w = new UTF8Writer(ctxt, out); 
     String str = "AB\u00A0\u1AE9\uFFFC"; 
     char[] ch = str.toCharArray(); 
     w.write(str); 
     w.append(ch[0]); 
     w.write(ch[1]); 
     w.write(ch, 2, 3); 
     w.write(str, 0, str.length()); 
     w.close(); 
     byte[] data = out.toByteArray(); 
     assertEquals(3 * 10, data.length); 
     String act = out.toString("UTF-8"); 
     assertEquals(15, act.length()); 
     assertEquals(3 * str.length(), act.length()); 
     assertEquals(str + str + str, act); 
 }
    

    
}
