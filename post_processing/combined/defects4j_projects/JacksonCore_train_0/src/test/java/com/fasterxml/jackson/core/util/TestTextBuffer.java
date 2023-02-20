package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

public class TestTextBuffer
    extends com.fasterxml.jackson.test.BaseTest
{
    /**
     * Trivially simple basic test to ensure all basic append
     * methods work
     */

public void testSimple85() { 
     TextBuffer tb = new TextBuffer(new BufferRecycler()); 
     tb.append('a'); 
     tb.append(new char[] { 'X', 'b' }, 1, 1); 
     tb.append("c", 0, 1); 
     assertEquals(3, tb.contentsAsArray().length); 
     assertEquals("abc", tb.toString()); 
     assertNotNull(tb.expandCurrentSegment()); 
 } 

    

    

      
}
