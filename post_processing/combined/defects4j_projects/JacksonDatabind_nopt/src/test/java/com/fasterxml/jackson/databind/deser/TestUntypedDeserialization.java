package com.fasterxml.jackson.databind.deser;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;

/**
 * Unit tests for verifying "old" data binding from JSON to JDK objects;
 * one that only uses core JDK types; wrappers, Maps and Lists.
 */
public class TestUntypedDeserialization
    extends com.fasterxml.jackson.test.BaseTest
{
    

    // [JACKSON-839]: allow 'upgrade' of big integers into Long, BigInteger
    
}
