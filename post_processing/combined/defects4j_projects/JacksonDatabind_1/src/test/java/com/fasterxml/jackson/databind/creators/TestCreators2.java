
package com.fasterxml.jackson.databind.creators;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class TestCreators2
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    static class HashTest
    {
        final byte[] bytes;
        final String type;

        @JsonCreator
        public HashTest(@JsonProperty("bytes") @JsonDeserialize(using = BytesDeserializer.class) final byte[] bytes,
                @JsonProperty("type") final String type)
        {
            this.bytes = bytes;
            this.type = type;
        }
    }

    static class BytesDeserializer extends JsonDeserializer<byte[]>
    {
        @Override
        public byte[] deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
            String str = jp.getText();
            return str.getBytes("UTF-8");
        }
    }

    static class Primitives
    {
        protected int x = 3;
        protected double d = -0.5;
        protected boolean b = true;
        
        @JsonCreator
        public Primitives(@JsonProperty("x") int x,
                @JsonProperty("d") double d,
                @JsonProperty("b") boolean b)
        {
            this.x = x;
            this.d = d;
            this.b = b;
        }
    }
    
    protected static class Test431Container {
        protected final List<Item431> items;

        @JsonCreator
        public Test431Container(@JsonProperty("items") final List<Item431> i) {
            items = i;
        }
}    

    @JsonIgnoreProperties(ignoreUnknown = true)
    protected static class Item431 {
        protected final String id;

        @JsonCreator
        public Item431(@JsonProperty("id") String id) {
            this.id = id;
        }
    }

    // Test class for verifying that creator-call failures are reported as checked exceptions
    static class BeanFor438 {
        @JsonCreator
        public BeanFor438(@JsonProperty("name") String s) {
            throw new IllegalArgumentException("I don't like that name!");
        }
    }

    // For [JACKSON-465]
    static class MapBean
    {
        protected Map<String,Long> map;
        
        @JsonCreator
        public MapBean(Map<String, Long> map) {
            this.map = map;
        }
    }

    // For [JACKSON-470]: should be appropriately detected, reported error about
    static class BrokenCreatorBean
    {
        protected String bar;
        
        @JsonCreator
        public BrokenCreatorBean(@JsonProperty("bar") String bar1, @JsonProperty("bar") String bar2) {
            bar = ""+bar1+"/"+bar2;
        }
    }
    
    // For [JACKSON-541]: should not need @JsonCreator if SerializationFeature.AUTO_DETECT_CREATORS is on.
    static class AutoDetectConstructorBean
    {
    	protected final String foo;
    	protected final String bar;

    	public AutoDetectConstructorBean(@JsonProperty("bar") String bar, @JsonProperty("foo") String foo){
    	    this.bar = bar;
    	    this.foo = foo;
    	}
    }

    static class BustedCtor {
        @JsonCreator
        BustedCtor(@JsonProperty("a") String value) {
            throw new IllegalArgumentException("foobar");
        }
    }

    // As per [JACKSON-575]
    static class IgnoredCtor
    {
        @JsonIgnore
        public IgnoredCtor(String arg) {
            throw new RuntimeException("Should never use this constructor");
        }

        public IgnoredCtor() { }
    }

    abstract static class AbstractBase {
        @JsonCreator
        public static AbstractBase create(Map<String,Object> props)
        {
            return new AbstractBaseImpl(props);
        }
    }

    static class AbstractBaseImpl extends AbstractBase
    {
        protected Map<String,Object> props;
        
        public AbstractBaseImpl(Map<String,Object> props) {
            this.props = props;
        }
    }
    
    static interface Issue700Set extends java.util.Set<Object> { }

    static class Issue700Bean
    {
        protected Issue700Set item;

        @JsonCreator
        public Issue700Bean(@JsonProperty("item") String item) { }

        public String getItem() { return null; }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    // for [JACKSON-547]
public void testIgnoredSingleArgCtor279() throws Exception { 
     try { 
         MAPPER.readValue(quote("abc"), IgnoredCtor.class); 
         fail("Should have caught missing constructor problem"); 
     } catch (JsonMappingException e) { 
         verifyException(e, "no single-String constructor/factory method"); 
     } 
 }
    
    
        

    // Test for [JACKSON-372]
    

    

    // [JACKSON-438]: Catch and rethrow exceptions that Creator methods throw
    

    

    
    
    

    // for [JACKSON-575]
    

    

    // [JACKSON-700]
    
}
