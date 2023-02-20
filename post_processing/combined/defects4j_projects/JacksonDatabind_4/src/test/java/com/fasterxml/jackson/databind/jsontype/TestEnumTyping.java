package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("serial")
public class TestEnumTyping extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    // note: As.WRAPPER_ARRAY worked initially; but as per [JACKSON-485], As.PROPERTY had issues
    @JsonTypeInfo(use=JsonTypeInfo.Id.MINIMAL_CLASS, include=JsonTypeInfo.As.PROPERTY)
    public interface EnumInterface { }

    public enum Tag implements EnumInterface
    { A, B };
    
    static class EnumInterfaceWrapper {
        public EnumInterface value;
    }
    
    static class EnumInterfaceList extends ArrayList<EnumInterface> { }

    static class TagList extends ArrayList<Tag> { }

    static enum TestEnum { A, B, C; }
    
    static class UntypedEnumBean
    {
       @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="__type")
        public Object value;

        public UntypedEnumBean() { }
        public UntypedEnumBean(TestEnum v) { value = v; }

        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="__type")
        public void setValue(Object o) {
            value = o;
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

public void testEnumInterface236() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     String json = m.writeValueAsString(Tag.B); 
     EnumInterface result = m.readValue(json, EnumInterface.class); 
     assertSame(Tag.B, result); 
 }
    

    

    

    
    
}
