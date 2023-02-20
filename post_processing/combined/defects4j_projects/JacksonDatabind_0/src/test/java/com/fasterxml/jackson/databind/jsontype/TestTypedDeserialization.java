package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TestTypedDeserialization
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
    @JsonTypeInfo(use=Id.CLASS, include=As.PROPERTY, property="@classy")
    static abstract class Animal {
        public String name;
        
        protected Animal(String n)  { name = n; }
    }

    @JsonTypeName("doggie")
    static class Dog extends Animal
    {
        public int boneCount;
        
        @JsonCreator
        public Dog(@JsonProperty("name") String name) {
            super(name);
        }

        public void setBoneCount(int i) { boneCount = i; }
    }
    
    @JsonTypeName("kitty")
    static class Cat extends Animal
    {
        public String furColor;

        @JsonCreator
        public Cat(@JsonProperty("furColor") String c) {
            super(null);
            furColor = c;
        }

        public void setName(String n) { name = n; }
    }

    // for [JACKSON-319] -- allow "empty" beans
    @JsonTypeName("fishy")
    static class Fish extends Animal
    {
        @JsonCreator
        public Fish()
        {
            super(null);
        }
    }

    static class AnimalContainer {
        public Animal animal;
    }

    // base class with no useful info
    @JsonTypeInfo(use=Id.CLASS, include=As.WRAPPER_ARRAY)
    static abstract class DummyBase {
        protected DummyBase(boolean foo) { }
    }

    static class DummyImpl extends DummyBase {
        public int x;

        public DummyImpl() { super(true); }
    }
    
    @JsonTypeInfo(use=Id.MINIMAL_CLASS, include=As.WRAPPER_OBJECT)
    interface TypeWithWrapper { }

    @JsonTypeInfo(use=Id.CLASS, include=As.WRAPPER_ARRAY)
    interface TypeWithArray { }

    static class Issue506DateBean {
        @JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type2")
        public Date date;
    }
        
    static class Issue506NumberBean
    {
        @JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type3")
        @JsonSubTypes({ @Type(Long.class),
            @Type(Integer.class) })
        public Number number;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
    /**
     * First things first, let's ensure we can serialize using
     * class name, written as main-level property name
     */
    

    // Test inclusion using wrapper style
    

    // Test inclusion using 2-element array
    

    // Use basic Animal as contents of a regular List
    

    

    /**
     * Test that verifies that there are few limitations on polymorphic
     * base class.
     */
    

    // [JACKSON-506], wrt Date
    
    
    // [JACKSON-506], wrt Number
    
}


