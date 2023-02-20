package com.fasterxml.jackson.databind.ser;

import java.io.IOException;
import java.io.StringWriter;
import java.util.*;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.StdConverter;

/**
 * Test for verifying [JACKSON-238]
 *
 * @author Pablo Lalloni <plalloni@gmail.com>
 * @author tatu
 */
public class TestCustomSerializers
    extends com.fasterxml.jackson.databind.BaseMapTest
{
    /*
    /**********************************************************
    /* Helper beans
    /**********************************************************
     */

    static class ElementSerializer extends JsonSerializer<Element>
    {
        @Override
        public void serialize(Element value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeString("element");
        }
    }
    
    @JsonSerialize(using = ElementSerializer.class)
    public static class ElementMixin {}

    public static class Immutable {
        protected int x() { return 3; }
        protected int y() { return 7; }
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
    */
    
    

    

    // [Issue#87]: delegating serializer
    
}
