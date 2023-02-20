package com.fasterxml.jackson.core.json;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;

/**
 * Set of basic unit tests for verifying that the basic parser
 * functionality works as expected.
 */
public class TestCharEscaping
    extends com.fasterxml.jackson.test.BaseTest
{
    // for [JACKSON-627]
    @SuppressWarnings("serial")
    private final static CharacterEscapes ESC_627 = new CharacterEscapes() {
        final int[] ascii = CharacterEscapes.standardAsciiEscapesForJSON();
        {
          ascii['<'] = CharacterEscapes.ESCAPE_STANDARD;
          ascii['>'] = CharacterEscapes.ESCAPE_STANDARD;
        }

        @Override
        public int[] getEscapeCodesForAscii() {
          return ascii;
        }

        @Override
        public SerializableString getEscapeSequence(int ch) {
          throw new UnsupportedOperationException("Not implemented for test");
        }
      };
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
      */

    

    

    

    /**
     * Test to verify that decoder does not allow 8-digit escapes
     * (non-BMP characters must be escaped using two 4-digit sequences)
     */
    

    // for [JACKSON-627]
    
}

