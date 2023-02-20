package com.fasterxml.jackson.databind.mixins;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

public class TestMixinSerForFields
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper bean classes
    /**********************************************************
     */

    static class BaseClass
    {
        public String a;
        protected String b;

        public BaseClass(String a, String b) {
            this.a = a;
            this.b = b;
        }
    }

    static class SubClass
        extends BaseClass
    {
        public SubClass(String a, String b) {
            super(a, b);
        }
    }

    abstract class MixIn {
        // Let's add 'b' as "banana"
        @JsonProperty("banana")
        public String b;
    }

    abstract class MixIn2 {
        // Let's remove 'a'
        @JsonIgnore
        public String a;

        // also: add a dummy field that is NOT to match anything
        @JsonProperty public String xyz;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    

    
}
