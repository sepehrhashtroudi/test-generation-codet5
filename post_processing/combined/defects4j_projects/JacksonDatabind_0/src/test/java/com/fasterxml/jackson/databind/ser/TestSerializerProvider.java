package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;

public class TestSerializerProvider
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    static class MyBean {
        public int getX() { return 3; }
    }

    
}
