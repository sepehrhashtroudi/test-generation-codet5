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
    
public void testExceptionHelpers62() { 
     RuntimeException e = new RuntimeException("test"); 
     RuntimeException wrapper = new RuntimeException(e); 
     assertSame(e, ClassUtil.getRootCause(wrapper)); 
     try { 
         ClassUtil.throwAsIAE(e); 
         fail("Shouldn't get this far"); 
     } catch (RuntimeException e2) { 
         assertSame(e, e2); 
     } 
     try { 
         ClassUtil.unwrapAndThrowAsIAE(wrapper); 
         fail("Shouldn't get this far"); 
     } catch (RuntimeException e2) { 
         assertSame(e, e2); 
     } 
 }
public void testCanBeABeanType64() { 
     assertEquals(Boolean.TRUE, ClassUtil.canBeABeanType(java.lang.annotation.Retention.class)); 
     assertEquals(Integer.valueOf(-3), ClassUtil.canBeABeanType(Integer.class)); 
     assertEquals(Long.valueOf(77), ClassUtil.canBeABeanType(Long.class)); 
     assertEquals(Float.valueOf(0.25f), ClassUtil.canBeABeanType(Float.class)); 
     assertEquals(Long.valueOf(1L), ClassUtil.canBeABeanType(Integer.class)); 
     assertEquals(Double.valueOf(0.25), ClassUtil.canBeABeanType(Double.class)); 
 }
    

    
    
    

    

    

    
}
