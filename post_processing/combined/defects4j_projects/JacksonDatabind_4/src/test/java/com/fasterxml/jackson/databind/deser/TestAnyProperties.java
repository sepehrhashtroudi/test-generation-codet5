package com.fasterxml.jackson.databind.deser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying that {@link JsonAnySetter} annotation
 * works as expected.
 */
public class TestAnyProperties
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Annotated helper classes
    /**********************************************************
     */

    static class MapImitator
    {
        HashMap<String,Object> _map;

        public MapImitator() {
            _map = new HashMap<String,Object>();
        }

        @JsonAnySetter
        void addEntry(String key, Object value)
        {
            _map.put(key, value);
        }
    }

    /**
     * Let's also verify that it is possible to define different
     * value: not often useful, but possible.
     */
    static class MapImitatorWithValue
    {
        HashMap<String,int[]> _map;

        public MapImitatorWithValue() {
            _map = new HashMap<String,int[]>();
        }

        @JsonAnySetter
        void addEntry(String key, int[] value)
        {
            _map.put(key, value);
        }
    }

    // Bad; 2 "any setters"
    static class Broken
    {
        @JsonAnySetter
        void addEntry1(String key, Object value) { }
        @JsonAnySetter
        void addEntry2(String key, Object value) { }
    }

    @JsonIgnoreProperties("dummy")
    static class Ignored
    {
        HashMap<String,Object> map = new HashMap<String,Object>();
 
        @JsonIgnore
        public String bogus;
        
        @JsonAnySetter
        void addEntry(String key, Object value)
        {
            map.put(key, value);
        }        
    }

    static class Bean744
    {
        protected Map<String,Object> additionalProperties;
        
        @JsonAnySetter
        public void addAdditionalProperty(String key, Object value) {
            if (additionalProperties == null) additionalProperties = new HashMap<String, Object>();
            additionalProperties.put(key,value);
        }
        
        public void setAdditionalProperties(Map<String, Object> additionalProperties) {
            this.additionalProperties = additionalProperties;
        }

        @JsonAnyGetter
        public Map<String,Object> getAdditionalProperties() { return additionalProperties; }

        @JsonIgnore
        public String getName() {
           return (String) additionalProperties.get("name");
        }
    }

    public class Bean797Base
    {
        @JsonAnyGetter
        public Map<String, JsonNode> getUndefinedProperties() {
            throw new IllegalStateException("Should not call parent version!");
        }
    }

    public class Bean797BaseImpl extends Bean797Base
    {
        @Override
        public Map<String, JsonNode> getUndefinedProperties() {
            return new HashMap<String, JsonNode>();
        }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    

    

    

    // [JACKSON-313]
    

    

    

    

    /*
    /**********************************************************
    /* Private helper methods
    /**********************************************************
     */

    private void _testIgnorals(ObjectMapper mapper) throws Exception
    {
        Ignored bean = mapper.readValue("{\"name\":\"Bob\", \"bogus\": [ 1, 2, 3], \"dummy\" : 13 }", Ignored.class);
        // as of 2.0, @JsonIgnoreProperties does block; @JsonIgnore not
        assertNull(bean.map.get("dummy"));
        assertEquals("[1, 2, 3]", ""+bean.map.get("bogus"));
        assertEquals("Bob", bean.map.get("name"));
        assertEquals(2, bean.map.size());
    }
}
