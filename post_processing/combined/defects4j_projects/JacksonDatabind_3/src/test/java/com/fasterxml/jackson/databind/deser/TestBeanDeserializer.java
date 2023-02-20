package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;

@SuppressWarnings("serial")
public class TestBeanDeserializer extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    static class Bean {
        public String b = "b";
        public String a = "a";

        public Bean() { }
        public Bean(String a, String b) {
            this.a = a;
            this.b = b;
        }
    }

    static class ModuleImpl extends SimpleModule
    {
        protected BeanDeserializerModifier modifier;
        
        public ModuleImpl(BeanDeserializerModifier modifier)
        {
            super("test", Version.unknownVersion());
            this.modifier = modifier;
        }
        
        @Override
        public void setupModule(SetupContext context)
        {
            super.setupModule(context);
            if (modifier != null) {
                context.addBeanDeserializerModifier(modifier);
            }
        }
    }

    static class RemovingModifier extends BeanDeserializerModifier
    {
        private final String _removedProperty;
        
        public RemovingModifier(String remove) { _removedProperty = remove; }
        
        @Override
        public BeanDeserializerBuilder updateBuilder(DeserializationConfig config,
                BeanDescription beanDesc, BeanDeserializerBuilder builder) {
            builder.addIgnorable(_removedProperty);
            return builder;
        }
    }
    
    static class ReplacingModifier extends BeanDeserializerModifier
    {
        private final JsonDeserializer<?> _deserializer;
        
        public ReplacingModifier(JsonDeserializer<?> s) { _deserializer = s; }
        
        @Override
        public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config,
                BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
            return _deserializer;
        }
    }

    static class BogusBeanDeserializer extends JsonDeserializer<Object>
    {
        private final String a, b;
        
        public BogusBeanDeserializer(String a, String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public Object deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException
        {
            return new Bean(a, b);
        }
    }

    static class Issue476Bean {
        public Issue476Type value1, value2;
    }
    static class Issue476Type {
        public String name, value;
    }
    static class Issue476Deserializer extends BeanDeserializer
        implements ContextualDeserializer
    {
        protected static int propCount;

        public Issue476Deserializer(BeanDeserializer src) {
            super(src);
        }

        @Override
        public JsonDeserializer<?> createContextual(DeserializationContext ctxt,
                BeanProperty property) throws JsonMappingException {
            propCount++;
            return this;
        }        
    }
    public class Issue476DeserializerModifier extends BeanDeserializerModifier {
        @Override
        public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config,
                BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
            if (Issue476Type.class == beanDesc.getBeanClass()) {
                return new Issue476Deserializer((BeanDeserializer)deserializer);
            }
            return super.modifyDeserializer(config, beanDesc, deserializer);
        }        
    }
    public class Issue476Module extends SimpleModule
    {
        public Issue476Module() {
            super("Issue476Module", Version.unknownVersion());
        }
        
        @Override
        public void setupModule(SetupContext context) {
            context.addBeanDeserializerModifier(new Issue476DeserializerModifier());
        }        
    }
    
    // [Issue#121], arrays, collections, maps

    enum EnumABC { A, B, C; }
    
    static class ArrayDeserializerModifier extends BeanDeserializerModifier {
        @Override
        public JsonDeserializer<?> modifyArrayDeserializer(DeserializationConfig config, ArrayType valueType,
                BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
            return (JsonDeserializer<?>) new StdDeserializer<Object>(Object.class) {
                @Override public Object deserialize(JsonParser jp,
                        DeserializationContext ctxt) {
                    return new String[] { "foo" };
                }
            };
        }
    }

    static class CollectionDeserializerModifier extends BeanDeserializerModifier {
        @Override
        public JsonDeserializer<?> modifyCollectionDeserializer(DeserializationConfig config, CollectionType valueType,
                BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
            return (JsonDeserializer<?>) new StdDeserializer<Object>(Object.class) {
                @Override public Object deserialize(JsonParser jp,
                        DeserializationContext ctxt) {
                    ArrayList<String> list = new ArrayList<String>();
                    list.add("foo");
                    return list;
                }
            };
        }
    }

    static class MapDeserializerModifier extends BeanDeserializerModifier {
        @Override
        public JsonDeserializer<?> modifyMapDeserializer(DeserializationConfig config, MapType valueType,
                BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
            return (JsonDeserializer<?>) new StdDeserializer<Object>(Object.class) {
                @Override public Object deserialize(JsonParser jp,
                        DeserializationContext ctxt) {
                    HashMap<String,String> map = new HashMap<String,String>();
                    map.put("a", "foo");
                    return map;
                }
            };
        }
    }

    static class EnumDeserializerModifier extends BeanDeserializerModifier {
        @Override
        public JsonDeserializer<?> modifyEnumDeserializer(DeserializationConfig config, JavaType valueType,
                BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
            return (JsonDeserializer<?>) new StdDeserializer<Object>(Object.class) {
                @Override public Object deserialize(JsonParser jp,
                        DeserializationContext ctxt) {
                    return "foo";
                }
            };
        }
    }

    static class KeyDeserializerModifier extends BeanDeserializerModifier {
        @Override
        public KeyDeserializer modifyKeyDeserializer(DeserializationConfig config, JavaType valueType,
                KeyDeserializer kd) {
            return new KeyDeserializer() {
                @Override
                public Object deserializeKey(String key,
                        DeserializationContext ctxt) throws IOException,
                        JsonProcessingException {
                    return "foo";
                }
            };
        }
    }
    
    /*
    /********************************************************
    /* Unit tests
    /********************************************************
     */

     

    

    

    

    // [Issue#120]
    

    

    

    

    
}
