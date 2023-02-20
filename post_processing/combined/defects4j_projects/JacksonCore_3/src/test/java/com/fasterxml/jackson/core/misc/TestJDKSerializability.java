package com.fasterxml.jackson.core.misc;

import java.io.*;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.test.BaseTest;

/**
 * Unit tests for [Issue#31] (https://github.com/FasterXML/jackson-core/issues/31)
 */
public class TestJDKSerializability extends BaseTest
{
public void testCustomRootSeparatorWithFactory36() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     jf.setRootValueSeparator("##"); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = jf.createGenerator(sw); 
     gen.writeNumber(13); 
     gen.writeBoolean(false); 
     gen.writeNull(); 
     gen.close(); 
     assertEquals("13##false##null", sw.toString()); 
 }
public void testParserFeatures87() throws Exception { 
     JsonFactory f = new JsonFactory(); 
     assertNull(f.getCodec()); 
     f.configure(JsonFactory.Feature.INTERN_FIELD_NAMES, true); 
     assertTrue(f.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
     f.configure(JsonFactory.Feature.INTERN_FIELD_NAMES, false); 
     assertFalse(f.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
 }
    

    

    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    protected byte[] jdkSerialize(Object o) throws IOException
    {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream(1000);
        ObjectOutputStream obOut = new ObjectOutputStream(bytes);
        obOut.writeObject(o);
        obOut.close();
        return bytes.toByteArray();
    }

    @SuppressWarnings("unchecked")
    protected <T> T jdkDeserialize(byte[] raw) throws IOException
    {
        ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(raw));
        try {
            return (T) objIn.readObject();
        } catch (ClassNotFoundException e) {
            fail("Missing class: "+e.getMessage());
            return null;
        } finally {
            objIn.close();
        }
    }
    
    @SuppressWarnings("resource")
    protected String _copyJson(JsonFactory f, String json, boolean useBytes) throws IOException
    {
        if (useBytes) {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            JsonGenerator jg = f.createGenerator(bytes);
            _copyJson(f, json, jg);
            return bytes.toString("UTF-8");
        }
        StringWriter sw = new StringWriter();
        JsonGenerator jg = f.createGenerator(sw);
        _copyJson(f, json, jg);
        return sw.toString();
    }
        
    protected void _copyJson(JsonFactory f, String json, JsonGenerator jg) throws IOException
    {
        JsonParser jp = f.createParser(json);
        while (jp.nextToken() != null) {
            jg.copyCurrentEvent(jp);
        }
        jp.close();
        jg.close();
    }
}
