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

public void testKeywords12() throws Exception { 
     final String DOC = "{\n" + "\"key1\" : null,\n" + "\"key2\" : true,\n" + "\"key3\" : false,\n" + "\"key4\" : [ false, null, true ]\n" + "}"; 
     JsonParser jp = createParserUsingStream(DOC, "UTF-8"); 
     JsonStreamContext ctxt = jp.getParsingContext(); 
     assertTrue(ctxt.inRoot()); 
     assertFalse(ctxt.inArray()); 
     assertFalse(ctxt.inObject()); 
     assertEquals(0, ctxt.getEntryCount()); 
     assertEquals(0, ctxt.getCurrentIndex()); 
     assertFalse(jp.hasCurrentToken()); 
     assertNull(jp.getText()); 
     assertNull(jp.getTextCharacters()); 
     assertEquals(0, jp.getTextLength()); 
     assertEquals(0, jp.getTextOffset()); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertTrue(jp.hasCurrentToken()); 
     JsonLocation loc = jp.getTokenLocation(); 
     assertNotNull(loc); 
     assertEquals(1, loc.getLineNr()); 
     assertEquals(1, loc.getColumnNr()); 
     ctxt = jp.getParsingContext(); 
     assertFalse(ctxt.inRoot()); 
     assertFalse(ctxt.inArray()); 
     assertTrue(ctxt.inObject()); 
     assertEquals(0, ctxt.getEntryCount()); 
     assertEquals(0, ctxt.getCurrentIndex()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     verifyFieldName(jp, "key1"); 
     assertEquals(2, jp.getTokenLocation().getLineNr()); 
     ctxt = jp.getParsingContext(); 
     assertFalse(ctxt.inRoot()); 
     assertFalse(ctxt.inArray()); 
     assertTrue(ctxt.inObject()); 
     assertEquals(1, ctxt.getEntryCount()); 
     assertEquals(0, ctxt.getCurrentIndex()); 
     assertEquals("key1", ctxt.getCurrentName()); 
     assertToken(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertEquals("key1", ctxt.getCurrentName()); 
     ctxt = jp.getParsingContext(); 
     assertEquals(1, ctxt.getEntryCount()); 
     assertEquals(0, ctxt.getCurrentIndex()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     verifyFieldName(jp, "key2"); 
     ctxt = jp.getParsingContext(); 
     assertEquals(2, ctxt.getEntryCount()); 
     assertEquals(1, ctxt.getCurrentIndex()); 
     assertEquals("key2", ctxt.getCurrentName()); 
     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
     assertEquals("key2", ctxt.getCurrentName()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     verifyFieldName(jp, "key3"); 
     assertToken(JsonToken.VALUE_FALSE, jp.nextToken()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     verifyFieldName(jp, "key4"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     ctxt = jp.getParsingContext(); 
     assertTrue(ctxt.inArray()); 
     assertNull(ctxt.getCurrentName()); 
     assertEquals("key4", ctxt.getParent().getCurrentName()); 
     assertToken(JsonToken.VALUE_FALSE, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     ctxt = jp.getParsingContext(); 
     assertTrue(ctxt.inObject()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     ctxt = jp.getParsingContext(); 
     assertTrue(ctxt.inRoot()); 
     assertNull(ctxt.getCurrentName()); 
     jp.close(); 
 } 


public void testNameEscaping16() throws IOException { 
     _testNameEscaping(false); 
     _testNameEscaping(true); 
 } 


public void testSpecExampleSkipping49() throws Exception { 
     doTestSpec(false); 
 } 


public void testSpacesInURL84() throws Exception { 
     File f = File.createTempFile("pre fix&stuff", ".txt"); 
     BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), "UTF-8")); 
     w.write("{ }"); 
     w.close(); 
     URL url = f.toURI().toURL(); 
     JsonFactory jf = new JsonFactory(); 
     JsonParser jp = jf.createParser(url); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     jp.close(); 
 } 


public void testSpecExampleFully89() throws Exception { 
     doTestSpec(true); 
 } 


public void testUtf8BOMHandling104() throws Exception { 
     ByteArrayOutputStream bytes = new ByteArrayOutputStream(); 
     bytes.write(0xEF); 
     bytes.write(0xBB); 
     bytes.write(0xBF); 
     bytes.write("[ 1 ]".getBytes("UTF-8")); 
     JsonFactory jf = new JsonFactory(); 
     JsonParser jp = jf.createParser(bytes.toByteArray()); 
     assertEquals(JsonToken.START_ARRAY, jp.nextToken()); 
     jp.close(); 
 } 


public void testSkipping131() throws Exception { 
     String DOC = "[ 1, 3, [ true, null ], 3, { \"a\":\"b\" }, [ [ ] ], { } ]"; 
     ; 
     JsonParser jp = createParserUsingStream(DOC, "UTF-8"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     jp.skipChildren(); 
     assertEquals(JsonToken.END_ARRAY, jp.getCurrentToken()); 
     JsonToken t = jp.nextToken(); 
     if (t != null) { 
         fail("Expected null at end of doc, got " + t); 
     } 
     jp.close(); 
     jp = createParserUsingStream(DOC, "UTF-8"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     jp.skipChildren(); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.getCurrentToken()); 
     assertEquals(1, jp.getIntValue()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     jp.skipChildren(); 
     assertToken(JsonToken.END_ARRAY, jp.getCurrentToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     jp.skipChildren(); 
     assertToken(JsonToken.END_OBJECT, jp.getCurrentToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     jp.skipChildren(); 
     assertToken(JsonToken.END_ARRAY, jp.getCurrentToken()); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     jp.skipChildren(); 
     assertToken(JsonToken.END_OBJECT, jp.getCurrentToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
 } 

    

    

    
    
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
