package com.fasterxml.jackson.databind.convert;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit tests for verifying that "updating reader" works as
 * expected.
 */
public class TestUpdateValue extends BaseMapTest
{
    /*
    /********************************************************
    /* Helper types
    /********************************************************
     */

    static class Bean {
        public String a = "a";
        public String b = "b";

        public int[] c = new int[] { 1, 2, 3 };

        public Bean child = null;
    }

    static class XYBean {
        public int x, y;
    }

    // [JACKSON-824]
    public class TextView {}
    public class NumView {}

    public class Updateable {
        @JsonView(NumView.class)
        public int num;

        @JsonView(TextView.class)
        public String str;
    }
        
    /*
    /********************************************************
    /* Unit tests
    /********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();

    

    

    

    // Test for [JACKSON-717] -- ensure 'readValues' also does update
    

    // [JACKSON-824]
    
}
