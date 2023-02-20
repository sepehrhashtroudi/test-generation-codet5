package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@SuppressWarnings("serial")
public class TestMapSerialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    /**
     * Class needed for testing [JACKSON-220]
     */
    @JsonSerialize(using=MapSerializer.class)    
    static class PseudoMap extends LinkedHashMap<String,String>
    {
        public PseudoMap(String... values) {
            for (int i = 0, len = values.length; i < len; i += 2) {
                put(values[i], values[i+1]);
            }
        }
    }

    static class MapSerializer extends JsonSerializer<Map<String,String>>
    {
        @Override
        public void serialize(Map<String,String> value,
                              JsonGenerator jgen,
                              SerializerProvider provider)
            throws IOException
        {
            // just use standard Map.toString(), output as JSON String
            jgen.writeString(value.toString());
        }
    }

    // For [JACKSON-574]
    static class DefaultKeySerializer extends JsonSerializer<Object>
    {
        @Override
        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException
        {
            jgen.writeFieldName("DEFAULT:"+value);
        }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    final ObjectMapper MAPPER = new ObjectMapper();
    
    // Test [JACKSON-220]
    

    // Test [JACKSON-314]
    

    // [JACKSON-499], problems with map entries, values
    

    // For [JACKSON-574]
    

    // [JACKSON-636]: sort Map entries by key
    
}
