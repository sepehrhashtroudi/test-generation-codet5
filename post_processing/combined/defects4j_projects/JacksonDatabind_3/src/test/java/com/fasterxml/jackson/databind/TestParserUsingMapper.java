package com.fasterxml.jackson.databind;

import java.io.IOException;
import java.io.StringReader;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestParserUsingMapper  extends com.fasterxml.jackson.test.BaseTest
{
    final static int TWO_BYTE_ESCAPED = 0x111;
    final static int THREE_BYTE_ESCAPED = 0x1111;

    final static SerializedString TWO_BYTE_ESCAPED_STRING = new SerializedString("&111;");
    final static SerializedString THREE_BYTE_ESCAPED_STRING = new SerializedString("&1111;");
    
    final static class Pojo
    {
        int _x;

        public void setX(int x) { _x = x; }
    }
    
    /*
    /********************************************************
    /* Helper types
    /********************************************************
     */

    /**
     * Trivial simple custom escape definition set.
     */
    static class MyEscapes extends CharacterEscapes
    {
        private static final long serialVersionUID = 1L;

        private final int[] _asciiEscapes;

        public MyEscapes() {
            _asciiEscapes = standardAsciiEscapesForJSON();
            _asciiEscapes['a'] = 'A'; // to basically give us "\A"
            _asciiEscapes['b'] = CharacterEscapes.ESCAPE_STANDARD; // too force "\u0062"
            _asciiEscapes['d'] = CharacterEscapes.ESCAPE_CUSTOM;
        }
        
        @Override
        public int[] getEscapeCodesForAscii() {
            return _asciiEscapes;
        }

        @Override
        public SerializableString getEscapeSequence(int ch)
        {
            if (ch == 'd') {
                return new SerializedString("[D]");
            }
            if (ch == TWO_BYTE_ESCAPED) {
                return TWO_BYTE_ESCAPED_STRING;
            }
            if (ch == THREE_BYTE_ESCAPED) {
                return THREE_BYTE_ESCAPED_STRING;
            }
            return null;
        }
    }
    
    /*
    /********************************************************
    /* Unit tests
    /********************************************************
     */

public void testEOF104() throws Exception { 
     String JSON = "{ \"key\": [ { \"a\" : { \"name\": \"foo\",  \"type\": 1\n" + "},  \"type\": 3, \"url\": \"http://www.google.com\" } ],\n" + "\"name\": \"xyz\", \"type\": 1, \"url\" : null }\n  "; 
     JsonFactory jf = new JsonFactory(); 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonParser jp = jf.createParser(new StringReader(JSON)); 
     JsonNode result = mapper.readTree(jp); 
     assertTrue(result.isObject()); 
     assertEquals(4, result.size()); 
     assertNull(mapper.readTree(jp)); 
 }
    
    
    

    /**
     * Test similar to above, but instead reads a sequence of values
     */
    

    
    
    // for [JACKSON-672]
    
}
