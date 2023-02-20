package com.fasterxml.jackson.databind.struct;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestUnwrappedWithPrefix extends BaseMapTest
{
    static class Unwrapping {
        public String name;
        @JsonUnwrapped
        public Location location;

        public Unwrapping() { }
        public Unwrapping(String str, int x, int y) {
            name = str;
            location = new Location(x, y);
        }
    }

    static class DeepUnwrapping
    {
        @JsonUnwrapped
        public Unwrapping unwrapped;

        public DeepUnwrapping() { }
        public DeepUnwrapping(String str, int x, int y) {
            unwrapped = new Unwrapping(str, x, y);
        }
    }

    static class Location {
        public int x;
        public int y;

        public Location() { }
        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // Class with unwrapping using prefixes
    static class PrefixUnwrap
    {
        public String name;
        @JsonUnwrapped(prefix="_")
        public Location location;

        public PrefixUnwrap() { }
        public PrefixUnwrap(String str, int x, int y) {
            name = str;
            location = new Location(x, y);
        }
    }
    
    static class DeepPrefixUnwrap
    {
        @JsonUnwrapped(prefix="u.")
        public PrefixUnwrap unwrapped;

        public DeepPrefixUnwrap() { }
        public DeepPrefixUnwrap(String str, int x, int y) {
            unwrapped = new PrefixUnwrap(str, x, y);
        }
    }

    // Let's actually test hierarchic names with unwrapping bit more:
    
    static class ConfigRoot
    {
        @JsonUnwrapped(prefix="general.")
        public ConfigGeneral general = new ConfigGeneral();
        
        @JsonUnwrapped(prefix="misc.")
        public ConfigMisc misc = new ConfigMisc();

        public ConfigRoot() { }
        public ConfigRoot(String name, int value)
        {
            general = new ConfigGeneral(name);
            misc.value = value;
        }
    }

    static class ConfigAlternate
    {
        @JsonUnwrapped
        public ConfigGeneral general = new ConfigGeneral();
        
        @JsonUnwrapped(prefix="misc.")
        public ConfigMisc misc = new ConfigMisc();

        public int id;
        
        public ConfigAlternate() { }
        public ConfigAlternate(int id, String name, int value)
        {
            this.id = id;
            general = new ConfigGeneral(name);
            misc.value = value;
        }
    }

    static class ConfigGeneral
    {
        @JsonUnwrapped(prefix="names.")
        public ConfigNames names = new ConfigNames();
        
        public ConfigGeneral() { }
        public ConfigGeneral(String name) {
            names.name = name;
        }
    }

    static class ConfigNames {
        public String name = "x";
    }

    static class ConfigMisc {
        public int value;
    }

    // // // Reuse mapper to keep tests bit faster

    private final ObjectMapper mapper = new ObjectMapper();

    /*
    /**********************************************************
    /* Tests, serialization
    /**********************************************************
     */

public void testDeepUnwrapping147() throws Exception { 
     DeepUnwrapping bean = mapper.readValue("{\"x\":3,\"name\":\"Bob\",\"y\":27}", DeepUnwrapping.class); 
     Unwrapping uw = bean.unwrapped; 
     assertNotNull(uw); 
     assertEquals("Bob", uw.name); 
     Location loc = uw.location; 
     assertNotNull(loc); 
     assertEquals(3, loc.x); 
     assertEquals(27, loc.y); 
 }
public void testSimpleUnwrappingSerialize187() throws Exception { 
     assertEquals("{\"name\":\"Tatu\",\"x\":1,\"y\":2}", mapper.writeValueAsString(new Unwrapping("Tatu", 1, 2))); 
 }
public void testDeepUnwrappingSerialize188() throws Exception { 
     assertEquals("{\"name\":\"Tatu\",\"x\":1,\"y\":2}", mapper.writeValueAsString(new DeepUnwrapping("Tatu", 1, 2))); 
 }
    

    

    

    /*
    /**********************************************************
    /* Tests, deserialization
    /**********************************************************
     */

    
    
    
    
    

    /*
    /**********************************************************
    /* Tests, deserialization
    /**********************************************************
     */
    
    
}
