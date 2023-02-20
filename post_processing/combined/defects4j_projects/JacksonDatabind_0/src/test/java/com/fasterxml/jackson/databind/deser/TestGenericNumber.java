package com.fasterxml.jackson.databind.deser;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying handling of non-specific numeric types.
 */
public class TestGenericNumber
    extends BaseMapTest
{
public void testBigIntAsNumber259() throws Exception { 
     BigInteger biggie = new BigInteger("1234567890123456789012345678901234567890"); 
     Number result = new ObjectMapper().readValue(biggie.toString(), Number.class); 
     assertEquals(BigInteger.class, biggie.getClass()); 
     assertEquals(biggie, result); 
 }
    

    

    

    

    /**
     * Related to [JACKSON-72]: by default should wrap floating-point
     * Number as Double
     */
    

    /**
     * Test for verifying [JACKSON-72].
     */
    

	
}
