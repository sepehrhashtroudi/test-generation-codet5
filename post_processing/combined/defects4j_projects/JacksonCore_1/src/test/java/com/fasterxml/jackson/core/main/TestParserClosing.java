package com.fasterxml.jackson.core.main;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.test.BaseTest;

import java.io.*;

/**
 * Set of basic unit tests that verify that the closing (or not) of
 * the underlying source occurs as expected and specified
 * by documentation.
 */
public class TestParserClosing
    extends BaseTest
{
    /**
     * This unit test checks the default behaviour; with no auto-close, no
     * automatic closing should occur, nor explicit one unless specific
     * forcing method is used.
     */
public void testReleaseContentBytes68() throws IOException { 
     byte[] input = "[1]foobar".getBytes("UTF-8"); 
     JsonParser jp = new JsonFactory().createParser(input); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     ByteArrayOutputStream out = new ByteArrayOutputStream(); 
     assertEquals(6, jp.releaseBuffered(out)); 
     assertArrayEquals("foobar".getBytes("UTF-8"), out.toByteArray()); 
     jp.close(); 
 }
public void testReleaseContentBytes69() throws Exception { 
     byte[] input = "[1]foobar".getBytes("UTF-8"); 
     JsonParser jp = new JsonFactory().createParser(input); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     ByteArrayOutputStream out = new ByteArrayOutputStream(); 
     assertEquals(6, jp.releaseBuffered(out)); 
     assertArrayEquals("foobar".getBytes("UTF-8"), out.toByteArray()); 
     jp.close(); 
 }
    

    

    

    // [JACKSON-287]
    

    
    
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    final static class MyReader extends StringReader
    {
        boolean mIsClosed = false;

        public MyReader(String contents) {
            super(contents);
        }

        @Override
        public void close() {
            mIsClosed = true;
            super.close();
        }

        public boolean isClosed() { return mIsClosed; }
    }

    final static class MyStream extends ByteArrayInputStream
    {
        boolean mIsClosed = false;

        public MyStream(byte[] data) {
            super(data);
        }

        @Override
        public void close() throws IOException {
            mIsClosed = true;
            super.close();
        }

        public boolean isClosed() { return mIsClosed; }
    }

}
