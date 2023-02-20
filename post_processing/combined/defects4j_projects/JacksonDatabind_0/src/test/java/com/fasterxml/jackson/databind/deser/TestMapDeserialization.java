package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

@SuppressWarnings("serial")
public class TestMapDeserialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Test classes, enums
    /**********************************************************
     */

    enum Key {
        KEY1, KEY2, WHATEVER;
    }

    static class BrokenMap
        extends HashMap<Object,Object>
    {
        // No default ctor, nor @JsonCreators
        public BrokenMap(boolean dummy) { super(); }
    }

    @JsonDeserialize(using=MapDeserializer.class)
    static class CustomMap extends LinkedHashMap<String,String> { }

    static class MapDeserializer extends StdDeserializer<CustomMap>
    {
        public MapDeserializer() { super(CustomMap.class); }
        @Override
        public CustomMap deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException
        {
            CustomMap result = new CustomMap();
            result.put("x", jp.getText());
            return result;
        }
    }

    static class KeyType {
        protected String value;
        
        private KeyType(String v, boolean bogus) {
            value = v;
        }

        @JsonCreator
        public static KeyType create(String v) {
            return new KeyType(v, true);
        }
    }

    // Issue #142
    public static class EnumMapContainer {
        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
        public EnumMap<KeyEnum,ITestType> testTypes;
    }

    public static class ListContainer {
        public List<ITestType> testTypes;
    }

    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
    public static interface ITestType { }

    public static enum KeyEnum {
        A, B
    }
    public static enum ConcreteType implements ITestType {
        ONE, TWO;
    }

    
    
    /*
    /**********************************************************
    /* Test methods, untyped (Object valued) maps
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();

public void testSimple219() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     String TEST = "test exception"; 
     Map<String, Object> result = writeAndMap(mapper, new Exception(TEST)); 
     Object ob = result.get("suppressed"); 
     if (ob != null) { 
         assertEquals(5, result.size()); 
     } else { 
         assertEquals(4, result.size()); 
     } 
     assertEquals(TEST, result.get("message")); 
     assertNull(result.get("cause")); 
     assertEquals(TEST, result.get("localizedMessage")); 
     Object traces = result.get("stackTrace"); 
     if (!(traces instanceof List<?>)) { 
         fail("Expected a List for exception member 'stackTrace', got: " + traces); 
     } 
 }
    

    /**
     * Let's also try another way to express "gimme a Map" deserialization;
     * this time by specifying a Map class, to reduce need to cast
     */
    

    /**
     * Unit test for [JACKSON-185]
     */
    

    private static final String UNTYPED_MAP_JSON =
            "{ \"double\":42.0, \"string\":\"string\","
            +"\"boolean\":true, \"list\":[\"list0\"],"
            +"\"null\":null }";
    
    static class ObjectWrapperMap extends HashMap<String, ObjectWrapper> { }
    
    

    
    
    private void _doTestUntyped(final Map<String, ObjectWrapper> map)
    {
       assertEquals(Double.valueOf(42), map.get("double").getObject());
       assertEquals("string", map.get("string").getObject());
       assertEquals(Boolean.TRUE, map.get("boolean").getObject());
       assertEquals(Collections.singletonList("list0"), map.get("list").getObject());
       assertTrue(map.containsKey("null"));
       assertNull(map.get("null"));
       assertEquals(5, map.size());
    }
    
    // [JACKSON-620]: allow "" to mean 'null' for Maps
    

    /*
    /**********************************************************
    /* Test methods, typed maps
    /**********************************************************
     */

    

    /**
     * Let's also check that it is possible to do type conversions
     * to allow use of non-String Map keys.
     */
    

    

    /**
     * Unit test that verifies that it's ok to have incomplete
     * information about Map class itself, as long as it's something
     * we good guess about: for example, <code>Map.Class</code> will
     * be replaced by something like <code>HashMap.class</code>,
     * if given.
     */
    

    /*
    /**********************************************************
    /* Test methods, maps with enums
    /**********************************************************
     */

    

    

    

    /*
    /**********************************************************
    /* Test methods, maps with Date
    /**********************************************************
     */
    
    
    /*
    /**********************************************************
    /* Test methods, maps with various alternative key types
    /**********************************************************
     */

    

    // [JACKSON-726]
    

    

    // Test confirming that @JsonCreator may be used with Map Key types
    
    
    /*
    /**********************************************************
    /* Test methods, annotated Maps
    /**********************************************************
     */

    /**
     * Simple test to ensure that @JsonDeserialize.using is
     * recognized
     */
    

    /*
    /**********************************************************
    /* Error tests
    /**********************************************************
     */

    

    
}
