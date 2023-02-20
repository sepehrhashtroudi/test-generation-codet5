package com.fasterxml.jackson.databind.jsontype;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.NoClass;

/**
 * Unit tests related to [JACKSON-712]; specialized handling of
 * otherwise invalid type id embedding cases.
 */
public class TestTypedDeserializationWithDefault extends BaseMapTest
{
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = LegacyInter.class)
    @JsonSubTypes(value = {@JsonSubTypes.Type(name = "mine", value = MyInter.class)})
    public static interface Inter { }

    public static class MyInter implements Inter {
        @JsonProperty("blah") public List<String> blah;
    }

    public static class LegacyInter extends MyInter
    {
        @JsonCreator
        LegacyInter(Object obj)
        {
            if (obj instanceof List) {
                blah = new ArrayList<String>();
                for (Object o : (List<?>) obj) {
                    blah.add(o.toString());
                }
            }
            else if (obj instanceof String) {
                blah = Arrays.asList(((String) obj).split(","));
            }
            else {
                throw new IllegalArgumentException("Unknown type: " + obj.getClass());
            }
        }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type",
            defaultImpl = NoClass.class)
    public static class DefaultWithNoClass { }

    // and then one with no defaultImpl nor listed subtypes
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
    abstract static class MysteryPolymorphic { }
    
    /*
    /**********************************************************
    /* Unit tests, deserialization
    /**********************************************************
     */
    
public void testDefaultAsNoClass165() throws Exception { 
     Object ob = objectReader(DefaultWithNoClass.class).readValue("{ }"); 
     assertNull(ob); 
     ob = objectReader(DefaultWithNoClass.class).readValue("{ \"bogus\":3 }"); 
     assertNull(ob); 
 }
    

    

    

    

    // [Issue#148]
    

    // [Issue#148]
    
}
