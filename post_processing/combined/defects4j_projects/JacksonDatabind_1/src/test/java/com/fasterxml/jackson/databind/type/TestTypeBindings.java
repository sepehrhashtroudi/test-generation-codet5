package com.fasterxml.jackson.databind.type;

import java.util.*;

import com.fasterxml.jackson.databind.JavaType;

/**
 * Simple tests to verify for generic type binding functionality
 * implemented by {@link TypeBindings} class.
 */
public class TestTypeBindings
    extends com.fasterxml.jackson.test.BaseTest
{    
    static class AbstractType<A,B> { }
    
    static class LongStringType extends AbstractType<Long,String> { }

    static class InnerGenericTyping<K, V> extends AbstractMap<K, Collection<V>>
    {
        @Override
        public Set<java.util.Map.Entry<K, Collection<V>>> entrySet() {
            return null;
        }
        public class InnerClass extends AbstractMap<K, Collection<V>> {
            @Override
            public Set<java.util.Map.Entry<K, Collection<V>>> entrySet() {
                return null;
            }
        }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
    

    


    // [JACKSON-677]
    
}
