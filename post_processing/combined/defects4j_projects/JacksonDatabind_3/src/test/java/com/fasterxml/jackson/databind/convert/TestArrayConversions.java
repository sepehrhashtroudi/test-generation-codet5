package com.fasterxml.jackson.databind.convert;

import java.math.*;
import java.util.*;
import java.lang.reflect.Array;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

public class TestArrayConversions
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    final static String OVERFLOW_MSG_BYTE = "out of range of Java byte";
    final static String OVERFLOW_MSG = "overflow";

    final ObjectMapper mapper = new ObjectMapper();

public void testLongArrayToX112() throws Exception { 
     long[] data = longs(); 
     verifyLongArrayConversion(data, byte[].class); 
     verifyLongArrayConversion(data, short[].class); 
     verifyLongArrayConversion(data, int[].class); 
     List<Number> expNums = _numberList(data, data.length); 
     List<Long> actNums = mapper.convertValue(data, new TypeReference<List<Long>>() { 
     }); 
     assertEquals(expNums, actNums); 
 }
    

    /**
     * Tests to verify that primitive number arrays round-trip
     * correctly, i.e. type -> type gives equal (although
     * not necessarily same) output
     */
    

    
    
    

    

    

    
    
    /*
    /********************************************************
    /* Helper methods
    /********************************************************
     */

    // note: all value need to be within byte range
    
    private byte[] bytes() { return new byte[] { 1, -1, 0, 98, 127 }; }
    private short[] shorts() { return new short[] { 1, -1, 0, 98, 127 }; }
    private int[] ints() { return new int[] { 1, -1, 0, 98, 127 }; }
    private long[] longs() { return new long[] { 1, -1, 0, 98, 127 }; }

    // note: use values that are exact in binary

    private double[] doubles() { return new double[] { 0.0, 0.25, -0.125, 10.5, 9875.0 }; }
    private float[] floats() { return new float[] {
            0.0f, 0.25f, -0.125f, 10.5f, 9875.0f };
    }

    private <T> void verifyByteArrayConversion(byte[] data, Class<T> arrayType) {
        T result = _convert(data, arrayType);
        verifyIntegralArrays(data, result, data.length);
    }
    private <T> void verifyShortArrayConversion(short[] data, Class<T> arrayType) {
        T result = _convert(data, arrayType);
        verifyIntegralArrays(data, result, data.length);
    }
    private <T> void verifyIntArrayConversion(int[] data, Class<T> arrayType) {
        T result = _convert(data, arrayType);
        verifyIntegralArrays(data, result, data.length);
    }
    private <T> void verifyLongArrayConversion(long[] data, Class<T> arrayType) {
        T result = _convert(data, arrayType);
        verifyIntegralArrays(data, result, data.length);
    }
    private <T> void verifyFloatArrayConversion(float[] data, Class<T> arrayType) {
        T result = _convert(data, arrayType);
        verifyDoubleArrays(data, result, data.length);
    }
    private <T> void verifyDoubleArrayConversion(double[] data, Class<T> arrayType) {
        T result = _convert(data, arrayType);
        verifyDoubleArrays(data, result, data.length);
    }
    
    private <T> T _convert(Object input, Class<T> outputType)
    {
        // must be a primitive array, like "int[].class"
        if (!outputType.isArray()) throw new IllegalArgumentException();
        if (!outputType.getComponentType().isPrimitive()) throw new IllegalArgumentException();
        T result = mapper.convertValue(input, outputType);
        // sanity check first:
        assertNotNull(result);
        assertEquals(outputType, result.getClass());
        return result;
    }

    private List<Number> _numberList(Object numberArray, int size)
    {
        ArrayList<Number> result = new ArrayList<Number>(size);
        for (int i = 0; i < size; ++i) {
            result.add((Number) Array.get(numberArray, i));
        }
        return result;
    }
    
    /**
     * Helper method for checking that given collections contain integral Numbers
     * that essentially contain same values in same order
     */
    private void verifyIntegralArrays(Object inputArray, Object outputArray, int size)
    {
        for (int i = 0; i < size; ++i) {
            Number n1 = (Number) Array.get(inputArray, i);
            Number n2 = (Number) Array.get(outputArray, i);
            double value1 = ((Number) n1).longValue();
            double value2 = ((Number) n2).longValue();
            assertEquals("Entry #"+i+"/"+size+" not equal", value1, value2);
        }        
    }

    private void verifyDoubleArrays(Object inputArray, Object outputArray, int size)
    {
        for (int i = 0; i < size; ++i) {
            Number n1 = (Number) Array.get(inputArray, i);
            Number n2 = (Number) Array.get(outputArray, i);
            double value1 = ((Number) n1).doubleValue();
            double value2 = ((Number) n2).doubleValue();
            assertEquals("Entry #"+i+"/"+size+" not equal", value1, value2);
        }        
    }

}
