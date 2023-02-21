public void setX(int x) { [EOL]     _x = x; [EOL] } <line_num>: 18,18
public void setNode(JsonNode n) { [EOL]     _node = n; [EOL] } <line_num>: 19,19
public void testMixed() throws IOException { [EOL]     ObjectMapper om = new ObjectMapper(); [EOL]     String JSON = "{\"node\" : { \"a\" : 3 }, \"x\" : 9 }"; [EOL]     Bean bean = om.readValue(JSON, Bean.class); [EOL]     assertEquals(9, bean._x); [EOL]     JsonNode n = bean._node; [EOL]     assertNotNull(n); [EOL]     assertEquals(1, n.size()); [EOL]     ObjectNode on = (ObjectNode) n; [EOL]     assertEquals(3, on.get("a").intValue()); [EOL] } <line_num>: 32,44
public void testArrayNodeEquality() { [EOL]     ArrayNode n1 = new ArrayNode(null); [EOL]     ArrayNode n2 = new ArrayNode(null); [EOL]     assertTrue(n1.equals(n2)); [EOL]     assertTrue(n2.equals(n1)); [EOL]     n1.add(TextNode.valueOf("Test")); [EOL]     assertFalse(n1.equals(n2)); [EOL]     assertFalse(n2.equals(n1)); [EOL]     n2.add(TextNode.valueOf("Test")); [EOL]     assertTrue(n1.equals(n2)); [EOL]     assertTrue(n2.equals(n1)); [EOL] } <line_num>: 47,64
public void testObjectNodeEquality() { [EOL]     ObjectNode n1 = new ObjectNode(null); [EOL]     ObjectNode n2 = new ObjectNode(null); [EOL]     assertTrue(n1.equals(n2)); [EOL]     assertTrue(n2.equals(n1)); [EOL]     n1.set("x", TextNode.valueOf("Test")); [EOL]     assertFalse(n1.equals(n2)); [EOL]     assertFalse(n2.equals(n1)); [EOL]     n2.set("x", TextNode.valueOf("Test")); [EOL]     assertTrue(n1.equals(n2)); [EOL]     assertTrue(n2.equals(n1)); [EOL] } <line_num>: 66,83
public void testReadFromString() throws Exception { [EOL]     String json = "{\"field\":\"{\\\"name\\\":\\\"John Smith\\\"}\"}"; [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     JsonNode jNode = mapper.readValue(json, JsonNode.class); [EOL]     String generated = mapper.writeValueAsString(jNode); [EOL]     JsonNode out = mapper.readValue(generated, JsonNode.class); [EOL]     assertTrue(out.isObject()); [EOL]     assertEquals(1, out.size()); [EOL]     String value = out.path("field").asText(); [EOL]     assertNotNull(value); [EOL] } <line_num>: 85,97
public void testNullHandling() throws Exception { [EOL]     JsonNode n = objectReader().readTree("null"); [EOL]     assertNotNull(n); [EOL]     assertTrue(n.isNull()); [EOL]     n = objectMapper().readTree("null"); [EOL]     assertNotNull(n); [EOL]     assertTrue(n.isNull()); [EOL]     ObjectNode root = (ObjectNode) objectReader().readTree("{\"x\":null}"); [EOL]     assertEquals(1, root.size()); [EOL]     n = root.get("x"); [EOL]     assertNotNull(n); [EOL]     assertTrue(n.isNull()); [EOL] } <line_num>: 100,117