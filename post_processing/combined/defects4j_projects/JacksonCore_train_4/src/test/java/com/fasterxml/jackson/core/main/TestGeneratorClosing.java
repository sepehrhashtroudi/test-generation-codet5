package com.fasterxml.jackson.core.main;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.test.BaseTest;

import java.io.*;

/**
 * Set of basic unit tests that verify aspect of closing a
 * {@link JsonGenerator} instance. This includes both closing
 * of physical resources (target), and logical content
 * (json content tree)
 *<p>
 * Specifically, features
 * <code>JsonGenerator.Feature#AUTO_CLOSE_TARGET</code>
 * and
 * <code>JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT</code>
 * are tested.
 */
public class TestGeneratorClosing extends BaseTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    final static class MyWriter extends StringWriter
    {
        boolean _isClosed = false;

        public MyWriter() { }

        @Override
        public void close() throws IOException {
            _isClosed = true;
            super.close();
        }
        public boolean isClosed() { return _isClosed; }
    }

    final static class MyStream extends ByteArrayOutputStream
    {
        boolean _isClosed = false;

        public MyStream() { }

        @Override
        public void close() throws IOException {
            _isClosed = true;
            super.close();
        }
        public boolean isClosed() { return _isClosed; }
    }

    static class MyBytes extends ByteArrayOutputStream
    {
        public int flushed = 0;

        @Override
        public void flush() throws IOException
        {
            ++flushed;
            super.flush();
        }
    }

    static class MyChars extends StringWriter
    {
        public int flushed = 0;

        @Override
        public void flush()
        {
            ++flushed;
            super.flush();
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
    /**
     * This unit test checks the default behaviour; with no auto-close, no
     * automatic closing should occur, nor explicit one unless specific
     * forcing method is used.
     */

public void testNoAutoCloseOutputStream101() throws Exception { 
     JsonFactory f = new JsonFactory(); 
     f.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET); 
     @SuppressWarnings("resource") 
     MyStream output = new MyStream(); 
     JsonGenerator jg = f.createGenerator(output, JsonEncoding.UTF8); 
     assertFalse(output.isClosed()); 
     jg.writeNumber(39); 
     jg.close(); 
     assertFalse(output.isClosed()); 
 } 


public void testNoAutoCloseGenerator123() throws Exception { 
     JsonFactory f = new JsonFactory(); 
     assertTrue(f.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)); 
     f.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET); 
     assertFalse(f.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)); 
     @SuppressWarnings("resource") 
     MyWriter output = new MyWriter(); 
     JsonGenerator jg = f.createGenerator(output); 
     assertFalse(output.isClosed()); 
     jg.writeNumber(39); 
     jg.close(); 
     assertFalse(output.isClosed()); 
 } 

    

    

    

    

    

    // [JACKSON-401]
    
}
