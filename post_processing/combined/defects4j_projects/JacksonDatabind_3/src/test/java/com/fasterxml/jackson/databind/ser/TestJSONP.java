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
    
public void testWithType238() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     Object ob = new Impl("abc", "def"); 
     JavaType type = TypeFactory.defaultInstance().uncheckedSimpleType(Base.class); 
     assertEquals("do({\"a\":\"abc\"})", serializeAsString(m, new JSONPObject("do", ob, type))); 
 }
    

    
    
    /**
     * Test to ensure that it is possible to force a static type for wrapped
     * value.
     */
    
}
