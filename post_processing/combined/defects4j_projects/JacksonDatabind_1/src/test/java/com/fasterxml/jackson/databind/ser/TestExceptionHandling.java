package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;

import com.fasterxml.jackson.test.BaseTest;
import com.fasterxml.jackson.test.BrokenStringWriter;

/**
 * Unit test for verifying that exceptions are properly handled (caught,
 * re-thrown or wrapped, depending)
 * with Object serialization.
 */
public class TestExceptionHandling
    extends BaseTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    static class Bean {
        // no methods, we'll use our custom serializer
    }

    static class SerializerWithErrors
        extends JsonSerializer<Bean>
    {
        @Override
        public void serialize(Bean value, JsonGenerator jgen, SerializerProvider provider)
        {
            throw new IllegalArgumentException("test string");
        }
    }

    /*
    /**********************************************************
    /* Tests
    /**********************************************************
     */

    /**
     * Unit test that verifies that by default all exceptions except for
     * JsonMappingException are caught and wrapped.
     */
public void testExceptionWithMapperAndGenerator222() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonFactory f = new MappingJsonFactory(); 
     BrokenStringWriter sw = new BrokenStringWriter("TEST"); 
     JsonGenerator jg = f.createGenerator(sw); 
     try { 
         mapper.writeValue(jg, createLongObject()); 
         fail("Should have gotten an exception"); 
     } catch (IOException e) { 
         verifyException(e, IOException.class, "TEST"); 
     } 
 }
    

    /**
     * Unit test for verifying that regular IOExceptions are not wrapped
     * but are passed through as is.
     */
    

    

    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    void verifyException(Exception e, Class<?> expType, String expMsg)
        throws Exception
    {
        if (e.getClass() != expType) {
            fail("Expected exception of type "+expType.getName()+", got "+e.getClass().getName());
        }
        if (expMsg != null) {
            verifyException(e, expMsg);
        }
    }

    Object createLongObject()
    {
        List<Object> leaf = new ArrayList<Object>();
        for (int i = 0; i < 256; ++i) {
            leaf.add(Integer.valueOf(i));
        }
        List<Object> root = new ArrayList<Object>(256);
        for (int i = 0; i < 256; ++i) {
            root.add(leaf);
        }
        return root;
    }
}

