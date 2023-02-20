package com.fasterxml.jackson.databind.jsontype;

import java.util.Date;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

// Tests for [JACKSON-453]
public class TestExternalId extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */
    
    static class ExternalBean
    {
        @JsonTypeInfo(use=Id.NAME, include=As.EXTERNAL_PROPERTY, property="extType")
        public Object bean;

        public ExternalBean() { }
        public ExternalBean(int v) {
            bean = new ValueBean(v);
        }
    }

    // for [Issue#96]
    static class ExternalBeanWithDefault
    {
        @JsonTypeInfo(use=Id.CLASS, include=As.EXTERNAL_PROPERTY, property="extType",
                defaultImpl=ValueBean.class)
        public Object bean;

        public ExternalBeanWithDefault() { }
        public ExternalBeanWithDefault(int v) {
            bean = new ValueBean(v);
        }
    }

    static class ExternalBean3
    {
        @JsonTypeInfo(use=Id.NAME, include=As.EXTERNAL_PROPERTY, property="extType1")
        public Object value1;
        
        @JsonTypeInfo(use=Id.NAME, include=As.EXTERNAL_PROPERTY, property="extType2")
        public Object value2;

        public int foo;
        
        @JsonTypeInfo(use=Id.NAME, include=As.EXTERNAL_PROPERTY, property="extType3")
        public Object value3;
        
        public ExternalBean3() { }
        public ExternalBean3(int v) {
            value1 = new ValueBean(v);
            value2 = new ValueBean(v+1);
            value3 = new ValueBean(v+2);
            foo = v;
        }
    }

    static class ExternalBeanWithCreator
    {
        @JsonTypeInfo(use=Id.NAME, include=As.EXTERNAL_PROPERTY, property="extType")
        public Object value;

        public int foo;
        
        @JsonCreator
        public ExternalBeanWithCreator(@JsonProperty("foo") int f)
        {
            foo = f;
            value = new ValueBean(f);
        }
    }
    
    @JsonTypeName("vbean")
    static class ValueBean {
        public int value;
        
        public ValueBean() { }
        public ValueBean(int v) { value = v; }
    }

    @JsonTypeName("funk")
    @JsonTypeInfo(use=Id.NAME, include=As.EXTERNAL_PROPERTY, property="extType")
    static class FunkyExternalBean {
        public int i = 3;
    }

    // [JACKSON-798]: problems with polymorphic types, external prop

    @JsonSubTypes(value= { @JsonSubTypes.Type(value=Derived1.class, name="d1"),
            @JsonSubTypes.Type(value=Derived2.class, name="d2") })
    interface Base {
        String getBaseProperty();
    }
  
    static class Derived1 implements Base {
        private String derived1Property;
        private String baseProperty;
        protected  Derived1() { throw new IllegalStateException("wrong constructor called"); }
        
        @JsonCreator
        public Derived1(@JsonProperty("derived1Property") String d1p,
                        @JsonProperty("baseProperty") String bp) {
            derived1Property = d1p;
            baseProperty = bp;
        }

        @Override
        @JsonProperty public String getBaseProperty() {
            return baseProperty;
        }

        @JsonProperty public String getDerived1Property() {
            return derived1Property;
        }
    }

    static class Derived2 implements Base {
        private String derived2Property;
        private String baseProperty;
        protected  Derived2() { throw new IllegalStateException("wrong constructor called"); }

        @JsonCreator
        public Derived2(@JsonProperty("derived2Property") String d2p,
                        @JsonProperty("baseProperty") String bp) {
            derived2Property = d2p;
            baseProperty = bp;
        }

        @Override
        @JsonProperty public String getBaseProperty() {
            return baseProperty;
        }

        @JsonProperty public String getDerived2Property() {
            return derived2Property;
        }
    }
    
    static class BaseContainer {
        protected final Base base;
        protected final String baseContainerProperty;
        protected BaseContainer() { throw new IllegalStateException("wrong constructor called"); }

        @JsonCreator
        public BaseContainer(@JsonProperty("baseContainerProperty") String bcp, @JsonProperty("base") Base b) {
            baseContainerProperty = bcp;
            base = b;
        }

        @JsonProperty
        public String getBaseContainerProperty() { return baseContainerProperty; }

        @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.EXTERNAL_PROPERTY, property="type")
        @JsonProperty
        public Base getBase() { return base; }
    }

    // [JACKSON-831]: should allow a property to map id to as well
    
    interface Pet {}

    static class Dog implements Pet {
        public String name;
    }

    static class House831 {
        protected String petType;

        @JsonTypeInfo(use = Id.NAME, include = As.EXTERNAL_PROPERTY, property = "petType")
        @JsonSubTypes({@JsonSubTypes.Type(name = "dog", value = Dog.class)})
        public Pet pet;

        public String getPetType() {
            return petType;
        }

        public void setPetType(String petType) {
            this.petType = petType;
        }
    }    

    // for [Issue#118]
    static class ExternalTypeWithNonPOJO {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
                property = "type",
                visible = true,
                include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
                defaultImpl = String.class)
        @JsonSubTypes({
            @JsonSubTypes.Type(value = Date.class, name = "date"),
            @JsonSubTypes.Type(value = AsValueThingy.class, name = "thingy")
        })
        public Object value;

        public ExternalTypeWithNonPOJO() { }
        public ExternalTypeWithNonPOJO(Object o) { value = o; }
    }    

    // for [Issue#119]
    static class AsValueThingy {
        public long rawDate;

        public AsValueThingy(long l) { rawDate = l; }
        public AsValueThingy() { }
        
        @JsonValue public Date serialization() {
            return new Date(rawDate);
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests, serialization
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
public void testIssue83197() throws Exception { 
     final String JSON = "{ \"petType\": \"dog\",\n" + "\"pet\": { \"name\": \"Pluto\" }\n}"; 
     House831 result = MAPPER.readValue(JSON, House831.class); 
     assertNotNull(result); 
     assertNotNull(result.pet); 
     assertSame(Dog.class, result.pet.getClass()); 
     assertEquals("dog", result.petType); 
 }
public void testSimple101() throws Exception { 
     ExternalTypeWithNonPOJO input = new ExternalTypeWithNonPOJO(Integer.valueOf(13)); 
     String json = MAPPER.writeValueAsString(input); 
     assertNotNull(json); 
     ExternalTypeWithNonPOJO result = MAPPER.readValue(json, ExternalTypeWithNonPOJO.class); 
     assertNotNull(result.value); 
     assertTrue(result.value instanceof Integer); 
     input = new ExternalTypeWithNonPOJO(Boolean.TRUE); 
     json = MAPPER.writeValueAsString(input); 
     assertNotNull(json); 
     result = MAPPER.readValue(json, ExternalTypeWithNonPOJO.class); 
     assertNotNull(result.value); 
     assertTrue(result.value instanceof Boolean); 
     input = new ExternalTypeWithNonPOJO("foobar"); 
     json = MAPPER.writeValueAsString(input); 
     assertNotNull(json); 
     result = MAPPER.readValue(json, ExternalTypeWithNonPOJO.class); 
     assertNotNull(result.value); 
     assertTrue(result.value instanceof String); 
     assertEquals("foobar", result.value); 
 }
public void testSimpleExternalTypeWithCreator102() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.registerSubtypes(ValueBean.class); 
     String json = mapper.writeValueAsString(new ExternalBeanWithCreator(7)); 
     ExternalBeanWithCreator result = mapper.readValue(json, ExternalBeanWithCreator.class); 
     assertNotNull(result); 
     assertNotNull(result.value); 
     assertEquals(7, ((ValueBean) result.value).value); 
     assertEquals(7, result.foo); 
 }
    

    // If trying to use with Class, should just become "PROPERTY" instead:
    

    /*
    /**********************************************************
    /* Unit tests, deserialization
    /**********************************************************
     */
    
    

    // Test for verifying that it's ok to have multiple (say, 3)
    // externally typed things, mixed with other stuff...
    

    // Also, it should be ok to use @JsonCreator as well...
    
    
    // If trying to use with Class, should just become "PROPERTY" instead:
    

    

    // There seems to be some problems if type is also visible...
    

    // For [Issue#96]: should allow use of default impl, if property missing
    /* 18-Jan-2013, tatu: Unfortunately this collides with [Issue#118], and I don't
     *   know what the best resolution is. For now at least 
     */
    /*
    public void testWithDefaultAndMissing() throws Exception
    {
        ExternalBeanWithDefault input = new ExternalBeanWithDefault(13);
        // baseline: include type, verify things work:
        String fullJson = MAPPER.writeValueAsString(input);
        ExternalBeanWithDefault output = MAPPER.readValue(fullJson, ExternalBeanWithDefault.class);
        assertNotNull(output);
        assertNotNull(output.bean);
        // and then try without type info...
        ExternalBeanWithDefault defaulted = MAPPER.readValue("{\"bean\":{\"value\":13}}",
                ExternalBeanWithDefault.class);
        assertNotNull(defaulted);
        assertNotNull(defaulted.bean);
        assertSame(ValueBean.class, defaulted.bean.getClass());
    }
    */

    // For [Issue#118]
    // Note: String works fine, since no type id will used; other scalar types have issues
    

    // For [Issue#118] using "natural" type(s)
    
    
    // For [Issue#119]... and bit of [#167] as well
    
}
