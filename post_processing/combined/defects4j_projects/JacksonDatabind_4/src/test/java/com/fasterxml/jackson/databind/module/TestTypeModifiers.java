package com.fasterxml.jackson.databind.module;

import java.io.IOException;
import java.lang.reflect.Type;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.*;

@SuppressWarnings("serial")
public class TestTypeModifiers extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    static class ModifierModule extends SimpleModule
    {
        public ModifierModule() {
            super("test", Version.unknownVersion());
        }

        @Override
        public void setupModule(SetupContext context)
        {
            context.addSerializers(new Serializers.Base() {
                @Override
                public JsonSerializer<?> findMapLikeSerializer(SerializationConfig config,
                        MapLikeType type, BeanDescription beanDesc,
                        JsonSerializer<Object> keySerializer,
                        TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer)
                {
                    if (MapMarker.class.isAssignableFrom(type.getRawClass())) {
                        return new MyMapSerializer(keySerializer, elementValueSerializer);
                    }
                    return null;
                }

                @Override
                public JsonSerializer<?> findCollectionLikeSerializer(SerializationConfig config,
                        CollectionLikeType type, BeanDescription beanDesc,
                        TypeSerializer elementTypeSerializer, JsonSerializer<Object> elementValueSerializer)
                {
                    if (CollectionMarker.class.isAssignableFrom(type.getRawClass())) {
                        return new MyCollectionSerializer();
                    }
                    return null;
                }
            });
            context.addDeserializers(new SimpleDeserializers() {
                @Override
                public JsonDeserializer<?> findCollectionLikeDeserializer(CollectionLikeType type, DeserializationConfig config,
                        BeanDescription beanDesc, TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer)
                    throws JsonMappingException
                {
                    if (CollectionMarker.class.isAssignableFrom(type.getRawClass())) {
                        return new MyCollectionDeserializer();
                    }
                    return null;
                }
                @Override
                public JsonDeserializer<?> findMapLikeDeserializer(MapLikeType type, DeserializationConfig config,
                        BeanDescription beanDesc, KeyDeserializer keyDeserializer,
                        TypeDeserializer elementTypeDeserializer, JsonDeserializer<?> elementDeserializer)
                    throws JsonMappingException
                {
                    if (MapMarker.class.isAssignableFrom(type.getRawClass())) {
                        return new MyMapDeserializer();
                    }
                    return null;
                }
            });
        }
    }

    static class XxxSerializer extends JsonSerializer<Object>
    {
        @Override
        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            jgen.writeString("xxx:"+value);
        }
    }
    
    interface MapMarker<K,V> {
        public K getKey();
        public V getValue();
    }
    interface CollectionMarker<V> {
        public V getValue();
    }

    @JsonSerialize(contentUsing=XxxSerializer.class)
    static class MyMapLikeType implements MapMarker<String,Integer> {
        public String key;
        public int value;

        public MyMapLikeType() { }
        public MyMapLikeType(String k, int v) {
            key = k;
            value = v;
        }

        @Override
        public String getKey() { return key; }
        @Override
        public Integer getValue() { return value; }
    }

    static class MyCollectionLikeType implements CollectionMarker<Integer>
    {
        public int value;

        public MyCollectionLikeType() { }
        public MyCollectionLikeType(int v) {
            value = v;
        }

        @Override
        public Integer getValue() { return value; }
    }

    static class MyMapSerializer extends JsonSerializer<MapMarker<?,?>>
    {
        protected final JsonSerializer<Object> _keySerializer;
        protected final JsonSerializer<Object> _valueSerializer;
        
        public MyMapSerializer(JsonSerializer<Object> keySer, JsonSerializer<Object> valueSer) {
            _keySerializer = keySer;
            _valueSerializer = valueSer;
        }
        
        @Override
        public void serialize(MapMarker<?,?> value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            jgen.writeStartObject();
            if (_keySerializer == null) {
                jgen.writeFieldName((String) value.getKey());
            } else {
                _keySerializer.serialize(value.getKey(), jgen, provider);
            }
            if (_valueSerializer == null) {
                jgen.writeNumber(((Number) value.getValue()).intValue());
            } else {
                _valueSerializer.serialize(value.getValue(), jgen, provider);
            }
            jgen.writeEndObject();
        }
    }
    static class MyMapDeserializer extends JsonDeserializer<MapMarker<?,?>>
    {
        @Override
        public MapMarker<?,?> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
            if (jp.getCurrentToken() != JsonToken.START_OBJECT) throw new IOException("Wrong token: "+jp.getCurrentToken());
            if (jp.nextToken() != JsonToken.FIELD_NAME) throw new IOException("Wrong token: "+jp.getCurrentToken());
            String key = jp.getCurrentName();
            if (jp.nextToken() != JsonToken.VALUE_NUMBER_INT) throw new IOException("Wrong token: "+jp.getCurrentToken());
            int value = jp.getIntValue();
            if (jp.nextToken() != JsonToken.END_OBJECT) throw new IOException("Wrong token: "+jp.getCurrentToken());
            return new MyMapLikeType(key, value);
        }        
    }

    static class MyCollectionSerializer extends JsonSerializer<MyCollectionLikeType>
    {
        @Override
        public void serialize(MyCollectionLikeType value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            jgen.writeStartArray();
            jgen.writeNumber(value.value);
            jgen.writeEndArray();
        }
    }
    static class MyCollectionDeserializer extends JsonDeserializer<MyCollectionLikeType>
    {
        @Override
        public MyCollectionLikeType deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
            if (jp.getCurrentToken() != JsonToken.START_ARRAY) throw new IOException("Wrong token: "+jp.getCurrentToken());
            if (jp.nextToken() != JsonToken.VALUE_NUMBER_INT) throw new IOException("Wrong token: "+jp.getCurrentToken());
            int value = jp.getIntValue();
            if (jp.nextToken() != JsonToken.END_ARRAY) throw new IOException("Wrong token: "+jp.getCurrentToken());
            return new MyCollectionLikeType(value);
        }        
    }
    
    static class MyTypeModifier extends TypeModifier
    {
        @Override
        public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory)
        {
            Class<?> raw = type.getRawClass();
            if (MapMarker.class.isAssignableFrom(raw)) {
                JavaType[] params = typeFactory.findTypeParameters(type, MapMarker.class);
                return typeFactory.constructMapLikeType(raw, params[0], params[1]);
            }
            if (CollectionMarker.class.isAssignableFrom(raw)) {
                JavaType[] params = typeFactory.findTypeParameters(type, CollectionMarker.class);
                return typeFactory.constructCollectionLikeType(raw, params[0]);
            }
            return type;
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    /**
     * Basic test for ensuring that we can get "xxx-like" types recognized.
     */
public void testCollectionLikeDeserialization184() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.setTypeFactory(mapper.getTypeFactory().withModifier(new MyTypeModifier())); 
     mapper.registerModule(new ModifierModule()); 
     MyMapLikeType result = mapper.readValue("{\"a\":13}", MyMapLikeType.class); 
     assertEquals("a", result.getKey()); 
     assertEquals(Integer.valueOf(13), result.getValue()); 
 }
public void testMapLikeDeserialization186() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.setTypeFactory(mapper.getTypeFactory().withModifier(new MyTypeModifier())); 
     mapper.registerModule(new ModifierModule()); 
     MyCollectionLikeType result = mapper.readValue("[-37]", MyCollectionLikeType.class); 
     assertEquals(Integer.valueOf(-37), result.getValue()); 
 }
    

    

    


    

    
}