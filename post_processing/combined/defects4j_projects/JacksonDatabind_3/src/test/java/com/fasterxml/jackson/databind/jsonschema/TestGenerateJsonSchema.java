package com.fasterxml.jackson.databind.jsonschema;

import java.util.Collection;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

/**
 * @author Ryan Heaton
 */
@SuppressWarnings("deprecation")
public class TestGenerateJsonSchema
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    public static class SimpleBean
    {
        private int property1;
        private String property2;
        private String[] property3;
        private Collection<Float> property4;
        @JsonProperty(required=true)
        private String property5;
        
        public int getProperty1()
        {
            return property1;
        }

        public void setProperty1(int property1)
        {
            this.property1 = property1;
        }

        public String getProperty2()
        {
            return property2;
        }

        public void setProperty2(String property2)
        {
            this.property2 = property2;
        }

        public String[] getProperty3()
        {
            return property3;
        }

        public void setProperty3(String[] property3)
        {
            this.property3 = property3;
        }

        public Collection<Float> getProperty4()
        {
            return property4;
        }

        public void setProperty4(Collection<Float> property4)
        {
            this.property4 = property4;
        }
        
        public String getProperty5()
        {
            return property5;
        }

        public void setProperty5(String property5)
        {
            this.property5 = property5;
        }
    }

    public class TrivialBean {
        public String name;
    }

    @JsonSerializableSchema(id="myType")
    public class BeanWithId {
        public String value;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    /**
     * tests generating json-schema stuff.
     */
public void testSchemaSerialization114() throws Exception { 
     JsonSchema jsonSchema = MAPPER.generateJsonSchema(SimpleBean.class); 
     Map<String, Object> result = writeAndMap(MAPPER, jsonSchema); 
     assertNotNull(result); 
     assertEquals("object", result.get("type")); 
     assertNull(result.get("required")); 
     assertNotNull(result.get("properties")); 
 }
public void testRetain214() { 
     ObjectNode ob = MAPPER.createObjectNode(); 
     ob.put("a", "a"); 
     ob.put("b", "b"); 
     ob.put("c", "c"); 
     assertEquals(3, ob.size()); 
     assertSame(ob, ob.retain("a", "c")); 
     assertEquals(2, ob.size()); 
     assertEquals("a", ob.get("a").textValue()); 
     assertNull(ob.get("b")); 
     assertEquals("c", ob.get("c").textValue()); 
 }
    
    
    @JsonFilter("filteredBean")
    protected static class FilteredBean {
    	
    	@JsonProperty
    	private String secret = "secret";
    	
    	@JsonProperty
    	private String obvious = "obvious";
    	
    	public String getSecret() { return secret; }
    	public void setSecret(String s) { secret = s; }
    	
    	public String getObvious() { return obvious; }
    	public void setObvious(String s) {obvious = s; }
    }
    
    public static FilterProvider secretFilterProvider = new SimpleFilterProvider()
        .addFilter("filteredBean", SimpleBeanPropertyFilter.filterOutAllExcept(new String[]{"obvious"}));

    

    /**
     * Additional unit test for verifying that schema object itself
     * can be properly serialized
     */
    

    

    /**
     * Test for [JACKSON-454]
     */
    

    
}
