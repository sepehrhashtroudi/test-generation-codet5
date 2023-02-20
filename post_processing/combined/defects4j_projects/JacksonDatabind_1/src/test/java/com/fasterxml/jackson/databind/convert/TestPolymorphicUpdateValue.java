package com.fasterxml.jackson.databind.convert;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying handling of update value on polymorphic
 * objects.
 */
public class TestPolymorphicUpdateValue extends BaseMapTest
{
    @JsonTypeInfo(include=JsonTypeInfo.As.WRAPPER_ARRAY //PROPERTY
            ,use=JsonTypeInfo.Id.NAME, property="type")
    @JsonSubTypes(value={ @JsonSubTypes.Type(value=Child.class)})
    abstract static class Parent {
        public int x;
        public int y;
    }

    @JsonTypeName("child")
    public static class Child extends Parent {
        public int w;
        public int h;
    }    
    
    /*
    /********************************************************
    /* Unit tests
    /********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();

    
}
