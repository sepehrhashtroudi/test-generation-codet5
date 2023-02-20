package com.fasterxml.jackson.core.io;

import java.io.StringWriter;
import java.util.Random;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.JsonStringEncoder;

public class TestJsonStringEncoder
    extends com.fasterxml.jackson.test.BaseTest
{
    

    // For [JACKSON-853]
    
    
    

    

    // [JACKSON-884]
    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    
    private String generateRandom(int length)
    {
        StringBuilder sb = new StringBuilder(length);
        Random rnd = new Random(length);
        for (int i = 0; i < length; ++i) {
            // let's limit it not to include surrogate pairs:
            char ch = (char) rnd.nextInt(0xCFFF);
            sb.append(ch);
        }
        return sb.toString();
    }
}

