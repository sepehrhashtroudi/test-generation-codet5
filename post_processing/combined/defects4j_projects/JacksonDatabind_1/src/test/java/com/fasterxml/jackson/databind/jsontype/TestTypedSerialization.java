package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.*;

public class TestTypedSerialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    /**
     * Polymorphic base class
     */
    @JsonTypeInfo(use=Id.CLASS, include=As.PROPERTY)
    static abstract class Animal {
        public String name;
        
        protected Animal(String n)  { name = n; }
    }

    @JsonTypeName("doggie")
    static class Dog extends Animal
    {
        public int boneCount;
        
        private Dog() { super(null); }
        public Dog(String name, int b) {
            super(name);
            boneCount = b;
        }
    }
    
    @JsonTypeName("kitty")
    static class Cat extends Animal
    {
        public String furColor;
        
        private Cat() { super(null); }
        public Cat(String name, String c) {
            super(name);
            furColor = c;
        }
    }

    public class AnimalWrapper {
        public Animal animal;
        
        public AnimalWrapper(Animal a) { animal = a; }
    }

    @JsonTypeInfo(use=Id.MINIMAL_CLASS, include=As.WRAPPER_OBJECT)
    interface TypeWithWrapper { }

    @JsonTypeInfo(use=Id.CLASS, include=As.WRAPPER_ARRAY)
    interface TypeWithArray { }

    @JsonTypeInfo(use=Id.NAME)
    @JsonTypeName("empty")
    public class Empty { }

    @JsonTypeInfo(include=As.PROPERTY, use=Id.CLASS)
    public class Super {}
    public class A extends Super {}
    public class B extends Super {}

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    /**
     * First things first, let's ensure we can serialize using
     * class name, written as main-level property name
     */
    

    /**
     * Test inclusion using wrapper style
     */
    

    /**
     * Test inclusion using 2-element array
     */
    

    /* !!! 30-Jan-2010, tatus: I am not completely sure below works as it should
     *    Problem is, context of "untyped" map should prevent type information
     *    being added to Animal entries, because Object.class has no type.
     *    If type information is included, it will not be useful for deserialization,
     *    since static type does not carry through (unlike in serialization).
     *    
     *    But it is not quite clear how type information should be pushed through
     *    array types...
     */
    

    /**
     * Simple unit test to verify that serializing "empty" beans is ok
     */
    

    /**
     * Unit test for [JACKSON-543]
     */
    
}

