package com.fasterxml.jackson.databind.node;

import java.math.BigDecimal;
import java.util.*;

import com.fasterxml.jackson.databind.*;

/**
 * Additional tests for {@link ObjectNode} container class.
 */
public class TestObjectNode
    extends BaseMapTest
{
    private final ObjectMapper MAPPER = new ObjectMapper();

public void testBasics54() { 
     ObjectNode n = new ObjectNode(JsonNodeFactory.instance); 
     assertStandardEquals(n); 
     assertFalse(n.elements().hasNext()); 
     assertFalse(n.fields().hasNext()); 
     assertFalse(n.fieldNames().hasNext()); 
     assertNull(n.get("a")); 
     assertTrue(n.path("a").isMissingNode()); 
     TextNode text = TextNode.valueOf("x"); 
     n.set("a", text); 
     assertEquals(1, n.size()); 
     assertTrue(n.elements().hasNext()); 
     assertTrue(n.fields().hasNext()); 
     assertTrue(n.fieldNames().hasNext()); 
     assertSame(text, n.get("a")); 
     assertSame(text, n.path("a")); 
     assertNull(n.get("b")); 
     assertNull(n.get(0)); 
     assertFalse(n.has(0)); 
     assertFalse(n.hasNonNull(0)); 
     assertTrue(n.has("a")); 
     assertTrue(n.hasNonNull("a")); 
     assertFalse(n.has("b")); 
     assertFalse(n.hasNonNull("b")); 
     ObjectNode n2 = new ObjectNode(JsonNodeFactory.instance); 
     n2.put("b", 13); 
     assertFalse(n.equals(n2)); 
     n.setAll(n2); 
     assertEquals(2, n.size()); 
     n.set("null", (JsonNode) null); 
     assertEquals(3, n.size()); 
     assertTrue(n.has("null")); 
     assertFalse(n.hasNonNull("null")); 
     n.put("null", "notReallNull"); 
     assertEquals(3, n.size());
}

public void testNullChecking267() { 
     ObjectNode o1 = JsonNodeFactory.instance.objectNode(); 
     ObjectNode o2 = JsonNodeFactory.instance.objectNode(); 
     o1.setAll(o2); 
     assertEquals(0, o1.size()); 
     assertEquals(0, o2.size()); 
     o1.set("x", null); 
     JsonNode n = o1.get("x"); 
     assertNotNull(n); 
     assertSame(n, NullNode.instance); 
     o1.put("str", (String) null); 
     n = o1.get("str"); 
     assertNotNull(n); 
     assertSame(n, NullNode.instance); 
     o1.put("d", (BigDecimal) null); 
     n = o1.get("d"); 
     assertNotNull(n); 
     assertSame(n, NullNode.instance); 
 }
    

    /**
     * Verify null handling
     */
    

    /**
     * Another test to verify [JACKSON-227]...
     */
    

    

    

    

    

    

    

    // [Issue#93]
    
}
