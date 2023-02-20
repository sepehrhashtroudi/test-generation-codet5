package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * Set of basic unit tests for verifying that the basic parser
 * functionality works as expected.
 */
public class TestJsonParser
    extends com.fasterxml.jackson.test.BaseTest
{
    

    

    
    
    private void _testIntern(boolean useStream, boolean enableIntern, String expName) throws IOException
    {
        JsonFactory f = new JsonFactory();
        f.configure(JsonFactory.Feature.INTERN_FIELD_NAMES, enableIntern);
        assertEquals(enableIntern, f.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES));
        final String JSON = "{ \""+expName+"\" : 1}";
        JsonParser jp = useStream ?
            createParserUsingStream(f, JSON, "UTF-8") : createParserUsingReader(f, JSON);
            
        assertToken(JsonToken.START_OBJECT, jp.nextToken());
        assertToken(JsonToken.FIELD_NAME, jp.nextToken());
        // needs to be same of cours
        String actName = jp.getCurrentName();
        assertEquals(expName, actName);
        if (enableIntern) {
            assertSame(expName, actName);
        } else {
            assertNotSame(expName, actName);
        }
        jp.close();
    }

    /**
     * This basic unit test verifies that example given in the Json
     * specification (RFC-4627 or later) is properly parsed at
     * high-level, without verifying values.
     */
    

    /**
     * Unit test that verifies that the spec example JSON is completely
     * parsed, and proper values are given for contents of all
     * events/tokens.
     */
    

    /**
     * Unit test that verifies that 3 basic keywords (null, true, false)
     * are properly parsed in various contexts.
     */
    

    

    

    private void _testNameEscaping(boolean useStream) throws IOException
    {
        final Map<String,String> NAME_MAP = new LinkedHashMap<String,String>();
        NAME_MAP.put("", "");
        NAME_MAP.put("\\\"funny\\\"", "\"funny\"");
        NAME_MAP.put("\\\\", "\\");
        NAME_MAP.put("\\r", "\r");
        NAME_MAP.put("\\n", "\n");
        NAME_MAP.put("\\t", "\t");
        NAME_MAP.put("\\r\\n", "\r\n");
        NAME_MAP.put("\\\"\\\"", "\"\"");
        NAME_MAP.put("Line\\nfeed", "Line\nfeed");
        NAME_MAP.put("Yet even longer \\\"name\\\"!", "Yet even longer \"name\"!");

        JsonFactory jf = new JsonFactory();
        int entry = 0;
        for (Map.Entry<String,String> en : NAME_MAP.entrySet()) {
            ++entry;
            String input = en.getKey();
            String expResult = en.getValue();
            final String DOC = "{ \""+input+"\":null}";
            JsonParser jp = useStream ?
                jf.createParser(new ByteArrayInputStream(DOC.getBytes("UTF-8")))
                : jf.createParser(new StringReader(DOC));

            assertToken(JsonToken.START_OBJECT, jp.nextToken());
            assertToken(JsonToken.FIELD_NAME, jp.nextToken());
            // first, sanity check (field name == getText()
            String act = jp.getCurrentName();
            assertEquals(act, getAndVerifyText(jp));
            if (!expResult.equals(act)) {
                String msg = "Failed for name #"+entry+"/"+NAME_MAP.size();
                if (expResult.length() != act.length()) {
                    fail(msg+": exp length "+expResult.length()+", actual "+act.length());
                }
                assertEquals(msg, expResult, act);
            }
            assertToken(JsonToken.VALUE_NULL, jp.nextToken());
            assertToken(JsonToken.END_OBJECT, jp.nextToken());
            jp.close();
        }
    }
    
    /**
     * Unit test that verifies that long text segments are handled
     * correctly; mostly to stress-test underlying segment-based
     * text buffer(s).
     */
    

    /**
     * Simple unit test that verifies that passing in a byte array
     * as source works as expected.
     */
    

    // [JACKSON-632]
    


    // [Issue#48]
    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private void doTestSpec(boolean verify)
        throws IOException
    {
        // First, using a StringReader:
        doTestSpecIndividual(null, verify);

        // Then with streams using supported encodings:
        doTestSpecIndividual("UTF-8", verify);
        doTestSpecIndividual("UTF-16BE", verify);
        doTestSpecIndividual("UTF-16LE", verify);

        /* Hmmh. UTF-32 is harder only because JDK doesn't come with
         * a codec for it. Can't test it yet using this method
         */
        doTestSpecIndividual("UTF-32", verify);
    }

    private void doTestSpecIndividual(String enc, boolean verify)
        throws IOException
    {
        String doc = SAMPLE_DOC_JSON_SPEC;
        JsonParser jp;

        if (enc == null) {
            jp = createParserUsingReader(doc);
        } else {
            jp = createParserUsingStream(doc, enc);
        }
        verifyJsonSpecSampleDoc(jp, verify);
        jp.close();
    }
}

