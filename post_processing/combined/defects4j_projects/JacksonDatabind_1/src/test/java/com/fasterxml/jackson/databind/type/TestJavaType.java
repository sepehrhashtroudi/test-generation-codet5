package com.fasterxml.jackson.databind.type;

import java.util.*;

import com.fasterxml.jackson.databind.JavaType;

/**
 * Simple tests to verify that {@link JavaType} types work to
 * some degree
 */
public class TestJavaType
    extends com.fasterxml.jackson.test.BaseTest
{
    static class BaseType { }

    static class SubType extends BaseType { }
    
    static enum MyEnum { A, B; }
    static enum MyEnum2 {
        A(1), B(2);
        
        private MyEnum2(int value) { }
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
    

    

    

    

    

    

    // [Issue#116]
    
}

