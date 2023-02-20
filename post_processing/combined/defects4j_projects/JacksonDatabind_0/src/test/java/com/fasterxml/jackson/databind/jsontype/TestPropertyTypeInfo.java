package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Testing to verify that {@link JsonTypeInfo} works
 * for properties as well as types (see [JACKSON-280] for details)
 */
@SuppressWarnings("serial")
public class TestPropertyTypeInfo extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    static class FieldWrapperBean
    {
        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public Object value;

        public FieldWrapperBean() { }
        public FieldWrapperBean(Object o) { value = o; }
    }

    static class FieldWrapperBeanList extends ArrayList<FieldWrapperBean> { }
    static class FieldWrapperBeanMap extends HashMap<String,FieldWrapperBean> { }
    static class FieldWrapperBeanArray {
        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public FieldWrapperBean[] beans;

        public FieldWrapperBeanArray() { }
        public FieldWrapperBeanArray(FieldWrapperBean[] beans) { this.beans = beans; }
    }
    
    static class MethodWrapperBean
    {
        private Object value;
        
        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public Object getValue() { return value; }

        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public void setValue(Object v) { value = v; }
        
        public MethodWrapperBean() { }
        public MethodWrapperBean(Object o) { value = o; }
    }
    
    static class MethodWrapperBeanList extends ArrayList<MethodWrapperBean> { }
    static class MethodWrapperBeanMap extends HashMap<String,MethodWrapperBean> { }
    static class MethodWrapperBeanArray {
        protected MethodWrapperBean[] beans;

        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public MethodWrapperBean[] getValue() { return beans; }

        @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
        public void setValue(MethodWrapperBean[] v) { beans = v; }
        
        public MethodWrapperBeanArray() { }
        public MethodWrapperBeanArray(MethodWrapperBean[] beans) { this.beans = beans; }
    }

    static class OtherBean {
        public int x = 1, y = 1;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    

    

    

    

    

    
    
    

    
}
