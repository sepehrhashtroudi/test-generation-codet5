package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class TestIOContext
    extends com.fasterxml.jackson.test.BaseTest
{

public void testAllocations82() throws Exception { 
     IOContext ctxt = new IOContext(new BufferRecycler(), "N/A", true); 
     assertNotNull(ctxt.allocReadIOBuffer()); 
     try { 
         ctxt.allocReadIOBuffer(); 
     } catch (IllegalStateException e) { 
         verifyException(e, "second time"); 
     } 
     try { 
         ctxt.releaseReadIOBuffer(new byte[1]); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "not owned"); 
     } 
     ctxt.releaseReadIOBuffer(null); 
     assertNotNull(ctxt.allocWriteEncodingBuffer()); 
     try { 
         ctxt.allocWriteEncodingBuffer(); 
     } catch (IllegalStateException e) { 
         verifyException(e, "second time"); 
     } 
     try { 
         ctxt.releaseWriteEncodingBuffer(new byte[1]); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "not owned"); 
     } 
     ctxt.releaseWriteEncodingBuffer(null); 
     assertNotNull(ctxt.allocTokenBuffer()); 
     try { 
         ctxt.allocTokenBuffer(); 
     } catch (IllegalStateException e) { 
         verifyException(e, "second time"); 
     } 
     try { 
         ctxt.releaseTokenBuffer(new char[1]); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "not owned"); 
     } 
     ctxt.releaseTokenBuffer(null); 
     assertNotNull(ctxt.allocConcatBuffer()); 
     try { 
         ctxt.allocConcatBuffer(); 
     } catch (IllegalStateException e) { 
         verifyException(e, "second time"); 
     } 
     try { 
         ctxt.releaseConcatBuffer(new char[1]); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "not owned"); 
     } 
     ctxt.releaseConcatBuffer(null); 
     assertNotNull(ctxt.allocNameCopyBuffer(100)); 
     try { 
         ctxt.allocNameCopyBuffer(100); 
     } catch (IllegalStateException e) { 
         verifyException(e, "second time"); 
     } 
     try { 
         ctxt.releaseNameCopyBuffer(new char[1]); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "not owned"); 
     } 
     ctxt.releaseNameCopyBuffer(null); 
 } 

    
}

