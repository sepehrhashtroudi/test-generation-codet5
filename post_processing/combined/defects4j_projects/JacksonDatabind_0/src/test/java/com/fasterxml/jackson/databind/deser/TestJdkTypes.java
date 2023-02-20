package com.fasterxml.jackson.databind.deser;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.*;

public class TestJdkTypes extends BaseMapTest
{
    static class PrimitivesBean
    {
        public boolean booleanValue = true;
        public byte byteValue = 3;
        public char charValue = 'a';
        public short shortValue = 37;
        public int intValue = 1;
        public long longValue = 100L;
        public float floatValue = 0.25f;
        public double doubleValue = -1.0;
    }

    // for [JACKSON-616]
    static class WrappersBean
    {
        public Boolean booleanValue;
        public Byte byteValue;
        public Character charValue;
        public Short shortValue;
        public Integer intValue;
        public Long longValue;
        public Float floatValue;
        public Double doubleValue;
    }

    
    static class ParamClassBean
    {
         public String name = "bar";
         public Class<String> clazz ;

         public ParamClassBean() { }
         public ParamClassBean(String name) {
             this.name = name;
             clazz = String.class;
         }
    }

    static class BooleanBean {
        public Boolean wrapper;
        public boolean primitive;
        
        protected Boolean ctor;
        
        @JsonCreator
        public BooleanBean(@JsonProperty("ctor") Boolean foo) {
            ctor = foo;
        }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
    private final ObjectMapper mapper = new ObjectMapper();

    /**
     * Related to issues [JACKSON-155], [#170].
     */
public void testEmptyStringForWrappers60() throws IOException { 
     WrappersBean bean; 
     bean = mapper.readValue("{\"booleanValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.booleanValue); 
     bean = mapper.readValue("{\"byteValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.byteValue); 
     bean = mapper.readValue("{\"charValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.charValue); 
     bean = mapper.readValue("{\"shortValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.shortValue); 
     bean = mapper.readValue("{\"intValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.intValue); 
     bean = mapper.readValue("{\"longValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.longValue); 
     bean = mapper.readValue("{\"floatValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.floatValue); 
     bean = mapper.readValue("{\"doubleValue\":\"\"}", WrappersBean.class); 
     assertNull(bean.doubleValue); 
 }
public void testCharset177() throws IOException { 
     assertEquals(quote("UTF-8"), mapper.writeValueAsString(Charset.forName("UTF-8"))); 
 }
    

    

    

    /**
     * Test for [JACKSON-419]
     */
    

    /**
     * Test for [JACKSON-420] (add DeserializationConfig.FAIL_ON_NULL_FOR_PRIMITIVES)
     */
    
    
    /**
     * Test for [JACKSON-483], allow handling of CharSequence
     */
    
    
    // [JACKSON-484]
    

    // [JACKSON-597]
    

    // [JACKSON-605]
    

    // by default, should return nulls, n'est pas?
    

    // for [JACKSON-616]
    // @since 1.9
    

    // for [JACKSON-652]
    // @since 1.9
    

    // Test for verifying that Long values are coerced to boolean correctly as well
    

    // [JACKSON-789]
    

    // [JACKSON-888]
    
}
