package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class TestNoTypeInfo extends BaseMapTest
{
    @JsonTypeInfo(use=JsonTypeInfo.Id.NONE)
    @JsonDeserialize(as=NoType.class)
    private static interface NoTypeInterface {
    }
    
    private final static class NoType implements NoTypeInterface {
        public int a = 3;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    // for [JACKSON-746]
    
}
