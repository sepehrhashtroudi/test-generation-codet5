package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;

public class TestDefaultForArrays extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    static class ArrayBean {
        public Object[] values;

        public ArrayBean() { this(null); }
        public ArrayBean(Object[] v) { values = v; }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    /**
     * Simple unit test for verifying that we get String array
     * back, even though declared type is Object array
     */
    

    // And let's try it with deeper array as well
    

    // @since 1.8
    

    // test for [JACKSON-845]
    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    protected void _testArraysAs(ObjectMapper mapper, String json, Class<?> type)
        throws Exception
    {
        Object o = mapper.readValue(json, type);
        assertNotNull(o);
        assertTrue(o instanceof Object[]);
        Object[] main = (Object[]) o;
        assertEquals(1, main.length);
        Object element = main[0];
        assertNotNull(element);
        assertTrue(element instanceof Object[]);
        assertEquals(0, ((Object[]) element).length);
    }
}
