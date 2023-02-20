package com.fasterxml.jackson.databind.type;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.HierarchicType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.test.BaseTest;

/**
 * Simple tests to verify that the {@link TypeFactory} constructs
 * type information as expected.
 */
public class TestTypeFactory
    extends BaseTest
{    
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    enum EnumForCanonical { YES, NO; }

    static class SingleArgGeneric<X> { }

    abstract static class MyMap extends IntermediateMap<String,Long> { }
    abstract static class IntermediateMap<K,V> implements Map<K,V> { }

    abstract static class MyList extends IntermediateList<Long> { }
    abstract static class IntermediateList<E> implements List<E> { }

    @SuppressWarnings("serial")
    static class GenericList<T> extends ArrayList<T> { }
    
    interface MapInterface extends Cloneable, IntermediateInterfaceMap<String> { }
    interface IntermediateInterfaceMap<FOO> extends Map<FOO, Integer> { }

    @SuppressWarnings("serial")
    static class MyStringIntMap extends MyStringXMap<Integer> { }
    @SuppressWarnings("serial")
    static class MyStringXMap<V> extends HashMap<String,V> { }

    // And one more, now with obfuscated type names; essentially it's just Map<Int,Long>
    static abstract class IntLongMap extends XLongMap<Integer> { }
    // trick here is that V now refers to key type, not value type
    static abstract class XLongMap<V> extends XXMap<V,Long> { }
    static abstract class XXMap<K,V> implements Map<K,V> { }

    static class SneakyBean {
        public IntLongMap intMap;
        public MyList longList;
    }

    static class SneakyBean2 {
        // self-reference; should be resolved as "Comparable<Object>"
        public <T extends Comparable<T>> T getFoobar() { return null; }
    }
    
    @SuppressWarnings("serial")
    public static class LongValuedMap<K> extends HashMap<K, Long> { }

    static class StringLongMapBean {
        public LongValuedMap<String> value;
    }

    static class StringListBean {
        public GenericList<String> value;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
public void testMapTypesRaw113() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType type = tf.constructType(HashMap.class); 
     MapType mapType = (MapType) type; 
     assertEquals(tf.constructType(Object.class), mapType.getKeyType()); 
     assertEquals(tf.constructType(Object.class), mapType.getContentType()); 
 }
public void testCollections114() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType t = tf.constructType(ArrayList.class); 
     assertEquals(CollectionType.class, t.getClass()); 
     assertSame(ArrayList.class, t.getRawClass()); 
     t = tf.constructType(new TypeReference<ArrayList<String>>() { 
     }); 
     assertEquals(CollectionType.class, t.getClass()); 
     assertSame(ArrayList.class, t.getRawClass()); 
     JavaType elemType = ((CollectionType) t).getContentType(); 
     assertNotNull(elemType); 
     assertSame(SimpleType.class, elemType.getClass()); 
     assertSame(String.class, elemType.getRawClass()); 
     t = tf.constructCollectionType(ArrayList.class, String.class); 
     assertEquals(CollectionType.class, t.getClass()); 
     assertSame(String.class, ((CollectionType) t).getContentType().getRawClass()); 
 }
public void testParametricTypes115() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType t = tf.constructParametricType(ArrayList.class, String.class); 
     assertEquals(CollectionType.class, t.getClass()); 
     JavaType strC = tf.constructType(String.class); 
     assertEquals(1, t.containedTypeCount()); 
     assertEquals(strC, t.containedType(0)); 
     assertNull(t.containedType(1)); 
     JavaType t2 = tf.constructParametricType(Map.class, strC, t); 
     assertEquals(MapType.class, t2.getClass()); 
     assertEquals(2, t2.containedTypeCount()); 
     assertEquals(strC, t2.containedType(0)); 
     assertEquals(t, t2.containedType(1)); 
     assertNull(t2.containedType(2)); 
     JavaType custom = tf.constructParametricType(SingleArgGeneric.class, String.class); 
     assertEquals(SimpleType.class, custom.getClass()); 
     assertEquals(1, custom.containedTypeCount()); 
     assertEquals(strC, custom.containedType(0)); 
     assertNull(custom.containedType(1)); 
     assertEquals("X", custom.containedTypeName(0)); 
     try { 
         tf.constructParametricType(Map.class, strC); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "Need exactly 2 parameter types for Map types"); 
     } 
     try { 
         tf.constructParametricType(SingleArgGeneric.class, strC, strC); 
     } catch (IllegalArgumentException e) { 
         verifyException(e, "expected 1 parameters, was given 2"); 
     } 
 }
public void testMapTypesSimple116() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType type = tf.constructType(new TypeReference<Map<String, Boolean>>() { 
     }); 
     MapType mapType = (MapType) type; 
     assertEquals(tf.constructType(String.class), mapType.getKeyType()); 
     assertEquals(tf.constructType(Boolean.class), mapType.getContentType()); 
 }
    

    

    
    
    

    

    /**
     * Test for verifying that parametric types can be constructed
     * programmatically
     * 
     * @since 1.5
     */
    

    /**
     * Test for checking that canonical name handling works ok
     */
    

    /*
    /**********************************************************
    /* Unit tests: low-level inheritance resolution
    /**********************************************************
     */
    
    /**
     * @since 1.6
     */
    
    
    /**
     * @since 1.6
     */
    

    /**
     * @since 1.6
     */
    

    private int _countSupers(HierarchicType t)
    {
        int depth = 0;
        for (HierarchicType sup = t.getSuperType(); sup != null; sup = sup.getSuperType()) {
            ++depth;
        }
        return depth;
    }
    
    /*
    /**********************************************************
    /* Unit tests: map/collection type parameter resolution
    /**********************************************************
     */
    
    /**
     * @since 1.6
     */
    

    /**
     * @since 1.6
     */
    

    /**
     * @since 1.6
     */
    

    /**
     * Specific test to verify that complicate name mangling schemes
     * do not fool type resolver
     * 
     * @since 1.6
     */
        
    
    /**
     * Plus sneaky types may be found via introspection as well.
     * 
     * @since 1.7
     */
        
    
    /**
     * Looks like type handling actually differs for properties, too.
     * 
     * @since 1.7
     */
    
    
    

    

    /*
    /**********************************************************
    /* Unit tests: construction of "raw" types
    /**********************************************************
     */

    

    

    /*
    /**********************************************************
    /* Unit tests: other
    /**********************************************************
     */
    
    
}
        
