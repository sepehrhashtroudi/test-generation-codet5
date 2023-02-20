package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class TestCollectionSerialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    enum Key { A, B, C };

    // Field-based simple bean with a single property, "values"
    final static class CollectionBean
    {
        @JsonProperty // not required
            public Collection<Object> values;

        public CollectionBean(Collection<Object> c) { values = c; }
    }

    static class EnumMapBean
    {
        EnumMap<Key,String> _map;

        public EnumMapBean(EnumMap<Key,String> m)
        {
            _map = m;
        }

        public EnumMap<Key,String> getMap() { return _map; }
    }

    final static class IterableWrapper
        implements Iterable<Integer>
    {
        List<Integer> _ints = new ArrayList<Integer>();

        public IterableWrapper(int[] values) {
            for (int i : values) {
                _ints.add(Integer.valueOf(i));
            }
        }

        @Override
        public Iterator<Integer> iterator() {
            return _ints.iterator();
        }
    }

    /**
     * Class needed for testing [JACKSON-220]
     */
    @SuppressWarnings("serial")
    @JsonSerialize(using=ListSerializer.class)    
    static class PseudoList extends ArrayList<String>
    {
        public PseudoList(String... values) {
            super(Arrays.asList(values));
        }
    }

    static class ListSerializer extends JsonSerializer<List<String>>
    {
        @Override
        public void serialize(List<String> value,
                              JsonGenerator jgen,
                              SerializerProvider provider)
            throws IOException
        {
            // just use standard List.toString(), output as JSON String
            jgen.writeString(value.toString());
        }
    }

    // for [JACKSON-254], suppression of empty collections
    static class EmptyListBean {
        public List<String> empty = new ArrayList<String>();
    }

    static class EmptyArrayBean {
        public String[] empty = new String[0];
    }

    // [JACKSON-689]
    static class BeanWithIterable {
        private final ArrayList<String> values = new ArrayList<String>();
        {
            values.add("value");
        }

        public Iterable<String> getValues() { return values; }
    }

    static class IntIterable implements Iterable<Integer>
    {
        @Override
        public Iterator<Integer> iterator() {
            return new IntIterator(1, 3);
        }
    }

    static class IntIterator implements Iterator<Integer> {
        int i;
        final int last;

        public IntIterator(int first, int last) {
            i = first;
            this.last = last;
        }

        @Override
        public boolean hasNext() {
            return i <= last;
        }

        @Override
        public Integer next() {
            return i++;
        }

        @Override
        public void remove() { }

        public int getX() { return 13; }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    private final static ObjectMapper MAPPER = new ObjectMapper();

    

    

    

    

    

    // Test that checks that empty collections are properly serialized
    // when they are Bean properties
    

    

    

    // Should also be able to serialize null EnumMaps as expected
    

    // Test [JACKSON-220]
    

    // [JACKSON-254]
    
    
    // [JACKSON-689], [JACKSON-876]
    
}
