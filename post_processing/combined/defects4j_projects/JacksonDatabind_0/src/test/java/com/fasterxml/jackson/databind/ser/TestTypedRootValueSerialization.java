package com.fasterxml.jackson.databind.ser;

import java.util.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestTypedRootValueSerialization extends BaseMapTest
{
    // [JACKSON-822]
    static interface Issue822Interface {
        public int getA();
    }

    // If this annotation is added, things will work:
    //@com.fasterxml.jackson.databind.annotation.JsonSerialize(as=Issue822Interface.class)
    // but it should not be necessary when root type is passed
    static class Issue822Impl implements Issue822Interface {
        @Override
        public int getA() { return 3; }
        public int getB() { return 9; }
    }

    // First ensure that basic interface-override works:
    
    
    // [JACKSON-822]: ensure that type can be coerced
    
    
    // [JACKSON-822]: ensure that type can be coerced
    

    
}
