package com.fasterxml.jackson.core.io;

import java.io.*;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class TestMergedStream
    extends com.fasterxml.jackson.test.BaseTest
{

public void testSimple131() throws Exception { 
     BufferRecycler rec = new BufferRecycler(); 
     IOContext ctxt = new IOContext(rec, null, false); 
     byte[] first = ctxt.allocReadIOBuffer(); 
     System.arraycopy("ABCDE".getBytes("UTF-8"), 0, first, 99, 5); 
     byte[] second = "FGHIJ".getBytes("UTF-8"); 
     assertNull(ctxt.getSourceReference()); 
     assertFalse(ctxt.isResourceManaged()); 
     ctxt.setEncoding(JsonEncoding.UTF8); 
     MergedStream ms = new MergedStream(ctxt, new ByteArrayInputStream(second), first, 99, 99 + 5); 
     assertEquals(5, ms.available()); 
     assertFalse(ms.markSupported()); 
     ms.mark(1); 
     assertEquals((byte) 'A', ms.read()); 
     assertEquals(3, ms.skip(3)); 
     byte[] buffer = new byte[5]; 
     assertEquals(1, ms.read(buffer, 1, 3)); 
     assertEquals((byte) 'E', buffer[1]); 
     assertEquals(3, ms.read(buffer, 0, 3)); 
     assertEquals((byte) 'F', buffer[0]); 
     assertEquals((byte) 'G', buffer[1]); 
     assertEquals((byte) 'H', buffer[2]); 
     assertEquals(2, ms.available()); 
     assertEquals(2, ms.skip(200)); 
     ms.close(); 
 } 

    
}
