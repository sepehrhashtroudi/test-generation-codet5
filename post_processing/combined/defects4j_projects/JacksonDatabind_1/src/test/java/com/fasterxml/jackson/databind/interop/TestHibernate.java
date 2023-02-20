package com.fasterxml.jackson.databind.interop;


import java.io.*;
import java.lang.reflect.Method;
import java.util.*;

import org.hibernate.repackage.cglib.proxy.Enhancer;
import org.hibernate.repackage.cglib.proxy.MethodInterceptor;
import org.hibernate.repackage.cglib.proxy.MethodProxy;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.test.BaseTest;

/**
 * Basic tests covering Hibernate-compatibility features.
 */
public class TestHibernate
    extends BaseTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    interface BeanInterfaceHib {
        public int getX();
    }

    /*
    /**********************************************************
    /* Tests
    /**********************************************************
     */

    /*
     * Unit test to test [JACKSON-177]
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

