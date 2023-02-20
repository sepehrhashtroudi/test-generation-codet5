package com.fasterxml.jackson.databind.views;

import com.fasterxml.jackson.annotation.JsonView;

import com.fasterxml.jackson.databind.*;

public class TestViewDeserialization extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    // Classes that represent views
    static class ViewA { }
    static class ViewAA extends ViewA { }
    static class ViewB { }
    static class ViewBB extends ViewB { }
    
    static class Bean
    {
        @JsonView(ViewA.class)
        public int a;

        @JsonView({ViewAA.class, ViewB.class})
        public String aa;

        protected int b;
        
        @JsonView(ViewB.class)
        public void setB(int value) { b = value; }
    }

    static class DefaultsBean
    {
        public int a;

        @JsonView(ViewA.class)
        public int b;
    }

    /*
    /************************************************************************ 
    /* Tests
    /************************************************************************ 
     */

    private final ObjectMapper mapper = new ObjectMapper();
    
    

    
}
