package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * This unit test suite tests use of Annotations for
 * bean serialization.
 */
public class TestAnnotationInheritance
    extends com.fasterxml.jackson.test.BaseTest
{
    /*
    /**********************************************************
    /* Annotated helper classes
    /**********************************************************
     */

    /// Base class for testing {@link JsonProperty} annotations
    static class BasePojo
    {
        @JsonProperty public int width() { return 3; }
        @JsonProperty public int length() { return 7; }
    }

    /**
     * It should also be possible to specify annotations on interfaces,
     * to be implemented by classes. This should not only work when interface
     * is used (which may be the case for de-serialization) but also
     * when implementing class is used and overrides methods. In latter
     * case overriding methods should still "inherit" annotations -- this
     * is not something JVM runtime provides, but Jackson class
     * instrospector does.
     */
    interface PojoInterface
    {
        @JsonProperty int width();
        @JsonProperty int length();
    }

    /**
     * Sub-class for testing that inheritance is handled properly
     * wrt annotations.
     */
    static class PojoSubclass extends BasePojo
    {
        /**
         * Should still be recognized as a Getter here.
         */
        @Override
        public int width() { return 9; }
    }

    static class PojoImpl implements PojoInterface
    {
        // Both should be recognized as getters here

        @Override
        public int width() { return 1; }
        @Override
        public int length() { return 2; }

        public int getFoobar() { return 5; }
    }

    /*
    /**********************************************************
    /* Main tests
    /**********************************************************
     */

    

    

    /*
    //////////////////////////////////////////////
    // Helper methods
    //////////////////////////////////////////////
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
