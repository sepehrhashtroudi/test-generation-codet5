package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.test.BaseTest;

/**
 * This unit test suite tests use of "value" Annotations;
 * annotations that define actual type (Class) to use for
 * deserialization.
 */
public class TestValueAnnotations
    extends BaseTest
{
    /*
    /**********************************************************
    /* Annotated root classes for @JsonDeserialize#as
    /**********************************************************
     */

    @JsonDeserialize(using=RootStringDeserializer.class)
    interface RootString {
        public String contents();
    }

    static class RootStringImpl implements RootString
    {
        final String _contents;

        public RootStringImpl(String x) { _contents = x; }

        @Override
        public String contents() { return _contents; }
        public String contents2() { return _contents; }
    }

    @JsonDeserialize(as=RootInterfaceImpl.class)
    interface RootInterface {
        public String getA();
    }

    static class RootInterfaceImpl implements RootInterface {
        public String a;

        public RootInterfaceImpl() { }

        @Override
        public String getA() { return a; }
    }

    @SuppressWarnings("serial")
    @JsonDeserialize(contentAs=RootStringImpl.class)
    static class RootMap extends HashMap<String,RootStringImpl> { }

    @SuppressWarnings("serial")
    @JsonDeserialize(contentAs=RootStringImpl.class)
    static class RootList extends LinkedList<RootStringImpl> { }

    @SuppressWarnings("serial")
    static class RootStringDeserializer
        extends StdDeserializer<RootString>
    {
        public RootStringDeserializer() { super(RootString.class); }

        @Override
        public RootString deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException
        {
            if (jp.getCurrentToken() == JsonToken.VALUE_STRING) {
                return new RootStringImpl(jp.getText());
            }
            throw ctxt.mappingException(_valueClass);
        }
    }

    /*
    /**********************************************************
    /* Annotated helper classes for @JsonDeserialize#as
    /**********************************************************
     */

    /* Class for testing valid {@link JsonDeserialize} annotation
     * with 'as' parameter to define concrete class to deserialize to
     */
    final static class CollectionHolder
    {
        Collection<String> _strings;

        /* Default for 'Collection' would probably be ArrayList or so;
         * let's try to make it a TreeSet instead.
         */
        @JsonDeserialize(as=TreeSet.class)
        public void setStrings(Collection<String> s)
        {
            _strings = s;
        }
    }

    /* Another class for testing valid {@link JsonDeserialize} annotation
     * with 'as' parameter to define concrete class to deserialize to
     */
    final static class MapHolder
    {
        // Let's also coerce numbers into Strings here
        Map<String,String> _data;

        /* Default for 'Collection' would be HashMap,
         * let's try to make it a TreeMap instead.
         */
        @JsonDeserialize(as=TreeMap.class)
        public void setStrings(Map<String,String> s)
        {
            _data = s;
        }
    }

    /* Another class for testing valid {@link JsonDeserialize} annotation
     * with 'as' parameter, but with array
     */
    final static class ArrayHolder
    {
        String[] _strings;

        @JsonDeserialize(as=String[].class)
        public void setStrings(Object[] o)
        {
            // should be passed instances of proper type, as per annotation
            _strings = (String[]) o;
        }
    }

    /* Another class for testing broken {@link JsonDeserialize} annotation
     * with 'as' parameter; one with incompatible type
     */
    final static class BrokenCollectionHolder
    {
        @JsonDeserialize(as=String.class) // not assignable to Collection
        public void setStrings(Collection<String> s) { }
    }

    /*
    /**********************************************************
    /* Annotated helper classes for @JsonDeserialize.keyAs
    /**********************************************************
     */

    final static class StringWrapper
    {
        final String _string;

        public StringWrapper(String s) { _string = s; }
    }

    final static class MapKeyHolder
    {
        Map<Object, String> _map;

        @JsonDeserialize(keyAs=StringWrapper.class)
        public void setMap(Map<Object,String> m)
        {
            // type should be ok, but no need to cast here (won't matter)
            _map = m;
        }
    }

    final static class BrokenMapKeyHolder
    {
        // Invalid: Integer not a sub-class of String
        @JsonDeserialize(keyAs=Integer.class)
            public void setStrings(Map<String,String> m) { }
    }

    /*
    /**********************************************************
    /* Annotated helper classes for @JsonDeserialize#contentAs
    /**********************************************************
     */

    final static class ListContentHolder
    {
        List<?> _list;

        @JsonDeserialize(contentAs=StringWrapper.class)
        public void setList(List<?> l) {
            _list = l;
        }
    }

    final static class InvalidContentClass
    {
        /* Such annotation not allowed, since it makes no sense;
         * non-container classes have no contents to annotate (but
         * note that it is possible to first use @JsonDesiarialize.as
         * to mark Object as, say, a List, and THEN use
         * @JsonDeserialize.contentAs!)
         */
        @JsonDeserialize(contentAs=String.class)
            public void setValue(Object x) { }
    }

    final static class ArrayContentHolder
    {
        Object[] _data;

        @JsonDeserialize(contentAs=Long.class)
        public void setData(Object[] o)
        { // should have proper type, but no need to coerce here
            _data = o;
        }
    }

    final static class MapContentHolder
    {
        Map<Object,Object> _map;

        @JsonDeserialize(contentAs=Integer.class)
        public void setMap(Map<Object,Object> m)
        {
            _map = m;
        }
    }

    /*
    /**********************************************************
    /* Test methods for @JsonDeserialize#as
    /**********************************************************
     */

public void testOverrideClassInvalid219() throws Exception { 
     try { 
         BrokenCollectionHolder result = new ObjectMapper().readValue("{ \"strings\" : [ ] }", BrokenCollectionHolder.class); 
         fail("Expected a failure, but got results: " + result); 
     } catch (JsonMappingException jme) { 
         verifyException(jme, "is not assignable to"); 
     } 
 }
    

    

    

    

    /*
    /**********************************************************
    /* Test methods for @JsonDeserialize#as used for root values
    /**********************************************************
     */

    

    

    

    

    /*
    /**********************************************************
    /* Test methods for @JsonDeserialize#keyAs
    /**********************************************************
     */

    

    

    /*
    /**********************************************************
    /* Test methods for @JsonDeserialize#contentAs
    /**********************************************************
     */

    

    

    
}
