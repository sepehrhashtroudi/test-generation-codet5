package com.fasterxml.jackson.databind.deser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.type.TypeFactory;

@SuppressWarnings("serial")
public class TestGenericMapDeser
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Test classes, enums
    /**********************************************************
     */

    static class BooleanWrapper {
        final Boolean b;
        @JsonCreator BooleanWrapper(Boolean value) { b = value; }
    }

    static class StringWrapper {
        final String str;
        @JsonCreator StringWrapper(String value) {
            str = value;
        }
    }

    static class MapSubClass extends HashMap<String,BooleanWrapper> { }

    /**
     * Map class that should behave like {@link MapSubClass}, but by
     * using annotations.
     */
    @JsonDeserialize(keyAs=StringWrapper.class, contentAs=BooleanWrapper.class)
        static class AnnotatedMap extends HashMap<Object,Object> { }

    interface MapWrapper<K,V> extends java.io.Serializable {
        public abstract Map<K,V> getEntries();
    }

    static class StringMap implements MapWrapper<String,Long>
    {
        private Map<String,Long> entries = new LinkedHashMap<String,Long>();

        public StringMap() { }

        @Override
        public Map<String,Long> getEntries() { return entries; }
    }

    static class StringWrapperValueMap<KEY> extends HashMap<KEY,StringWrapper> { }

    static class StringStringWrapperMap extends StringWrapperValueMap<String> { }

    static class KeyTypeCtor  {
        protected String value;
        public KeyTypeCtor(String v) { value = v; }
    }

    static class KeyTypeFactory  {
        protected String value;
        private KeyTypeFactory(String v, boolean foo) { value = v; }

        @JsonCreator
        public static KeyTypeFactory create(String str) {
            return new KeyTypeFactory(str, true);
        }
    }
    
    /*
    /**********************************************************
    /* Test methods for sub-classing
    /**********************************************************
     */

    /**
     * Verifying that sub-classing works ok wrt generics information
     */
    

    

    
    
    /*
    /**********************************************************
    /* Test methods for sub-classing for annotation handling
    /**********************************************************
     */

    /**
     * Verifying that sub-classing works ok wrt generics information
     */
    

    /*
    /**********************************************************
    /* Test methods for ensuring @JsonCreator works for keys
    /**********************************************************
     */

    

    

}
