package com.fasterxml.jackson.databind.creators;

import java.util.*;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Test related to [JACKSON-580] (allow specifying custom instantiators)
 */
public class TestValueInstantiator extends BaseMapTest
{
    static class MyBean
    {
        String _secret;
        
        public MyBean(String s, boolean bogus) {
            _secret = s;
        }
    }

    static class MysteryBean
    {
        Object value;
        
        public MysteryBean(Object v) { value = v; }
    }
    
    static class CreatorBean
    {
        String _secret;

        public String value;
        
        protected CreatorBean(String s) {
            _secret = s;
        }
    }

    static abstract class InstantiatorBase extends ValueInstantiator
    {
        @Override
        public String getValueTypeDesc() {
            return "UNKNOWN";
        }

        @Override
        public boolean canCreateUsingDelegate() { return false; }
    }
    
    static abstract class PolymorphicBeanBase { }
    
    static class PolymorphicBean extends PolymorphicBeanBase
    {
        public String name;
    }
    
    @SuppressWarnings("serial")
    static class MyList extends ArrayList<Object>
    {
        public MyList(boolean b) { super(); }
    }

    @SuppressWarnings("serial")
    static class MyMap extends HashMap<String,Object>
    {
        public MyMap(boolean b) { super(); }
        public MyMap(String name) {
            super();
            put(name, name);
        }
    }
    
    static class MyBeanInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return MyBean.class.getName();
        }
        
        @Override
        public boolean canCreateUsingDefault() { return true; }

        @Override
        public MyBean createUsingDefault(DeserializationContext ctxt) {
            return new MyBean("secret!", true);
        }
    }

    /**
     * Something more ambitious: semi-automated approach to polymorphic
     * deserialization, using ValueInstantiator; from Object to any
     * type...
     */
    static class PolymorphicBeanInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return Object.class.getName();
        }
        
        @Override
        public boolean canCreateFromObjectWith() { return true; }
        
        @Override
        public CreatorProperty[] getFromObjectArguments(DeserializationConfig config) {
            return  new CreatorProperty[] {
                    new CreatorProperty("type", config.constructType(Class.class), null,
                            null, null, null, 0, null, true)
            };
        }

        @Override
        public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) {
            try {
                Class<?> cls = (Class<?>) args[0];
                return cls.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    static class CreatorMapInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return MyMap.class.getName();
        }
        
        @Override
        public boolean canCreateFromObjectWith() { return true; }

        @Override
        public CreatorProperty[] getFromObjectArguments(DeserializationConfig config) {
            return  new CreatorProperty[] {
                    new CreatorProperty("name", config.constructType(String.class), null,
                            null, null, null, 0, null, true)
            };
        }

        @Override
        public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) {
            return new MyMap((String) args[0]);
        }
    }
    
    static class MyDelegateBeanInstantiator extends ValueInstantiator
    {
        @Override
        public String getValueTypeDesc() { return "xxx"; }
        
        @Override
        public boolean canCreateUsingDelegate() { return true; }

        @Override
        public JavaType getDelegateType(DeserializationConfig config) {
            return config.constructType(Object.class);
        }
        
        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) {
            return new MyBean(""+delegate, true);
        }
    }
    
    static class MyListInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return MyList.class.getName();
        }
        
        @Override
        public boolean canCreateUsingDefault() { return true; }

        @Override
        public MyList createUsingDefault(DeserializationContext ctxt) {
            return new MyList(true);
        }
    }

    static class MyDelegateListInstantiator extends ValueInstantiator
    {
        @Override
        public String getValueTypeDesc() { return "xxx"; }
        
        @Override
        public boolean canCreateUsingDelegate() { return true; }

        @Override
        public JavaType getDelegateType(DeserializationConfig config) {
            return config.constructType(Object.class);
        }
        
        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) {
            MyList list = new MyList(true);
            list.add(delegate);
            return list;
        }
    }
    
    static class MyMapInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return MyMap.class.getName();
        }
        
        @Override
        public boolean canCreateUsingDefault() { return true; }

        @Override
        public MyMap createUsingDefault(DeserializationContext ctxt) {
            return new MyMap(true);
        }
    }

    static class MyDelegateMapInstantiator extends ValueInstantiator
    {
        @Override
        public String getValueTypeDesc() { return "xxx"; }
        
        @Override
        public boolean canCreateUsingDelegate() { return true; }

        @Override
        public JavaType getDelegateType(DeserializationConfig config) {
            return TypeFactory.defaultInstance().constructType(Object.class);
        }
        
        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) {
            MyMap map = new MyMap(true);
            map.put("value", delegate);
            return map;
        }
    }

    @JsonValueInstantiator(AnnotatedBeanInstantiator.class)
    static class AnnotatedBean {
        protected final String a;
        protected final int b;
        
        public AnnotatedBean(String a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static class AnnotatedBeanInstantiator extends InstantiatorBase
    {
        @Override
        public String getValueTypeDesc() {
            return MyMap.class.getName();
        }
        
        @Override
        public boolean canCreateUsingDefault() { return true; }

        @Override
        public AnnotatedBean createUsingDefault(DeserializationContext ctxt) {
            return new AnnotatedBean("foo", 3);
        }
    }
    
    @SuppressWarnings("serial")
    static class MyModule extends SimpleModule
    {
        public MyModule(Class<?> cls, ValueInstantiator inst)
        {
            super("Test", Version.unknownVersion());
            this.addValueInstantiator(cls, inst);
        }
    }
    
    /*
    /**********************************************************
    /* Unit tests for default creators
    /**********************************************************
     */

public void testCustomBeanInstantiator141() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.registerModule(new MyModule(MyBean.class, new MyBeanInstantiator())); 
     MyBean bean = mapper.readValue("{}", MyBean.class); 
     assertNotNull(bean); 
     assertEquals("secret!", bean._secret); 
 }
    

    

    
    
    /*
    /**********************************************************
    /* Unit tests for delegate creators
    /**********************************************************
     */

    

    
    
    

    /*
    /**********************************************************
    /* Unit tests for property-based creators
    /**********************************************************
     */

    

    

    /*
    /**********************************************************
    /* Unit tests for scalar-delegates
    /**********************************************************
     */

    

    

    

    

    
    
    /*
    /**********************************************************
    /* Other tests
    /**********************************************************
     */

    
    /**
     * Beyond basic features, it should be possible to even implement
     * polymorphic handling...
     */
    

    
}
