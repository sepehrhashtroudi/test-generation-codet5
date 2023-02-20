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
    

    

    

    

    

    // [JACKSON-401]
    
}