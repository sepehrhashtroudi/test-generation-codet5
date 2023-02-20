package com.fasterxml.jackson.databind.jsontype;


import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class TestSubtypes extends com.fasterxml.jackson.databind.BaseMapTest
{
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME)
    static abstract class SuperType {
    }

    @JsonTypeName("TypeB")
    static class SubB extends SuperType {
        public int b = 1;
    }

    static class SubC extends SuperType {
        public int c = 2;
    }

    static class SubD extends SuperType {
        public int d;
    }

    // "Empty" bean, to test [JACKSON-366]
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME)
    static abstract class BaseBean { }
    
    static class EmptyBean extends BaseBean { }

    static class EmptyNonFinal { }

    // Verify combinations with [JACKSON-510]

    static class PropertyBean
    {
        @JsonTypeInfo(use=JsonTypeInfo.Id.NAME)
        public SuperType value;
        
        public PropertyBean() { this(null); }
        public PropertyBean(SuperType v) { value = v; }
    }

    // And then [JACKSON-614]
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=As.PROPERTY,
            property="#type",
            defaultImpl=DefaultImpl.class)
    static abstract class SuperTypeWithDefault { }

    static class DefaultImpl extends SuperTypeWithDefault {
        public int a;
    }

    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=As.PROPERTY, property="#type")
    static abstract class SuperTypeWithoutDefault { }

    static class DefaultImpl505 extends SuperTypeWithoutDefault {
        public int a;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    // JACKSON-510
    

    // [JACKSON-748]: also works via modules
    
    
    

    

    

    // Trying to reproduce [JACKSON-366]
    

    

    // [JACKSON-505]: ok to also default to mapping there might be for base type
    
}

