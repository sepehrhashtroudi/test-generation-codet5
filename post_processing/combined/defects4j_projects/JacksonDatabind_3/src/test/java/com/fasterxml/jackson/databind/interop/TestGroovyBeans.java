package com.fasterxml.jackson.databind.interop;

import java.util.*;

import groovy.lang.GroovyClassLoader;

import com.fasterxml.jackson.databind.*;

/**
 * Basic tests to see that simple Groovy beans can be serialized
 * and deserialized
 */
public class TestGroovyBeans
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    final static String SIMPLE_POGO = 
        "public class GBean {\n"
        +"long id = 3;\n"
        +"String name = \"whome\";\n"
        +"}";

    private final ObjectMapper MAPPER = new ObjectMapper();

    

    

    /*
    *************************************************
    * Helper methods
    *************************************************
    */

    protected Class<?> defineGroovyClass(String src) throws Exception
    {
        return new GroovyClassLoader(getClass().getClassLoader()).parseClass(src);

    }

    protected Object newGroovyObject(String src) throws Exception
    {
        Class<?> cls = defineGroovyClass(src);
        return cls.newInstance();
    }
}
