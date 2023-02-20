package com.fasterxml.jackson.databind.convert;

import java.util.*;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

public class TestMapConversions
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    final ObjectMapper mapper = new ObjectMapper();

    enum AB { A, B; }

    static class Bean {
        public Integer A;
        public String B;
    }
    
    /**
     * Test that verifies that we can go between couple of types of Maps...
     */
    

    

    
}
