package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Tests related to [JACKSON-139]
 */
public class TestNumbers
    extends BaseMapTest
{
    /*
    /**********************************************************************
    /* Helper classes, beans
    /**********************************************************************
     */

    static class MyBeanHolder {
        public Long id;
        public MyBeanDefaultValue defaultValue;
    }

    static class MyBeanDefaultValue
    {
        public MyBeanValue value;
    }

    @JsonDeserialize(using=MyBeanDeserializer.class)
    static class MyBeanValue {
        public BigDecimal decimal;
        public MyBeanValue() { this(null); }
        public MyBeanValue(BigDecimal d) { this.decimal = d; }
    }

    /*
    /**********************************************************************
    /* Helper classes, serializers/deserializers/resolvers
    /**********************************************************************
     */
    
    static class MyBeanDeserializer extends JsonDeserializer<MyBeanValue>
    {
        @Override
        public MyBeanValue deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException
        {
            return new MyBeanValue(jp.getDecimalValue());
        }
    }

    /*
    /**********************************************************************
    /* Unit tests
    /**********************************************************************
     */
    
    

    

    // [JACKSON-349]
    

    // // Tests for [JACKSON-668]
    
    

    

    
}
