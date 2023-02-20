package com.fasterxml.jackson.core.json;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.test.BaseTest;

import java.io.*;
import java.util.Random;

/**
 * Set of basic unit tests for verifying that the basic parser
 * functionality works as expected.
 */
public class TestUtf8Parser
    extends BaseTest
{
    final static String[] UTF8_2BYTE_STRINGS = new String[] {
        /* This may look funny, but UTF8 scanner has fairly
         * elaborate decoding machinery, and it is indeed
         * necessary to try out various combinations...
         */
        "b", "A\u00D8", "abc", "c3p0",
        "12345", "......", "Long\u00FAer",
        "Latin1-fully-\u00BE-develop\u00A8d",
        "Some very long name, ridiculously long actually to see that buffer expansion works: \u00BF?"
    };

    final static String[] UTF8_3BYTE_STRINGS = new String[] {
        "\uC823?", "A\u400F", "1\u1234?",
        "Ab123\u4034",
        "Even-longer:\uC023"
    };

    

    

    

    // How about tests for Surrogate-Pairs?

    

    

    // [JACKSON-889]
	
}
