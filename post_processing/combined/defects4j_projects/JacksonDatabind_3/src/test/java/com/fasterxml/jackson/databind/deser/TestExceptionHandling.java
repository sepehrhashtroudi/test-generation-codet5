package com.fasterxml.jackson.databind.deser;

import java.io.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.test.BrokenStringReader;

/**
 * Unit test for verifying that exceptions are properly handled (caught,
 * re-thrown or wrapped, depending)
 * with Object deserialization.
 */
public class TestExceptionHandling
    extends BaseMapTest
{
    static class Bean {
        public String propX;
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
    /**
     * Verification of [JACKSON-301]
     */
    

    /**
     * Simple test to check behavior when end-of-stream is encountered
     * without content. Used to expect EOFException (Jackson 1.x); but
     * nowadays ought to be JsonMappingException
     */
    

    

    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    void verifyException(Exception e, Class<?> expType, String expMsg)
        throws Exception
    {
        if (e.getClass() != expType) {
            fail("Expected exception of type "+expType.getName()+", got "+e.getClass().getName());
        }
        if (expMsg != null) {
            verifyException(e, expMsg);
        }
    }
}
