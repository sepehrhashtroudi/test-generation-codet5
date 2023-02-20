package com.fasterxml.jackson.databind.ext;

import javax.xml.datatype.*;
import javax.xml.namespace.QName;


import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;

/**
 * Core XML types (javax.xml) are considered "external" (or more precisely "optional")
 * since some Java(-like) platforms do not include them: specifically, Google AppEngine
 * and Android seem to skimp on their inclusion. As such, they are dynamically loaded
 * only as needed, and need bit special handling.
 * 
 * @author tatu
 */
public class TestCoreXMLTypes
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Serializer tests
    /**********************************************************
     */

public void testQNameDeser316() throws Exception { 
     QName qn = new QName("http://abc", "tag", "prefix"); 
     String qstr = qn.toString(); 
     ObjectMapper mapper = new ObjectMapper(); 
     assertEquals("Should deserialize to equal QName (exp serialization: '" + qstr + "')", qn, mapper.readValue(quote(qstr), QName.class)); 
 }
    

    

    

    private String removeZ(String dateStr) {
        if (dateStr.endsWith("Z")) {
            return dateStr.substring(0, dateStr.length()-1);
        }
        if (dateStr.endsWith("+0000")) {
            return dateStr.substring(0, dateStr.length()-5);
        }
        return dateStr;
    }
    
    /*
    /**********************************************************
    /* Deserializer tests
    /**********************************************************
     */
    
    // First things first: must be able to load the deserializers...
    

    

    

    
}
