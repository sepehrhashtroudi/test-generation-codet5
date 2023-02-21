@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     parser = new JsonStreamParser("'one' 'two'"); [EOL] } <line_num>: 30,34
public void testParseTwoStrings() { [EOL]     String actualOne = parser.next().getAsString(); [EOL]     assertEquals("one", actualOne); [EOL]     String actualTwo = parser.next().getAsString(); [EOL]     assertEquals("two", actualTwo); [EOL] } <line_num>: 36,41
public void testIterator() { [EOL]     assertTrue(parser.hasNext()); [EOL]     assertEquals("one", parser.next().getAsString()); [EOL]     assertTrue(parser.hasNext()); [EOL]     assertEquals("two", parser.next().getAsString()); [EOL]     assertFalse(parser.hasNext()); [EOL] } <line_num>: 43,49
public void testNoSideEffectForHasNext() throws Exception { [EOL]     assertTrue(parser.hasNext()); [EOL]     assertTrue(parser.hasNext()); [EOL]     assertTrue(parser.hasNext()); [EOL]     assertEquals("one", parser.next().getAsString()); [EOL]     assertTrue(parser.hasNext()); [EOL]     assertTrue(parser.hasNext()); [EOL]     assertEquals("two", parser.next().getAsString()); [EOL]     assertFalse(parser.hasNext()); [EOL]     assertFalse(parser.hasNext()); [EOL] } <line_num>: 51,63
public void testCallingNextBeyondAvailableInput() { [EOL]     parser.next(); [EOL]     parser.next(); [EOL]     try { [EOL]         parser.next(); [EOL]         fail("Parser should not go beyond available input"); [EOL]     } catch (NoSuchElementException expected) { [EOL]     } [EOL] } <line_num>: 65,73