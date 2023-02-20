package com.fasterxml.jackson.databind.module;

import java.util.*;


import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class TestAbstractTypes extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes; simple beans and their handlers
    /**********************************************************
     */

    static class MyString implements CharSequence
    {
        protected String value;
        
        public MyString(String s) { value = s; }

        @Override
        public char charAt(int index) {
            return value.charAt(index);
        }

        @Override
        public int length() {
            return value.length();
        }

        @Override
        public CharSequence subSequence(int arg0, int arg1) { return this; }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

public void testMapDefaulting166() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     SimpleModule module = new SimpleModule("test", Version.unknownVersion()); 
     module.addAbstractTypeMapping(Map.class, TreeMap.class); 
     mapper.registerModule(module); 
     Map<?, ?> result = mapper.readValue("{}", Map.class); 
     assertEquals(TreeMap.class, result.getClass()); 
 }
    

    
    
    
}
