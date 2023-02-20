package com.fasterxml.jackson.databind.contextual;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Test cases to verify that it is possible to define deserializers
 * that can use contextual information (like field/method
 * annotations) for configuration.
 */
public class TestContextualDeserialization extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    /* NOTE: important; MUST be considered a 'Jackson' annotation to be seen
     * (or recognized otherwise via AnnotationIntrospect.isHandled())
     */
    @Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @JacksonAnnotation
    public @interface Name {
        public String value();
    }
    
    static class StringValue {
        protected String value;
        
        public StringValue(String v) { value = v; }
    }
    
    static class ContextualBean
    {
        @Name("NameA")
        public StringValue a;
        @Name("NameB")
        public StringValue b;
    }
    
    static class ContextualCtorBean
    {
        protected String a, b;

        @JsonCreator
        public ContextualCtorBean(
                @Name("CtorA") @JsonProperty("a") StringValue a,
                @Name("CtorB") @JsonProperty("b") StringValue b)
        {
            this.a = a.value;
            this.b = b.value;
        }
    }

    @Name("Class")
    static class ContextualClassBean
    {
        public StringValue a;

        @Name("NameB")
        public StringValue b;
    }
    
    static class ContextualArrayBean
    {
        @Name("array")
        public StringValue[] beans;
    }
    
    static class ContextualListBean
    {
        @Name("list")
        public List<StringValue> beans;
    }
    
    static class ContextualMapBean
    {
        @Name("map")
        public Map<String, StringValue> beans;
    }
    
    static class MyContextualDeserializer
        extends JsonDeserializer<StringValue>
        implements ContextualDeserializer
    {
        protected final String _fieldName;
        
        public MyContextualDeserializer() { this(""); }
        public MyContextualDeserializer(String fieldName) {
            _fieldName = fieldName;
        }

        @Override
        public StringValue deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
        {
            return new StringValue(""+_fieldName+"="+jp.getText());
        }

        @Override
        public JsonDeserializer<?> createContextual(DeserializationContext ctxt,
                BeanProperty property)
            throws JsonMappingException
        {
            String name = (property == null) ? "NULL" : property.getName();
            return new MyContextualDeserializer(name);
        }
    }

    /**
     * Alternative that uses annotation for choosing name to use
     */
    static class AnnotatedContextualDeserializer
        extends JsonDeserializer<StringValue>
        implements ContextualDeserializer
    {
        protected final String _fieldName;
        
        public AnnotatedContextualDeserializer() { this(""); }
        public AnnotatedContextualDeserializer(String fieldName) {
            _fieldName = fieldName;
        }
    
        @Override
        public StringValue deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
        {
            return new StringValue(""+_fieldName+"="+jp.getText());
        }
    
        @Override
        public JsonDeserializer<?> createContextual(DeserializationContext ctxt,
                BeanProperty property)
            throws JsonMappingException
        {
            Name ann = property.getAnnotation(Name.class);
            if (ann == null) {
                ann = property.getContextAnnotation(Name.class);
            }
            String propertyName = (ann == null) ?  "UNKNOWN" : ann.value();
            return new MyContextualDeserializer(propertyName);
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    

    

    
    
    

    

    

    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private ObjectMapper _mapperWithAnnotatedContextual()
    {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule("test", Version.unknownVersion());
        module.addDeserializer(StringValue.class, new AnnotatedContextualDeserializer());
        mapper.registerModule(module);
        return mapper;
    }
}
