package com.fasterxml.jackson.core.io;

import java.io.*;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class TestUTF8Writer
    extends com.fasterxml.jackson.test.BaseTest
{
public void testFlushAfterClose31() throws Exception { 
     BufferRecycler rec = new BufferRecycler(); 
     IOContext ctxt = new IOContext(rec, null, false); 
     ByteArrayOutputStream out = new ByteArrayOutputStream(); 
     UTF8Writer w = new UTF8Writer(ctxt, out); 
     w.write('X'); 
     w.close(); 
     assertEquals(1, out.size()); 
     w.flush(); 
     w.close(); 
     w.flush(); 
 }
    

    
}
