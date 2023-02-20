package com.fasterxml.jackson.databind.jsontype;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TestWithGenerics extends BaseMapTest
{
    @JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "object-type")
    @JsonSubTypes( { @Type(value = Dog.class, name = "doggy") })
    static abstract class Animal {
        public String name;
    }    

    static class Dog extends Animal {
        public int boneCount;

        public Dog(String name, int b) {
            super();
            this.name = name;
            boneCount = b;
        }
    }

    static class ContainerWithGetter<T extends Animal> {
        private T animal;

        public ContainerWithGetter(T a) { animal = a; }

        public T getAnimal() { return animal; }
    }

    static class ContainerWithField<T extends Animal> {
        public T animal;

        public ContainerWithField(T a) { animal = a; }
    }
    
    // Beans for [JACKSON-387], [JACKSON-430]
    
    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@classAttr1")
    static class MyClass {
        public List<MyParam<?>> params = new ArrayList<MyParam<?>>();
    }

    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@classAttr2")
    static class MyParam<T>{
        public T value;

        public MyParam() { }
        public MyParam(T v) { value = v; }
    }

    private static class SomeObject {
        @SuppressWarnings("unused")
        public String someValue = UUID.randomUUID().toString();
    }
    
    // Beans for [JACKSON-430]
    
    static class CustomJsonSerializer extends JsonSerializer<Object>
        implements ResolvableSerializer
    {
        private final JsonSerializer<Object> beanSerializer;
    
        public CustomJsonSerializer( JsonSerializer<Object> beanSerializer ) { this.beanSerializer = beanSerializer; }
    
        @Override
        public void serialize( Object value, JsonGenerator jgen, SerializerProvider provider )
            throws IOException, JsonProcessingException
        {
            beanSerializer.serialize( value, jgen, provider );
        }
    
        @Override
        public Class<Object> handledType() { return beanSerializer.handledType(); }
    
        @Override
        public void serializeWithType( Object value, JsonGenerator jgen, SerializerProvider provider, TypeSerializer typeSer )
            throws IOException, JsonProcessingException
        {
            beanSerializer.serializeWithType( value, jgen, provider, typeSer );
        }

        @Override
        public void resolve(SerializerProvider provider) throws JsonMappingException
        {
            if (beanSerializer instanceof ResolvableSerializer) {
                ((ResolvableSerializer) beanSerializer).resolve(provider);
            }
        }
    }
    
    @SuppressWarnings("serial")
    protected static class CustomJsonSerializerFactory extends BeanSerializerFactory
    {
        public CustomJsonSerializerFactory() { super(null); }

        @Override
        protected JsonSerializer<Object> constructBeanSerializer(SerializerProvider prov,
                BeanDescription beanDesc)
            throws JsonMappingException
        {                
            return new CustomJsonSerializer(super.constructBeanSerializer(prov, beanDesc) );
        }
    }

    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    

    
    
    
    
    

    
}
