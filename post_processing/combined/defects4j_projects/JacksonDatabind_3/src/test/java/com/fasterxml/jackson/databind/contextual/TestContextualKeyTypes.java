package com.fasterxml.jackson.databind.contextual;

import java.io.IOException;
import java.util.*;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Tests to ensure that we can do contextual key serializers and
 * deserializers as well as value ser/deser.
 */
public class TestContextualKeyTypes extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    static class ContextualKeySerializer
        extends JsonSerializer<String>
        implements ContextualSerializer
    {
        protected final String _prefix;
    
        public ContextualKeySerializer() { this(""); }
        public ContextualKeySerializer(String p) {
            _prefix = p;
        }

        @Override
        public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException
        {
            if (_prefix != null) {
                value = _prefix + value;
            }
            jgen.writeFieldName(value);
        }

        @Override
        public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property)
            throws JsonMappingException
        {
            return new ContextualKeySerializer(_prefix+":");
        }
    }

    static class ContextualDeser
        extends KeyDeserializer
        implements ContextualKeyDeserializer
    {
        protected final String _prefix;
        
        protected ContextualDeser(String p) {
            _prefix = p;
        }        

        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt)
                throws IOException, JsonProcessingException
        {
            return _prefix + ":" + key;
        }

        @Override
        public KeyDeserializer createContextual(DeserializationContext ctxt,
                BeanProperty property) throws JsonMappingException
        {
            return new ContextualDeser((property == null) ? "ROOT" : property.getName());
        }
    }

    static class MapBean {
        public Map<String, Integer> map;
    }
    
    /*
    /**********************************************************
    /* Unit tests, serialization
    /**********************************************************
     */

    
    
    /*
    /**********************************************************
    /* Unit tests, deserialization
    /**********************************************************
     */

    
}
