package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.databind.*;

/**
 * Tests to verify [JACKSON-437], [JACKSON-762]
 */
public class TestVisibleTypeId extends BaseMapTest
{
    // type id as property, exposed
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY,
            property="type", visible=true)
    @JsonTypeName("BaseType")
    static class PropertyBean {
        public int a = 3;

        protected String type;

        public void setType(String t) { type = t; }
    }

    // as wrapper-array
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.WRAPPER_ARRAY,
            property="type", visible=true)
    @JsonTypeName("ArrayType")
    static class WrapperArrayBean {
        public int a = 1;

        protected String type;

        public void setType(String t) { type = t; }
    }

    // as wrapper-object
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.WRAPPER_OBJECT,
            property="type", visible=true)
    @JsonTypeName("ObjectType")
    static class WrapperObjectBean {
        public int a = 2;

        protected String type;

        public void setType(String t) { type = t; }
    }

    // as external id, bit trickier
    static class ExternalIdWrapper {
        @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.EXTERNAL_PROPERTY,
                property="type", visible=true)
        public ExternalIdBean bean = new ExternalIdBean();
    }
    
    @JsonTypeName("ExternalType")
    static class ExternalIdBean {
        public int a = 2;

        protected String type;

        public void setType(String t) { type = t; }
    }

    // // // [JACKSON-762]: type id from property
    
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY,
            property="type")
    static class TypeIdFromFieldProperty {
        public int a = 3;

        @JsonTypeId
        public String type = "SomeType";
    }

    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.WRAPPER_ARRAY,
            property="type")
    static class TypeIdFromFieldArray {
        public int a = 3;
        @JsonTypeId
        public String type = "SomeType";
    }

    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.WRAPPER_OBJECT,
            property="type")
    static class TypeIdFromMethodObject {
        public int a = 3;
        
        @JsonTypeId
        public String getType() { return "SomeType"; }
    }

    static class ExternalIdWrapper2 {
        @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.EXTERNAL_PROPERTY,
                property="type", visible=true)
        public ExternalIdBean2 bean = new ExternalIdBean2();
    }

    static class ExternalIdBean2 {
        public int a = 2;

        /* Type id property itself can not be external, as it is conceptually
         * part of the bean for which info is written:
         */
        @JsonTypeId
        public String getType() { return "SomeType"; }
    }

    // Invalid definition: multiple type ids
    static class MultipleIds {
        @JsonTypeId
        public String type1 = "type1";

        @JsonTypeId
        public String getType2() { return "type2"; };
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    private final ObjectMapper mapper = new ObjectMapper();
    
public void testVisibleWithProperty47() throws Exception { 
     String json = mapper.writeValueAsString(new PropertyBean()); 
     assertEquals("{\"type\":\"BaseType\",\"a\":3}", json); 
     PropertyBean result = mapper.readValue(json, PropertyBean.class); 
     assertEquals("BaseType", result.type); 
     result = mapper.readValue("{\"a\":7, \"type\":\"BaseType\"}", PropertyBean.class); 
     assertEquals(7, result.a); 
     assertEquals("BaseType", result.type); 
 }
public void testTypeIdFromProperty92() throws Exception { 
     assertEquals("{\"type\":\"SomeType\",\"a\":3}", mapper.writeValueAsString(new TypeIdFromFieldProperty())); 
 }
    

    

    

    

    // [JACKSON-762]

    

    

    

    

    // Failing cases

    
}
