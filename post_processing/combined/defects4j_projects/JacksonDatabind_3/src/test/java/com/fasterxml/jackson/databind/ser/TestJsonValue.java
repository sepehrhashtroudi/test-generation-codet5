package com.fasterxml.jackson.databind.ser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * This unit test suite tests functioning of {@link JsonValue}
 * annotation with bean serialization.
 */
public class TestJsonValue
    extends BaseMapTest
{
    /*
    /*********************************************************
    /* Helper bean classes
    /*********************************************************
     */

    static class ValueClass<T>
    {
        final T _value;

        public ValueClass(T v) { _value = v; }

        @JsonValue T value() { return _value; }

        // shouldn't need this, but may be useful for troubleshooting:
        @Override
        public String toString() { return "???"; }
    }

    /**
     * Another test class to check that it is also possible to
     * force specific serializer to use with @JsonValue annotated
     * method. Difference is between Integer serialization, and
     * conversion to a Json String.
     */
    final static class ToStringValueClass<T>
        extends ValueClass<T>
    {
        public ToStringValueClass(T value) { super(value); }

        // Also, need to use this annotation to help
        @JsonSerialize(using=ToStringSerializer.class)
        @Override
        @JsonValue T value() { return super.value(); }
    }

    final static class ToStringValueClass2
        extends ValueClass<String>
    {
        public ToStringValueClass2(String value) { super(value); }

        /* Simple as well, but let's ensure that other getters won't matter...
         */

        @JsonProperty int getFoobar() { return 4; }

        public String[] getSomethingElse() { return new String[] { "1", "a" }; }
    }

    static class ValueBase {
        public String a = "a";
    }

    static class ValueType extends ValueBase {
        public String b = "b";
    }
    
    // Finally, let's also test static vs dynamic type
    static class ValueWrapper {
        @JsonValue
        public ValueBase getX() { return new ValueType(); }
    }

    static class MapBean
    {
        @JsonValue
        public Map<String,String> toMap()
        {
            HashMap<String,String> map = new HashMap<String,String>();
            map.put("a", "1");
            return map;
        }
    }

    @SuppressWarnings("serial")
    static class MapAsNumber extends HashMap<String,String>
    {
        @JsonValue
        public int value() { return 42; }
    }

    @SuppressWarnings("serial")
    static class ListAsNumber extends ArrayList<Integer>
    {
        @JsonValue
        public int value() { return 13; }
    }

    static class IntExtBean {
        public List<Internal> values = new ArrayList<Internal>();
        
        public void add(int v) { values.add(new Internal(v)); }
    }
    
    static class Internal {
        public int value;
        
        public Internal(int v) { value = v; }
        
        @JsonValue
        public External asExternal() { return new External(this); }
    }
    
    static class External {
        public int i;
        
        External(Internal e) { i = e.value; }
    }

    // [Issue#167]
    
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "boingo")
    @JsonSubTypes(value = {@JsonSubTypes.Type(name = "boopsy", value = AdditionInterfaceImpl.class) })
    static interface AdditionInterface
    {
    	public int add(int in);
    }
	
    public static class AdditionInterfaceImpl implements AdditionInterface
    {
	    private final int toAdd;
	
	    @JsonCreator
	    public AdditionInterfaceImpl(@JsonProperty("toAdd") int toAdd) {
	      this.toAdd = toAdd;
	    }
	
	    @JsonProperty
	    public int getToAdd() {
	      return toAdd;
	    }
	
	    @Override
	    public int add(int in) {
	      return in + toAdd;
	    }
    }
	
    public static class NegatingAdditionInterface implements AdditionInterface
    {
	    final AdditionInterface delegate;
	
	    public NegatingAdditionInterface(AdditionInterface delegate) {
	    	this.delegate = delegate;
	    }
	
	    @Override
	    public int add(int in) {
	      return delegate.add(-in);
	    }
	
	    @JsonValue
	    public AdditionInterface getDelegate() {
	      return delegate;
	    }
    }
    
    /*
    /*********************************************************
    /* Test cases
    /*********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    

    

    /**
     * Test for verifying that additional getters won't confuse serializer.
     */
    

    

    

    

    

    

    // [Issue#167]
    

}
