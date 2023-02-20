package com.fasterxml.jackson.databind.jsontype;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TestGenericListSerialization
    extends BaseMapTest
{
    // [JACKSON-356]
    public static class JSONResponse<T> {

        private T result;

        public T getResult() {
            return result;
        }

        public void setResult(T result) {
            this.result = result;
        }
    } 

    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
    public static class Parent {
        public String parentContent = "PARENT";
    }

    public static class Child1 extends Parent {
        public String childContent1 = "CHILD1";
    }

    public static class Child2 extends Parent {
        public String childContent2 = "CHILD2";
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    
    
}
