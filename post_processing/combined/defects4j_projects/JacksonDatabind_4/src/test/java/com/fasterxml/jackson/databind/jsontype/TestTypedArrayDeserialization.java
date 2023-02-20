package com.fasterxml.jackson.databind.jsontype;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertArrayEquals;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TestTypedArrayDeserialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    /**
     * Let's claim we need type here too (although we won't
     * really use any sub-classes)
     */
    @SuppressWarnings("serial")
    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_ARRAY)
    static class TypedList<T> extends ArrayList<T> { }

    @SuppressWarnings("serial")
    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY)
    static class TypedListAsProp<T> extends ArrayList<T> { }
    
    @SuppressWarnings("serial")
    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_OBJECT)
    static class TypedListAsWrapper<T> extends LinkedList<T> { }
    
    // Mix-in to force wrapper for things like primitive arrays
    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_OBJECT)
    interface WrapperMixIn { }

    /*
    /**********************************************************
    /* Unit tests, Lists
    /**********************************************************
     */
    
    

    /**
     * Similar to above, but this time let's request adding type info
     * as property. That would not work (since there's no JSON Object to
     * add property in), so it will basically be same as using WRAPPER_ARRAY
     */
    

    

    /*
    /**********************************************************
    /* Unit tests, primitive arrays
    /**********************************************************
     */

    
}
