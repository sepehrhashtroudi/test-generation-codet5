package com.fasterxml.jackson.databind.deser;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Testing for [JACKSON-237] (NPE due to race condition)
 */
public class TestConcurrency extends BaseMapTest
{
    /*
    /**********************************************
    /* Helper beans
    /**********************************************
     */

    @JsonDeserialize(using=BeanDeserializer.class)
    static class Bean
    {
        public int value = 42;
    }

    /*
    /**********************************************
    /* Helper classes
    /**********************************************
     */
    
    /**
     * Dummy deserializer used for verifying that partially handled (i.e. not yet
     * resolved) deserializers are not allowed to be used.
     */
    static class BeanDeserializer
        extends JsonDeserializer<Bean>
        implements ResolvableDeserializer
    {
        protected volatile boolean resolved = false;
        
        @Override
        public Bean deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
        {
            if (!resolved) {
                throw new IOException("Deserializer not yet completely resolved");
            }
            Bean b = new Bean();
            b.value = 13;
            return b;
        }

        @Override
        public void resolve(DeserializationContext ctxt) throws JsonMappingException
        {
            try {
                Thread.sleep(100L);
            } catch (Exception e) { }
            resolved = true;
        }
    }

    /*
    /**********************************************
    /* Unit tests
    /**********************************************
     */

    
}
