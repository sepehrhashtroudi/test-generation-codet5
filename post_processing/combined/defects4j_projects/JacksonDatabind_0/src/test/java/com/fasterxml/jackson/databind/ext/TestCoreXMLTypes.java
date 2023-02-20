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

public void testDurationDeser276() throws Exception { 
     DatatypeFactory dtf = DatatypeFactory.newInstance(); 
     Duration dur = dtf.newDurationDayTime(true, 27, 5, 15, 59); 
     String exp = dur.toString(); 
     assertEquals("Should deserialize to equal Duration ('" + exp + "')", dur, new ObjectMapper().readValue(quote(exp), Duration.class)); 
 }
public void testQNameDeser277() throws Exception { 
     DatatypeFactory dtf = DatatypeFactory.newInstance(); 
     XMLGregorianCalendar cal = dtf.newXMLGregorianCalendar(1974, 10, 10, 18, 15, 17, 123, 0); 
     String exp = cal.toXMLFormat(); 
     assertEquals("Should deserialize to equal XMLGregorianCalendar ('" + exp + "')", cal, new ObjectMapper().readValue(quote(exp), XMLGregorianCalendar.class)); 
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
