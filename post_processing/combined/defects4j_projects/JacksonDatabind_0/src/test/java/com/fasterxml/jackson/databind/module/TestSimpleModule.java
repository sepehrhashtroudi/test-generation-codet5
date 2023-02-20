package com.fasterxml.jackson.databind.module;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

@SuppressWarnings("serial")
public class TestSimpleModule extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes; simple beans and their handlers
    /**********************************************************
     */
    
    /**
     * Trivial bean that requires custom serializer and deserializer
     */
    final static class CustomBean
    {
        protected String str;
        protected int num;
        
        public CustomBean(String s, int i) {
            str = s;
            num = i;
        }
    }

    static enum SimpleEnum { A, B; }
    
    // Extend SerializerBase to get access to declared handledType
    static class CustomBeanSerializer extends StdSerializer<CustomBean>
    {
        public CustomBeanSerializer() { super(CustomBean.class); }

        @Override
        public void serialize(CustomBean value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException
        {
            // We will write it as a String, with '|' as delimiter
            jgen.writeString(value.str + "|" + value.num);
        }

        @Override
        public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException {
            return null;
        }
    }
    
    static class CustomBeanDeserializer extends JsonDeserializer<CustomBean>
    {
        @Override
        public CustomBean deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException
        {
            String text = jp.getText();
            int ix = text.indexOf('|');
            if (ix < 0) {
                throw new IOException("Failed to parse String value of \""+text+"\"");
            }
            String str = text.substring(0, ix);
            int num = Integer.parseInt(text.substring(ix+1));
            return new CustomBean(str, num);
        }
    }

    static class SimpleEnumSerializer extends StdSerializer<SimpleEnum>
    {
        public SimpleEnumSerializer() { super(SimpleEnum.class); }

        @Override
        public void serialize(SimpleEnum value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException
        {
            jgen.writeString(value.name().toLowerCase());
        }

        @Override
        public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException {
            return null;
        }
    }

    static class SimpleEnumDeserializer extends JsonDeserializer<SimpleEnum>
    {
        @Override
        public SimpleEnum deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException
        {
            return SimpleEnum.valueOf(jp.getText().toUpperCase());
        }
    }

    interface Base {
        public String getText();
    }
    
    static class Impl1 implements Base {
        @Override
        public String getText() { return "1"; }
    }

    static class Impl2 extends Impl1 {
        @Override
        public String getText() { return "2"; }
    }

    static class BaseSerializer extends StdScalarSerializer<Base>
    {
        public BaseSerializer() { super(Base.class); }
        
        @Override
        public void serialize(Base value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            jgen.writeString("Base:"+value.getText());
        }
    }

    static class MixableBean {
        public int a = 1;
        public int b = 2;
        public int c = 3;
    }

    @JsonPropertyOrder({"c", "a", "b"})
    static class MixInForOrder { }
    
    protected static class MySimpleSerializers extends SimpleSerializers { }
    protected static class MySimpleDeserializers extends SimpleDeserializers { }

    /**
     * Test module which uses custom 'serializers' and 'deserializers' container; used
     * to trigger type problems.
     */
    protected static class MySimpleModule extends SimpleModule
    {
        public MySimpleModule(String name, Version version) {
            super(name, version);
            _deserializers = new MySimpleDeserializers();
            _serializers = new MySimpleSerializers();
        }
    }

    protected static class ContextVerifierModule extends Module
    {
        @Override
        public String getModuleName() { return "x"; }

        @Override
        public Version version() { return Version.unknownVersion(); }

        @Override
        public void setupModule(SetupContext context)
        {
            ObjectCodec c = context.getOwner();
            assertNotNull(c);
            assertTrue(c instanceof ObjectMapper);
            ObjectMapper m = context.getOwner();
            assertNotNull(m);
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests; first, verifying need for custom handlers
    /**********************************************************
     */

    /**
     * Basic test to ensure we do not have functioning default
     * serializers for custom types used in tests.
     */
public void testSimpleEnumSerializer123() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     SimpleModule mod = new SimpleModule("test", Version.unknownVersion()); 
     mod.addSerializer(new SimpleEnumSerializer()); 
     mapper.registerModule(mod); 
     assertEquals(quote("b"), mapper.writeValueAsString(SimpleEnum.B)); 
 }
    
    
    /*
    /**********************************************************
    /* Unit tests; simple serializers
    /**********************************************************
     */
    
    

    

    // for [JACKSON-550]
    
    
    /*
    /**********************************************************
    /* Unit tests; simple deserializers
    /**********************************************************
     */
    
    

    
 
    // Simple verification of [JACKSON-455]
    

    /*
    /**********************************************************
    /* Unit tests; other
    /**********************************************************
     */
    
    // [JACKSON-644]: ability to register mix-ins
    

    // [JACKSON-686]
    
}

