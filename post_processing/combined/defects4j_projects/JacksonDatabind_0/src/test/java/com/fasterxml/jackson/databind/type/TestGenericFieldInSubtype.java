package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.*;

public class TestGenericFieldInSubtype extends BaseMapTest
{
    // [JACKSON-677]
    

 // [JACKSON-887]
    

}

class Result677<T> {
    public static class Success677<K> extends Result677<K> {
     public K value;
     
     public Success677() { }
     public Success677(K k) { value = k; }
    }
}

abstract class BaseType<T> {
    public T value;

    public final static class SubType<T extends Number> extends BaseType<T>
    {
    }
}
