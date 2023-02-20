package com.fasterxml.jackson.databind.filter;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

public class TestIgnorePropsForSerialization
    extends BaseMapTest
{
    /*
    /****************************************************************
    /* Helper classes
    /****************************************************************
     */

    @JsonIgnoreProperties({"b", "c"})
    static class IgnoreSome
    {
        public int a = 3;
        public String b = "x";

        public int getC() { return -6; }
        public String getD() { return "abc"; }
    }

    @SuppressWarnings("serial")
    @JsonIgnoreProperties({"@class"})
    static class MyMap extends HashMap<String,String> { }

    // [JACKSON-787]: allow use of @JsonIgnoreProperties for properties
    static class WrapperWithPropIgnore
    {
        @JsonIgnoreProperties("y")
        public XY value = new XY();
    }

    static class XY {
        public int x = 1;
        public int y = 2;
    }

    static class WrapperWithPropIgnore2
    {
        @JsonIgnoreProperties("z")
        public XYZ value = new XYZ();
    }

    @JsonIgnoreProperties({"x"})
    static class XYZ {
        public int x = 1;
        public int y = 2;
        public int z = 3;
    }

    static class MapWrapper {
        @JsonIgnoreProperties({"a"})
        public final HashMap<String,Integer> value = new HashMap<String,Integer>();
        {
            value.put("a", 1);
            value.put("b", 2);
        }
    }
    
    /*
    /****************************************************************
    /* Unit tests
    /****************************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    

    

    

    
    
    
}
