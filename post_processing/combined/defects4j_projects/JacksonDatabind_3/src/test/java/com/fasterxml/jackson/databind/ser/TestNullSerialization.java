package com.fasterxml.jackson.databind.ser;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

public class TestNullSerialization
    extends BaseMapTest
{
    static class NullSerializer extends JsonSerializer<Object>
    {
        @Override
        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException
        {
            jgen.writeString("foobar");
        }
    }

    static class Bean1 {
        public String name = null;
    }

    static class Bean2 {
        public String type = null;
    }
    
    @SuppressWarnings("serial")
    static class MyNullProvider extends DefaultSerializerProvider
    {
        public MyNullProvider() { super(); }
        public MyNullProvider(MyNullProvider base, SerializationConfig config, SerializerFactory jsf) {
            super(base, config, jsf);
        }
        
        @Override
        public DefaultSerializerProvider createInstance(SerializationConfig config, SerializerFactory jsf) {
            return new MyNullProvider(this, config, jsf);
        }
        
        @Override
        public JsonSerializer<Object> findNullValueSerializer(BeanProperty property)
            throws JsonMappingException
        {
            if ("name".equals(property.getName())) {
                return new NullSerializer();
            }
            return super.findNullValueSerializer(property);
        }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
    

    

    
}
