package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

public class TestInjectables extends BaseMapTest
{
    static class InjectedBean
    {
        @JacksonInject
        protected String stuff;

        @JacksonInject("myId")
        protected String otherStuff;

        protected long third;
        
        public int value;

        @JacksonInject
        public void injectThird(long v) {
            third = v;
        }
    }    

    static class BadBean1 {
        @JacksonInject protected String prop1;
        @JacksonInject protected String prop2;
    }

    static class BadBean2 {
        @JacksonInject("x") protected String prop1;
        @JacksonInject("x") protected String prop2;
    }

    static class CtorBean {
        protected String name;
        protected int age;
        
        public CtorBean(@JacksonInject String n, @JsonProperty("age") int a)
        {
            name = n;
            age = a;
        }
    }

    static class CtorBean2 {
        protected String name;
        protected Integer age;
        
        public CtorBean2(@JacksonInject String n, @JacksonInject("number") Integer a)
        {
            name = n;
            age = a;
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    
    
    

    // [Issue-13]
    
    
    
}
