package com.fasterxml.jackson.databind.ser;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class TestEmptyClass
    extends BaseMapTest
{
    static class Empty { }

    @JsonSerialize
    static class EmptyWithAnno { }

    // for [JACKSON-695]:

    @JsonSerialize(using=NonZeroSerializer.class)
    static class NonZero {
        public int nr;
        
        public NonZero(int i) { nr = i; }
    }

    @JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
    static class NonZeroWrapper {
        public NonZero value;
        
        public NonZeroWrapper(int i) {
            value = new NonZero(i);
        }
    }
    
    static class NonZeroSerializer extends JsonSerializer<NonZero>
    {
        @Override
        public void serialize(NonZero value, JsonGenerator jgen, SerializerProvider provider) throws IOException
        {
            jgen.writeNumber(value.nr);
        }

        @Override
        public boolean isEmpty(NonZero value) {
            if (value == null) return true;
            return (value.nr == 0);
        }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    protected final ObjectMapper mapper = new ObjectMapper();
    
    /**
     * Test to check that [JACKSON-201] works if there is a recognized
     * annotation (which indicates type is serializable)
     */
    

    /**
     * Alternative it is possible to use a feature to allow
     * serializing empty classes, too
     */
    

    // [JACKSON-695], JsonSerializer.isEmpty()
    
}
