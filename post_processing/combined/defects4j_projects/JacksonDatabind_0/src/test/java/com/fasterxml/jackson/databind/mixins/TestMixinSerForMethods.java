package com.fasterxml.jackson.databind.mixins;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

public class TestMixinSerForMethods
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper bean classes
    /**********************************************************
     */

    // base class: just one visible property ('b')
    static class BaseClass
    {
        @SuppressWarnings("unused") private String a;
        private String b;

        protected BaseClass() { }

        public BaseClass(String a, String b) {
            this.a = a;
            this.b = b;
        }

        @JsonProperty("b")
        public String takeB() { return b; }
    }

    /* extends, just for fun; and to show possible benefit of being
     * able to declare that a method is overridden (compile-time check
     * that our intended mix-in override will match a method)
     */
    abstract static class MixIn
        extends BaseClass
    {
        // let's make 'a' visible
        @JsonProperty String a;

        @Override
            @JsonProperty("b2")
            public abstract String takeB();

        // also: just for fun; add a "red herring"... unmatched method
        @JsonProperty abstract String getFoobar();
    }

    static class LeafClass
        extends BaseClass
    {
        public LeafClass(String a, String b) { super(a, b); }

        @Override
        @JsonIgnore
        public String takeB() { return null; }
    }
               
    interface ObjectMixIn
    {
        // and then ditto for hashCode..
        @Override
        @JsonProperty public int hashCode();
    }

    static class EmptyBean { }

    static class SimpleBean extends EmptyBean
    {
        int x() { return 42; }
    }

    /**
     * This mix-in is to be attached to EmptyBean, but really modify
     * methods that its subclass, SimpleBean, has.
     */
    abstract class MixInForSimple
    {
        // This should apply to sub-class
        @JsonProperty("x") abstract int x();

        // and this matches nothing, should be ignored
        @JsonProperty("notreally") public int xxx() { return 3; }

        // nor this
        public abstract int getIt();
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    /**
     * Unit test for verifying that leaf-level mix-ins work ok; 
     * that is, any annotations added properly override all annotations
     * that masked methods (fields etc) have.
     */
    

    /**
     * Unit test for verifying that having a mix-in "between" classes
     * (overriding annotations of a base class, but being overridden
     * further by a sub-class) works as expected
     */
    

    /**
     * Another intermediate mix-in, to verify that annotations
     * properly "trickle up"
     */
    

    /**
     * Unit test for verifying that it is actually possible to attach
     * mix-in annotations to basic <code>Object.class</code>. This
     * will essentially apply to any and all Objects.
     */
    
}
