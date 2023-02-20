package com.fasterxml.jackson.core.json;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;

/**
 * Unit tests to verify that input and output decorators work as
 * expected
 * 
 * @since 1.8
 */
@SuppressWarnings("serial")
public class TestDecorators extends com.fasterxml.jackson.test.BaseTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    static class SimpleInputDecorator extends InputDecorator
    {
        @Override
        public InputStream decorate(IOContext ctxt, InputStream in)
            throws IOException
        {
            return new ByteArrayInputStream("123".getBytes("UTF-8"));
        }

        @Override
        public InputStream decorate(IOContext ctxt, byte[] src, int offset, int length)
            throws IOException
        {
            return new ByteArrayInputStream("456".getBytes("UTF-8"));
        }

        @Override
        public Reader decorate(IOContext ctxt, Reader src) {
            return new StringReader("789");
        }
    }

    static class SimpleOutputDecorator extends OutputDecorator
    {
        @Override
        public OutputStream decorate(IOContext ctxt, OutputStream out) throws IOException
        {
            out.write("123".getBytes("UTF-8"));
            out.flush();
            return new ByteArrayOutputStream();
        }

        @Override
        public Writer decorate(IOContext ctxt, Writer w) throws IOException
        {
            w.write("567");
            w.flush();
            return new StringWriter();
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */


public void testOutputDecoration135() throws IOException { 
     JsonFactory f = new JsonFactory(); 
     f.setOutputDecorator(new SimpleOutputDecorator()); 
     JsonGenerator jg; 
     StringWriter sw = new StringWriter(); 
     jg = f.createGenerator(sw); 
     jg.close(); 
     assertEquals("567", sw.toString()); 
     ByteArrayOutputStream out = new ByteArrayOutputStream(); 
     jg = f.createGenerator(out, JsonEncoding.UTF8); 
     jg.close(); 
     assertEquals("123", out.toString("UTF-8")); 
 } 

    

    
}
