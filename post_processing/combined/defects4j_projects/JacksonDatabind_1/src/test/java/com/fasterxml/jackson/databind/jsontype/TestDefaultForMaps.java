package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TestDefaultForMaps 
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    static class MapKey {
        public String key;

        public MapKey(String k) { key = k; }

        @Override public String toString() { return key; }
    }

    static class MapKeyDeserializer extends KeyDeserializer
    {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return new MapKey(key);
        }
    }
    
    static class MapHolder
    {
        @JsonDeserialize(keyAs=MapKey.class, keyUsing=MapKeyDeserializer.class)
        public Map<MapKey,List<Object>> map;
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
    

    protected TypeNameIdResolver createTypeNameIdResolver(boolean forSerialization)
    {
        Collection<NamedType> subtypes = new ArrayList<NamedType>();
        subtypes.add(new NamedType(MapHolder.class, "mapHolder"));
        subtypes.add(new NamedType(ArrayList.class, "AList"));
        subtypes.add(new NamedType(HashMap.class, "HMap"));
        ObjectMapper mapper = new ObjectMapper();
        return TypeNameIdResolver.construct(mapper.getDeserializationConfig(),
                TypeFactory.defaultInstance().constructType(Object.class), subtypes, forSerialization, !forSerialization);
    }
}
