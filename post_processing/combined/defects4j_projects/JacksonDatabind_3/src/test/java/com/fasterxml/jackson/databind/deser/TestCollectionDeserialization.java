package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

@SuppressWarnings("serial")
public class TestCollectionDeserialization
    extends BaseMapTest
{
    enum Key {
        KEY1, KEY2, WHATEVER;
    }

    @JsonDeserialize(using=ListDeserializer.class)
    static class CustomList extends LinkedList<String> { }

    static class ListDeserializer extends StdDeserializer<CustomList>
    {
        public ListDeserializer() { super(CustomList.class); }

        @Override
        public CustomList deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException
        {
            CustomList result = new CustomList();
            result.add(jp.getText());
            return result;
        }
    }

    static class XBean {
        public int x;
    }

    // [Issue#199]
    static class ListAsIterable {
        public Iterable<String> values;
    }

    static class ListAsIterableX {
        public Iterable<XBean> nums;
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    private final static ObjectMapper MAPPER = new ObjectMapper();
    
    

    

    

    /// Test to verify that @JsonDeserialize.using works as expected
    

    // Testing [JACKSON-526], "implicit JSON array" for single-element arrays,
    // mostly produced by Jettison, Badgerfish conversions (from XML)
    

    // [JACKSON-620]: allow "" to mean 'null' for Maps
    

    // [Issue#161]
    

    // [Issue#199]
    

    
}
