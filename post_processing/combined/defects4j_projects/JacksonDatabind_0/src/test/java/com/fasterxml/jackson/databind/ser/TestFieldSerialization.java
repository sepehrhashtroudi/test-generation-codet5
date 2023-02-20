package com.fasterxml.jackson.databind.ser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Unit tests for verifying that field-backed properties can also be serialized
 * (since version 1.1) as well as getter-accessible properties.
 */
public class TestFieldSerialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Annotated helper classes
    /**********************************************************
     */

    static class SimpleFieldBean
    {
        public int x, y;

        // not auto-detectable, not public
        int z;

        // ignored, not detectable either
        @JsonIgnore public int a;
    }
    
    static class SimpleFieldBean2
    {
        @JsonSerialize String[] values;

        // note: this annotation should not matter for serialization:
        @JsonDeserialize int dummy;
    }

    static class TransientBean
    {
        public int a;
        // transients should not be included
        public transient int b;
        // or statics
        public static int c;
    }

    @JsonAutoDetect(setterVisibility=Visibility.PUBLIC_ONLY, fieldVisibility=Visibility.NONE)
    public class NoAutoDetectBean
    {
        // not auto-detectable any more
        public int x;

        @JsonProperty("z")
        public int _z;
    }

    /**
     * Let's test invalid bean too: can't have 2 logical properties
     * with same name.
     *<p>
     * 21-Feb-2010, tatus: That is, not within same class.
     *    As per [JACKSON-226] it is acceptable to "override"
     *    field definitions in sub-classes.
     */
    public static class DupFieldBean
    {
        @JsonProperty("foo")
        public int _z;

        @JsonSerialize
        private int foo;
    }

    public static class DupFieldBean2
    {
        public int z;

        @JsonProperty("z")
        public int _z;
    }

    public static class OkDupFieldBean
        extends SimpleFieldBean
    {
        @JsonProperty("x")
        protected int myX;

        public int y;

        public OkDupFieldBean(int x, int y) {
            this.myX = x;
            this.y = y;
        }
    }

    /**
     * It is ok to have a method-based and field-based property
     * introspectable: only one should be serialized, and since
     * methods have precedence, it should be the method one.
     */
    public static class FieldAndMethodBean
    {
        @JsonProperty public int z;

        @JsonProperty("z") public int getZ() { return z+1; }
    }

    /*
    /**********************************************************
    /* Main tests, success
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    

    

    

    

    /**
     * Unit test that verifies that if both a field and a getter
     * method exist for a logical property (which is allowed),
     * getter has precendence over field.
     */
    

    /**
     * Testing [JACKSON-226]: it is ok to have "field override",
     * as long as there are no intra-class conflicts.
     */
    

    /*
    /**********************************************************
    /* Main tests, failure cases
    /**********************************************************
     */

    

    
}

