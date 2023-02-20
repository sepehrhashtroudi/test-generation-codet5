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

public void testJsonWithFiles69() throws Exception { 
     File file = File.createTempFile("jackson-test", null); 
     file.deleteOnExit(); 
     JsonFactory f = new JsonFactory(); 
     JsonGenerator jg = f.createGenerator(file, JsonEncoding.UTF16_LE); 
     jg.writeStartObject(); 
     jg.writeRaw("   "); 
     jg.writeEndObject(); 
     jg.close(); 
     JsonParser jp = f.createParser(file); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     jp = f.createParser(file.toURI().toURL()); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     file.delete(); 
 }
public void testUtf8BOMHandling70() throws Exception { 
     ByteArrayOutputStream bytes = new ByteArrayOutputStream(); 
     bytes.write(0xEF); 
     bytes.write(0xBB); 
     bytes.write(0xBF); 
     bytes.write("[ 1 ]".getBytes("UTF-8")); 
     JsonFactory jf = new JsonFactory(); 
     JsonParser jp = jf.createParser(bytes.toByteArray()); 
     assertEquals(JsonToken.START_ARRAY, jp.nextToken()); 
     jp.close(); 
 }
    

    
}
