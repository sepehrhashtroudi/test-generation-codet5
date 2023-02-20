package com.fasterxml.jackson.core.base64;

import java.io.*;

import com.fasterxml.jackson.core.*;

public class TestBase64Generation
    extends com.fasterxml.jackson.test.BaseTest
{
    static class ThrottledInputStream extends FilterInputStream
    {
        protected final int _maxBytes;

        public ThrottledInputStream(byte[] data, int maxBytes)
        {
            this(new ByteArrayInputStream(data), maxBytes);
        }
        
        public ThrottledInputStream(InputStream in, int maxBytes)
        {
            super(in);
            _maxBytes = maxBytes;
        }

        @Override
        public int read(byte[] buf) throws IOException {
            return read(buf, 0, buf.length);
        }
        
        @Override
        public int read(byte[] buf, int offset, int len) throws IOException {
            return in.read(buf, offset, Math.min(_maxBytes, len));
        }
        
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

public void testBase64Text45() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     String[] inputStrings = new String[] { "", "X", "1234567890" }; 
     for (int useReader = 0; useReader < 2; ++useReader) { 
         for (int writeString = 0; writeString < 2; ++writeString) { 
             for (int strIx = 0; strIx < inputStrings.length; ++strIx) { 
                 String input = inputStrings[strIx]; 
                 JsonGenerator gen; 
                 ByteArrayOutputStream bout = new ByteArrayOutputStream(); 
                 if (useReader != 0) { 
                     gen = jf.createGenerator(new OutputStreamWriter(bout, "UTF-8")); 
                 } else { 
                     gen = jf.createGenerator(bout, JsonEncoding.UTF8); 
                 } 
                 if (writeString > 0) { 
                     gen.writeString(input); 
                 } else { 
                     int len = input.length(); 
                     char[] buffer = new char[len + 20]; 
                     input.getChars(0, len, buffer, strIx); 
                     gen.writeString(buffer, strIx, len); 
                 } 
                 gen.flush(); 
                 gen.close(); 
                 JsonParser jp = jf.createParser(new ByteArrayInputStream(bout.toByteArray())); 
                 JsonToken t = jp.nextToken(); 
                 assertNotNull("Document \"" + bout.toString("UTF-8") + "\" yielded no tokens", t); 
                 assertEquals(JsonToken.VALUE_STRING, t); 
                 assertEquals(input, jp.getText()); 
                 assertEquals(null, jp.nextToken()); 
                 jp.close(); 
             } 
         } 
     } 
 }
public void testStringWrite63() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     String[] inputStrings = new String[] { "", "X", "1234567890" }; 
     for (int useReader = 0; useReader < 2; ++useReader) { 
         for (int writeString = 0; writeString < 2; ++writeString) { 
             for (int strIx = 0; strIx < inputStrings.length; ++strIx) { 
                 String input = inputStrings[strIx]; 
                 JsonGenerator gen; 
                 ByteArrayOutputStream bout = new ByteArrayOutputStream(); 
                 if (useReader != 0) { 
                     gen = jf.createGenerator(new OutputStreamWriter(bout, "UTF-8")); 
                 } else { 
                     gen = jf.createGenerator(bout, JsonEncoding.UTF8); 
                 } 
                 if (writeString > 0) { 
                     gen.writeString(input); 
                 } else { 
                     int len = input.length(); 
                     char[] buffer = new char[len + 20]; 
                     input.getChars(0, len, buffer, strIx); 
                     gen.writeString(buffer, strIx, len); 
                 } 
                 gen.flush(); 
                 gen.close(); 
                 JsonParser jp = jf.createParser(new ByteArrayInputStream(bout.toByteArray())); 
                 JsonToken t = jp.nextToken(); 
                 assertNotNull("Document \"" + bout.toString("UTF-8") + "\" yielded no tokens", t); 
                 assertEquals(JsonToken.VALUE_STRING, t); 
                 assertEquals(input, jp.getText()); 
                 assertEquals(null, jp.nextToken()); 
                 jp.close(); 
             } 
         } 
     } 
 }
    

    // For [#55]
    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private final static Base64Variant[] VARIANTS = {
            Base64Variants.MIME,
            Base64Variants.MIME_NO_LINEFEEDS,
            Base64Variants.MODIFIED_FOR_URL,
            Base64Variants.PEM
    };

    private final static String TEXT = "Some content so that we can test encoding of base64 data; must"
            +" be long enough include a line wrap or two...";
    private final static String TEXT4 = TEXT + TEXT + TEXT + TEXT;

    @SuppressWarnings("resource")
    private void _testStreamingWrites(JsonFactory jf, boolean useBytes) throws Exception
    {
        final byte[] INPUT = TEXT4.getBytes("UTF-8");
        for (Base64Variant variant : VARIANTS) {
            final String EXP_OUTPUT = "[" + quote(variant.encode(INPUT))+"]";
            for (boolean passLength : new boolean[] { true, false }) {
                for (int chunkSize : new int[] { 1, 2, 3, 4, 7, 11, 29, 5000 }) {
//System.err.println(""+variant+", length "+passLength+", chunk "+chunkSize);
                    
                    JsonGenerator jgen;
                    
                    final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                    if (useBytes) {
                        jgen = jf.createGenerator(bytes);
                    } else {
                        jgen = jf.createGenerator(new OutputStreamWriter(bytes, "UTF-8"));
                    }
                    jgen.writeStartArray();
                    int length = passLength ? INPUT.length : -1;
                    InputStream data = new ThrottledInputStream(INPUT, chunkSize);
                    jgen.writeBinary(variant, data, length);
                    jgen.writeEndArray();
                    jgen.close();
                    String JSON = bytes.toString("UTF-8");
                    assertEquals(EXP_OUTPUT, JSON);
                }
            }
        }
    }
}
