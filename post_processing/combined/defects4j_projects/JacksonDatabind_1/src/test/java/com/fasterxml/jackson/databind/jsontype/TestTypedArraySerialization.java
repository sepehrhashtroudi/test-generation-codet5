package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying that types that serialize as JSON Arrays
 * get properly serialized with types (esp. for contents, and
 * gracefully handling Lists themselves too)
 */
public class TestTypedArraySerialization
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
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.WRAPPER_OBJECT)
    static class TypedListAsWrapper<T> extends LinkedList<T> { }
    
    // Mix-in to force wrapper for things like primitive arrays
    @JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.WRAPPER_OBJECT)
    interface WrapperMixIn { }

    // for [JACKSON-341]
    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.WRAPPER_OBJECT)
    @JsonSubTypes({ @JsonSubTypes.Type(B.class) })
    interface A { }

    @JsonTypeName("BB")
    static class B implements A {
        public int value = 2;
    }

    @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY)
    @JsonTypeName("bean")
    static class Bean {
        public int x = 0;
    }

    static class BeanListWrapper {
        @JsonView({Object.class})
        public List<Bean> beans = new ArrayList<Bean>();
        {
            beans.add(new Bean());
        }
    }

    /*
    /**********************************************************
    /* Unit tests, Lists
    /**********************************************************
     */

public void testGenericArray91() throws Exception { 
     ObjectMapper m; 
     final A[] input = new A[] { new B() }; 
     final String EXP = "[{\"BB\":{\"value\":2}}]"; 
     m = new ObjectMapper(); 
     assertEquals(EXP, m.writeValueAsString(input)); 
     m = new ObjectMapper(); 
     m.configure(MapperFeature.USE_STATIC_TYPING, true); 
     assertEquals(EXP, m.writeValueAsString(input)); 
 }
    
    
    
    
    // Similar to above, but this time let's request adding type info
    // as property. That would not work (since there's no JSON Object to
    // add property in), so it should revert to method used with
    // ARRAY_WRAPPER method.
    

    

    /*
    /**********************************************************
    /* Unit tests, primitive arrays
    /**********************************************************
     */

    

    /*
    /**********************************************************
    /* Unit tests, generic arrays
    /**********************************************************
     */

    
}
