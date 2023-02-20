package com.fasterxml.jackson.databind.struct;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fasterxml.jackson.databind.*;

/**
 * Unit test to verify handling of Object Id deserialization
 */
public class TestObjectIdDeserialization extends BaseMapTest
{
    // // Classes for external id use
    
    @JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="id")
    static class Identifiable
    {
        public int value;

        public Identifiable next;
        
        public Identifiable() { this(0); }
        public Identifiable(int v) {
            value = v;
        }
    }

    @JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class, property="#")
    static class UUIDNode
    {
        public int value;
        public UUIDNode parent;
        public UUIDNode first;
        public UUIDNode second;

        public UUIDNode() { this(0); }
        public UUIDNode(int v) { value = v; }
    }
    
    // // Classes for external id from property annotations:
    
    static class IdWrapper
    {
        @JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
        public ValueNode node;

        public IdWrapper() { }
        public IdWrapper(int v) {
            node = new ValueNode(v);
        }
    }

    static class ValueNode {
        public int value;
        public IdWrapper next;
        
        public ValueNode() { this(0); }
        public ValueNode(int v) { value = v; }
    }

    // // Classes for external id use

    @JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="customId")
    static class IdentifiableCustom
    {
        public int value;

        public int customId;
        
        public IdentifiableCustom next;
        
        public IdentifiableCustom() { this(-1, 0); }
        public IdentifiableCustom(int i, int v) {
            customId = i;
            value = v;
        }
    }

    static class IdWrapperExt
    {
        @JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,
        		property="customId")
        public ValueNodeExt node;

        public IdWrapperExt() { }
        public IdWrapperExt(int v) {
            node = new ValueNodeExt(v);
        }
    }

    static class ValueNodeExt
    {
        public int value;
        private int customId;
        public IdWrapperExt next;
        
        public ValueNodeExt() { this(0); }
        public ValueNodeExt(int v) { value = v; }

        public void setCustomId(int i) {
        	customId = i;
        }
    }
    
    private final ObjectMapper mapper = new ObjectMapper();
    
    /*
    /*****************************************************
    /* Unit tests, external id deserialization
    /*****************************************************
     */

    private final static String EXP_SIMPLE_INT_CLASS = "{\"id\":1,\"value\":13,\"next\":1}";

public void testCustomDeserializationProperty147() throws Exception { 
     IdWrapperExt result = mapper.readValue(EXP_CUSTOM_VIA_PROP, IdWrapperExt.class); 
     assertEquals(99, result.node.value); 
     assertSame(result.node, result.node.next.node); 
     assertEquals(3, result.node.customId); 
 }
    

    

    // Bit more complex, due to extra wrapping etc:
    private final static String EXP_SIMPLE_INT_PROP = "{\"node\":{\"@id\":1,\"value\":7,\"next\":{\"node\":1}}}";
        
    

    // Another test to ensure ordering is not required (i.e. can do front references)
    
    
    /*
    /*****************************************************
    /* Unit tests, custom (property-based) id deserialization
    /*****************************************************
     */

    private final static String EXP_CUSTOM_VIA_CLASS = "{\"customId\":123,\"value\":-900,\"next\":123}";

    

    private final static String EXP_CUSTOM_VIA_PROP = "{\"node\":{\"customId\":3,\"value\":99,\"next\":{\"node\":3}}}";
    
    
}
