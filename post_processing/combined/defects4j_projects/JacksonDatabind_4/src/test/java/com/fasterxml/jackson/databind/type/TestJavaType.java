package com.fasterxml.jackson.databind.type;

import java.util.*;

import com.fasterxml.jackson.databind.JavaType;

/**
 * Simple tests to verify that {@link JavaType} types work to
 * some degree
 */
public class TestJavaType
    extends com.fasterxml.jackson.test.BaseTest
{
    static class BaseType { }

    static class SubType extends BaseType { }
    
    static enum MyEnum { A, B; }
    static enum MyEnum2 {
        A(1), B(2);
        
        private MyEnum2(int value) { }
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
public void testMapType108() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType keyT = tf.constructType(String.class); 
     JavaType baseT = tf.constructType(BaseType.class); 
     MapType mapT = MapType.construct(Map.class, keyT, baseT); 
     assertNotNull(mapT); 
     assertTrue(mapT.isContainerType()); 
     assertSame(mapT, mapT.narrowContentsBy(BaseType.class)); 
     assertSame(mapT, mapT.narrowKey(String.class)); 
     assertTrue(mapT.equals(mapT)); 
     assertFalse(mapT.equals(null)); 
     assertFalse(mapT.equals("xyz")); 
     MapType mapT2 = MapType.construct(HashMap.class, keyT, baseT); 
     assertFalse(mapT.equals(mapT2)); 
     try { 
         SimpleType.construct(HashMap.class); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "for a Map"); 
     } 
 }
public void testCollectionType109() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType collectionT = CollectionType.construct(List.class, tf.constructType(String.class)); 
     assertNotNull(collectionT); 
     assertTrue(collectionT.isContainerType()); 
     assertSame(collectionT, collectionT.narrowContentsBy(String.class)); 
     assertNotNull(collectionT.toString()); 
     assertTrue(collectionT.equals(collectionT)); 
     assertFalse(collectionT.equals(null)); 
     assertFalse(collectionT.equals("xyz")); 
     assertTrue(collectionT.equals(CollectionType.construct(List.class, tf.constructType(String.class)))); 
     assertFalse(collectionT.equals(CollectionType.construct(Set.class, tf.constructType(String.class)))); 
     try { 
         SimpleType.construct(ArrayList.class); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "for a Collection"); 
     } 
 }
public void testArrayType110() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType collectionT = CollectionType.construct(List.class, tf.constructType(String.class)); 
     assertNotNull(collectionT); 
     assertTrue(collectionT.isContainerType()); 
     assertSame(collectionT, collectionT.narrowContentsBy(String.class)); 
     assertNotNull(collectionT.toString()); 
     assertTrue(collectionT.equals(collectionT)); 
     assertFalse(collectionT.equals(null)); 
     assertFalse(collectionT.equals("xyz")); 
     assertTrue(collectionT.equals(CollectionType.construct(List.class, tf.constructType(String.class)))); 
     assertFalse(collectionT.equals(CollectionType.construct(Set.class, tf.constructType(String.class)))); 
     try { 
         SimpleType.construct(ArrayList.class); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "for a Collection"); 
     } 
 }
    

    

    

    

    

    

    // [Issue#116]
    
}

