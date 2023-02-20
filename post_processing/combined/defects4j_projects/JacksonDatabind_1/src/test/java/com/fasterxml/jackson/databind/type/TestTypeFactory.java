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
    
public void testRawMap96() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType type = tf.constructRawMapType(HashMap.class); 
     MapType mapType = (MapType) type; 
     assertEquals(tf.constructType(Object.class), mapType.getKeyType()); 
     assertEquals(tf.constructType(Object.class), mapType.getContentType()); 
 }
public void testRawMaps97() { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType type = tf.constructRawMapType(HashMap.class); 
     MapType mapType = (MapType) type; 
     assertEquals(tf.constructType(Object.class), mapType.getKeyType()); 
     assertEquals(tf.constructType(Object.class), mapType.getContentType()); 
 }
public void testRawMaps98() throws Exception { 
     TypeFactory tf = TypeFactory.defaultInstance(); 
     JavaType type = tf.constructRawMapType(HashMap.class); 
     MapType mapType = (MapType) type; 
     assertEquals(tf.constructType(Object.class), mapType.getKeyType()); 
     assertEquals(tf.constructType(Object.class), mapType.getContentType()); 
 }
public void testSneakySelfRefs101() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     String json = mapper.writeValueAsString(new SneakyBean2()); 
     assertEquals("{\"foobar\":null}", json); 
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
        
