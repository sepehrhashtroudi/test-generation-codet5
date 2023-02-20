package com.fasterxml.jackson.databind.ser;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Unit tests for checking that alternative settings for
 * {@link JsonSerialize#include} annotation property work
 * as expected.
 */
public class TestNullProperties
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper beans
    /**********************************************************
     */

    static class SimpleBean
    {
        public String getA() { return "a"; }
        public String getB() { return null; }
    }
    
    @JsonSerialize(include=JsonSerialize.Inclusion.ALWAYS) // just to ensure default
    static class NoNullsBean
    {
        @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
        public String getA() { return null; }

        public String getB() { return null; }
    }

    @JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT)
    static class NonDefaultBean
    {
        String _a = "a", _b = "b";

        NonDefaultBean() { }

        public String getA() { return _a; }
        public String getB() { return _b; }
    }

    static class MixedBean
    {
        String _a = "a", _b = "b";

        MixedBean() { }

        @JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT)
        public String getA() { return _a; }

        @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
        public String getB() { return _b; }
    }

    // to ensure that default values work for collections as well
    static class ListBean {
        @JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT)
        public List<String> strings = new ArrayList<String>();
    }
    
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT)
    static class ArrayBean {
        public int[] ints = new int[] { 1, 2 };
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
    

    

    

    

    

    // [JACKSON-531]: make NON_DEFAULT work for arrays too
    
}
