package com.fasterxml.jackson.databind.node;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.test.BaseTest;

/**
 * This unit test suite tries to verify that ObjectMapper
 * can properly parse JSON and bind contents into appropriate
 * JsonNode instances.
 */
public class TestTreeMapperDeserializer
    extends BaseTest
{
public void testDecimalNode27() throws Exception { 
     BigDecimal value = new BigDecimal("0.1"); 
     JsonNode result = DecimalNode.valueOf(value); 
     assertFalse(result.isArray()); 
     assertFalse(result.isObject()); 
     assertTrue(result.isNumber()); 
     assertFalse(result.isIntegralNumber()); 
     assertFalse(result.isLong()); 
     assertType(result, DecimalNode.class); 
     assertFalse(result.isInt()); 
     assertTrue(result.isFloatingPointNumber()); 
     assertTrue(result.isBigDecimal()); 
     assertFalse(result.isDouble()); 
     assertFalse(result.isNull()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.numberValue()); 
     assertEquals(value.toString(), result.asText()); 
     assertEquals(result, DecimalNode.valueOf(value)); 
 }
	

    

    

    

    

    

    

    

    /**
     * Type mappers should be able to gracefully deal with end of
     * input.
     */
    

    

    /**
     * Let's also verify behavior of "MissingNode" -- one needs to be able
     * to traverse such bogus nodes with appropriate methods.
     */
    

    
    
    /*
    /**********************************************
    /* Helper methods
    /**********************************************
     */

    private int calcLength(Iterator<JsonNode> it)
    {
        int count = 0;
        while (it.hasNext()) {
            it.next();
            ++count;
        }
        return count;
    }
}

