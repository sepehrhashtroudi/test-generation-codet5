package com.fasterxml.jackson.databind.ext;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;

import org.xml.sax.InputSource;
import org.w3c.dom.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDOM extends com.fasterxml.jackson.databind.BaseMapTest
{
    final static String SIMPLE_XML =
        "<root attr='3'><leaf>Rock &amp; Roll!</leaf><?proc instr?></root>";
    final static String SIMPLE_XML_NS =
        "<root ns:attr='abc' xmlns:ns='http://foo' />";
    
    

    
    
    

    /*
     **********************************************************
     * Helper methods
     **********************************************************
     */

    protected static String normalizeOutput(String output)
    {
        // XML declaration to get rid of?
        output = output.trim();
        if (output.startsWith("<?xml")) {
            // can find closing '>' of xml decl...
            output = output.substring(output.indexOf('>')+1).trim();
        }
        // And replace double quotes with single-quotes...
        return output.replace('"', '\'');
    }
}
