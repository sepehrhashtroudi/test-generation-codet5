package com.fasterxml.jackson.databind.deser;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

public class TestGenerics
    extends BaseMapTest
{
    static abstract class BaseNumberBean<T extends Number>
    {
        public abstract void setNumber(T value);
    }

    static class NumberBean
        extends BaseNumberBean<Long>
    {
        long _number;

        @Override
        public void setNumber(Long value)
        {
            _number = value.intValue();
        }
    }

    /**
     * Very simple bean class
     */
    static class SimpleBean
    {
        public int x;
    }

    static class Wrapper<T>
    {
        public T value;

        public Wrapper() { }

        public Wrapper(T v) { value = v; }

        @Override
        public boolean equals(Object o) {
            return (o instanceof Wrapper<?>) && (((Wrapper<?>) o).value.equals(value));
        }
    }

    /*
    /***************************************************
    /* Test cases
    /***************************************************
     */

    

    /**
     * Unit test for verifying fix to [JACKSON-109].
     */
    

    /**
     * Unit test for verifying that we can use different
     * type bindings for individual generic types;
     * problem with [JACKSON-190]
     */
    

    /**
     * Unit test for verifying fix to [JACKSON-109].
     */
    
}
