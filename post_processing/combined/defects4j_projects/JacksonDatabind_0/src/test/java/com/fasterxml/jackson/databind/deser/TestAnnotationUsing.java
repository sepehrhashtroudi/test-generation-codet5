package com.fasterxml.jackson.databind.deser;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.core.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/**
 * Unit test suite that tests "usingXxx" properties of
 * {@link JsonDeserialize} annotation.
 */
@SuppressWarnings("serial")
public class TestAnnotationUsing
    extends BaseMapTest
{
    /*
    /**********************************************************************
    /* Annotated Bean classes
    /**********************************************************************
     */

    /**
     * Class for testing {@link JsonDeserializer} annotation
     * for class itself.
     */
    @JsonDeserialize(using=ValueDeserializer.class)
    final static class ValueClass {
        int _a;
        
        /* we'll test it by not having default no-arg ctor, and leaving
         * out single-int-arg ctor (because deserializer would use that too)
         */
        public ValueClass(int a, int b) {
            _a = a;
        }
    }

    /**
     * Class for testing {@link JsonDeserializer} annotation
     * for a method
     */
    final static class MethodBean {
        int[] _ints;

        /* Note: could be made to work otherwise, except that
         * to trigger failure (in absence of annotation) Json
         * is of type VALUE_NUMBER_INT, not an Array: array would
         * work by default, but scalar not
         */
        @JsonDeserialize(using=IntsDeserializer.class)
        public void setInts(int[] i) {
            _ints = i;
        }
    }

    static class ArrayBean {
        @JsonDeserialize(contentUsing=ValueDeserializer.class)
        public Object[] values;
    }


    static class ListBean {
        @JsonDeserialize(contentUsing=ValueDeserializer.class)
        public List<Object> values;
    }

    static class MapBean {
        @JsonDeserialize(contentUsing=ValueDeserializer.class)
        public Map<String,Object> values;
    }

    static class MapKeyBean {
        @JsonDeserialize(keyUsing=MapKeyDeserializer.class)
        public Map<Object,Object> values;
    }

    @JsonDeserialize(keyUsing=MapKeyDeserializer.class, contentUsing=ValueDeserializer.class)
    static class MapKeyMap extends HashMap<Object,Object> { }
    
    /*
    /**********************************************************************
    /* Deserializers
    /**********************************************************************
     */

    static class ValueDeserializer extends StdDeserializer<ValueClass>
    {
        public ValueDeserializer() { super(ValueClass.class); }
        @Override
        public ValueClass deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException
        {
            int i = jp.getIntValue();
            return new ValueClass(i, i);
        }
    }

    private final static class IntsDeserializer extends StdDeserializer<int[]>
    {
        public IntsDeserializer() { super(int[].class); }
        @Override
        public int[] deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException
        {
            return new int[] { jp.getIntValue() };
        }
    }

    private final static class MapKeyDeserializer extends KeyDeserializer
    {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt)
        {
            return new String[] { key };
        }
    }

    /*
    /**********************************************************************
    /* Tests: specifying deserializer of value itself
    /**********************************************************************
     */

    // Unit test to verify that {@link JsonDeserialize#using} annotation works
    // when applied to a class
public void testListContentUsing215() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     ListBean result = m.readValue(" { \"values\" : [ 1, 2, 3 ] } ", ListBean.class); 
     assertNotNull(result); 
     List<Object> obs = result.values; 
     assertNotNull(obs); 
     assertEquals(3, obs.size()); 
     assertEquals(ValueClass.class, obs.get(0).getClass()); 
     assertEquals(1, ((ValueClass) obs.get(0))._a); 
     assertEquals(ValueClass.class, obs.get(1).getClass()); 
     assertEquals(2, ((ValueClass) obs.get(1))._a); 
     assertEquals(ValueClass.class, obs.get(2).getClass()); 
     assertEquals(3, ((ValueClass) obs.get(2))._a); 
 }
    

    // Unit test to verify that {@link JsonDeserialize#using} annotation works
    // when applied to a Method
    

    /*
    /**********************************************************************
    /* Tests: specifying deserializer for keys and/or contents
    /**********************************************************************
     */

    

    

    

    
    
    // @since 1.8
    

}
