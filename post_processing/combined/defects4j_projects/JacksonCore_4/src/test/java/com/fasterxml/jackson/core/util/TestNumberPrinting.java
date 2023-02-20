package com.fasterxml.jackson.core.util;

import java.util.Random;

import com.fasterxml.jackson.core.io.NumberOutput;

/**
 * Set of basic unit tests for verifying that the low-level number
 * printingg methods work as expected.
 */
public class TestNumberPrinting
    extends com.fasterxml.jackson.test.BaseTest
{
    

    

    /*
    ////////////////////////////////////////////////////////
    // Internal methods
    ////////////////////////////////////////////////////////
     */

    private void assertIntPrint(int value)
    {
        String exp = ""+value;
        String act = printToString(value);

        if (!exp.equals(act)) {
            assertEquals("Expected conversion (exp '"+exp+"', len "+exp.length()+"; act len "+act.length()+")", exp, act);
        }
    }

    private void assertLongPrint(long value, int index)
    {
        String exp = ""+value;
        String act = printToString(value);

        if (!exp.equals(act)) {
            assertEquals("Expected conversion (exp '"+exp+"', len "+exp.length()+"; act len "+act.length()+"; number index "+index+")", exp, act);
        }
    }

    private String printToString(int value)
    {
        char[] buffer = new char[12];
        int offset = NumberOutput.outputInt(value, buffer, 0);
        return new String(buffer, 0, offset);
    }

    private String printToString(long value)
    {
        char[] buffer = new char[22];
        int offset = NumberOutput.outputLong(value, buffer, 0);
        return new String(buffer, 0, offset);
    }
}

