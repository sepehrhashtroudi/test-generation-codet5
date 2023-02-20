package com.fasterxml.jackson.databind.ser;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

/**
 * Unit tests for checking extended auto-detect configuration,
 * in context of serialization
 */
public class TestAutoDetect
    extends BaseMapTest
{
    static class FieldBean
    {
        public String p1 = "public";
        protected String p2 = "protected";
        @SuppressWarnings("unused")
        private String p3 = "private";
    }

    @JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
    static class ProtFieldBean extends FieldBean { }

    static class MethodBean
    {
        public String getA() { return "a"; }
        protected String getB() { return "b"; }
        @SuppressWarnings("unused")
        private String getC() { return "c"; }
    }

    @JsonAutoDetect(getterVisibility=JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
    static class ProtMethodBean extends MethodBean { }

    /*
    /*********************************************************
    /* Test methods
    /*********************************************************
     */

    

    

    

    // [JACKSON-621]
    

    // [JACKSON-595]
    

}
