package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;

/**
 * Simple unit tests to verify that it is possible to handle
 * potentially cyclic structures, as long as object graph itself
 * is not cyclic. This is the case for directed hierarchies like
 * trees and DAGs.
 */
public class TestCyclicTypes
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper bean classes
    /**********************************************************
     */

    static class Bean
    {
        Bean _next;
        String _name;

        public Bean() { }

        public void setNext(Bean b) { _next = b; }
        public void setName(String n) { _name = n; }

    }

    static class LinkA {
        public LinkB next;
    }

    static class LinkB {
        private LinkA a;

        public void setA(LinkA a) { this.a = a; }
        public LinkA getA() { return a; }
    }

    static class GenericLink<T> {
        public GenericLink<T> next;
    }

    static class StringLink extends GenericLink<String> {
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    

    

    
}
