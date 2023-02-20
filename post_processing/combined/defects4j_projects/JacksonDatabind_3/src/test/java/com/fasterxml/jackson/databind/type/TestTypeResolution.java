package com.fasterxml.jackson.databind.type;

import java.util.*;

import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;

@SuppressWarnings("serial")
public class TestTypeResolution extends com.fasterxml.jackson.test.BaseTest
{
    public static class LongValuedMap<K> extends HashMap<K, Long> { }

    static class GenericList<X> extends ArrayList<X> { }
    static class GenericList2<Y> extends GenericList<Y> { }

    static class LongList extends GenericList2<Long> { }
    static class MyLongList<T> extends LongList { }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
    

    
}
