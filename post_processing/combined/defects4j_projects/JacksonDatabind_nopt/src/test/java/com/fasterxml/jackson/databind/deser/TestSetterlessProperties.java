package com.fasterxml.jackson.databind.deser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying that feature requested
 * via [JACKSON-88] ("setterless collections") work as
 * expected, similar to how Collections and Maps work
 * with JAXB.
 */
public class TestSetterlessProperties
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper beans
    /**********************************************************
     */

    static class CollectionBean
    {
        List<String> _values = new ArrayList<String>();

        public List<String> getValues() { return _values; }
    }

    static class MapBean
    {
        Map<String,Integer> _values = new HashMap<String,Integer>();

        public Map<String,Integer> getValues() { return _values; }
    }

    // testing to verify that field has precedence over getter, for lists
    static class Dual
    {
        @JsonProperty("list") protected List<Integer> values = new ArrayList<Integer>();

        public Dual() { }
        
        public List<Integer> getList() {
            throw new IllegalStateException("Should not get called");
        }
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    

    /**
     * Let's also verify that disabling the feature makes
     * deserialization fail for setterless bean
     */
    

    

    

    /* Test for [JACKSON-328], precedence of "getter-as-setter" (for Lists) versus
     * field for same property.
     */
    
}
