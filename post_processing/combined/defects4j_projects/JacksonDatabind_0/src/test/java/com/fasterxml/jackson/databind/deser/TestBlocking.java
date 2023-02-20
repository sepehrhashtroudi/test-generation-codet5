package com.fasterxml.jackson.databind.deser;

import java.io.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

/**
 * Unit test mostly written to cover issue [JACKSON-81]; unintended blocking
 * after data binding.
 */
public class TestBlocking
    extends BaseMapTest
{
    /**
     * This is an indirect test that should trigger problems if (and only if)
     * underlying parser is advanced beyond the only element array.
     * Basically, although content is invalid, this should be encountered
     * quite yet.
     */
    
}
