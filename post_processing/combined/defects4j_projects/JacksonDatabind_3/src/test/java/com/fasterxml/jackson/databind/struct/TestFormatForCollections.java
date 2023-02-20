package com.fasterxml.jackson.databind.struct;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import com.fasterxml.jackson.databind.*;

public class TestFormatForCollections extends BaseMapTest
{
    // [issue#40]: Allow serialization 'as POJO' (resulting in JSON Object) 
    @JsonPropertyOrder({ "size", "value" })
    @JsonFormat(shape=Shape.OBJECT)
    @JsonIgnoreProperties({ "empty" }) // from 'isEmpty()'
    static class CollectionAsPOJO
        extends ArrayList<String>
    {
        private static final long serialVersionUID = 1L;

        @JsonProperty("size")
        public int foo() { return size(); }
        
        public List<String> getValues() {
            return new ArrayList<String>(this);
        }

        public void setValues(List<String> v) {
            addAll(v);
        }
        
        // bogus setter to handle "size" property
        public void setSize(int i) { }
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    private final static ObjectMapper MAPPER = new ObjectMapper();    


    // [Issue#40]
    

}
