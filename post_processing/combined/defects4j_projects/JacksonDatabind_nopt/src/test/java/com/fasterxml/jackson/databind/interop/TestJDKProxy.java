package com.fasterxml.jackson.databind.interop;

import java.lang.reflect.*;

import com.fasterxml.jackson.databind.*;

// mostly for [Issue#57]
public class TestJDKProxy extends BaseMapTest
{
    final ObjectMapper MAPPER = new ObjectMapper();

    public interface IPlanet {
        String getName();
        String setName(String s);
    }

    // bit silly example; usually wouldn't implement interface (no need to proxy if it did)
    static class Planet implements IPlanet {
        private String name;

        public Planet() { }
        public Planet(String s) { name = s; }
        
        @Override
        public String getName(){return name;}
        @Override
        public String setName(String iName) {name = iName;
            return name;
        }
    }    
    
    /*
    /********************************************************
    /* Test methods
    /********************************************************
     */
    
    

    /*
    /********************************************************
    /* Helper methods
    /********************************************************
     */

    public static <T> T getProxy(Class<T> type, Object obj) {
        class ProxyUtil implements InvocationHandler {
            Object obj;
            public ProxyUtil(Object o) {
                obj = o;
            }
            @Override
            public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
                Object result = null;
                result = m.invoke(obj, args);
                return result;
            }
        }
        @SuppressWarnings("unchecked")
        T proxy = (T) Proxy.newProxyInstance(type.getClassLoader(), new Class[] { type },
                new ProxyUtil(obj));
        return proxy;
    }
}
