package com.fasterxml.jackson.databind.deser;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

@SuppressWarnings("serial")
public class TestEnumDeserialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes, enums
    /**********************************************************
     */

    enum TestEnum { JACKSON, RULES, OK; }

    /**
     * Alternative version that annotates which deserializer to use
     */
    @JsonDeserialize(using=DummySerializer.class)
    enum AnnotatedTestEnum {
        JACKSON, RULES, OK;
    }

    public static class DummySerializer extends StdDeserializer<Object>
    {
        public DummySerializer() { super(Object.class); }
        @Override
        public Object deserialize(JsonParser jp, DeserializationContext ctxt)
        {
            return AnnotatedTestEnum.OK;
        }
    }

    protected enum EnumWithCreator {
        A, B;

        @JsonCreator
        public static EnumWithCreator fromEnum(String str) {
            if ("enumA".equals(str)) return A;
            if ("enumB".equals(str)) return B;
            return null;
        }
    }
    
    protected enum LowerCaseEnum {
        A, B, C;
        private LowerCaseEnum() { }
        @Override
        public String toString() { return name().toLowerCase(); }
    }

    // for [JACKSON-749]
    protected enum EnumWithJsonValue {
        A("foo"), B("bar");
        private final String name;
        private EnumWithJsonValue(String n) {
            name = n;
        }
        @JsonValue
        @Override
        public String toString() { return name; }
    }
    
    // [JACKSON-810]
    static class ClassWithEnumMapKey {
    	@JsonProperty Map<TestEnum, String> map;
    }

    // [JACKSON-834]
    protected enum TestEnumFor834
    {
        ENUM_A(1), ENUM_B(2), ENUM_C(3);
        
        private final int id;
        
        private TestEnumFor834(int id) {
            this.id = id;
        }
        
        @JsonCreator public static TestEnumFor834 fromId(int id) {
            for (TestEnumFor834 e: values()) {
                if (e.id == id) return e;
            }
            return null;
        }
    }

    /*
    /**********************************************************
    /* Tests
    /**********************************************************
     */

    protected final ObjectMapper MAPPER = new ObjectMapper();

public void testAllowUnknownEnumValuesAsMapKeysReadAsNull263() throws Exception { 
     ObjectReader reader = MAPPER.reader(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL); 
     ClassWithEnumMapKey result = reader.withType(ClassWithEnumMapKey.class).readValue("{\"map\":{\"NO-SUCH-VALUE\":\"val\"}}"); 
     assertTrue(result.map.containsKey(null)); 
 }
public void testEnumsWithJsonValue265() throws Exception { 
     EnumWithJsonValue e = MAPPER.readValue(quote("foo"), EnumWithJsonValue.class); 
     assertSame(EnumWithJsonValue.A, e); 
     e = MAPPER.readValue(quote("bar"), EnumWithJsonValue.class); 
     assertSame(EnumWithJsonValue.B, e); 
     EnumSet<EnumWithJsonValue> set = MAPPER.readValue("[\"bar\"]", new TypeReference<EnumSet<EnumWithJsonValue>>() { 
     }); 
     assertNotNull(set); 
     assertEquals(1, set.size()); 
     assertTrue(set.contains(EnumWithJsonValue.B)); 
     assertFalse(set.contains(EnumWithJsonValue.A)); 
     EnumMap<EnumWithJsonValue, Integer> map = MAPPER.readValue("{\"foo\":13}", new TypeReference<EnumMap<EnumWithJsonValue, Integer>>() { 
     }); 
     assertNotNull(map); 
     assertEquals(1, map.size()); 
     assertEquals(Integer.valueOf(13), map.get(EnumWithJsonValue.A)); 
 }
    

    /**
     * Enums are considered complex if they have code (and hence sub-classes)... an
     * example is TimeUnit
     */
    
    
    /**
     * Testing to see that annotation override works
     */
    

    
    
    // Test [JACKSON-214]
    

    // [JACKSON-193]
    
    
    // [JACKSON-212]
    

    // [JACKSON-212]
    

    // [JACKSON-412], disallow use of numbers
    

    // [JACKSON-684], enums using index
    
    
    // [JACKSON-749]: @JsonValue should be considered as well
    

    // [JACKSON-756], next three tests

    

    

    

    // [JACKSON-810], ability to ignore unknown Enum values:

    

    
    
    
    
    

    // [JACKSON-834]
    

    // [Issue#141]: allow mapping of empty String into null
    

}
