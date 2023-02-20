package com.fasterxml.jackson.core.misc;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

/**
 * Tests to verify [JACKSON-278]
 */
public class TestVersions extends com.fasterxml.jackson.test.BaseTest
{
    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    private void assertVersion(Version v)
    {
        assertEquals(PackageVersion.VERSION, v);
    }

    private IOContext getIOContext() {
        return new IOContext(new BufferRecycler(), null, false);
    }
}

