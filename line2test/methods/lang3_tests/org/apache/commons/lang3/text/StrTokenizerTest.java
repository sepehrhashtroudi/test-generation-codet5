private void checkClone(final StrTokenizer tokenizer) { [EOL]     assertFalse(StrTokenizer.getCSVInstance() == tokenizer); [EOL]     assertFalse(StrTokenizer.getTSVInstance() == tokenizer); [EOL] } <line_num>: 40,43
@Test [EOL] public void test1() { [EOL]     final String input = "a;b;c;\"d;\"\"e\";f; ; ;  "; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     tok.setDelimiterChar(';'); [EOL]     tok.setQuoteChar('"'); [EOL]     tok.setIgnoredMatcher(StrMatcher.trimMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     final String[] tokens = tok.getTokenArray(); [EOL]     final String[] expected = new String[] { "a", "b", "c", "d;\"e", "f", "", "", "" }; [EOL]     assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length); [EOL]     for (int i = 0; i < expected.length; i++) { [EOL]         assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'", ObjectUtils.equals(expected[i], tokens[i])); [EOL]     } [EOL] } <line_num>: 46,65
@Test [EOL] public void test2() { [EOL]     final String input = "a;b;c ;\"d;\"\"e\";f; ; ;"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     tok.setDelimiterChar(';'); [EOL]     tok.setQuoteChar('"'); [EOL]     tok.setIgnoredMatcher(StrMatcher.noneMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     final String[] tokens = tok.getTokenArray(); [EOL]     final String[] expected = new String[] { "a", "b", "c ", "d;\"e", "f", " ", " ", "" }; [EOL]     assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length); [EOL]     for (int i = 0; i < expected.length; i++) { [EOL]         assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'", ObjectUtils.equals(expected[i], tokens[i])); [EOL]     } [EOL] } <line_num>: 67,86
@Test [EOL] public void test3() { [EOL]     final String input = "a;b; c;\"d;\"\"e\";f; ; ;"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     tok.setDelimiterChar(';'); [EOL]     tok.setQuoteChar('"'); [EOL]     tok.setIgnoredMatcher(StrMatcher.noneMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     final String[] tokens = tok.getTokenArray(); [EOL]     final String[] expected = new String[] { "a", "b", " c", "d;\"e", "f", " ", " ", "" }; [EOL]     assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length); [EOL]     for (int i = 0; i < expected.length; i++) { [EOL]         assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'", ObjectUtils.equals(expected[i], tokens[i])); [EOL]     } [EOL] } <line_num>: 88,107
@Test [EOL] public void test4() { [EOL]     final String input = "a;b; c;\"d;\"\"e\";f; ; ;"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     tok.setDelimiterChar(';'); [EOL]     tok.setQuoteChar('"'); [EOL]     tok.setIgnoredMatcher(StrMatcher.trimMatcher()); [EOL]     tok.setIgnoreEmptyTokens(true); [EOL]     final String[] tokens = tok.getTokenArray(); [EOL]     final String[] expected = new String[] { "a", "b", "c", "d;\"e", "f" }; [EOL]     assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length); [EOL]     for (int i = 0; i < expected.length; i++) { [EOL]         assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'", ObjectUtils.equals(expected[i], tokens[i])); [EOL]     } [EOL] } <line_num>: 109,128
@Test [EOL] public void test5() { [EOL]     final String input = "a;b; c;\"d;\"\"e\";f; ; ;"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     tok.setDelimiterChar(';'); [EOL]     tok.setQuoteChar('"'); [EOL]     tok.setIgnoredMatcher(StrMatcher.trimMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     final String[] tokens = tok.getTokenArray(); [EOL]     final String[] expected = new String[] { "a", "b", "c", "d;\"e", "f", null, null, null }; [EOL]     assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length); [EOL]     for (int i = 0; i < expected.length; i++) { [EOL]         assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'", ObjectUtils.equals(expected[i], tokens[i])); [EOL]     } [EOL] } <line_num>: 130,150
@Test [EOL] public void test6() { [EOL]     final String input = "a;b; c;\"d;\"\"e\";f; ; ;"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     tok.setDelimiterChar(';'); [EOL]     tok.setQuoteChar('"'); [EOL]     tok.setIgnoredMatcher(StrMatcher.trimMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     final String[] tokens = tok.getTokenArray(); [EOL]     final String[] expected = new String[] { "a", "b", " c", "d;\"e", "f", null, null, null }; [EOL]     int nextCount = 0; [EOL]     while (tok.hasNext()) { [EOL]         tok.next(); [EOL]         nextCount++; [EOL]     } [EOL]     int prevCount = 0; [EOL]     while (tok.hasPrevious()) { [EOL]         tok.previous(); [EOL]         prevCount++; [EOL]     } [EOL]     assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length); [EOL]     assertTrue("could not cycle through entire token list" + " using the 'hasNext' and 'next' methods", nextCount == expected.length); [EOL]     assertTrue("could not cycle through entire token list" + " using the 'hasPrevious' and 'previous' methods", prevCount == expected.length); [EOL] } <line_num>: 152,186
@Test [EOL] public void test7() { [EOL]     final String input = "a   b c \"d e\" f "; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     tok.setDelimiterMatcher(StrMatcher.spaceMatcher()); [EOL]     tok.setQuoteMatcher(StrMatcher.doubleQuoteMatcher()); [EOL]     tok.setIgnoredMatcher(StrMatcher.noneMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     final String[] tokens = tok.getTokenArray(); [EOL]     final String[] expected = new String[] { "a", "", "", "b", "c", "d e", "f", "" }; [EOL]     assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length); [EOL]     for (int i = 0; i < expected.length; i++) { [EOL]         assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'", ObjectUtils.equals(expected[i], tokens[i])); [EOL]     } [EOL] } <line_num>: 188,207
@Test [EOL] public void test8() { [EOL]     final String input = "a   b c \"d e\" f "; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     tok.setDelimiterMatcher(StrMatcher.spaceMatcher()); [EOL]     tok.setQuoteMatcher(StrMatcher.doubleQuoteMatcher()); [EOL]     tok.setIgnoredMatcher(StrMatcher.noneMatcher()); [EOL]     tok.setIgnoreEmptyTokens(true); [EOL]     final String[] tokens = tok.getTokenArray(); [EOL]     final String[] expected = new String[] { "a", "b", "c", "d e", "f" }; [EOL]     assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length); [EOL]     for (int i = 0; i < expected.length; i++) { [EOL]         assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'", ObjectUtils.equals(expected[i], tokens[i])); [EOL]     } [EOL] } <line_num>: 209,228
@Test [EOL] public void testBasic1() { [EOL]     final String input = "a  b c"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals("c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 230,238
@Test [EOL] public void testBasic2() { [EOL]     final String input = "a \nb\fc"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals("c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 240,248
@Test [EOL] public void testBasic3() { [EOL]     final String input = "a \nb\u0001\fc"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b\u0001", tok.next()); [EOL]     assertEquals("c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 250,258
@Test [EOL] public void testBasic4() { [EOL]     final String input = "a \"b\" c"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("\"b\"", tok.next()); [EOL]     assertEquals("c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 260,268
@Test [EOL] public void testBasic5() { [EOL]     final String input = "a:b':c"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':', '\''); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b'", tok.next()); [EOL]     assertEquals("c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 270,278
@Test [EOL] public void testBasicDelim1() { [EOL]     final String input = "a:b:c"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':'); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals("c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 280,288
@Test [EOL] public void testBasicDelim2() { [EOL]     final String input = "a:b:c"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ','); [EOL]     assertEquals("a:b:c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 290,296
@Test [EOL] public void testBasicEmpty1() { [EOL]     final String input = "a  b c"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals("c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 298,308
@Test [EOL] public void testBasicEmpty2() { [EOL]     final String input = "a  b c"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals(null, tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals("c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 310,321
@Test [EOL] public void testBasicQuoted1() { [EOL]     final String input = "a 'b' c"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ' ', '\''); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals("c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 323,331
@Test [EOL] public void testBasicQuoted2() { [EOL]     final String input = "a:'b':"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':', '\''); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals(null, tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 333,343
@Test [EOL] public void testBasicQuoted3() { [EOL]     final String input = "a:'b''c'"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':', '\''); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b'c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 345,354
@Test [EOL] public void testBasicQuoted4() { [EOL]     final String input = "a: 'b' 'c' :d"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':', '\''); [EOL]     tok.setTrimmerMatcher(StrMatcher.trimMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b c", tok.next()); [EOL]     assertEquals("d", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 356,367
@Test [EOL] public void testBasicQuoted5() { [EOL]     final String input = "a: 'b'x'c' :d"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':', '\''); [EOL]     tok.setTrimmerMatcher(StrMatcher.trimMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("bxc", tok.next()); [EOL]     assertEquals("d", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 369,380
@Test [EOL] public void testBasicQuoted6() { [EOL]     final String input = "a:'b'\"c':d"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':'); [EOL]     tok.setQuoteMatcher(StrMatcher.quoteMatcher()); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b\"c:d", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 382,390
@Test [EOL] public void testBasicQuoted7() { [EOL]     final String input = "a:\"There's a reason here\":b"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':'); [EOL]     tok.setQuoteMatcher(StrMatcher.quoteMatcher()); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("There's a reason here", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 392,401
@Test [EOL] public void testBasicQuotedTrimmed1() { [EOL]     final String input = "a: 'b' :"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':', '\''); [EOL]     tok.setTrimmerMatcher(StrMatcher.trimMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals(null, tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 403,414
@Test [EOL] public void testBasicTrimmed1() { [EOL]     final String input = "a: b :  "; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':'); [EOL]     tok.setTrimmerMatcher(StrMatcher.trimMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals(null, tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 416,427
@Test [EOL] public void testBasicTrimmed2() { [EOL]     final String input = "a:  b  :"; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':'); [EOL]     tok.setTrimmerMatcher(StrMatcher.stringMatcher("  ")); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals(null, tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 429,440
@Test [EOL] public void testBasicIgnoreTrimmed1() { [EOL]     final String input = "a: bIGNOREc : "; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':'); [EOL]     tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE")); [EOL]     tok.setTrimmerMatcher(StrMatcher.trimMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("bc", tok.next()); [EOL]     assertEquals(null, tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 442,454
@Test [EOL] public void testBasicIgnoreTrimmed2() { [EOL]     final String input = "IGNOREaIGNORE: IGNORE bIGNOREc IGNORE : IGNORE "; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':'); [EOL]     tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE")); [EOL]     tok.setTrimmerMatcher(StrMatcher.trimMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("bc", tok.next()); [EOL]     assertEquals(null, tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 456,468
@Test [EOL] public void testBasicIgnoreTrimmed3() { [EOL]     final String input = "IGNOREaIGNORE: IGNORE bIGNOREc IGNORE : IGNORE "; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':'); [EOL]     tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE")); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("  bc  ", tok.next()); [EOL]     assertEquals("  ", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 470,481
@Test [EOL] public void testBasicIgnoreTrimmed4() { [EOL]     final String input = "IGNOREaIGNORE: IGNORE 'bIGNOREc'IGNORE'd' IGNORE : IGNORE "; [EOL]     final StrTokenizer tok = new StrTokenizer(input, ':', '\''); [EOL]     tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE")); [EOL]     tok.setTrimmerMatcher(StrMatcher.trimMatcher()); [EOL]     tok.setIgnoreEmptyTokens(false); [EOL]     tok.setEmptyTokenAsNull(true); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("bIGNOREcd", tok.next()); [EOL]     assertEquals(null, tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 483,495
@Test [EOL] public void testListArray() { [EOL]     final String input = "a  b c"; [EOL]     final StrTokenizer tok = new StrTokenizer(input); [EOL]     final String[] array = tok.getTokenArray(); [EOL]     final List<?> list = tok.getTokenList(); [EOL]     assertEquals(Arrays.asList(array), list); [EOL]     assertEquals(3, list.size()); [EOL] } <line_num>: 498,507
private void testCSV(final String data) { [EOL]     this.testXSVAbc(StrTokenizer.getCSVInstance(data)); [EOL]     this.testXSVAbc(StrTokenizer.getCSVInstance(data.toCharArray())); [EOL] } <line_num>: 510,513
@Test [EOL] public void testCSVEmpty() { [EOL]     this.testEmpty(StrTokenizer.getCSVInstance()); [EOL]     this.testEmpty(StrTokenizer.getCSVInstance("")); [EOL] } <line_num>: 515,519
@Test [EOL] public void testCSVSimple() { [EOL]     this.testCSV(CSV_SIMPLE_FIXTURE); [EOL] } <line_num>: 521,524
@Test [EOL] public void testCSVSimpleNeedsTrim() { [EOL]     this.testCSV("   " + CSV_SIMPLE_FIXTURE); [EOL]     this.testCSV("   \n\t  " + CSV_SIMPLE_FIXTURE); [EOL]     this.testCSV("   \n  " + CSV_SIMPLE_FIXTURE + "\n\n\r"); [EOL] } <line_num>: 526,531
void testEmpty(final StrTokenizer tokenizer) { [EOL]     this.checkClone(tokenizer); [EOL]     assertFalse(tokenizer.hasNext()); [EOL]     assertFalse(tokenizer.hasPrevious()); [EOL]     assertEquals(null, tokenizer.nextToken()); [EOL]     assertEquals(0, tokenizer.size()); [EOL]     try { [EOL]         tokenizer.next(); [EOL]         fail(); [EOL]     } catch (final NoSuchElementException ex) { [EOL]     } [EOL] } <line_num>: 533,543
@Test [EOL] public void testGetContent() { [EOL]     final String input = "a   b c \"d e\" f "; [EOL]     StrTokenizer tok = new StrTokenizer(input); [EOL]     assertEquals(input, tok.getContent()); [EOL]     tok = new StrTokenizer(input.toCharArray()); [EOL]     assertEquals(input, tok.getContent()); [EOL]     tok = new StrTokenizer(); [EOL]     assertEquals(null, tok.getContent()); [EOL] } <line_num>: 545,556
@Test [EOL] public void testChaining() { [EOL]     final StrTokenizer tok = new StrTokenizer(); [EOL]     assertEquals(tok, tok.reset()); [EOL]     assertEquals(tok, tok.reset("")); [EOL]     assertEquals(tok, tok.reset(new char[0])); [EOL]     assertEquals(tok, tok.setDelimiterChar(' ')); [EOL]     assertEquals(tok, tok.setDelimiterString(" ")); [EOL]     assertEquals(tok, tok.setDelimiterMatcher(null)); [EOL]     assertEquals(tok, tok.setQuoteChar(' ')); [EOL]     assertEquals(tok, tok.setQuoteMatcher(null)); [EOL]     assertEquals(tok, tok.setIgnoredChar(' ')); [EOL]     assertEquals(tok, tok.setIgnoredMatcher(null)); [EOL]     assertEquals(tok, tok.setTrimmerMatcher(null)); [EOL]     assertEquals(tok, tok.setEmptyTokenAsNull(false)); [EOL]     assertEquals(tok, tok.setIgnoreEmptyTokens(false)); [EOL] } <line_num>: 559,575
@Override [EOL] Object cloneReset() throws CloneNotSupportedException { [EOL]     throw new CloneNotSupportedException("test"); [EOL] } <line_num>: 584,587
@Test [EOL] public void testCloneNotSupportedException() { [EOL]     final Object notCloned = new StrTokenizer() { [EOL]  [EOL]         @Override [EOL]         Object cloneReset() throws CloneNotSupportedException { [EOL]             throw new CloneNotSupportedException("test"); [EOL]         } [EOL]     }.clone(); [EOL]     assertNull(notCloned); [EOL] } <line_num>: 581,590
@Test [EOL] public void testCloneNull() { [EOL]     final StrTokenizer tokenizer = new StrTokenizer((char[]) null); [EOL]     assertEquals(null, tokenizer.nextToken()); [EOL]     tokenizer.reset(); [EOL]     assertEquals(null, tokenizer.nextToken()); [EOL]     final StrTokenizer clonedTokenizer = (StrTokenizer) tokenizer.clone(); [EOL]     tokenizer.reset(); [EOL]     assertEquals(null, tokenizer.nextToken()); [EOL]     assertEquals(null, clonedTokenizer.nextToken()); [EOL] } <line_num>: 592,604
@Test [EOL] public void testCloneReset() { [EOL]     final char[] input = new char[] { 'a' }; [EOL]     final StrTokenizer tokenizer = new StrTokenizer(input); [EOL]     assertEquals("a", tokenizer.nextToken()); [EOL]     tokenizer.reset(input); [EOL]     assertEquals("a", tokenizer.nextToken()); [EOL]     final StrTokenizer clonedTokenizer = (StrTokenizer) tokenizer.clone(); [EOL]     input[0] = 'b'; [EOL]     tokenizer.reset(input); [EOL]     assertEquals("b", tokenizer.nextToken()); [EOL]     assertEquals("a", clonedTokenizer.nextToken()); [EOL] } <line_num>: 606,620
@Test [EOL] public void testConstructor_String() { [EOL]     StrTokenizer tok = new StrTokenizer("a b"); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer(""); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer((String) null); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 623,635
@Test [EOL] public void testConstructor_String_char() { [EOL]     StrTokenizer tok = new StrTokenizer("a b", ' '); [EOL]     assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1)); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer("", ' '); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer((String) null, ' '); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 638,651
@Test [EOL] public void testConstructor_String_char_char() { [EOL]     StrTokenizer tok = new StrTokenizer("a b", ' ', '"'); [EOL]     assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1)); [EOL]     assertEquals(1, tok.getQuoteMatcher().isMatch("\"".toCharArray(), 0, 0, 1)); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer("", ' ', '"'); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer((String) null, ' ', '"'); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 654,668
@Test [EOL] public void testConstructor_charArray() { [EOL]     StrTokenizer tok = new StrTokenizer("a b".toCharArray()); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer(new char[0]); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer((char[]) null); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 671,683
@Test [EOL] public void testConstructor_charArray_char() { [EOL]     StrTokenizer tok = new StrTokenizer("a b".toCharArray(), ' '); [EOL]     assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1)); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer(new char[0], ' '); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer((char[]) null, ' '); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 686,699
@Test [EOL] public void testConstructor_charArray_char_char() { [EOL]     StrTokenizer tok = new StrTokenizer("a b".toCharArray(), ' ', '"'); [EOL]     assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1)); [EOL]     assertEquals(1, tok.getQuoteMatcher().isMatch("\"".toCharArray(), 0, 0, 1)); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer(new char[0], ' ', '"'); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok = new StrTokenizer((char[]) null, ' ', '"'); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 702,716
@Test [EOL] public void testReset() { [EOL]     final StrTokenizer tok = new StrTokenizer("a b c"); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals("c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok.reset(); [EOL]     assertEquals("a", tok.next()); [EOL]     assertEquals("b", tok.next()); [EOL]     assertEquals("c", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 719,732
@Test [EOL] public void testReset_String() { [EOL]     final StrTokenizer tok = new StrTokenizer("x x x"); [EOL]     tok.reset("d e"); [EOL]     assertEquals("d", tok.next()); [EOL]     assertEquals("e", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok.reset((String) null); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 735,745
@Test [EOL] public void testReset_charArray() { [EOL]     final StrTokenizer tok = new StrTokenizer("x x x"); [EOL]     final char[] array = new char[] { 'a', 'b', 'c' }; [EOL]     tok.reset(array); [EOL]     assertEquals("abc", tok.next()); [EOL]     assertFalse(tok.hasNext()); [EOL]     tok.reset((char[]) null); [EOL]     assertFalse(tok.hasNext()); [EOL] } <line_num>: 748,759
@Test [EOL] public void testTSV() { [EOL]     this.testXSVAbc(StrTokenizer.getTSVInstance(TSV_SIMPLE_FIXTURE)); [EOL]     this.testXSVAbc(StrTokenizer.getTSVInstance(TSV_SIMPLE_FIXTURE.toCharArray())); [EOL] } <line_num>: 762,766
@Test [EOL] public void testTSVEmpty() { [EOL]     this.testEmpty(StrTokenizer.getCSVInstance()); [EOL]     this.testEmpty(StrTokenizer.getCSVInstance("")); [EOL] } <line_num>: 768,772
void testXSVAbc(final StrTokenizer tokenizer) { [EOL]     this.checkClone(tokenizer); [EOL]     assertEquals(-1, tokenizer.previousIndex()); [EOL]     assertEquals(0, tokenizer.nextIndex()); [EOL]     assertEquals(null, tokenizer.previousToken()); [EOL]     assertEquals("A", tokenizer.nextToken()); [EOL]     assertEquals(1, tokenizer.nextIndex()); [EOL]     assertEquals("b", tokenizer.nextToken()); [EOL]     assertEquals(2, tokenizer.nextIndex()); [EOL]     assertEquals("c", tokenizer.nextToken()); [EOL]     assertEquals(3, tokenizer.nextIndex()); [EOL]     assertEquals(null, tokenizer.nextToken()); [EOL]     assertEquals(3, tokenizer.nextIndex()); [EOL]     assertEquals("c", tokenizer.previousToken()); [EOL]     assertEquals(2, tokenizer.nextIndex()); [EOL]     assertEquals("b", tokenizer.previousToken()); [EOL]     assertEquals(1, tokenizer.nextIndex()); [EOL]     assertEquals("A", tokenizer.previousToken()); [EOL]     assertEquals(0, tokenizer.nextIndex()); [EOL]     assertEquals(null, tokenizer.previousToken()); [EOL]     assertEquals(0, tokenizer.nextIndex()); [EOL]     assertEquals(-1, tokenizer.previousIndex()); [EOL]     assertEquals(3, tokenizer.size()); [EOL] } <line_num>: 774,797
@Test [EOL] public void testIteration() { [EOL]     final StrTokenizer tkn = new StrTokenizer("a b c"); [EOL]     assertFalse(tkn.hasPrevious()); [EOL]     try { [EOL]         tkn.previous(); [EOL]         fail(); [EOL]     } catch (final NoSuchElementException ex) { [EOL]     } [EOL]     assertTrue(tkn.hasNext()); [EOL]     assertEquals("a", tkn.next()); [EOL]     try { [EOL]         tkn.remove(); [EOL]         fail(); [EOL]     } catch (final UnsupportedOperationException ex) { [EOL]     } [EOL]     try { [EOL]         tkn.set("x"); [EOL]         fail(); [EOL]     } catch (final UnsupportedOperationException ex) { [EOL]     } [EOL]     try { [EOL]         tkn.add("y"); [EOL]         fail(); [EOL]     } catch (final UnsupportedOperationException ex) { [EOL]     } [EOL]     assertTrue(tkn.hasPrevious()); [EOL]     assertTrue(tkn.hasNext()); [EOL]     assertEquals("b", tkn.next()); [EOL]     assertTrue(tkn.hasPrevious()); [EOL]     assertTrue(tkn.hasNext()); [EOL]     assertEquals("c", tkn.next()); [EOL]     assertTrue(tkn.hasPrevious()); [EOL]     assertFalse(tkn.hasNext()); [EOL]     try { [EOL]         tkn.next(); [EOL]         fail(); [EOL]     } catch (final NoSuchElementException ex) { [EOL]     } [EOL]     assertTrue(tkn.hasPrevious()); [EOL]     assertFalse(tkn.hasNext()); [EOL] } <line_num>: 799,839
@Override [EOL] protected List<String> tokenize(final char[] chars, final int offset, final int count) { [EOL]     return super.tokenize("w x y z".toCharArray(), 2, 5); [EOL] } <line_num>: 845,848
@Test [EOL] public void testTokenizeSubclassInputChange() { [EOL]     final StrTokenizer tkn = new StrTokenizer("a b c d e") { [EOL]  [EOL]         @Override [EOL]         protected List<String> tokenize(final char[] chars, final int offset, final int count) { [EOL]             return super.tokenize("w x y z".toCharArray(), 2, 5); [EOL]         } [EOL]     }; [EOL]     assertEquals("x", tkn.next()); [EOL]     assertEquals("y", tkn.next()); [EOL] } <line_num>: 842,852
@Override [EOL] protected List<String> tokenize(final char[] chars, final int offset, final int count) { [EOL]     final List<String> list = super.tokenize(chars, offset, count); [EOL]     Collections.reverse(list); [EOL]     return list; [EOL] } <line_num>: 858,863
@Test [EOL] public void testTokenizeSubclassOutputChange() { [EOL]     final StrTokenizer tkn = new StrTokenizer("a b c") { [EOL]  [EOL]         @Override [EOL]         protected List<String> tokenize(final char[] chars, final int offset, final int count) { [EOL]             final List<String> list = super.tokenize(chars, offset, count); [EOL]             Collections.reverse(list); [EOL]             return list; [EOL]         } [EOL]     }; [EOL]     assertEquals("c", tkn.next()); [EOL]     assertEquals("b", tkn.next()); [EOL]     assertEquals("a", tkn.next()); [EOL] } <line_num>: 855,868
@Test [EOL] public void testToString() { [EOL]     final StrTokenizer tkn = new StrTokenizer("a b c d e"); [EOL]     assertEquals("StrTokenizer[not tokenized yet]", tkn.toString()); [EOL]     tkn.next(); [EOL]     assertEquals("StrTokenizer[a, b, c, d, e]", tkn.toString()); [EOL] } <line_num>: 871,877
