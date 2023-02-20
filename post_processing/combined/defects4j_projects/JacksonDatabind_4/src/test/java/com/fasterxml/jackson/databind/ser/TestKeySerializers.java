package com.fasterxml.jackson.databind.ser;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class TestKeySerializers extends BaseMapTest
{
    public static class KarlSerializer extends JsonSerializer<String>
    {
        @Override
        public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            jgen.writeFieldName("Karl");
        }
    }

    public static class NotKarlBean
    {
        public Map<String,Integer> map = new HashMap<String,Integer>();
        {
            map.put("Not Karl", 1);
        }
    }

    public static class KarlBean
    {
        @JsonSerialize(keyUsing = KarlSerializer.class)
        public Map<String,Integer> map = new HashMap<String,Integer>();
        {
            map.put("Not Karl", 1);
        }
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
    

    

    // [Issue#75]: caching of KeySerializers
    
}
