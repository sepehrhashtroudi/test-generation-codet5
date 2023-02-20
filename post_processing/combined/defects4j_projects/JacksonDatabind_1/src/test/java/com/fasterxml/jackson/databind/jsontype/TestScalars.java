package com.fasterxml.jackson.databind.jsontype;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestScalars extends BaseMapTest
{
    private static class DynamicWrapper {
        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY)
        public Object value;
        
        @SuppressWarnings("unused")
        public DynamicWrapper() { }
        public DynamicWrapper(Object v) { value = v; }
    }

    static enum TestEnum { A, B; }

    private static class AbstractWrapper {
        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY)
        public Serializable value;
        
        @SuppressWarnings("unused")
        public AbstractWrapper() { }
        public AbstractWrapper(Serializable v) { value = v; }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
    /**
     * Ensure that per-property dynamic types work, both for "native" types
     * and others
     */
    

    
}
