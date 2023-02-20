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

public void testSimple1() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.setInjectableValues(new InjectableValues.Std().addValue(String.class, "stuffValue").addValue("myId", "xyz").addValue(Long.TYPE, Long.valueOf(37))); 
     InjectedBean bean = mapper.readValue("{\"value\":3}", InjectedBean.class); 
     assertEquals(3, bean.value); 
     assertEquals("stuffValue", bean.stuff); 
     assertEquals("xyz", bean.otherStuff); 
     assertEquals(37L, bean.third); 
 }
    
    
    

    // [Issue-13]
    
    
    
}
