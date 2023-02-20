package com.fasterxml.jackson.databind.ser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;

/**
 * This unit test suite verifies that static fields and methods are
 * ignored wrt serialization
 */
public class TestStatics
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Annotated helper classes
    /**********************************************************
     */

    final static class FieldBean
    {
        public int x = 1;

        public static int y = 2;

        // not even @JsonProperty should make statics usable...
        @JsonProperty public static int z = 3;
    }

    final static class GetterBean
    {
        public int getX() { return 3; }

        public static int getA() { return -3; }

        // not even @JsonProperty should make statics usable...
        @JsonProperty public static int getFoo() { return 123; }
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    

    
}
