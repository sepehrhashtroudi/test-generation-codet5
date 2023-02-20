package com.fasterxml.jackson.databind.views;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying JSON view functionality: ability to declaratively
 * suppress subset of properties from being serialized.
 */
public class TestViewSerialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper types
    /**********************************************************
     */

    // Classes that represent views
    static class ViewA { }
    static class ViewAA extends ViewA { }
    static class ViewB { }
    static class ViewBB extends ViewB { }
    
    static class Bean
    {
        @JsonView(ViewA.class)
        public String a = "1";

        @JsonView({ViewAA.class, ViewB.class})
        public String aa = "2";

        @JsonView(ViewB.class)
        public String getB() { return "3"; }
    }

    /**
     * Bean with mix of explicitly annotated
     * properties, and implicit ones that may or may
     * not be included in views.
     */
    static class MixedBean
    {
        @JsonView(ViewA.class)
        public String a = "1";

        public String getB() { return "2"; }
    }

    /**
     * As indicated by [JACKSON-261], @JsonView should imply
     * that associated element (method, field) is to be considered
     * a property
     */
    static class ImplicitBean {
        @JsonView(ViewA.class)
        private int a = 1;
    }

    static class VisibilityBean {
        @JsonProperty protected String id = "id";
    
        @JsonView(ViewA.class)
        public String value = "x";
    }   

    // [JACKSON-868]
    public static class WebView { }
    public static class OtherView { }
    public static class Foo {
        @JsonView(WebView.class)
        public int getFoo() { return 3; }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */    
    
    

    /**
     * Unit test to verify implementation of [JACKSON-232], to
     * allow "opt-in" handling for JSON Views: that is, that
     * default for properties is to exclude unless included in
     * a view.
     */
    

    /**
     * As per [JACKSON-261], @JsonView annotation should imply that associated
     * method/field does indicate a property.
     */
    

    

    // [JACKSON-868]
        
}
