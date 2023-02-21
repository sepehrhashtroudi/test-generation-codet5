public void testText() { [EOL]     assertNull(TextNode.valueOf(null)); [EOL]     TextNode empty = TextNode.valueOf(""); [EOL]     assertStandardEquals(empty); [EOL]     assertSame(TextNode.EMPTY_STRING_NODE, empty); [EOL]     assertNodeNumbers(TextNode.valueOf("-3"), -3, -3.0); [EOL]     assertNodeNumbers(TextNode.valueOf("17.75"), 17, 17.75); [EOL]     long value = 127353264013893L; [EOL]     TextNode n = TextNode.valueOf(String.valueOf(value)); [EOL]     assertEquals(value, n.asLong()); [EOL]     assertNodeNumbersForNonNumeric(TextNode.valueOf("foobar")); [EOL] } <line_num>: 12,31
public void testBoolean() { [EOL]     BooleanNode f = BooleanNode.getFalse(); [EOL]     assertNotNull(f); [EOL]     assertTrue(f.isBoolean()); [EOL]     assertSame(f, BooleanNode.valueOf(false)); [EOL]     assertStandardEquals(f); [EOL]     assertFalse(f.booleanValue()); [EOL]     assertFalse(f.asBoolean()); [EOL]     assertEquals("false", f.asText()); [EOL]     assertEquals(JsonToken.VALUE_FALSE, f.asToken()); [EOL]     BooleanNode t = BooleanNode.getTrue(); [EOL]     assertNotNull(t); [EOL]     assertTrue(t.isBoolean()); [EOL]     assertSame(t, BooleanNode.valueOf(true)); [EOL]     assertStandardEquals(t); [EOL]     assertTrue(t.booleanValue()); [EOL]     assertTrue(t.asBoolean()); [EOL]     assertEquals("true", t.asText()); [EOL]     assertEquals(JsonToken.VALUE_TRUE, t.asToken()); [EOL]     assertNodeNumbers(f, 0, 0.0); [EOL]     assertNodeNumbers(t, 1, 1.0); [EOL] } <line_num>: 33,59
public void testBinary() throws Exception { [EOL]     assertNull(BinaryNode.valueOf(null)); [EOL]     assertNull(BinaryNode.valueOf(null, 0, 0)); [EOL]     BinaryNode empty = BinaryNode.valueOf(new byte[1], 0, 0); [EOL]     assertSame(BinaryNode.EMPTY_BINARY_NODE, empty); [EOL]     assertStandardEquals(empty); [EOL]     byte[] data = new byte[3]; [EOL]     data[1] = (byte) 3; [EOL]     BinaryNode n = BinaryNode.valueOf(data, 1, 1); [EOL]     data[2] = (byte) 3; [EOL]     BinaryNode n2 = BinaryNode.valueOf(data, 2, 1); [EOL]     assertTrue(n.equals(n2)); [EOL]     assertEquals("\"Aw==\"", n.toString()); [EOL]     assertEquals("AAMD", new BinaryNode(data).asText()); [EOL]     assertNodeNumbersForNonNumeric(n); [EOL] } <line_num>: 62,83
public void testPOJO() { [EOL]     POJONode n = new POJONode("x"); [EOL]     assertStandardEquals(n); [EOL]     assertEquals(n, new POJONode("x")); [EOL]     assertEquals("x", n.asText()); [EOL]     assertEquals("x", n.toString()); [EOL]     assertEquals(new POJONode(null), new POJONode(null)); [EOL]     assertNodeNumbersForNonNumeric(n); [EOL]     assertNodeNumbers(new POJONode(Integer.valueOf(123)), 123, 123.0); [EOL] } <line_num>: 85,101
