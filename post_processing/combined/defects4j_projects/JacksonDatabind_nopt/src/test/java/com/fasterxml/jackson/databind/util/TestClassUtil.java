package com.fasterxml.jackson.databind.util;

import java.util.*;

import static org.junit.Assert.*;


import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class TestClassUtil
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Test classes, enums
    /**********************************************************
     */

    /* Test classes and interfaces needed for testing class util
     * methods
     */
    static abstract class BaseClass implements Comparable<BaseClass>,
        BaseInt
    {
        BaseClass(String str) { }
    }

    interface BaseInt { }

    interface SubInt extends BaseInt { }

    enum TestEnum { A; }

    abstract class InnerNonStatic { }

    static class Inner {
        protected Inner() {
            throw new IllegalStateException("test");
        }
    }

    static abstract class SubClass
        extends BaseClass
        implements SubInt {
        SubClass() { super("x"); }
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
    

    
    
    

    

    

    
}
