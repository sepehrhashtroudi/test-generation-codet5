package com.fasterxml.jackson.databind.interop;


import java.io.*;
import java.lang.reflect.Method;
import java.util.*;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.test.BaseTest;

/**
 * Unit test for checking that we can serialize CGLib generated proxies.
 */
public class TestCglibUsage
    extends BaseTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    interface BeanInterface {
        public int getX();
    }

    /*
    /**********************************************************
    /* Tests
    /**********************************************************
     */

    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    @SuppressWarnings("unchecked")
	private Map<String,Object> writeAndMap(ObjectMapper m, Object value)
        throws IOException
    {
        StringWriter sw = new StringWriter();
        m.writeValue(sw, value);
        return (Map<String,Object>) m.readValue(sw.toString(), Object.class);
    }
}

