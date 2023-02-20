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

public void testNumbersToEnums181() throws Exception { 
     assertFalse(MAPPER.getDeserializationConfig().isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)); 
     TestEnum value = MAPPER.readValue("1", TestEnum.class); 
     assertSame(TestEnum.RULES, value); 
     ObjectMapper m = new ObjectMapper(); 
     m.configure(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS, true); 
     try { 
         value = m.readValue("1", TestEnum.class); 
         fail("Expected an error"); 
     } catch (JsonMappingException e) { 
         verifyException(e, "Not allowed to deserialize Enum value out of JSON number"); 
     } 
 }
public void testToStringEnumWithEnumMap200() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true); 
     EnumMap<LowerCaseEnum, String> m = new EnumMap<LowerCaseEnum, String>(LowerCaseEnum.class); 
     m.put(LowerCaseEnum.C, "value"); 
     assertEquals("{\"c\":\"value\"}", mapper.writeValueAsString(m)); 
 }
public void testEnumWithCreatorEnumSets229() throws Exception { 
     EnumSet<EnumWithCreator> value = MAPPER.readValue("[\"enumA\"]", new TypeReference<EnumSet<EnumWithCreator>>() { 
     }); 
     assertTrue(value.contains(EnumWithCreator.A)); 
 }
public void testAllowUnknownEnumValuesAsMapKeysReadAsNull255() throws Exception { 
     ObjectReader reader = MAPPER.reader(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL); 
     ClassWithEnumMapKey result = reader.withType(ClassWithEnumMapKey.class).readValue("{\"map\":{\"NO-SUCH-VALUE\":\"val\"}}"); 
     assertTrue(result.map.containsKey(null)); 
 }
public void testDoNotAllowUnknownEnumValuesAsMapKeysWhenReadAsNullDisabled256() throws Exception { 
     assertFalse(MAPPER.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)); 
     try { 
         MAPPER.readValue("{\"map\":{\"NO-SUCH-VALUE\":\"val\"}}", ClassWithEnumMapKey.class); 
         fail("Expected an exception for bogus enum value..."); 
     } catch (JsonMappingException jex) { 
         verifyException(jex, "Can not construct Map key"); 
     } 
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
