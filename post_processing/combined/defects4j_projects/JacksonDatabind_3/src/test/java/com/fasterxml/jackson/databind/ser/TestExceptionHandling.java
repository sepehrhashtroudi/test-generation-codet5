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
public void testCatchAndRethrow215() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     SimpleModule module = new SimpleModule("test-exceptions", Version.unknownVersion()); 
     module.addSerializer(Bean.class, new SerializerWithErrors()); 
     mapper.registerModule(module); 
     try { 
         StringWriter sw = new StringWriter(); 
         Bean[] b = { new Bean() }; 
         List<Bean[]> l = new ArrayList<Bean[]>(); 
         l.add(b); 
         mapper.writeValue(sw, l); 
         fail("Should have gotten an exception"); 
     } catch (IOException e) { 
         verifyException(e, "test string"); 
         Throwable root = e.getCause(); 
         assertNotNull(root); 
         if (!(root instanceof IllegalArgumentException)) { 
             fail("Wrapped exception not IAE, but " + root.getClass()); 
         } 
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

