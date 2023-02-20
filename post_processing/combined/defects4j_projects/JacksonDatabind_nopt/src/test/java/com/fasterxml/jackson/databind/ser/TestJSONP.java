package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.JSONPObject;

public class TestJSONP
    extends BaseMapTest
{
    static class Base {
        public String a;
    }
    static class Impl extends Base {
        public String b;

        public Impl(String a, String b) {
            this.a = a;
            this.b = b;
        }
    }
    
    

    
    
    /**
     * Test to ensure that it is possible to force a static type for wrapped
     * value.
     */
    
}
